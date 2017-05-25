/**
 * Created by ricar on 18/05/2017.
 */

fun main(args: Array<String>) {

    val x = 7
    val y = 2
    val z = maximo(x, y)
    println("el valor maximo es $z")


}

fun maximo(a:Int, b:Int):Int{

    //If en kotlin muy parecidos a java se deben poner{} si hay mas de una linea
    if (a > b)
        return a
    else
        return b
}