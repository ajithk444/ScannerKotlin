// Generated by data binding compiler. Do not edit!
package com.cuitianci.scanner.databinding;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.cuitianci.scanner.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCameraBinding extends ViewDataBinding {
  @NonNull
  public final CircleImageView ci;

  @NonNull
  public final FloatingActionButton fabShoot;

  @NonNull
  public final TextureView viewFinder;

  protected FragmentCameraBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CircleImageView ci, FloatingActionButton fabShoot, TextureView viewFinder) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ci = ci;
    this.fabShoot = fabShoot;
    this.viewFinder = viewFinder;
  }

  @NonNull
  public static FragmentCameraBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_camera, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCameraBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCameraBinding>inflateInternal(inflater, R.layout.fragment_camera, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCameraBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_camera, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCameraBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCameraBinding>inflateInternal(inflater, R.layout.fragment_camera, null, false, component);
  }

  public static FragmentCameraBinding bind(@NonNull View view) {
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
  public static FragmentCameraBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentCameraBinding)bind(component, view, R.layout.fragment_camera);
  }
}