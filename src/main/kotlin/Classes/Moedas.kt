package Classes

open class Moedas {

    val sigla: String = ""
    val cotacao: String = ""
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
}