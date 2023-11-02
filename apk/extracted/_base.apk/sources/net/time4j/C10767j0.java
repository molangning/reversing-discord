package net.time4j;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import net.time4j.base.AbstractC10617d;
import net.time4j.base.InterfaceC10619e;
import p164j$.util.concurrent.ConcurrentHashMap;
import p184jj.AbstractC9006p;
import p184jj.EnumC9001k;
import p184jj.InterfaceC8983i;

/* renamed from: net.time4j.j0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10767j0 {

    /* renamed from: k */
    private static final InterfaceC8983i f28089k;

    /* renamed from: l */
    private static final ConcurrentMap<Locale, C10767j0> f28090l;

    /* renamed from: m */
    private static final InterfaceC10843w[] f28091m;

    /* renamed from: n */
    private static final InterfaceC10843w[] f28092n;

    /* renamed from: o */
    private static final Set<InterfaceC10843w> f28093o;

    /* renamed from: p */
    private static final long f28094p;

    /* renamed from: a */
    private final AbstractC9006p f28095a;

    /* renamed from: b */
    private final Locale f28096b;

    /* renamed from: c */
    private final InterfaceC10619e<?> f28097c;

    /* renamed from: d */
    private final char f28098d;

    /* renamed from: e */
    private final String f28099e;

    /* renamed from: f */
    private final InterfaceC10843w f28100f;

    /* renamed from: g */
    private final boolean f28101g;

    /* renamed from: h */
    private final boolean f28102h;

    /* renamed from: i */
    private final String f28103i;

    /* renamed from: j */
    private final String f28104j;

    static {
        InterfaceC8983i interfaceC8983i = null;
        int i = 0;
        for (InterfaceC8983i interfaceC8983i2 : AbstractC10617d.m11026c().mo11022g(InterfaceC8983i.class)) {
            int length = interfaceC8983i2.mo9035a().length;
            if (length >= i) {
                interfaceC8983i = interfaceC8983i2;
                i = length;
            }
        }
        if (interfaceC8983i == null) {
            interfaceC8983i = InterfaceC8983i.f23619a;
        }
        f28089k = interfaceC8983i;
        f28090l = new ConcurrentHashMap();
        EnumC10686f enumC10686f = EnumC10686f.f27874m;
        EnumC10686f enumC10686f2 = EnumC10686f.f27876o;
        EnumC10686f enumC10686f3 = EnumC10686f.f27878q;
        EnumC10704g enumC10704g = EnumC10704g.f27924j;
        EnumC10704g enumC10704g2 = EnumC10704g.f27925k;
        EnumC10704g enumC10704g3 = EnumC10704g.f27926l;
        InterfaceC10843w[] interfaceC10843wArr = {enumC10686f, enumC10686f2, EnumC10686f.f27877p, enumC10686f3, enumC10704g, enumC10704g2, enumC10704g3};
        f28091m = interfaceC10843wArr;
        f28092n = new InterfaceC10843w[]{enumC10686f, enumC10686f2, enumC10686f3, enumC10704g, enumC10704g2, enumC10704g3};
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, interfaceC10843wArr);
        hashSet.add(EnumC10704g.f27929o);
        f28093o = Collections.unmodifiableSet(hashSet);
        f28094p = 63072000L;
    }

    private C10767j0(Locale locale, InterfaceC10619e<?> interfaceC10619e, char c, String str, InterfaceC10843w interfaceC10843w, boolean z, boolean z2, String str2, String str3) {
        if (interfaceC10843w != null) {
            if (interfaceC10619e != null) {
                this.f28095a = AbstractC9006p.m16864f(locale, EnumC9001k.CARDINALS);
                this.f28096b = locale;
                this.f28097c = interfaceC10619e;
                this.f28098d = c;
                this.f28100f = interfaceC10843w;
                this.f28099e = str;
                this.f28101g = z;
                this.f28102h = z2;
                this.f28103i = str2;
                this.f28104j = str3;
                return;
            }
            throw new NullPointerException("Missing reference clock.");
        }
        throw new NullPointerException("Missing zero time unit.");
    }

    /* renamed from: b */
    public static C10767j0 m10305b(Locale locale) {
        ConcurrentMap<Locale, C10767j0> concurrentMap = f28090l;
        C10767j0 c10767j0 = concurrentMap.get(locale);
        if (c10767j0 == null) {
            C10785p0 c10785p0 = C10785p0.f28157e;
            InterfaceC8983i interfaceC8983i = f28089k;
            C10767j0 c10767j02 = new C10767j0(locale, c10785p0, interfaceC8983i.mo9030f(locale), interfaceC8983i.mo9031e(locale), EnumC10704g.f27926l, false, false, null, null);
            C10767j0 putIfAbsent = concurrentMap.putIfAbsent(locale, c10767j02);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return c10767j02;
        }
        return c10767j0;
    }

    /* renamed from: a */
    public Locale m10306a() {
        return this.f28096b;
    }

    /* renamed from: c */
    public String m10304c() {
        return C10793s0.m10193h(m10306a()).m10199b();
    }
}
