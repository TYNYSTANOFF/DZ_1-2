package com.example.baselesson.ui.first

import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.example.baselesson.R
import com.example.baselesson.base.BaseFragment
import com.example.baselesson.base.BaseViewModel
import com.example.baselesson.databinding.FragmentFirstBinding
import com.example.baselesson.extension.KEY
import com.example.baselesson.model.ImageModel

class FirstFragment : BaseFragment<FragmentFirstBinding, BaseViewModel>() {
    private val list = ArrayList<ImageModel>()
    private val firstAdapter = FirstAdapter()

    override fun inflateVB(layoutInflater: LayoutInflater): FragmentFirstBinding {
        return FragmentFirstBinding.inflate(layoutInflater)
    }

    override val viewModel: FirstViewModel by lazy {
        ViewModelProvider(requireActivity())[FirstViewModel::class.java]
    }

    override fun checkInternet() {

    }

    override fun initViewModel() {

    }

    override fun initListener() {
        binding.fab.setOnClickListener {
            val bundle = Bundle()
            bundle.putStringArrayList(KEY, firstAdapter.selectedList)
            navigate(R.id.secondFragment2, bundle)
        }
    }

    override fun initViews() {
        binding.recyclerView.adapter = firstAdapter

        if (list.isEmpty()){
            firstAdapter.addList(loadData())
        }
    }

    private fun loadData(): ArrayList<ImageModel> {
        list.apply {
            add(ImageModel("https://www.meme-arsenal.com/memes/65dda711927d6f96044b6c9a45c84934.jpg",
                true))
            add(ImageModel("https://www.meme-arsenal.com/memes/65dda711927d6f96044b6c9a45c84934.jpg",
            true))
            add(ImageModel("https://www.meme-arsenal.com/memes/65dda711927d6f96044b6c9a45c84934.jpg",
            true))
            add(ImageModel("https://www.meme-arsenal.com/memes/40e7bd8db587320da5b19438d52ec686.jpg",
            true))
            add(ImageModel("https://www.meme-arsenal.com/memes/40e7bd8db587320da5b19438d52ec686.jpg",
            true))
            add(ImageModel("https://www.meme-arsenal.com/memes/40e7bd8db587320da5b19438d52ec686.jpg",
            true))
            add(ImageModel("https://memepedia.ru/wp-content/uploads/2017/08/5-%D0%BD%D0%B5%D0%B3%D1%80%D0%BE%D0%B2.jpg",
            true))
            add(ImageModel("https://memepedia.ru/wp-content/uploads/2017/08/5-%D0%BD%D0%B5%D0%B3%D1%80%D0%BE%D0%B2.jpg",
            true))
            add(ImageModel("https://memepedia.ru/wp-content/uploads/2017/08/5-%D0%BD%D0%B5%D0%B3%D1%80%D0%BE%D0%B2.jpg",
            true))
            add(ImageModel("https://memepedia.ru/wp-content/uploads/2021/09/chupapi-munjanja-ne-budet-6-360x270.jpg",
            true))
            add(ImageModel("https://memepedia.ru/wp-content/uploads/2021/09/chupapi-munjanja-ne-budet-6-360x270.jpg",
            true))
            add(ImageModel("https://memepedia.ru/wp-content/uploads/2021/09/chupapi-munjanja-ne-budet-6-360x270.jpg",
            true))
            add(ImageModel("https://i.pinimg.com/550x/83/fc/be/83fcbe2a74f030254e50169675939267.jpg",
            true))
            add(ImageModel("https://i.pinimg.com/550x/83/fc/be/83fcbe2a74f030254e50169675939267.jpg",
            true))
            add(ImageModel("https://i.pinimg.com/550x/83/fc/be/83fcbe2a74f030254e50169675939267.jpg",
            true))
            add(ImageModel("https://www.meme-arsenal.com/memes/0e24d49a071ee7d8323de42cfa89ece2.jpg",
            true))
            add(ImageModel("https://www.meme-arsenal.com/memes/0e24d49a071ee7d8323de42cfa89ece2.jpg",
            true))
            add(ImageModel("https://www.meme-arsenal.com/memes/0e24d49a071ee7d8323de42cfa89ece2.jpg",
            true))
            add(ImageModel("https://www.meme-arsenal.com/memes/67ca744b8bc56e556dc62253eca4cd02.jpg",
            true))
            add(ImageModel("https://www.meme-arsenal.com/memes/67ca744b8bc56e556dc62253eca4cd02.jpg",
            true))
            add(ImageModel("https://www.meme-arsenal.com/memes/67ca744b8bc56e556dc62253eca4cd02.jpg",
            true))
            add(ImageModel("https://www.meme-arsenal.com/memes/fc1839bd475ad82eb4f0f9f9dc10cb40.jpg",
            true))
            add(ImageModel("https://www.meme-arsenal.com/memes/fc1839bd475ad82eb4f0f9f9dc10cb40.jpg",
            true))
            add(ImageModel("https://www.meme-arsenal.com/memes/fc1839bd475ad82eb4f0f9f9dc10cb40.jpg",
            true))
        }
        return list
    }
}