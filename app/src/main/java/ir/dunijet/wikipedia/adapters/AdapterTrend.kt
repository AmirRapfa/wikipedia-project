package ir.dunijet.wikipedia.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ir.dunijet.wikipedia.data.itempost
import ir.dunijet.wikipedia.databinding.ItemRecyclerTrendBinding
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class AdapterTrend( val data: ArrayList<itempost>) :
    RecyclerView.Adapter<AdapterTrend.Trendviewholder>() {
    lateinit var binding: ItemRecyclerTrendBinding


    inner class Trendviewholder(itemview: View) : RecyclerView.ViewHolder(itemview) {


        fun binddata(item: itempost) {

            binding.txtTrendTitle.text = item.TxtTitle
            binding.txtTrendSubtitle.text = item.TxtSubtitle
            binding.txtTrendInsight.text = item.insidgt
            binding.txtTrendNumber.text = (adapterPosition + 1).toString()

            Glide.with(itemView.context)
                .load(item.imageUrl)
                .transform(RoundedCornersTransformation(32, 8))
                .into(binding.imgTrend)



        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Trendviewholder {
        binding = ItemRecyclerTrendBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Trendviewholder(binding.root)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: Trendviewholder, position: Int) {

        holder.binddata(data[position])

    }


}