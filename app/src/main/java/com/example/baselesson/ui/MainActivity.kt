package com.example.baselesson.ui
import com.example.baselesson.base.BaseActivity
import com.example.baselesson.base.BaseViewModel
import com.example.baselesson.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, BaseViewModel>() {
    override fun inflateVB(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }
}

