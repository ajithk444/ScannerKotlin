package com.cuitianci.scanner.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.cuitianci.scanner.db.entity.SearchHistory

@Dao
interface SearchHistoryDao {

    @get:Query("SELECT * FROM searchhistory")
    val allHistories: LiveData<List<SearchHistory>>

    @Insert
    fun insertAll(vararg histories: SearchHistory)

    @Query("DELETE FROM searchhistory WHERE history = (:history)")
    fun deleteHistory(history: String): Int
}
