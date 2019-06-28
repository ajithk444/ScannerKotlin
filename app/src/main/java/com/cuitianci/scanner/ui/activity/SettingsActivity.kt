package com.cuitianci.scanner.ui.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.cuitianci.scanner.R
import com.cuitianci.scanner.utils.LogUtils

/**
 * 设置
 */
@SuppressLint("Registered")
class SettingsActivity : BaseActivity(),
    PreferenceFragmentCompat.OnPreferenceStartFragmentCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.settings, SettingsFragment())
            .commit()
        setupToolbar("设置", null, true)
    }

    //preference.xml文件中存在fragment跳转关联，xml负责通知到此，跳转逻辑需要代码实现
    override fun onPreferenceStartFragment(
        caller: PreferenceFragmentCompat,
        pref: Preference
    ): Boolean {
        // Instantiate the new Fragment
        val args = pref.extras //携带的参数 xml中配置
        if (null != args.getString("title"))
            setActivityTitle(args.getString("title")!!) //一般发生fragment跳转后，都会伴随着activity标题的更改。
        LogUtils.e(args.toString())
        val fragment =
            supportFragmentManager.fragmentFactory.instantiate( //根据参数（fragment的name来创建Fragment）
                classLoader,
                pref.fragment
            )
        fragment.arguments = args //有可能除了新的fragment需要上一个fragment传过来的数据
        fragment.setTargetFragment(caller, 0) //暂时没用到，与onActivityResult有一定关系。
        // 以新fragment替换原有fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.settings, fragment)
            .addToBackStack(null)
            .commit()
        return true
    }

    /**
     * 设置根目录
     */
    class SettingsFragment : PreferenceFragmentCompat() {
        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey)
        }
    }

    /**
     * 通知设置
     */
    class NotificationSettingsFragment : PreferenceFragmentCompat() {
        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            setPreferencesFromResource(R.xml.notification_preferences, rootKey)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (android.R.id.home == item.itemId) { //监听顶部返回按钮
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    companion object {

        private const val TAG = "SettingsActivity"
    }
}