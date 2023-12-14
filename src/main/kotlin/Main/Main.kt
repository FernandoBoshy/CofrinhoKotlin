package Main

import Classes.Dolar
import Classes.Euro
import Classes.Real

fun main(args: Array<String>) {
    var opcaoEscolhida: String
    var dolar: Dolar = Dolar()
    var real: Real = Real()
    var euro: Euro = Euro()
    val listaMoedas = arrayOf(dolar, real, euro)

    while(true){
        println("Escolha a operação desejada:\n1-Adicionar\n2-Retirar\n3-Listar\n4-Listar em reais\n5-Sair")
        print("Opção: ")
        opcaoEscolhida = readLine() ?: "0"
        when (opcaoEscolhida){
            "1" -> println("1...")
            "2" -> println("2...")
            "3" -> println("3...")
            "4" -> println("4...")
            "5" -> println("5...")
            else -> {
                println("inválido")
                break
            }
        }
    }
}