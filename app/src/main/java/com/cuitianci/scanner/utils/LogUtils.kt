package com.cuitianci.scanner.utils

import android.util.Log

object LogUtils {

    private const val TAG = "LogTAG"

    fun v(msg: String) {
        Log.v(TAG, msg)
    }

    fun d(msg: String) {
        Log.d(TAG, msg)
    }

    fun i(msg: String) {
        Log.i(TAG, msg)
    }

    fun w(msg: String) {
        Log.w(TAG, msg)
    }

    fun e(msg: String) {
        Log.e(TAG, msg)
    }

    fun v(tag: String, msg: String) {
        Log.v(tag, msg)
    }

    fun d(tag: String, msg: String) {
        Log.d(tag, msg)
    }

    fun i(tag: String, msg: String) {
        Log.i(tag, msg)
    }

    fun w(tag: String, msg: String) {
        Log.w(tag, msg)
    }

    fun e(tag: String, msg: String) {
        Log.e(tag, msg)
    }

}