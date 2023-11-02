package p380v4;

import com.facebook.react.uimanager.ViewDefaults;

/* renamed from: v4.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13068h implements InterfaceC13069i {

    /* renamed from: d */
    public static final InterfaceC13069i f33869d = m3324d(ViewDefaults.NUMBER_OF_LINES, true, true);

    /* renamed from: a */
    int f33870a;

    /* renamed from: b */
    boolean f33871b;

    /* renamed from: c */
    boolean f33872c;

    private C13068h(int i, boolean z, boolean z2) {
        this.f33870a = i;
        this.f33871b = z;
        this.f33872c = z2;
    }

    /* renamed from: d */
    public static InterfaceC13069i m3324d(int i, boolean z, boolean z2) {
        return new C13068h(i, z, z2);
    }

    @Override // p380v4.InterfaceC13069i
    /* renamed from: a */
    public boolean mo3323a() {
        return this.f33872c;
    }

    @Override // p380v4.InterfaceC13069i
    /* renamed from: b */
    public boolean mo3322b() {
        return this.f33871b;
    }

    @Override // p380v4.InterfaceC13069i
    /* renamed from: c */
    public int mo3321c() {
        return this.f33870a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13068h)) {
            return false;
        }
        C13068h c13068h = (C13068h) obj;
        if (this.f33870a == c13068h.f33870a && this.f33871b == c13068h.f33871b && this.f33872c == c13068h.f33872c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f33870a ^ (this.f33871b ? 4194304 : 0)) ^ (this.f33872c ? 8388608 : 0);
    }
}
