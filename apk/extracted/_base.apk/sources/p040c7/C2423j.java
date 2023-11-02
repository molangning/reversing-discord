package p040c7;

import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;
import p193k6.C9103k0;
import p195k8.C9149a;
import p195k8.C9197r;
import p228m6.C10271g;

/* renamed from: c7.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C2423j {

    /* renamed from: a */
    private long f6628a;

    /* renamed from: b */
    private long f6629b;

    /* renamed from: c */
    private boolean f6630c;

    /* renamed from: a */
    private long m33442a(Format format) {
        return (this.f6628a * 1000000) / format.f11179I;
    }

    /* renamed from: b */
    public void m33441b() {
        this.f6628a = 0L;
        this.f6629b = 0L;
        this.f6630c = false;
    }

    /* renamed from: c */
    public long m33440c(Format format, C10271g c10271g) {
        if (this.f6630c) {
            return c10271g.f26745n;
        }
        ByteBuffer byteBuffer = (ByteBuffer) C9149a.m16448e(c10271g.f26743l);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int m16647m = C9103k0.m16647m(i);
        if (m16647m == -1) {
            this.f6630c = true;
            C9197r.m16178h("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return c10271g.f26745n;
        } else if (this.f6628a == 0) {
            long j = c10271g.f26745n;
            this.f6629b = j;
            this.f6628a = m16647m - 529;
            return j;
        } else {
            long m33442a = m33442a(format);
            this.f6628a += m16647m;
            return this.f6629b + m33442a;
        }
    }
}
