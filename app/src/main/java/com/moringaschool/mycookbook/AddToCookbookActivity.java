package com.moringaschool.mycookbook;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AddToCookbookActivity extends AppCompatActivity implements View.OnClickListener {
    //private SharedPreferences mSharedPreferences;
    //private SharedPreferences.Editor mEditor;
    private DatabaseReference mSearchedIngredientReference;

    @BindView(R.id.toCookbookButton) Button mToCookbookButton;
    @BindView(R.id.ingredientEditText) EditText mIngredientEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mSearchedIngredientReference = FirebaseDatabase
                .getInstance()
                .getReference()
                .child(Constants.FIREBASE_CHILD_SEARCHED_INGREDIENT);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtocookbook);
        ButterKnife.bind(this);

        //mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        //mEditor = mSharedPreferences.edit();


        mToCookbookButton.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if (v == mToCookbookButton){
            String ingredient = mIngredientEditText.getText().toString();
            saveIngredientToFirebase(ingredient);
            Intent intent = new Intent(AddToCookbookActivity.this, CookbookActivity.class);
            intent.putExtra("ingredient", ingredient);
            startActivity(intent);
            Toast.makeText(AddToCookbookActivity.this, "Added successfully to Cookbook", Toast.LENGTH_LONG).show();
        }
    }

    public void saveIngredientToFirebase(String ingredient) {
        mSearchedIngredientReference.setValue(ingredient);
    }


    /*private void addToSharedPreferences(String ingredient) {
        mEditor.putString(Constants.PREFERENCES_FOOD_KEY, ingredient).apply();
    } */
}
