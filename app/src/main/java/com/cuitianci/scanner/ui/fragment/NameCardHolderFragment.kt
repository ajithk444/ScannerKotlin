package com.cuitianci.scanner.ui.fragment

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.cuitianci.scanner.R
import com.cuitianci.scanner.databinding.FragmentNameCardHolderBinding
import com.cuitianci.scanner.db.AppDatabase
import com.cuitianci.scanner.db.entity.SearchHistory
import com.cuitianci.scanner.ui.adapter.MyFragmentPagerAdapter
import java.util.*

/**
 * 名片夹
 */
class NameCardHolderFragment : Fragment() {

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentNameCardHolderBinding>(
            inflater,
            R.layout.fragment_name_card_holder,
            container,
            false
        )
        val titles = ArrayList<String>()//TabLayout中每个Tab显示的文字
        titles.add(getString(R.string.all_name_card))
        titles.add(getString(R.string.choose_groups))
        val fragments = ArrayList<Fragment>()//Viewpager中的Fragment
        fragments.add(AllNameCardFragment.newInstance())
        fragments.add(ChooseGroupFragment.newInstance())
        binding.viewPager.adapter = MyFragmentPagerAdapter(fragmentManager!!, titles, fragments)
        binding.tabLayout.setupWithViewPager(binding.viewPager)//tabLayout和ViewPager建立关联
        //监听软键盘的Search键
       /* binding.edtSearch.setOnEditorActionListener { v, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                Toast.makeText(activity, v.text, Toast.LENGTH_SHORT).show()
                AppDatabase.getDatabase(v.context).searchHistoryDao()
                    .insertAll(SearchHistory(v.text.toString()))
                v.text = null
                //隐藏键盘
                (v.context.getSystemService(
                    Context.INPUT_METHOD_SERVICE
                ) as InputMethodManager).hideSoftInputFromWindow(
                    activity?.currentFocus?.windowToken,
                    InputMethodManager.HIDE_NOT_ALWAYS
                )
                binding.root.requestFocus()
            }
            true
        }*/
        return binding.root
    }

    companion object {

        fun newInstance(): NameCardHolderFragment {
            return NameCardHolderFragment()
        }
    }
}
