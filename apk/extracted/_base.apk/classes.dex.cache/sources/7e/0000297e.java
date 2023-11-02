package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.AbstractC4399f;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p060d7.C5778d;
import p060d7.InterfaceC5775b;
import p060d7.InterfaceC5776c;
import p060d7.InterfaceC5779e;
import p151i6.C7399j;
import p151i6.C7406q;
import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: com.google.android.exoplayer2.metadata.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4430a extends AbstractC4399f implements Handler.Callback {

    /* renamed from: A */
    private final long[] f11659A;

    /* renamed from: B */
    private int f11660B;

    /* renamed from: C */
    private int f11661C;

    /* renamed from: D */
    private InterfaceC5775b f11662D;

    /* renamed from: E */
    private boolean f11663E;

    /* renamed from: F */
    private boolean f11664F;

    /* renamed from: G */
    private long f11665G;

    /* renamed from: v */
    private final InterfaceC5776c f11666v;

    /* renamed from: w */
    private final InterfaceC5779e f11667w;

    /* renamed from: x */
    private final Handler f11668x;

    /* renamed from: y */
    private final C5778d f11669y;

    /* renamed from: z */
    private final Metadata[] f11670z;

    public C4430a(InterfaceC5779e interfaceC5779e, Looper looper) {
        this(interfaceC5779e, looper, InterfaceC5776c.f16599a);
    }

    /* renamed from: M */
    private void m29244M(Metadata metadata, List<Metadata.InterfaceC4429b> list) {
        for (int i = 0; i < metadata.m29247e(); i++) {
            Format mo6156g = metadata.m29248d(i).mo6156g();
            if (mo6156g != null && this.f11666v.mo24520a(mo6156g)) {
                InterfaceC5775b mo24519b = this.f11666v.mo24519b(mo6156g);
                byte[] bArr = (byte[]) C9149a.m16448e(metadata.m29248d(i).mo6157R());
                this.f11669y.mo3126f();
                this.f11669y.m11977p(bArr.length);
                ((ByteBuffer) C9191p0.m16243j(this.f11669y.f26743l)).put(bArr);
                this.f11669y.m11976q();
                Metadata mo24517a = mo24519b.mo24517a(this.f11669y);
                if (mo24517a != null) {
                    m29244M(mo24517a, list);
                }
            } else {
                list.add(metadata.m29248d(i));
            }
        }
    }

    /* renamed from: N */
    private void m29243N() {
        Arrays.fill(this.f11670z, (Object) null);
        this.f11660B = 0;
        this.f11661C = 0;
    }

    /* renamed from: O */
    private void m29242O(Metadata metadata) {
        Handler handler = this.f11668x;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            m29241P(metadata);
        }
    }

    /* renamed from: P */
    private void m29241P(Metadata metadata) {
        this.f11667w.mo24518i(metadata);
    }

    @Override // com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: D */
    protected void mo3123D() {
        m29243N();
        this.f11662D = null;
    }

    @Override // com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: F */
    protected void mo3122F(long j, boolean z) {
        m29243N();
        this.f11663E = false;
        this.f11664F = false;
    }

    @Override // com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: J */
    protected void mo3121J(Format[] formatArr, long j, long j2) {
        this.f11662D = this.f11666v.mo24519b(formatArr[0]);
    }

    @Override // p151i6.InterfaceC7407r
    /* renamed from: a */
    public int mo3110a(Format format) {
        int i;
        if (this.f11666v.mo24520a(format)) {
            if (format.f11184N == null) {
                i = 4;
            } else {
                i = 2;
            }
            return C7406q.m20725a(i);
        }
        return C7406q.m20725a(0);
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: c */
    public boolean mo3109c() {
        return this.f11664F;
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: e */
    public boolean mo3108e() {
        return true;
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0, p151i6.InterfaceC7407r
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m29241P((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: r */
    public void mo3107r(long j, long j2) {
        if (!this.f11663E && this.f11661C < 5) {
            this.f11669y.mo3126f();
            C7399j m29422z = m29422z();
            int m29427K = m29427K(m29422z, this.f11669y, false);
            if (m29427K == -4) {
                if (this.f11669y.m11988l()) {
                    this.f11663E = true;
                } else {
                    C5778d c5778d = this.f11669y;
                    c5778d.f16600r = this.f11665G;
                    c5778d.m11976q();
                    Metadata mo24517a = ((InterfaceC5775b) C9191p0.m16243j(this.f11662D)).mo24517a(this.f11669y);
                    if (mo24517a != null) {
                        ArrayList arrayList = new ArrayList(mo24517a.m29247e());
                        m29244M(mo24517a, arrayList);
                        if (!arrayList.isEmpty()) {
                            Metadata metadata = new Metadata(arrayList);
                            int i = this.f11660B;
                            int i2 = this.f11661C;
                            int i3 = (i + i2) % 5;
                            this.f11670z[i3] = metadata;
                            this.f11659A[i3] = this.f11669y.f26745n;
                            this.f11661C = i2 + 1;
                        }
                    }
                }
            } else if (m29427K == -5) {
                this.f11665G = ((Format) C9149a.m16448e(m29422z.f19920b)).f11201y;
            }
        }
        if (this.f11661C > 0) {
            long[] jArr = this.f11659A;
            int i4 = this.f11660B;
            if (jArr[i4] <= j) {
                m29242O((Metadata) C9191p0.m16243j(this.f11670z[i4]));
                Metadata[] metadataArr = this.f11670z;
                int i5 = this.f11660B;
                metadataArr[i5] = null;
                this.f11660B = (i5 + 1) % 5;
                this.f11661C--;
            }
        }
        if (this.f11663E && this.f11661C == 0) {
            this.f11664F = true;
        }
    }

    public C4430a(InterfaceC5779e interfaceC5779e, Looper looper, InterfaceC5776c interfaceC5776c) {
        super(5);
        this.f11667w = (InterfaceC5779e) C9149a.m16448e(interfaceC5779e);
        this.f11668x = looper == null ? null : C9191p0.m16217w(looper, this);
        this.f11666v = (InterfaceC5776c) C9149a.m16448e(interfaceC5776c);
        this.f11669y = new C5778d();
        this.f11670z = new Metadata[5];
        this.f11659A = new long[5];
    }
}