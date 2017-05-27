package com.loubf.kotlin02

/**
 * Created by loubinfeng on 2017/5/27.
 *
 * is关键字,相当java中的instanceof(智能类型推测)
 */
fun main(vararg args:String){
    var length = getStringLength("1233")
    println("length is $length")
    length = getStringLength(true)
    println("length is $length")

}

fun getStringLength(obj : Any):Int?{
    if (obj is String)
        return obj.length

    if (obj !is String)
        println("$obj is not String")
    return null
}
