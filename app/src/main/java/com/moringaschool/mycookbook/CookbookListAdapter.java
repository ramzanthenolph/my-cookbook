package com.moringaschool.mycookbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CookbookListAdapter extends RecyclerView.Adapter<CookbookListAdapter.CookbookViewHolder> {
    private List<UsedIngredient> mIngredients;
    private Context mContext;

    public CookbookListAdapter(Context context, List<UsedIngredient> recipeList){
        mContext = context;
        mIngredients = recipeList;
    }

    @Override
    public CookbookListAdapter.CookbookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cookbook_list_item, parent, false);
        CookbookViewHolder viewHolder = new CookbookViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CookbookListAdapter.CookbookViewHolder holder, int position) {
        holder.bindIngredient(mIngredients.get(position));
    }

    @Override
    public int getItemCount() {
        return mIngredients.size();
    }

    public class CookbookViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.ingredientImageView) ImageView mIngredientImageView;
        @BindView(R.id.ingredientNameTextView) TextView mIngredientNameTextView;
        @BindView(R.id.amountTextView) TextView mAmountTextView;
        @BindView(R.id.aisleTextView) TextView mAisleTextView;

        private Context mContext;

        public CookbookViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }


        public void bindIngredient(UsedIngredient ingredient) {
            Picasso.get().load(ingredient.getImage()).into(mIngredientImageView);
            mIngredientNameTextView.setText(ingredient.getName());
            mAmountTextView.setText(ingredient.getAmount());
            mAisleTextView.setText("Aisle: " + ingredient.getAisle() );
        }
    }
}
