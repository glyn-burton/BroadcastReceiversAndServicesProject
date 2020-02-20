package com.example.broadcastreceiversandservicesproject

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Jojo(

    var name: String,
    var stand:String,
    var catchphrase:String,
    var part:String


):Parcelable