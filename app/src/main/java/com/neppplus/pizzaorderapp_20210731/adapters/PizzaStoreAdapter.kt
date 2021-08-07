package com.neppplus.pizzaorderapp_20210731.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.neppplus.pizzaorderapp_20210731.R
import com.neppplus.pizzaorderapp_20210731.datas.Store

class PizzaStoreAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Store> ) : ArrayAdapter<Store>(mContext, resId, mList) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.pizza_store_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]

        val logoImg = row.findViewById<ImageView>(R.id.logoImg)
        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)

        nameTxt.text = data.name

        Glide.with(mContext).load(data.imageURL).into(logoImg)

        return row
    }

}