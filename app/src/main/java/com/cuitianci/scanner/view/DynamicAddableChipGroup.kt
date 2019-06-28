package com.cuitianci.scanner.view

import android.content.Context
import android.util.AttributeSet
import com.cuitianci.scanner.R
import com.cuitianci.scanner.db.entity.SearchHistory
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

/**
 * ChipGroup实现流失布局效果
 */
class DynamicAddableChipGroup : ChipGroup {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    fun addHistoryChips(
        list: List<SearchHistory>,
        checkable: Boolean,
        checkedIconVisible: Boolean,
        closeIconVisible: Boolean,
        closeIconClickListener: OnClickListener
    ) {
        this.removeAllViews()
        for (i in list.indices) {
            val chip = Chip(context)
            chip.isCheckable = checkable
            chip.isCloseIconVisible = closeIconVisible
            chip.isCheckedIconVisible = checkedIconVisible
            chip.setChipBackgroundColorResource(R.color.colorChipBg)
//            chip.setChipCornerRadiusResource(R.dimen.chipRadius)
            chip.setTextColor(resources.getColor(R.color.colorChipText, null))
            chip.text = list[i].history
            chip.setOnCloseIconClickListener(closeIconClickListener)
            chip.isClickable = false
            this.addView(chip)
        }
    }
}
