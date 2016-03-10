package com.myproject.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.kittinunf.fuel.Fuel
import com.myproject.kotlindemo.kotlin.http.KotlinHTTP
import java.util.concurrent.Callable
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread

/**
 * Created by Jemo on 3/10/16.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val url = "http://httpbin.org/get"
        var kotlinHTTP = KotlinHTTP()
        kotlinHTTP.getResponse(url).toString()

        println("1111 ")
    }


}