package p381v5;

import java.util.Arrays;
import p347t5.C12588b;

/* renamed from: v5.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13092h {

    /* renamed from: a */
    private final C12588b f33937a;

    /* renamed from: b */
    private final byte[] f33938b;

    public C13092h(C12588b c12588b, byte[] bArr) {
        if (c12588b != null) {
            if (bArr != null) {
                this.f33937a = c12588b;
                this.f33938b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    /* renamed from: a */
    public byte[] m3307a() {
        return this.f33938b;
    }

    /* renamed from: b */
    public C12588b m3306b() {
        return this.f33937a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13092h)) {
            return false;
        }
        C13092h c13092h = (C13092h) obj;
        if (!this.f33937a.equals(c13092h.f33937a)) {
            return false;
        }
        return Arrays.equals(this.f33938b, c13092h.f33938b);
    }

    public int hashCode() {
        return ((this.f33937a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f33938b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f33937a + ", bytes=[...]}";
    }
}