package p132h8;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import p195k8.C9149a;
import p195k8.C9181k0;
import p195k8.C9182l;
import p213l8.InterfaceC10081m;
import p230m8.C10358c;
import p230m8.C10359d;
import p230m8.C10362e;
import p230m8.InterfaceC10356a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h8.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7032d implements InterfaceC10081m, InterfaceC10356a {

    /* renamed from: i */
    private int f19258i;

    /* renamed from: j */
    private SurfaceTexture f19259j;

    /* renamed from: m */
    private byte[] f19262m;

    /* renamed from: a */
    private final AtomicBoolean f19250a = new AtomicBoolean();

    /* renamed from: b */
    private final AtomicBoolean f19251b = new AtomicBoolean(true);

    /* renamed from: c */
    private final C7029b f19252c = new C7029b();

    /* renamed from: d */
    private final C10358c f19253d = new C10358c();

    /* renamed from: e */
    private final C9181k0<Long> f19254e = new C9181k0<>();

    /* renamed from: f */
    private final C9181k0<C10359d> f19255f = new C9181k0<>();

    /* renamed from: g */
    private final float[] f19256g = new float[16];

    /* renamed from: h */
    private final float[] f19257h = new float[16];

    /* renamed from: k */
    private volatile int f19260k = 0;

    /* renamed from: l */
    private int f19261l = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m21504g(SurfaceTexture surfaceTexture) {
        this.f19250a.set(true);
    }

    /* renamed from: i */
    private void m21502i(byte[] bArr, int i, long j) {
        C10359d c10359d;
        byte[] bArr2 = this.f19262m;
        int i2 = this.f19261l;
        this.f19262m = bArr;
        if (i == -1) {
            i = this.f19260k;
        }
        this.f19261l = i;
        if (i2 == i && Arrays.equals(bArr2, this.f19262m)) {
            return;
        }
        byte[] bArr3 = this.f19262m;
        if (bArr3 != null) {
            c10359d = C10362e.m11664a(bArr3, this.f19261l);
        } else {
            c10359d = null;
        }
        if (c10359d == null || !C7029b.m21513c(c10359d)) {
            c10359d = C10359d.m11668b(this.f19261l);
        }
        this.f19255f.m16368a(j, c10359d);
    }

    @Override // p213l8.InterfaceC10081m
    /* renamed from: a */
    public void mo12341a(long j, long j2, Format format, MediaFormat mediaFormat) {
        this.f19254e.m16368a(j2, Long.valueOf(j));
        m21502i(format.f11175E, format.f11176F, j2);
    }

    @Override // p230m8.InterfaceC10356a
    /* renamed from: b */
    public void mo11679b(long j, float[] fArr) {
        this.f19253d.m11670e(j, fArr);
    }

    @Override // p230m8.InterfaceC10356a
    /* renamed from: c */
    public void mo11678c() {
        this.f19254e.m16366c();
        this.f19253d.m11671d();
        this.f19251b.set(true);
    }

    /* renamed from: e */
    public void m21506e(float[] fArr, boolean z) {
        GLES20.glClear(16384);
        C9182l.m16355b();
        if (this.f19250a.compareAndSet(true, false)) {
            ((SurfaceTexture) C9149a.m16448e(this.f19259j)).updateTexImage();
            C9182l.m16355b();
            if (this.f19251b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f19256g, 0);
            }
            long timestamp = this.f19259j.getTimestamp();
            Long m16362g = this.f19254e.m16362g(timestamp);
            if (m16362g != null) {
                this.f19253d.m11672c(this.f19256g, m16362g.longValue());
            }
            C10359d m16359j = this.f19255f.m16359j(timestamp);
            if (m16359j != null) {
                this.f19252c.m21512d(m16359j);
            }
        }
        Matrix.multiplyMM(this.f19257h, 0, fArr, 0, this.f19256g, 0);
        this.f19252c.m21515a(this.f19258i, this.f19257h, z);
    }

    /* renamed from: f */
    public SurfaceTexture m21505f() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        C9182l.m16355b();
        this.f19252c.m21514b();
        C9182l.m16355b();
        this.f19258i = C9182l.m16350g();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f19258i);
        this.f19259j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: h8.c
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                C7032d.this.m21504g(surfaceTexture2);
            }
        });
        return this.f19259j;
    }

    /* renamed from: h */
    public void m21503h(int i) {
        this.f19260k = i;
    }
}
