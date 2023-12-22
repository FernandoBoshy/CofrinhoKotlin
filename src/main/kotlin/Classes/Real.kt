package Classes

class Real : Moedas {

    constructor(sigla: String, cotacao: Double, quant: Double) : super(sigla, cotacao, quant) {
        this.sigla = sigla
        this.cotacao = cotacao
        this.quant = quant
    }
}