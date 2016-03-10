package com.myproject.kotlindemo.kotlin.http

import com.github.kittinunf.fuel.Fuel

/**
 * Created by Master on 3/10/16.
 */
class KotlinHTTP {


    fun getResponse(URL: String) {
        Fuel.get(URL).responseString { request, response, result ->
            result.fold({ success ->
                println(response.toString())
            }, { error ->
                println("error")
            })
        }
    }


    //extension function
    infix fun Int.shl(x:Int):Int {
        return x+2
    }

}
