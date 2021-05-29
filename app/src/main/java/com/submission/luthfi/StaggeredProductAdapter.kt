package com.submission.luthfi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import org.w3c.dom.Text

class StaggeredProductAdapter(val listProduct: ArrayList<Product>) : RecyclerView.Adapter<StaggeredProductAdapter.StaggeredViewHolder>() {
    class StaggeredViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.product_img)
        val tv_productName: TextView = itemView.findViewById(R.id.product_name)
        val tv_productPrice: TextView = itemView.findViewById(R.id.product_price)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StaggeredProductAdapter.StaggeredViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_grid_products, parent, false)
        return StaggeredViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: StaggeredProductAdapter.StaggeredViewHolder,
        position: Int
    ) {
        val product: Product = listProduct[position]
        Glide.with(holder.itemView.context)
            .load(product.img)
            .into(holder.imgPhoto)

        holder.tv_productName.text = product.name
        holder.tv_productPrice.text = product.price
    }

    override fun getItemCount(): Int {
        return listProduct.size
    }
}