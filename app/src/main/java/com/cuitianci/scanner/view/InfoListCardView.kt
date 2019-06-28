package com.cuitianci.scanner.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cuitianci.scanner.R
import com.cuitianci.scanner.bean.BaseInfoBean
import com.cuitianci.scanner.databinding.ItemBaseInfoBinding
import com.cuitianci.scanner.view.InfoListCardView.BaseInfoAdapter.ViewHolder
import com.google.android.material.card.MaterialCardView

class InfoListCardView : MaterialCardView {

    private var adapter: BaseInfoAdapter? = null

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    fun addList(infoList: List<BaseInfoBean>) {
        val adapter = BaseInfoAdapter(infoList)
        val recyclerView = RecyclerView(this.context).apply {
            layoutManager = LinearLayoutManager(this.context, RecyclerView.VERTICAL, false)
            this.adapter = adapter
        }
        this.addView(recyclerView)
    }

    fun notifyAdapter() {
        adapter?.notifyDataSetChanged()
    }

    inner class BaseInfoAdapter(private val infoList: List<BaseInfoBean>) :
        RecyclerView.Adapter<ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.item_base_info,
                    parent,
                    false
                )
            )
        }

        override fun getItemCount(): Int {
            return infoList.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(infoList[position])
        }


        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            private val binding: ItemBaseInfoBinding? = DataBindingUtil.bind(itemView)

            fun bind(baseInfo: BaseInfoBean) {
                binding?.baseInfo = baseInfo //数据绑定
            }
        }
    }

}