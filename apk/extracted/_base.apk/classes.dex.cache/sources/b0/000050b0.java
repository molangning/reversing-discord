package p401w9;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.Arrays;

/* renamed from: w9.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13440d0 {

    /* renamed from: a */
    Object[] f34679a = new Object[8];

    /* renamed from: b */
    int f34680b = 0;

    /* renamed from: c */
    C13438c0 f34681c;

    /* renamed from: a */
    public final C13440d0 m2487a(Object obj, Object obj2) {
        int i = this.f34680b + 1;
        Object[] objArr = this.f34679a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = ViewDefaults.NUMBER_OF_LINES;
            }
            this.f34679a = Arrays.copyOf(objArr, i3);
        }
        C13462w.m2435a(obj, obj2);
        Object[] objArr2 = this.f34679a;
        int i4 = this.f34680b;
        int i5 = i4 + i4;
        objArr2[i5] = obj;
        objArr2[i5 + 1] = obj2;
        this.f34680b = i4 + 1;
        return this;
    }

    /* renamed from: b */
    public final AbstractC13442e0 m2486b() {
        C13438c0 c13438c0 = this.f34681c;
        if (c13438c0 == null) {
            C13445g m2479g = C13445g.m2479g(this.f34680b, this.f34679a, this);
            C13438c0 c13438c02 = this.f34681c;
            if (c13438c02 == null) {
                return m2479g;
            }
            throw c13438c02.m2490a();
        }
        throw c13438c0.m2490a();
    }
}