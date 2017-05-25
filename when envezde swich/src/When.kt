/**
 * Created by ricar on 18/05/2017.
 */
fun main(args: Array<String>) {
    
    val valor = 5
    justo(valor)
}

fun  justo(valor:Int) {

    when (valor){

        1-> println("es demasiado bajo  $valor ")
        5-> println("es justo  $valor ")
        10-> println("es demasiado alto  $valor ")
    }

}
