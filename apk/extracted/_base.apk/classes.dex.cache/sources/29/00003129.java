package p070di;

import ci.C2555a;
import java.util.ArrayList;
import java.util.List;
import kh.C9375b;
import kh.C9391d;
import kh.C9404g;
import kh.C9412i;
import kh.C9425n;
import kh.C9439q;
import kh.C9450s;
import kh.C9458u;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import mh.C10466e;
import mh.InterfaceC10463c;
import p070di.AbstractC5969z;
import p142hi.AbstractC7264g0;
import p305qg.C11938k0;
import p305qg.InterfaceC11928h0;
import p325rg.InterfaceC12149c;
import p326rh.InterfaceC12210q;
import p389vh.AbstractC13301g;

/* renamed from: di.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5917d implements InterfaceC5915c<InterfaceC12149c, AbstractC13301g<?>> {

    /* renamed from: a */
    private final C2555a f16877a;

    /* renamed from: b */
    private final C5926e f16878b;

    /* renamed from: di.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C5918a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16879a;

        static {
            int[] iArr = new int[EnumC5912b.values().length];
            try {
                iArr[EnumC5912b.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5912b.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5912b.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16879a = iArr;
        }
    }

    public C5917d(InterfaceC11928h0 module, C11938k0 notFoundClasses, C2555a protocol) {
        C9612q.m13917h(module, "module");
        C9612q.m13917h(notFoundClasses, "notFoundClasses");
        C9612q.m13917h(protocol, "protocol");
        this.f16877a = protocol;
        this.f16878b = new C5926e(module, notFoundClasses);
    }

    @Override // p070di.InterfaceC5929f
    /* renamed from: a */
    public List<InterfaceC12149c> mo20517a(C9439q proto, InterfaceC10463c nameResolver) {
        int m14093t;
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(nameResolver, "nameResolver");
        List<C9375b> list = (List) proto.m5818v(this.f16877a.m32988k());
        if (list == null) {
            list = C9545j.m14104i();
        }
        m14093t = C9546k.m14093t(list, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (C9375b c9375b : list) {
            arrayList.add(this.f16878b.m24154a(c9375b, nameResolver));
        }
        return arrayList;
    }

    @Override // p070di.InterfaceC5929f
    /* renamed from: b */
    public List<InterfaceC12149c> mo20516b(AbstractC5969z container, InterfaceC12210q callableProto, EnumC5912b kind, int i, C9458u proto) {
        int m14093t;
        C9612q.m13917h(container, "container");
        C9612q.m13917h(callableProto, "callableProto");
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(proto, "proto");
        List<C9375b> list = (List) proto.m5818v(this.f16877a.m32992g());
        if (list == null) {
            list = C9545j.m14104i();
        }
        m14093t = C9546k.m14093t(list, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (C9375b c9375b : list) {
            arrayList.add(this.f16878b.m24154a(c9375b, container.m24059b()));
        }
        return arrayList;
    }

    @Override // p070di.InterfaceC5929f
    /* renamed from: d */
    public List<InterfaceC12149c> mo20515d(AbstractC5969z container, C9425n proto) {
        List<InterfaceC12149c> m14104i;
        C9612q.m13917h(container, "container");
        C9612q.m13917h(proto, "proto");
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // p070di.InterfaceC5929f
    /* renamed from: e */
    public List<InterfaceC12149c> mo20514e(AbstractC5969z container, C9404g proto) {
        int m14093t;
        C9612q.m13917h(container, "container");
        C9612q.m13917h(proto, "proto");
        List<C9375b> list = (List) proto.m5818v(this.f16877a.m32995d());
        if (list == null) {
            list = C9545j.m14104i();
        }
        m14093t = C9546k.m14093t(list, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (C9375b c9375b : list) {
            arrayList.add(this.f16878b.m24154a(c9375b, container.m24059b()));
        }
        return arrayList;
    }

    @Override // p070di.InterfaceC5929f
    /* renamed from: f */
    public List<InterfaceC12149c> mo20513f(AbstractC5969z container, InterfaceC12210q proto, EnumC5912b kind) {
        List<InterfaceC12149c> m14104i;
        C9612q.m13917h(container, "container");
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(kind, "kind");
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // p070di.InterfaceC5929f
    /* renamed from: h */
    public List<InterfaceC12149c> mo20512h(C9450s proto, InterfaceC10463c nameResolver) {
        int m14093t;
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(nameResolver, "nameResolver");
        List<C9375b> list = (List) proto.m5818v(this.f16877a.m32987l());
        if (list == null) {
            list = C9545j.m14104i();
        }
        m14093t = C9546k.m14093t(list, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (C9375b c9375b : list) {
            arrayList.add(this.f16878b.m24154a(c9375b, nameResolver));
        }
        return arrayList;
    }

    @Override // p070di.InterfaceC5929f
    /* renamed from: i */
    public List<InterfaceC12149c> mo20511i(AbstractC5969z container, InterfaceC12210q proto, EnumC5912b kind) {
        List<C9375b> list;
        int m14093t;
        C9612q.m13917h(container, "container");
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(kind, "kind");
        if (proto instanceof C9391d) {
            list = (List) ((C9391d) proto).m5818v(this.f16877a.m32996c());
        } else if (proto instanceof C9412i) {
            list = (List) ((C9412i) proto).m5818v(this.f16877a.m32993f());
        } else if (proto instanceof C9425n) {
            int i = C5918a.f16879a[kind.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        list = (List) ((C9425n) proto).m5818v(this.f16877a.m32989j());
                    } else {
                        throw new IllegalStateException("Unsupported callable kind with property proto".toString());
                    }
                } else {
                    list = (List) ((C9425n) proto).m5818v(this.f16877a.m32990i());
                }
            } else {
                list = (List) ((C9425n) proto).m5818v(this.f16877a.m32991h());
            }
        } else {
            throw new IllegalStateException(("Unknown message: " + proto).toString());
        }
        if (list == null) {
            list = C9545j.m14104i();
        }
        m14093t = C9546k.m14093t(list, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (C9375b c9375b : list) {
            arrayList.add(this.f16878b.m24154a(c9375b, container.m24059b()));
        }
        return arrayList;
    }

    @Override // p070di.InterfaceC5929f
    /* renamed from: j */
    public List<InterfaceC12149c> mo20510j(AbstractC5969z container, C9425n proto) {
        List<InterfaceC12149c> m14104i;
        C9612q.m13917h(container, "container");
        C9612q.m13917h(proto, "proto");
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // p070di.InterfaceC5929f
    /* renamed from: k */
    public List<InterfaceC12149c> mo20509k(AbstractC5969z.C5970a container) {
        int m14093t;
        C9612q.m13917h(container, "container");
        List<C9375b> list = (List) container.m24055f().m5818v(this.f16877a.m32998a());
        if (list == null) {
            list = C9545j.m14104i();
        }
        m14093t = C9546k.m14093t(list, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (C9375b c9375b : list) {
            arrayList.add(this.f16878b.m24154a(c9375b, container.m24059b()));
        }
        return arrayList;
    }

    @Override // p070di.InterfaceC5915c
    /* renamed from: l */
    public AbstractC13301g<?> mo20525g(AbstractC5969z container, C9425n proto, AbstractC7264g0 expectedType) {
        C9612q.m13917h(container, "container");
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(expectedType, "expectedType");
        return null;
    }

    @Override // p070di.InterfaceC5915c
    /* renamed from: m */
    public AbstractC13301g<?> mo20526c(AbstractC5969z container, C9425n proto, AbstractC7264g0 expectedType) {
        C9612q.m13917h(container, "container");
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(expectedType, "expectedType");
        C9375b.C9377b.C9380c c9380c = (C9375b.C9377b.C9380c) C10466e.m11485a(proto, this.f16877a.m32997b());
        if (c9380c == null) {
            return null;
        }
        return this.f16878b.m24149f(expectedType, c9380c, container.m24059b());
    }
}