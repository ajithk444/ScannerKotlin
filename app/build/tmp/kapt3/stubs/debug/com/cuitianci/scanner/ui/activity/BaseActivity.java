package com.cuitianci.scanner.ui.activity;

import java.lang.System;

@android.annotation.SuppressLint(value = {"Registered"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ)\u0010\r\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0004\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/cuitianci/scanner/ui/activity/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "initWindow", "", "showTransitions", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setActivityTitle", "title", "", "setupToolbar", "barColor", "", "homeAsUpEnabled", "(Ljava/lang/String;Ljava/lang/Integer;Z)V", "app_debug"})
public class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * 设置toolbar颜色
     * @param title 标题，默认颜色为黑色
     * @param barColor toolbar背景颜色
     */
    protected final void setupToolbar(@org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Integer barColor, boolean homeAsUpEnabled) {
    }
    
    /**
     * 设置当前Activity的Title
     */
    public final void setActivityTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    /**
     * 初始化状态栏、屏幕方向。
     *
     * @param showTransitions 是否打开转场动画
     */
    private final void initWindow(boolean showTransitions) {
    }
    
    public BaseActivity() {
        super();
    }
}