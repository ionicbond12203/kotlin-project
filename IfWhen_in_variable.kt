//use "if" and "when" expression to assign value to local variable

val name = "ionic"
var greeting:String? = null
fun main(){

    //greeting = "hahaha"   //uncomment to see result
    val greetingToPrint = if(greeting != null) greeting else "Hello"

    println(greetingToPrint)
    println(name)

    //when expression

    val is_Authorize:Boolean = true //change the value to false

    val condition = when(is_Authorize){
        true->"access approve" //this value will put into "condition" if "condition" is true
        else->"access denied"  //this value will put into "condition" if "condition" is not true
    }
    println(condition)
}
