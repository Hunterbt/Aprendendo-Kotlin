package com.exercicios

/**
Calculadora de Área de Retângulo Interativa
Crie um programa que:

Pede ao usuário para digitar a largura do retângulo.

Pede ao usuário para digitar a altura do retângulo.

Calcula a área e mostra o resultado.

Para isso, você precisará de uma nova ferramenta: a função readLine().
Ela lê uma linha de texto que o usuário digitou no console.
 */

fun main() {
    print("Digite a largura do rectangulo:")
    var largura = readLine()?.toIntOrNull()
    print("Digite a altura do rectangulo:")
    var altura = readLine()?.toIntOrNull()
    if (largura != null && altura != null) {
        val area = largura * altura
        println("A area de um rectangulo é: $area")
    }else{
        println("Valor invalido")
    }
}