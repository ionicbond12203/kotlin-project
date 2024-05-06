val name:String= "ionic"
var greeting:String?="hello" // put ? after data type, hence we can use null value
var is_eating:Boolean = true
var World: String = "Netherlands"

fun main(){
    println(greeting)
    println(name)
    //greeting = null
    println(greeting)
    println(name)

    //if statement
    if(greeting != null){
        println("greeting is not null")
    }
    else{
        println("greeting is null")
    }

    //when statement = switch statement in java
    when(is_eating){
        true -> println("you are eating")
        else -> println("your not eating")
    }
    when(World){
        "Netherlands" ->println("welcome to netherlands")
        "UK" ->println("welcome to united kingdom")
        "france" ->println("bonjour, welcome to france")
        else -> println("you can decided later")
    }
}
