package br.ufrrj.precotomate.controller;

import br.ufrrj.precotomate.service.TomateService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/preco")
public class TomateController {

  private final TomateService service;

  public TomateController(TomateService service) {
    this.service = service;
  }

  // 1) API JSON original
  @GetMapping("/{quantidade}")
  public double calcularPreco(@PathVariable int quantidade) {
    return service.calcularPrecoComDesconto(quantidade);
  }

  // 2) Nova rota que retorna um HTML “inline” para form simples
  @GetMapping(path = "/", produces = MediaType.TEXT_HTML_VALUE)
  public ResponseEntity<String> paginaGrafica() {
    String html = """
      <!DOCTYPE html>
      <html lang="pt-BR">
      <head>
        <meta charset="UTF-8" />
        <title>Preço do Tomate</title>
        <style>
          body { font-family: sans-serif; padding: 2rem; background: #f9f9f9; }
          input, button { font-size: 1rem; padding: 0.5rem; }
          button { margin-left: .5rem; cursor: pointer; }
          #resultado { margin-top: 1rem; font-weight: bold; }
        </style>
      </head>
      <body>
        <h1>Calculadora de Preço do Tomate 🍅</h1>
        <label for="qtd">Quantidade de caixas:</label>
        <input id="qtd" type="number" value="1" min="0" />
        <button onclick="calcular()">Calcular</button>
        <div id="resultado"></div>
        <script>
          async function calcular() {
            const q = document.getElementById('qtd').value;
            const res = await fetch(`/api/preco/${q}`);
            const preco = await res.text();
            document.getElementById('resultado').innerText =
              isNaN(preco)
              ? 'Erro ao calcular'
              : `Preço total: R$ ${parseFloat(preco).toFixed(2)}`;
          }
        </script>
      </body>
      </html>
      """;
    return ResponseEntity.ok(html);
  }
}
