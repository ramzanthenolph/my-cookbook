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

import butterknife.BindView;
import butterknife.ButterKnife;

public class AddToCookbookActivity extends AppCompatActivity implements View.OnClickListener {
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;

    @BindView(R.id.toCookbookButton) Button mToCookbookButton;
    @BindView(R.id.ingredientEditText) EditText mIngredientEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtocookbook);
        ButterKnife.bind(this);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mSharedPreferences.edit();


        mToCookbookButton.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if (v == mToCookbookButton){
            String ingredient = mIngredientEditText.getText().toString();
            addToSharedPreferences(ingredient);
            Intent intent = new Intent(AddToCookbookActivity.this, CookbookActivity.class);
            intent.putExtra("ingredient", ingredient);
            startActivity(intent);
            Toast.makeText(AddToCookbookActivity.this, "Added successfully to Cookbook", Toast.LENGTH_LONG).show();
        }
    }

    private void addToSharedPreferences(String ingredient) {
        mEditor.putString(Constants.PREFERENCES_FOOD_KEY, ingredient).apply();
    }
}
