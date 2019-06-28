package com.cuitianci.scanner.db.entity;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004\u00a8\u0006\u000e"}, d2 = {"Lcom/cuitianci/scanner/db/entity/SearchHistory;", "", "history", "", "(Ljava/lang/String;)V", "hId", "", "getHId", "()I", "setHId", "(I)V", "getHistory", "()Ljava/lang/String;", "setHistory", "app_debug"})
public final class SearchHistory {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int hId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String history;
    
    public final int getHId() {
        return 0;
    }
    
    public final void setHId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHistory() {
        return null;
    }
    
    public final void setHistory(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public SearchHistory(@org.jetbrains.annotations.NotNull()
    java.lang.String history) {
        super();
    }
}