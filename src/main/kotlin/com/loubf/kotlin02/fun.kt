package com.loubf.kotlin02

/**
 * Created by loubinfeng on 2017/5/27.
 *
 * 函数
 */

/**
 * 一般函数声明
 */
fun say(str:String):String{
    return str
}

/**
 * 简写1
 */
fun say2(str:String):String = "str"

/**
 * 简写2，一般如果不写返回值默认是Unit类型，相当于java中的void
 * 如果返回时Int类型,在简写时也可以不写返回值类型
 */
fun getIntValue(value:Int):Int = value
fun getIntValue2(value:Int) = value

/**
 * 函数默认参数
 */
fun getName(firstName:String = "lou",lastName:String= "feng"){
    println("$firstName $lastName")
}

/**
 * kotlin中可变参数用vararg修饰
 */
fun main(vararg args:String){
    getName("chen")
}
