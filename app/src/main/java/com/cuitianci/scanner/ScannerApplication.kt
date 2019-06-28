package com.cuitianci.scanner

import android.app.Application
import android.util.Log

class ScannerApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.e("tag", "onCreate")
    }

}