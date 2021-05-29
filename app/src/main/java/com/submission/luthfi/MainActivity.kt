package com.submission.luthfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    private lateinit var rvProducts: RecyclerView
    private var list: ArrayList<Product> = arrayListOf<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.addAll(ProductsData.listProduct)
        rvProducts = findViewById(R.id.rv_products)
        rvProducts.setHasFixedSize(true)

        showListRecyclerView()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(itemId: Int) {
        when (itemId) {
            R.id.action_profile -> {
                val profileIntent: Intent = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(profileIntent)
            }
        }
    }

    private fun showStaggeredRecyclerView() {
        rvProducts.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        val staggerredProductAdapter = StaggeredProductAdapter(list)
        rvProducts.adapter = staggerredProductAdapter
    }

    private fun showListRecyclerView() {
        rvProducts.layoutManager = LinearLayoutManager(this)
        val listProductAdapter = ListProductAdapter(list)
        rvProducts.adapter = listProductAdapter

        listProductAdapter.setOnItemClickCallback(object: ListProductAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Product) {
                val productDetailIntent: Intent = Intent(this@MainActivity, ProductDetailActivity::class.java)
                productDetailIntent.putExtra(ProductDetailActivity.EXTRA_PRODUCT, data)
                startActivity(productDetailIntent)
            }

        })
    }
}