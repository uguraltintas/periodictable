package com.uguraltintas.periodictable

import android.app.AlertDialog
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.uguraltintas.periodictable.databinding.ActivityMainBinding
import com.uguraltintas.periodictable.databinding.DialogElementBinding

class MainActivity : AppCompatActivity(),ElementsAdapter.OnItemClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val list = Elements.getElementData()
        binding.rvElements.adapter = ElementsAdapter(list,this)
        binding.rvElements.layoutManager = GridLayoutManager(this, 18)
    }

    override fun onClick(element: Element) {
        if(element.symbol != "") {
            showDialog(element)
        }
    }
    private fun showDialog(element: Element){
        val dialog = Dialog(this)
        val inflater = LayoutInflater.from(this)
        val dialogBinding = DialogElementBinding.inflate(inflater)
        dialog.setContentView(dialogBinding.root)
        dialogBinding.element = element
        dialog.show()
    }
}