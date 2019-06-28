package com.cuitianci.scanner.utils

import android.app.Activity
import android.graphics.Color
import android.view.View
import android.view.WindowManager

/**
 * 设置系统状态栏和导航栏透明化
 */
object StatusBarUtil {

    /**
     * 启用 透明状态栏
     * 注意：设置状态栏文字颜色会必须有FULLSCREEN，因而开启全屏，如若避免界面上移需加入
     * @param activity 活动
     */
    fun enableTranslucentStatusBar(activity: Activity, isBlackStatusBarText: Boolean) {
        val window = activity.window
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS or WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
        window.decorView.systemUiVisibility = if (isBlackStatusBarText)
            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        else //区别在于SYSTEM_UI_FLAG_LIGHT_STATUS_BAR属性，Light表示浅色，状态栏浅色，则字体为黑色。
            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = Color.TRANSPARENT//透明状态栏
        window.navigationBarColor = Color.TRANSPARENT//透明导航栏
    }
}//
