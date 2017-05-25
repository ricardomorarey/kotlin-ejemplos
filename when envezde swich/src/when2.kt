/**
 * Created by ricar on 19/05/2017.
 */
fun main(args: Array<String>) {

    val valor = -1
    justovalor(valor)
}

fun  justovalor(valor:Int) {
//vamos a utilizar algo llamado rangos in valor..valor y negacion de estos !in el resto igual
    when (valor){

        in 0..4 -> println("es demasiado bajo  $valor ")
        5 -> println("es el precio justo  $valor ")
        in 6..10 -> println("es demasiado alto  $valor ")
        //!in 0..10 -> println("esta fuera del rango  $valor ") hace lo mismo que el de abajo
        else -> println("no reconozco el valor $valor ")

    }

}