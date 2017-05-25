/**
 * Created by ricar on 19/05/2017.
 */


fun main(args: Array<String>) {

    var arrayOfInts = intArrayOf(1,2,3,4,5,6,7)
    var  arrayOfStrings = arrayOf("Ricardo", "Pepe")
    var arrayOfNulls = arrayOfNulls<String>(5)
    arrayOfNulls[2] = "Ricardo"

    for (i in 1..6){
        println(i)
    }


    for (i in arrayOfStrings){
        println(i)
    }

    for (i in arrayOfInts){
        println(i)
    }

    for (i in arrayOfStrings.indices){
        println("el elemento en la posicion $i es ${arrayOfStrings[i]}")
    }

    for ((indice, valor) in arrayOfStrings.withIndex()){
        println("el elemento en la posicion $indice es $valor")
    }

    for ((indice, valor) in arrayOfNulls.withIndex()){
        println("el elemento en la posicion $indice es $valor")
    }
}