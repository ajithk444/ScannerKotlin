package com.cuitianci.scanner.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cuitianci.scanner.bean.NameCardBean

import java.util.ArrayList

/**
 * 名片夹Fragment
 */
class AllNameCardViewModel : ViewModel() {

    private var nameCardsLive: MutableLiveData<List<NameCardBean>>? = null

    val nameCards: LiveData<List<NameCardBean>>
        get() {
            if (null == nameCardsLive) {
                nameCardsLive = MutableLiveData()
                loadNameCards()
            }
            return nameCardsLive as MutableLiveData<List<NameCardBean>>
        }

    /**
     * 获取数据，后期后期改成Retrofit
     */
    private fun loadNameCards() {
        val nameCards = ArrayList<NameCardBean>()
        for (i in 0..9) {
            nameCards.add(NameCardBean("name$i", "pos", "com", "time"))
        }
        this.nameCardsLive?.value = nameCards
    }

}
