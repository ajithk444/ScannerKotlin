package com.cuitianci.scanner.ui.adapter;

import java.lang.System;

/**
 * 名片适配器
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0013\u0014B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/cuitianci/scanner/ui/adapter/NameCardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/cuitianci/scanner/ui/adapter/NameCardAdapter$ViewHolder;", "mContext", "Landroid/content/Context;", "nameCards", "", "Lcom/cuitianci/scanner/bean/NameCardBean;", "(Landroid/content/Context;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "app_debug"})
public final class NameCardAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.cuitianci.scanner.ui.adapter.NameCardAdapter.ViewHolder> {
    private final android.content.Context mContext = null;
    private final java.util.List<com.cuitianci.scanner.bean.NameCardBean> nameCards = null;
    public static final com.cuitianci.scanner.ui.adapter.NameCardAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.cuitianci.scanner.ui.adapter.NameCardAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.cuitianci.scanner.ui.adapter.NameCardAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public NameCardAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    java.util.List<com.cuitianci.scanner.bean.NameCardBean> nameCards) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/cuitianci/scanner/ui/adapter/NameCardAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/cuitianci/scanner/ui/adapter/NameCardAdapter;Landroid/view/View;)V", "binding", "Lcom/cuitianci/scanner/databinding/ItemNameCardBinding;", "bind", "", "nameCard", "Lcom/cuitianci/scanner/bean/NameCardBean;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.cuitianci.scanner.databinding.ItemNameCardBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.cuitianci.scanner.bean.NameCardBean nameCard) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/cuitianci/scanner/ui/adapter/NameCardAdapter$Companion;", "", "()V", "setImageResource", "", "imageView", "Landroid/widget/ImageView;", "res", "", "app_debug"})
    public static final class Companion {
        
        @androidx.databinding.BindingAdapter(value = {"android:src"})
        public final void setImageResource(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView imageView, int res) {
        }
        
        private Companion() {
            super();
        }
    }
}