package com.example.a160420084_uts_anmp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a160420084_uts_anmp.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_kost_detail.*
import kotlinx.android.synthetic.main.kost_list_item.view.*

class KostDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kost_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val namaKos = KostDetailFragmentArgs.fromBundle(requireArguments()).namaKos
        if(namaKos.equals("Kost Singgahsini Gelong")){
            Picasso.get().load("https://static.mamikos.com/uploads/cache/data/style/2023-01-26/MAMj4oFL-540x720.jpg").into(imgKost)
            txtNamaKos.text = "Kost Singgahsini Gelong"
            txtJenisKos.text = "Kos Campur"
            txtPemilik.text = "Pemilik : Bela"
            txtAlamatDetail.text = "Alamat : Jalan Contoh, Kota ABC"
            txtBiaya.text = "Biaya : Rp2.399.400 / bulan"
            txtDeskripsi.text = "Deskripsi : fasilitas kamar berupa ac, meja, lemari, kasur, tv, kursi. " +
                    "Tipe ini bisa diisi maks. 2 orang/kamar, Boleh pasutri, tidak boleh bawa anak"
        }
        else if(namaKos.equals("Kost Putri AM 12 UBAYA")){
            Picasso.get().load("https://bit.ly/3MjY6bO").into(imgKost)
            txtNamaKos.text = "Kost Singgahsini Gelong"
            txtJenisKos.text = "Kos Putri"
            txtPemilik.text = "Pemilik : Susi"
            txtAlamatDetail.text = "Alamat : Jl. Tenggilis Mejoyo Blok AM No.12, Kali Rungkut, Kec. Rungkut, Surabaya, Jawa Timur 60293"
            txtBiaya.text = "Biaya : Rp1.500.000 / bulan"
            txtDeskripsi.text = " Deskripsi : fasilitas kamar berupa ac, meja, lemari, kasur, tv, kursi. " +
                    "Tipe ini bisa diisi maks. 2 orang/kamar, Boleh pasutri, tidak boleh bawa anak"
        }
        else if(namaKos.equals("Win Kost Ubaya")){
            Picasso.get().load("https://bit.ly/3W03og6").into(imgKost)
            txtNamaKos.text = "Win Kost Ubaya"
            txtJenisKos.text = "Kos Putri"
            txtPemilik.text = "Pemilik : Dodi"
            txtAlamatDetail.text = "Alamat : Jl. Kaliwaru I No.9, Kali Rungkut, Kec. Rungkut, Surabaya, Jawa Timur 60293"
            txtBiaya.text = "Biaya : Rp1.900.000 / bulan"
            txtDeskripsi.text = " Deskripsi : fasilitas kamar mandi berupa K.Mandi dalam, shower, kloset duduk, air panas. " +
                    "Tipe ini bisa diisi maks. 2 orang/kamar, Boleh pasutri, boleh bawa anak"
        }
        else if(namaKos.equals("Kost Putri AN-9")){
            Picasso.get().load("https://bit.ly/44Qbs74").into(imgKost)
            txtNamaKos.text = "Kost Putri AN-9"
            txtJenisKos.text = "Kos Putri"
            txtPemilik.text = "Pemilik : Suti"
            txtAlamatDetail.text = "Alamat : Tenggilis Mejoyo Blk. AN No.9 / No.36, Kali Rungkut, Kec. Rungkut, Surabaya, Jawa Timur 60293"
            txtBiaya.text = "Biaya : Rp1.900.000 / bulan"
            txtDeskripsi.text = " Deskripsi : fasilitas kamar mandi berupa K.Mandi dalam, shower, kloset duduk, air panas. " +
                    "Tipe ini bisa diisi maks. 2 orang/kamar, Boleh pasutri, boleh bawa anak"
        }
        else if(namaKos.equals("Kost AH 21 Ubaya")){
            Picasso.get().load("https://bit.ly/42PAGAu").into(imgKost)
            txtNamaKos.text = "Kost AH 21 Ubaya"
            txtJenisKos.text = "Kos Putra"
            txtPemilik.text = "Pemilik : Dodi"
            txtAlamatDetail.text = "Alamat : Jl. Tenggilis Mejoyo Blk. AN No.9 / No.36, Kali Rungkut, Kec. Rungkut, Surabaya, Jawa Timur 60293"
            txtBiaya.text = "Biaya : Rp1.880.000 / bulan"
            txtDeskripsi.text = " Deskripsi : fasilitas kamar mandi berupa K.Mandi dalam, shower, kloset duduk, air panas. " +
                    "Tipe ini bisa diisi maks. 2 orang/kamar, Boleh pasutri, boleh bawa anak"
        }
        else if(namaKos.equals("Kost Depan Ubaya KK 4")){
            Picasso.get().load("https://bit.ly/42txb34").into(imgKost)
            txtNamaKos.text = "Kost Depan Ubaya KK 4"
            txtJenisKos.text = "Kos Campur"
            txtPemilik.text = "Pemilik : Rini"
            txtAlamatDetail.text = "Alamat : KK, Jl. Raya Tenggilis Mejoyo, Kali Rungkut, Kec. Rungkut, Surabaya, Jawa Timur 60293"
            txtBiaya.text = "Biaya : Rp2.300.000 / bulan"
            txtDeskripsi.text = " Deskripsi : fasilitas kamar mandi berupa K.Mandi dalam, shower, kloset duduk, air panas. " +
                    "Tipe ini bisa diisi maks. 2 orang/kamar, Boleh pasutri, boleh bawa anak"
        }
    }

}