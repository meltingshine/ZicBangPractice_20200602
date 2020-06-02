package com.example.zicbangpractice_20200602.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.example.zicbangpractice_20200602.datas.Room

class RoomAdapter(context: Context, resId: Int, list: List<Room>){

    val roomAdapater = ArrayAdapter<Room> (context, resId, list)


}