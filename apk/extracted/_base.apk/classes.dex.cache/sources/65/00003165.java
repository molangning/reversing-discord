package dj;

import bj.AbstractC2322d;
import bj.AbstractC2325e;
import bj.AbstractC2342h;
import bj.AbstractC2345i;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9659r;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import kotlinx.serialization.json.C9960c;
import kotlinx.serialization.json.C9964g;
import kotlinx.serialization.json.C9978n;
import kotlinx.serialization.json.InterfaceC9962e;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p045cj.AbstractC2564b1;
import p088ej.AbstractC6257c;
import pf.C11568i;

@Metadata(m14358d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010;\u001a\u000207\u0012\u0006\u0010?\u001a\u00020\u0003¢\u0006\u0004\bH\u0010IJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0014\u0010\f\u001a\u00020\u000b*\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016J#\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0014J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0005H\u0004J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0005H$J\u0018\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0016H\u0014J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010'\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010)\u001a\u00020(2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010*\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010,\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010.\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u00100\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u00102\u001a\u0002012\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u00103\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0018\u00106\u001a\u0002052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0016H\u0014R\u001a\u0010;\u001a\u0002078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\b9\u0010:R\u001a\u0010?\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F\u0082\u0001\u0003JKL¨\u0006M"}, m14357d2 = {"Ldj/c;", "Lcj/b1;", "Lkotlinx/serialization/json/e;", "Lkotlinx/serialization/json/JsonElement;", "i0", "", "primitive", "", "x0", "Lkotlinx/serialization/json/JsonPrimitive;", "type", "Lkotlinx/serialization/json/n;", "g0", "g", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "G", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "parentName", "childName", "c0", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/encoding/c;", "b", "", "c", "", "D", "tag", "v0", "h0", "enumDescriptor", "", "n0", "s0", "j0", "", "k0", "", "t0", "q0", "", "r0", "", "o0", "", "m0", "", "l0", "u0", "inlineDescriptor", "Lkotlinx/serialization/encoding/Decoder;", "p0", "Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/Json;", "d", "()Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/JsonElement;", "w0", "()Lkotlinx/serialization/json/JsonElement;", "value", "Lkotlinx/serialization/json/c;", "e", "Lkotlinx/serialization/json/c;", "configuration", "Lej/c;", "a", "()Lej/c;", "serializersModule", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;)V", "Ldj/d0;", "Ldj/g0;", "Ldj/h0;", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC5977c extends AbstractC2564b1 implements InterfaceC9962e {

    /* renamed from: c */
    private final Json f17012c;

    /* renamed from: d */
    private final JsonElement f17013d;

    /* renamed from: e */
    protected final C9960c f17014e;

    private AbstractC5977c(Json json, JsonElement jsonElement) {
        this.f17012c = json;
        this.f17013d = jsonElement;
        this.f17014e = mo12744d().m12780e();
    }

    public /* synthetic */ AbstractC5977c(Json json, JsonElement jsonElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement);
    }

    /* renamed from: g0 */
    private final C9978n m23989g0(JsonPrimitive jsonPrimitive, String str) {
        C9978n c9978n = jsonPrimitive instanceof C9978n ? (C9978n) jsonPrimitive : null;
        if (c9978n != null) {
            return c9978n;
        }
        throw C5973a0.m24014d(-1, "Unexpected 'null' when " + str + " was expected");
    }

    /* renamed from: i0 */
    private final JsonElement m23988i0() {
        JsonElement mo23936h0;
        String m32966X = m32966X();
        return (m32966X == null || (mo23936h0 = mo23936h0(m32966X)) == null) ? mo23935w0() : mo23936h0;
    }

    /* renamed from: x0 */
    private final Void m23974x0(String str) {
        throw C5973a0.m24013e(-1, "Failed to parse '" + str + '\'', m23988i0().toString());
    }

    @Override // p045cj.AbstractC2565b2, kotlinx.serialization.encoding.Decoder
    /* renamed from: D */
    public boolean mo12925D() {
        return !(m23988i0() instanceof JsonNull);
    }

    @Override // p045cj.AbstractC2565b2, kotlinx.serialization.encoding.Decoder
    /* renamed from: G */
    public <T> T mo12924G(DeserializationStrategy<? extends T> deserializer) {
        C9612q.m13917h(deserializer, "deserializer");
        return (T) C5999l0.m23914d(this, deserializer);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: a */
    public AbstractC6257c mo12873a() {
        return mo12744d().mo265a();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: b */
    public InterfaceC9936c mo12920b(SerialDescriptor descriptor) {
        boolean z;
        C9612q.m13917h(descriptor, "descriptor");
        JsonElement m23988i0 = m23988i0();
        AbstractC2342h mo12684g = descriptor.mo12684g();
        if (C9612q.m13922c(mo12684g, AbstractC2345i.C2347b.f6456a)) {
            z = true;
        } else {
            z = mo12684g instanceof AbstractC2322d;
        }
        if (z) {
            Json mo12744d = mo12744d();
            if (m23988i0 instanceof JsonArray) {
                return new C5989h0(mo12744d, (JsonArray) m23988i0);
            }
            throw C5973a0.m24014d(-1, "Expected " + C9591f0.m13969b(JsonArray.class) + " as the serialized body of " + descriptor.mo12682i() + ", but had " + C9591f0.m13969b(m23988i0.getClass()));
        } else if (C9612q.m13922c(mo12684g, AbstractC2345i.C2348c.f6457a)) {
            Json mo12744d2 = mo12744d();
            SerialDescriptor m23862a = C6021u0.m23862a(descriptor.mo12683h(0), mo12744d2.mo265a());
            AbstractC2342h mo12684g2 = m23862a.mo12684g();
            if (!(mo12684g2 instanceof AbstractC2325e) && !C9612q.m13922c(mo12684g2, AbstractC2342h.C2344b.f6454a)) {
                if (mo12744d2.m12780e().m12756b()) {
                    Json mo12744d3 = mo12744d();
                    if (m23988i0 instanceof JsonArray) {
                        return new C5989h0(mo12744d3, (JsonArray) m23988i0);
                    }
                    throw C5973a0.m24014d(-1, "Expected " + C9591f0.m13969b(JsonArray.class) + " as the serialized body of " + descriptor.mo12682i() + ", but had " + C9591f0.m13969b(m23988i0.getClass()));
                }
                throw C5973a0.m24015c(m23862a);
            }
            Json mo12744d4 = mo12744d();
            if (m23988i0 instanceof JsonObject) {
                return new C5991i0(mo12744d4, (JsonObject) m23988i0);
            }
            throw C5973a0.m24014d(-1, "Expected " + C9591f0.m13969b(JsonObject.class) + " as the serialized body of " + descriptor.mo12682i() + ", but had " + C9591f0.m13969b(m23988i0.getClass()));
        } else {
            Json mo12744d5 = mo12744d();
            if (m23988i0 instanceof JsonObject) {
                return new C5987g0(mo12744d5, (JsonObject) m23988i0, null, null, 12, null);
            }
            throw C5973a0.m24014d(-1, "Expected " + C9591f0.m13969b(JsonObject.class) + " as the serialized body of " + descriptor.mo12682i() + ", but had " + C9591f0.m13969b(m23988i0.getClass()));
        }
    }

    @Override // p045cj.AbstractC2565b2, kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: c */
    public void mo12872c(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
    }

    @Override // p045cj.AbstractC2564b1
    /* renamed from: c0 */
    protected String mo23990c0(String parentName, String childName) {
        C9612q.m13917h(parentName, "parentName");
        C9612q.m13917h(childName, "childName");
        return childName;
    }

    @Override // kotlinx.serialization.json.InterfaceC9962e
    /* renamed from: d */
    public Json mo12744d() {
        return this.f17012c;
    }

    @Override // kotlinx.serialization.json.InterfaceC9962e
    /* renamed from: g */
    public JsonElement mo12743g() {
        return m23988i0();
    }

    /* renamed from: h0 */
    protected abstract JsonElement mo23936h0(String str);

    @Override // p045cj.AbstractC2565b2
    /* renamed from: j0 */
    public boolean mo22632K(String tag) {
        C9612q.m13917h(tag, "tag");
        JsonPrimitive m23975v0 = m23975v0(tag);
        if (!mo12744d().m12780e().m12745m() && m23989g0(m23975v0, "boolean").mo12699e()) {
            throw C5973a0.m24013e(-1, "Boolean literal for key '" + tag + "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", m23988i0().toString());
        }
        try {
            Boolean m12733g = C9964g.m12733g(m23975v0);
            if (m12733g != null) {
                return m12733g.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            m23974x0("boolean");
            throw new C11568i();
        }
    }

    @Override // p045cj.AbstractC2565b2
    /* renamed from: k0 */
    public byte mo22631L(String tag) {
        Byte b;
        C9612q.m13917h(tag, "tag");
        try {
            int m12728l = C9964g.m12728l(m23975v0(tag));
            boolean z = false;
            if (-128 <= m12728l && m12728l <= 127) {
                z = true;
            }
            if (z) {
                b = Byte.valueOf((byte) m12728l);
            } else {
                b = null;
            }
            if (b != null) {
                return b.byteValue();
            }
            m23974x0("byte");
            throw new C11568i();
        } catch (IllegalArgumentException unused) {
            m23974x0("byte");
            throw new C11568i();
        }
    }

    @Override // p045cj.AbstractC2565b2
    /* renamed from: l0 */
    public char mo22630M(String tag) {
        char m13675Z0;
        C9612q.m13917h(tag, "tag");
        try {
            m13675Z0 = C9659r.m13675Z0(m23975v0(tag).mo12700a());
            return m13675Z0;
        } catch (IllegalArgumentException unused) {
            m23974x0("char");
            throw new C11568i();
        }
    }

    @Override // p045cj.AbstractC2565b2
    /* renamed from: m0 */
    public double mo22629N(String tag) {
        boolean z;
        C9612q.m13917h(tag, "tag");
        try {
            double m12731i = C9964g.m12731i(m23975v0(tag));
            if (!mo12744d().m12780e().m12757a()) {
                if (!Double.isInfinite(m12731i) && !Double.isNaN(m12731i)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw C5973a0.m24017a(Double.valueOf(m12731i), tag, m23988i0().toString());
                }
            }
            return m12731i;
        } catch (IllegalArgumentException unused) {
            m23974x0("double");
            throw new C11568i();
        }
    }

    @Override // p045cj.AbstractC2565b2
    /* renamed from: n0 */
    public int mo22637O(String tag, SerialDescriptor enumDescriptor) {
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(enumDescriptor, "enumDescriptor");
        return C5975b0.m23996j(enumDescriptor, mo12744d(), m23975v0(tag).mo12700a(), null, 4, null);
    }

    @Override // p045cj.AbstractC2565b2
    /* renamed from: o0 */
    public float mo22628P(String tag) {
        boolean z;
        C9612q.m13917h(tag, "tag");
        try {
            float m12729k = C9964g.m12729k(m23975v0(tag));
            if (!mo12744d().m12780e().m12757a()) {
                if (!Float.isInfinite(m12729k) && !Float.isNaN(m12729k)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw C5973a0.m24017a(Float.valueOf(m12729k), tag, m23988i0().toString());
                }
            }
            return m12729k;
        } catch (IllegalArgumentException unused) {
            m23974x0("float");
            throw new C11568i();
        }
    }

    @Override // p045cj.AbstractC2565b2
    /* renamed from: p0 */
    public Decoder mo23993Q(String tag, SerialDescriptor inlineDescriptor) {
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(inlineDescriptor, "inlineDescriptor");
        if (C6010p0.m23894b(inlineDescriptor)) {
            return new C6022v(new C6012q0(m23975v0(tag).mo12700a()), mo12744d());
        }
        return super.mo23993Q(tag, inlineDescriptor);
    }

    @Override // p045cj.AbstractC2565b2
    /* renamed from: q0 */
    public int mo22627R(String tag) {
        C9612q.m13917h(tag, "tag");
        try {
            return C9964g.m12728l(m23975v0(tag));
        } catch (IllegalArgumentException unused) {
            m23974x0("int");
            throw new C11568i();
        }
    }

    @Override // p045cj.AbstractC2565b2
    /* renamed from: r0 */
    public long mo22626S(String tag) {
        C9612q.m13917h(tag, "tag");
        try {
            return C9964g.m12724p(m23975v0(tag));
        } catch (IllegalArgumentException unused) {
            m23974x0("long");
            throw new C11568i();
        }
    }

    @Override // p045cj.AbstractC2565b2
    /* renamed from: s0 */
    public boolean mo23992T(String tag) {
        C9612q.m13917h(tag, "tag");
        if (mo23936h0(tag) != JsonNull.INSTANCE) {
            return true;
        }
        return false;
    }

    @Override // p045cj.AbstractC2565b2
    /* renamed from: t0 */
    public short mo22625U(String tag) {
        Short sh2;
        C9612q.m13917h(tag, "tag");
        try {
            int m12728l = C9964g.m12728l(m23975v0(tag));
            boolean z = false;
            if (-32768 <= m12728l && m12728l <= 32767) {
                z = true;
            }
            if (z) {
                sh2 = Short.valueOf((short) m12728l);
            } else {
                sh2 = null;
            }
            if (sh2 != null) {
                return sh2.shortValue();
            }
            m23974x0("short");
            throw new C11568i();
        } catch (IllegalArgumentException unused) {
            m23974x0("short");
            throw new C11568i();
        }
    }

    @Override // p045cj.AbstractC2565b2
    /* renamed from: u0 */
    public String mo23991V(String tag) {
        C9612q.m13917h(tag, "tag");
        JsonPrimitive m23975v0 = m23975v0(tag);
        if (!mo12744d().m12780e().m12745m() && !m23989g0(m23975v0, "string").mo12699e()) {
            throw C5973a0.m24013e(-1, "String literal for key '" + tag + "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", m23988i0().toString());
        } else if (!(m23975v0 instanceof JsonNull)) {
            return m23975v0.mo12700a();
        } else {
            throw C5973a0.m24013e(-1, "Unexpected 'null' value instead of string literal", m23988i0().toString());
        }
    }

    /* renamed from: v0 */
    protected final JsonPrimitive m23975v0(String tag) {
        JsonPrimitive jsonPrimitive;
        C9612q.m13917h(tag, "tag");
        JsonElement mo23936h0 = mo23936h0(tag);
        if (mo23936h0 instanceof JsonPrimitive) {
            jsonPrimitive = (JsonPrimitive) mo23936h0;
        } else {
            jsonPrimitive = null;
        }
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        throw C5973a0.m24013e(-1, "Expected JsonPrimitive at " + tag + ", found " + mo23936h0, m23988i0().toString());
    }

    /* renamed from: w0 */
    public abstract JsonElement mo23935w0();
}