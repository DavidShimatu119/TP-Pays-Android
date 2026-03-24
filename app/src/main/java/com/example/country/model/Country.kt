package com.example.country.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Country(
    @StringRes val nameRes: Int,
    @StringRes val capitalRes: Int,
    @StringRes val codeRes: Int,
    @DrawableRes val flagRes: Int
