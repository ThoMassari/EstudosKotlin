fun main() {

    //exercício 01
    val nome = "Diogo"
    for (caracter in nome)
        println(caracter)

    //exercício 02

    val pokemons = arrayListOf<String>("Eevee", "Pikachu", "Dragonite", "Charizard", "Ninetales", "Dragonair", "Vaporeon", "Gyarados", "Mewtwo", "New")
    println(pokemons.first()) //perguntar como imprimir tudo junto
    println(pokemons.last())
    println(pokemons[9])

    //exercicios 03

    println(pokemons)

    pokemons.forEach(){
    println(it)
    }

    //exercicios 03

    pokemons.remove("Mewtwo")
    println(pokemons)

    pokemons.forEach(){
        println(it)
    }

    pokemons.add("Bulbassaur")
    println(pokemons)

    pokemons.forEach(){
        println(it)
    }


}




