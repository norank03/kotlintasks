package com.example.myapplication4

fun main()
{
    val games = arrayOf("board","video","chess","cards","uno")
    games[3]="piano"
    val newgames: MutableList<String> = mutableListOf()
    for(i in games)
    newgames.add(i)
    newgames.add("violin")
    newgames.add("guitar")
println(newgames)

}
