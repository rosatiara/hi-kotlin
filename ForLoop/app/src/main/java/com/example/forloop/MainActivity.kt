package com.example.forloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
fun main(){
    print("enter a number:")
    var num = readLine()?.toInt()
    println("let's count from $num down to 0")

    while(num != null && num >=0){
        println(num)
        num--
    }
}
