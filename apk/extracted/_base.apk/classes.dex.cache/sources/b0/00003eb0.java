package kg;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p140hg.InterfaceC7135f;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11997x0;
import p305qg.InterfaceC11998y;
import ph.C11638f;
import sh.AbstractC12485c;

@Metadata(m14358d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0007\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001f"}, m14357d2 = {"Lkg/l0;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Lqg/x0;", "receiver", "", "a", "Lqg/a;", "callable", "b", "descriptor", "", "c", "Lqg/u0;", "g", "Lqg/y;", "d", "invoke", "e", "Lkg/w;", "parameter", "f", "Lhi/g0;", "type", "h", "Lsh/c;", "Lsh/c;", "renderer", "<init>", "()V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C9292l0 {

    /* renamed from: a */
    public static final C9292l0 f24366a = new C9292l0();

    /* renamed from: b */
    private static final AbstractC12485c f24367b = AbstractC12485c.f32441g;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: kg.l0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class C9293a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24368a;

        static {
            int[] iArr = new int[InterfaceC7135f.EnumC7136a.values().length];
            try {
                iArr[InterfaceC7135f.EnumC7136a.EXTENSION_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC7135f.EnumC7136a.INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC7135f.EnumC7136a.VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24368a = iArr;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"Lqg/j1;", "kotlin.jvm.PlatformType", "it", "", "a", "(Lqg/j1;)Ljava/lang/CharSequence;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.l0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9294b extends AbstractC9614s implements Function1<InterfaceC11936j1, CharSequence> {

        /* renamed from: j */
        public static final C9294b f24369j = new C9294b();

        C9294b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(InterfaceC11936j1 interfaceC11936j1) {
            C9292l0 c9292l0 = C9292l0.f24366a;
            AbstractC7264g0 type = interfaceC11936j1.getType();
            C9612q.m13918g(type, "it.type");
            return c9292l0.m15930h(type);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"Lqg/j1;", "kotlin.jvm.PlatformType", "it", "", "a", "(Lqg/j1;)Ljava/lang/CharSequence;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.l0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9295c extends AbstractC9614s implements Function1<InterfaceC11936j1, CharSequence> {

        /* renamed from: j */
        public static final C9295c f24370j = new C9295c();

        C9295c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(InterfaceC11936j1 interfaceC11936j1) {
            C9292l0 c9292l0 = C9292l0.f24366a;
            AbstractC7264g0 type = interfaceC11936j1.getType();
            C9612q.m13918g(type, "it.type");
            return c9292l0.m15930h(type);
        }
    }

    private C9292l0() {
    }

    /* renamed from: a */
    private final void m15937a(StringBuilder sb2, InterfaceC11997x0 interfaceC11997x0) {
        if (interfaceC11997x0 != null) {
            AbstractC7264g0 type = interfaceC11997x0.getType();
            C9612q.m13918g(type, "receiver.type");
            sb2.append(m15930h(type));
            sb2.append(".");
        }
    }

    /* renamed from: b */
    private final void m15936b(StringBuilder sb2, InterfaceC11897a interfaceC11897a) {
        boolean z;
        InterfaceC11997x0 m15851i = C9336p0.m15851i(interfaceC11897a);
        InterfaceC11997x0 mo4329M = interfaceC11897a.mo4329M();
        m15937a(sb2, m15851i);
        if (m15851i != null && mo4329M != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb2.append("(");
        }
        m15937a(sb2, mo4329M);
        if (z) {
            sb2.append(")");
        }
    }

    /* renamed from: c */
    private final String m15935c(InterfaceC11897a interfaceC11897a) {
        if (interfaceC11897a instanceof InterfaceC11989u0) {
            return m15931g((InterfaceC11989u0) interfaceC11897a);
        }
        if (interfaceC11897a instanceof InterfaceC11998y) {
            return m15934d((InterfaceC11998y) interfaceC11897a);
        }
        throw new IllegalStateException(("Illegal callable: " + interfaceC11897a).toString());
    }

    /* renamed from: d */
    public final String m15934d(InterfaceC11998y descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        C9292l0 c9292l0 = f24366a;
        c9292l0.m15936b(sb2, descriptor);
        AbstractC12485c abstractC12485c = f24367b;
        C11638f name = descriptor.getName();
        C9612q.m13918g(name, "descriptor.name");
        sb2.append(abstractC12485c.mo5047v(name, true));
        List<InterfaceC11936j1> mo4301i = descriptor.mo4301i();
        C9612q.m13918g(mo4301i, "descriptor.valueParameters");
        C9553r.m14048b0(mo4301i, sb2, ", ", "(", ")", 0, null, C9294b.f24369j, 48, null);
        sb2.append(": ");
        AbstractC7264g0 returnType = descriptor.getReturnType();
        C9612q.m13920e(returnType);
        sb2.append(c9292l0.m15930h(returnType));
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: e */
    public final String m15933e(InterfaceC11998y invoke) {
        C9612q.m13917h(invoke, "invoke");
        StringBuilder sb2 = new StringBuilder();
        C9292l0 c9292l0 = f24366a;
        c9292l0.m15936b(sb2, invoke);
        List<InterfaceC11936j1> mo4301i = invoke.mo4301i();
        C9612q.m13918g(mo4301i, "invoke.valueParameters");
        C9553r.m14048b0(mo4301i, sb2, ", ", "(", ")", 0, null, C9295c.f24370j, 48, null);
        sb2.append(" -> ");
        AbstractC7264g0 returnType = invoke.getReturnType();
        C9612q.m13920e(returnType);
        sb2.append(c9292l0.m15930h(returnType));
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: f */
    public final String m15932f(C9361w parameter) {
        C9612q.m13917h(parameter, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int i = C9293a.f24368a[parameter.mo15785g().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    sb2.append("parameter #" + parameter.m15781p() + ' ' + parameter.getName());
                }
            } else {
                sb2.append("instance parameter");
            }
        } else {
            sb2.append("extension receiver parameter");
        }
        sb2.append(" of ");
        sb2.append(f24366a.m15935c(parameter.m15784m().mo15826x()));
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: g */
    public final String m15931g(InterfaceC11989u0 descriptor) {
        String str;
        C9612q.m13917h(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        if (descriptor.mo4342L()) {
            str = "var ";
        } else {
            str = "val ";
        }
        sb2.append(str);
        C9292l0 c9292l0 = f24366a;
        c9292l0.m15936b(sb2, descriptor);
        AbstractC12485c abstractC12485c = f24367b;
        C11638f name = descriptor.getName();
        C9612q.m13918g(name, "descriptor.name");
        sb2.append(abstractC12485c.mo5047v(name, true));
        sb2.append(": ");
        AbstractC7264g0 type = descriptor.getType();
        C9612q.m13918g(type, "descriptor.type");
        sb2.append(c9292l0.m15930h(type));
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: h */
    public final String m15930h(AbstractC7264g0 type) {
        C9612q.m13917h(type, "type");
        return f24367b.mo5044w(type);
    }
}