package com.submission.luthfi

object ProductsData {
    private val productNames = arrayOf(
        "PUMA x Cloud9 Leadcat Slide. White.",
        "PUMA x Cloud9 RS-X. White.",
        "Cloud9 2021 MSI Icelandic Holographic Sticker",
        "PUMA x Cloud9 2021 Jersey. White.",
        "PUMA x Cloud9 2021 Jersey. Black.",
        "PUMA x Cloud9 2021 Zip Pro Hoodie. Black.",
        "PUMA x Cloud9 2021 Pro Pant. Black.",
        "PUMA x Cloud9 Hat. Black. Blue.",
        "PUMA x Cloud9 Backpack. Blue.",
        "Puma x Cloud9 Synergy Waistbag."
    )

    private val productPrices = arrayOf(
        "$ 24",
        "$ 72",
        "$ 2",
        "$ 80",
        "$ 80",
        "$ 75",
        "$ 70",
        "$ 25",
        "$ 55",
        "$ 12.5"
    )

    private val productUrls = arrayOf(
        "https://store.cloud9.gg/collections/all/products/puma-x-cloud9-leadcat-slide-white",
        "https://store.cloud9.gg/collections/all/products/puma-x-cloud9-rs-x-white",
        "https://store.cloud9.gg/collections/all/products/2021-msi-icelandic-holographic-sticker",
        "https://store.cloud9.gg/collections/all/products/puma-x-cloud9-2021-jersey-white",
        "https://store.cloud9.gg/collections/all/products/puma-x-cloud9-2021-jersey-black",
        "https://store.cloud9.gg/collections/all/products/puma-x-cloud9-2021-zip-pro-hoodie-black",
        "https://store.cloud9.gg/collections/all/products/puma-x-cloud9-2021-pro-pant-black",
        "https://store.cloud9.gg/collections/all/products/puma-x-cloud9-hat-blue",
        "https://store.cloud9.gg/collections/all/products/puma-x-cloud9-backpack-blue",
        "https://store.cloud9.gg/collections/all/products/puma-x-cloud9-synergy-waistbag"
    )

    private val productImgs = intArrayOf(
        R.drawable.pumaxcloud9_leadcat,
        R.drawable.pumaxcloud9_rsx,
        R.drawable.cloud9_sticker,
        R.drawable.cloud_jersey_white,
        R.drawable.cloud9_jersey_black,
        R.drawable.hoodie_cloud9_black,
        R.drawable.cloud9_pant,
        R.drawable.cloud9_hat,
        R.drawable.cloud9_bag,
        R.drawable.cloud9_waistbag
    )

    private val productDesc = intArrayOf(
        R.string.pumaxcloud9_leadcat,
        R.string.pumaxcloud9_rsx,
        R.string.cloud9_sticker,
        R.string.cloud9_jersey_white,
        R.string.cloud9_jersey_black,
        R.string.hoodie_black,
        R.string.cloud9_pant,
        R.string.cloud9_hat,
        R.string.cloud9_bag,
        R.string.cloud9_waistbag
    )

    val listProduct: ArrayList<Product>
        get() {
            val list = arrayListOf<Product>()
            for (position in productNames.indices) {
                val product = Product()
                product.name = productNames[position]
                product.desc = productDesc[position]
                product.img = productImgs[position]
                product.price = productPrices[position]
                product.url = productUrls[position]
                list.add(product)
            }
            return list
        }
}