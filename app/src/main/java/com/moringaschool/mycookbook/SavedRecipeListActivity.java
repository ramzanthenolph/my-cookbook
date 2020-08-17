package com.moringaschool.mycookbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
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


}