package com.moringaschool.mycookbook;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SpoonacularApi {
    @GET("findByIngredients?")
    Call<FindByIngredientResponse> getRecipe(
            @Query("ingredients") String ingredients,
            @Query("number") int number
    );
}
