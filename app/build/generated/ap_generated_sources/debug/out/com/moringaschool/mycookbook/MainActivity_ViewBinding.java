// Generated code from Butter Knife. Do not modify!
package com.moringaschool.mycookbook;

import android.view.View;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.mAddToCookbookButton = Utils.findRequiredViewAsType(source, R.id.addTocookbookButton, "field 'mAddToCookbookButton'", Button.class);
    target.mViewCookbookButton = Utils.findRequiredViewAsType(source, R.id.viewcookbookButton, "field 'mViewCookbookButton'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mAddToCookbookButton = null;
    target.mViewCookbookButton = null;
  }
}
