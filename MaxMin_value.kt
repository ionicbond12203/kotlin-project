fun main(){

    var name: String = "ionic"
    println(name);
    val age:Int = 8 //cannot change the value of val
    println("$name is $age years old")
    name = "hello world"
    println(name)
    var number: Int= 22
    val maxIntegerValue:Int =Int.MAX_VALUE
    val minIntegerValue:Int =Int.MIN_VALUE

    println("Int maximun value is: $maxIntegerValue")
    println("Int minimun value is: $minIntegerValue")

    number = 2147483647 //more than this number causing error
    println(number);



}
