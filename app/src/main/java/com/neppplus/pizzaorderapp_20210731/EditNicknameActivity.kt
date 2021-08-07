package com.neppplus.pizzaorderapp_20210731

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)
        setupEvents()
        setValues()
    }

    fun setupEvents() {

        okBtn.setOnClickListener {

            val inputNickname = nicknameEdt.text.toString()

            val resultIntent = Intent()
            resultIntent.putExtra("newNickname", inputNickname)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()

        }

    }

    fun setValues() {

    }

}