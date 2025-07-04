package br.ufrrj.precotomate.service;

import org.springframework.stereotype.Service;

@Service
public class TomateService {

    private double precoBase = 50.0;

    public double calcularPrecoComDesconto(int quantidade) {
        double desconto = 0.0;

        if (quantidade >= 30) {
            desconto = 0.22;
        } else if (quantidade >= 20) {
            desconto = 0.11;
        } else if (quantidade >= 10) {
            desconto = 0.05;
        }

        double precoTotal = quantidade * precoBase;
        return precoTotal * (1 - desconto);
    }
}
