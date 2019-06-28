package com.cuitianci.scanner.ui.activity

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.transition.Explode
import android.view.View
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cuitianci.scanner.R
import com.cuitianci.scanner.utils.StatusBarUtil


@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initWindow(true)
    }

    /**
     * 设置toolbar颜色
     * @param title 标题，默认颜色为黑色
     * @param barColor toolbar背景颜色
     */
    protected fun setupToolbar(title: String?, barColor: Int?, homeAsUpEnabled: Boolean) {
        try {
            if (null != barColor)
                findViewById<View>(R.id.toolbar).setBackgroundColor(barColor)
            setSupportActionBar(findViewById(R.id.toolbar))
            supportActionBar?.setDisplayHomeAsUpEnabled(homeAsUpEnabled) //顶部返回图标
            supportActionBar?.title = title
        } catch (e: Exception) {
            Toast.makeText(this, "title error", Toast.LENGTH_SHORT).show()
        }

    }

    /**
     * 设置当前Activity的Title
     */
    fun setActivityTitle(title: String) {
        supportActionBar?.title = title
    }

    /**
     * 初始化状态栏、屏幕方向。
     *
     * @param showTransitions 是否打开转场动画
     */
    private fun initWindow(showTransitions: Boolean) {
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT//禁止横屏
        StatusBarUtil.enableTranslucentStatusBar(this, true)//全屏
        // 打开activity transition。
        if (showTransitions) {
            window.requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS)
            window.enterTransition = Explode() //打开activity时的动画效果
            window.exitTransition = Explode() //关闭activity时的动画效果
        }
    }
}
