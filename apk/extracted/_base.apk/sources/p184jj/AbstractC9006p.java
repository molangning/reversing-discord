package p184jj;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import net.time4j.base.AbstractC10617d;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: jj.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public abstract class AbstractC9006p {

    /* renamed from: a */
    private static final AbstractC9006p f23652a;

    /* renamed from: b */
    private static final AbstractC9006p f23653b;

    /* renamed from: c */
    private static final AbstractC9006p f23654c;

    /* renamed from: d */
    private static final AbstractC9006p f23655d;

    /* renamed from: e */
    private static final Map<String, AbstractC9006p> f23656e;

    /* renamed from: f */
    private static final Map<String, AbstractC9006p> f23657f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jj.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static /* synthetic */ class C9007a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23658a;

        static {
            int[] iArr = new int[EnumC9001k.values().length];
            f23658a = iArr;
            try {
                iArr[EnumC9001k.CARDINALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23658a[EnumC9001k.ORDINALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: jj.p$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    private static class C9008b implements InterfaceC9005o {
        private C9008b() {
        }

        /* synthetic */ C9008b(C9007a c9007a) {
            this();
        }

        @Override // p184jj.InterfaceC9005o
        /* renamed from: a */
        public AbstractC9006p mo9078a(Locale locale, EnumC9001k enumC9001k) {
            boolean equals = locale.getLanguage().equals("en");
            int i = C9007a.f23658a[enumC9001k.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (equals) {
                        return AbstractC9006p.f23654c;
                    }
                    return AbstractC9006p.f23655d;
                }
                throw new UnsupportedOperationException(enumC9001k.name());
            } else if (equals) {
                return AbstractC9006p.f23652a;
            } else {
                return AbstractC9006p.f23653b;
            }
        }
    }

    /* renamed from: jj.p$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    private static class C9009c extends AbstractC9006p {

        /* renamed from: g */
        private final EnumC9001k f23659g;

        /* renamed from: h */
        private final boolean f23660h;

        /* synthetic */ C9009c(EnumC9001k enumC9001k, boolean z, C9007a c9007a) {
            this(enumC9001k, z);
        }

        private C9009c(EnumC9001k enumC9001k, boolean z) {
            this.f23659g = enumC9001k;
            this.f23660h = z;
        }
    }

    /* renamed from: jj.p$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    private static class C9010d {

        /* renamed from: a */
        private static final InterfaceC9005o f23661a;

        static {
            InterfaceC9005o interfaceC9005o;
            Iterator it = AbstractC10617d.m11026c().mo11022g(InterfaceC9005o.class).iterator();
            if (it.hasNext()) {
                interfaceC9005o = (InterfaceC9005o) it.next();
            } else {
                interfaceC9005o = null;
            }
            if (interfaceC9005o == null) {
                interfaceC9005o = new C9008b(null);
            }
            f23661a = interfaceC9005o;
        }
    }

    static {
        EnumC9001k enumC9001k = EnumC9001k.CARDINALS;
        f23652a = new C9009c(enumC9001k, true, null);
        f23653b = new C9009c(enumC9001k, false, null);
        EnumC9001k enumC9001k2 = EnumC9001k.ORDINALS;
        f23654c = new C9009c(enumC9001k2, true, null);
        f23655d = new C9009c(enumC9001k2, false, null);
        f23656e = new ConcurrentHashMap();
        f23657f = new ConcurrentHashMap();
    }

    /* renamed from: e */
    private static Map<String, AbstractC9006p> m16865e(EnumC9001k enumC9001k) {
        int i = C9007a.f23658a[enumC9001k.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return f23657f;
            }
            throw new UnsupportedOperationException(enumC9001k.name());
        }
        return f23656e;
    }

    /* renamed from: f */
    public static AbstractC9006p m16864f(Locale locale, EnumC9001k enumC9001k) {
        Map<String, AbstractC9006p> m16865e = m16865e(enumC9001k);
        AbstractC9006p abstractC9006p = null;
        if (!m16865e.isEmpty()) {
            if (!locale.getCountry().equals("")) {
                abstractC9006p = m16865e.get(m16863g(locale));
            }
            if (abstractC9006p == null) {
                abstractC9006p = m16865e.get(locale.getLanguage());
            }
        }
        if (abstractC9006p == null) {
            return C9010d.f23661a.mo9078a(locale, enumC9001k);
        }
        return abstractC9006p;
    }

    /* renamed from: g */
    private static String m16863g(Locale locale) {
        return locale.getLanguage() + '_' + locale.getCountry();
    }
}
