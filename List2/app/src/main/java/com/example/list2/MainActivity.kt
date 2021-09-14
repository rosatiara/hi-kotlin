package com.example.list2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
fun main(){
    val list = mutableListOf<Int>()
    for (i in 1..10){
        val x = readLine()?.toInt()
        if (x!=null) {
            list.add(x)
        }
    }
    println(list)
}