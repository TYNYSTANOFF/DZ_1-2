package com.example.baselesson.ui.second

import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.example.baselesson.base.BaseFragment
import com.example.baselesson.base.BaseViewModel
import com.example.baselesson.databinding.FragmentSecondBinding
import com.example.baselesson.extension.KEY

class SecondFragment : BaseFragment<FragmentSecondBinding, BaseViewModel>() {

    private val secondAdapter = SecondAdapter()
    override val viewModel: SecondViewModel by lazy {
        ViewModelProvider(requireActivity())[SecondViewModel::class.java]
    }

    override fun inflateVB(layoutInflater: LayoutInflater):  FragmentSecondBinding{
        return FragmentSecondBinding.inflate(layoutInflater)
    }

    override fun checkInternet() {

    }

    override fun initViewModel() {

    }

    override fun initListener() {

    }

    override fun initViews() {
        binding.recyclerView.adapter = secondAdapter
        val argument = arguments?.getStringArrayList(KEY)
        argument?.let { secondAdapter.setList(it)}
    }

    override fun onDestroy() {
        super.onDestroy()
        val argument = arguments?.getStringArrayList(KEY)
        argument?.clear()
    }

}