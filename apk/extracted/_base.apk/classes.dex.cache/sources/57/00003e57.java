package p195k8;

import android.util.SparseBooleanArray;

/* renamed from: k8.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9203v {

    /* renamed from: a */
    private final SparseBooleanArray f24209a = new SparseBooleanArray();

    /* renamed from: a */
    public void m16149a(int i) {
        this.f24209a.append(i, true);
    }

    /* renamed from: b */
    public boolean mo16148b(int i) {
        return this.f24209a.get(i);
    }

    /* renamed from: c */
    public boolean mo16147c(int... iArr) {
        for (int i : iArr) {
            if (mo16148b(i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public int mo16146d(int i) {
        boolean z;
        if (i >= 0 && i < m16145e()) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        return this.f24209a.keyAt(i);
    }

    /* renamed from: e */
    public int m16145e() {
        return this.f24209a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9203v)) {
            return false;
        }
        return this.f24209a.equals(((C9203v) obj).f24209a);
    }

    public int hashCode() {
        return this.f24209a.hashCode();
    }
}