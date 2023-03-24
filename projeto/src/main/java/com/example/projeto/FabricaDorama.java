package com.example.projeto;

public class FabricaDorama implements FabricaAbstrata{

    @Override
    public Anime createAnime() {return new FaturaAnime();}

    @Override
    public Dorama createDorama() {return new FaturaDorama();}
}
