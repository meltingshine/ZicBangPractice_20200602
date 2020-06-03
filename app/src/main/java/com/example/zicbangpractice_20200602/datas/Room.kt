package com.example.zicbangpractice_20200602.datas

import java.io.Serializable
import java.text.NumberFormat
import java.util.*

class Room (val price:Int, val address:String, val floor:Int, val description: String) : Serializable
{
    fun getFormattedPrice() : String {
        if(this.price < 10000){
            //NumberFormat.getNumberInstance(Locale.US).format(35634646));


            return NumberFormat.getNumberInstance().format(this.price)

        }
        else{

            //int끼리의 나눗셈은 나머지를 버린다.

            val uk = this.price / 10000
            val remainder = this.price % 10000 // 나머지를 구하는 것
            return "${uk}억 ${NumberFormat.getNumberInstance().format(remainder)}"
        }

    }
//    멤버변수로 들어온거에는 this 붙여주고 클래스 내에서 만든건 그냥 써준다.
    fun getFormmatedFloor() : String {
        if (this.floor > 0) {
            return "${this.floor}층"
        } else if(this.floor == 0) {
            return "반지하"
        } else {
            return "지하 ${this.floor *-1}층"
        }
    }
}