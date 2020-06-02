package com.example.zicbangpractice_20200602.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import com.example.zicbangpractice_20200602.R
import com.example.zicbangpractice_20200602.datas.Room

class RoomAdapter(context: Context, resId: Int, list: List<Room>) : ArrayAdapter<Room>(context,resId,list){

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.room_list_item, null)
        }
        val row = tempRow!!
        return row

    }
}