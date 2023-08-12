/* implements  Dependency Inversion Principle (DSP)   Interface Segregation Principle (ISP)*/

package com.example.myapplication4

interface fruits
{

    fun eatable():Boolean

}

interface fruitsalty
{
    fun salty():Boolean


}

interface fruitsugary
{
    fun sugar():Boolean


}

class ispCarrots:fruitsalty ,fruits {
    override fun salty():Boolean=true
    override fun eatable(): Boolean =true
}

class ispApples:fruitsugary ,fruits {
    override fun sugar(): Boolean = true

    override fun eatable(): Boolean =true
}
