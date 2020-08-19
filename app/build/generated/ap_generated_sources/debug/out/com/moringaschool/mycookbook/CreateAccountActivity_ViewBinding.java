// Generated code from Butter Knife. Do not modify!
package com.moringaschool.mycookbook;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CreateAccountActivity_ViewBinding implements Unbinder {
  private CreateAccountActivity target;

  @UiThread
  public CreateAccountActivity_ViewBinding(CreateAccountActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CreateAccountActivity_ViewBinding(CreateAccountActivity target, View source) {
    this.target = target;

    target.mCreateUserButton = Utils.findRequiredViewAsType(source, R.id.createUserButton, "field 'mCreateUserButton'", Button.class);
    target.mNameEditText = Utils.findRequiredViewAsType(source, R.id.nameEditText, "field 'mNameEditText'", EditText.class);
    target.mEmailEditText = Utils.findRequiredViewAsType(source, R.id.emailEditText, "field 'mEmailEditText'", EditText.class);
    target.mPasswordEditText = Utils.findRequiredViewAsType(source, R.id.passwordEditText, "field 'mPasswordEditText'", EditText.class);
    target.mConfirmPasswordEditText = Utils.findRequiredViewAsType(source, R.id.confirmPasswordEditText, "field 'mConfirmPasswordEditText'", EditText.class);
    target.mLoginTextView = Utils.findRequiredViewAsType(source, R.id.loginTextView, "field 'mLoginTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CreateAccountActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mCreateUserButton = null;
    target.mNameEditText = null;
    target.mEmailEditText = null;
    target.mPasswordEditText = null;
    target.mConfirmPasswordEditText = null;
    target.mLoginTextView = null;
  }
}
