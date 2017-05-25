/**
 * Created by ricar on 22/05/2017.
 */

fun main(args: Array<String>) {

    var a:String?= "Ricardo"
    // en kotlin tenemos que declarar una variable como nullable se puede forzar con !! pero entonces habra null pointer exception como en java
    //para declarararla como nullable se pone el tipo y ? si no le pngo esto me da error de compilacion
    //para que me deje compilar con el print ln añadou if
    a = null

    if (a==null)println(0)else println(a.length)

    //segunda forma de hacerlo con ?
    var b:String? = "Pepe"
    b = null

    println(b?.length)

    //tercera forma nada recomendable hay null point exaception
    var c:String? = "Pepe"
    c = null

    println(c!!.length)
}