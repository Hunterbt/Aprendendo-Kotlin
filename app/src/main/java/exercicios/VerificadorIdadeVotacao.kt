package com.exercicios

/**
 * Problema 5: Verificador de Idade para Votação
 * Agora, vamos mudar de assunto e focar em lógica condicional. O próximo desafio é criar um
 * programa que verifica se uma pessoa pode votar. A idade mínima para votar no Brasil é 16 anos.
 *
 * O programa deve:
 *
 * Perguntar ao usuário a sua idade.
 *
 * Verificar se a idade é maior ou igual a 16.
 *
 * Imprimir uma mensagem informando se a pessoa pode votar ou não.
 */
const val title = "Verificador de Idade para Votação"

fun main() {
    println(title)
    print("Qual é a sua idade?")
    var idade = readLine()?.toIntOrNull()
    if (idade != null && idade >= 16){
        println("Você pode votar")
    }else{
        println("Voce não pode votar")
    }

}

