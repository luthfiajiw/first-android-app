package com.submission.luthfi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListProductAdapter(val listProduct: ArrayList<Product>) : RecyclerView.Adapter<ListProductAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.product_img)
        val tv_productName: TextView = itemView.findViewById(R.id.product_name)
        val tv_productPrice: TextView = itemView.findViewById(R.id.product_price)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Product)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListProductAdapter.ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_product, parent, false)
        return ListProductAdapter.ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListProductAdapter.ListViewHolder, position: Int) {
        val product: Product = listProduct[position]
        Glide.with(holder.itemView.context)
            .load(product.img)
            .apply(RequestOptions().override(100, 100))
            .into(holder.imgPhoto)

        holder.tv_productName.text = product.name
        holder.tv_productPrice.text = product.price

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(product)
        }
    }

    override fun getItemCount(): Int {
        return listProduct.size
    }
}