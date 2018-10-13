package com.nju.yuq.weatherapp
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

class ForecastAdapter(val items : List<String>) : RecyclerView.Adapter<ForecastAdapter.ViewHolder>() {

    //创建ViewHolder
    override fun  onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        return ViewHolder(TextView(parent.context))
    }
    //为每个ViewHolder绑定数据
    override fun onBindViewHolder(p0: ForecastAdapter.ViewHolder, p1: Int) {
        p0.textView.text = items[p1]
    }
    //返回条目个数
    override fun getItemCount(): Int = items.size
    //自定义ViewHolder  这里可以定义一些特殊格式
    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}