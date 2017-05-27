package com.loubf.kotlin02

/**
 * Created by loubinfeng on 2017/5/27.
 *
 * 关键字in的使用
 * in可以判断是否在区间内，也可以用于遍历集合数组
 */

fun main(vararg args : String){
    var x = 1
    var names = arrayOf("lili","lucy","black")
    //判断变量是否在区间内
    if (x in 1..5)
        println("ok")
    if (x !in 5..10)
        println("out")
    if ("lili" in names) {
        print("lili in ")
        names.map(::print)
        println()
    }

    //遍历打印
    for (x in 1..5)
        println(x)

    for (name in names)
        println(name)

}
