package p314r4;

import android.content.Context;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.imagepipeline.core.C3707a;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import java.util.Set;
import p025b5.InterfaceC2125d;
import p278p4.InterfaceC11382a;
import p278p4.InterfaceC11392f;
import p278p4.InterfaceC11396i;
import p278p4.InterfaceC11406o;
import p278p4.InterfaceC11413s;
import p332s2.InterfaceC12393a;
import p334s4.InterfaceC12396a;
import p346t4.C12580d;
import p346t4.InterfaceC12579c;
import p346t4.InterfaceC12581e;
import p359u2.InterfaceExecutorServiceC12825f;
import p416x4.InterfaceC13689d;
import p437y4.C13904y;
import p455z2.InterfaceC14074c;
import p455z2.InterfaceC14078g;

/* renamed from: r4.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC12055g {
    /* renamed from: A */
    InterfaceC11406o mo6451A();

    /* renamed from: B */
    InterfaceC14074c mo6450B();

    /* renamed from: C */
    InterfaceC12393a mo6449C();

    /* renamed from: D */
    C3707a mo6448D();

    /* renamed from: E */
    InterfaceC12053e mo6447E();

    /* renamed from: a */
    Set<InterfaceC13689d> mo6446a();

    /* renamed from: b */
    Supplier<Boolean> mo6445b();

    /* renamed from: c */
    NetworkFetcher mo6444c();

    /* renamed from: d */
    InterfaceC11413s<CacheKey, InterfaceC14078g> mo6443d();

    /* renamed from: e */
    DiskCacheConfig mo6442e();

    /* renamed from: f */
    Set<RequestListener> mo6441f();

    /* renamed from: g */
    InterfaceC11413s.InterfaceC11414a mo6440g();

    Context getContext();

    /* renamed from: h */
    InterfaceC12581e mo6439h();

    /* renamed from: i */
    DiskCacheConfig mo6438i();

    /* renamed from: j */
    InterfaceC11396i.InterfaceC11398b<CacheKey> mo6437j();

    /* renamed from: k */
    boolean mo6436k();

    /* renamed from: l */
    InterfaceExecutorServiceC12825f mo6435l();

    /* renamed from: m */
    Integer mo6434m();

    /* renamed from: n */
    InterfaceC2125d mo6433n();

    /* renamed from: o */
    C12580d mo6432o();

    /* renamed from: p */
    boolean mo6431p();

    /* renamed from: q */
    Supplier<MemoryCacheParams> mo6430q();

    /* renamed from: r */
    InterfaceC12579c mo6429r();

    /* renamed from: s */
    Supplier<MemoryCacheParams> mo6428s();

    /* renamed from: t */
    C13904y mo6427t();

    /* renamed from: u */
    int mo6426u();

    /* renamed from: v */
    InterfaceC12054f mo6425v();

    /* renamed from: w */
    InterfaceC12396a mo6424w();

    /* renamed from: x */
    InterfaceC11382a mo6423x();

    /* renamed from: y */
    InterfaceC11392f mo6422y();

    /* renamed from: z */
    boolean mo6421z();
}
