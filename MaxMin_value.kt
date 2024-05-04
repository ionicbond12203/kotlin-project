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

    val myMaxByteValue: Byte = Byte.MAX_VALUE
    val myMinByteValue: Byte = Byte.MIN_VALUE
    println("Byte maximum value is: $myMaxByteValue")   //127
    println("Byte minimum value is: $myMinByteValue")   //-128

    val myMaxShortValue:Short = Short.MAX_VALUE
    val myMinShortValue:Short = Short.MIN_VALUE
    println("Short maximum value is: $myMaxShortValue")
    println("Short minimum value is: $myMinShortValue")

    val myMaxLongValue:Long =Long.MAX_VALUE
    val myMinLongValue:Long = Long.MIN_VALUE
    println("Long maximum value is: $myMaxLongValue")
    println("Long minimum value is: $myMinLongValue")



}
