package com.example.myapplication4
/* Each class should have one responsiblity which will help in modification and dependence
* of the class and that is from my point of view
* */
 class  SRP_Mail(val  E:String ,val P:String){
 val email:String ="Nouran_Khaled"
    val Pass:String ="NouranELbadry"

    fun isAuthinticate ():Boolean=this.email==E&&this.Pass==P

}

fun main()
{
   val pre =SRP_Mail("Non","1233")
    println(pre.isAuthinticate())
}
