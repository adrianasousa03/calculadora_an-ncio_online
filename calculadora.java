<meta charset="UTF-8">
  <head>
  
<title>Desafio da Academia Técnica Capgemini</title>
  </head>
  <body>
  	<h2>Calculadora de alcance de anúncios online</h2>

    <label for="quantVisualizacoes">Quant de Visualizações</label>
    <input type="number" id="quantVisualizacoes" /><br><br>

    <label for="quantTotal">Quant Total</label>
    <input type="number" id="quantTotal" /><br><br>

    <label for="quantCliques">Quant Cliques</label>
    <input type="number" id="quantCliques" /><br><br>

    <label for="quantCompartilhamentos">Quant Compartilhamentos</label>
    <input type="number" id="quantCompartilhamentos" /><br><br>

    <label for="valorInvestido">Valor investido em reais</label>
    <input type="number" id="valorInvestido" /><br><br>

    <span id="resposta">Quantidade máxima de pessoas que visualizarão o mesmo anúncio</span>
    <button onclick="calcular()">Projeção aproximada</button>

  </body>
</html>
<script>
		
		var quantVisualizacoes = 0;
		var quantTotal = 0;
		var quantCliques = 0;
		var quantCompartilhamentos = 0;
		var valor
		if (valor > 0) {
			quantVisualizacoes = valor * 30;
			quantTotal = quantTotal + quantVisualizacoes;
			for (int i = 0; i < 4; i++) {
				quantCliques = calcularCliques(quantVisualizacoes);
				quantCompartilhamentos = calcularCompartilhamentos(quantCliques);
				quantVisualizacoes = quantCompartilhamentos * 40;
				quantTotal = quantTotal + quantVisualizacoes;
			}

			function calcular(){
    var projecaoAproximada = (inputquantTotal.valueAsNumber + inputquantVisualizacoes.valueAsNumber + quantCompartilhamentos * 40).toFixed(2); 
    		spanHora.textContent = "Projecão Aproximada"
}
</script>