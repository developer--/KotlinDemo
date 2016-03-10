package com.myproject.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.kittinunf.fuel.Fuel

/**
 * Created by Jemo on 3/10/16.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getResponse("http://httpbin.org/get")
    }


    fun getResponse(URL: String) {
        Fuel.get(URL).responseString { request, response, result ->
            result.fold({ success ->
                println(response.toString())
            }, { error ->
                println("error")
            })
        }

    }
}