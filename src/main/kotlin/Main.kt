fun main() {

    //Exercício 01
var nome = "Thomaz"
    olaNome(nome)

    //Exercício 02
    somaDoisNumeros (1.3,1.2)

    //Exercício 03
    val idade = 50
    recebeIdade(idade)


    //Exercício 04
    var idadeFutura = idadeMaisVinteCinco(idade)
    println(idadeFutura) //imprimi somente para conferência

    //Exercício 05
    if (idadeFutura >=65){
        println("$nome, daqui a 25 anos, estará aposentado")
    } else {
        println("Você não terá idade para aposentadoria")
    }

    //Exercício 06

    val nota1 = 8.0
    val nota2 = 8.0
    val nota3 = 8.0
    val nota4 = 8.0
    val nota5 = 5.0
    mediaNotas(nota1, nota2, nota3, nota4, nota5)


    //Exercício 07

    var recebeMedia = retornoMediaNotas(nota1, nota2, nota3, nota4, nota5)


    if (recebeMedia >= 7.5){
        println("Aluno Aprovado")
    } else {
        println("Aluno Reprovado")
    }

    //Exercício 08
    //var num3 = 3.3
    //triploNumero(num3)
    triploNumero(3.3)


    //Exercício 09
    var salarioAno = salarioAnual(2000.00)
    println(salarioAno) //somente para conferência

    //Exercício 10
    var salarioMaisDecimoTerceiro = salarioDecimoTerceiro(salarioAno)
    println(salarioMaisDecimoTerceiro)

    //Exercício 11
    println(((salarioAno/12)*73)/100)
    println(((salarioMaisDecimoTerceiro)*73)/100)

    //Exercício 12
    if (salarioMaisDecimoTerceiro >= 20000.00){
        println("O leão te pegou!")
    } else {
        println("Você escapou!")
    }



    //Desafio

    var nomeDesafio = "Thomaz"
    var senhaDesafio = 10203040

    if (nomeDesafio === "Diogo" && senhaDesafio === 10203040){
        println("Usuário Liberado")
    } else {
        println("Usuário ou senha inválidos")
    }

}

//Exercício 01
fun olaNome (nome:String) {
    println("Olá,$nome") // Template String
    println("Olá," + nome) //Concatenação
}

//Exercício 02
fun somaDoisNumeros (num1:Double, num2:Double) {
    println(num1 + num2)
}

//Exercício 03
fun recebeIdade (idade:Int){
    println(idade)
}

//Exercício 04
fun idadeMaisVinteCinco (recebeIdade:Int):Int{
    return recebeIdade + 25
}

//Exercício 06
fun mediaNotas (nota1:Double, nota2:Double, nota3:Double, nota4:Double, nota5:Double){
    println((nota1+nota2+nota3+nota4+nota5)/5)
}

//Exercício 07
fun retornoMediaNotas (nota1:Double, nota2:Double, nota3:Double, nota4:Double, nota5:Double) :Double{
    return (nota1+nota2+nota3+nota4+nota5)/5
}

//Exercício 08
fun triploNumero(num3: Double){
    println(num3 * 3)
}

//Exercício 09
fun salarioAnual(salariomensal: Double) :Double{
    return salariomensal * 12
}

fun salarioDecimoTerceiro (salarioAnual:Double) :Double{
    return salarioAnual +  salarioAnual/12
}