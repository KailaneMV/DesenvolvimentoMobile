package org.example

fun main() {
    var saldo = 0.0

    while (true) {
        println("Bem-Vindo ao Nosso Banco!")
        println("\n1. Depositar\n2. Sacar\n3. Consultar Saldo\n4. Sair")
        print("Escolha uma opção: ")

        when (readLine()) {
            "1" -> {
                print("Valor para depósito: R$ ")
                saldo += readLine()?.toDoubleOrNull() ?: 0.0
                println("Depósito realizado! Saldo: R$ $saldo")
            }
            "2" -> {
                print("Valor para saque: R$ ")
                val saque = readLine()?.toDoubleOrNull() ?: 0.0
                if (saque <= saldo) {
                    saldo -= saque
                    println("Saque realizado! Saldo: R$ $saldo")
                } else {
                    println("Saldo insuficiente!")
                }
            }
            "3" -> println("Saldo atual: R$ $saldo")
            "4" -> {
                println("Obrigada e volte sempre!")

            }
            else -> println("Opção inválida.")
        }
    }
}
