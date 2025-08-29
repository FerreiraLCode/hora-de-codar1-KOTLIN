fun main() {
    print("Escreva o seu nome: ")
    val nome = readLine() ?: ""
    val resultado = nome
    println("Olá $nome! Digite sua idade:")
    val idade = readLine() ?: ""
    val resultado2 = idade
    println("$nome sua idade é: $idade")
}
