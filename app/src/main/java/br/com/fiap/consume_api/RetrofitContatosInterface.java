package br.com.fiap.consume_api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitContatosInterface {

    @GET("contatos.php")
    Call<List<Contato>> getContatos();
}
