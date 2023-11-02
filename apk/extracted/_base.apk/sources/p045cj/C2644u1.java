package p045cj;

import bj.AbstractC2325e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9583c;
import kotlin.jvm.internal.C9585d;
import kotlin.jvm.internal.C9590f;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9598i0;
import kotlin.jvm.internal.C9599j;
import kotlin.jvm.internal.C9601k;
import kotlin.jvm.internal.C9602k0;
import kotlin.jvm.internal.C9611p;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.C9615t;
import kotlin.reflect.KClass;
import kotlin.text.C9638c;
import kotlin.text.C9644h;
import kotlin.text.C9653o;
import kotlin.time.Duration;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p014aj.C0213a;
import p304qf.C11889v;
import pf.C11546a0;
import pf.C11549b0;
import pf.C11552c0;
import pf.C11555d0;
import pf.C11558e0;
import pf.C11563g0;
import pf.C11566h0;
import pf.C11591x;
import pf.C11593z;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\f\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0002\u001a$\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f\"\b\b\u0000\u0010\n*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0000\"6\u0010\u0012\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\f0\u000e8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m14357d2 = {"", "serialName", "Lbj/e;", "kind", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "", "d", "c", "", "T", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "b", "", "Ljava/util/Map;", "getBUILTIN_SERIALIZERS$annotations", "()V", "BUILTIN_SERIALIZERS", "kotlinx-serialization-core"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: cj.u1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2644u1 {

    /* renamed from: a */
    private static final Map<KClass<? extends Object>, KSerializer<? extends Object>> f7120a;

    static {
        Map<KClass<? extends Object>, KSerializer<? extends Object>> m6751k;
        m6751k = C11889v.m6751k(C11591x.m7577a(C9591f0.m13969b(String.class), C0213a.m40946E(C9602k0.f25351a)), C11591x.m7577a(C9591f0.m13969b(Character.TYPE), C0213a.m40916y(C9590f.f25336a)), C11591x.m7577a(C9591f0.m13969b(char[].class), C0213a.m40937d()), C11591x.m7577a(C9591f0.m13969b(Double.TYPE), C0213a.m40915z(C9599j.f25348a)), C11591x.m7577a(C9591f0.m13969b(double[].class), C0213a.m40936e()), C11591x.m7577a(C9591f0.m13969b(Float.TYPE), C0213a.m40950A(C9601k.f25350a)), C11591x.m7577a(C9591f0.m13969b(float[].class), C0213a.m40935f()), C11591x.m7577a(C9591f0.m13969b(Long.TYPE), C0213a.m40948C(C9615t.f25355a)), C11591x.m7577a(C9591f0.m13969b(long[].class), C0213a.m40932i()), C11591x.m7577a(C9591f0.m13969b(C11555d0.class), C0213a.m40942I(C11555d0.f30064k)), C11591x.m7577a(C9591f0.m13969b(C11558e0.class), C0213a.m40922s()), C11591x.m7577a(C9591f0.m13969b(Integer.TYPE), C0213a.m40949B(C9611p.f25354a)), C11591x.m7577a(C9591f0.m13969b(int[].class), C0213a.m40934g()), C11591x.m7577a(C9591f0.m13969b(C11549b0.class), C0213a.m40943H(C11549b0.f30055k)), C11591x.m7577a(C9591f0.m13969b(C11552c0.class), C0213a.m40923r()), C11591x.m7577a(C9591f0.m13969b(Short.TYPE), C0213a.m40947D(C9598i0.f25347a)), C11591x.m7577a(C9591f0.m13969b(short[].class), C0213a.m40926o()), C11591x.m7577a(C9591f0.m13969b(C11563g0.class), C0213a.m40941J(C11563g0.f30070k)), C11591x.m7577a(C9591f0.m13969b(C11566h0.class), C0213a.m40921t()), C11591x.m7577a(C9591f0.m13969b(Byte.TYPE), C0213a.m40917x(C9585d.f25333a)), C11591x.m7577a(C9591f0.m13969b(byte[].class), C0213a.m40938c()), C11591x.m7577a(C9591f0.m13969b(C11593z.class), C0213a.m40944G(C11593z.f30104k)), C11591x.m7577a(C9591f0.m13969b(C11546a0.class), C0213a.m40924q()), C11591x.m7577a(C9591f0.m13969b(Boolean.TYPE), C0213a.m40918w(C9583c.f25332a)), C11591x.m7577a(C9591f0.m13969b(boolean[].class), C0213a.m40939b()), C11591x.m7577a(C9591f0.m13969b(Unit.class), C0213a.m40919v(Unit.f25302a)), C11591x.m7577a(C9591f0.m13969b(Void.class), C0213a.m40929l()), C11591x.m7577a(C9591f0.m13969b(Duration.class), C0213a.m40945F(Duration.f25397k)));
        f7120a = m6751k;
    }

    /* renamed from: a */
    public static final SerialDescriptor m32805a(String serialName, AbstractC2325e kind) {
        C9612q.m13917h(serialName, "serialName");
        C9612q.m13917h(kind, "kind");
        m32802d(serialName);
        return new C2641t1(serialName, kind);
    }

    /* renamed from: b */
    public static final <T> KSerializer<T> m32804b(KClass<T> kClass) {
        C9612q.m13917h(kClass, "<this>");
        return (KSerializer<T>) f7120a.get(kClass);
    }

    /* renamed from: c */
    private static final String m32803c(String str) {
        if (str.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = str.charAt(0);
            sb2.append((Object) (Character.isLowerCase(charAt) ? C9638c.m13848g(charAt) : String.valueOf(charAt)));
            String substring = str.substring(1);
            C9612q.m13918g(substring, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring);
            return sb2.toString();
        }
        return str;
    }

    /* renamed from: d */
    private static final void m32802d(String str) {
        boolean m13754t;
        String m13778f;
        boolean m13754t2;
        for (KClass<? extends Object> kClass : f7120a.keySet()) {
            String mo13883l = kClass.mo13883l();
            C9612q.m13920e(mo13883l);
            String m32803c = m32803c(mo13883l);
            m13754t = C9653o.m13754t(str, "kotlin." + m32803c, true);
            if (!m13754t) {
                m13754t2 = C9653o.m13754t(str, m32803c, true);
                if (m13754t2) {
                }
            }
            m13778f = C9644h.m13778f("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + m32803c(m32803c) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
            throw new IllegalArgumentException(m13778f);
        }
    }
}
