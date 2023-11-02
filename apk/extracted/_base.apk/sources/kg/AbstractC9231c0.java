package kg;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kg.AbstractC9276k;
import kg.C9271j0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9587e;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import p140hg.InterfaceC7131d;
import p159ig.C7510b;
import p181jg.C8937a;
import p218lg.C10183i;
import p218lg.InterfaceC10153e;
import p250nh.C10890a;
import p270oh.AbstractC11112d;
import p270oh.C11122i;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11987t0;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11991v0;
import p305qg.InterfaceC11993w0;
import p325rg.InterfaceC12155g;
import p468zg.C14240k;
import pf.C11581q;
import th.C12756d;

@Metadata(m14358d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b \u0018\u0000 J*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004KLMNB\u0019\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010D\u001a\u00020)¢\u0006\u0004\bE\u0010FB5\b\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0010\u0012\b\u0010G\u001a\u0004\u0018\u00010)\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bE\u0010HB+\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0010\u0012\b\u00100\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bE\u0010IJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004J(\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0004J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010-\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010)0)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0013\u00100\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00103\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u00106\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00028\u0000078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0018\u0010>\u001a\u0006\u0012\u0002\b\u00030;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0002\b\u0003\u0018\u00010;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0014\u0010A\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u00102R\u0014\u0010D\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006O"}, m14357d2 = {"Lkg/c0;", "V", "Lkg/l;", "Lkotlin/reflect/KProperty;", "Ljava/lang/reflect/Member;", "A", "fieldOrMethod", "", "receiver1", "receiver2", "C", "other", "", "equals", "", "hashCode", "", "toString", "Lkg/p;", "n", "Lkg/p;", "v", "()Lkg/p;", "container", "o", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_NAME, "p", "G", "signature", "q", "Ljava/lang/Object;", "rawBoundReceiver", "Lkg/j0$b;", "Ljava/lang/reflect/Field;", "r", "Lkg/j0$b;", "_javaField", "Lkg/j0$a;", "Lqg/u0;", "kotlin.jvm.PlatformType", "s", "Lkg/j0$a;", "_descriptor", "B", "()Ljava/lang/Object;", "boundReceiver", "z", "()Z", "isBound", "F", "()Ljava/lang/reflect/Field;", "javaField", "Lkg/c0$c;", "E", "()Lkg/c0$c;", "getter", "Llg/e;", "u", "()Llg/e;", "caller", "w", "defaultCaller", "isSuspend", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkg/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "descriptorInitialValue", "(Lkg/p;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "(Lkg/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "t", "a", "b", "c", "d", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC9231c0<V> extends AbstractC9282l<V> implements KProperty<V> {

    /* renamed from: t */
    public static final C9233b f24281t = new C9233b(null);

    /* renamed from: u */
    private static final Object f24282u = new Object();

    /* renamed from: n */
    private final AbstractC9327p f24283n;

    /* renamed from: o */
    private final String f24284o;

    /* renamed from: p */
    private final String f24285p;

    /* renamed from: q */
    private final Object f24286q;

    /* renamed from: r */
    private final C9271j0.C9273b<Field> f24287r;

    /* renamed from: s */
    private final C9271j0.C9272a<InterfaceC11989u0> f24288s;

    @Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005B\u0007¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, m14357d2 = {"Lkg/c0$a;", "PropertyType", "ReturnType", "Lkg/l;", "Lkotlin/reflect/KProperty$a;", "Lkotlin/reflect/KFunction;", "Lkg/c0;", "B", "()Lkg/c0;", "property", "Lkg/p;", "v", "()Lkg/p;", "container", "Llg/e;", "w", "()Llg/e;", "defaultCaller", "", "z", "()Z", "isBound", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "Lqg/t0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "<init>", "()V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.c0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static abstract class AbstractC9232a<PropertyType, ReturnType> extends AbstractC9282l<ReturnType> implements KFunction<ReturnType>, KProperty.InterfaceC9629a<PropertyType> {
        /* renamed from: A */
        public abstract InterfaceC11987t0 mo16014A();

        /* renamed from: B */
        public abstract AbstractC9231c0<PropertyType> mo15769B();

        @Override // kotlin.reflect.KFunction
        public boolean isExternal() {
            return mo16014A().isExternal();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isInfix() {
            return mo16014A().isInfix();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isInline() {
            return mo16014A().isInline();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isOperator() {
            return mo16014A().isOperator();
        }

        @Override // kotlin.reflect.KCallable
        public boolean isSuspend() {
            return mo16014A().isSuspend();
        }

        @Override // kg.AbstractC9282l
        /* renamed from: v */
        public AbstractC9327p mo15828v() {
            return mo15769B().mo15828v();
        }

        @Override // kg.AbstractC9282l
        /* renamed from: w */
        public InterfaceC10153e<?> mo15827w() {
            return null;
        }

        @Override // kg.AbstractC9282l
        /* renamed from: z */
        public boolean mo15825z() {
            return mo15769B().mo15825z();
        }
    }

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m14357d2 = {"Lkg/c0$b;", "", "<init>", "()V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.c0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9233b {
        private C9233b() {
        }

        public /* synthetic */ C9233b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001b\u0010\u0011\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m14357d2 = {"Lkg/c0$c;", "V", "Lkg/c0$a;", "Lkotlin/reflect/KProperty$b;", "", "toString", "", "other", "", "equals", "", "hashCode", "Lqg/v0;", "n", "Lkg/j0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor", "Llg/e;", "o", "Lkg/j0$b;", "u", "()Llg/e;", "caller", "getName", "()Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_NAME, "<init>", "()V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.c0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static abstract class AbstractC9234c<V> extends AbstractC9232a<V, V> implements KProperty.InterfaceC9630b<V> {

        /* renamed from: p */
        static final /* synthetic */ KProperty<Object>[] f24289p = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(AbstractC9234c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(AbstractC9234c.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* renamed from: n */
        private final C9271j0.C9272a f24290n = C9271j0.m15968d(new C9236b(this));

        /* renamed from: o */
        private final C9271j0.C9273b f24291o = C9271j0.m15970b(new C9235a(this));

        @Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"V", "Llg/e;", "kotlin.jvm.PlatformType", "a", "()Llg/e;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.c0$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9235a extends AbstractC9614s implements Function0<InterfaceC10153e<?>> {

            /* renamed from: j */
            final /* synthetic */ AbstractC9234c<V> f24292j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C9235a(AbstractC9234c<? extends V> abstractC9234c) {
                super(0);
                this.f24292j = abstractC9234c;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC10153e<?> invoke() {
                return C9243d0.m16008a(this.f24292j, true);
            }
        }

        @Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"V", "Lqg/v0;", "kotlin.jvm.PlatformType", "a", "()Lqg/v0;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.c0$c$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9236b extends AbstractC9614s implements Function0<InterfaceC11991v0> {

            /* renamed from: j */
            final /* synthetic */ AbstractC9234c<V> f24293j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C9236b(AbstractC9234c<? extends V> abstractC9234c) {
                super(0);
                this.f24293j = abstractC9234c;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC11991v0 invoke() {
                InterfaceC11991v0 mo4509f = this.f24293j.mo15769B().mo15826x().mo4509f();
                return mo4509f == null ? C12756d.m4139d(this.f24293j.mo15769B().mo15826x(), InterfaceC12155g.f31603f.m6037b()) : mo4509f;
            }
        }

        @Override // kg.AbstractC9282l
        /* renamed from: C */
        public InterfaceC11991v0 mo15826x() {
            T m15964b = this.f24290n.m15964b(this, f24289p[0]);
            C9612q.m13918g(m15964b, "<get-descriptor>(...)");
            return (InterfaceC11991v0) m15964b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof AbstractC9234c) && C9612q.m13922c(mo15769B(), ((AbstractC9234c) obj).mo15769B());
        }

        @Override // kotlin.reflect.KCallable
        public String getName() {
            return "<get-" + mo15769B().getName() + '>';
        }

        public int hashCode() {
            return mo15769B().hashCode();
        }

        public String toString() {
            return "getter of " + mo15769B();
        }

        @Override // kg.AbstractC9282l
        /* renamed from: u */
        public InterfaceC10153e<?> mo15829u() {
            T m15964b = this.f24291o.m15964b(this, f24289p[1]);
            C9612q.m13918g(m15964b, "<get-caller>(...)");
            return (InterfaceC10153e) m15964b;
        }
    }

    @Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001b\u0010\u0012\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m14357d2 = {"Lkg/c0$d;", "V", "Lkg/c0$a;", "", "Lhg/d$a;", "", "toString", "", "other", "", "equals", "", "hashCode", "Lqg/w0;", "n", "Lkg/j0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor", "Llg/e;", "o", "Lkg/j0$b;", "u", "()Llg/e;", "caller", "getName", "()Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_NAME, "<init>", "()V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.c0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static abstract class AbstractC9237d<V> extends AbstractC9232a<V, Unit> implements InterfaceC7131d.InterfaceC7132a<V> {

        /* renamed from: p */
        static final /* synthetic */ KProperty<Object>[] f24294p = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(AbstractC9237d.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(AbstractC9237d.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* renamed from: n */
        private final C9271j0.C9272a f24295n = C9271j0.m15968d(new C9239b(this));

        /* renamed from: o */
        private final C9271j0.C9273b f24296o = C9271j0.m15970b(new C9238a(this));

        @Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"V", "Llg/e;", "kotlin.jvm.PlatformType", "a", "()Llg/e;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.c0$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9238a extends AbstractC9614s implements Function0<InterfaceC10153e<?>> {

            /* renamed from: j */
            final /* synthetic */ AbstractC9237d<V> f24297j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9238a(AbstractC9237d<V> abstractC9237d) {
                super(0);
                this.f24297j = abstractC9237d;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC10153e<?> invoke() {
                return C9243d0.m16008a(this.f24297j, false);
            }
        }

        @Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"V", "Lqg/w0;", "kotlin.jvm.PlatformType", "a", "()Lqg/w0;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.c0$d$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9239b extends AbstractC9614s implements Function0<InterfaceC11993w0> {

            /* renamed from: j */
            final /* synthetic */ AbstractC9237d<V> f24298j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9239b(AbstractC9237d<V> abstractC9237d) {
                super(0);
                this.f24298j = abstractC9237d;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC11993w0 invoke() {
                InterfaceC11993w0 mo4507h = this.f24298j.mo15769B().mo15826x().mo4507h();
                if (mo4507h == null) {
                    InterfaceC11989u0 mo15826x = this.f24298j.mo15769B().mo15826x();
                    InterfaceC12155g.C12156a c12156a = InterfaceC12155g.f31603f;
                    return C12756d.m4138e(mo15826x, c12156a.m6037b(), c12156a.m6037b());
                }
                return mo4507h;
            }
        }

        @Override // kg.AbstractC9282l
        /* renamed from: C */
        public InterfaceC11993w0 mo15826x() {
            T m15964b = this.f24295n.m15964b(this, f24294p[0]);
            C9612q.m13918g(m15964b, "<get-descriptor>(...)");
            return (InterfaceC11993w0) m15964b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof AbstractC9237d) && C9612q.m13922c(mo15769B(), ((AbstractC9237d) obj).mo15769B());
        }

        @Override // kotlin.reflect.KCallable
        public String getName() {
            return "<set-" + mo15769B().getName() + '>';
        }

        public int hashCode() {
            return mo15769B().hashCode();
        }

        public String toString() {
            return "setter of " + mo15769B();
        }

        @Override // kg.AbstractC9282l
        /* renamed from: u */
        public InterfaceC10153e<?> mo15829u() {
            T m15964b = this.f24296o.m15964b(this, f24294p[1]);
            C9612q.m13918g(m15964b, "<get-caller>(...)");
            return (InterfaceC10153e) m15964b;
        }
    }

    @Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"V", "Lqg/u0;", "kotlin.jvm.PlatformType", "a", "()Lqg/u0;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.c0$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C9240e extends AbstractC9614s implements Function0<InterfaceC11989u0> {

        /* renamed from: j */
        final /* synthetic */ AbstractC9231c0<V> f24299j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C9240e(AbstractC9231c0<? extends V> abstractC9231c0) {
            super(0);
            this.f24299j = abstractC9231c0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final InterfaceC11989u0 invoke() {
            return this.f24299j.mo15828v().m15870w(this.f24299j.getName(), this.f24299j.m16018G());
        }
    }

    @Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"V", "Ljava/lang/reflect/Field;", "a", "()Ljava/lang/reflect/Field;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.c0$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C9241f extends AbstractC9614s implements Function0<Field> {

        /* renamed from: j */
        final /* synthetic */ AbstractC9231c0<V> f24300j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C9241f(AbstractC9231c0<? extends V> abstractC9231c0) {
            super(0);
            this.f24300j = abstractC9231c0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Field invoke() {
            Class<?> enclosingClass;
            AbstractC9276k m15891f = C9321m0.f24422a.m15891f(this.f24300j.mo15826x());
            if (m15891f instanceof AbstractC9276k.C9279c) {
                AbstractC9276k.C9279c c9279c = (AbstractC9276k.C9279c) m15891f;
                InterfaceC11989u0 m15959b = c9279c.m15959b();
                AbstractC11112d.C11113a m9130d = C11122i.m9130d(C11122i.f29099a, c9279c.m15956e(), c9279c.m15957d(), c9279c.m15954g(), false, 8, null);
                if (m9130d == null) {
                    return null;
                }
                AbstractC9231c0<V> abstractC9231c0 = this.f24300j;
                if (!C14240k.m332e(m15959b) && !C11122i.m9128f(c9279c.m15956e())) {
                    InterfaceC11947m mo4163b = m15959b.mo4163b();
                    if (mo4163b instanceof InterfaceC11914e) {
                        enclosingClass = C9336p0.m15844p((InterfaceC11914e) mo4163b);
                    } else {
                        enclosingClass = abstractC9231c0.mo15828v().mo13896e();
                    }
                } else {
                    enclosingClass = abstractC9231c0.mo15828v().mo13896e().getEnclosingClass();
                }
                if (enclosingClass == null) {
                    return null;
                }
                try {
                    return enclosingClass.getDeclaredField(m9130d.mo9138c());
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            } else if (m15891f instanceof AbstractC9276k.C9277a) {
                return ((AbstractC9276k.C9277a) m15891f).m15962b();
            } else {
                if ((m15891f instanceof AbstractC9276k.C9278b) || (m15891f instanceof AbstractC9276k.C9280d)) {
                    return null;
                }
                throw new C11581q();
            }
        }
    }

    private AbstractC9231c0(AbstractC9327p abstractC9327p, String str, String str2, InterfaceC11989u0 interfaceC11989u0, Object obj) {
        this.f24283n = abstractC9327p;
        this.f24284o = str;
        this.f24285p = str2;
        this.f24286q = obj;
        C9271j0.C9273b<Field> m15970b = C9271j0.m15970b(new C9241f(this));
        C9612q.m13918g(m15970b, "lazy {\n        when (val…y -> null\n        }\n    }");
        this.f24287r = m15970b;
        C9271j0.C9272a<InterfaceC11989u0> m15969c = C9271j0.m15969c(interfaceC11989u0, new C9240e(this));
        C9612q.m13918g(m15969c, "lazySoft(descriptorIniti…or(name, signature)\n    }");
        this.f24288s = m15969c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public final Member m16023A() {
        if (!mo15826x().mo4531A()) {
            return null;
        }
        AbstractC9276k m15891f = C9321m0.f24422a.m15891f(mo15826x());
        if (m15891f instanceof AbstractC9276k.C9279c) {
            AbstractC9276k.C9279c c9279c = (AbstractC9276k.C9279c) m15891f;
            if (c9279c.m15955f().m9678F()) {
                C10890a.C10895c m9683A = c9279c.m15955f().m9683A();
                if (!m9683A.m9708A() || !m9683A.m9695z()) {
                    return null;
                }
                return mo15828v().m15871v(c9279c.m15957d().getString(m9683A.m9696y()), c9279c.m15957d().getString(m9683A.m9697x()));
            }
        }
        return m16019F();
    }

    /* renamed from: B */
    public final Object m16022B() {
        return C10183i.m12151a(this.f24286q, mo15826x());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public final Object m16021C(Member member, Object obj, Object obj2) {
        Object obj3;
        boolean z;
        boolean z2;
        AccessibleObject accessibleObject;
        try {
            Object obj4 = f24282u;
            if ((obj != obj4 && obj2 != obj4) || mo15826x().mo4329M() != null) {
                if (mo15825z()) {
                    obj3 = m16022B();
                } else {
                    obj3 = obj;
                }
                if (obj3 != obj4) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    obj3 = null;
                }
                if (!mo15825z()) {
                    obj = obj2;
                }
                if (obj != obj4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    obj = null;
                }
                if (member instanceof AccessibleObject) {
                    accessibleObject = (AccessibleObject) member;
                } else {
                    accessibleObject = null;
                }
                if (accessibleObject != null) {
                    accessibleObject.setAccessible(C8937a.m17026a(this));
                }
                if (member == null) {
                    return null;
                }
                if (member instanceof Field) {
                    return ((Field) member).get(obj3);
                }
                if (member instanceof Method) {
                    int length = ((Method) member).getParameterTypes().length;
                    if (length != 0) {
                        if (length != 1) {
                            if (length == 2) {
                                Method method = (Method) member;
                                Object[] objArr = new Object[2];
                                objArr[0] = obj3;
                                if (obj == null) {
                                    Class<?> cls = ((Method) member).getParameterTypes()[1];
                                    C9612q.m13918g(cls, "fieldOrMethod.parameterTypes[1]");
                                    obj = C9336p0.m15853g(cls);
                                }
                                objArr[1] = obj;
                                return method.invoke(null, objArr);
                            }
                            throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
                        }
                        Method method2 = (Method) member;
                        Object[] objArr2 = new Object[1];
                        if (obj3 == null) {
                            Class<?> cls2 = ((Method) member).getParameterTypes()[0];
                            C9612q.m13918g(cls2, "fieldOrMethod.parameterTypes[0]");
                            obj3 = C9336p0.m15853g(cls2);
                        }
                        objArr2[0] = obj3;
                        return method2.invoke(null, objArr2);
                    }
                    return ((Method) member).invoke(null, new Object[0]);
                }
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
        } catch (IllegalAccessException e) {
            throw new C7510b(e);
        }
    }

    @Override // kg.AbstractC9282l
    /* renamed from: D */
    public InterfaceC11989u0 mo15826x() {
        InterfaceC11989u0 invoke = this.f24288s.invoke();
        C9612q.m13918g(invoke, "_descriptor()");
        return invoke;
    }

    /* renamed from: E */
    public abstract AbstractC9234c<V> mo15772E();

    /* renamed from: F */
    public final Field m16019F() {
        return this.f24287r.invoke();
    }

    /* renamed from: G */
    public final String m16018G() {
        return this.f24285p;
    }

    public boolean equals(Object obj) {
        AbstractC9231c0<?> m15856d = C9336p0.m15856d(obj);
        if (m15856d == null || !C9612q.m13922c(mo15828v(), m15856d.mo15828v()) || !C9612q.m13922c(getName(), m15856d.getName()) || !C9612q.m13922c(this.f24285p, m15856d.f24285p) || !C9612q.m13922c(this.f24286q, m15856d.f24286q)) {
            return false;
        }
        return true;
    }

    @Override // kotlin.reflect.KCallable
    public String getName() {
        return this.f24284o;
    }

    public int hashCode() {
        return (((mo15828v().hashCode() * 31) + getName().hashCode()) * 31) + this.f24285p.hashCode();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return false;
    }

    public String toString() {
        return C9292l0.f24366a.m15931g(mo15826x());
    }

    @Override // kg.AbstractC9282l
    /* renamed from: u */
    public InterfaceC10153e<?> mo15829u() {
        return mo15772E().mo15829u();
    }

    @Override // kg.AbstractC9282l
    /* renamed from: v */
    public AbstractC9327p mo15828v() {
        return this.f24283n;
    }

    @Override // kg.AbstractC9282l
    /* renamed from: w */
    public InterfaceC10153e<?> mo15827w() {
        return mo15772E().mo15827w();
    }

    @Override // kg.AbstractC9282l
    /* renamed from: z */
    public boolean mo15825z() {
        return !C9612q.m13922c(this.f24286q, AbstractC9587e.NO_RECEIVER);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC9231c0(AbstractC9327p container, String name, String signature, Object obj) {
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
    public AbstractC9231c0(kg.AbstractC9327p r8, p305qg.InterfaceC11989u0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.C9612q.m13917h(r8, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C9612q.m13917h(r9, r0)
            ph.f r0 = r9.getName()
            java.lang.String r3 = r0.m7426b()
            java.lang.String r0 = "descriptor.name.asString()"
            kotlin.jvm.internal.C9612q.m13918g(r3, r0)
            kg.m0 r0 = kg.C9321m0.f24422a
            kg.k r0 = r0.m15891f(r9)
            java.lang.String r4 = r0.mo15953a()
            java.lang.Object r6 = kotlin.jvm.internal.AbstractC9587e.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.AbstractC9231c0.<init>(kg.p, qg.u0):void");
    }
}
