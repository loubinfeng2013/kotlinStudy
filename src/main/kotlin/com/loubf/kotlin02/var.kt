package com.loubf.kotlin02

/**
 * Created by loubinfeng on 2017/5/27.
 *
 * kotlin变量
 */

fun main(args:Array<String>){
    var quantity = 5//var修饰变量,会自动判断为int类型
    val price : Double = 19.8 //val修饰常量,声明为Double类型
    val name : String = "hello kotlin"

    println("price:$price")
    println("quantity:$quantity")
    println("name:$name total:${quantity * price}")
}
