package p218lg;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import p218lg.InterfaceC10153e;
import p304qf.C11889v;
import p407wg.C13548d;

@Metadata(m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\t\u000eBA\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010&\u001a\u00020%\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\f¢\u0006\u0004\b'\u0010(J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\t\u0010\u001aR\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000fR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000fR\u0016\u0010!\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010 R\u0014\u0010$\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006)"}, m14357d2 = {"Llg/a;", "Llg/e;", "", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "jClass", "", "", "b", "Ljava/util/List;", "parameterNames", "Llg/a$a;", "c", "Llg/a$a;", "callMode", "Ljava/lang/reflect/Method;", "d", "methods", "Ljava/lang/reflect/Type;", "e", "()Ljava/util/List;", "parameterTypes", "f", "erasedParameterTypes", "g", "defaultValues", "()Ljava/lang/Void;", "member", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "Llg/a$b;", "origin", "<init>", "(Ljava/lang/Class;Ljava/util/List;Llg/a$a;Llg/a$b;Ljava/util/List;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: lg.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C10144a implements InterfaceC10153e {

    /* renamed from: a */
    private final Class<?> f26449a;

    /* renamed from: b */
    private final List<String> f26450b;

    /* renamed from: c */
    private final EnumC10145a f26451c;

    /* renamed from: d */
    private final List<Method> f26452d;

    /* renamed from: e */
    private final List<Type> f26453e;

    /* renamed from: f */
    private final List<Class<?>> f26454f;

    /* renamed from: g */
    private final List<Object> f26455g;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m14357d2 = {"Llg/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "j", "k", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: lg.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public enum EnumC10145a {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m14357d2 = {"Llg/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "j", "k", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: lg.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public enum EnumC10146b {
        JAVA,
        KOTLIN
    }

    public C10144a(Class<?> jClass, List<String> parameterNames, EnumC10145a callMode, EnumC10146b origin, List<Method> methods) {
        int m14093t;
        int m14093t2;
        int m14093t3;
        List m14039k0;
        C9612q.m13917h(jClass, "jClass");
        C9612q.m13917h(parameterNames, "parameterNames");
        C9612q.m13917h(callMode, "callMode");
        C9612q.m13917h(origin, "origin");
        C9612q.m13917h(methods, "methods");
        this.f26449a = jClass;
        this.f26450b = parameterNames;
        this.f26451c = callMode;
        this.f26452d = methods;
        m14093t = C9546k.m14093t(methods, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (Method method : methods) {
            arrayList.add(method.getGenericReturnType());
        }
        this.f26453e = arrayList;
        List<Method> list = this.f26452d;
        m14093t2 = C9546k.m14093t(list, 10);
        ArrayList arrayList2 = new ArrayList(m14093t2);
        for (Method method2 : list) {
            Class<?> it = method2.getReturnType();
            C9612q.m13918g(it, "it");
            Class<?> m2240g = C13548d.m2240g(it);
            if (m2240g != null) {
                it = m2240g;
            }
            arrayList2.add(it);
        }
        this.f26454f = arrayList2;
        List<Method> list2 = this.f26452d;
        m14093t3 = C9546k.m14093t(list2, 10);
        ArrayList arrayList3 = new ArrayList(m14093t3);
        for (Method method3 : list2) {
            arrayList3.add(method3.getDefaultValue());
        }
        this.f26455g = arrayList3;
        if (this.f26451c == EnumC10145a.POSITIONAL_CALL && origin == EnumC10146b.JAVA) {
            m14039k0 = C9553r.m14039k0(this.f26450b, "value");
            if (!m14039k0.isEmpty()) {
                throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            }
        }
    }

    @Override // p218lg.InterfaceC10153e
    /* renamed from: a */
    public List<Type> mo12139a() {
        return this.f26453e;
    }

    @Override // p218lg.InterfaceC10153e
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Member mo12138b() {
        return (Member) m12175d();
    }

    /* renamed from: c */
    public void m12176c(Object[] objArr) {
        InterfaceC10153e.C10154a.m12160a(this, objArr);
    }

    @Override // p218lg.InterfaceC10153e
    public Object call(Object[] args) {
        List m14067J0;
        Map m6744r;
        Object m12162k;
        C9612q.m13917h(args, "args");
        m12176c(args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object obj = args[i];
            int i3 = i2 + 1;
            if (obj == null && this.f26451c == EnumC10145a.CALL_BY_NAME) {
                m12162k = this.f26455g.get(i2);
            } else {
                m12162k = C10148c.m12162k(obj, this.f26454f.get(i2));
            }
            if (m12162k != null) {
                arrayList.add(m12162k);
                i++;
                i2 = i3;
            } else {
                C10148c.m12163j(i2, this.f26450b.get(i2), this.f26454f.get(i2));
                throw null;
            }
        }
        Class<?> cls = this.f26449a;
        m14067J0 = C9553r.m14067J0(this.f26450b, arrayList);
        m6744r = C11889v.m6744r(m14067J0);
        return C10148c.m12169d(cls, m6744r, this.f26452d);
    }

    /* renamed from: d */
    public Void m12175d() {
        return null;
    }

    @Override // p218lg.InterfaceC10153e
    public Type getReturnType() {
        return this.f26449a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C10144a(java.lang.Class r7, java.util.List r8, p218lg.C10144a.EnumC10145a r9, p218lg.C10144a.EnumC10146b r10, java.util.List r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L2a
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = kotlin.collections.C9543h.m14124t(r8, r12)
            r11.<init>(r12)
            java.util.Iterator r12 = r8.iterator()
        L13:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L2a
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.reflect.Method r13 = r7.getDeclaredMethod(r13, r0)
            r11.add(r13)
            goto L13
        L2a:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p218lg.C10144a.<init>(java.lang.Class, java.util.List, lg.a$a, lg.a$b, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
