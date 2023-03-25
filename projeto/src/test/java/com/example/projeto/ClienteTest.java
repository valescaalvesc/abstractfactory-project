package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    @Test
    void deveEmitirPacoteAnime() {
        FabricaAbstrata fabrica = new FabricaAnime();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Pacote Anime", cliente.emitirPacote());
    }

    @Test
    void deveEmitirPacoteDorama() {
        FabricaAbstrata fabrica = new FabricaDorama();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Pacote Dorama", cliente.emitirPacote());
    }

    @Test
    void deveEmitirFaturaAnime() {
        FabricaAbstrata fabrica = new FabricaAnime();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Fatura Anime", cliente.emitirFatura());
    }

    @Test
    void deveEmitirFaturaDorama() {
        FabricaAbstrata fabrica = new FabricaDorama();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Fatura Dorama", cliente.emitirFatura());
    }
}
