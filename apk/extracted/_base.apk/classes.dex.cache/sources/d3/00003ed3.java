package kg;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.SortedMap;
import kg.C9271j0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InterfaceC9592g;
import kotlin.reflect.KProperty;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import p304qf.C11888u;
import p305qg.AbstractC11988u;
import p305qg.C11974t;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11944l;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11998y;
import p407wg.C13548d;
import ph.C11638f;
import sh.AbstractC12485c;
import vg.C13282e;
import vg.C13289k;

@Metadata(m14358d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u0000 =2\u00020\u0001:\u0003>?@B\u0007¢\u0006\u0004\b;\u0010<JG\u0010\u000b\u001a\u0004\u0018\u00010\n*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\r\u001a\u0004\u0018\u00010\n*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010*\u0006\u0012\u0002\b\u00030\u00022\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000fH\u0002J*\u0010\u0017\u001a\u00020\u00162\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u001a\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J$\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002J\u0014\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0004\u001a\u00020\u001eH&J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001f2\u0006\u0010\u0004\u001a\u00020\u001eH&J\u0012\u0010%\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020\u0019H&J\"\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0\u001f2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0004J\u0016\u0010-\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003J\u0016\u0010.\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003J\u0018\u0010/\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003J \u00101\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u00100\u001a\u00020\bJ\u0014\u00102\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0003J\u0014\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0003R\u0018\u00106\u001a\u0006\u0012\u0002\b\u00030\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002070\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006A"}, m14357d2 = {"Lkg/p;", "Lkotlin/jvm/internal/g;", "Ljava/lang/Class;", "", ZeroconfModule.KEY_SERVICE_NAME, "", "parameterTypes", "returnType", "", "isStaticDefault", "Ljava/lang/reflect/Method;", "G", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "J", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "", "Ljava/lang/reflect/Constructor;", "I", "", "result", "desc", "isConstructor", "", "q", "E", "", "begin", ViewProps.END, "H", "F", "Lph/f;", "", "Lqg/u0;", "D", "Lqg/y;", "z", "index", "A", "Lai/h;", "scope", "Lkg/p$c;", "belonginess", "Lkg/l;", "B", "signature", "w", "u", "v", "isMember", "t", "r", "s", "C", "()Ljava/lang/Class;", "methodOwner", "Lqg/l;", "y", "()Ljava/util/Collection;", "constructorDescriptors", "<init>", "()V", "j", "a", "b", "c", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC9327p implements InterfaceC9592g {

    /* renamed from: j */
    public static final C9328a f24426j = new C9328a(null);

    /* renamed from: k */
    private static final Class<?> f24427k = DefaultConstructorMarker.class;

    /* renamed from: l */
    private static final Regex f24428l = new Regex("<v#(\\d+)>");

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\t\u001a\u0012\u0012\u0002\b\u0003 \b*\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m14357d2 = {"Lkg/p$a;", "", "Lkotlin/text/Regex;", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "a", "()Lkotlin/text/Regex;", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "<init>", "()V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9328a {
        private C9328a() {
        }

        public /* synthetic */ C9328a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Regex m15868a() {
            return AbstractC9327p.f24428l;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m14357d2 = {"Lkg/p$b;", "", "Lvg/k;", "a", "Lkg/j0$a;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData", "<init>", "(Lkg/p;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.p$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public abstract class AbstractC9329b {

        /* renamed from: c */
        static final /* synthetic */ KProperty<Object>[] f24429c = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(AbstractC9329b.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: a */
        private final C9271j0.C9272a f24430a;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m14358d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"Lvg/k;", "kotlin.jvm.PlatformType", "a", "()Lvg/k;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.p$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C9330a extends AbstractC9614s implements Function0<C13289k> {

            /* renamed from: j */
            final /* synthetic */ AbstractC9327p f24432j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9330a(AbstractC9327p abstractC9327p) {
                super(0);
                this.f24432j = abstractC9327p;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final C13289k invoke() {
                return C9261i0.m15981a(this.f24432j.mo13896e());
            }
        }

        public AbstractC9329b() {
            AbstractC9327p.this = r2;
            this.f24430a = C9271j0.m15968d(new C9330a(r2));
        }

        /* renamed from: a */
        public final C13289k m15867a() {
            T m15964b = this.f24430a.m15964b(this, f24429c[0]);
            C9612q.m13918g(m15964b, "<get-moduleData>(...)");
            return (C13289k) m15964b;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0084\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m14357d2 = {"Lkg/p$c;", "", "Lqg/b;", "member", "", "b", "<init>", "(Ljava/lang/String;I)V", "j", "k", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.p$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public enum EnumC9331c {
        DECLARED,
        INHERITED;

        /* renamed from: b */
        public final boolean m15864b(InterfaceC11902b member) {
            boolean z;
            C9612q.m13917h(member, "member");
            boolean m6727a = member.mo4305g().m6727a();
            if (this == DECLARED) {
                z = true;
            } else {
                z = false;
            }
            if (m6727a == z) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Lqg/y;", "descriptor", "", "a", "(Lqg/y;)Ljava/lang/CharSequence;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.p$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9332d extends AbstractC9614s implements Function1<InterfaceC11998y, CharSequence> {

        /* renamed from: j */
        public static final C9332d f24436j = new C9332d();

        C9332d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(InterfaceC11998y descriptor) {
            C9612q.m13917h(descriptor, "descriptor");
            return AbstractC12485c.f32444j.mo5061q(descriptor) + " | " + C9321m0.f24422a.m15890g(descriptor).mo15974a();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Lqg/u0;", "descriptor", "", "a", "(Lqg/u0;)Ljava/lang/CharSequence;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.p$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9333e extends AbstractC9614s implements Function1<InterfaceC11989u0, CharSequence> {

        /* renamed from: j */
        public static final C9333e f24437j = new C9333e();

        C9333e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(InterfaceC11989u0 descriptor) {
            C9612q.m13917h(descriptor, "descriptor");
            return AbstractC12485c.f32444j.mo5061q(descriptor) + " | " + C9321m0.f24422a.m15891f(descriptor).mo15953a();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"Lqg/u;", "kotlin.jvm.PlatformType", "first", "second", "", "invoke", "(Lorg/jetbrains/kotlin/descriptors/DescriptorVisibility;Lorg/jetbrains/kotlin/descriptors/DescriptorVisibility;)Ljava/lang/Integer;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.p$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9334f extends AbstractC9614s implements Function2<AbstractC11988u, AbstractC11988u, Integer> {

        /* renamed from: j */
        public static final C9334f f24438j = new C9334f();

        C9334f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Integer invoke(AbstractC11988u abstractC11988u, AbstractC11988u abstractC11988u2) {
            Integer m6675d = C11974t.m6675d(abstractC11988u, abstractC11988u2);
            return Integer.valueOf(m6675d == null ? 0 : m6675d.intValue());
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m14357d2 = {"kg/p$g", "Lkg/g;", "Lqg/l;", "descriptor", "", "data", "Lkg/l;", "visitConstructorDescriptor", "(Lorg/jetbrains/kotlin/descriptors/ConstructorDescriptor;Lkotlin/Unit;)Lkg/l;", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.p$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9335g extends C9255g {
        C9335g(AbstractC9327p abstractC9327p) {
            super(abstractC9327p);
        }

        @Override // tg.C12712l, p305qg.InterfaceC11964o
        /* renamed from: r */
        public AbstractC9282l<?> mo4389f(InterfaceC11944l descriptor, Unit data) {
            C9612q.m13917h(descriptor, "descriptor");
            C9612q.m13917h(data, "data");
            throw new IllegalStateException("No constructors should appear here: " + descriptor);
        }
    }

    /* renamed from: E */
    private final List<Class<?>> m15884E(String str) {
        boolean m13733L;
        int m13709Y;
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            char charAt = str.charAt(i3);
            m13733L = C9654p.m13733L("VZCBSIFJD", charAt, false, 2, null);
            if (m13733L) {
                i = i3 + 1;
            } else if (charAt == 'L') {
                m13709Y = C9654p.m13709Y(str, ';', i2, false, 4, null);
                i = m13709Y + 1;
            } else {
                throw new C9258h0("Unknown type prefix in the method signature: " + str);
            }
            arrayList.add(m15881H(str, i2, i));
            i2 = i;
        }
        return arrayList;
    }

    /* renamed from: F */
    private final Class<?> m15883F(String str) {
        int m13709Y;
        m13709Y = C9654p.m13709Y(str, ')', 0, false, 6, null);
        return m15881H(str, m13709Y + 1, str.length());
    }

    /* renamed from: G */
    private final Method m15882G(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z) {
        Method m15882G;
        if (z) {
            clsArr[0] = cls;
        }
        Method m15879J = m15879J(cls, str, clsArr, cls2);
        if (m15879J != null) {
            return m15879J;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && (m15882G = m15882G(superclass, str, clsArr, cls2, z)) != null) {
            return m15882G;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        C9612q.m13918g(interfaces, "interfaces");
        for (Class<?> superInterface : interfaces) {
            C9612q.m13918g(superInterface, "superInterface");
            Method m15882G2 = m15882G(superInterface, str, clsArr, cls2, z);
            if (m15882G2 != null) {
                return m15882G2;
            }
            if (z) {
                Class<?> m2857a = C13282e.m2857a(C13548d.m2241f(superInterface), superInterface.getName() + "$DefaultImpls");
                if (m2857a != null) {
                    clsArr[0] = superInterface;
                    Method m15879J2 = m15879J(m2857a, str, clsArr, cls2);
                    if (m15879J2 != null) {
                        return m15879J2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: H */
    private final Class<?> m15881H(String str, int i, int i2) {
        String m13763C;
        char charAt = str.charAt(i);
        if (charAt == 'L') {
            ClassLoader m2241f = C13548d.m2241f(mo13896e());
            String substring = str.substring(i + 1, i2 - 1);
            C9612q.m13918g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            m13763C = C9653o.m13763C(substring, '/', '.', false, 4, null);
            Class<?> loadClass = m2241f.loadClass(m13763C);
            C9612q.m13918g(loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return loadClass;
        } else if (charAt == '[') {
            return C9336p0.m15854f(m15881H(str, i + 1, i2));
        } else {
            if (charAt == 'V') {
                Class<?> TYPE = Void.TYPE;
                C9612q.m13918g(TYPE, "TYPE");
                return TYPE;
            } else if (charAt == 'Z') {
                return Boolean.TYPE;
            } else {
                if (charAt == 'C') {
                    return Character.TYPE;
                }
                if (charAt == 'B') {
                    return Byte.TYPE;
                }
                if (charAt == 'S') {
                    return Short.TYPE;
                }
                if (charAt == 'I') {
                    return Integer.TYPE;
                }
                if (charAt == 'F') {
                    return Float.TYPE;
                }
                if (charAt == 'J') {
                    return Long.TYPE;
                }
                if (charAt == 'D') {
                    return Double.TYPE;
                }
                throw new C9258h0("Unknown type prefix in the method signature: " + str);
            }
        }
    }

    /* renamed from: I */
    private final Constructor<?> m15880I(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: J */
    private final Method m15879J(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        boolean z;
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (C9612q.m13922c(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            C9612q.m13918g(declaredMethods, "declaredMethods");
            for (Method method : declaredMethods) {
                if (C9612q.m13922c(method.getName(), str) && C9612q.m13922c(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: q */
    private final void m15876q(List<Class<?>> list, String str, boolean z) {
        List<Class<?>> m15884E = m15884E(str);
        list.addAll(m15884E);
        int size = ((m15884E.size() + 32) - 1) / 32;
        for (int i = 0; i < size; i++) {
            Class<?> TYPE = Integer.TYPE;
            C9612q.m13918g(TYPE, "TYPE");
            list.add(TYPE);
        }
        if (z) {
            Class<?> DEFAULT_CONSTRUCTOR_MARKER = f24427k;
            list.remove(DEFAULT_CONSTRUCTOR_MARKER);
            C9612q.m13918g(DEFAULT_CONSTRUCTOR_MARKER, "DEFAULT_CONSTRUCTOR_MARKER");
            list.add(DEFAULT_CONSTRUCTOR_MARKER);
            return;
        }
        list.add(Object.class);
    }

    /* renamed from: x */
    public static final int m15869x(Function2 tmp0, Object obj, Object obj2) {
        C9612q.m13917h(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* renamed from: A */
    public abstract InterfaceC11989u0 mo15805A(int i);

    /* JADX WARN: Removed duplicated region for block: B:40:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x001e A[SYNTHETIC] */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection<kg.AbstractC9282l<?>> m15885B(ai.InterfaceC0194h r8, kg.AbstractC9327p.EnumC9331c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.C9612q.m13917h(r8, r0)
            java.lang.String r0 = "belonginess"
            kotlin.jvm.internal.C9612q.m13917h(r9, r0)
            kg.p$g r0 = new kg.p$g
            r0.<init>(r7)
            r1 = 3
            r2 = 0
            java.util.Collection r8 = ai.InterfaceC0200k.C0201a.m40970a(r8, r2, r2, r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L1e:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L53
            java.lang.Object r3 = r8.next()
            qg.m r3 = (p305qg.InterfaceC11947m) r3
            boolean r4 = r3 instanceof p305qg.InterfaceC11902b
            if (r4 == 0) goto L4c
            r4 = r3
            qg.b r4 = (p305qg.InterfaceC11902b) r4
            qg.u r5 = r4.getVisibility()
            qg.u r6 = p305qg.C11974t.f30973h
            boolean r5 = kotlin.jvm.internal.C9612q.m13922c(r5, r6)
            if (r5 != 0) goto L4c
            boolean r4 = r9.m15864b(r4)
            if (r4 == 0) goto L4c
            kotlin.Unit r4 = kotlin.Unit.f25302a
            java.lang.Object r3 = r3.mo4162d0(r0, r4)
            kg.l r3 = (kg.AbstractC9282l) r3
            goto L4d
        L4c:
            r3 = r2
        L4d:
            if (r3 == 0) goto L1e
            r1.add(r3)
            goto L1e
        L53:
            java.util.List r8 = kotlin.collections.C9543h.m14181C0(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.AbstractC9327p.m15885B(ai.h, kg.p$c):java.util.Collection");
    }

    /* renamed from: C */
    protected Class<?> mo15804C() {
        Class<?> m2240g = C13548d.m2240g(mo13896e());
        return m2240g == null ? mo13896e() : m2240g;
    }

    /* renamed from: D */
    public abstract Collection<InterfaceC11989u0> mo15803D(C11638f c11638f);

    /* renamed from: r */
    public final Constructor<?> m15875r(String desc) {
        C9612q.m13917h(desc, "desc");
        return m15880I(mo13896e(), m15884E(desc));
    }

    /* renamed from: s */
    public final Constructor<?> m15874s(String desc) {
        C9612q.m13917h(desc, "desc");
        Class<?> mo13896e = mo13896e();
        ArrayList arrayList = new ArrayList();
        m15876q(arrayList, desc, true);
        Unit unit = Unit.f25302a;
        return m15880I(mo13896e, arrayList);
    }

    /* renamed from: t */
    public final Method m15873t(String name, String desc, boolean z) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(desc, "desc");
        if (C9612q.m13922c(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(mo13896e());
        }
        m15876q(arrayList, desc, false);
        Class<?> mo15804C = mo15804C();
        return m15882G(mo15804C, name + "$default", (Class[]) arrayList.toArray(new Class[0]), m15883F(desc), z);
    }

    /* renamed from: u */
    public final InterfaceC11998y m15872u(String name, String signature) {
        Collection<InterfaceC11998y> mo15800z;
        Object m14033q0;
        String m14046d0;
        String str;
        C9612q.m13917h(name, "name");
        C9612q.m13917h(signature, "signature");
        if (C9612q.m13922c(name, "<init>")) {
            mo15800z = C9553r.m14075C0(mo15801y());
        } else {
            C11638f m7422f = C11638f.m7422f(name);
            C9612q.m13918g(m7422f, "identifier(name)");
            mo15800z = mo15800z(m7422f);
        }
        Collection<InterfaceC11998y> collection = mo15800z;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (C9612q.m13922c(C9321m0.f24422a.m15890g((InterfaceC11998y) obj).mo15974a(), signature)) {
                arrayList.add(obj);
            }
        }
        boolean z = true;
        if (arrayList.size() != 1) {
            m14046d0 = C9553r.m14046d0(collection, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, C9332d.f24436j, 30, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Function '");
            sb2.append(name);
            sb2.append("' (JVM signature: ");
            sb2.append(signature);
            sb2.append(") not resolved in ");
            sb2.append(this);
            sb2.append(':');
            if (m14046d0.length() != 0) {
                z = false;
            }
            if (z) {
                str = " no members found";
            } else {
                str = '\n' + m14046d0;
            }
            sb2.append(str);
            throw new C9258h0(sb2.toString());
        }
        m14033q0 = C9553r.m14033q0(arrayList);
        return (InterfaceC11998y) m14033q0;
    }

    /* renamed from: v */
    public final Method m15871v(String name, String desc) {
        Method m15882G;
        C9612q.m13917h(name, "name");
        C9612q.m13917h(desc, "desc");
        if (C9612q.m13922c(name, "<init>")) {
            return null;
        }
        Class<?>[] clsArr = (Class[]) m15884E(desc).toArray(new Class[0]);
        Class<?> m15883F = m15883F(desc);
        Method m15882G2 = m15882G(mo15804C(), name, clsArr, m15883F, false);
        if (m15882G2 != null) {
            return m15882G2;
        }
        if (!mo15804C().isInterface() || (m15882G = m15882G(Object.class, name, clsArr, m15883F, false)) == null) {
            return null;
        }
        return m15882G;
    }

    /* renamed from: w */
    public final InterfaceC11989u0 m15870w(String name, String signature) {
        Object m14033q0;
        SortedMap m6755g;
        Object m14045e0;
        String m14046d0;
        String str;
        Object m14056T;
        C9612q.m13917h(name, "name");
        C9612q.m13917h(signature, "signature");
        MatchResult m13869f = f24428l.m13869f(signature);
        boolean z = true;
        if (m13869f != null) {
            String str2 = m13869f.mo3926a().m13875a().mo3925b().get(1);
            InterfaceC11989u0 mo15805A = mo15805A(Integer.parseInt(str2));
            if (mo15805A != null) {
                return mo15805A;
            }
            throw new C9258h0("Local property #" + str2 + " not found in " + mo13896e());
        }
        C11638f m7422f = C11638f.m7422f(name);
        C9612q.m13918g(m7422f, "identifier(name)");
        Collection<InterfaceC11989u0> mo15803D = mo15803D(m7422f);
        ArrayList arrayList = new ArrayList();
        for (Object obj : mo15803D) {
            if (C9612q.m13922c(C9321m0.f24422a.m15891f((InterfaceC11989u0) obj).mo15953a(), signature)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            if (arrayList.size() != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    AbstractC11988u visibility = ((InterfaceC11989u0) obj2).getVisibility();
                    Object obj3 = linkedHashMap.get(visibility);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(visibility, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                m6755g = C11888u.m6755g(linkedHashMap, new C9325o(C9334f.f24438j));
                Collection values = m6755g.values();
                C9612q.m13918g(values, "properties\n             …\n                }.values");
                m14045e0 = C9553r.m14045e0(values);
                List mostVisibleProperties = (List) m14045e0;
                if (mostVisibleProperties.size() == 1) {
                    C9612q.m13918g(mostVisibleProperties, "mostVisibleProperties");
                    m14056T = C9553r.m14056T(mostVisibleProperties);
                    return (InterfaceC11989u0) m14056T;
                }
                C11638f m7422f2 = C11638f.m7422f(name);
                C9612q.m13918g(m7422f2, "identifier(name)");
                m14046d0 = C9553r.m14046d0(mo15803D(m7422f2), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, C9333e.f24437j, 30, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Property '");
                sb2.append(name);
                sb2.append("' (JVM signature: ");
                sb2.append(signature);
                sb2.append(") not resolved in ");
                sb2.append(this);
                sb2.append(':');
                if (m14046d0.length() != 0) {
                    z = false;
                }
                if (z) {
                    str = " no members found";
                } else {
                    str = '\n' + m14046d0;
                }
                sb2.append(str);
                throw new C9258h0(sb2.toString());
            }
            m14033q0 = C9553r.m14033q0(arrayList);
            return (InterfaceC11989u0) m14033q0;
        }
        throw new C9258h0("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + this);
    }

    /* renamed from: y */
    public abstract Collection<InterfaceC11944l> mo15801y();

    /* renamed from: z */
    public abstract Collection<InterfaceC11998y> mo15800z(C11638f c11638f);
}