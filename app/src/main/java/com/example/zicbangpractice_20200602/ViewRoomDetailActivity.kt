package com.example.zicbangpractice_20200602

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zicbangpractice_20200602.datas.Room
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : BaseActivity() {

    lateinit var mRoom:Room  // Room이라는 클래스(?)로 선언한거

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)
    }

    override fun setupEvents() {
        //Serializable로 한걸로 데이터로 뽑아보자
        mRoom = intent.getSerializableExtra("roomData")as Room //Room으로 받아오자
        descTxt.text = mRoom.description //descTxt 고를때 잘 골라야함.

    }

    override fun setValues() {

    }

}
