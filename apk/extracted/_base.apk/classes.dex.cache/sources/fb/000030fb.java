package p069dh;

import ch.C2537a;
import ch.C2545e;
import ch.C2548g;
import gh.InterfaceC6770g;
import gh.InterfaceC6784u;
import gi.C6820m;
import gi.InterfaceC6815i;
import gi.InterfaceC6821n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KProperty;
import p160ih.C7563q;
import p160ih.C7570s;
import p160ih.InterfaceC7564r;
import p160ih.InterfaceC7576x;
import p182jh.C8942a;
import p304qf.C11889v;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11914e;
import p325rg.InterfaceC12155g;
import p449yh.C14027d;
import pf.C11591x;
import ph.C11632b;
import ph.C11633c;
import tg.AbstractC12748z;

/* renamed from: dh.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C5871h extends AbstractC12748z {

    /* renamed from: w */
    static final /* synthetic */ KProperty<Object>[] f16779w = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C5871h.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C5871h.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* renamed from: p */
    private final InterfaceC6784u f16780p;

    /* renamed from: q */
    private final C2548g f16781q;

    /* renamed from: r */
    private final InterfaceC6815i f16782r;

    /* renamed from: s */
    private final C5844d f16783s;

    /* renamed from: t */
    private final InterfaceC6815i<List<C11633c>> f16784t;

    /* renamed from: u */
    private final InterfaceC12155g f16785u;

    /* renamed from: v */
    private final InterfaceC6815i f16786v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dh.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5872a extends AbstractC9614s implements Function0<Map<String, ? extends InterfaceC7564r>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5872a() {
            super(0);
            C5871h.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Map<String, InterfaceC7564r> invoke() {
            Map<String, InterfaceC7564r> m6744r;
            Pair pair;
            InterfaceC7576x m33035o = C5871h.this.f16781q.m33014a().m33035o();
            String m7458b = C5871h.this.mo4161e().m7458b();
            C9612q.m13918g(m7458b, "fqName.asString()");
            List<String> mo20380a = m33035o.mo20380a(m7458b);
            C5871h c5871h = C5871h.this;
            ArrayList arrayList = new ArrayList();
            for (String str : mo20380a) {
                C11632b m7460m = C11632b.m7460m(C14027d.m884d(str).m883e());
                C9612q.m13918g(m7460m, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                InterfaceC7564r m20400b = C7563q.m20400b(c5871h.f16781q.m33014a().m33040j(), m7460m);
                if (m20400b != null) {
                    pair = C11591x.m7577a(str, m20400b);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            m6744r = C11889v.m6744r(arrayList);
            return m6744r;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dh.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5873b extends AbstractC9614s implements Function0<HashMap<C14027d, C14027d>> {

        /* renamed from: dh.h$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public /* synthetic */ class C5874a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f16789a;

            static {
                int[] iArr = new int[C8942a.EnumC8943a.values().length];
                try {
                    iArr[C8942a.EnumC8943a.MULTIFILE_CLASS_PART.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C8942a.EnumC8943a.FILE_FACADE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f16789a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5873b() {
            super(0);
            C5871h.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final HashMap<C14027d, C14027d> invoke() {
            HashMap<C14027d, C14027d> hashMap = new HashMap<>();
            for (Map.Entry<String, InterfaceC7564r> entry : C5871h.this.m24274M0().entrySet()) {
                C14027d m884d = C14027d.m884d(entry.getKey());
                C9612q.m13918g(m884d, "byInternalName(partInternalName)");
                C8942a mo2854c = entry.getValue().mo2854c();
                int i = C5874a.f16789a[mo2854c.m17013c().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        hashMap.put(m884d, m884d);
                    }
                } else {
                    String m17011e = mo2854c.m17011e();
                    if (m17011e != null) {
                        C14027d m884d2 = C14027d.m884d(m17011e);
                        C9612q.m13918g(m884d2, "byInternalName(header.mu…: continue@kotlinClasses)");
                        hashMap.put(m884d, m884d2);
                    }
                }
            }
            return hashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dh.h$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5875c extends AbstractC9614s implements Function0<List<? extends C11633c>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5875c() {
            super(0);
            C5871h.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends C11633c> invoke() {
            int m14093t;
            Collection<InterfaceC6784u> mo2165u = C5871h.this.f16780p.mo2165u();
            m14093t = C9546k.m14093t(mo2165u, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (InterfaceC6784u interfaceC6784u : mo2165u) {
                arrayList.add(interfaceC6784u.mo2166e());
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5871h(C2548g outerContext, InterfaceC6784u jPackage) {
        super(outerContext.m33011d(), jPackage.mo2166e());
        List m14104i;
        InterfaceC12155g m33019a;
        C9612q.m13917h(outerContext, "outerContext");
        C9612q.m13917h(jPackage, "jPackage");
        this.f16780p = jPackage;
        C2548g m33057d = C2537a.m33057d(outerContext, this, null, 0, 6, null);
        this.f16781q = m33057d;
        this.f16782r = m33057d.m33010e().mo21867c(new C5872a());
        this.f16783s = new C5844d(m33057d, jPackage, this);
        InterfaceC6821n m33010e = m33057d.m33010e();
        C5875c c5875c = new C5875c();
        m14104i = C9545j.m14104i();
        this.f16784t = m33010e.mo21868b(c5875c, m14104i);
        if (m33057d.m33014a().m33041i().m284b()) {
            m33019a = InterfaceC12155g.f31603f.m6037b();
        } else {
            m33019a = C2545e.m33019a(m33057d, jPackage);
        }
        this.f16785u = m33019a;
        this.f16786v = m33057d.m33010e().mo21867c(new C5873b());
    }

    /* renamed from: L0 */
    public final InterfaceC11914e m24275L0(InterfaceC6770g jClass) {
        C9612q.m13917h(jClass, "jClass");
        return this.f16783s.m24374j().m24267O(jClass);
    }

    /* renamed from: M0 */
    public final Map<String, InterfaceC7564r> m24274M0() {
        return (Map) C6820m.m21871a(this.f16782r, this, f16779w[0]);
    }

    @Override // p305qg.InterfaceC11945l0
    /* renamed from: N0 */
    public C5844d mo4368o() {
        return this.f16783s;
    }

    /* renamed from: O0 */
    public final List<C11633c> m24272O0() {
        return this.f16784t.invoke();
    }

    @Override // p325rg.C12148b, p325rg.InterfaceC12147a
    public InterfaceC12155g getAnnotations() {
        return this.f16785u;
    }

    @Override // tg.AbstractC12748z, tg.AbstractC12710k, p305qg.InterfaceC11966p
    /* renamed from: j */
    public InterfaceC11900a1 mo4160j() {
        return new C7570s(this);
    }

    @Override // tg.AbstractC12748z, tg.AbstractC12706j
    public String toString() {
        return "Lazy Java package fragment: " + mo4161e() + " of module " + this.f16781q.m33014a().m33037m();
    }
}