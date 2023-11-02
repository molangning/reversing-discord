package p182jh;

import gg.C6759j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9536e;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p270oh.C11115e;
import p304qf.C11888u;

/* renamed from: jh.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C8942a {

    /* renamed from: a */
    private final EnumC8943a f23387a;

    /* renamed from: b */
    private final C11115e f23388b;

    /* renamed from: c */
    private final String[] f23389c;

    /* renamed from: d */
    private final String[] f23390d;

    /* renamed from: e */
    private final String[] f23391e;

    /* renamed from: f */
    private final String f23392f;

    /* renamed from: g */
    private final int f23393g;

    /* renamed from: h */
    private final String f23394h;

    /* renamed from: i */
    private final byte[] f23395i;

    /* renamed from: jh.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public enum EnumC8943a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        

        /* renamed from: k */
        public static final C8944a f23396k = new C8944a(null);

        /* renamed from: l */
        private static final Map<Integer, EnumC8943a> f23397l;

        /* renamed from: j */
        private final int f23405j;

        /* renamed from: jh.a$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C8944a {
            private C8944a() {
            }

            public /* synthetic */ C8944a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final EnumC8943a m17001a(int i) {
                EnumC8943a enumC8943a = (EnumC8943a) EnumC8943a.f23397l.get(Integer.valueOf(i));
                return enumC8943a == null ? EnumC8943a.UNKNOWN : enumC8943a;
            }
        }

        static {
            int m6758d;
            int m21930c;
            EnumC8943a[] values = values();
            m6758d = C11888u.m6758d(values.length);
            m21930c = C6759j.m21930c(m6758d, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(m21930c);
            for (EnumC8943a enumC8943a : values) {
                linkedHashMap.put(Integer.valueOf(enumC8943a.f23405j), enumC8943a);
            }
            f23397l = linkedHashMap;
        }

        EnumC8943a(int i) {
            this.f23405j = i;
        }

        /* renamed from: c */
        public static final EnumC8943a m17002c(int i) {
            return f23396k.m17001a(i);
        }
    }

    public C8942a(EnumC8943a kind, C11115e metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2, byte[] bArr) {
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(metadataVersion, "metadataVersion");
        this.f23387a = kind;
        this.f23388b = metadataVersion;
        this.f23389c = strArr;
        this.f23390d = strArr2;
        this.f23391e = strArr3;
        this.f23392f = str;
        this.f23393g = i;
        this.f23394h = str2;
        this.f23395i = bArr;
    }

    /* renamed from: h */
    private final boolean m17008h(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: a */
    public final String[] m17015a() {
        return this.f23389c;
    }

    /* renamed from: b */
    public final String[] m17014b() {
        return this.f23390d;
    }

    /* renamed from: c */
    public final EnumC8943a m17013c() {
        return this.f23387a;
    }

    /* renamed from: d */
    public final C11115e m17012d() {
        return this.f23388b;
    }

    /* renamed from: e */
    public final String m17011e() {
        String str = this.f23392f;
        if (this.f23387a == EnumC8943a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    /* renamed from: f */
    public final List<String> m17010f() {
        List<String> m14104i;
        String[] strArr = this.f23389c;
        if (!(this.f23387a == EnumC8943a.MULTIFILE_CLASS)) {
            strArr = null;
        }
        List<String> m14274d = strArr != null ? C9536e.m14274d(strArr) : null;
        if (m14274d == null) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return m14274d;
    }

    /* renamed from: g */
    public final String[] m17009g() {
        return this.f23391e;
    }

    /* renamed from: i */
    public final boolean m17007i() {
        return m17008h(this.f23393g, 2);
    }

    /* renamed from: j */
    public final boolean m17006j() {
        return m17008h(this.f23393g, 64) && !m17008h(this.f23393g, 32);
    }

    /* renamed from: k */
    public final boolean m17005k() {
        return m17008h(this.f23393g, 16) && !m17008h(this.f23393g, 32);
    }

    public String toString() {
        return this.f23387a + " version=" + this.f23388b;
    }
}
