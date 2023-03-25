package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    @Test
    void deveDefinirPacoteAnime() {
        FabricaAbstrata fabrica = new FabricaAnime();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Pacote de Anime", cliente.definirPlanoAnime());
    }
    

    @Test
    void deveEmitirFaturaDorama() {
        FabricaAbstrata fabrica = new FabricaDorama();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Fatura Dorama", cliente.definirPlanoDorama());
    }
}
