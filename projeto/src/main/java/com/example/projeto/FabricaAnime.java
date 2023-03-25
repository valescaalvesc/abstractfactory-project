package com.example.projeto;

public class FabricaAnime implements FabricaAbstrata{

    @Override
    public Pacote createPacote() {return new PacoteAnime();}

    @Override
    public Fatura createFatura() {return new FaturaAnime();}
}
