val name ="nate"
var greeting:String? = null
var ProLang:String = "kotlin"
var MyLong:Long = Long.MAX_VALUE
var MyShort:Short =Short.MAX_VALUE
var MyByte:Byte =Byte.MAX_VALUE
var MyInt:Int =Int.MAX_VALUE


fun main(){
    greeting = "hello world"
    when(greeting){
        null -> println("hi")
        else -> println(greeting)
    }
    println("jason")


    if(ProLang=="kotlin"){
        println("welcome to the world of kotlin")
    }
    else{
        println("c++ is best programming language")
    }

    val datatypes= arrayOf(MyLong,MyByte,MyInt,MyShort)
    for(datatype in datatypes){
        println(datatype)
    }
    println()
}
