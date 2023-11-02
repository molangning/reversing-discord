package p151i6;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.InterfaceC4483u0;
import com.google.android.exoplayer2.metadata.C4430a;
import java.util.ArrayList;
import p040c7.InterfaceC2432p;
import p060d7.InterfaceC5779e;
import p193k6.C9073c0;
import p193k6.C9086e;
import p193k6.C9099j0;
import p193k6.InterfaceC9090g;
import p193k6.InterfaceC9115q;
import p193k6.InterfaceC9118r;
import p195k8.C9197r;
import p213l8.C10074h;
import p213l8.InterfaceC10062a0;
import p230m8.C10357b;
import p383v7.C13141m;
import p383v7.InterfaceC13140l;

/* renamed from: i6.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7394e implements InterfaceC7409t {

    /* renamed from: a */
    private final Context f19904a;

    /* renamed from: d */
    private boolean f19907d;

    /* renamed from: f */
    private boolean f19909f;

    /* renamed from: g */
    private boolean f19910g;

    /* renamed from: h */
    private boolean f19911h;

    /* renamed from: i */
    private boolean f19912i;

    /* renamed from: j */
    private boolean f19913j;

    /* renamed from: k */
    private boolean f19914k;

    /* renamed from: b */
    private int f19905b = 0;

    /* renamed from: c */
    private long f19906c = 5000;

    /* renamed from: e */
    private InterfaceC2432p f19908e = InterfaceC2432p.f6724a;

    public C7394e(Context context) {
        this.f19904a = context;
    }

    @Override // p151i6.InterfaceC7409t
    /* renamed from: a */
    public InterfaceC4483u0[] mo20718a(Handler handler, InterfaceC10062a0 interfaceC10062a0, InterfaceC9115q interfaceC9115q, InterfaceC13140l interfaceC13140l, InterfaceC5779e interfaceC5779e) {
        ArrayList<InterfaceC4483u0> arrayList = new ArrayList<>();
        m20762h(this.f19904a, this.f19905b, this.f19908e, this.f19907d, handler, interfaceC10062a0, this.f19906c, arrayList);
        InterfaceC9118r m20767c = m20767c(this.f19904a, this.f19912i, this.f19913j, this.f19914k);
        if (m20767c != null) {
            m20768b(this.f19904a, this.f19905b, this.f19908e, this.f19907d, m20767c, handler, interfaceC9115q, arrayList);
        }
        m20763g(this.f19904a, interfaceC13140l, handler.getLooper(), this.f19905b, arrayList);
        m20765e(this.f19904a, interfaceC5779e, handler.getLooper(), this.f19905b, arrayList);
        m20766d(this.f19904a, this.f19905b, arrayList);
        m20764f(this.f19904a, handler, this.f19905b, arrayList);
        return (InterfaceC4483u0[]) arrayList.toArray(new InterfaceC4483u0[0]);
    }

    /* renamed from: b */
    protected void m20768b(Context context, int i, InterfaceC2432p interfaceC2432p, boolean z, InterfaceC9118r interfaceC9118r, Handler handler, InterfaceC9115q interfaceC9115q, ArrayList<InterfaceC4483u0> arrayList) {
        int i2;
        C9099j0 c9099j0 = new C9099j0(context, interfaceC2432p, z, handler, interfaceC9115q, interfaceC9118r);
        c9099j0.m33365g0(this.f19909f);
        c9099j0.m33364h0(this.f19910g);
        c9099j0.m33363i0(this.f19911h);
        arrayList.add(c9099j0);
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (InterfaceC4483u0) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, InterfaceC9115q.class, InterfaceC9118r.class).newInstance(handler, interfaceC9115q, interfaceC9118r));
                    C9197r.m16180f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i2;
                    i2 = size;
                    try {
                        int i3 = i2 + 1;
                        arrayList.add(i2, (InterfaceC4483u0) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC9115q.class, InterfaceC9118r.class).newInstance(handler, interfaceC9115q, interfaceC9118r));
                        C9197r.m16180f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused2) {
                    }
                    try {
                        arrayList.add(i3, (InterfaceC4483u0) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC9115q.class, InterfaceC9118r.class).newInstance(handler, interfaceC9115q, interfaceC9118r));
                        C9197r.m16180f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        return;
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating FFmpeg extension", e);
                    }
                }
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating Opus extension", e2);
            }
        } catch (ClassNotFoundException unused4) {
        }
        try {
            int i32 = i2 + 1;
            try {
                arrayList.add(i2, (InterfaceC4483u0) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC9115q.class, InterfaceC9118r.class).newInstance(handler, interfaceC9115q, interfaceC9118r));
                C9197r.m16180f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
            } catch (ClassNotFoundException unused5) {
                i2 = i32;
                i32 = i2;
                arrayList.add(i32, (InterfaceC4483u0) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC9115q.class, InterfaceC9118r.class).newInstance(handler, interfaceC9115q, interfaceC9118r));
                C9197r.m16180f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
            }
            arrayList.add(i32, (InterfaceC4483u0) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC9115q.class, InterfaceC9118r.class).newInstance(handler, interfaceC9115q, interfaceC9118r));
            C9197r.m16180f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
        } catch (Exception e3) {
            throw new RuntimeException("Error instantiating FLAC extension", e3);
        }
    }

    /* renamed from: c */
    protected InterfaceC9118r m20767c(Context context, boolean z, boolean z2, boolean z3) {
        return new C9073c0(C9086e.m16687b(context), new C9073c0.C9077d(new InterfaceC9090g[0]), z, z2, z3);
    }

    /* renamed from: d */
    protected void m20766d(Context context, int i, ArrayList<InterfaceC4483u0> arrayList) {
        arrayList.add(new C10357b());
    }

    /* renamed from: e */
    protected void m20765e(Context context, InterfaceC5779e interfaceC5779e, Looper looper, int i, ArrayList<InterfaceC4483u0> arrayList) {
        arrayList.add(new C4430a(interfaceC5779e, looper));
    }

    /* renamed from: f */
    protected void m20764f(Context context, Handler handler, int i, ArrayList<InterfaceC4483u0> arrayList) {
    }

    /* renamed from: g */
    protected void m20763g(Context context, InterfaceC13140l interfaceC13140l, Looper looper, int i, ArrayList<InterfaceC4483u0> arrayList) {
        arrayList.add(new C13141m(interfaceC13140l, looper));
    }

    /* renamed from: h */
    protected void m20762h(Context context, int i, InterfaceC2432p interfaceC2432p, boolean z, Handler handler, InterfaceC10062a0 interfaceC10062a0, long j, ArrayList<InterfaceC4483u0> arrayList) {
        int i2;
        C10074h c10074h = new C10074h(context, interfaceC2432p, j, z, handler, interfaceC10062a0, 50);
        c10074h.m33365g0(this.f19909f);
        c10074h.m33364h0(this.f19910g);
        c10074h.m33363i0(this.f19911h);
        arrayList.add(c10074h);
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating VP9 extension", e);
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            try {
                arrayList.add(size, (InterfaceC4483u0) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, InterfaceC10062a0.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, interfaceC10062a0, 50));
                C9197r.m16180f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
            } catch (ClassNotFoundException unused2) {
                size = i2;
                i2 = size;
                arrayList.add(i2, (InterfaceC4483u0) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, InterfaceC10062a0.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, interfaceC10062a0, 50));
                C9197r.m16180f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
            }
            arrayList.add(i2, (InterfaceC4483u0) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, InterfaceC10062a0.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, interfaceC10062a0, 50));
            C9197r.m16180f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
        } catch (ClassNotFoundException unused3) {
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating AV1 extension", e2);
        }
    }

    /* renamed from: i */
    public C7394e m20761i(int i) {
        this.f19905b = i;
        return this;
    }
}
