package com.cuitianci.scanner.bean

data class BaseInfoBean(
    private var iconRes: Int,
    private var label: String,
    private var value: String
) {
    fun getLabel(): String? {
        return label
    }

    fun setLable(label: String) {
        this.label = label
    }

    fun getValue(): String? {
        return value
    }

    fun setValue(value: String) {
        this.value = value
    }
}