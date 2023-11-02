package kg;

import ag.C0156a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kh.C9412i;
import kh.C9425n;
import kh.C9450s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9536e;
import kotlin.collections.C9544i;
import kotlin.collections.C9550o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9586d0;
import kotlin.jvm.internal.C9605m;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.InterfaceC9596h0;
import kotlin.reflect.KCallable;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import kotlin.text.C9653o;
import mh.AbstractC10456a;
import mh.C10468g;
import mh.C10469h;
import mh.InterfaceC10463c;
import ng.EnumC10876i;
import p070di.C5939k;
import p070di.C5942m;
import p070di.C5958w;
import p142hi.AbstractC7264g0;
import p160ih.C7571t;
import p160ih.InterfaceC7564r;
import p218lg.C10148c;
import p304qf.C11889v;
import p305qg.AbstractC11988u;
import p305qg.C11974t;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11997x0;
import p325rg.InterfaceC12147a;
import p325rg.InterfaceC12149c;
import p325rg.InterfaceC12155g;
import p326rh.InterfaceC12210q;
import p389vh.AbstractC13301g;
import p389vh.AbstractC13307k;
import p389vh.C13294a;
import p389vh.C13296b;
import p389vh.C13306j;
import p389vh.C13320q;
import p389vh.C13326s;
import p407wg.AbstractC13571p;
import p407wg.C13548d;
import p407wg.C13551e;
import p407wg.C13559l;
import p429xh.C13801c;
import pf.C11581q;
import pf.C11591x;
import pg.C11599c;
import ph.C11632b;
import ph.C11633c;
import ph.C11634d;
import ph.C11638f;
import th.C12762g;
import vg.C13279b;
import vg.C13282e;
import vg.C13283f;
import vg.C13289k;
import vg.C13291l;

@Metadata(m14358d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a(\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002\u001a.\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a\u0014\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0000\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0000\u001a\u0012\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u0012H\u0000\u001a\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002\u001a\u000e\u0010\u0018\u001a\u0004\u0018\u00010\u0014*\u00020\u0017H\u0002\u001a\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a*\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001e*\u0004\u0018\u00010\u001aH\u0000\u001a\u0014\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010 *\u0004\u0018\u00010\u001aH\u0000\u001a\u0014\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\"*\u0004\u0018\u00010\u001aH\u0000\u001a\u0012\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010%\u001a\u00020$H\u0000\u001ai\u00106\u001a\u00028\u0001\"\b\b\u0000\u0010(*\u00020'\"\b\b\u0001\u0010**\u00020)2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010,\u001a\u00028\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0018\u00105\u001a\u0014\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000103H\u0000¢\u0006\u0004\b6\u00107\u001a'\u0010;\u001a\u00028\u0000\"\u0004\b\u0000\u001082\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0080\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\"\u001a\u0010A\u001a\u00020=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010>\u001a\u0004\b?\u0010@\"\u0018\u0010F\u001a\u00020C*\u00020B8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E\"\u001a\u0010J\u001a\u0004\u0018\u00010G*\u00020)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006K"}, m14357d2 = {"Lqg/e;", "Ljava/lang/Class;", "p", "Ljava/lang/ClassLoader;", "classLoader", "Lph/b;", "kotlinClassId", "", "arrayDimensions", "m", "", "packageName", "className", "l", "f", "Lqg/u;", "Lkotlin/reflect/KVisibility;", "q", "Lrg/a;", "", "", "e", "s", "Lrg/c;", "o", "Lvh/g;", "", "r", "Lvh/b;", "a", "Lkg/q;", "c", "Lkg/c0;", "d", "Lkg/l;", "b", "Ljava/lang/reflect/Type;", "type", "g", "Lrh/q;", "M", "Lqg/a;", "D", "moduleAnchor", "proto", "Lmh/c;", "nameResolver", "Lmh/g;", "typeTable", "Lmh/a;", "metadataVersion", "Lkotlin/Function2;", "Ldi/w;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lph/c;", "Lph/c;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "JVM_STATIC", "Lkotlin/reflect/KType;", "", "k", "(Lkotlin/reflect/KType;)Z", "isInlineClassType", "Lqg/x0;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: kg.p0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C9336p0 {

    /* renamed from: a */
    private static final C11633c f24439a = new C11633c("kotlin.jvm.JvmStatic");

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: kg.p0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class C9337a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24440a;

        static {
            int[] iArr = new int[EnumC10876i.values().length];
            try {
                iArr[EnumC10876i.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC10876i.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC10876i.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC10876i.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC10876i.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC10876i.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC10876i.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC10876i.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f24440a = iArr;
        }
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v12, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v14, types: [byte[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=char[], code=short[], for r7v13, types: [char[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v16, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v18, types: [long[]] */
    /* JADX WARN: Type inference failed for: r7v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object[]] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.Object m15859a(p389vh.C13296b r6, java.lang.ClassLoader r7) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.C9336p0.m15859a(vh.b, java.lang.ClassLoader):java.lang.Object");
    }

    /* renamed from: b */
    public static final AbstractC9282l<?> m15858b(Object obj) {
        AbstractC9282l<?> abstractC9282l = obj instanceof AbstractC9282l ? (AbstractC9282l) obj : null;
        if (abstractC9282l == null) {
            C9338q m15857c = m15857c(obj);
            return m15857c != null ? m15857c : m15856d(obj);
        }
        return abstractC9282l;
    }

    /* renamed from: c */
    public static final C9338q m15857c(Object obj) {
        C9338q c9338q = obj instanceof C9338q ? (C9338q) obj : null;
        if (c9338q == null) {
            C9605m c9605m = obj instanceof C9605m ? (C9605m) obj : null;
            KCallable compute = c9605m != null ? c9605m.compute() : null;
            if (compute instanceof C9338q) {
                return (C9338q) compute;
            }
            return null;
        }
        return c9338q;
    }

    /* renamed from: d */
    public static final AbstractC9231c0<?> m15856d(Object obj) {
        AbstractC9231c0<?> abstractC9231c0 = obj instanceof AbstractC9231c0 ? (AbstractC9231c0) obj : null;
        if (abstractC9231c0 == null) {
            AbstractC9586d0 abstractC9586d0 = obj instanceof AbstractC9586d0 ? (AbstractC9586d0) obj : null;
            KCallable compute = abstractC9586d0 != null ? abstractC9586d0.compute() : null;
            if (compute instanceof AbstractC9231c0) {
                return (AbstractC9231c0) compute;
            }
            return null;
        }
        return abstractC9231c0;
    }

    /* renamed from: e */
    public static final List<Annotation> m15855e(InterfaceC12147a interfaceC12147a) {
        Annotation m15845o;
        C13551e c13551e;
        C9612q.m13917h(interfaceC12147a, "<this>");
        InterfaceC12155g annotations = interfaceC12147a.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC12149c interfaceC12149c : annotations) {
            InterfaceC11900a1 mo6029j = interfaceC12149c.mo6029j();
            if (mo6029j instanceof C13279b) {
                m15845o = ((C13279b) mo6029j).m2867d();
            } else if (mo6029j instanceof C13291l.C13292a) {
                AbstractC13571p mo2834c = ((C13291l.C13292a) mo6029j).mo2834c();
                if (mo2834c instanceof C13551e) {
                    c13551e = (C13551e) mo2834c;
                } else {
                    c13551e = null;
                }
                if (c13551e != null) {
                    m15845o = c13551e.m2235P();
                } else {
                    m15845o = null;
                }
            } else {
                m15845o = m15845o(interfaceC12149c);
            }
            if (m15845o != null) {
                arrayList.add(m15845o);
            }
        }
        return m15841s(arrayList);
    }

    /* renamed from: f */
    public static final Class<?> m15854f(Class<?> cls) {
        C9612q.m13917h(cls, "<this>");
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: g */
    public static final Object m15853g(Type type) {
        C9612q.m13917h(type, "type");
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            if (C9612q.m13922c(type, Boolean.TYPE)) {
                return Boolean.FALSE;
            }
            if (C9612q.m13922c(type, Character.TYPE)) {
                return (char) 0;
            }
            if (C9612q.m13922c(type, Byte.TYPE)) {
                return (byte) 0;
            }
            if (C9612q.m13922c(type, Short.TYPE)) {
                return (short) 0;
            }
            if (C9612q.m13922c(type, Integer.TYPE)) {
                return 0;
            }
            if (C9612q.m13922c(type, Float.TYPE)) {
                return Float.valueOf(0.0f);
            }
            if (C9612q.m13922c(type, Long.TYPE)) {
                return 0L;
            }
            if (C9612q.m13922c(type, Double.TYPE)) {
                return Double.valueOf(0.0d);
            }
            if (C9612q.m13922c(type, Void.TYPE)) {
                throw new IllegalStateException("Parameter with void type is illegal");
            }
            throw new UnsupportedOperationException("Unknown primitive: " + type);
        }
        return null;
    }

    /* renamed from: h */
    public static final <M extends InterfaceC12210q, D extends InterfaceC11897a> D m15852h(Class<?> moduleAnchor, M proto, InterfaceC10463c nameResolver, C10468g typeTable, AbstractC10456a metadataVersion, Function2<? super C5958w, ? super M, ? extends D> createDescriptor) {
        List<C9450s> m15142n0;
        C9612q.m13917h(moduleAnchor, "moduleAnchor");
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(nameResolver, "nameResolver");
        C9612q.m13917h(typeTable, "typeTable");
        C9612q.m13917h(metadataVersion, "metadataVersion");
        C9612q.m13917h(createDescriptor, "createDescriptor");
        C13289k m15981a = C9261i0.m15981a(moduleAnchor);
        if (proto instanceof C9412i) {
            m15142n0 = ((C9412i) proto).m15307m0();
        } else if (proto instanceof C9425n) {
            m15142n0 = ((C9425n) proto).m15142n0();
        } else {
            throw new IllegalStateException(("Unsupported message: " + proto).toString());
        }
        List<C9450s> typeParameters = m15142n0;
        C5939k m2840a = m15981a.m2840a();
        InterfaceC11928h0 m2839b = m15981a.m2839b();
        C10469h m11460b = C10469h.f27350b.m11460b();
        C9612q.m13918g(typeParameters, "typeParameters");
        return createDescriptor.invoke(new C5958w(new C5942m(m2840a, nameResolver, m2839b, typeTable, m11460b, metadataVersion, null, null, typeParameters)), proto);
    }

    /* renamed from: i */
    public static final InterfaceC11997x0 m15851i(InterfaceC11897a interfaceC11897a) {
        C9612q.m13917h(interfaceC11897a, "<this>");
        if (interfaceC11897a.mo4332I() != null) {
            InterfaceC11947m mo4163b = interfaceC11897a.mo4163b();
            C9612q.m13919f(mo4163b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return ((InterfaceC11914e) mo4163b).mo4233J0();
        }
        return null;
    }

    /* renamed from: j */
    public static final C11633c m15850j() {
        return f24439a;
    }

    /* renamed from: k */
    public static final boolean m15849k(KType kType) {
        C9245e0 c9245e0;
        AbstractC7264g0 m15999o;
        C9612q.m13917h(kType, "<this>");
        if (kType instanceof C9245e0) {
            c9245e0 = (C9245e0) kType;
        } else {
            c9245e0 = null;
        }
        if (c9245e0 == null || (m15999o = c9245e0.m15999o()) == null || !C12762g.m4083c(m15999o)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private static final Class<?> m15848l(ClassLoader classLoader, String str, String str2, int i) {
        String m13763C;
        String m13748z;
        if (C9612q.m13922c(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('.');
        m13763C = C9653o.m13763C(str2, '.', '$', false, 4, null);
        sb2.append(m13763C);
        String sb3 = sb2.toString();
        if (i > 0) {
            StringBuilder sb4 = new StringBuilder();
            m13748z = C9653o.m13748z("[", i);
            sb4.append(m13748z);
            sb4.append('L');
            sb4.append(sb3);
            sb4.append(';');
            sb3 = sb4.toString();
        }
        return C13282e.m2857a(classLoader, sb3);
    }

    /* renamed from: m */
    private static final Class<?> m15847m(ClassLoader classLoader, C11632b c11632b, int i) {
        C11599c c11599c = C11599c.f30110a;
        C11634d m7450j = c11632b.m7471b().m7450j();
        C9612q.m13918g(m7450j, "kotlinClassId.asSingleFqName().toUnsafe()");
        C11632b m7551n = c11599c.m7551n(m7450j);
        if (m7551n != null) {
            c11632b = m7551n;
        }
        String m7458b = c11632b.m7465h().m7458b();
        C9612q.m13918g(m7458b, "javaClassId.packageFqName.asString()");
        String m7458b2 = c11632b.m7464i().m7458b();
        C9612q.m13918g(m7458b2, "javaClassId.relativeClassName.asString()");
        return m15848l(classLoader, m7458b, m7458b2, i);
    }

    /* renamed from: n */
    static /* synthetic */ Class m15846n(ClassLoader classLoader, C11632b c11632b, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m15847m(classLoader, c11632b, i);
    }

    /* renamed from: o */
    private static final Annotation m15845o(InterfaceC12149c interfaceC12149c) {
        Class<?> cls;
        Map m6744r;
        Pair pair;
        InterfaceC11914e m1506i = C13801c.m1506i(interfaceC12149c);
        if (m1506i != null) {
            cls = m15844p(m1506i);
        } else {
            cls = null;
        }
        if (!(cls instanceof Class)) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        Set<Map.Entry<C11638f, AbstractC13301g<?>>> entrySet = interfaceC12149c.mo6032a().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C11638f c11638f = (C11638f) entry.getKey();
            ClassLoader classLoader = cls.getClassLoader();
            C9612q.m13918g(classLoader, "annotationClass.classLoader");
            Object m15842r = m15842r((AbstractC13301g) entry.getValue(), classLoader);
            if (m15842r != null) {
                pair = C11591x.m7577a(c11638f.m7426b(), m15842r);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        m6744r = C11889v.m6744r(arrayList);
        return (Annotation) C10148c.m12168e(cls, m6744r, null, 4, null);
    }

    /* renamed from: p */
    public static final Class<?> m15844p(InterfaceC11914e interfaceC11914e) {
        C9612q.m13917h(interfaceC11914e, "<this>");
        InterfaceC11900a1 source = interfaceC11914e.mo4160j();
        C9612q.m13918g(source, "source");
        if (source instanceof C7571t) {
            InterfaceC7564r m20395d = ((C7571t) source).m20395d();
            C9612q.m13919f(m20395d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((C13283f) m20395d).m2852e();
        } else if (source instanceof C13291l.C13292a) {
            AbstractC13571p mo2834c = ((C13291l.C13292a) source).mo2834c();
            C9612q.m13919f(mo2834c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((C13559l) mo2834c).mo2174c();
        } else {
            C11632b m1504k = C13801c.m1504k(interfaceC11914e);
            if (m1504k == null) {
                return null;
            }
            return m15847m(C13548d.m2241f(interfaceC11914e.getClass()), m1504k, 0);
        }
    }

    /* renamed from: q */
    public static final KVisibility m15843q(AbstractC11988u abstractC11988u) {
        boolean m13922c;
        C9612q.m13917h(abstractC11988u, "<this>");
        if (C9612q.m13922c(abstractC11988u, C11974t.f30970e)) {
            return KVisibility.PUBLIC;
        }
        if (C9612q.m13922c(abstractC11988u, C11974t.f30968c)) {
            return KVisibility.PROTECTED;
        }
        if (C9612q.m13922c(abstractC11988u, C11974t.f30969d)) {
            return KVisibility.INTERNAL;
        }
        if (C9612q.m13922c(abstractC11988u, C11974t.f30966a)) {
            m13922c = true;
        } else {
            m13922c = C9612q.m13922c(abstractC11988u, C11974t.f30967b);
        }
        if (m13922c) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    /* renamed from: r */
    private static final Object m15842r(AbstractC13301g<?> abstractC13301g, ClassLoader classLoader) {
        boolean z;
        InterfaceC11914e interfaceC11914e;
        if (abstractC13301g instanceof C13294a) {
            return m15845o(((C13294a) abstractC13301g).mo2813b());
        }
        if (abstractC13301g instanceof C13296b) {
            return m15859a((C13296b) abstractC13301g, classLoader);
        }
        if (abstractC13301g instanceof C13306j) {
            Pair<? extends C11632b, ? extends C11638f> mo2813b = ((C13306j) abstractC13301g).mo2813b();
            C11638f m14350b = mo2813b.m14350b();
            Class m15846n = m15846n(classLoader, mo2813b.m14351a(), 0, 4, null);
            if (m15846n != null) {
                return C9326o0.m15886a(m15846n, m14350b.m7426b());
            }
        } else if (abstractC13301g instanceof C13320q) {
            C13320q.AbstractC13322b mo2813b2 = ((C13320q) abstractC13301g).mo2813b();
            if (mo2813b2 instanceof C13320q.AbstractC13322b.C13324b) {
                C13320q.AbstractC13322b.C13324b c13324b = (C13320q.AbstractC13322b.C13324b) mo2813b2;
                return m15847m(classLoader, c13324b.m2782b(), c13324b.m2783a());
            } else if (mo2813b2 instanceof C13320q.AbstractC13322b.C13323a) {
                InterfaceC11927h mo2788p = ((C13320q.AbstractC13322b.C13323a) mo2813b2).m2784a().mo3564N0().mo2788p();
                if (mo2788p instanceof InterfaceC11914e) {
                    interfaceC11914e = (InterfaceC11914e) mo2788p;
                } else {
                    interfaceC11914e = null;
                }
                if (interfaceC11914e != null) {
                    return m15844p(interfaceC11914e);
                }
            } else {
                throw new C11581q();
            }
        } else {
            if (abstractC13301g instanceof AbstractC13307k) {
                z = true;
            } else {
                z = abstractC13301g instanceof C13326s;
            }
            if (!z) {
                return abstractC13301g.mo2813b();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    private static final List<Annotation> m15841s(List<? extends Annotation> list) {
        boolean z;
        List m14109d;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Annotation annotation : list) {
                if (C9612q.m13922c(C0156a.m41055b(C0156a.m41056a(annotation)).getSimpleName(), "Container")) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation2 : list) {
                Class m41055b = C0156a.m41055b(C0156a.m41056a(annotation2));
                if (C9612q.m13922c(m41055b.getSimpleName(), "Container") && m41055b.getAnnotation(InterfaceC9596h0.class) != null) {
                    Object invoke = m41055b.getDeclaredMethod("value", new Class[0]).invoke(annotation2, new Object[0]);
                    C9612q.m13919f(invoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                    m14109d = C9536e.m14274d((Annotation[]) invoke);
                } else {
                    m14109d = C9544i.m14109d(annotation2);
                }
                C9550o.m14085y(arrayList, m14109d);
            }
            return arrayList;
        }
        return list;
    }
}
