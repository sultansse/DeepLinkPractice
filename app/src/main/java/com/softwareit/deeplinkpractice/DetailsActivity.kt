package com.softwareit.deeplinkpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.softwareit.deeplinkpractice.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private val binding by lazy { ActivityDetailsBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        intent.data?.let {
            val btnText = it.getQueryParameter("btn")
            binding.button.text = btnText ?: getString(R.string.empty)
        }
    }
}