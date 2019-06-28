package com.cuitianci.scanner.ui.activity

import android.app.AlertDialog
import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentTransaction
import com.cuitianci.scanner.R
import com.cuitianci.scanner.databinding.ActivityMainBinding
import com.cuitianci.scanner.ui.fragment.NameCardHolderFragment
import com.cuitianci.scanner.ui.fragment.PersonalCenterFragment
import com.cuitianci.scanner.utils.StatusBarUtil

class MainActivity : BaseActivity() {

    private var mMenu: Menu? = null
    private var binding: ActivityMainBinding? = null
    private var nameCardHolderFragment: NameCardHolderFragment? = null
    private var personalCenterFragment: PersonalCenterFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)//设置布局
        setupViews()
    }

    //初始化view
    private fun setupViews() {
        setupToolbar(null, Color.TRANSPARENT, false)
        binding?.bottomNavigation?.setOnNavigationItemSelectedListener {
            val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
            //隐藏fragment
            if (nameCardHolderFragment?.isVisible == true)//nameCardHolderFragment为空的话，整体为false，不为空的话，值为name..isVisible结果
                fragmentTransaction.hide(nameCardHolderFragment!!)
            if (personalCenterFragment?.isVisible == true) //同上
                fragmentTransaction.hide(personalCenterFragment!!)
            when (it.itemId) {
                R.id.name_card_holder -> { //点击名片夹
                    setUiVisibility(true) //toolbar,statusBar设置
                    if (null != nameCardHolderFragment) { //非空，则直接show
                        fragmentTransaction.show(nameCardHolderFragment!!)
                    } else { //空，未实例化，则实例化该fragment，并add
                        nameCardHolderFragment = NameCardHolderFragment.newInstance()
                        fragmentTransaction.add(R.id.replace_fragment, nameCardHolderFragment!!)
                    }
                }
                R.id.personal_center -> { //点击个人中心
                    setUiVisibility(false)
                    if (null != personalCenterFragment) { //同上
                        fragmentTransaction.show(personalCenterFragment!!)
                    } else {
                        personalCenterFragment = PersonalCenterFragment()
                        fragmentTransaction.add(R.id.replace_fragment, personalCenterFragment!!)
                    }
                }
            }
            fragmentTransaction.commit() //无论是hide还是add亦或是show，最后都要commit该transaction才生效
            true
        }
        binding?.fab?.setOnClickListener {
            //拍照按钮，取名不规范，不达意
            /*startActivity(
                Intent(
                    this,
                    SettingsActivity::class.java
                )
            )*/
            onSearchRequested()
        }
        //率先展示nameCardHolderFragment
        binding?.bottomNavigation?.selectedItemId =
            R.id.name_card_holder
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the options menu from XML
        val inflater = menuInflater
        inflater.inflate(R.menu.activity_main_menu, menu)
        mMenu = menu//赋值给全局变量，以在切换fragment时，改变menuItem的可见性
        // Get the SearchView and set the searchable configuration
        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        (menu?.findItem(R.id.menu_search)?.actionView as SearchView).apply {
            // Assumes current activity is the searchable activity
            setSearchableInfo(searchManager.getSearchableInfo(componentName))//目前可删掉
            setIconifiedByDefault(true) // Do not iconify the widget; expand it by default
        }
        menu.findItem(R.id.menu_edit).setOnMenuItemClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
            true
        }
        return true
    }

    //设置UI可见性
    private fun setUiVisibility(visibility: Boolean) {
        mMenu?.findItem(R.id.menu_search)?.isVisible = visibility //显示searchMenuItem
        mMenu?.findItem(R.id.menu_edit)?.isVisible = !visibility
        StatusBarUtil.enableTranslucentStatusBar(this, visibility)
    }

    //主页按返回键，确认退出对话框
    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setMessage(
                getString(R.string.do_you_confirm_to_exit).replace(
                    "x",
                    getString(R.string.app_name)
                )
            )
            .setPositiveButton(R.string.confirm_to_exit) { _, _ -> finishAfterTransition() }
            .setNegativeButton(R.string.use_again, null)
            .create().show()
    }
}
