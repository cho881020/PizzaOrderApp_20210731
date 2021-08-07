package com.neppplus.pizzaorderapp_20210731

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.pizzaorderapp_20210731.datas.Store

class ViewStoreDetailActivity : AppCompatActivity() {

    lateinit var mStore : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        setupEvents()
        setValues()
    }

    fun setupEvents() {

    }

    fun setValues() {

        mStore = intent.getSerializableExtra("store") as Store

    }

}