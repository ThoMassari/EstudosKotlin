fun main() {
    var ganhador = 5

    while (ganhador < 10){
        println(ganhador)
       ganhador++ //sempre é necessário parar o loopin (se nao fizer, fica em um loopin infinito)
    }

    var nome = "Thomaz"
    for (caracter in nome){ //já sabe onde irá acabar
        println(caracter)
    }

    do {
        println("Executa pelo menos uma vez")
    } while(ganhador < 6)
}
