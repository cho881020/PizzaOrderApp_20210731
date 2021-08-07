package com.neppplus.pizzaorderapp_20210731

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.neppplus.pizzaorderapp_20210731.datas.Store
import kotlinx.android.synthetic.main.activity_view_store_detail.*

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

        nameTxt.text = mStore.name
        phoneNumTxt.text = mStore.phoneNum

        Glide.with(this).load(mStore.imageURL).into(logoImg)

    }

}