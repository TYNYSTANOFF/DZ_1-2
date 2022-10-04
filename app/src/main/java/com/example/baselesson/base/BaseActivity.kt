package com.example.baselesson.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding, VM : ViewModel> : AppCompatActivity() {

    private lateinit var binding: VB
    protected lateinit var viewModel: VM
    abstract fun inflateVB(): VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflateVB()
        setContentView(binding.root)

        checkInternet()
        initViews()
        initViewModel()
        initListener()

    }

    open fun checkInternet() {}
    open fun initViews() {}
    open fun initListener() {}
    open fun initViewModel() {}
}