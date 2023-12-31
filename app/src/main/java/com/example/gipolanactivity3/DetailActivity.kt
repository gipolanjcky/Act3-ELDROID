package com.example.gipolanactivity3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gipolanactivity3.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("NAME_PARAMS")
        val subject = intent.getStringExtra("SUBJECT_PARAMS")
        val body = intent.getStringExtra("MESSAGE_PARAMS")

        binding.nameTextView.text = name
        binding.subjectTextView.text = subject
        binding.messageTextView.text = body
    }
}





