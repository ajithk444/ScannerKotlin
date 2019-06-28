package com.cuitianci.scanner.databinding;
import com.cuitianci.scanner.R;
import com.cuitianci.scanner.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPersonalCenterBindingImpl extends FragmentPersonalCenterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nsv, 1);
        sViewsWithIds.put(R.id.iv_bg, 2);
        sViewsWithIds.put(R.id.iv_portrait, 3);
        sViewsWithIds.put(R.id.tv_name, 4);
        sViewsWithIds.put(R.id.cv_person_info, 5);
        sViewsWithIds.put(R.id.cv_company_info, 6);
        sViewsWithIds.put(R.id.cv_labels, 7);
        sViewsWithIds.put(R.id.chip_group, 8);
        sViewsWithIds.put(R.id.c_color_bg, 9);
        sViewsWithIds.put(R.id.v_bar, 10);
        sViewsWithIds.put(R.id.tv_title, 11);
        sViewsWithIds.put(R.id.tv_back, 12);
        sViewsWithIds.put(R.id.tv_edit, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPersonalCenterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentPersonalCenterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[9]
            , (com.cuitianci.scanner.view.DynamicAddableChipGroup) bindings[8]
            , (com.google.android.material.card.MaterialCardView) bindings[6]
            , (com.google.android.material.card.MaterialCardView) bindings[7]
            , (com.cuitianci.scanner.view.InfoListCardView) bindings[5]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (androidx.core.widget.NestedScrollView) bindings[1]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[11]
            , (android.view.View) bindings[10]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}