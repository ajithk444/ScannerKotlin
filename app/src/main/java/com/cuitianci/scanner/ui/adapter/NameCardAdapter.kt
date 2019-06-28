package com.cuitianci.scanner.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.cuitianci.scanner.bean.NameCardBean
import com.cuitianci.scanner.R
import com.cuitianci.scanner.databinding.ItemNameCardBinding

/**
 * 名片适配器
 */
class NameCardAdapter(private val mContext: Context, private val nameCards: List<NameCardBean>) :
    RecyclerView.Adapter<NameCardAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_name_card, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            Log.e("cui", "onClick: $position")
            //            mContext.startActivity(new Intent(mContext, CameraXActivity.class));
        }
        holder.bind(nameCards[position]) //将数据传给holder
    }

    override fun getItemCount(): Int {
        return nameCards.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val binding: ItemNameCardBinding? = DataBindingUtil.bind(itemView)

        fun bind(nameCard: NameCardBean) {
            binding?.nameCard = nameCard //数据绑定
        }
    }

    companion object {

        @BindingAdapter("android:src")
        fun setImageResource(imageView: ImageView, res: Int) {
            imageView.setImageResource(res)
        }
    }
}
