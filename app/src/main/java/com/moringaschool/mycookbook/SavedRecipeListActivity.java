package com.moringaschool.mycookbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SavedRecipeListActivity extends AppCompatActivity {
    private DatabaseReference mIngredientReference;
    private FirebaseRecyclerAdapter<UsedIngredient, FirebaseIngredientViewHolder> mFirebaseAdapter;

    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtocookbook);
        ButterKnife.bind(this);

        mIngredientReference = FirebaseDatabase.getInstance().getReference(Constants.FIREBASE_CHILD_SEARCHED_INGREDIENT);
        setUpFirebaseAdapter();
    }

    private void setUpFirebaseAdapter(){
        FirebaseRecyclerOptions<UsedIngredient> options =
                new FirebaseRecyclerOptions.Builder<UsedIngredient>()
                        .setQuery(mIngredientReference, UsedIngredient.class)
                        .build();

        mFirebaseAdapter = new FirebaseRecyclerAdapter<UsedIngredient, FirebaseIngredientViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull FirebaseIngredientViewHolder firebaseIngredientViewHolder, int i, @NonNull UsedIngredient ingredient) {
                firebaseIngredientViewHolder.bindIngredient(ingredient);
            }


            @NonNull
            @Override
            public FirebaseIngredientViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cookbook_list_item, parent, false);
                return new FirebaseIngredientViewHolder(view);
            }
        };

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mFirebaseAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mFirebaseAdapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(mFirebaseAdapter!= null) {
            mFirebaseAdapter.stopListening();
        }
    }
}