package com.example.a160420084_uts_anmp.model

import com.google.gson.annotations.SerializedName

data class Kost(
    @SerializedName("nama")
    val name:String?,
    val jenis:String?,
    val pemilik:String?,
    val alamat:String?,
    @SerializedName("photo_url")
    val photoUrl:String?,
    val biaya_kos:Int?,
    val ukuran:Double?,
    val inc_listrik:Boolean?,
    val fasilitas_kamar:String?,
    val fasilitas_mandi:String?,
    val peraturan:String?
)