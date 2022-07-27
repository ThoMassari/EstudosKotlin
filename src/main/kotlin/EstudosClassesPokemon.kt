class Pokemon (var nome: String, var tipo: String, var vida: Int, var ataque: Int, var defesa: Int) :PokemonAgua, PokemonTerra {
    //var nome = ""
    //var tipo = ""
    //var vida = 10
    //var ataque = 2

    override
    fun ataqueTipoAgua(){

    }

   fun ataque(ataque: Int, pokemonatacado: Pokemon){

      // var pokemon1 = Pokemon("Charmander", "Fogo", 20, 4,2)
       //var pokemon2 = Pokemon ("Bubassauro", "Planta", 22, 3, 1)

       println("OH MEU DEUS, " + nome + " está atacando " + pokemonatacado.nome + " com sua força total." )
       println("${pokemonatacado.nome} possuia ${pokemonatacado.vida} pontos de vida.")
       pokemonatacado.defesa -= ataque - pokemonatacado.vida //vida = vida - ataque
       println("Após esse ataque, ${pokemonatacado.nome} ficou com ${pokemonatacado.defesa} pontos de via.")
   }

    override fun ataqueTipoTerra() {
        println("O pokemon atacou com o tipo terra")
    }

}

class Charmander (var nome: String, var tipo: String, var vida: Int, var ataque: Int, var defesa: Int) :PokemonTerra{
    override fun ataqueTipoTerra() {
        println("ataque tipo terra do charmander")
    }

}

fun main () {

    var pokemon1 = Pokemon("Charmander", "Fogo", 20, 4, 2)
    var pokemon2 = Pokemon ("Bubassauro", "Planta", 22, 3, 1)

    //var squirtle = PokemonAgua("Squirtle", "Agua", 15,5, 7)

    //var terra = PokemonTerra("Terra", "Terra", 15, 5, 7)
    var pokemon3 = Pokemon ("Squirtle", "Agua", 15,5, 7)

    var pokemon = Pokemon("ninetails", "fogo", 25,3,6)
    var charmander = Charmander("charmander", "fogo", 25,3,6)

    pokemon.ataqueTipoTerra()
    charmander.ataqueTipoTerra()

    pokemon3.ataqueTipoAgua()
    //squirtle.ataqueTipoAgua()

    //terra.ataqueTipoTerra()

    pokemon1.ataque(pokemon1.ataque, pokemon2)




}

interface PokemonTerra {
    fun ataqueTipoTerra()

}
interface PokemonAgua {
    fun ataqueTipoAgua()

}
