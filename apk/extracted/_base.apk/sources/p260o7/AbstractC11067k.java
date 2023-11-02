package p260o7;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.Arrays;
import p195k8.C9191p0;

/* renamed from: o7.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC11067k extends AbstractC11058e {

    /* renamed from: j */
    private byte[] f28987j;

    /* renamed from: k */
    private volatile boolean f28988k;

    public AbstractC11067k(DataSource dataSource, C4515a c4515a, int i, Format format, int i2, Object obj, byte[] bArr) {
        super(dataSource, c4515a, i, format, i2, obj, -9223372036854775807L, -9223372036854775807L);
        AbstractC11067k abstractC11067k;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = C9191p0.f24176f;
            abstractC11067k = this;
        } else {
            abstractC11067k = this;
            bArr2 = bArr;
        }
        abstractC11067k.f28987j = bArr2;
    }

    /* renamed from: i */
    private void m9197i(int i) {
        byte[] bArr = this.f28987j;
        if (bArr.length < i + 16384) {
            this.f28987j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4555e
    /* renamed from: a */
    public final void mo6277a() {
        try {
            this.f28950i.mo6322b(this.f28943b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f28988k) {
                m9197i(i2);
                i = this.f28950i.read(this.f28987j, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f28988k) {
                mo6286g(this.f28987j, i2);
            }
        } finally {
            C9191p0.m16235n(this.f28950i);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4555e
    /* renamed from: c */
    public final void mo6276c() {
        this.f28988k = true;
    }

    /* renamed from: g */
    protected abstract void mo6286g(byte[] bArr, int i);

    /* renamed from: h */
    public byte[] m9198h() {
        return this.f28987j;
    }
}
