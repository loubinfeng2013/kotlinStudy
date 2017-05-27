package com.loubf.kotlin02

/**
 * Created by loubinfeng on 2017/5/27.
 *
 * 关键字when使用，相当于java中的switch，但是比之强大很多，可以比较任意类型
 */

fun main(vararg args: String){
    cases(1)
    cases("hello")
    cases(19.8)
    cases(true)
    cases("3344")
}

fun cases(obj:Any){
    when(obj){
        1           -> println("is 1")
        "hello"     -> println("is hello")
        is Double   -> println("is Double")
        !is String  -> println("is not string")
        else        -> println("not match")
    }
}

