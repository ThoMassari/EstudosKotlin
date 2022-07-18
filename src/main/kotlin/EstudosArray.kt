fun main() {
    var cores = arrayListOf<String>("amarelo", "verde", "azul") //uma variável com vários elementos
    cores.add("ahuhauahua")
    cores.remove("amarelo")
    println(cores)

    cores.forEach(){//imprime os ítens separados do array
        println(it)
    }
}