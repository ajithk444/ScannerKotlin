package com.cuitianci.scanner.ui.fragment

import android.view.View
import android.view.ViewStub
import androidx.fragment.app.Fragment
import com.cuitianci.scanner.R

open class BaseFragment : Fragment() {

    fun showViewNone(container: View?, shouldShow: Boolean) {
        val viewStub = container?.findViewById<ViewStub>(R.id.viewStubNone)
        if (shouldShow) {
            try {
                viewStub?.inflate()
            } catch (e: Exception) {
                viewStub?.visibility = View.VISIBLE
            }
        } else {
            viewStub?.visibility = View.GONE
        }
    }
}