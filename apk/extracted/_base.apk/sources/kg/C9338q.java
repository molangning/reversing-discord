package kg;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kg.AbstractC9262j;
import kg.C9271j0;
import kg.InterfaceC9259i;
import kotlin.Metadata;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9587e;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InterfaceC9603l;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import p140hg.InterfaceC7135f;
import p218lg.AbstractC10155f;
import p218lg.C10144a;
import p218lg.C10180g;
import p218lg.C10183i;
import p218lg.InterfaceC10153e;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11998y;
import p449yh.C14025b;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B\u0019\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bC\u0010DB7\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010:\u001a\u00020\u0017\u0012\u0006\u0010!\u001a\u00020\u0017\u0012\b\u0010E\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bC\u0010FB+\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010:\u001a\u00020\u0017\u0012\u0006\u0010!\u001a\u00020\u0017\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bC\u0010GJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J.\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u00112\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0013\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010\u000e\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010.\u001a\u0006\u0012\u0002\b\u00030)8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R!\u00101\u001a\b\u0012\u0002\b\u0003\u0018\u00010)8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-R\u0016\u00104\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010:\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010=\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u00106R\u0014\u0010?\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u00106R\u0014\u0010@\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u00106R\u0014\u0010A\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u00106R\u0014\u0010B\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u00106¨\u0006H"}, m14357d2 = {"Lkg/q;", "Lkg/l;", "", "Lkotlin/reflect/KFunction;", "Lkotlin/jvm/internal/l;", "Lkg/i;", "Ljava/lang/reflect/Method;", "member", "Llg/f$h;", "I", "H", "G", "Ljava/lang/reflect/Constructor;", "Lqg/y;", "descriptor", "", "isDefault", "Llg/f;", "F", "other", "equals", "", "hashCode", "", "toString", "Lkg/p;", "n", "Lkg/p;", "v", "()Lkg/p;", "container", "o", "Ljava/lang/String;", "signature", "p", "Ljava/lang/Object;", "rawBoundReceiver", "q", "Lkg/j0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "Llg/e;", "r", "Lkg/j0$b;", "u", "()Llg/e;", "caller", "s", "w", "defaultCaller", "J", "()Ljava/lang/Object;", "boundReceiver", "z", "()Z", "isBound", "getName", "()Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_NAME, "getArity", "()I", "arity", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "<init>", "(Lkg/p;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "descriptorInitialValue", "(Lkg/p;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "(Lkg/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C9338q extends AbstractC9282l<Object> implements InterfaceC9603l<Object>, KFunction<Object>, InterfaceC9259i {

    /* renamed from: t */
    static final /* synthetic */ KProperty<Object>[] f24441t = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9338q.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9338q.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9338q.class), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

    /* renamed from: n */
    private final AbstractC9327p f24442n;

    /* renamed from: o */
    private final String f24443o;

    /* renamed from: p */
    private final Object f24444p;

    /* renamed from: q */
    private final C9271j0.C9272a f24445q;

    /* renamed from: r */
    private final C9271j0.C9273b f24446r;

    /* renamed from: s */
    private final C9271j0.C9273b f24447s;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001 \u0002*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Llg/e;", "Ljava/lang/reflect/Executable;", "kotlin.jvm.PlatformType", "a", "()Llg/e;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C9339a extends AbstractC9614s implements Function0<InterfaceC10153e<? extends Executable>> {
        C9339a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final InterfaceC10153e<Executable> invoke() {
            int m14093t;
            Object m15978b;
            InterfaceC10153e m15832I;
            int m14093t2;
            AbstractC9262j m15890g = C9321m0.f24422a.m15890g(C9338q.this.mo15826x());
            if (m15890g instanceof AbstractC9262j.C9269d) {
                if (C9338q.this.m15944y()) {
                    Class<?> mo13896e = C9338q.this.mo15828v().mo13896e();
                    List<InterfaceC7135f> parameters = C9338q.this.getParameters();
                    m14093t2 = C9546k.m14093t(parameters, 10);
                    ArrayList arrayList = new ArrayList(m14093t2);
                    for (InterfaceC7135f interfaceC7135f : parameters) {
                        String name = interfaceC7135f.getName();
                        C9612q.m13920e(name);
                        arrayList.add(name);
                    }
                    return new C10144a(mo13896e, arrayList, C10144a.EnumC10145a.POSITIONAL_CALL, C10144a.EnumC10146b.KOTLIN, null, 16, null);
                }
                m15978b = C9338q.this.mo15828v().m15875r(((AbstractC9262j.C9269d) m15890g).m15975b());
            } else if (m15890g instanceof AbstractC9262j.C9270e) {
                AbstractC9262j.C9270e c9270e = (AbstractC9262j.C9270e) m15890g;
                m15978b = C9338q.this.mo15828v().m15871v(c9270e.m15972c(), c9270e.m15973b());
            } else if (m15890g instanceof AbstractC9262j.C9268c) {
                m15978b = ((AbstractC9262j.C9268c) m15890g).m15976b();
            } else if (m15890g instanceof AbstractC9262j.C9266b) {
                m15978b = ((AbstractC9262j.C9266b) m15890g).m15978b();
            } else if (m15890g instanceof AbstractC9262j.C9263a) {
                List<Method> m15980b = ((AbstractC9262j.C9263a) m15890g).m15980b();
                Class<?> mo13896e2 = C9338q.this.mo15828v().mo13896e();
                m14093t = C9546k.m14093t(m15980b, 10);
                ArrayList arrayList2 = new ArrayList(m14093t);
                for (Method method : m15980b) {
                    arrayList2.add(method.getName());
                }
                return new C10144a(mo13896e2, arrayList2, C10144a.EnumC10145a.POSITIONAL_CALL, C10144a.EnumC10146b.JAVA, m15980b);
            } else {
                throw new C11581q();
            }
            if (m15978b instanceof Constructor) {
                C9338q c9338q = C9338q.this;
                m15832I = c9338q.m15835F((Constructor) m15978b, c9338q.mo15826x(), false);
            } else if (m15978b instanceof Method) {
                Method method2 = (Method) m15978b;
                if (!Modifier.isStatic(method2.getModifiers())) {
                    m15832I = C9338q.this.m15834G(method2);
                } else if (C9338q.this.mo15826x().getAnnotations().mo6024b(C9336p0.m15850j()) != null) {
                    m15832I = C9338q.this.m15833H(method2);
                } else {
                    m15832I = C9338q.this.m15832I(method2);
                }
            } else {
                throw new C9258h0("Could not compute caller for function: " + C9338q.this.mo15826x() + " (member = " + m15978b + ')');
            }
            return C10183i.m12149c(m15832I, C9338q.this.mo15826x(), false, 2, null);
        }
    }

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"Llg/e;", "Ljava/lang/reflect/Executable;", "a", "()Llg/e;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.q$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C9340b extends AbstractC9614s implements Function0<InterfaceC10153e<? extends Executable>> {
        C9340b() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.reflect.Member, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final InterfaceC10153e<Executable> invoke() {
            GenericDeclaration genericDeclaration;
            int m14093t;
            int m14093t2;
            InterfaceC10153e interfaceC10153e;
            ?? mo12138b;
            AbstractC9262j m15890g = C9321m0.f24422a.m15890g(C9338q.this.mo15826x());
            if (m15890g instanceof AbstractC9262j.C9270e) {
                AbstractC9327p mo15828v = C9338q.this.mo15828v();
                AbstractC9262j.C9270e c9270e = (AbstractC9262j.C9270e) m15890g;
                String m15972c = c9270e.m15972c();
                String m15973b = c9270e.m15973b();
                C9612q.m13920e(C9338q.this.mo15829u().mo12138b());
                genericDeclaration = mo15828v.m15873t(m15972c, m15973b, !Modifier.isStatic(mo12138b.getModifiers()));
            } else if (m15890g instanceof AbstractC9262j.C9269d) {
                if (C9338q.this.m15944y()) {
                    Class<?> mo13896e = C9338q.this.mo15828v().mo13896e();
                    List<InterfaceC7135f> parameters = C9338q.this.getParameters();
                    m14093t2 = C9546k.m14093t(parameters, 10);
                    ArrayList arrayList = new ArrayList(m14093t2);
                    for (InterfaceC7135f interfaceC7135f : parameters) {
                        String name = interfaceC7135f.getName();
                        C9612q.m13920e(name);
                        arrayList.add(name);
                    }
                    return new C10144a(mo13896e, arrayList, C10144a.EnumC10145a.CALL_BY_NAME, C10144a.EnumC10146b.KOTLIN, null, 16, null);
                }
                genericDeclaration = C9338q.this.mo15828v().m15874s(((AbstractC9262j.C9269d) m15890g).m15975b());
            } else if (m15890g instanceof AbstractC9262j.C9263a) {
                List<Method> m15980b = ((AbstractC9262j.C9263a) m15890g).m15980b();
                Class<?> mo13896e2 = C9338q.this.mo15828v().mo13896e();
                m14093t = C9546k.m14093t(m15980b, 10);
                ArrayList arrayList2 = new ArrayList(m14093t);
                for (Method method : m15980b) {
                    arrayList2.add(method.getName());
                }
                return new C10144a(mo13896e2, arrayList2, C10144a.EnumC10145a.CALL_BY_NAME, C10144a.EnumC10146b.JAVA, m15980b);
            } else {
                genericDeclaration = null;
            }
            if (genericDeclaration instanceof Constructor) {
                C9338q c9338q = C9338q.this;
                interfaceC10153e = c9338q.m15835F((Constructor) genericDeclaration, c9338q.mo15826x(), true);
            } else if (genericDeclaration instanceof Method) {
                if (C9338q.this.mo15826x().getAnnotations().mo6024b(C9336p0.m15850j()) != null) {
                    InterfaceC11947m mo4163b = C9338q.this.mo15826x().mo4163b();
                    C9612q.m13919f(mo4163b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (!((InterfaceC11914e) mo4163b).mo4177Y()) {
                        interfaceC10153e = C9338q.this.m15833H((Method) genericDeclaration);
                    }
                }
                interfaceC10153e = C9338q.this.m15832I((Method) genericDeclaration);
            } else {
                interfaceC10153e = null;
            }
            if (interfaceC10153e == null) {
                return null;
            }
            return C10183i.m12150b(interfaceC10153e, C9338q.this.mo15826x(), true);
        }
    }

    @Metadata(m14358d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"Lqg/y;", "kotlin.jvm.PlatformType", "a", "()Lqg/y;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.q$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C9341c extends AbstractC9614s implements Function0<InterfaceC11998y> {

        /* renamed from: k */
        final /* synthetic */ String f24451k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9341c(String str) {
            super(0);
            this.f24451k = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final InterfaceC11998y invoke() {
            return C9338q.this.mo15828v().m15872u(this.f24451k, C9338q.this.f24443o);
        }
    }

    /* synthetic */ C9338q(AbstractC9327p abstractC9327p, String str, String str2, InterfaceC11998y interfaceC11998y, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC9327p, str, str2, interfaceC11998y, (i & 16) != 0 ? AbstractC9587e.NO_RECEIVER : obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public final AbstractC10155f<Constructor<?>> m15835F(Constructor<?> constructor, InterfaceC11998y interfaceC11998y, boolean z) {
        if (!z && C14025b.m890f(interfaceC11998y)) {
            if (mo15825z()) {
                return new AbstractC10155f.C10156a(constructor, m15831J());
            }
            return new AbstractC10155f.C10157b(constructor);
        } else if (mo15825z()) {
            return new AbstractC10155f.C10158c(constructor, m15831J());
        } else {
            return new AbstractC10155f.C10160e(constructor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final AbstractC10155f.AbstractC10173h m15834G(Method method) {
        return mo15825z() ? new AbstractC10155f.AbstractC10173h.C10174a(method, m15831J()) : new AbstractC10155f.AbstractC10173h.C10177d(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public final AbstractC10155f.AbstractC10173h m15833H(Method method) {
        return mo15825z() ? new AbstractC10155f.AbstractC10173h.C10175b(method) : new AbstractC10155f.AbstractC10173h.C10178e(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public final AbstractC10155f.AbstractC10173h m15832I(Method method) {
        return mo15825z() ? new AbstractC10155f.AbstractC10173h.C10176c(method, m15831J()) : new AbstractC10155f.AbstractC10173h.C10179f(method);
    }

    /* renamed from: J */
    private final Object m15831J() {
        return C10183i.m12151a(this.f24444p, mo15826x());
    }

    @Override // kg.AbstractC9282l
    /* renamed from: K */
    public InterfaceC11998y mo15826x() {
        T m15964b = this.f24445q.m15964b(this, f24441t[0]);
        C9612q.m13918g(m15964b, "<get-descriptor>(...)");
        return (InterfaceC11998y) m15964b;
    }

    public boolean equals(Object obj) {
        C9338q m15857c = C9336p0.m15857c(obj);
        if (m15857c == null || !C9612q.m13922c(mo15828v(), m15857c.mo15828v()) || !C9612q.m13922c(getName(), m15857c.getName()) || !C9612q.m13922c(this.f24443o, m15857c.f24443o) || !C9612q.m13922c(this.f24444p, m15857c.f24444p)) {
            return false;
        }
        return true;
    }

    @Override // kotlin.jvm.internal.InterfaceC9603l
    public int getArity() {
        return C10180g.m12155a(mo15829u());
    }

    @Override // kotlin.reflect.KCallable
    public String getName() {
        String m7426b = mo15826x().getName().m7426b();
        C9612q.m13918g(m7426b, "descriptor.name.asString()");
        return m7426b;
    }

    public int hashCode() {
        return (((mo15828v().hashCode() * 31) + getName().hashCode()) * 31) + this.f24443o.hashCode();
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return InterfaceC9259i.C9260a.m15986a(this);
    }

    @Override // kotlin.reflect.KFunction
    public boolean isExternal() {
        return mo15826x().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInfix() {
        return mo15826x().isInfix();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInline() {
        return mo15826x().isInline();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isOperator() {
        return mo15826x().isOperator();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return mo15826x().isSuspend();
    }

    public String toString() {
        return C9292l0.f24366a.m15934d(mo15826x());
    }

    @Override // kg.AbstractC9282l
    /* renamed from: u */
    public InterfaceC10153e<?> mo15829u() {
        T m15964b = this.f24446r.m15964b(this, f24441t[1]);
        C9612q.m13918g(m15964b, "<get-caller>(...)");
        return (InterfaceC10153e) m15964b;
    }

    @Override // kg.AbstractC9282l
    /* renamed from: v */
    public AbstractC9327p mo15828v() {
        return this.f24442n;
    }

    @Override // kg.AbstractC9282l
    /* renamed from: w */
    public InterfaceC10153e<?> mo15827w() {
        return (InterfaceC10153e) this.f24447s.m15964b(this, f24441t[2]);
    }

    @Override // kg.AbstractC9282l
    /* renamed from: z */
    public boolean mo15825z() {
        return !C9612q.m13922c(this.f24444p, AbstractC9587e.NO_RECEIVER);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return InterfaceC9259i.C9260a.m15985b(this, obj);
    }

    private C9338q(AbstractC9327p abstractC9327p, String str, String str2, InterfaceC11998y interfaceC11998y, Object obj) {
        this.f24442n = abstractC9327p;
        this.f24443o = str2;
        this.f24444p = obj;
        this.f24445q = C9271j0.m15969c(interfaceC11998y, new C9341c(str));
        this.f24446r = C9271j0.m15970b(new C9339a());
        this.f24447s = C9271j0.m15970b(new C9340b());
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return InterfaceC9259i.C9260a.m15984c(this, obj, obj2);
    }

    @Override // kotlin.jvm.functions.Function3
    public Object invoke(Object obj, Object obj2, Object obj3) {
        return InterfaceC9259i.C9260a.m15983d(this, obj, obj2, obj3);
    }

    @Override // kotlin.jvm.functions.Function4
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return InterfaceC9259i.C9260a.m15982e(this, obj, obj2, obj3, obj4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9338q(AbstractC9327p container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        C9612q.m13917h(container, "container");
        C9612q.m13917h(name, "name");
        C9612q.m13917h(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C9338q(kg.AbstractC9327p r10, p305qg.InterfaceC11998y r11) {
        /*
            r9 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.C9612q.m13917h(r10, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C9612q.m13917h(r11, r0)
            ph.f r0 = r11.getName()
            java.lang.String r3 = r0.m7426b()
            java.lang.String r0 = "descriptor.name.asString()"
            kotlin.jvm.internal.C9612q.m13918g(r3, r0)
            kg.m0 r0 = kg.C9321m0.f24422a
            kg.j r0 = r0.m15890g(r11)
            java.lang.String r4 = r0.mo15974a()
            r6 = 0
            r7 = 16
            r8 = 0
            r1 = r9
            r2 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.C9338q.<init>(kg.p, qg.y):void");
    }
}
