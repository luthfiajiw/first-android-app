package com.submission.luthfi

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.submission.luthfi.R.color.titleColor
import org.w3c.dom.Text

class ProductDetailActivity : AppCompatActivity() {
    private lateinit var imgPhoto: ImageView
    private lateinit var name: TextView
    private lateinit var price: TextView
    private lateinit var detail: TextView

    companion object {
        const val EXTRA_PRODUCT = "product"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        val product: Product = intent.getSerializableExtra(EXTRA_PRODUCT) as Product

        imgPhoto = findViewById(R.id.product_img)
        name = findViewById(R.id.product_name)
        price = findViewById(R.id.product_price)
        detail = findViewById(R.id.product_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        imgPhoto.setImageResource(product.img)
        name.text = product.name
        price.text = product.price
        detail.setText(product.desc)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}