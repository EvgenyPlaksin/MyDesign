package com.example.mydesign.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Shares(
    @StringRes val stringshareId: Int,
    @StringRes val stringnameId: Int,
    @DrawableRes val imageResourceId: Int
)
