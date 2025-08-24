package com.exercicios

/**
 * Problema 6: Par ou Ímpar
 * Crie um programa que verifica se um número é par ou ímpar.
 *
 * Para isso, você vai precisar de um novo operador: o operador de módulo (%). Ele retorna o resto da divisão. Por exemplo, 10 % 3 é igual a 1, porque 10 dividido por 3 é 3 com resto 1.
 *
 * A lógica para saber se um número é par é: se o número dividido por 2 tiver resto 0.
 */
fun main() {
    print("Digite um número:")
    var numero = readLine()?.toIntOrNull()
    if(numero != null){
        if(numero % 2 == 0){
            println("Número par")
        }else{
            println("Número impar")
        }
    }
}