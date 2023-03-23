package com.example.projeto;

public class FabricaDorama implements FabricaAbstrata{

    @Override
    public Anime createAnime() {return new createAnime();}

    @Override
    public Dorama createDorama() {return new createDorama();}
}
