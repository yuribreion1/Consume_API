package br.com.fiap.consume_api;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://douglascabral.com.br/aula-api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrofitContatosInterface api = retrofit.create(RetrofitContatosInterface.class);

        api.getContatos().enqueue(new Callback<List<Contato>>() {
            @Override
            public void onResponse(Call<List<Contato>> call, Response<List<Contato>> response) {
                List<Contato> contatos = response.body();
                for (int i = 0; i< contatos.size(); i++) {
                    Log.i("Contato", contatos.get(i).getNome());
                }
            }

            @Override
            public void onFailure(Call<List<Contato>> call, Throwable t) {

            }
        });

    }
}
