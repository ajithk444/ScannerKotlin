package com.cuitianci.scanner.viewmodel;

import java.lang.System;

/**
 * 名片夹Fragment
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/cuitianci/scanner/viewmodel/AllNameCardViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "nameCards", "Landroidx/lifecycle/LiveData;", "", "Lcom/cuitianci/scanner/bean/NameCardBean;", "getNameCards", "()Landroidx/lifecycle/LiveData;", "nameCardsLive", "Landroidx/lifecycle/MutableLiveData;", "loadNameCards", "", "app_debug"})
public final class AllNameCardViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<java.util.List<com.cuitianci.scanner.bean.NameCardBean>> nameCardsLive;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.cuitianci.scanner.bean.NameCardBean>> getNameCards() {
        return null;
    }
    
    /**
     * 获取数据，后期后期改成Retrofit
     */
    private final void loadNameCards() {
    }
    
    public AllNameCardViewModel() {
        super();
    }
}