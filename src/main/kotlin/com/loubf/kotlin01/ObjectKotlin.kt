package com.loubf.kotlin01

/**
 * Created by loubinfeng on 2017/5/27.
 */
class Person(val name:String){

    init {
        println("$name is init")
    }

    fun printName(){
        println("name=$name")
    }
}

fun main(args:Array<String>){
    var p = Person("lili")
    p.printName()
}