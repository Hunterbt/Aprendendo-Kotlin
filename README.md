1. Funções e Ponto de Entrada (fun main())

🧠 Conceito:
Uma função é um bloco de código que executa uma tarefa específica.

🛠 Técnica:
O ponto de partida de um programa Kotlin é a função main. Tudo começa dentro das chaves {} dessa função.

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

var idade = 25
val nome = "João"

3. Entrada e Saída de Dados

🧠 Conceito:
Permite a comunicação entre o programa e o usuário.

🛠 Técnica:

print(): Imprime texto sem quebrar linha.

println(): Imprime texto e quebra a linha.

readLine(): Lê entrada do usuário como String?.

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

val numero = readLine()?.toIntOrNull()

5. Interpolação de Strings ($)

🧠 Conceito:
Inserir valores de variáveis diretamente dentro de uma String.

🛠 Técnica:
Use o símbolo $ antes do nome da variável.

val area = 1750
println("A área do retângulo é: $area")

6. Lógica Condicional (if / else)

🧠 Conceito:
Executa blocos de código com base em condições.

🛠 Técnica:
if para condição verdadeira, else para falsa.

if (idade >= 16) {
    println("Pode votar")
} else {
    println("Não pode votar")
}

7. Estruturas de Múltiplas Escolhas (when)

🧠 Conceito:
Substitui várias condições if/else if de forma mais organizada.

🛠 Técnica:

when (operacao) {
    "+" -> println("Adição")
    "-" -> println("Subtração")
    else -> println("Operação inválida")
}

8. Lógica de Faixa (in e !in)

🧠 Conceito:
Verifica se um valor está dentro de um intervalo.

🛠 Técnica:

when (idade) {
    in 16..18 -> println("Voto opcional")
}
