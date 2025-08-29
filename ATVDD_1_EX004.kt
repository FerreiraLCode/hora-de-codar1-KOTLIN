fun main() {
    println("== CALCULADORA DE ÁREAS ==")
    println("1- Retângulo")
    println("2- Quadrado")
    println("3- Losango")
    println("4- Trapézio")
    println("5- Paralelogramo")
    println("6- Triângulo")
    println("7- Circulo")
    print("Escolha uma opção:")

    val opcao = readLine()?.toIntOrNull() ?: -1
    var area: Double

    when (opcao) {
        1 -> {
            print("Digite a base:")
            val base = readLine()!!.toDouble()
            print("Digite a altura:")
            val altura = readLine()!!.toDouble()
            area = base * altura
            println("A área do retângulo é: $area")
        }
        2 -> {
            print("Digite o lado do quadrado: ")
            val lado = readLine()!!.toDouble()
            area = lado * lado
            println("A área do quadrado é: $area")
        }
        3 -> {
            print("Digite a diagonal maior: ")
            val diagonalMaior = readLine()!!.toDouble()
            print("Digite a diagonal menor: ")
            val diagonalMenor = readLine()!!.toDouble()
            area = (diagonalMaior * diagonalMenor) / 2
            println("A área do losango é: $area")
        }
        4 -> {
            print("Digite a base maior: ")
            val baseMaior = readLine()!!.toDouble()
            print("Digite a base menor: ")
            val baseMenor = readLine()!!.toDouble()
            print("Digite a altura: ")
            val altura = readLine()!!.toDouble()
            area = ((baseMaior + baseMenor) * altura) / 2
            println("A área do trapézio é: $area")
        }
        5 -> {
            print("Digite a base: ")
            val base = readLine()!!.toDouble()
            print("Digite a altura: ")
            val altura = readLine()!!.toDouble()
            area = base * altura
            println("A área do paralelogramo é: $area")
        }
        6 -> {
            print("Digite a base: ")
            val base = readLine()!!.toDouble()
            print("Digite a altura: ")
            val altura = readLine()!!.toDouble()
            area = (base * altura) / 2
            println("A área do triângulo é: $area")
        }
        7 -> {
            print("Digite o raio: ")
            val raio = readLine()!!.toDouble()
            area = Math.PI * raio * raio
            println("A área do círculo é: $area")
        }
        else -> println("Opção inválida!")
    }
}
