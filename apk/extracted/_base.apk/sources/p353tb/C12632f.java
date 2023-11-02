package p353tb;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import p300qb.C11815b;
import p300qb.C11816c;
import p300qb.InterfaceC11819d;
import p300qb.InterfaceC11820e;
import p300qb.InterfaceC11821f;
import p353tb.InterfaceC12629d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: tb.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12632f implements InterfaceC11820e {

    /* renamed from: f */
    private static final Charset f32728f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final C11816c f32729g = C11816c.m6833a("key").m6828b(C12625a.m4698b().m4697c(1).m4699a()).m6829a();

    /* renamed from: h */
    private static final C11816c f32730h = C11816c.m6833a("value").m6828b(C12625a.m4698b().m4697c(2).m4699a()).m6829a();

    /* renamed from: i */
    private static final InterfaceC11819d<Map.Entry<Object, Object>> f32731i = new InterfaceC11819d() { // from class: tb.e
        @Override // p300qb.InterfaceC11819d
        /* renamed from: a */
        public final void mo3313a(Object obj, Object obj2) {
            C12632f.m4676t((Map.Entry) obj, (InterfaceC11820e) obj2);
        }
    };

    /* renamed from: a */
    private OutputStream f32732a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC11819d<?>> f32733b;

    /* renamed from: c */
    private final Map<Class<?>, InterfaceC11821f<?>> f32734c;

    /* renamed from: d */
    private final InterfaceC11819d<Object> f32735d;

    /* renamed from: e */
    private final C12637i f32736e = new C12637i(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tb.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C12633a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32737a;

        static {
            int[] iArr = new int[InterfaceC12629d.EnumC12630a.values().length];
            f32737a = iArr;
            try {
                iArr[InterfaceC12629d.EnumC12630a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32737a[InterfaceC12629d.EnumC12630a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32737a[InterfaceC12629d.EnumC12630a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12632f(OutputStream outputStream, Map<Class<?>, InterfaceC11819d<?>> map, Map<Class<?>, InterfaceC11821f<?>> map2, InterfaceC11819d<Object> interfaceC11819d) {
        this.f32732a = outputStream;
        this.f32733b = map;
        this.f32734c = map2;
        this.f32735d = interfaceC11819d;
    }

    /* renamed from: m */
    private static ByteBuffer m4683m(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: n */
    private <T> long m4682n(InterfaceC11819d<T> interfaceC11819d, T t) {
        C12627b c12627b = new C12627b();
        try {
            OutputStream outputStream = this.f32732a;
            this.f32732a = c12627b;
            interfaceC11819d.mo3313a(t, this);
            this.f32732a = outputStream;
            long m4696a = c12627b.m4696a();
            c12627b.close();
            return m4696a;
        } catch (Throwable th2) {
            try {
                c12627b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: o */
    private <T> C12632f m4681o(InterfaceC11819d<T> interfaceC11819d, C11816c c11816c, T t, boolean z) {
        long m4682n = m4682n(interfaceC11819d, t);
        if (z && m4682n == 0) {
            return this;
        }
        m4675u((m4677s(c11816c) << 3) | 2);
        m4674v(m4682n);
        interfaceC11819d.mo3313a(t, this);
        return this;
    }

    /* renamed from: p */
    private <T> C12632f m4680p(InterfaceC11821f<T> interfaceC11821f, C11816c c11816c, T t, boolean z) {
        this.f32736e.m4663b(c11816c, z);
        interfaceC11821f.mo5257a(t, this.f32736e);
        return this;
    }

    /* renamed from: r */
    private static InterfaceC12629d m4678r(C11816c c11816c) {
        InterfaceC12629d interfaceC12629d = (InterfaceC12629d) c11816c.m6831c(InterfaceC12629d.class);
        if (interfaceC12629d != null) {
            return interfaceC12629d;
        }
        throw new C11815b("Field has no @Protobuf config");
    }

    /* renamed from: s */
    private static int m4677s(C11816c c11816c) {
        InterfaceC12629d interfaceC12629d = (InterfaceC12629d) c11816c.m6831c(InterfaceC12629d.class);
        if (interfaceC12629d != null) {
            return interfaceC12629d.tag();
        }
        throw new C11815b("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static /* synthetic */ void m4676t(Map.Entry entry, InterfaceC11820e interfaceC11820e) {
        interfaceC11820e.mo4693c(f32729g, entry.getKey());
        interfaceC11820e.mo4693c(f32730h, entry.getValue());
    }

    /* renamed from: u */
    private void m4675u(int i) {
        while ((i & (-128)) != 0) {
            this.f32732a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f32732a.write(i & 127);
    }

    /* renamed from: v */
    private void m4674v(long j) {
        while (((-128) & j) != 0) {
            this.f32732a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f32732a.write(((int) j) & 127);
    }

    @Override // p300qb.InterfaceC11820e
    /* renamed from: c */
    public InterfaceC11820e mo4693c(C11816c c11816c, Object obj) {
        return m4689g(c11816c, obj, true);
    }

    /* renamed from: e */
    InterfaceC11820e m4691e(C11816c c11816c, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m4675u((m4677s(c11816c) << 3) | 1);
        this.f32732a.write(m4683m(8).putDouble(d).array());
        return this;
    }

    /* renamed from: f */
    InterfaceC11820e m4690f(C11816c c11816c, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m4675u((m4677s(c11816c) << 3) | 5);
        this.f32732a.write(m4683m(4).putFloat(f).array());
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public InterfaceC11820e m4689g(C11816c c11816c, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m4675u((m4677s(c11816c) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f32728f);
            m4675u(bytes.length);
            this.f32732a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m4689g(c11816c, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m4681o(f32731i, c11816c, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return m4691e(c11816c, ((Double) obj).doubleValue(), z);
        } else {
            if (obj instanceof Float) {
                return m4690f(c11816c, ((Float) obj).floatValue(), z);
            }
            if (obj instanceof Number) {
                return m4685k(c11816c, ((Number) obj).longValue(), z);
            }
            if (obj instanceof Boolean) {
                return m4684l(c11816c, ((Boolean) obj).booleanValue(), z);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return this;
                }
                m4675u((m4677s(c11816c) << 3) | 2);
                m4675u(bArr.length);
                this.f32732a.write(bArr);
                return this;
            }
            InterfaceC11819d<?> interfaceC11819d = this.f32733b.get(obj.getClass());
            if (interfaceC11819d != null) {
                return m4681o(interfaceC11819d, c11816c, obj, z);
            }
            InterfaceC11821f<?> interfaceC11821f = this.f32734c.get(obj.getClass());
            if (interfaceC11821f != null) {
                return m4680p(interfaceC11821f, c11816c, obj, z);
            }
            if (obj instanceof InterfaceC12628c) {
                return mo4695a(c11816c, ((InterfaceC12628c) obj).getNumber());
            }
            if (obj instanceof Enum) {
                return mo4695a(c11816c, ((Enum) obj).ordinal());
            }
            return m4681o(this.f32735d, c11816c, obj, z);
        }
    }

    @Override // p300qb.InterfaceC11820e
    /* renamed from: h */
    public C12632f mo4695a(C11816c c11816c, int i) {
        return m4687i(c11816c, i, true);
    }

    /* renamed from: i */
    C12632f m4687i(C11816c c11816c, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        InterfaceC12629d m4678r = m4678r(c11816c);
        int i2 = C12633a.f32737a[m4678r.intEncoding().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    m4675u((m4678r.tag() << 3) | 5);
                    this.f32732a.write(m4683m(4).putInt(i).array());
                }
            } else {
                m4675u(m4678r.tag() << 3);
                m4675u((i << 1) ^ (i >> 31));
            }
        } else {
            m4675u(m4678r.tag() << 3);
            m4675u(i);
        }
        return this;
    }

    @Override // p300qb.InterfaceC11820e
    /* renamed from: j */
    public C12632f mo4694b(C11816c c11816c, long j) {
        return m4685k(c11816c, j, true);
    }

    /* renamed from: k */
    C12632f m4685k(C11816c c11816c, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        InterfaceC12629d m4678r = m4678r(c11816c);
        int i = C12633a.f32737a[m4678r.intEncoding().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m4675u((m4678r.tag() << 3) | 1);
                    this.f32732a.write(m4683m(8).putLong(j).array());
                }
            } else {
                m4675u(m4678r.tag() << 3);
                m4674v((j >> 63) ^ (j << 1));
            }
        } else {
            m4675u(m4678r.tag() << 3);
            m4674v(j);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public C12632f m4684l(C11816c c11816c, boolean z, boolean z2) {
        return m4687i(c11816c, z ? 1 : 0, z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public C12632f m4679q(Object obj) {
        if (obj == null) {
            return this;
        }
        InterfaceC11819d<?> interfaceC11819d = this.f32733b.get(obj.getClass());
        if (interfaceC11819d != null) {
            interfaceC11819d.mo3313a(obj, this);
            return this;
        }
        throw new C11815b("No encoder for " + obj.getClass());
    }
}
