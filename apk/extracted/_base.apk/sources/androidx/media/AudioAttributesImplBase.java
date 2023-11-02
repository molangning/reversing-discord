package androidx.media;

import java.util.Arrays;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f4555a = 0;

    /* renamed from: b */
    public int f4556b = 0;

    /* renamed from: c */
    public int f4557c = 0;

    /* renamed from: d */
    public int f4558d = -1;

    /* renamed from: a */
    public int m35963a() {
        return this.f4556b;
    }

    /* renamed from: b */
    public int m35962b() {
        int i = this.f4557c;
        int m35961c = m35961c();
        if (m35961c == 6) {
            i |= 4;
        } else if (m35961c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int m35961c() {
        int i = this.f4558d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.m35966a(false, this.f4557c, this.f4555a);
    }

    /* renamed from: d */
    public int m35960d() {
        return this.f4555a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f4556b != audioAttributesImplBase.m35963a() || this.f4557c != audioAttributesImplBase.m35962b() || this.f4555a != audioAttributesImplBase.m35960d() || this.f4558d != audioAttributesImplBase.f4558d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4556b), Integer.valueOf(this.f4557c), Integer.valueOf(this.f4555a), Integer.valueOf(this.f4558d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f4558d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f4558d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.m35965b(this.f4555a));
        sb2.append(" content=");
        sb2.append(this.f4556b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f4557c).toUpperCase());
        return sb2.toString();
    }
}
