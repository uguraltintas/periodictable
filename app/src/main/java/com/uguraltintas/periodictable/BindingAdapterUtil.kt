package com.uguraltintas.periodictable

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.provider.CalendarContract
import android.view.View
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.BindingAdapter

@BindingAdapter("setVisibility")
fun View.setVisibility(isVisibility: Boolean) {
    visibility = if (isVisibility) View.VISIBLE else View.GONE
}
@BindingAdapter("setBackgroundColor")
fun View.setBackgroundColor(backgroundColor: String) {
    setBackgroundColor(Color.parseColor(backgroundColor))
}
