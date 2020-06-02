package com.example.zicbangpractice_20200602

import android.os.Bundle
import com.example.zicbangpractice_20200602.adapters.RoomAdapter
import com.example.zicbangpractice_20200602.datas.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
//
//    val rooms = ArrayList<Room>()
//    lateinit var roomAdapter : RoomAdapter

    val roomArrayList = ArrayList<Room>()
    lateinit var myAdapater: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

//        studentAdapter = StudentAdapter(mContext,R.layout.student_list_item,students)
//        studentListView.adapter = studentAdapter

    }

    override fun setupEvents() {

    }

    override fun setValues() {
        addRooms()
        myAdapater = RoomAdapter(mContext,R.layout.room_list_item,roomArrayList)
        roomListView.adapter = myAdapater
    }

    fun addRooms(){
        roomArrayList.add(Room(7500,"마포구 서교동",3,"마포구 서교동 3층 방입니다"))
        roomArrayList.add(Room(78000,"마포구 서교동",4,"마포구 서교동 4층 방입니다"))
        roomArrayList.add(Room(3000,"마포구 서교동",35,"마포구 서교동 35층 방입니다"))
        roomArrayList.add(Room(20500,"마포구 망원동",1,"마포구 망원동 1층 방입니다"))
        roomArrayList.add(Room(11000,"마포구 망원동",0,"마포구 망원동 반지하 방입니다"))
        roomArrayList.add(Room(5000,"마포구 망원동",-1,"마포구 망원동 지하1층 방입니다"))
        roomArrayList.add(Room(88000,"마포구 성산동",77,"마포구 성산동 77층 방입니다"))
        roomArrayList.add(Room(34300,"마포구 성산동",5,"마포구 성산동 5층 방입니다"))
        roomArrayList.add(Room(7500,"마포구 성산동",-4,"마포구 성산동 지하4층 방입니다"))
        roomArrayList.add(Room(6800,"마포구 성산동",0,"마포구 성산동 반지하 방입니다"))
    }
            
//        rooms.add(Room("1234","떙땡동","-1","조아요조아요너무조아요"))
//        rooms.add(Room("1343434","떙땡동","-1","조아요조아요너무조아요"))
//        roomAdapter = RoomAdapter(mContext,R.layout.room_list_item,rooms)
//        roomListView.adapter = roomAdapter
}

