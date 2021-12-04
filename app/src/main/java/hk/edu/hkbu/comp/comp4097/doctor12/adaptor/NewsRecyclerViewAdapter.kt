package hk.edu.hkbu.comp.comp4097.doctor12.adaptor

import android.util.Log
import android.util.TypedValue
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import hk.edu.hkbu.comp.comp4097.doctor12.R
import hk.edu.hkbu.comp.comp4097.doctor12.data.News
import hk.edu.hkbu.comp.comp4097.doctor12.databinding.ItemPagerCardBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

//import com.example.infoday.ui.events.databinding.FragmentEventItemBinding

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class NewsRecyclerViewAdapter(
    private val values: List<News>
) : RecyclerView.Adapter<NewsRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            ItemPagerCardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.idView.text = item.title
        holder.contentView.text = item.description

//
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: ItemPagerCardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val idView: TextView = binding.tvTitulo
        val contentView: TextView = binding.tvCantidadCursos

        init { //add this
            binding.root.addRipple()
            binding.root.isClickable = true
        }


    }

    private fun View.addRipple() = with(TypedValue()) {
        context.theme.resolveAttribute(R.attr.selectableItemBackground, this, true)
        setBackgroundResource(resourceId)
    }
}
