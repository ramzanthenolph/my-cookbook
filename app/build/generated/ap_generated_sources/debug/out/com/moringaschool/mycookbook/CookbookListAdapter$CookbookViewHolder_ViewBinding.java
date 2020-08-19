// Generated code from Butter Knife. Do not modify!
package com.moringaschool.mycookbook;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CookbookListAdapter$CookbookViewHolder_ViewBinding implements Unbinder {
  private CookbookListAdapter.CookbookViewHolder target;

  @UiThread
  public CookbookListAdapter$CookbookViewHolder_ViewBinding(
      CookbookListAdapter.CookbookViewHolder target, View source) {
    this.target = target;

    target.mIngredientImageView = Utils.findRequiredViewAsType(source, R.id.ingredientImageView, "field 'mIngredientImageView'", ImageView.class);
    target.mIngredientNameTextView = Utils.findRequiredViewAsType(source, R.id.ingredientNameTextView, "field 'mIngredientNameTextView'", TextView.class);
    target.mAmountTextView = Utils.findRequiredViewAsType(source, R.id.amountTextView, "field 'mAmountTextView'", TextView.class);
    target.mAisleTextView = Utils.findRequiredViewAsType(source, R.id.aisleTextView, "field 'mAisleTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CookbookListAdapter.CookbookViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mIngredientImageView = null;
    target.mIngredientNameTextView = null;
    target.mAmountTextView = null;
    target.mAisleTextView = null;
  }
}
