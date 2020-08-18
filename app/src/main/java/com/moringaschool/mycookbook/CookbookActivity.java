package com.moringaschool.mycookbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CookbookActivity extends AppCompatActivity {


    private CookbookListAdapter mAdapter;

    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;
    @BindView(R.id.errorTextView) TextView mErrorTextView;
    @BindView(R.id.progressBar) ProgressBar mProgressBar;

    private ArrayList <String> foods = new ArrayList<>();
    public List<String> recipes = new ArrayList<>();

    public List<UsedIngredient> recipesList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cookbook);
        ButterKnife.bind(this);




        Intent intent = getIntent();
        String ingredient = intent.getStringExtra("ingredient");


        SpoonacularApi client = SpoonacularClient.getClient();

        Call<FindByIngredientResponse> call = client.getRecipe(ingredient, 2);

        call.enqueue(new Callback<FindByIngredientResponse>() {
            @Override
            public void onResponse(Call<FindByIngredientResponse> call, Response<FindByIngredientResponse> response) {
                hideProgressBar();

                if (response.isSuccessful()) {
                    recipesList = response.body().getUsedIngredients();
                    mAdapter = new CookbookListAdapter(CookbookActivity.this, recipesList);
                    mRecyclerView.setAdapter(mAdapter);
                    RecyclerView.LayoutManager layoutManager =
                            new LinearLayoutManager(CookbookActivity.this);
                    mRecyclerView.setLayoutManager(layoutManager);
                    mRecyclerView.setHasFixedSize(true);
                    showRecipes();

                }else {
                    showUnsuccessfulMessage();
                }
            }

            @Override
            public void onFailure(Call<FindByIngredientResponse> call, Throwable t) {

            }

        });

    }

    private void showFailureMessage() {
        mErrorTextView.setText("Something went wrong. Please check your Internet connection and try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showUnsuccessfulMessage() {
        mErrorTextView.setText("Something went wrong. Please try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showRecipes() {
        mRecyclerView.setVisibility(View.VISIBLE);

    }

    private void hideProgressBar() {
        mProgressBar.setVisibility(View.GONE);
    }

}
