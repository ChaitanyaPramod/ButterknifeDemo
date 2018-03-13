// Generated code from Butter Knife. Do not modify!
package com.chaitanyapramod.butterknifedemo;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OptimizedActivity_ViewBinding implements Unbinder {
  private OptimizedActivity target;

  @UiThread
  public OptimizedActivity_ViewBinding(OptimizedActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public OptimizedActivity_ViewBinding(OptimizedActivity target, View source) {
    this.target = target;

    target.myTextView = Utils.findRequiredViewAsType(source, R.id.my_text_view, "field 'myTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    OptimizedActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.myTextView = null;
  }
}
