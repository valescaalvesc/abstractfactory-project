package com.example.projeto;

public class FabricaDorama implements FabricaAbstrata{

    @Override
    public Pacote createPacote() {return new PacoteDorama();}

    @Override
    public Fatura createFatura() {return new FaturaDorama();}
}
