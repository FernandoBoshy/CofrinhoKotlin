package Classes

class Euro : Moedas(, 6.0, 0.0) {
    constructor() : super(sigla, cotacao, quant){
        this.sigla = sigla
        this.cotacao = cotacao
        this.quant = quant
    }

}