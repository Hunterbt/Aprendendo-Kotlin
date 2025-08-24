# Aprendendo-Kotlin

1. Funções e Ponto de Entrada (fun main())
Conceito: Uma função é um bloco de código que executa uma tarefa específica.

Técnica: Em Kotlin, o ponto de partida de qualquer programa é a função main. Tudo o que você quer que seu programa faça precisa estar dentro das chaves {} dessa função.

Exemplo:

Kotlin

fun main() {
    // Seu código começa aqui
}
2. Variáveis (var e val)
Conceito: Variáveis são como caixas para guardar informações.

Técnica:

var (variável): Usamos para dados que podem mudar de valor. (Ex: a idade de uma pessoa).

val (valor): Usamos para dados que não mudam. (Ex: a data de nascimento de uma pessoa, que é constante).

Exemplo:

Kotlin

var idade = 25
val nome = "João"
3. Entrada e Saída de Dados (println, print, readLine())
Conceito: Como o programa se comunica com o usuário.

Técnica:

println(): Imprime um texto na tela e pula para a próxima linha.

print(): Imprime um texto na tela e permanece na mesma linha.

readLine(): Pede para o usuário digitar um texto no console e retorna esse texto como uma String? (uma string que pode ser nula).

Exemplo:

Kotlin

print("Digite seu nome: ")
val nome = readLine()
println("Olá, $nome!")
4. Tratamento de Nulos (?.toIntOrNull() e ?.toDoubleOrNull())
Conceito: Em Kotlin, um valor pode ser nulo (null), ou seja, não conter nada. Precisamos tratar isso para evitar que o programa pare de funcionar.

Técnica:

.toIntOrNull(): Tenta converter a string para um número inteiro. Se a conversão falhar (se o usuário digitar um texto, por exemplo), ela retorna null.

.toDoubleOrNull(): Faz o mesmo, mas para números decimais.

?. (Safe Call Operator): Uma forma segura de chamar uma função em uma variável que pode ser nula. Ele só executa a função se a variável não for nula, caso contrário, retorna null.

Exemplo:

Kotlin

val numero = readLine()?.toIntOrNull() // Seguro contra entradas inválidas
5. Interpolação de Strings ($)
Conceito: Inserir o valor de uma variável diretamente dentro de uma string.

Técnica: Usamos o cifrão ($) seguido do nome da variável.

Exemplo:

Kotlin

val area = 1750
println("A área do retângulo é: $area")
6. Lógica Condicional (if, else)
Conceito: Executar um bloco de código apenas se uma condição for verdadeira.

Técnica: A estrutura if/else nos permite tomar decisões. O código dentro do if só roda se a condição for verdadeira. Se for falsa, o código do else é executado.

Exemplo:

Kotlin

if (idade >= 16) {
    println("Pode votar")
} else {
    println("Não pode votar")
}
7. Estruturas de Múltiplas Escolhas (when)
Conceito: Uma forma mais limpa e organizada de lidar com múltiplas condições, substituindo vários if e else if.

Técnica: O when avalia um valor e executa o código do primeiro -> que corresponder. O bloco else é a opção padrão, executada se nenhuma outra condição for satisfeita.

Exemplo:

Kotlin

when (operacao) {
    "+" -> println("Adição")
    "-" -> println("Subtração")
    else -> println("Operação inválida")
}
8. Lógica de Faixa (in e !in)
Conceito: Uma forma de verificar se um valor está dentro de um intervalo.

Técnica: Usamos o operador in seguido por uma faixa, como 16..18.

Exemplo:

Kotlin

when (idade) {
    in 16..18 -> println("Voto opcional")
}
Com essa visão geral, você pode ver o quão longe já chegamos e como cada conceito se conecta. Agora, com essa base sólida, você está pronto para o próximo desafio.
