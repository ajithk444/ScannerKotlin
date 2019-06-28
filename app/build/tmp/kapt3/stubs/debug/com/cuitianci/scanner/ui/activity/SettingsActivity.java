package com.cuitianci.scanner.ui.activity;

import java.lang.System;

/**
 * 设置
 */
@android.annotation.SuppressLint(value = {"Registered"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0003\u0011\u0012\u0013B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016\u00a8\u0006\u0014"}, d2 = {"Lcom/cuitianci/scanner/ui/activity/SettingsActivity;", "Lcom/cuitianci/scanner/ui/activity/BaseActivity;", "Landroidx/preference/PreferenceFragmentCompat$OnPreferenceStartFragmentCallback;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onPreferenceStartFragment", "caller", "Landroidx/preference/PreferenceFragmentCompat;", "pref", "Landroidx/preference/Preference;", "Companion", "NotificationSettingsFragment", "SettingsFragment", "app_debug"})
public final class SettingsActivity extends com.cuitianci.scanner.ui.activity.BaseActivity implements androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback {
    private static final java.lang.String TAG = "SettingsActivity";
    public static final com.cuitianci.scanner.ui.activity.SettingsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onPreferenceStartFragment(@org.jetbrains.annotations.NotNull()
    androidx.preference.PreferenceFragmentCompat caller, @org.jetbrains.annotations.NotNull()
    androidx.preference.Preference pref) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public SettingsActivity() {
        super();
    }
    
    /**
     * 设置根目录
     */
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/cuitianci/scanner/ui/activity/SettingsActivity$SettingsFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "()V", "onCreatePreferences", "", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "", "app_debug"})
    public static final class SettingsFragment extends androidx.preference.PreferenceFragmentCompat {
        private java.util.HashMap _$_findViewCache;
        
        @java.lang.Override()
        public void onCreatePreferences(@org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
        java.lang.String rootKey) {
        }
        
        public SettingsFragment() {
            super();
        }
    }
    
    /**
     * 通知设置
     */
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/cuitianci/scanner/ui/activity/SettingsActivity$NotificationSettingsFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "()V", "onCreatePreferences", "", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "", "app_debug"})
    public static final class NotificationSettingsFragment extends androidx.preference.PreferenceFragmentCompat {
        private java.util.HashMap _$_findViewCache;
        
        @java.lang.Override()
        public void onCreatePreferences(@org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
        java.lang.String rootKey) {
        }
        
        public NotificationSettingsFragment() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/cuitianci/scanner/ui/activity/SettingsActivity$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}