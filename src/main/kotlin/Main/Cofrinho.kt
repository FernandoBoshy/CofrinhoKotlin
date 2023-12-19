package Main

class Cofrinho (){
    fun removerMoeda(){
        var valor: Double = 0.0
        println("Digite o nome da moeda para remover: \n- Dolar\n- Euro\n- Real")
        print("Opção: ")
        var opcao: String = readLine()?.trim()?.lowercase() ?: ""
        when (opcao){
            "real" -> {
                print("Valor: ")
                valor = retornaDouble(readLine() ?: "0.0")
                if (listaMoedas[0].quant < valor){
                    println("Valor acima da quantidade contida no cofre. Remover mesmo assim? \ndigite 1 para confirmar\n-> ")
                    var x: String = readLine() ?: "0"
                    if (x == "1"){
                        valor = listaMoedas[0].quant
                        listaMoedas[0].retirarDinheiro(valor)
                    }
                } else{
                    listaMoedas[0].retirarDinheiro(valor)
                }
            }
            "dolar" -> {
                print("Valor: ")
                valor = retornaDouble(readLine() ?: "0.0")
                if (listaMoedas[1].quant < valor){
                    println("Valor acima da quantidade contida no cofre. Remover mesmo assim? \ndigite 1 para confirmar\n-> ")
                    var x: String = readLine() ?: "0"
                    if (x == "1"){
                        valor = listaMoedas[1].quant
                        listaMoedas[1].retirarDinheiro(valor)
                    }
                } else{
                    listaMoedas[1].retirarDinheiro(valor)
                }
            }
            "euro" -> {
                print("Valor: ")
                valor = retornaDouble(readLine() ?: "0.0")
                if (listaMoedas[2].quant < valor){
                    println("Valor acima da quantidade contida no cofre. Remover mesmo assim? \ndigite 1 para confirmar\n-> ")
                    var x: String = readLine() ?: "0"
                    if (x == "1"){
                        valor = listaMoedas[2].quant
                        listaMoedas[2].retirarDinheiro(valor)
                    }
                } else{
                    listaMoedas[2].retirarDinheiro(valor)
                }
            }
            else -> {
                println("Inválido")
            }
        }
    }
}