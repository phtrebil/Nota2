package br.com.alura.ceep.webclient

import br.com.alura.ceep.webclient.service.NotaService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInicializador {

    private val client by lazy {
        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
        OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
    }

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("http://192.168.0.7:8080/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    val notaService = retrofit.create(NotaService::class.java)

}