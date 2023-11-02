package p210l5;

import p242n5.C10501a;
import p242n5.C10503b;
import p258o5.C10987a;

/* renamed from: l5.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10045a extends AbstractC10051f {

    /* renamed from: r */
    protected static final int f26104r = EnumC10046a.m12488a();

    /* renamed from: s */
    protected static final int f26105s = EnumC10048c.m12482a();

    /* renamed from: t */
    protected static final int f26106t = EnumC10047b.m12485a();

    /* renamed from: u */
    public static final InterfaceC10050e f26107u = C10987a.f28787j;

    /* renamed from: j */
    protected final transient C10503b f26108j;

    /* renamed from: k */
    protected final transient C10501a f26109k;

    /* renamed from: l */
    protected int f26110l;

    /* renamed from: m */
    protected int f26111m;

    /* renamed from: n */
    protected int f26112n;

    /* renamed from: o */
    protected AbstractC10049d f26113o;

    /* renamed from: p */
    protected InterfaceC10050e f26114p;

    /* renamed from: q */
    protected final char f26115q;

    /* renamed from: l5.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC10046a {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);
        

        /* renamed from: j */
        private final boolean f26121j;

        EnumC10046a(boolean z) {
            this.f26121j = z;
        }

        /* renamed from: a */
        public static int m12488a() {
            EnumC10046a[] values;
            int i = 0;
            for (EnumC10046a enumC10046a : values()) {
                if (enumC10046a.m12487b()) {
                    i |= enumC10046a.m12486c();
                }
            }
            return i;
        }

        /* renamed from: b */
        public boolean m12487b() {
            return this.f26121j;
        }

        /* renamed from: c */
        public int m12486c() {
            return 1 << ordinal();
        }
    }

    public C10045a() {
        this(null);
    }

    public C10045a(AbstractC10049d abstractC10049d) {
        this.f26108j = C10503b.m11342a();
        this.f26109k = C10501a.m11350c();
        this.f26110l = f26104r;
        this.f26111m = f26105s;
        this.f26112n = f26106t;
        this.f26114p = f26107u;
        this.f26113o = abstractC10049d;
        this.f26115q = '\"';
    }
}
