// Generated code from Butter Knife. Do not modify!
package com.moringaschool.mycookbook;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SavedRecipeListActivity_ViewBinding implements Unbinder {
  private SavedRecipeListActivity target;

  @UiThread
  public SavedRecipeListActivity_ViewBinding(SavedRecipeListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SavedRecipeListActivity_ViewBinding(SavedRecipeListActivity target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SavedRecipeListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
  }
}
