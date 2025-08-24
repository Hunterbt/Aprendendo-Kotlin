package com.exercicios

/**
 * Problema 7: Calculadora Simples
 * Vamos aumentar a complexidade. Crie um programa que funciona como uma calculadora simples,
 * realizando as 4 operações básicas: adição, subtração, multiplicação e divisão.
 *
 * O programa deve:
 *
 * Pedir o primeiro número.
 *
 * Pedir o segundo número.
 *
 * Pedir ao usuário para escolher a operação (+, -, *, /).
 *
 * Realizar a operação escolhida e mostrar o resultado.
 *
 * Para resolver este problema, você precisará usar uma estrutura de controle de fluxo chamada
 * when. O when é como um switch de outras linguagens e é ideal para situações onde você tem várias opções.
 *
 * Como você acha que começaria a estruturar o código? Quais variáveis você precisaria? E como você
 * usaria o when para escolher a operação correta?
 */

fun main() {

    println("Calculadora Simples")
    print("Digite o primeiro número: ")

    var numero1 = readLine()?.toDoubleOrNull()
    print("Digite o segundo número: ")
    var numero2 = readLine()?.toDoubleOrNull()
    print("Escolha a operação matematica: + - * /: ")
    var OperacaoMatematica = readLine()?.toString()

    when(OperacaoMatematica){

        "+" -> {
            if(numero1 != null && numero2 != null){
                var AdicaodeValores = numero1 + numero2
                println("A Adição dos valores é igual a: $AdicaodeValores")
            }
        }

        "-" -> {
            if(numero1 != null && numero2 != null){
                var SubtracaodeValores = numero1 - numero2
                println("A Subtração dos valores é igual a: $SubtracaodeValores")
            }
        }

        "*" -> {
            if(numero1 != null && numero2 != null){
                var MultiplicacaodeValores = numero1 * numero2
                println("A multiplicação dos valores é igual a: $MultiplicacaodeValores")
            }
        }

        "/" -> {
            if(numero1 != null && numero2 != null){
                if (numero1 != 0.0 && numero2 != 0.0){
                    var DivisaodeValores = numero1 / numero2
                    println("A divisão dos valores é igual a: $DivisaodeValores")
                }
                else {
                    print("Digite um valor diferente de zero!")
                }
            }
        }

        else -> {
            println("Operação matematica invalida!")
        }
    }
}