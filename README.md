# Estudos-TesteDeSoftware
Scripts criados para estudo de teste de software.

## Curso Início Rapido em Teste de Software - Iterasys
Curso gratuito da [Iterasys](https://iterasys.com.br/) patrocinado pelo Banco Itaú.

### Pasta siteIterasys
Conteúdo gerado seguindo a aula Testes Web com Selenium WebDriver.
Criação do primeiro script de teste.
<p>Teste consultar um curso e verificar seu nome e preço.

### Pasta ecommerce_prestashop
Conteúdo gerado seguindo as aulas do modulo Testes Web.
Os testes foram realizados no ecommerce [Loja de Teste](https://marcelodebittencourt.com/demoprestashop/).
<p>Foram feitos testes dos fluxos principais de uma compra.

 1. Verifica se os produtos foram exibidos corretamente `testContarProdutos_oitoProdutosDiferentes();`
 2. Verifica se o carrinho inicializou zerado `testValidarCarrinhoZerado_ZeroItensNoCarrinho();`
 3. Verifica se o item clicado está correto `testValidarDetalhesDoProduto_DescricaoEValorIguais();`
 4. Verifica se o login foi realizado com sucesso `testLoginComSucesso_UsuarioLogado();`
 5. Verifica se o produto foi incluído corretamento no carrinho `testIncluirProdutoNoCarrinho_ProdutoIncluidoComSucesso();`
Inclui os testes 3 e 4.
