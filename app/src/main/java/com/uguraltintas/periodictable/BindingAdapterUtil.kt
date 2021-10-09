package com.uguraltintas.periodictable

import android.graphics.Color
import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.ImageLoader
import coil.decode.SvgDecoder
import coil.request.ImageRequest
import com.bumptech.glide.Glide

@BindingAdapter("setVisibility")
fun View.setVisibility(isVisibility: Boolean) {
    visibility = if (isVisibility) View.VISIBLE else View.GONE
}

@BindingAdapter("setBackgroundColor")
fun View.setBackgroundColor(backgroundColor: String) {
    setBackgroundColor(Color.parseColor(backgroundColor))
}

@BindingAdapter("loadImage")
fun ImageView.loadImage(url: String) {
    val imageLoader = ImageLoader.Builder(this.context)
        .componentRegistry { add(SvgDecoder(context)) }
        .build()

    val request = ImageRequest.Builder(this.context)
        .crossfade(true)
        .crossfade(500)
        .data(url)
        .target(this)
        .build()
    imageLoader.enqueue(request)
}