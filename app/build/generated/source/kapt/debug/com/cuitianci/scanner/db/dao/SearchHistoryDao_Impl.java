package com.cuitianci.scanner.db.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.cuitianci.scanner.db.entity.SearchHistory;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SearchHistoryDao_Impl implements SearchHistoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfSearchHistory;

  private final SharedSQLiteStatement __preparedStmtOfDeleteHistory;

  public SearchHistoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSearchHistory = new EntityInsertionAdapter<SearchHistory>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `SearchHistory`(`hId`,`history`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SearchHistory value) {
        stmt.bindLong(1, value.getHId());
        if (value.getHistory() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getHistory());
        }
      }
    };
    this.__preparedStmtOfDeleteHistory = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM searchhistory WHERE history = (?)";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final SearchHistory... histories) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSearchHistory.insert(histories);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteHistory(final String history) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteHistory.acquire();
    int _argIndex = 1;
    if (history == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, history);
    }
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteHistory.release(_stmt);
    }
  }

  @Override
  public LiveData<List<SearchHistory>> getAllHistories() {
    final String _sql = "SELECT * FROM searchhistory";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"searchhistory"}, false, new Callable<List<SearchHistory>>() {
      @Override
      public List<SearchHistory> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfHId = CursorUtil.getColumnIndexOrThrow(_cursor, "hId");
          final int _cursorIndexOfHistory = CursorUtil.getColumnIndexOrThrow(_cursor, "history");
          final List<SearchHistory> _result = new ArrayList<SearchHistory>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SearchHistory _item;
            final String _tmpHistory;
            _tmpHistory = _cursor.getString(_cursorIndexOfHistory);
            _item = new SearchHistory(_tmpHistory);
            final int _tmpHId;
            _tmpHId = _cursor.getInt(_cursorIndexOfHId);
            _item.setHId(_tmpHId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
