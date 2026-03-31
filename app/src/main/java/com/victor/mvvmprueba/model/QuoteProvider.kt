package com.victor.mvvmprueba.model

class QuoteProvider {

    companion object {


        fun random () : QuoteModel {
            val position = (1..6).random()
            return quote[position]
        }

        val quote = listOf<QuoteModel>(
            QuoteModel(
                "Ejemplo",
                "Aurtor ejemplo 1"
            ),
            QuoteModel(
                "Ejemplo",
                "Aurtor ejemplo 2"
            ),
            QuoteModel(
                "Ejemplo",
                "Aurtor ejemplo 3"
            ),
            QuoteModel(
                "Ejemplo",
                "Aurtor ejemplo 4"
            ),
            QuoteModel(
                "Ejemplo",
                "Aurtor ejemplo 5"
            ),
            QuoteModel(
                "Ejemplo",
                "Aurtor ejemplo 6"
            ),
            QuoteModel(
                "Ejemplo",
                "Aurtor ejemplo 7"
            )

        )
    }
}