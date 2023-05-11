package com.example.a160420084_uts_anmp.view

import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.a160420084_uts_anmp.R
import com.example.a160420084_uts_anmp.model.Kost
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.kost_list_item.view.*


class KostListAdapter(val kostList:ArrayList<Kost>)
    :RecyclerView.Adapter<KostListAdapter.KostViewHolder>()
{
    class KostViewHolder(var view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KostViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.kost_list_item, parent, false)
        return KostViewHolder(view)
    }

    override fun getItemCount(): Int {
        return kostList.size
    }

    override fun onBindViewHolder(holder: KostViewHolder, position: Int) {
        holder.view.txtNamaKost.text = kostList[position].name
        holder.view.txtAlamat.text = kostList[position].alamat

        Picasso.get().load(kostList[position].photoUrl).into(holder.view.imageKost)
        holder.view.buttonDetail.setOnClickListener {
            val action = MainFragmentDirections.actionKostDetailFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }

    fun updateKostList(newStudentList: ArrayList<Kost>) {
        kostList.clear()
        kostList.addAll(newStudentList)
        notifyDataSetChanged()
    }
}