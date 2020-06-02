package com.example.zicbangpractice_20200602.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.TextView
import com.example.zicbangpractice_20200602.R
import com.example.zicbangpractice_20200602.datas.Room
import org.w3c.dom.Text
import kotlin.math.floor

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

        //일단 변수 값 넣어주는거지 여기서 들어가는건 아니다.
        //변수에다가 TextView 이름을 갖다 넣어준거 앞으로는 변수에 넣으면 그 TextView에도 들어감

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val descTxt = row.findViewById<TextView>(R.id.descTxt)

        val data = mList[position]


        // 데이터를 어떻게 갖고 와야 해야하나...

        descTxt.text = data.description

        priceTxt.text = data.getFormattedPrice()

        addressAndFloorTxt.text = "${data.address}, ${data.getFormmatedFloor()}"


        return row

    }
}