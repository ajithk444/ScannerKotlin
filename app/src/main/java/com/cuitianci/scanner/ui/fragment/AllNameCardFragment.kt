package com.cuitianci.scanner.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cuitianci.scanner.R
import com.cuitianci.scanner.bean.NameCardBean
import com.cuitianci.scanner.databinding.FragmentAllNameCardBinding
import com.cuitianci.scanner.ui.adapter.NameCardAdapter
import com.cuitianci.scanner.viewmodel.AllNameCardViewModel
import java.util.*

/**
 * 名片列表
 */
class AllNameCardFragment : BaseFragment() {

    private var binding: FragmentAllNameCardBinding? = null
    private val nameCardList = ArrayList<NameCardBean>()
    private var adapter: NameCardAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_all_name_card, container, false)
        adapter = NameCardAdapter(activity!!, nameCardList) //初始化adapter
        binding?.rv?.layoutManager = LinearLayoutManager(
            binding!!.rv.context,
            RecyclerView.VERTICAL,
            false
        )//别忘了设置layoutManager，否则不显示
        binding?.rv?.adapter = adapter
        return binding?.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val mViewModel =
            ViewModelProviders.of(this).get(AllNameCardViewModel::class.java) //初始化viewModel
        mViewModel.nameCards.observe(this, androidx.lifecycle.Observer { nameCardBeans ->
            //监听数据
            if (nameCardBeans.isEmpty()) { //返回结果为空，展示空数据提示
                showViewNone(binding?.root, true)
            } else {
                showViewNone(binding?.root, false)
                nameCardList.clear()
                nameCardList.addAll(nameCardBeans)
                adapter?.notifyDataSetChanged() //更新recyclerView中的数据
            }
        })
    }

    companion object {

        internal fun newInstance(): AllNameCardFragment {
            return AllNameCardFragment()
        }
    }
}
