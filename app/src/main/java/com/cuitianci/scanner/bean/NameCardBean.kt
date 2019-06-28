package com.cuitianci.scanner.bean

data class NameCardBean(
//    private var nameCardRes: Int,
    private var name: String?,
    private var position: String?,
    private var company: String?,
    private var addedTime: String?
) {
    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getPosition(): String? {
        return position
    }

    fun setPosition(position: String) {
        this.position = position
    }

    fun getCompany(): String? {
        return company
    }

    fun setCompany(company: String) {
        this.company = company
    }

    fun getAddedTime(): String? {
        return addedTime
    }

    fun setAddedTime(addedTime: String) {
        this.addedTime = addedTime
    }
}
