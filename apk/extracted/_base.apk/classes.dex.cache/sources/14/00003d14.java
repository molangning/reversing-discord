package p176ja;

import android.util.Property;
import android.view.ViewGroup;
import p155ia.C7484f;

/* renamed from: ja.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8881d extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f23266a = new C8881d("childrenAlpha");

    private C8881d(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(C7484f.f20186B);
        if (f != null) {
            return f;
        }
        return Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(ViewGroup viewGroup, Float f) {
        float floatValue = f.floatValue();
        viewGroup.setTag(C7484f.f20186B, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}