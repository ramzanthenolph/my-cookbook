package com.moringaschool.mycookbook;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.ArrayList;


public class FirebaseIngredientViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    View mView;
    Context mContext;

    public FirebaseIngredientViewHolder(View itemView) {
        super(itemView);
        mView = itemView;
        mContext = itemView.getContext();
        itemView.setOnClickListener(this);
    }

    public void bindIngredient(UsedIngredient ingredient) {
        ImageView ingredientImageView = (ImageView) mView.findViewById(R.id.ingredientImageView);
        TextView nameTextView = (TextView) mView.findViewById(R.id.ingredientNameTextView);
        TextView amountTextView = (TextView) mView.findViewById(R.id.amountTextView);
        TextView aisleTextView = (TextView) mView.findViewById(R.id.aisleTextView);

        Picasso.get().load(ingredient.getImage()).into(ingredientImageView);

        nameTextView.setText(ingredient.getName());
        amountTextView.setText(ingredient.getAmount());
        aisleTextView.setText("Aisle: " + ingredient.getAisle() );
    }

    @Override
    public void onClick(View view) {
        final ArrayList<UsedIngredient> ingredients = new ArrayList<>();
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference(Constants.FIREBASE_CHILD_SEARCHED_INGREDIENT);
        ref.addListenerForSingleValueEvent(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    ingredients.add(snapshot.getValue(UsedIngredient.class));
                }

                int itemPosition = getLayoutPosition();

                Intent intent = new Intent(mContext, AddToCookbookActivity.class);
                intent.putExtra("position", itemPosition + "");
                intent.putExtra("ingredients", Parcels.wrap(ingredients));

                mContext.startActivity(intent);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
    }
}
