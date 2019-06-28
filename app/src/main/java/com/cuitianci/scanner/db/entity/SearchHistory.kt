package com.cuitianci.scanner.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class SearchHistory(var history: String) {

    @PrimaryKey(autoGenerate = true)
    var hId: Int = 0
}
