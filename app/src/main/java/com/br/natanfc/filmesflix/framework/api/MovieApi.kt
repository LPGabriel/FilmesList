package com.br.natanfc.filmesflix.framework.api

import com.br.natanfc.filmesflix.domain.Movie
import retrofit2.Call
import retrofit2.http.GET

interface MovieApi {

    @GET("https://lpgabriel.github.io/FilmesFlix-api/moviesList.json")
    fun getAllMovies(): Call<List<Movie>>

}