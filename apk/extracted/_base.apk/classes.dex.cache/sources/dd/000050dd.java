package p404wc;

import p136hc.C7060f;

/* renamed from: wc.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13485p extends AbstractC13486q {

    /* renamed from: b */
    private final int f34719b;

    /* renamed from: c */
    private final int f34720c;

    public C13485p(int i, int i2, int i3) {
        super(i);
        if (i2 >= 0 && i2 <= 10 && i3 >= 0 && i3 <= 10) {
            this.f34719b = i2;
            this.f34720c = i3;
            return;
        }
        throw C7060f.m21471a();
    }

    /* renamed from: b */
    public int m2395b() {
        return this.f34719b;
    }

    /* renamed from: c */
    public int m2394c() {
        return this.f34720c;
    }

    /* renamed from: d */
    public boolean m2393d() {
        return this.f34719b == 10;
    }

    /* renamed from: e */
    public boolean m2392e() {
        return this.f34720c == 10;
    }
}