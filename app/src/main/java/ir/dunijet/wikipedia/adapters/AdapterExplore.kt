package ir.dunijet.wikipedia.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ir.dunijet.wikipedia.data.itempost
import ir.dunijet.wikipedia.databinding.ItemRecyclerBinding

class AdapterExplore( val data: ArrayList<itempost>) :
    RecyclerView.Adapter<AdapterExplore.Exploreviewholder>() {
    lateinit var binding: ItemRecyclerBinding


    inner class Exploreviewholder(itemview: View) : RecyclerView.ViewHolder(itemview) {


        fun binddata(item: itempost) {


            Glide.with(itemView.context)
                .load(item.imageUrl)
                .into(binding.imgExplorMain)

            binding.txtExplorTitle.text = item.TxtTitle
            binding.txtExploreDetail.text = item.TxtDetail
            binding.txtExploreSubtitle.text = item.TxtSubtitle

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Exploreviewholder {
        binding = ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Exploreviewholder(binding.root)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: Exploreviewholder, position: Int) {

        holder.binddata(data[position])

    }


}