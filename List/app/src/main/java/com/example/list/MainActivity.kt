package com.example.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
fun main(){
    val array= arrayOf(1,2,3)
    // list value cant be changed, but we can create a mutablelist to do so
    val list = listOf(1,2,3)
    val mutableList = mutableListOf(1,2,3)

    //set 1 to 3
    array[0] = 3
    // change 2nd index of mutableList to 4
    mutableList[2] = 4
    // add 4 to the mutableList
    mutableList.add(9)
    println("9 will be added to mutableList...")
    println(mutableList)
    println("1 will be removed from mutableList...")
    mutableList.remove(1)
    println(mutableList)
    println("the 2nd index will be removed from mutableList...")
    mutableList.removeAt(2)
    println(mutableList)
}