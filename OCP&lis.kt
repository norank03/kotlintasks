package com.example.myapplication4
/*open closed principle says that the class should be opened for extention and not
* for modification this class also implements liskouv principles*/
interface  Fruits
{
    fun iseatable (type :String):Boolean

}

class strawberries (val type :String) :Fruits
{
    override fun iseatable(type: String): Boolean {
        println("eat without knife")
        return true
    }
}


class apples (val type :String) :Fruits
{
    override fun iseatable(type: String): Boolean {
        println("eat with knife")
        return true
    }
}
