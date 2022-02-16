package com.example.hw12_maktab67_part2

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imageLoader")
fun ImageView.glide(url: String){
    Glide.with(this)
        .load(url)
        .placeholder(R.drawable.loading_animation)
        .into(this)
}