package com.cuitianci.scanner.ui.fragment


import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewTreeObserver
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.cuitianci.scanner.R
import com.cuitianci.scanner.bean.BaseInfoBean
import com.cuitianci.scanner.databinding.FragmentPersonalCenterBinding
import com.cuitianci.scanner.db.AppDatabase
import com.cuitianci.scanner.ui.activity.SettingsActivity
import com.cuitianci.scanner.utils.ColorUtil
import com.google.android.material.chip.Chip

class PersonalCenterFragment : Fragment() {
    private var binding: FragmentPersonalCenterBinding? = null
    private var mHeight: Int = 0
    private var currentColor: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_personal_center, container, false)
        return binding!!.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val baseInfoList = listOf(
            BaseInfoBean(R.drawable.ic_add_more, "1111", "1111"),
            BaseInfoBean(R.drawable.ic_add_more, "2222", "2222"),
            BaseInfoBean(R.drawable.ic_add_more, "3333", "3333")
        )
        binding?.cvPersonInfo?.addList(baseInfoList)
        //从数据库获取搜索历史，设置chip添加到chipGroup中。
        AppDatabase.getDatabase(activity!!).searchHistoryDao().allHistories.observe(
            this,
            androidx.lifecycle.Observer { searchHistories ->
                binding?.chipGroup?.addHistoryChips(
                    searchHistories,
                    checkable = true,
                    checkedIconVisible = true,
                    closeIconVisible = true,
                    closeIconClickListener = View.OnClickListener {
                        AppDatabase.getDatabase(activity!!).searchHistoryDao()
                            .deleteHistory(history = (it as? Chip)?.text.toString())
                    })
            })
        binding?.chipGroup?.isSingleSelection = true
        //正确的在onResume生命周期之前获取View宽高的方式，（该方法应该是在布局加载完成时回调）。
        val viewTreeObserver = binding!!.ivBg.viewTreeObserver
        viewTreeObserver.addOnGlobalLayoutListener(object :
            ViewTreeObserver.OnGlobalLayoutListener {
            override fun onGlobalLayout() {
                binding?.ivBg?.viewTreeObserver?.removeOnGlobalLayoutListener(this)//防止无限回调
                mHeight = binding!!.ivBg.height - binding!!.cColorBg.height//图片高度减去标题栏高度。
                binding?.nsv?.setOnScrollChangeListener { _: View, _: Int, scrollY: Int, _: Int, _: Int ->
                    when {
                        scrollY <= 0 -> //这一部分透明显示
                            //滑动位置为最顶部，标题栏透明
                            currentColor = Color.TRANSPARENT
                        scrollY < mHeight -> {
                            //滑动过程，渐变
                            val scale = scrollY.toFloat() / mHeight//滑动距离比例
                            currentColor = ColorUtil.getXXColorOfBitmap(
                                activity!!,
                                BitmapFactory.decodeResource(
                                    activity?.resources,
                                    R.drawable.ic_persona_center_bg
                                ), scale
                            )
                            binding!!.cColorBg.alpha = scale//设置透明度
                        }
                        else -> {
                            //超过顶部区域，标题栏定色
                            currentColor = ColorUtil.getXXColorOfBitmap(
                                activity!!,
                                BitmapFactory.decodeResource(
                                    activity?.resources,
                                    R.drawable.ic_persona_center_bg
                                ),
                                0.99f
                            )//必须小于1，否则PaletteRegion越界。
                            binding?.cColorBg?.alpha = 1f
                        }
                    }
                    binding?.cColorBg?.setBackgroundColor(currentColor)
                }
            }
        })
        binding?.tvEdit?.setOnClickListener {
            startActivity(
                Intent(
                    activity!!,
                    SettingsActivity::class.java
                )
            )
        }
    }
}
