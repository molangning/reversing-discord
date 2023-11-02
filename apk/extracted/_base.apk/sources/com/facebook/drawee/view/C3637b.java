package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import p006a5.C0025b;
import p345t3.C12574a;

/* renamed from: com.facebook.drawee.view.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3637b extends C3636a<GenericDraweeHierarchy> {
    public C3637b(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context);
        setHierarchy(genericDraweeHierarchy);
    }

    protected void inflateHierarchy(Context context, AttributeSet attributeSet) {
        if (C0025b.m41375d()) {
            C0025b.m41378a("GenericDraweeView#inflateHierarchy");
        }
        GenericDraweeHierarchyBuilder m4776d = C12574a.m4776d(context, attributeSet);
        setAspectRatio(m4776d.m31442f());
        setHierarchy(m4776d.m31447a());
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
    }

    public C3637b(Context context) {
        super(context);
        inflateHierarchy(context, null);
    }

    public C3637b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflateHierarchy(context, attributeSet);
    }

    public C3637b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflateHierarchy(context, attributeSet);
    }

    @TargetApi(21)
    public C3637b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        inflateHierarchy(context, attributeSet);
    }
}
