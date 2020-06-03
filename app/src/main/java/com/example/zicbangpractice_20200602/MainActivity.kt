package com.example.zicbangpractice_20200602

import android.content.Intent
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

        //아이템이 눌리면
        roomListView.setOnItemClickListener { parent, view, position, id ->
            //clickedRoom은 roomArrayList의 포지션을 기준으로 받아옴.
            val clickedRoom = roomArrayList[position]

            val myIntent = Intent(mContext,ViewRoomDetailActivity::class.java)
            // 데이터값 하나하나 넘길수 없으니까. clickedRoom을 통째로 넘길수는 없을까?
            // 그냥 넣으면 에러남 왜냐.
            // 그냥 넣어버리면 Room 클래스라서 받을떄 getRoom..이런게 있을리 없잖아
            // 직접 만든 클래스를 putExtra 하려면 -> Serializable
            // 데이터 클래스 선언문에서 상속문 처럼 작성함.
            // class 클래스 이름 : Serializable(자동완성)
            myIntent.putExtra("roomData",clickedRoom)

            startActivity(myIntent)
            //activity_view_room_detail.xml 연다.

        }


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

