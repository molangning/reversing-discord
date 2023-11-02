package p208l3;

import android.content.res.Resources;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.drawee.backends.pipeline.C3587a;
import java.util.concurrent.Executor;
import p277p3.AbstractC11375a;
import p278p4.InterfaceC11413s;
import p361u4.InterfaceC12830a;
import p380v4.AbstractC13063c;
import p394w2.C13371e;

/* renamed from: l3.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10037e {

    /* renamed from: a */
    private Resources f26088a;

    /* renamed from: b */
    private AbstractC11375a f26089b;

    /* renamed from: c */
    private InterfaceC12830a f26090c;

    /* renamed from: d */
    private Executor f26091d;

    /* renamed from: e */
    private InterfaceC11413s<CacheKey, AbstractC13063c> f26092e;

    /* renamed from: f */
    private C13371e<InterfaceC12830a> f26093f;

    /* renamed from: g */
    private Supplier<Boolean> f26094g;

    /* renamed from: a */
    public void m12504a(Resources resources, AbstractC11375a abstractC11375a, InterfaceC12830a interfaceC12830a, Executor executor, InterfaceC11413s<CacheKey, AbstractC13063c> interfaceC11413s, C13371e<InterfaceC12830a> c13371e, Supplier<Boolean> supplier) {
        this.f26088a = resources;
        this.f26089b = abstractC11375a;
        this.f26090c = interfaceC12830a;
        this.f26091d = executor;
        this.f26092e = interfaceC11413s;
        this.f26093f = c13371e;
        this.f26094g = supplier;
    }

    /* renamed from: b */
    protected C3587a m12503b(Resources resources, AbstractC11375a abstractC11375a, InterfaceC12830a interfaceC12830a, Executor executor, InterfaceC11413s<CacheKey, AbstractC13063c> interfaceC11413s, C13371e<InterfaceC12830a> c13371e) {
        return new C3587a(resources, abstractC11375a, interfaceC12830a, executor, interfaceC11413s, c13371e);
    }

    /* renamed from: c */
    public C3587a m12502c() {
        C3587a m12503b = m12503b(this.f26088a, this.f26089b, this.f26090c, this.f26091d, this.f26092e, this.f26093f);
        Supplier<Boolean> supplier = this.f26094g;
        if (supplier != null) {
            m12503b.m31630y0(supplier.get().booleanValue());
        }
        return m12503b;
    }
}
