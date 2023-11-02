package p218lg;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9536e;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p218lg.AbstractC10155f;
import p218lg.InterfaceC10153e;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\t\u000eB\u001f\b\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0002\u001b\u001c¨\u0006\u001d"}, m14357d2 = {"Llg/j;", "Llg/e;", "Ljava/lang/reflect/Method;", "", "instance", "", "args", "c", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/reflect/Method;", "unboxMethod", "", "Ljava/lang/reflect/Type;", "b", "Ljava/util/List;", "()Ljava/util/List;", "parameterTypes", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "e", "()Ljava/lang/reflect/Method;", "member", "<init>", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "Llg/j$a;", "Llg/j$b;", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: lg.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC10184j implements InterfaceC10153e<Method> {

    /* renamed from: a */
    private final Method f26490a;

    /* renamed from: b */
    private final List<Type> f26491b;

    /* renamed from: c */
    private final Type f26492c;

    @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m14357d2 = {"Llg/j$a;", "Llg/j;", "Llg/d;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "d", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Method;", "unboxMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: lg.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C10185a extends AbstractC10184j implements InterfaceC10152d {

        /* renamed from: d */
        private final Object f26493d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C10185a(java.lang.reflect.Method r3, java.lang.Object r4) {
            /*
                r2 = this;
                java.lang.String r0 = "unboxMethod"
                kotlin.jvm.internal.C9612q.m13917h(r3, r0)
                java.util.List r0 = kotlin.collections.C9543h.m14145i()
                r1 = 0
                r2.<init>(r3, r0, r1)
                r2.f26493d = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p218lg.AbstractC10184j.C10185a.<init>(java.lang.reflect.Method, java.lang.Object):void");
        }

        @Override // p218lg.InterfaceC10153e
        public Object call(Object[] args) {
            C9612q.m13917h(args, "args");
            m12141d(args);
            return m12142c(this.f26493d, args);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m14357d2 = {"Llg/j$b;", "Llg/j;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "unboxMethod", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: lg.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C10186b extends AbstractC10184j {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C10186b(java.lang.reflect.Method r3) {
            /*
                r2 = this;
                java.lang.String r0 = "unboxMethod"
                kotlin.jvm.internal.C9612q.m13917h(r3, r0)
                java.lang.Class r0 = r3.getDeclaringClass()
                java.util.List r0 = kotlin.collections.C9543h.m14153d(r0)
                r1 = 0
                r2.<init>(r3, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p218lg.AbstractC10184j.C10186b.<init>(java.lang.reflect.Method):void");
        }

        @Override // p218lg.InterfaceC10153e
        public Object call(Object[] args) {
            Object[] m14268j;
            C9612q.m13917h(args, "args");
            m12141d(args);
            Object obj = args[0];
            AbstractC10155f.C10159d c10159d = AbstractC10155f.f26471e;
            if (args.length <= 1) {
                m14268j = new Object[0];
            } else {
                m14268j = C9536e.m14268j(args, 1, args.length);
            }
            return m12142c(obj, m14268j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AbstractC10184j(Method method, List<? extends Type> list) {
        this.f26490a = method;
        this.f26491b = list;
        Class<?> returnType = method.getReturnType();
        C9612q.m13918g(returnType, "unboxMethod.returnType");
        this.f26492c = returnType;
    }

    public /* synthetic */ AbstractC10184j(Method method, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(method, list);
    }

    @Override // p218lg.InterfaceC10153e
    /* renamed from: a */
    public final List<Type> mo12139a() {
        return this.f26491b;
    }

    /* renamed from: c */
    protected final Object m12142c(Object obj, Object[] args) {
        C9612q.m13917h(args, "args");
        return this.f26490a.invoke(obj, Arrays.copyOf(args, args.length));
    }

    /* renamed from: d */
    public void m12141d(Object[] objArr) {
        InterfaceC10153e.C10154a.m12160a(this, objArr);
    }

    @Override // p218lg.InterfaceC10153e
    /* renamed from: e */
    public final Method mo12138b() {
        return null;
    }

    @Override // p218lg.InterfaceC10153e
    public final Type getReturnType() {
        return this.f26492c;
    }
}