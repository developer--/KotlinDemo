package com.myproject.kotlindemo.kotlin.http

import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.android.extension.responseJson
import com.github.kittinunf.fuel.core.Manager

/**
 * Created by Master on 3/10/16.
 */
class KotlinHTTP {


    fun getResponce(URL: String) {
        Fuel.get("http://httpbin.org/get").responseString { request, response, result ->
            //do something with response
            result.fold({ d ->
                //do something with data

            }, { err ->
                //do something with error
            })
        }

    }


    infix fun Int.shl(x:Int):Int {
        return x+2;
    }



}
