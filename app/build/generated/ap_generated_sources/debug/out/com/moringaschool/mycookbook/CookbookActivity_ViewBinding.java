// Generated code from Butter Knife. Do not modify!
package com.moringaschool.mycookbook;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CookbookActivity_ViewBinding implements Unbinder {
  private CookbookActivity target;

  @UiThread
  public CookbookActivity_ViewBinding(CookbookActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CookbookActivity_ViewBinding(CookbookActivity target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
    target.mErrorTextView = Utils.findRequiredViewAsType(source, R.id.errorTextView, "field 'mErrorTextView'", TextView.class);
    target.mProgressBar = Utils.findRequiredViewAsType(source, R.id.progressBar, "field 'mProgressBar'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CookbookActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mErrorTextView = null;
    target.mProgressBar = null;
  }
}
