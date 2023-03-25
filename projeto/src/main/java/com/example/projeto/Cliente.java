package com.example.projeto;

public class Cliente {

    private Pacote pacote;
    private Fatura fatura;

    public Cliente (FabricaAbstrata fabrica) {
        this.pacote = fabrica.createPacote();
        this.fatura = fabrica.createFatura();
    }

    public String emitirPacote() {return this.pacote.emitir();}

    public String emitirFatura() {return this.fatura.emitir();}
}
