
import java.io.File
import java.io.FileNotFoundException
import java.io.IOException

fun main() {
    try {
        val file = File("./txt/arxiu.txt")

        println("Contingut inicial:")
        file.forEachLine { println(it) }

        file.appendText("hola que tal\n")

        println("Contingut final:")
        file.forEachLine { println(it) }
    }catch (fnfe: FileNotFoundException) {
        print(fnfe.message)
    }catch (ioe: IOException){
        print(ioe.message)
    }catch(e: Exception){
        print("ERROR: Fatal ERROR. Error no tractat")
    }
}
