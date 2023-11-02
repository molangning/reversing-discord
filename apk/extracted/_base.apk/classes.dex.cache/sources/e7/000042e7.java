package p229m7;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.upstream.C4519c;
import com.google.android.exoplayer2.upstream.DataSource;
import p229m7.C10306i0;
import p296q6.InterfaceC11753o;

/* renamed from: m7.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10309j implements InterfaceC10278a0 {

    /* renamed from: a */
    private final DataSource.Factory f26914a;

    /* renamed from: b */
    private final SparseArray<InterfaceC10278a0> f26915b;

    /* renamed from: c */
    private final int[] f26916c;

    /* renamed from: d */
    private long f26917d;

    /* renamed from: e */
    private long f26918e;

    /* renamed from: f */
    private long f26919f;

    /* renamed from: g */
    private float f26920g;

    /* renamed from: h */
    private float f26921h;

    public C10309j(Context context, InterfaceC11753o interfaceC11753o) {
        this(new C4519c(context), interfaceC11753o);
    }

    /* renamed from: a */
    private static SparseArray<InterfaceC10278a0> m11864a(DataSource.Factory factory, InterfaceC11753o interfaceC11753o) {
        SparseArray<InterfaceC10278a0> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (InterfaceC10278a0) DashMediaSource.Factory.class.asSubclass(InterfaceC10278a0.class).getConstructor(DataSource.Factory.class).newInstance(factory));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (InterfaceC10278a0) SsMediaSource.Factory.class.asSubclass(InterfaceC10278a0.class).getConstructor(DataSource.Factory.class).newInstance(factory));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (InterfaceC10278a0) HlsMediaSource.Factory.class.asSubclass(InterfaceC10278a0.class).getConstructor(DataSource.Factory.class).newInstance(factory));
        } catch (Exception unused3) {
        }
        sparseArray.put(3, new C10306i0.C10308b(factory, interfaceC11753o));
        return sparseArray;
    }

    public C10309j(DataSource.Factory factory, InterfaceC11753o interfaceC11753o) {
        this.f26914a = factory;
        SparseArray<InterfaceC10278a0> m11864a = m11864a(factory, interfaceC11753o);
        this.f26915b = m11864a;
        this.f26916c = new int[m11864a.size()];
        for (int i = 0; i < this.f26915b.size(); i++) {
            this.f26916c[i] = this.f26915b.keyAt(i);
        }
        this.f26917d = -9223372036854775807L;
        this.f26918e = -9223372036854775807L;
        this.f26919f = -9223372036854775807L;
        this.f26920g = -3.4028235E38f;
        this.f26921h = -3.4028235E38f;
    }
}