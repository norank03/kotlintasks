package com.example.myapplication4

fun issecure(pass:String):Boolean= pass.length>=10
fun issamelength(pass:String,pass2:String):Boolean=pass.length==pass2.length

fun main() {
    val re="hjajajajaa"
    val re2="hjjdkdj"

    println(issecure(re))
    println(issamelength(re,re2))


}
