package com.softwareit.deeplinkpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.softwareit.deeplinkpractice.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        intent.data?.let {
            val message = it.getQueryParameter("message")
            binding.textView.text = message ?: getString(R.string.empty)
        }
    }
}