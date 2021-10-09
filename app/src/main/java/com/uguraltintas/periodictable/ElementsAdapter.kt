package com.uguraltintas.periodictable

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uguraltintas.periodictable.databinding.RecyclerRowElementsBinding

class ElementsAdapter(
    private val list: ArrayList<Element>,
    private val listener: OnItemClickListener
) :
    RecyclerView.Adapter<ElementsAdapter.ElementsViewHolder>() {
    inner class ElementsViewHolder(private val binding: RecyclerRowElementsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Element) {
            binding.element = item
            binding.clElement.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    listener.onClick(getData(position))
                }
            }
        }
    }

    interface OnItemClickListener {
        fun onClick(element: Element)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElementsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RecyclerRowElementsBinding.inflate(inflater, parent, false)
        return ElementsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ElementsViewHolder, position: Int) {
        holder.bind(list[position])

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    fun getData(position: Int): Element {
        return list[position]
    }
}