package com.cuitianci.scanner.databinding;
import com.cuitianci.scanner.R;
import com.cuitianci.scanner.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemNameCardBindingImpl extends ItemNameCardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemNameCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemNameCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvCompany.setTag(null);
        this.tvName.setTag(null);
        this.tvPosition.setTag(null);
        this.tvTime.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.nameCard == variableId) {
            setNameCard((com.cuitianci.scanner.bean.NameCardBean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNameCard(@Nullable com.cuitianci.scanner.bean.NameCardBean NameCard) {
        this.mNameCard = NameCard;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.nameCard);
        super.requestRebind();
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
        java.lang.String nameCardCompany = null;
        java.lang.String nameCardPosition = null;
        java.lang.String nameCardName = null;
        com.cuitianci.scanner.bean.NameCardBean nameCard = mNameCard;
        java.lang.String nameCardAddedTime = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (nameCard != null) {
                    // read nameCard.company
                    nameCardCompany = nameCard.getCompany();
                    // read nameCard.position
                    nameCardPosition = nameCard.getPosition();
                    // read nameCard.name
                    nameCardName = nameCard.getName();
                    // read nameCard.addedTime
                    nameCardAddedTime = nameCard.getAddedTime();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCompany, nameCardCompany);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, nameCardName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPosition, nameCardPosition);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTime, nameCardAddedTime);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): nameCard
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}