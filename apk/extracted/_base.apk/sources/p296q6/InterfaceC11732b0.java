package p296q6;

import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import p153i8.InterfaceC7451h;
import p195k8.C9208y;

/* renamed from: q6.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC11732b0 {

    /* renamed from: q6.b0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11733a {

        /* renamed from: a */
        public final int f30576a;

        /* renamed from: b */
        public final byte[] f30577b;

        /* renamed from: c */
        public final int f30578c;

        /* renamed from: d */
        public final int f30579d;

        public C11733a(int i, byte[] bArr, int i2, int i3) {
            this.f30576a = i;
            this.f30577b = bArr;
            this.f30578c = i2;
            this.f30579d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C11733a.class != obj.getClass()) {
                return false;
            }
            C11733a c11733a = (C11733a) obj;
            if (this.f30576a == c11733a.f30576a && this.f30578c == c11733a.f30578c && this.f30579d == c11733a.f30579d && Arrays.equals(this.f30577b, c11733a.f30577b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f30576a * 31) + Arrays.hashCode(this.f30577b)) * 31) + this.f30578c) * 31) + this.f30579d;
        }
    }

    /* renamed from: a */
    void mo6170a(C9208y c9208y, int i);

    /* renamed from: b */
    void mo6169b(C9208y c9208y, int i, int i2);

    /* renamed from: c */
    void mo6168c(Format format);

    /* renamed from: d */
    int mo6167d(InterfaceC7451h interfaceC7451h, int i, boolean z);

    /* renamed from: e */
    int mo6166e(InterfaceC7451h interfaceC7451h, int i, boolean z, int i2);

    /* renamed from: f */
    void mo6162f(long j, int i, int i2, int i3, C11733a c11733a);
}
