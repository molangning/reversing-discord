package p345t3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.C3628a;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import p006a5.C0025b;

/* renamed from: t3.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12574a {
    /* renamed from: a */
    private static Drawable m4779a(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getResources().getDrawable(resourceId);
    }

    /* renamed from: b */
    private static C3628a m4778b(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder) {
        if (genericDraweeHierarchyBuilder.m31429s() == null) {
            genericDraweeHierarchyBuilder.m31449K(new C3628a());
        }
        return genericDraweeHierarchyBuilder.m31429s();
    }

    /* renamed from: c */
    private static ScalingUtils.ScaleType m4777c(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return ScalingUtils.ScaleType.f9836a;
            case 1:
                return ScalingUtils.ScaleType.f9839d;
            case 2:
                return ScalingUtils.ScaleType.f9840e;
            case 3:
                return ScalingUtils.ScaleType.f9841f;
            case 4:
                return ScalingUtils.ScaleType.f9842g;
            case 5:
                return ScalingUtils.ScaleType.f9843h;
            case 6:
                return ScalingUtils.ScaleType.f9844i;
            case 7:
                return ScalingUtils.ScaleType.f9845j;
            case 8:
                return ScalingUtils.ScaleType.f9846k;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    /* renamed from: d */
    public static GenericDraweeHierarchyBuilder m4776d(Context context, AttributeSet attributeSet) {
        if (C0025b.m41375d()) {
            C0025b.m41378a("GenericDraweeHierarchyBuilder#inflateBuilder");
        }
        GenericDraweeHierarchyBuilder m4775e = m4775e(new GenericDraweeHierarchyBuilder(context.getResources()), context, attributeSet);
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
        return m4775e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c4, code lost:
        if (r13 != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01de, code lost:
        if (r15 != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01e0, code lost:
        r4 = true;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.drawee.generic.GenericDraweeHierarchyBuilder m4775e(com.facebook.drawee.generic.GenericDraweeHierarchyBuilder r17, android.content.Context r18, android.util.AttributeSet r19) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p345t3.C12574a.m4775e(com.facebook.drawee.generic.GenericDraweeHierarchyBuilder, android.content.Context, android.util.AttributeSet):com.facebook.drawee.generic.GenericDraweeHierarchyBuilder");
    }
}
