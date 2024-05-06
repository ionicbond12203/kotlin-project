fun main(){
    val country = listOf("UK","USA","JP","korea")
    country.forEach{
        country-> println(country)
    }
   
    println()
    val map = mapOf(1 to "a",2 to "b",3 to "c")
    map.forEach{key,value->println("$key->$value")}
}
