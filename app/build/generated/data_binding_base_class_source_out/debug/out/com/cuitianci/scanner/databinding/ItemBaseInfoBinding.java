// Generated by data binding compiler. Do not edit!
package com.cuitianci.scanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.cuitianci.scanner.R;
import com.cuitianci.scanner.bean.BaseInfoBean;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemBaseInfoBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ivIcon;

  @NonNull
  public final TextView tvLabel;

  @NonNull
  public final TextView tvValue;

  @Bindable
  protected BaseInfoBean mBaseInfo;

  protected ItemBaseInfoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView ivIcon, TextView tvLabel, TextView tvValue) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivIcon = ivIcon;
    this.tvLabel = tvLabel;
    this.tvValue = tvValue;
  }

  public abstract void setBaseInfo(@Nullable BaseInfoBean baseInfo);

  @Nullable
  public BaseInfoBean getBaseInfo() {
    return mBaseInfo;
  }

  @NonNull
  public static ItemBaseInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_base_info, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemBaseInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemBaseInfoBinding>inflateInternal(inflater, R.layout.item_base_info, root, attachToRoot, component);
  }

  @NonNull
  public static ItemBaseInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_base_info, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemBaseInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemBaseInfoBinding>inflateInternal(inflater, R.layout.item_base_info, null, false, component);
  }

  public static ItemBaseInfoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemBaseInfoBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemBaseInfoBinding)bind(component, view, R.layout.item_base_info);
  }
}
