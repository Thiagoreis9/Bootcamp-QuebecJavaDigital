package org.example;

import org.example.Conta;

public class TransferenciaEntreContas {

    public static void transfere(Conta contaOrigem, Conta contaDestino, int valor){
        if (valor <= 0){
            throw new IllegalArgumentException("valor deve ser maior que zero!");
        }
    }
}
