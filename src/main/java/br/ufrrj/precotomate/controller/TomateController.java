package br.ufrrj.precotomate.controller;

import br.ufrrj.precotomate.service.TomateService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/preco")
public class TomateController {

    private final TomateService service;

    public TomateController(TomateService service) {
        this.service = service;
    }

    @GetMapping("/{quantidade}")
    public double calcularPreco(@PathVariable int quantidade) {
        return service.calcularPrecoComDesconto(quantidade);
    }
}
