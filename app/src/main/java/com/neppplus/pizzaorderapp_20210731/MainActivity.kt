package com.neppplus.pizzaorderapp_20210731

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.pizzaorderapp_20210731.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    뷰페이저를 띄우는 어댑터 - 브랜치 테스트용 주석
    lateinit var mainViewPagerAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        정리용 함수 들도 실제 실행
        setupEvents()
        setValues()
    }

    fun setupEvents() {
//        onClick 등의 이벤트 처리 코드 모음.
    }

    fun setValues() {
//        화면에 데이터 (UI) 를 띄우기 위한 관련 코드 모음.


//        뷰페이저를 띄우기 위한 어댑터 객체 / 실제연결
        mainViewPagerAdapter = MainViewPagerAdapter( supportFragmentManager )
        mainViewPager.adapter = mainViewPagerAdapter

//        탭 레이아웃 세팅
        mainTabLayout.setupWithViewPager(mainViewPager)

    }

}