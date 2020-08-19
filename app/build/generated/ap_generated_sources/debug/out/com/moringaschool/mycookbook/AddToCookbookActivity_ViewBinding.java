// Generated code from Butter Knife. Do not modify!
package com.moringaschool.mycookbook;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddToCookbookActivity_ViewBinding implements Unbinder {
  private AddToCookbookActivity target;

  @UiThread
  public AddToCookbookActivity_ViewBinding(AddToCookbookActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AddToCookbookActivity_ViewBinding(AddToCookbookActivity target, View source) {
    this.target = target;

    target.mToCookbookButton = Utils.findRequiredViewAsType(source, R.id.toCookbookButton, "field 'mToCookbookButton'", Button.class);
    target.mIngredientEditText = Utils.findRequiredViewAsType(source, R.id.ingredientEditText, "field 'mIngredientEditText'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AddToCookbookActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mToCookbookButton = null;
    target.mIngredientEditText = null;
  }
}
