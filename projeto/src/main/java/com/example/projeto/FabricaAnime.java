package com.example.projeto;

public class FabricaAnime implements FabricaAbstrata {

    @Override
    public Anime createAnime() {return new Anime();}

    @Override
    public Dorama createDorama() {return new Dorama();}
}
