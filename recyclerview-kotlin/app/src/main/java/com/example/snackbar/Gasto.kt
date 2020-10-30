package com.example.snackbar

class Gasto(var descricao: String, var categoria: String, var datahora: String, var valor:Double) {
    override fun toString(): String {
        return "Gasto($descricao, $categoria, $datahora, $valor)"
    }
}