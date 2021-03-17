package one.digitalInnovation.collections

fun main() {

    val values = IntArray(5)

    values[0] = 4
    values[1] = 3
    values[2] = 7
    values[3] = 10
    values[4] = 19

    for (valor in values) {
        println(valor)
    }
    println("...........................")
    values.forEach { valor ->
        println(valor)
    }

    println("...........................")
    for (index in values.indices) {
        println(values[index])
    }

}

