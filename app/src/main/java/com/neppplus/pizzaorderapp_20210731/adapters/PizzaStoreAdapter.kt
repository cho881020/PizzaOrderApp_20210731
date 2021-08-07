package com.neppplus.pizzaorderapp_20210731.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.pizzaorderapp_20210731.datas.Store

class PizzaStoreAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Store> ) : ArrayAdapter<Store>(mContext, resId, mList) {


}