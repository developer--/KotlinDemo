package com.myproject.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import org.jetbrains.anko.async
import org.jetbrains.anko.longToast
import org.jetbrains.anko.uiThread
import java.net.URL

/**
 * Created by Jemo on 3/10/16.
 */
open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val url = "http://httpbin.org/get"
//        var kotlinHTTP = KotlinHTTP()
//        kotlinHTTP.getResponse(url).toString()
//
//        println("1111 ")

        async() {
            val result = URL(url).readText()
            uiThread {
                Log.d("Request", result)
                longToast("Request performed")
            }
        }
    }


}