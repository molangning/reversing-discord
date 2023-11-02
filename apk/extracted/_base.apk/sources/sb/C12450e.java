package sb;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import p300qb.C11815b;
import p300qb.C11816c;
import p300qb.InterfaceC11819d;
import p300qb.InterfaceC11820e;
import p300qb.InterfaceC11821f;
import p300qb.InterfaceC11822g;

/* renamed from: sb.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12450e implements InterfaceC11820e, InterfaceC11822g {

    /* renamed from: a */
    private C12450e f32394a = null;

    /* renamed from: b */
    private boolean f32395b = true;

    /* renamed from: c */
    private final JsonWriter f32396c;

    /* renamed from: d */
    private final Map<Class<?>, InterfaceC11819d<?>> f32397d;

    /* renamed from: e */
    private final Map<Class<?>, InterfaceC11821f<?>> f32398e;

    /* renamed from: f */
    private final InterfaceC11819d<Object> f32399f;

    /* renamed from: g */
    private final boolean f32400g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12450e(Writer writer, Map<Class<?>, InterfaceC11819d<?>> map, Map<Class<?>, InterfaceC11821f<?>> map2, InterfaceC11819d<Object> interfaceC11819d, boolean z) {
        this.f32396c = new JsonWriter(writer);
        this.f32397d = map;
        this.f32398e = map2;
        this.f32399f = interfaceC11819d;
        this.f32400g = z;
    }

    /* renamed from: o */
    private boolean m5246o(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: r */
    private C12450e m5243r(String str, Object obj) {
        m5241t();
        this.f32396c.name(str);
        if (obj == null) {
            this.f32396c.nullValue();
            return this;
        }
        return m5253h(obj, false);
    }

    /* renamed from: s */
    private C12450e m5242s(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        m5241t();
        this.f32396c.name(str);
        return m5253h(obj, false);
    }

    /* renamed from: t */
    private void m5241t() {
        if (this.f32395b) {
            C12450e c12450e = this.f32394a;
            if (c12450e != null) {
                c12450e.m5241t();
                this.f32394a.f32395b = false;
                this.f32394a = null;
                this.f32396c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // p300qb.InterfaceC11820e
    /* renamed from: a */
    public InterfaceC11820e mo4695a(C11816c c11816c, int i) {
        return m5251j(c11816c.m6832b(), i);
    }

    @Override // p300qb.InterfaceC11820e
    /* renamed from: b */
    public InterfaceC11820e mo4694b(C11816c c11816c, long j) {
        return m5250k(c11816c.m6832b(), j);
    }

    @Override // p300qb.InterfaceC11820e
    /* renamed from: c */
    public InterfaceC11820e mo4693c(C11816c c11816c, Object obj) {
        return m5249l(c11816c.m6832b(), obj);
    }

    /* renamed from: f */
    public C12450e m5255f(int i) {
        m5241t();
        this.f32396c.value(i);
        return this;
    }

    /* renamed from: g */
    public C12450e m5254g(long j) {
        m5241t();
        this.f32396c.value(j);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C12450e m5253h(Object obj, boolean z) {
        int[] iArr;
        Class<?> cls;
        int i = 0;
        if (z && m5246o(obj)) {
            Object[] objArr = new Object[1];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            objArr[0] = cls;
            throw new C11815b(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f32396c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f32396c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return m5247n((byte[]) obj);
            }
            this.f32396c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    this.f32396c.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    m5254g(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f32396c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f32396c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    m5253h(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    m5253h(obj2, false);
                }
            }
            this.f32396c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f32396c.beginArray();
            for (Object obj3 : (Collection) obj) {
                m5253h(obj3, false);
            }
            this.f32396c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f32396c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    m5249l((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new C11815b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            this.f32396c.endObject();
            return this;
        } else {
            InterfaceC11819d<?> interfaceC11819d = this.f32397d.get(obj.getClass());
            if (interfaceC11819d != null) {
                return m5244q(interfaceC11819d, obj, z);
            }
            InterfaceC11821f<?> interfaceC11821f = this.f32398e.get(obj.getClass());
            if (interfaceC11821f != null) {
                interfaceC11821f.mo5257a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                mo4662d(((Enum) obj).name());
                return this;
            } else {
                return m5244q(this.f32399f, obj, z);
            }
        }
    }

    @Override // p300qb.InterfaceC11822g
    /* renamed from: i */
    public C12450e mo4662d(String str) {
        m5241t();
        this.f32396c.value(str);
        return this;
    }

    /* renamed from: j */
    public C12450e m5251j(String str, int i) {
        m5241t();
        this.f32396c.name(str);
        return m5255f(i);
    }

    /* renamed from: k */
    public C12450e m5250k(String str, long j) {
        m5241t();
        this.f32396c.name(str);
        return m5254g(j);
    }

    /* renamed from: l */
    public C12450e m5249l(String str, Object obj) {
        if (this.f32400g) {
            return m5242s(str, obj);
        }
        return m5243r(str, obj);
    }

    @Override // p300qb.InterfaceC11822g
    /* renamed from: m */
    public C12450e mo4661e(boolean z) {
        m5241t();
        this.f32396c.value(z);
        return this;
    }

    /* renamed from: n */
    public C12450e m5247n(byte[] bArr) {
        m5241t();
        if (bArr == null) {
            this.f32396c.nullValue();
        } else {
            this.f32396c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m5245p() {
        m5241t();
        this.f32396c.flush();
    }

    /* renamed from: q */
    C12450e m5244q(InterfaceC11819d<Object> interfaceC11819d, Object obj, boolean z) {
        if (!z) {
            this.f32396c.beginObject();
        }
        interfaceC11819d.mo3313a(obj, this);
        if (!z) {
            this.f32396c.endObject();
        }
        return this;
    }
}
