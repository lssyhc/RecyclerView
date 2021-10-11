package com.example.recyclerview_cahyo_06

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Makanan(
    val imgMakanan: Int,
    val namaMakanan: String,
    val descMakanan: String
) : Parcelable
