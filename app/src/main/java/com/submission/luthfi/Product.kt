package com.submission.luthfi

import java.io.Serializable

data class Product(
    var name: String = "",
    var url: String = "",
    var img: Int = 0,
    var desc: Int = 0,
    var price: String = ""
) : Serializable
