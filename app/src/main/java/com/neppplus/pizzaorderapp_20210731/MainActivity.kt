package com.neppplus.pizzaorderapp_20210731

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.pizzaorderapp_20210731.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mainViewPagerAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    fun setupEvents() {
//        onClick 등의 이벤트 처리 코드 모음.
    }

    fun setValues() {
//        화면에 데이터 (UI) 를 띄우기 위한 관련 코드 모음.

        mainViewPagerAdapter = MainViewPagerAdapter( supportFragmentManager )
        mainViewPager.adapter = mainViewPagerAdapter

        mainTabLayout.setupWithViewPager(mainViewPager)

    }

}