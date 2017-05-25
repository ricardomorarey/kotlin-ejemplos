/**
 * Created by ricar on 18/05/2017.
 */

fun main(args: Array<String>) {

    val x = 3
    val y = 2

    val resultado = suma(x, y)
    val resta = resta(x, y)
    val multiplicacion = multiplicacion(primernumero = x, segundonumero =y)
    println(resultado)
    println(resta)
    println(multiplicacion)
    suma2(x, y)
    suma3(x, y)
    suma4(primernumero = 6)

}

fun suma(x:Int, y:Int):Int {

    return x + y
}

//si nuestro metodo no devuelve nada se pone unit
fun suma2(x:Int, y:Int):Unit {

    println(x + y)
}
//Tambien se puede quitar el unit(equivalente a void en java)
fun suma3(x:Int, y:Int){
    println(x + y)
}

//valores por defecto pasados en el agumento
fun suma4(primernumero:Int, segundonumero:Int = 0){
    println(primernumero + segundonumero)
}



//si nuestra funcion solo tiene una expresion se puede poner asi de abreviado

fun resta(x:Int, y:Int) = x - y

//named argumentes se usan par que quede mas claro cual es el parametro que paso

fun multiplicacion(primernumero:Int, segundonumero:Int):Int{

    return primernumero * segundonumero
}

