package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.common.internal.Supplier;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.imagepipeline.request.ImageRequest;
import p006a5.C0025b;
import p075e3.C6104f;
import p190k3.C9052a;
import p394w2.C13379j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SimpleDraweeView extends C3637b {
    private static Supplier<? extends AbstractDraweeControllerBuilder> sDraweecontrollerbuildersupplier;
    private AbstractDraweeControllerBuilder mControllerBuilder;

    public SimpleDraweeView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        int resourceId;
        try {
            if (C0025b.m41375d()) {
                C0025b.m41378a("SimpleDraweeView#init");
            }
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                C13379j.m2676h(sDraweecontrollerbuildersupplier, "SimpleDraweeView was not initialized!");
                this.mControllerBuilder = sDraweecontrollerbuildersupplier.get();
            }
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9052a.f23725J);
                int i = C9052a.f23727L;
                if (obtainStyledAttributes.hasValue(i)) {
                    setImageURI(Uri.parse(obtainStyledAttributes.getString(i)), (Object) null);
                } else {
                    int i2 = C9052a.f23726K;
                    if (obtainStyledAttributes.hasValue(i2) && (resourceId = obtainStyledAttributes.getResourceId(i2, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                }
                obtainStyledAttributes.recycle();
            }
        } finally {
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
    }

    public static void initialize(Supplier<? extends AbstractDraweeControllerBuilder> supplier) {
        sDraweecontrollerbuildersupplier = supplier;
    }

    public static void shutDown() {
        sDraweecontrollerbuildersupplier = null;
    }

    protected AbstractDraweeControllerBuilder getControllerBuilder() {
        return this.mControllerBuilder;
    }

    public void setActualImageResource(int i) {
        setActualImageResource(i, null);
    }

    public void setImageRequest(ImageRequest imageRequest) {
        setController(this.mControllerBuilder.m31625D(imageRequest).mo3373b(getController()).build());
    }

    @Override // com.facebook.drawee.view.C3636a, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    @Override // com.facebook.drawee.view.C3636a, android.widget.ImageView
    public void setImageURI(Uri uri) {
        setImageURI(uri, (Object) null);
    }

    public void setActualImageResource(int i, Object obj) {
        setImageURI(C6104f.m23568e(i), obj);
    }

    public void setImageURI(String str) {
        setImageURI(str, (Object) null);
    }

    public SimpleDraweeView(Context context) {
        super(context);
        init(context, null);
    }

    public void setImageURI(Uri uri, Object obj) {
        setController(this.mControllerBuilder.m31628A(obj).mo3374a(uri).mo3373b(getController()).build());
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    @TargetApi(21)
    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context, attributeSet);
    }

    public void setImageURI(String str, Object obj) {
        setImageURI(str != null ? Uri.parse(str) : null, obj);
    }
}
