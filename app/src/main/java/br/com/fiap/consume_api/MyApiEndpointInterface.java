package br.com.fiap.consume_api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MyApiEndpointInterface {

    @GET("users/{username}")
    Call<Contato> getUser(@Path("username") String username);

    @GET("users/{id}/users")
    Call<List<Contato>> groupList(@Path("id") int groupId, @Query("sort") String sort);

    @POST("users/new")
    Call<Contato> createContato(@Body Contato contato);
}
