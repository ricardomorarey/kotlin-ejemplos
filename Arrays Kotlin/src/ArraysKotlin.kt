/**
 * Created by ricar on 19/05/2017.
 */
fun main(args: Array<String>) {

    var arrayOfStrings = arrayOf("Ricardo", "Aldo", "Pepe")
    //tambien se puede especificar el tipo pero no suele hacer falta kotlin lo coge
    var arrayOfStrings2:Array<String> = arrayOf("Ricardo2", "Aldo2", "Pepe2")
    // Si tubiesemos una clase Perro
    //var arrayOfPerro:Array<Perro> = arrayOf(perro1, perro2,perro3)
    var arrayOfInt:IntArray = intArrayOf(1, 2, 3, 4, 5)
    var arrayOfBooleans:BooleanArray = booleanArrayOf(true, false, true)
    var arrayOfNulls = arrayOfNulls<String>(5)

    //Para obtener datos como son objetos con get y set
    println(arrayOfInt.get(0))
    println(arrayOfBooleans.get(0))
    println(arrayOfStrings.get(0))
    println(arrayOfStrings[2])
    arrayOfStrings.set(0,"cambio1")
    arrayOfStrings[0] = "cambio2"
    println(arrayOfStrings.get(0))
    println(arrayOfNulls.get(0))
    arrayOfNulls[0] = "Udemy"
    println(arrayOfNulls.get(0))


}

class Perro {

    val perro1 = 1
    val perro2 = 2
    val perro3 = 3

}
