package Main

import Classes.Dolar
import Classes.Euro
import Classes.Real

var real: Real = Real()
var dolar: Dolar = Dolar()
var euro: Euro = Euro()
var cofrinho: Cofrinho = Cofrinho()
val listaMoedas = arrayOf(real, dolar, euro)

fun main(args: Array<String>) {
    var opcaoEscolhida: String

    println(listaMoedas[0].cotacao)
    println(listaMoedas[1].cotacao)
    println(listaMoedas[2].cotacao)

    while(true){
        printarcabecalho()
        print("Opção: ")
        opcaoEscolhida = readLine() ?: "0"

        when (opcaoEscolhida){
            "1" -> adicionarMoeda()         // função criada nesse arquivo
            "2" -> cofrinho.removerMoeda() // função criada em outra classe
            "3" -> listarMoedas()         // função para listar
            "4" -> converterParaReal()   // função para converter todos os valores para real, e listar
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
    println("Digite o nome da moeda para adicionar: \n- Dolar\n- Euro\n- Real")
    print("Opção: ")
    var opcao: String = readLine()?.trim()?.lowercase() ?: ""
    when (opcao){
        "real" -> {
            print("Valor: ")
            valor = retornaDouble(readLine() ?: "0.0")
            listaMoedas[0].atualizarDinheiro(valor)
        }
        "dolar" -> {
            print("Valor: ")
            valor = retornaDouble(readLine() ?: "0.0")
            listaMoedas[1].atualizarDinheiro(valor)
        }
        "euro" -> {
            print("Valor: ")
            valor = retornaDouble(readLine() ?: "0.0")
            listaMoedas[2].atualizarDinheiro(valor)

        }
        else -> {
            println("Inválido")
        }
    }
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

fun listarMoedas(){
    if (listaMoedas[0].quant <= 0.0) {
        println("SEM REAIS NA CARTEIRA")
    } else {
        println("Quantidade em reais: R$${listaMoedas[0].quant}")
    }
    if (listaMoedas[1].quant <= 0.0) {
        println("SEM DOLARES NA CARTEIRA")
    } else {
        println("Quantidade em dolar: R$${listaMoedas[1].quant}")
    }
    if (listaMoedas[2].quant <= 0.0) {
        println("SEM EUROS NA CARTEIRA")
    } else {
        println("Quantidade em euro: R$${listaMoedas[2].quant}")
    }
}

fun converterParaReal(){
    var quant: Double = (listaMoedas[0].quant * listaMoedas[0].cotacao) +
                        (listaMoedas[1].quant * listaMoedas[1].cotacao) +
                        (listaMoedas[2].quant * listaMoedas[2].cotacao)
    println(quant)
}

fun printarcabecalho(){
    println("_-'-_-'-_-'-_-'-_-'-_-'-_-'-_")
    println("Escolha a operação desejada:")
    println("1- Adicionar")
    println("2- Retirar")
    println("3- Listar")
    println("4- Listar em reais")
    println("5- Sair")
    println("_-'-_-'-_-'-_-'-_-'-_-'-_-'-_")
}
