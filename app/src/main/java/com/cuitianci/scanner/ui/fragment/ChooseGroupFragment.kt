package com.cuitianci.scanner.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.cuitianci.scanner.R
import com.cuitianci.scanner.databinding.FragmentChooseGroupBinding
import com.cuitianci.scanner.viewmodel.ChooseGroupViewModel

class ChooseGroupFragment : BaseFragment() {

    private var mViewModel: ChooseGroupViewModel? = null
    private var binding: FragmentChooseGroupBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_choose_group, container, false)
        return binding?.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        showViewNone(binding?.root, true)
        mViewModel = ViewModelProviders.of(this).get(ChooseGroupViewModel::class.java)
        // TODO: Use the ViewModel

    }

    companion object {

        internal fun newInstance(): ChooseGroupFragment {
            return ChooseGroupFragment()
        }
    }

}
