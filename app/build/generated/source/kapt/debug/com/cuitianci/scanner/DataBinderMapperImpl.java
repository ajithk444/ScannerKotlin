package com.cuitianci.scanner;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.cuitianci.scanner.databinding.ActivityMainBindingImpl;
import com.cuitianci.scanner.databinding.FragmentAllNameCardBindingImpl;
import com.cuitianci.scanner.databinding.FragmentCameraBindingImpl;
import com.cuitianci.scanner.databinding.FragmentChooseGroupBindingImpl;
import com.cuitianci.scanner.databinding.FragmentNameCardHolderBindingImpl;
import com.cuitianci.scanner.databinding.FragmentPersonalCenterBindingImpl;
import com.cuitianci.scanner.databinding.ItemBaseInfoBindingImpl;
import com.cuitianci.scanner.databinding.ItemNameCardBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTALLNAMECARD = 2;

  private static final int LAYOUT_FRAGMENTCAMERA = 3;

  private static final int LAYOUT_FRAGMENTCHOOSEGROUP = 4;

  private static final int LAYOUT_FRAGMENTNAMECARDHOLDER = 5;

  private static final int LAYOUT_FRAGMENTPERSONALCENTER = 6;

  private static final int LAYOUT_ITEMBASEINFO = 7;

  private static final int LAYOUT_ITEMNAMECARD = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.cuitianci.scanner.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.cuitianci.scanner.R.layout.fragment_all_name_card, LAYOUT_FRAGMENTALLNAMECARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.cuitianci.scanner.R.layout.fragment_camera, LAYOUT_FRAGMENTCAMERA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.cuitianci.scanner.R.layout.fragment_choose_group, LAYOUT_FRAGMENTCHOOSEGROUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.cuitianci.scanner.R.layout.fragment_name_card_holder, LAYOUT_FRAGMENTNAMECARDHOLDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.cuitianci.scanner.R.layout.fragment_personal_center, LAYOUT_FRAGMENTPERSONALCENTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.cuitianci.scanner.R.layout.item_base_info, LAYOUT_ITEMBASEINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.cuitianci.scanner.R.layout.item_name_card, LAYOUT_ITEMNAMECARD);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTALLNAMECARD: {
          if ("layout/fragment_all_name_card_0".equals(tag)) {
            return new FragmentAllNameCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_all_name_card is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCAMERA: {
          if ("layout/fragment_camera_0".equals(tag)) {
            return new FragmentCameraBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_camera is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHOOSEGROUP: {
          if ("layout/fragment_choose_group_0".equals(tag)) {
            return new FragmentChooseGroupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_choose_group is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNAMECARDHOLDER: {
          if ("layout/fragment_name_card_holder_0".equals(tag)) {
            return new FragmentNameCardHolderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_name_card_holder is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPERSONALCENTER: {
          if ("layout/fragment_personal_center_0".equals(tag)) {
            return new FragmentPersonalCenterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_personal_center is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMBASEINFO: {
          if ("layout/item_base_info_0".equals(tag)) {
            return new ItemBaseInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_base_info is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMNAMECARD: {
          if ("layout/item_name_card_0".equals(tag)) {
            return new ItemNameCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_name_card is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "baseInfo");
      sKeys.put(2, "nameCard");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_main_0", com.cuitianci.scanner.R.layout.activity_main);
      sKeys.put("layout/fragment_all_name_card_0", com.cuitianci.scanner.R.layout.fragment_all_name_card);
      sKeys.put("layout/fragment_camera_0", com.cuitianci.scanner.R.layout.fragment_camera);
      sKeys.put("layout/fragment_choose_group_0", com.cuitianci.scanner.R.layout.fragment_choose_group);
      sKeys.put("layout/fragment_name_card_holder_0", com.cuitianci.scanner.R.layout.fragment_name_card_holder);
      sKeys.put("layout/fragment_personal_center_0", com.cuitianci.scanner.R.layout.fragment_personal_center);
      sKeys.put("layout/item_base_info_0", com.cuitianci.scanner.R.layout.item_base_info);
      sKeys.put("layout/item_name_card_0", com.cuitianci.scanner.R.layout.item_name_card);
    }
  }
}
