package p230m8;

import com.google.android.exoplayer2.AbstractC4399f;
import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;
import p151i6.C7406q;
import p195k8.C9191p0;
import p195k8.C9208y;
import p228m6.C10271g;

/* renamed from: m8.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10357b extends AbstractC4399f {

    /* renamed from: v */
    private final C10271g f27091v;

    /* renamed from: w */
    private final C9208y f27092w;

    /* renamed from: x */
    private long f27093x;

    /* renamed from: y */
    private InterfaceC10356a f27094y;

    /* renamed from: z */
    private long f27095z;

    public C10357b() {
        super(6);
        this.f27091v = new C10271g(1);
        this.f27092w = new C9208y();
    }

    /* renamed from: M */
    private float[] m11677M(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f27092w.m16101N(byteBuffer.array(), byteBuffer.limit());
        this.f27092w.m16099P(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.f27092w.m16081q());
        }
        return fArr;
    }

    /* renamed from: N */
    private void m11676N() {
        InterfaceC10356a interfaceC10356a = this.f27094y;
        if (interfaceC10356a != null) {
            interfaceC10356a.mo11678c();
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: D */
    protected void mo3123D() {
        m11676N();
    }

    @Override // com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: F */
    protected void mo3122F(long j, boolean z) {
        this.f27095z = Long.MIN_VALUE;
        m11676N();
    }

    @Override // com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: J */
    protected void mo3121J(Format[] formatArr, long j, long j2) {
        this.f27093x = j2;
    }

    @Override // p151i6.InterfaceC7407r
    /* renamed from: a */
    public int mo3110a(Format format) {
        if ("application/x-camera-motion".equals(format.f11197u)) {
            return C7406q.m20725a(4);
        }
        return C7406q.m20725a(0);
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: c */
    public boolean mo3109c() {
        return mo28968g();
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: e */
    public boolean mo3108e() {
        return true;
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0, p151i6.InterfaceC7407r
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.google.android.exoplayer2.AbstractC4399f, com.google.android.exoplayer2.C4446s0.InterfaceC4448b
    /* renamed from: j */
    public void mo11675j(int i, Object obj) {
        if (i == 7) {
            this.f27094y = (InterfaceC10356a) obj;
        } else {
            super.mo11675j(i, obj);
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: r */
    public void mo3107r(long j, long j2) {
        while (!mo28968g() && this.f27095z < 100000 + j) {
            this.f27091v.mo3126f();
            if (m29427K(m29422z(), this.f27091v, false) == -4 && !this.f27091v.m11988l()) {
                C10271g c10271g = this.f27091v;
                this.f27095z = c10271g.f26745n;
                if (this.f27094y != null && !c10271g.m11989k()) {
                    this.f27091v.m11976q();
                    float[] m11677M = m11677M((ByteBuffer) C9191p0.m16243j(this.f27091v.f26743l));
                    if (m11677M != null) {
                        ((InterfaceC10356a) C9191p0.m16243j(this.f27094y)).mo11679b(this.f27095z - this.f27093x, m11677M);
                    }
                }
            } else {
                return;
            }
        }
    }
}