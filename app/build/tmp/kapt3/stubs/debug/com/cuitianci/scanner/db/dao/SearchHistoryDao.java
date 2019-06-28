package com.cuitianci.scanner.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\'J!\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000f\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u0010R \u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/cuitianci/scanner/db/dao/SearchHistoryDao;", "", "allHistories", "Landroidx/lifecycle/LiveData;", "", "Lcom/cuitianci/scanner/db/entity/SearchHistory;", "getAllHistories", "()Landroidx/lifecycle/LiveData;", "deleteHistory", "", "history", "", "insertAll", "", "histories", "", "([Lcom/cuitianci/scanner/db/entity/SearchHistory;)V", "app_debug"})
public abstract interface SearchHistoryDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM searchhistory")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.cuitianci.scanner.db.entity.SearchHistory>> getAllHistories();
    
    @androidx.room.Insert()
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    com.cuitianci.scanner.db.entity.SearchHistory... histories);
    
    @androidx.room.Query(value = "DELETE FROM searchhistory WHERE history = (:history)")
    public abstract int deleteHistory(@org.jetbrains.annotations.NotNull()
    java.lang.String history);
}