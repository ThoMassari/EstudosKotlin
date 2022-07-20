fun main() {
    println(max(100,10))
    println(max1(100,10))
}

// Corpo de Bloco

fun max (a: Int, b:Int) :Int {
    return if (a > b) a else b
}

// Corpo de Expressão

fun max1 (a:Int, b:Int) = if (a > b) a else b