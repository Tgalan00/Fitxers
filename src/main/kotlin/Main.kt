import java.io.File
import java.io.IOException

fun multiplicarTaules() {

    val numeros = listOf<Int>(1, 2, 3, 4, 5, 6, 8, 9, 10)

    val file = File("taules.txt").bufferedWriter()
    file.use {

        for (tabla in 1..10) {
            val string = "Taula $tabla\n"
            it.write(string)
            for (i in numeros) {
                val operacio = tabla * i
                val string2 = "$tabla * $i = $operacio\n"
                it.write(string2)
            }

        }


    }


}

fun llegirtaula()  {

    val file = File("taules.txt").bufferedReader()

    try {
        file.use {
            it.forEachLine { line ->
                println(line)
            }
        }
    } catch (e: IOException) {
        println("Error al leer el archivo: ${e.message}")
    }


}

fun main() {

    llegirtaula()
}
