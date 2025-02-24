import java.util.*

/**
 * 1. Programar una classe que divideixi dos números sencers demanats a
 * l'usuari per teclat i mostri per pantalla el resultat (farem servir aritmètica entera).
 * Capturar un possible error de conversió de cadena a número (excepció NumberFormatException),
 * en aquest cas cal convidar a l'usuari a introduir de nou el número.
 * Capturar també la possible divisió entre zero (excepció ArithmeticException)
 * informant a l'usuari de l'error.
 * Cal llegir les dades per teclat tal com s’indica a continuació per a generar l'excepció
 * NumberFormatException:
 * num = Integer.parseInt(scan.next())
 */
fun main(){
    Exercici1()
}

fun Exercici1() {
    val scan: Scanner = Scanner(System.`in`)
    var num1: Int = 0
    var num2: Int = 0
    var divisio: Int = 0

    try{
        num1 = Integer.parseInt(scan.next())
    }catch (nfe: NumberFormatException){
        println(nfe.message)
        println(nfe.stackTraceToString())
        println(nfe.toString())
    }

    try{
        num2 = Integer.parseInt(scan.next())
    }catch (nfe: NumberFormatException){
        println(nfe.message)
        println(nfe.stackTraceToString())
        println(nfe.toString())
    }


    try {
        divisio = num1 / num2
    }catch (ae: ArithmeticException){
        println("Avís, ha succeït això: ${ae.message}")
        divisio = 0
    }

    println(divisio)
}
