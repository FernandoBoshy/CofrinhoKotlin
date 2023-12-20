package Classes

abstract class Moedas(sigla: String,cotacao: Double, quant: Double) {

    constructor(moedas: Moedas) : this(moedas.sigla, moedas.cotacao, moedas.quant)

    var sigla: String = ""
    var cotacao: Double = 0.0
    var quant: Double = 0.0

    fun atualizarDinheiro(valor: Double){
        if (valor <= 0.0){
            println("Não aceita valores negativos, nem valor Zero.")
        }
        else {
            quant += valor
        }
    }
    fun retirarDinheiro(x: Double){
        var valor = x
        if (valor == 0.0){
            println("Não aceita valor Zero")
        }
        else {
            if(valor < 0.0){
                valor *= -1.0
            }
            quant -= valor
        }
    }

    fun retornaQuant(){

    }
}
