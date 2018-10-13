package com.nju.yuq.weatherapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.find
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text="Hello kotlin !!" //这种语法必须引入 import kotlinx.android.synthetic.main.activity_main.*
        toast("Hello toast ") //这种写法需要调用Anko
        niceToast("nice Toast")

        //val forecastList=findViewById<RecyclerView>(R.id.forecast_list)
        val forecastList: RecyclerView = find(R.id.forecast_list) //anko method
        forecastList.layoutManager=LinearLayoutManager(this)

        //数据构造
        val items= listOf(
                "Mon 6/23 - Sunny - 31/17",
                "Tue 6/24 - Foggy - 21/8",
                "Wed 6/25 - Cloudy - 22/17",
                "Thurs 6/26 - Rainy - 18/11",
                "Fri 6/27 - Foggy - 21/10",
                "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
                "Sun 6/29 - Sunny - 20/7")
        //适配器绑定
        forecastList.adapter=ForecastAdapter(items);

    }

    fun niceToast(message:String,
                  tag:String=MainActivity::class.java.simpleName,
                  length:Int =Toast.LENGTH_SHORT){
            Toast.makeText(this,"[$tag] $message",length).show()
    }






}
