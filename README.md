# 🧠 Aprendendo Kotlin

Este repositório contém anotações e exemplos para quem está começando a aprender **Kotlin**, focando em conceitos fundamentais da linguagem.

---

## ✅ Sumário

1. [Funções e Ponto de Entrada (`fun main()`)](#1-funções-e-ponto-de-entrada-fun-main)
2. [Variáveis (`var` e `val`)](#2-variáveis-var-e-val)
3. [Entrada e Saída de Dados](#3-entrada-e-saída-de-dados)
4. [Tratamento de Nulos](#4-tratamento-de-nulos)
5. [Interpolação de Strings (`$`)](#5-interpolação-de-strings-)
6. [Lógica Condicional (`if` / `else`)](#6-lógica-condicional-if--else)
7. [Estruturas de Múltiplas Escolhas (`when`)](#7-estruturas-de-múltiplas-escolhas-when)
8. [Lógica de Faixa (`in` e `!in`)](#8-lógica-de-faixa-in-e-in)

---

## 1. Funções e Ponto de Entrada (`fun main()`)

**🧠 Conceito:**  
Uma função é um bloco de código que executa uma tarefa específica.

**🛠 Técnica:**  
O ponto de partida de um programa Kotlin é a função `main`. Tudo começa dentro das chaves `{}` dessa função.

```kotlin
fun main() {
    // Seu código começa aqui
}
2. Variáveis (var e val)
🧠 Conceito:
Variáveis armazenam informações em "caixas".

🛠 Técnica:

var: Variável mutável (pode mudar de valor).
Ex: idade de uma pessoa.

val: Variável imutável (constante).
Ex: data de nascimento.

kotlin
Copiar código
var idade = 25
val nome = "João"
3. Entrada e Saída de Dados
🧠 Conceito:
Permite a comunicação entre o programa e o usuário.

🛠 Técnica:

print(): Imprime texto sem quebrar linha.

println(): Imprime texto e quebra a linha.

readLine(): Lê entrada do usuário como String?.

kotlin
Copiar código
print("Digite seu nome: ")
val nome = readLine()
println("Olá, $nome!")
4. Tratamento de Nulos
🧠 Conceito:
Em Kotlin, variáveis podem ser null, e precisamos lidar com isso para evitar falhas.

🛠 Técnica:

?.toIntOrNull(): Tenta converter para Int, retorna null se falhar.

?.toDoubleOrNull(): Para Double.

?.: Operador de chamada segura (só executa se não for null).

kotlin
Copiar código
val numero = readLine()?.toIntOrNull()
5. Interpolação de Strings ($)
🧠 Conceito:
Inserir valores de variáveis diretamente dentro de uma String.

🛠 Técnica:
Use o símbolo $ antes do nome da variável.

kotlin
Copiar código
val area = 1750
println("A área do retângulo é: $area")
6. Lógica Condicional (if / else)
🧠 Conceito:
Executa blocos de código com base em condições.

🛠 Técnica:
if para condição verdadeira, else para falsa.

kotlin
Copiar código
if (idade >= 16) {
    println("Pode votar")
} else {
    println("Não pode votar")
}
7. Estruturas de Múltiplas Escolhas (when)
🧠 Conceito:
Substitui várias condições if/else if de forma mais organizada.

🛠 Técnica:

kotlin
Copiar código
when (operacao) {
    "+" -> println("Adição")
    "-" -> println("Subtração")
    else -> println("Operação inválida")
}
8. Lógica de Faixa (in e !in)
🧠 Conceito:
Verifica se um valor está dentro de um intervalo.

🛠 Técnica:

kotlin
Copiar código
when (idade) {
    in 16..18 -> println("Voto opcional")
}
