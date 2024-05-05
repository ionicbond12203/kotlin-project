fun sayHello(greeting:String, itemToGreet:String) = println("greeting $itemToGreet")

fun main(){
    //define an array
    val interestingThings = arrayOf("Kotlin", "programming", "Comic Books")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    println()
    //for loop
    for(interestingThing in interestingThings){
        println(interestingThing)
    }
    println()

    //forEach
    interestingThings.forEach{
        println(it)
    }
    println()

    //
    interestingThings.forEach{interestingThings->
        println(interestingThings)

    }
    println()

    //
    interestingThings.forEachIndexed{index, interestingThing->
        println("$interestingThing is a index $index")
    }




}
