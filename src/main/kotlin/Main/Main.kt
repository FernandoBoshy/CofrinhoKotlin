package Main

import Classes.Dolar
import Classes.Euro
import Classes.Real

var real: Real = Real()
var dolar: Dolar = Dolar()
var euro: Euro = Euro()
val listaMoedas = arrayOf(real, dolar, euro)

fun main(args: Array<String>) {

    var opcaoEscolhida: String

    while(true){
        println("Escolha a operação desejada:\n1-Adicionar\n2-Retirar\n3-Listar\n4-Listar em reais\n5-Sair")
        print("Opção: ")
        opcaoEscolhida = readLine() ?: "0"

        when (opcaoEscolhida){
            "1" -> adicionarMoeda()
            "2" -> println("2...")
            "3" -> println("3...")
            "4" -> println("4...")
            "5" -> {
                println("5...")
                break
            }
            else -> {
                println("inválido")
                break
            }
        }
    }
}

fun adicionarMoeda(){
    var valor: Double = 0.0
    println("Digite o nome da moeda desejada: \nDolar\nEuro\nReal")
    print("Opção: ")
    var opcao: String = readLine()?.trim()?.lowercase() ?: ""
    when (opcao){
        "dolar" -> println("dolar escolhido")
        "real" -> println("real escolhido")
        "euro" -> println("euro escolhido")
        else -> {
            println("Inválido")
        }
    }
    valor = retornaDouble(readlnOrNull().toString())

}

fun retornaDouble(valor: String): Double {
    try {
        valor.replace(",", ".")
        return valor.toDouble()
    } catch(e: NumberFormatException){
        println("Valor inválido. . .")
        return 0.0
    }
}
