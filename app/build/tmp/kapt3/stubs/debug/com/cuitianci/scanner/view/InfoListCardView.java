package com.cuitianci.scanner.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0006\u0010\u0012\u001a\u00020\u000eR\u0014\u0010\u000b\u001a\b\u0018\u00010\fR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/cuitianci/scanner/view/InfoListCardView;", "Lcom/google/android/material/card/MaterialCardView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/cuitianci/scanner/view/InfoListCardView$BaseInfoAdapter;", "addList", "", "infoList", "", "Lcom/cuitianci/scanner/bean/BaseInfoBean;", "notifyAdapter", "BaseInfoAdapter", "app_debug"})
public final class InfoListCardView extends com.google.android.material.card.MaterialCardView {
    private com.cuitianci.scanner.view.InfoListCardView.BaseInfoAdapter adapter;
    private java.util.HashMap _$_findViewCache;
    
    public final void addList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.cuitianci.scanner.bean.BaseInfoBean> infoList) {
    }
    
    public final void notifyAdapter() {
    }
    
    public InfoListCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public InfoListCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public InfoListCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0012B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\r\u001a\u00020\tH\u0016J \u0010\u000e\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/cuitianci/scanner/view/InfoListCardView$BaseInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/cuitianci/scanner/view/InfoListCardView$BaseInfoAdapter$ViewHolder;", "Lcom/cuitianci/scanner/view/InfoListCardView;", "infoList", "", "Lcom/cuitianci/scanner/bean/BaseInfoBean;", "(Lcom/cuitianci/scanner/view/InfoListCardView;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
    public final class BaseInfoAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.cuitianci.scanner.view.InfoListCardView.BaseInfoAdapter.ViewHolder> {
        private final java.util.List<com.cuitianci.scanner.bean.BaseInfoBean> infoList = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.cuitianci.scanner.view.InfoListCardView.BaseInfoAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        com.cuitianci.scanner.view.InfoListCardView.BaseInfoAdapter.ViewHolder holder, int position) {
        }
        
        public BaseInfoAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<com.cuitianci.scanner.bean.BaseInfoBean> infoList) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/cuitianci/scanner/view/InfoListCardView$BaseInfoAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/cuitianci/scanner/view/InfoListCardView$BaseInfoAdapter;Landroid/view/View;)V", "binding", "Lcom/cuitianci/scanner/databinding/ItemBaseInfoBinding;", "bind", "", "baseInfo", "Lcom/cuitianci/scanner/bean/BaseInfoBean;", "app_debug"})
        public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            private final com.cuitianci.scanner.databinding.ItemBaseInfoBinding binding = null;
            
            public final void bind(@org.jetbrains.annotations.NotNull()
            com.cuitianci.scanner.bean.BaseInfoBean baseInfo) {
            }
            
            public ViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View itemView) {
                super(null);
            }
        }
    }
}