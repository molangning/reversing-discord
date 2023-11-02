package p064db;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.C0359c;
import p155ia.C7480b;

/* renamed from: db.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5810a {

    /* renamed from: a */
    private static final int[] f16628a = {16842752, C7480b.f20096K};

    /* renamed from: b */
    private static final int[] f16629b = {C7480b.f20121x};

    /* renamed from: a */
    private static int m24500a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f16628a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId == 0) {
            return resourceId2;
        }
        return resourceId;
    }

    /* renamed from: b */
    private static int m24499b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f16629b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static Context m24498c(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z;
        int m24499b = m24499b(context, attributeSet, i, i2);
        if ((context instanceof C0359c) && ((C0359c) context).m40484c() == m24499b) {
            z = true;
        } else {
            z = false;
        }
        if (m24499b != 0 && !z) {
            C0359c c0359c = new C0359c(context, m24499b);
            int m24500a = m24500a(context, attributeSet);
            if (m24500a != 0) {
                c0359c.getTheme().applyStyle(m24500a, true);
            }
            return c0359c;
        }
        return context;
    }
}
