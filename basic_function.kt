fun getGreeting():String{   
    return "hello kotlin"
}

fun getName():String = "jason"

fun sayHello():Unit{
    println(getGreeting())
}

fun main(){
    println("hello world")
    println(getGreeting())
    sayHello()
    println(getName())
}
