package br.com.alura.ceep.webclient

import br.com.alura.ceep.webclient.service.NotaService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInicializador {

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("http://192.168.0.1:8080/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val notaService = retrofit.create(NotaService::class.java)

}