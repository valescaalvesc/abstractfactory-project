package com.example.projeto;

public class Cliente {

    private Anime anime;
    private Dorama dorama;

    public Cliente (FabricaAbstrata fabrica) {
        this.anime = fabrica.createAnime();
        this.dorama = fabrica.createDorama();
    }

    public String definirPlanoAnime() {return this.anime.definirPlano();}

    public String definirPlanoDorama() {return this.dorama.definirPlano();}
}
