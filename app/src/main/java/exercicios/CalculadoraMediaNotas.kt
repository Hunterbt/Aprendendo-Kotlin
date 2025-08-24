package com.exercicios
/**
 *Problema 4: Calculadora de Média de Notas
 *
 * Vamos criar um programa que calcula a média de três notas.
 *
 * Para isso, o programa precisa:
 *
 * Pedir ao usuário para digitar a primeira nota.
 *
 * Pedir a segunda e a terceira notas.
 *
 * Calcular a média.
 *
 * Mostrar o resultado.
 */

fun main() {
    print("Digite a primeira nota: ")
    var nota1 = readLine()?.toDoubleOrNull()
    print("Digite a segunda nota: ")
    var nota2 = readLine()?.toDoubleOrNull()
    print("Digite a terceira nota: ")
    var nota3 = readLine()?.toDoubleOrNull()

    if(nota1 != null && nota2 != null && nota3 != null){
        val calcularMedia = (nota1 + nota2 + nota3) / 3
        val mediaFormatada = String.format("%.2f",calcularMedia)
        println("A media das notas é: $mediaFormatada")
    }else{
        println("Valor invalido")
    }
}

