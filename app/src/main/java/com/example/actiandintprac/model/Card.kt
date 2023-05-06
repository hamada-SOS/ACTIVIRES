package com.example.actiandintprac.model

import androidx.annotation.DrawableRes

data class Card(
    val cardname: String,
    val price: String,
    @DrawableRes val image: Int,
)
