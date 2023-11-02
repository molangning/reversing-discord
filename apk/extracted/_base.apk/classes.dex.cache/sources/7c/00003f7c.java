package p202kj;

import p162ij.InterfaceC7664p;

/* renamed from: kj.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C9496g {

    /* renamed from: a */
    private final InterfaceC7664p<?> f25165a;

    /* renamed from: b */
    private final int f25166b;

    /* renamed from: c */
    private final int f25167c;

    public C9496g(InterfaceC7664p<?> interfaceC7664p, int i, int i2) {
        if (interfaceC7664p != null) {
            if (i >= 0) {
                if (i2 > i) {
                    this.f25165a = interfaceC7664p;
                    this.f25166b = i;
                    this.f25167c = i2;
                    return;
                }
                throw new IllegalArgumentException("End index " + i2 + " must be greater than start index " + i + " (" + interfaceC7664p.name() + ")");
            }
            throw new IllegalArgumentException("Negative start index: " + i + " (" + interfaceC7664p.name() + ")");
        }
        throw new NullPointerException("Missing chronological element.");
    }

    /* renamed from: a */
    public InterfaceC7664p<?> m14538a() {
        return this.f25165a;
    }

    /* renamed from: b */
    public int m14537b() {
        return this.f25167c;
    }

    /* renamed from: c */
    public int m14536c() {
        return this.f25166b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9496g)) {
            return false;
        }
        C9496g c9496g = (C9496g) obj;
        if (this.f25165a.equals(c9496g.f25165a) && this.f25166b == c9496g.f25166b && this.f25167c == c9496g.f25167c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f25165a.hashCode() + ((this.f25166b | (this.f25167c << 16)) * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append(C9496g.class.getName());
        sb2.append("[element=");
        sb2.append(this.f25165a.name());
        sb2.append(",start-index=");
        sb2.append(this.f25166b);
        sb2.append(",end-index=");
        sb2.append(this.f25167c);
        sb2.append(']');
        return sb2.toString();
    }
}