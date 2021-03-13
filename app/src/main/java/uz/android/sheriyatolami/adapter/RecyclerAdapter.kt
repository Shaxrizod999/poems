package uz.android.sheriyatolami.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.android.sheriyatolami.R
import uz.android.sheriyatolami.fragments.FifthFragment
import uz.android.sheriyatolami.model.Sher
import java.util.*

class RecyclerAdapter(var list: ArrayList<Sher>, val onClick: (model: Sher) -> Unit): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
         fun onBind(model: Sher) {
             itemView.apply {
                 findViewById<TextView>(R.id.nomi).text = model.name
                 findViewById<TextView>(R.id.tv).text = model.sher
             }
             itemView.setOnClickListener()
             {
                 onClick(model)
             }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_excample, parent, false))
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }
    override fun getItemCount(): Int = list.size
}