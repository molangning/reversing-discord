package p368uc;

import p136hc.C7069o;

/* renamed from: uc.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12948c {

    /* renamed from: a */
    private final int f33660a;

    /* renamed from: b */
    private final int[] f33661b;

    /* renamed from: c */
    private final C7069o[] f33662c;

    public C12948c(int i, int[] iArr, int i2, int i3, int i4) {
        this.f33660a = i;
        this.f33661b = iArr;
        float f = i4;
        this.f33662c = new C7069o[]{new C7069o(i2, f), new C7069o(i3, f)};
    }

    /* renamed from: a */
    public C7069o[] m3622a() {
        return this.f33662c;
    }

    /* renamed from: b */
    public int[] m3621b() {
        return this.f33661b;
    }

    /* renamed from: c */
    public int m3620c() {
        return this.f33660a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12948c) || this.f33660a != ((C12948c) obj).f33660a) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f33660a;
    }
}