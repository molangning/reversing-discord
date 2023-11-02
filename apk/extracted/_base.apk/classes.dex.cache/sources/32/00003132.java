package p070di;

import gg.C6759j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kh.C9375b;
import kotlin.Pair;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;
import mh.C10458b;
import mh.InterfaceC10463c;
import ng.AbstractC10870h;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p183ji.C8967k;
import p304qf.AbstractC11883p;
import p304qf.C11888u;
import p304qf.C11889v;
import p305qg.C11938k0;
import p305qg.C11994x;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11910d;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11936j1;
import p325rg.C12151d;
import p325rg.InterfaceC12149c;
import p389vh.AbstractC13301g;
import p389vh.AbstractC13307k;
import p389vh.C13294a;
import p389vh.C13296b;
import p389vh.C13297c;
import p389vh.C13298d;
import p389vh.C13299e;
import p389vh.C13305i;
import p389vh.C13306j;
import p389vh.C13310l;
import p389vh.C13311m;
import p389vh.C13320q;
import p389vh.C13325r;
import p389vh.C13328u;
import p389vh.C13329v;
import p389vh.C13330w;
import p389vh.C13331x;
import p389vh.C13332y;
import p389vh.C13333z;
import ph.C11632b;
import ph.C11638f;
import th.C12758e;

/* renamed from: di.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5926e {

    /* renamed from: a */
    private final InterfaceC11928h0 f16894a;

    /* renamed from: b */
    private final C11938k0 f16895b;

    /* renamed from: di.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C5927a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16896a;

        static {
            int[] iArr = new int[C9375b.C9377b.C9380c.EnumC9383c.values().length];
            try {
                iArr[C9375b.C9377b.C9380c.EnumC9383c.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C9375b.C9377b.C9380c.EnumC9383c.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C9375b.C9377b.C9380c.EnumC9383c.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C9375b.C9377b.C9380c.EnumC9383c.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C9375b.C9377b.C9380c.EnumC9383c.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C9375b.C9377b.C9380c.EnumC9383c.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C9375b.C9377b.C9380c.EnumC9383c.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C9375b.C9377b.C9380c.EnumC9383c.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C9375b.C9377b.C9380c.EnumC9383c.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[C9375b.C9377b.C9380c.EnumC9383c.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[C9375b.C9377b.C9380c.EnumC9383c.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[C9375b.C9377b.C9380c.EnumC9383c.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[C9375b.C9377b.C9380c.EnumC9383c.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f16896a = iArr;
        }
    }

    public C5926e(InterfaceC11928h0 module, C11938k0 notFoundClasses) {
        C9612q.m13917h(module, "module");
        C9612q.m13917h(notFoundClasses, "notFoundClasses");
        this.f16894a = module;
        this.f16895b = notFoundClasses;
    }

    /* renamed from: b */
    private final boolean m24153b(AbstractC13301g<?> abstractC13301g, AbstractC7264g0 abstractC7264g0, C9375b.C9377b.C9380c c9380c) {
        int i;
        InterfaceC11914e interfaceC11914e;
        boolean z;
        IntRange m14103j;
        C9375b.C9377b.C9380c.EnumC9383c m15706T = c9380c.m15706T();
        if (m15706T == null) {
            i = -1;
        } else {
            i = C5927a.f16896a[m15706T.ordinal()];
        }
        if (i != 10) {
            if (i != 13) {
                return C9612q.m13922c(abstractC13301g.mo2775a(this.f16894a), abstractC7264g0);
            }
            if ((abstractC13301g instanceof C13296b) && ((C13296b) abstractC13301g).mo2813b().size() == c9380c.m15715K().size()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                AbstractC7264g0 m9806k = m24152c().m9806k(abstractC7264g0);
                C9612q.m13918g(m9806k, "builtIns.getArrayElementType(expectedType)");
                C13296b c13296b = (C13296b) abstractC13301g;
                m14103j = C9545j.m14103j(c13296b.mo2813b());
                if (!(m14103j instanceof Collection) || !((Collection) m14103j).isEmpty()) {
                    Iterator<Integer> it = m14103j.iterator();
                    while (it.hasNext()) {
                        int nextInt = ((AbstractC11883p) it).nextInt();
                        C9375b.C9377b.C9380c m15717I = c9380c.m15717I(nextInt);
                        C9612q.m13918g(m15717I, "value.getArrayElement(i)");
                        if (!m24153b(c13296b.mo2813b().get(nextInt), m9806k, m15717I)) {
                            return false;
                        }
                    }
                }
            } else {
                throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + abstractC13301g).toString());
            }
        } else {
            InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
            if (mo2788p instanceof InterfaceC11914e) {
                interfaceC11914e = (InterfaceC11914e) mo2788p;
            } else {
                interfaceC11914e = null;
            }
            if (interfaceC11914e != null && !AbstractC10870h.m9805k0(interfaceC11914e)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private final AbstractC10870h m24152c() {
        return this.f16894a.mo4194n();
    }

    /* renamed from: d */
    private final Pair<C11638f, AbstractC13301g<?>> m24151d(C9375b.C9377b c9377b, Map<C11638f, ? extends InterfaceC11936j1> map, InterfaceC10463c interfaceC10463c) {
        InterfaceC11936j1 interfaceC11936j1 = map.get(C5967x.m24061b(interfaceC10463c, c9377b.m15739x()));
        if (interfaceC11936j1 == null) {
            return null;
        }
        C11638f m24061b = C5967x.m24061b(interfaceC10463c, c9377b.m15739x());
        AbstractC7264g0 type = interfaceC11936j1.getType();
        C9612q.m13918g(type, "parameter.type");
        C9375b.C9377b.C9380c m15738y = c9377b.m15738y();
        C9612q.m13918g(m15738y, "proto.value");
        return new Pair<>(m24061b, m24148g(type, m15738y, interfaceC10463c));
    }

    /* renamed from: e */
    private final InterfaceC11914e m24150e(C11632b c11632b) {
        return C11994x.m6650c(this.f16894a, c11632b, this.f16895b);
    }

    /* renamed from: g */
    private final AbstractC13301g<?> m24148g(AbstractC7264g0 abstractC7264g0, C9375b.C9377b.C9380c c9380c, InterfaceC10463c interfaceC10463c) {
        AbstractC13301g<?> m24149f = m24149f(abstractC7264g0, c9380c, interfaceC10463c);
        if (!m24153b(m24149f, abstractC7264g0, c9380c)) {
            m24149f = null;
        }
        if (m24149f == null) {
            AbstractC13307k.C13308a c13308a = AbstractC13307k.f34384b;
            return c13308a.m2811a("Unexpected argument value: actual type " + c9380c.m15706T() + " != expected type " + abstractC7264g0);
        }
        return m24149f;
    }

    /* renamed from: a */
    public final InterfaceC12149c m24154a(C9375b proto, InterfaceC10463c nameResolver) {
        Map m6754h;
        Object m14032r0;
        int m14093t;
        int m6758d;
        int m21930c;
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(nameResolver, "nameResolver");
        InterfaceC11914e m24150e = m24150e(C5967x.m24062a(nameResolver, proto.m15766B()));
        m6754h = C11889v.m6754h();
        if (proto.m15753y() != 0 && !C8967k.m16936m(m24150e) && C12758e.m4092t(m24150e)) {
            Collection<InterfaceC11910d> mo4171l = m24150e.mo4171l();
            C9612q.m13918g(mo4171l, "annotationClass.constructors");
            m14032r0 = C9553r.m14032r0(mo4171l);
            InterfaceC11910d interfaceC11910d = (InterfaceC11910d) m14032r0;
            if (interfaceC11910d != null) {
                List<InterfaceC11936j1> mo4301i = interfaceC11910d.mo4301i();
                C9612q.m13918g(mo4301i, "constructor.valueParameters");
                m14093t = C9546k.m14093t(mo4301i, 10);
                m6758d = C11888u.m6758d(m14093t);
                m21930c = C6759j.m21930c(m6758d, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(m21930c);
                for (Object obj : mo4301i) {
                    linkedHashMap.put(((InterfaceC11936j1) obj).getName(), obj);
                }
                List<C9375b.C9377b> m15752z = proto.m15752z();
                C9612q.m13918g(m15752z, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (C9375b.C9377b it : m15752z) {
                    C9612q.m13918g(it, "it");
                    Pair<C11638f, AbstractC13301g<?>> m24151d = m24151d(it, linkedHashMap, nameResolver);
                    if (m24151d != null) {
                        arrayList.add(m24151d);
                    }
                }
                m6754h = C11889v.m6744r(arrayList);
            }
        }
        return new C12151d(m24150e.mo4224p(), m6754h, InterfaceC11900a1.f30901a);
    }

    /* renamed from: f */
    public final AbstractC13301g<?> m24149f(AbstractC7264g0 expectedType, C9375b.C9377b.C9380c value, InterfaceC10463c nameResolver) {
        int i;
        AbstractC13301g<?> c13299e;
        AbstractC13301g<?> c13325r;
        boolean z;
        int m14093t;
        C9612q.m13917h(expectedType, "expectedType");
        C9612q.m13917h(value, "value");
        C9612q.m13917h(nameResolver, "nameResolver");
        Boolean mo11488d = C10458b.f27316O.mo11488d(value.m15710P());
        C9612q.m13918g(mo11488d, "IS_UNSIGNED.get(value.flags)");
        boolean booleanValue = mo11488d.booleanValue();
        C9375b.C9377b.C9380c.EnumC9383c m15706T = value.m15706T();
        if (m15706T == null) {
            i = -1;
        } else {
            i = C5927a.f16896a[m15706T.ordinal()];
        }
        switch (i) {
            case 1:
                byte m15708R = (byte) value.m15708R();
                if (booleanValue) {
                    return new C13330w(m15708R);
                }
                return new C13298d(m15708R);
            case 2:
                c13299e = new C13299e((char) value.m15708R());
                break;
            case 3:
                short m15708R2 = (short) value.m15708R();
                if (booleanValue) {
                    return new C13333z(m15708R2);
                }
                return new C13328u(m15708R2);
            case 4:
                int m15708R3 = (int) value.m15708R();
                if (booleanValue) {
                    return new C13331x(m15708R3);
                }
                return new C13311m(m15708R3);
            case 5:
                long m15708R4 = value.m15708R();
                if (booleanValue) {
                    c13325r = new C13332y(m15708R4);
                } else {
                    c13325r = new C13325r(m15708R4);
                }
                return c13325r;
            case 6:
                c13299e = new C13310l(value.m15709Q());
                break;
            case 7:
                c13299e = new C13305i(value.m15712N());
                break;
            case 8:
                if (value.m15708R() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                c13299e = new C13297c(z);
                break;
            case 9:
                c13299e = new C13329v(nameResolver.getString(value.m15707S()));
                break;
            case 10:
                c13299e = new C13320q(C5967x.m24062a(nameResolver, value.m15714L()), value.m15718H());
                break;
            case 11:
                c13299e = new C13306j(C5967x.m24062a(nameResolver, value.m15714L()), C5967x.m24061b(nameResolver, value.m15711O()));
                break;
            case 12:
                C9375b m15719G = value.m15719G();
                C9612q.m13918g(m15719G, "value.annotation");
                c13299e = new C13294a(m24154a(m15719G, nameResolver));
                break;
            case 13:
                List<C9375b.C9377b.C9380c> m15715K = value.m15715K();
                C9612q.m13918g(m15715K, "value.arrayElementList");
                m14093t = C9546k.m14093t(m15715K, 10);
                ArrayList arrayList = new ArrayList(m14093t);
                for (C9375b.C9377b.C9380c it : m15715K) {
                    AbstractC7302o0 m9810i = m24152c().m9810i();
                    C9612q.m13918g(m9810i, "builtIns.anyType");
                    C9612q.m13918g(it, "it");
                    arrayList.add(m24149f(m9810i, it, nameResolver));
                }
                return new C5943n(arrayList, expectedType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.m15706T() + " (expected " + expectedType + ')').toString());
        }
        return c13299e;
    }
}