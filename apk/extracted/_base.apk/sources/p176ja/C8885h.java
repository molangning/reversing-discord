package p176ja;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ja.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8885h {

    /* renamed from: a */
    private final SimpleArrayMap<String, C8886i> f23273a = new SimpleArrayMap<>();

    /* renamed from: b */
    private final SimpleArrayMap<String, PropertyValuesHolder[]> f23274b = new SimpleArrayMap<>();

    /* renamed from: a */
    private static void m17099a(C8885h c8885h, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c8885h.m17092h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c8885h.m17091i(objectAnimator.getPropertyName(), C8886i.m17089b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    /* renamed from: b */
    public static C8885h m17098b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return m17097c(context, resourceId);
        }
        return null;
    }

    /* renamed from: c */
    public static C8885h m17097c(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m17096d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m17096d(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: d */
    private static C8885h m17096d(List<Animator> list) {
        C8885h c8885h = new C8885h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m17099a(c8885h, list.get(i));
        }
        return c8885h;
    }

    /* renamed from: e */
    public C8886i m17095e(String str) {
        if (m17093g(str)) {
            return this.f23273a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8885h)) {
            return false;
        }
        return this.f23273a.equals(((C8885h) obj).f23273a);
    }

    /* renamed from: f */
    public long m17094f() {
        int size = this.f23273a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C8886i m39521n = this.f23273a.m39521n(i);
            j = Math.max(j, m39521n.m17088c() + m39521n.m17087d());
        }
        return j;
    }

    /* renamed from: g */
    public boolean m17093g(String str) {
        return this.f23273a.get(str) != null;
    }

    /* renamed from: h */
    public void m17092h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f23274b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f23273a.hashCode();
    }

    /* renamed from: i */
    public void m17091i(String str, C8886i c8886i) {
        this.f23273a.put(str, c8886i);
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f23273a + "}\n";
    }
}
