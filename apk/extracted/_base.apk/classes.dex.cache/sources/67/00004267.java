package p218lg;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kg.C9336p0;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tB%\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u001b¨\u0006!"}, m14357d2 = {"Llg/h;", "Ljava/lang/reflect/Member;", "M", "Llg/e;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "Llg/e;", "caller", "", "b", "Z", "isDefault", "Llg/h$a;", "c", "Llg/h$a;", "data", "()Ljava/lang/reflect/Member;", "member", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "", "()Ljava/util/List;", "parameterTypes", "Lqg/b;", "descriptor", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Llg/e;Z)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: lg.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C10181h<M extends Member> implements InterfaceC10153e<M> {

    /* renamed from: a */
    private final InterfaceC10153e<M> f26484a;

    /* renamed from: b */
    private final boolean f26485b;

    /* renamed from: c */
    private final C10182a f26486c;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0086\u0002R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u0007R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m14357d2 = {"Llg/h$a;", "", "Lkotlin/ranges/IntRange;", "a", "", "Ljava/lang/reflect/Method;", "b", "()[Ljava/lang/reflect/Method;", "c", "Lkotlin/ranges/IntRange;", "getArgumentRange", "()Lkotlin/ranges/IntRange;", "argumentRange", "[Ljava/lang/reflect/Method;", "getUnbox", "unbox", "Ljava/lang/reflect/Method;", "getBox", "()Ljava/lang/reflect/Method;", "box", "<init>", "(Lkotlin/ranges/IntRange;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: lg.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C10182a {

        /* renamed from: a */
        private final IntRange f26487a;

        /* renamed from: b */
        private final Method[] f26488b;

        /* renamed from: c */
        private final Method f26489c;

        public C10182a(IntRange argumentRange, Method[] unbox, Method method) {
            C9612q.m13917h(argumentRange, "argumentRange");
            C9612q.m13917h(unbox, "unbox");
            this.f26487a = argumentRange;
            this.f26488b = unbox;
            this.f26489c = method;
        }

        /* renamed from: a */
        public final IntRange m12154a() {
            return this.f26487a;
        }

        /* renamed from: b */
        public final Method[] m12153b() {
            return this.f26488b;
        }

        /* renamed from: c */
        public final Method m12152c() {
            return this.f26489c;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x004a, code lost:
        if ((r12 instanceof p218lg.InterfaceC10152d) != false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C10181h(p305qg.InterfaceC11902b r11, p218lg.InterfaceC10153e<? extends M> r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p218lg.C10181h.<init>(qg.b, lg.e, boolean):void");
    }

    @Override // p218lg.InterfaceC10153e
    /* renamed from: a */
    public List<Type> mo12139a() {
        return this.f26484a.mo12139a();
    }

    @Override // p218lg.InterfaceC10153e
    /* renamed from: b */
    public M mo12138b() {
        return this.f26484a.mo12138b();
    }

    @Override // p218lg.InterfaceC10153e
    public Object call(Object[] args) {
        Object invoke;
        C9612q.m13917h(args, "args");
        C10182a c10182a = this.f26486c;
        IntRange m12154a = c10182a.m12154a();
        Method[] m12153b = c10182a.m12153b();
        Method m12152c = c10182a.m12152c();
        Object[] copyOf = Arrays.copyOf(args, args.length);
        C9612q.m13918g(copyOf, "copyOf(this, size)");
        int m13890a = m12154a.m13890a();
        int m13889e = m12154a.m13889e();
        if (m13890a <= m13889e) {
            while (true) {
                Method method = m12153b[m13890a];
                Object obj = args[m13890a];
                if (method != null) {
                    if (obj != null) {
                        obj = method.invoke(obj, new Object[0]);
                    } else {
                        Class<?> returnType = method.getReturnType();
                        C9612q.m13918g(returnType, "method.returnType");
                        obj = C9336p0.m15853g(returnType);
                    }
                }
                copyOf[m13890a] = obj;
                if (m13890a == m13889e) {
                    break;
                }
                m13890a++;
            }
        }
        Object call = this.f26484a.call(copyOf);
        if (m12152c != null && (invoke = m12152c.invoke(null, call)) != null) {
            return invoke;
        }
        return call;
    }

    @Override // p218lg.InterfaceC10153e
    public Type getReturnType() {
        return this.f26484a.getReturnType();
    }
}