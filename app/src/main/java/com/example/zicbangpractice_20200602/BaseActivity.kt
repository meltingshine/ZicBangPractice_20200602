package com.example.zicbangpractice_20200602

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity {

        val mContext = this

        abstract fun setupEvents()
        abstract fun setupValues()


}