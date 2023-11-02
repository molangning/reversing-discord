package p218lg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9536e;
import kotlin.collections.C9538f;
import kotlin.jvm.internal.C9600j0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p218lg.InterfaceC10153e;

@Metadata(m14358d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u0015*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\b\b\n\u0013\u0007\u0015 !\"B5\b\u0004\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004R\u0017\u0010\f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\b\u0010\u001a\u0082\u0001\u0007#$%&'()¨\u0006*"}, m14357d2 = {"Llg/f;", "Ljava/lang/reflect/Member;", "M", "Llg/e;", "", "obj", "", "d", "a", "Ljava/lang/reflect/Member;", "b", "()Ljava/lang/reflect/Member;", "member", "Ljava/lang/reflect/Type;", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "Ljava/lang/Class;", "c", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "instanceClass", "", "Ljava/util/List;", "()Ljava/util/List;", "parameterTypes", "", "valueParameterTypes", "<init>", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "f", "g", "h", "Llg/f$a;", "Llg/f$b;", "Llg/f$c;", "Llg/f$e;", "Llg/f$f;", "Llg/f$g;", "Llg/f$h;", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: lg.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC10155f<M extends Member> implements InterfaceC10153e<M> {

    /* renamed from: e */
    public static final C10159d f26471e = new C10159d(null);

    /* renamed from: a */
    private final M f26472a;

    /* renamed from: b */
    private final Type f26473b;

    /* renamed from: c */
    private final Class<?> f26474c;

    /* renamed from: d */
    private final List<Type> f26475d;

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001d\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, m14357d2 = {"Llg/f$a;", "Llg/f;", "Ljava/lang/reflect/Constructor;", "Llg/d;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "boundReceiver", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: lg.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C10156a extends AbstractC10155f<Constructor<?>> implements InterfaceC10152d {

        /* renamed from: f */
        private final Object f26476f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C10156a(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C9612q.m13917h(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.C9612q.m13918g(r3, r0)
                r4 = 0
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.C9612q.m13918g(r0, r1)
                int r1 = r0.length
                r2 = 2
                if (r1 > r2) goto L20
                r0 = 0
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                goto L27
            L20:
                int r1 = r0.length
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object[] r0 = kotlin.collections.C9533b.m14305j(r0, r2, r1)
            L27:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f26476f = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p218lg.AbstractC10155f.C10156a.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        @Override // p218lg.InterfaceC10153e
        public Object call(Object[] args) {
            C9612q.m13917h(args, "args");
            mo12157c(args);
            C9600j0 c9600j0 = new C9600j0(3);
            c9600j0.m13945a(this.f26476f);
            c9600j0.m13944b(args);
            c9600j0.m13945a(null);
            return mo12138b().newInstance(c9600j0.m13942d(new Object[c9600j0.m13943c()]));
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m14357d2 = {"Llg/f$b;", "Llg/f;", "Ljava/lang/reflect/Constructor;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: lg.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C10157b extends AbstractC10155f<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C10157b(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C9612q.m13917h(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.C9612q.m13918g(r3, r0)
                r4 = 0
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.C9612q.m13918g(r0, r1)
                int r1 = r0.length
                r2 = 0
                r5 = 1
                if (r1 > r5) goto L20
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                goto L26
            L20:
                int r1 = r0.length
                int r1 = r1 - r5
                java.lang.Object[] r0 = kotlin.collections.C9533b.m14305j(r0, r2, r1)
            L26:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p218lg.AbstractC10155f.C10157b.<init>(java.lang.reflect.Constructor):void");
        }

        @Override // p218lg.InterfaceC10153e
        public Object call(Object[] args) {
            C9612q.m13917h(args, "args");
            mo12157c(args);
            C9600j0 c9600j0 = new C9600j0(2);
            c9600j0.m13944b(args);
            c9600j0.m13945a(null);
            return mo12138b().newInstance(c9600j0.m13942d(new Object[c9600j0.m13943c()]));
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002B\u001d\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, m14357d2 = {"Llg/f$c;", "Llg/d;", "Llg/f;", "Ljava/lang/reflect/Constructor;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "boundReceiver", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: lg.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C10158c extends AbstractC10155f<Constructor<?>> implements InterfaceC10152d {

        /* renamed from: f */
        private final Object f26477f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C10158c(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C9612q.m13917h(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.C9612q.m13918g(r3, r0)
                r4 = 0
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.C9612q.m13918g(r5, r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f26477f = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p218lg.AbstractC10155f.C10158c.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        @Override // p218lg.InterfaceC10153e
        public Object call(Object[] args) {
            C9612q.m13917h(args, "args");
            mo12157c(args);
            C9600j0 c9600j0 = new C9600j0(2);
            c9600j0.m13945a(this.f26477f);
            c9600j0.m13944b(args);
            return mo12138b().newInstance(c9600j0.m13942d(new Object[c9600j0.m13943c()]));
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0005J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\n"}, m14357d2 = {"Llg/f$d;", "", "T", "", "dropFirst", "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropFirstAndLast", "dropLast", "<init>", "()V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: lg.f$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C10159d {
        private C10159d() {
        }

        public /* synthetic */ C10159d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m14357d2 = {"Llg/f$e;", "Llg/f;", "Ljava/lang/reflect/Constructor;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: lg.f$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C10160e extends AbstractC10155f<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C10160e(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C9612q.m13917h(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.C9612q.m13918g(r3, r0)
                java.lang.Class r0 = r8.getDeclaringClass()
                java.lang.Class r1 = r0.getDeclaringClass()
                if (r1 == 0) goto L24
                int r0 = r0.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
                if (r0 != 0) goto L24
                r4 = r1
                goto L26
            L24:
                r0 = 0
                r4 = r0
            L26:
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.C9612q.m13918g(r5, r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p218lg.AbstractC10155f.C10160e.<init>(java.lang.reflect.Constructor):void");
        }

        @Override // p218lg.InterfaceC10153e
        public Object call(Object[] args) {
            C9612q.m13917h(args, "args");
            mo12157c(args);
            return mo12138b().newInstance(Arrays.copyOf(args, args.length));
        }
    }

    @Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011B\u0019\b\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, m14357d2 = {"Llg/f$f;", "Llg/f;", "Ljava/lang/reflect/Field;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "field", "", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;Z)V", "a", "b", "c", "d", "e", "Llg/f$f$a;", "Llg/f$f$b;", "Llg/f$f$c;", "Llg/f$f$d;", "Llg/f$f$e;", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: lg.f$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static abstract class AbstractC10161f extends AbstractC10155f<Field> {

        @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m14357d2 = {"Llg/f$f$a;", "Llg/d;", "Llg/f$f;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: lg.f$f$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C10162a extends AbstractC10161f implements InterfaceC10152d {

            /* renamed from: f */
            private final Object f26478f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10162a(Field field, Object obj) {
                super(field, false, null);
                C9612q.m13917h(field, "field");
                this.f26478f = obj;
            }

            @Override // p218lg.AbstractC10155f.AbstractC10161f, p218lg.InterfaceC10153e
            public Object call(Object[] args) {
                C9612q.m13917h(args, "args");
                mo12157c(args);
                return mo12138b().get(this.f26478f);
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m14357d2 = {"Llg/f$f$b;", "Llg/d;", "Llg/f$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: lg.f$f$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C10163b extends AbstractC10161f implements InterfaceC10152d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10163b(Field field) {
                super(field, false, null);
                C9612q.m13917h(field, "field");
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m14357d2 = {"Llg/f$f$c;", "Llg/f$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: lg.f$f$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C10164c extends AbstractC10161f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10164c(Field field) {
                super(field, true, null);
                C9612q.m13917h(field, "field");
            }
        }

        @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m14357d2 = {"Llg/f$f$d;", "Llg/f$f;", "", "args", "", "c", "([Ljava/lang/Object;)V", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: lg.f$f$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C10165d extends AbstractC10161f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10165d(Field field) {
                super(field, true, null);
                C9612q.m13917h(field, "field");
            }

            @Override // p218lg.AbstractC10155f
            /* renamed from: c */
            public void mo12157c(Object[] args) {
                Object m14247E;
                C9612q.m13917h(args, "args");
                super.mo12157c(args);
                m14247E = C9538f.m14247E(args);
                m12159d(m14247E);
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m14357d2 = {"Llg/f$f$e;", "Llg/f$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: lg.f$f$e */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C10166e extends AbstractC10161f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10166e(Field field) {
                super(field, false, null);
                C9612q.m13917h(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private AbstractC10161f(java.lang.reflect.Field r7, boolean r8) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericType()
                java.lang.String r0 = "field.genericType"
                kotlin.jvm.internal.C9612q.m13918g(r2, r0)
                if (r8 == 0) goto L10
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L11
            L10:
                r8 = 0
            L11:
                r3 = r8
                r8 = 0
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r8]
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p218lg.AbstractC10155f.AbstractC10161f.<init>(java.lang.reflect.Field, boolean):void");
        }

        public /* synthetic */ AbstractC10161f(Field field, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z);
        }

        @Override // p218lg.InterfaceC10153e
        public Object call(Object[] args) {
            Object obj;
            C9612q.m13917h(args, "args");
            mo12157c(args);
            Field mo12138b = mo12138b();
            if (m12158e() != null) {
                obj = C9538f.m14249D(args);
            } else {
                obj = null;
            }
            return mo12138b.get(obj);
        }
    }

    @Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0013\u0014\u0006\u0015\u0016B!\b\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, m14357d2 = {"Llg/f$g;", "Llg/f;", "Ljava/lang/reflect/Field;", "", "args", "", "c", "([Ljava/lang/Object;)V", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "f", "Z", "notNull", "field", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;ZZ)V", "a", "b", "d", "e", "Llg/f$g$a;", "Llg/f$g$b;", "Llg/f$g$c;", "Llg/f$g$d;", "Llg/f$g$e;", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: lg.f$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static abstract class AbstractC10167g extends AbstractC10155f<Field> {

        /* renamed from: f */
        private final boolean f26479f;

        @Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0011"}, m14357d2 = {"Llg/f$g$a;", "Llg/d;", "Llg/f$g;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: lg.f$g$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C10168a extends AbstractC10167g implements InterfaceC10152d {

            /* renamed from: g */
            private final Object f26480g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10168a(Field field, boolean z, Object obj) {
                super(field, z, false, null);
                C9612q.m13917h(field, "field");
                this.f26480g = obj;
            }

            @Override // p218lg.AbstractC10155f.AbstractC10167g, p218lg.InterfaceC10153e
            public Object call(Object[] args) {
                Object m14249D;
                C9612q.m13917h(args, "args");
                mo12157c(args);
                Object obj = this.f26480g;
                m14249D = C9538f.m14249D(args);
                mo12138b().set(obj, m14249D);
                return Unit.f25302a;
            }
        }

        @Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m14357d2 = {"Llg/f$g$b;", "Llg/d;", "Llg/f$g;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: lg.f$g$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C10169b extends AbstractC10167g implements InterfaceC10152d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10169b(Field field, boolean z) {
                super(field, z, false, null);
                C9612q.m13917h(field, "field");
            }

            @Override // p218lg.AbstractC10155f.AbstractC10167g, p218lg.InterfaceC10153e
            public Object call(Object[] args) {
                Object m14216d0;
                C9612q.m13917h(args, "args");
                mo12157c(args);
                m14216d0 = C9538f.m14216d0(args);
                mo12138b().set(null, m14216d0);
                return Unit.f25302a;
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m14357d2 = {"Llg/f$g$c;", "Llg/f$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: lg.f$g$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C10170c extends AbstractC10167g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10170c(Field field, boolean z) {
                super(field, z, true, null);
                C9612q.m13917h(field, "field");
            }
        }

        @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, m14357d2 = {"Llg/f$g$d;", "Llg/f$g;", "", "args", "", "c", "([Ljava/lang/Object;)V", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: lg.f$g$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C10171d extends AbstractC10167g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10171d(Field field, boolean z) {
                super(field, z, true, null);
                C9612q.m13917h(field, "field");
            }

            @Override // p218lg.AbstractC10155f.AbstractC10167g, p218lg.AbstractC10155f
            /* renamed from: c */
            public void mo12157c(Object[] args) {
                Object m14247E;
                C9612q.m13917h(args, "args");
                super.mo12157c(args);
                m14247E = C9538f.m14247E(args);
                m12159d(m14247E);
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m14357d2 = {"Llg/f$g$e;", "Llg/f$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: lg.f$g$e */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C10172e extends AbstractC10167g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10172e(Field field, boolean z) {
                super(field, z, false, null);
                C9612q.m13917h(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private AbstractC10167g(java.lang.reflect.Field r7, boolean r8, boolean r9) {
            /*
                r6 = this;
                java.lang.Class r2 = java.lang.Void.TYPE
                java.lang.String r0 = "TYPE"
                kotlin.jvm.internal.C9612q.m13918g(r2, r0)
                if (r9 == 0) goto Le
                java.lang.Class r9 = r7.getDeclaringClass()
                goto Lf
            Le:
                r9 = 0
            Lf:
                r3 = r9
                r9 = 1
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r9]
                java.lang.reflect.Type r9 = r7.getGenericType()
                java.lang.String r0 = "field.genericType"
                kotlin.jvm.internal.C9612q.m13918g(r9, r0)
                r0 = 0
                r4[r0] = r9
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f26479f = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p218lg.AbstractC10155f.AbstractC10167g.<init>(java.lang.reflect.Field, boolean, boolean):void");
        }

        public /* synthetic */ AbstractC10167g(Field field, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z, z2);
        }

        @Override // p218lg.AbstractC10155f
        /* renamed from: c */
        public void mo12157c(Object[] args) {
            Object m14216d0;
            C9612q.m13917h(args, "args");
            super.mo12157c(args);
            if (this.f26479f) {
                m14216d0 = C9538f.m14216d0(args);
                if (m14216d0 == null) {
                    throw new IllegalArgumentException("null is not allowed as a value for this property.");
                }
            }
        }

        @Override // p218lg.InterfaceC10153e
        public Object call(Object[] args) {
            Object obj;
            Object m14216d0;
            C9612q.m13917h(args, "args");
            mo12157c(args);
            Field mo12138b = mo12138b();
            if (m12158e() != null) {
                obj = C9538f.m14249D(args);
            } else {
                obj = null;
            }
            m14216d0 = C9538f.m14216d0(args);
            mo12138b.set(obj, m14216d0);
            return Unit.f25302a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r1 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private AbstractC10155f(M r1, java.lang.reflect.Type r2, java.lang.Class<?> r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f26472a = r1
            r0.f26473b = r2
            r0.f26474c = r3
            if (r3 == 0) goto L27
            kotlin.jvm.internal.j0 r1 = new kotlin.jvm.internal.j0
            r2 = 2
            r1.<init>(r2)
            r1.m13945a(r3)
            r1.m13944b(r4)
            int r2 = r1.m13943c()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.m13942d(r2)
            java.util.List r1 = kotlin.collections.C9543h.m14139l(r1)
            if (r1 != 0) goto L2b
        L27:
            java.util.List r1 = kotlin.collections.C9533b.m14285u0(r4)
        L2b:
            r0.f26475d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p218lg.AbstractC10155f.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }

    public /* synthetic */ AbstractC10155f(Member member, Type type, Class cls, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(member, type, cls, typeArr);
    }

    @Override // p218lg.InterfaceC10153e
    /* renamed from: a */
    public List<Type> mo12139a() {
        return this.f26475d;
    }

    @Override // p218lg.InterfaceC10153e
    /* renamed from: b */
    public final M mo12138b() {
        return this.f26472a;
    }

    /* renamed from: c */
    public void mo12157c(Object[] objArr) {
        InterfaceC10153e.C10154a.m12160a(this, objArr);
    }

    /* renamed from: d */
    protected final void m12159d(Object obj) {
        if (obj != null && this.f26472a.getDeclaringClass().isInstance(obj)) {
            return;
        }
        throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
    }

    /* renamed from: e */
    public final Class<?> m12158e() {
        return this.f26474c;
    }

    @Override // p218lg.InterfaceC10153e
    public final Type getReturnType() {
        return this.f26473b;
    }

    @Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0012\u0013\u0014\u0015\u0016\u0007B+\b\u0004\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n\u0082\u0001\u0006\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, m14357d2 = {"Llg/f$h;", "Llg/f;", "Ljava/lang/reflect/Method;", "", "instance", "", "args", "f", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "", "Z", "isVoidMethod", "method", "requiresInstance", "Ljava/lang/reflect/Type;", "parameterTypes", "<init>", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "a", "b", "c", "d", "e", "Llg/f$h$a;", "Llg/f$h$b;", "Llg/f$h$c;", "Llg/f$h$d;", "Llg/f$h$e;", "Llg/f$h$f;", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: lg.f$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static abstract class AbstractC10173h extends AbstractC10155f<Method> {

        /* renamed from: f */
        private final boolean f26481f;

        @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m14357d2 = {"Llg/f$h$a;", "Llg/d;", "Llg/f$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: lg.f$h$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C10174a extends AbstractC10173h implements InterfaceC10152d {

            /* renamed from: g */
            private final Object f26482g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10174a(Method method, Object obj) {
                super(method, false, null, 4, null);
                C9612q.m13917h(method, "method");
                this.f26482g = obj;
            }

            @Override // p218lg.InterfaceC10153e
            public Object call(Object[] args) {
                C9612q.m13917h(args, "args");
                mo12157c(args);
                return m12156f(this.f26482g, args);
            }
        }

        @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m14357d2 = {"Llg/f$h$b;", "Llg/d;", "Llg/f$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: lg.f$h$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C10175b extends AbstractC10173h implements InterfaceC10152d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10175b(Method method) {
                super(method, false, null, 4, null);
                C9612q.m13917h(method, "method");
            }

            @Override // p218lg.InterfaceC10153e
            public Object call(Object[] args) {
                C9612q.m13917h(args, "args");
                mo12157c(args);
                return m12156f(null, args);
            }
        }

        @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m14357d2 = {"Llg/f$h$c;", "Llg/d;", "Llg/f$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: lg.f$h$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C10176c extends AbstractC10173h implements InterfaceC10152d {

            /* renamed from: g */
            private final Object f26483g;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public C10176c(java.lang.reflect.Method r5, java.lang.Object r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "method"
                    kotlin.jvm.internal.C9612q.m13917h(r5, r0)
                    java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
                    java.lang.String r1 = "method.genericParameterTypes"
                    kotlin.jvm.internal.C9612q.m13918g(r0, r1)
                    int r1 = r0.length
                    r2 = 0
                    r3 = 1
                    if (r1 > r3) goto L16
                    java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                    goto L1b
                L16:
                    int r1 = r0.length
                    java.lang.Object[] r0 = kotlin.collections.C9533b.m14305j(r0, r3, r1)
                L1b:
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r1 = 0
                    r4.<init>(r5, r2, r0, r1)
                    r4.f26483g = r6
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p218lg.AbstractC10155f.AbstractC10173h.C10176c.<init>(java.lang.reflect.Method, java.lang.Object):void");
            }

            @Override // p218lg.InterfaceC10153e
            public Object call(Object[] args) {
                C9612q.m13917h(args, "args");
                mo12157c(args);
                C9600j0 c9600j0 = new C9600j0(2);
                c9600j0.m13945a(this.f26483g);
                c9600j0.m13944b(args);
                return m12156f(null, c9600j0.m13942d(new Object[c9600j0.m13943c()]));
            }
        }

        @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m14357d2 = {"Llg/f$h$d;", "Llg/f$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: lg.f$h$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C10177d extends AbstractC10173h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10177d(Method method) {
                super(method, false, null, 6, null);
                C9612q.m13917h(method, "method");
            }

            @Override // p218lg.InterfaceC10153e
            public Object call(Object[] args) {
                Object[] m14268j;
                C9612q.m13917h(args, "args");
                mo12157c(args);
                Object obj = args[0];
                if (args.length <= 1) {
                    m14268j = new Object[0];
                } else {
                    m14268j = C9536e.m14268j(args, 1, args.length);
                }
                return m12156f(obj, m14268j);
            }
        }

        @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m14357d2 = {"Llg/f$h$e;", "Llg/f$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: lg.f$h$e */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C10178e extends AbstractC10173h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10178e(Method method) {
                super(method, true, null, 4, null);
                C9612q.m13917h(method, "method");
            }

            @Override // p218lg.InterfaceC10153e
            public Object call(Object[] args) {
                Object m14247E;
                Object[] m14268j;
                C9612q.m13917h(args, "args");
                mo12157c(args);
                m14247E = C9538f.m14247E(args);
                m12159d(m14247E);
                if (args.length <= 1) {
                    m14268j = new Object[0];
                } else {
                    m14268j = C9536e.m14268j(args, 1, args.length);
                }
                return m12156f(null, m14268j);
            }
        }

        @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m14357d2 = {"Llg/f$h$f;", "Llg/f$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: lg.f$h$f */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C10179f extends AbstractC10173h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10179f(Method method) {
                super(method, false, null, 6, null);
                C9612q.m13917h(method, "method");
            }

            @Override // p218lg.InterfaceC10153e
            public Object call(Object[] args) {
                C9612q.m13917h(args, "args");
                mo12157c(args);
                return m12156f(null, args);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ AbstractC10173h(java.lang.reflect.Method r1, boolean r2, java.lang.reflect.Type[] r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            /*
                r0 = this;
                r5 = r4 & 2
                if (r5 == 0) goto Le
                int r2 = r1.getModifiers()
                boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
                r2 = r2 ^ 1
            Le:
                r4 = r4 & 4
                if (r4 == 0) goto L1b
                java.lang.reflect.Type[] r3 = r1.getGenericParameterTypes()
                java.lang.String r4 = "method.genericParameterTypes"
                kotlin.jvm.internal.C9612q.m13918g(r3, r4)
            L1b:
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p218lg.AbstractC10155f.AbstractC10173h.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[], int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public /* synthetic */ AbstractC10173h(Method method, boolean z, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, z, typeArr);
        }

        /* renamed from: f */
        protected final Object m12156f(Object obj, Object[] args) {
            C9612q.m13917h(args, "args");
            Object invoke = mo12138b().invoke(obj, Arrays.copyOf(args, args.length));
            if (this.f26481f) {
                return Unit.f25302a;
            }
            return invoke;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private AbstractC10173h(java.lang.reflect.Method r7, boolean r8, java.lang.reflect.Type[] r9) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericReturnType()
                java.lang.String r0 = "method.genericReturnType"
                kotlin.jvm.internal.C9612q.m13918g(r2, r0)
                if (r8 == 0) goto L10
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L11
            L10:
                r8 = 0
            L11:
                r3 = r8
                r5 = 0
                r0 = r6
                r1 = r7
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.reflect.Type r7 = r6.getReturnType()
                java.lang.Class r8 = java.lang.Void.TYPE
                boolean r7 = kotlin.jvm.internal.C9612q.m13922c(r7, r8)
                r6.f26481f = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p218lg.AbstractC10155f.AbstractC10173h.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void");
        }
    }
}
