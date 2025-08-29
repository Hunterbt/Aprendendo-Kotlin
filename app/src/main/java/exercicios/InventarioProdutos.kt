package exercicios

/**
 * O Problema:
 *
 * Você é um desenvolvedor em uma loja de eletrônicos e precisa criar um programa para gerenciar o inventário de produtos. O programa deve ser capaz de:
 *
 * Armazenar o nome do produto (por exemplo, "Smartphone Galaxy S23").
 *
 * Armazenar o preço do produto.
 *
 * Armazenar a quantidade de itens em estoque.
 *
 * Indicar se o produto está em promoção ou não.
 */

fun main() {

    while(true){
        print("Nome do Produto:")
        val nomeProduto = readLine()?: "Produto Desconhecido"

        print("Preço do Produto:")
        var precoProduto = readLine()?.toDoubleOrNull() ?: 0.0

        print("Quantidade em Estoque:")
        var quantidadeEstoque = readLine()?.toIntOrNull() ?: 0

        //Validação de itens em promoção
        //Caso validação == True item 20 % de desconto
        print("Item em promoção ? (S/N):")
        var itemPromocao = readLine()?: "Opção Invalida!"

        while(itemPromocao != "S" && itemPromocao != "N"){
            print("Opção Invalida , digite uma opção valida: ")
            itemPromocao = readLine()?: "Opção Invalida!"
        }
        if (itemPromocao.lowercase() == "s"){
            println("Este item está em promoção")

            var calculoDesconto = precoProduto - (precoProduto * 20 / 100)
            println("Valor total a pagar com desconto deducido: $calculoDesconto")
        }
        else{
            println("Este item não esta em promoção")
        }

        print("Deseja sair do programa: (S/N)")
        var sairPrograma = readLine()?: "Valor invalido!"

        if (sairPrograma.lowercase() == "s"){
            break
        }
    }
}