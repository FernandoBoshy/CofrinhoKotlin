package Classes

class Euro : Moedas {

    constructor(sigla: String, cotacao: Double, quant: Double) : super(sigla, cotacao, quant){
        this.sigla = sigla
        this.cotacao = 6.0
        this.quant = 0.0
    }

}