fun main(){
    var llista: MutableList<String> = mutableListOf("un","dos","tres")
    try {
        println("${llista[8]}")
    } catch (e: IndexOutOfBoundsException) {
        println("Missatge de l'error: ${e.message}")
        e.printStackTrace()
    }
    println("El programa segueix per aquí")
}
