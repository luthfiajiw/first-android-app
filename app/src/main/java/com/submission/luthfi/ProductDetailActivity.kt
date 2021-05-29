package com.submission.luthfi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class ProductDetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_PRODUCT = "product"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val product: Product = intent.getSerializableExtra(EXTRA_PRODUCT) as Product

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