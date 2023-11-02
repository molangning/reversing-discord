package kg;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import kg.C9271j0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import p140hg.InterfaceC7135f;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11971r0;
import p305qg.InterfaceC11997x0;
import p429xh.C13801c;
import ph.C11638f;

@Metadata(m14358d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001b01¢\u0006\u0004\b3\u00104J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001b\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR!\u0010%\u001a\b\u0012\u0004\u0012\u00020!0 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010$R\u0016\u0010(\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010-R\u0014\u00100\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-¨\u00065"}, m14357d2 = {"Lkg/w;", "Lhg/f;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lkg/l;", "j", "Lkg/l;", "m", "()Lkg/l;", "callable", "k", "I", "p", "()I", "index", "Lhg/f$a;", "l", "Lhg/f$a;", "g", "()Lhg/f$a;", "kind", "Lqg/r0;", "Lkg/j0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor", "", "", "n", "getAnnotations", "()Ljava/util/List;", "annotations", "getName", "()Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_NAME, "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "type", "()Z", "isOptional", "a", "isVararg", "Lkotlin/Function0;", "computeDescriptor", "<init>", "(Lkg/l;ILhg/f$a;Lkotlin/jvm/functions/Function0;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C9361w implements InterfaceC7135f {

    /* renamed from: o */
    static final /* synthetic */ KProperty<Object>[] f24482o = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9361w.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9361w.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: j */
    private final AbstractC9282l<?> f24483j;

    /* renamed from: k */
    private final int f24484k;

    /* renamed from: l */
    private final InterfaceC7135f.EnumC7136a f24485l;

    /* renamed from: m */
    private final C9271j0.C9272a f24486m;

    /* renamed from: n */
    private final C9271j0.C9272a f24487n;

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: kg.w$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C9362a extends AbstractC9614s implements Function0<List<? extends Annotation>> {
        C9362a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Annotation> invoke() {
            return C9336p0.m15855e(C9361w.this.m15782o());
        }
    }

    @Metadata(m14358d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m14357d2 = {"Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.w$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C9363b extends AbstractC9614s implements Function0<Type> {
        C9363b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Type invoke() {
            InterfaceC11971r0 m15782o = C9361w.this.m15782o();
            if ((m15782o instanceof InterfaceC11997x0) && C9612q.m13922c(C9336p0.m15851i(C9361w.this.m15784m().mo15826x()), m15782o) && C9361w.this.m15784m().mo15826x().mo4305g() == InterfaceC11902b.EnumC11903a.FAKE_OVERRIDE) {
                InterfaceC11947m mo4163b = C9361w.this.m15784m().mo15826x().mo4163b();
                C9612q.m13919f(mo4163b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Class<?> m15844p = C9336p0.m15844p((InterfaceC11914e) mo4163b);
                if (m15844p == null) {
                    throw new C9258h0("Cannot determine receiver Java type of inherited declaration: " + m15782o);
                }
                return m15844p;
            }
            return C9361w.this.m15784m().mo15829u().mo12139a().get(C9361w.this.m15781p());
        }
    }

    public C9361w(AbstractC9282l<?> callable, int i, InterfaceC7135f.EnumC7136a kind, Function0<? extends InterfaceC11971r0> computeDescriptor) {
        C9612q.m13917h(callable, "callable");
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(computeDescriptor, "computeDescriptor");
        this.f24483j = callable;
        this.f24484k = i;
        this.f24485l = kind;
        this.f24486m = C9271j0.m15968d(computeDescriptor);
        this.f24487n = C9271j0.m15968d(new C9362a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final InterfaceC11971r0 m15782o() {
        T m15964b = this.f24486m.m15964b(this, f24482o[0]);
        C9612q.m13918g(m15964b, "<get-descriptor>(...)");
        return (InterfaceC11971r0) m15964b;
    }

    @Override // p140hg.InterfaceC7135f
    /* renamed from: a */
    public boolean mo15787a() {
        InterfaceC11971r0 m15782o = m15782o();
        return (m15782o instanceof InterfaceC11936j1) && ((InterfaceC11936j1) m15782o).mo4373v0() != null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9361w) {
            C9361w c9361w = (C9361w) obj;
            if (C9612q.m13922c(this.f24483j, c9361w.f24483j) && m15781p() == c9361w.m15781p()) {
                return true;
            }
        }
        return false;
    }

    @Override // p140hg.InterfaceC7135f
    /* renamed from: g */
    public InterfaceC7135f.EnumC7136a mo15785g() {
        return this.f24485l;
    }

    @Override // p140hg.InterfaceC7135f
    public String getName() {
        InterfaceC11936j1 interfaceC11936j1;
        InterfaceC11971r0 m15782o = m15782o();
        if (m15782o instanceof InterfaceC11936j1) {
            interfaceC11936j1 = (InterfaceC11936j1) m15782o;
        } else {
            interfaceC11936j1 = null;
        }
        if (interfaceC11936j1 == null || interfaceC11936j1.mo4163b().mo4307f0()) {
            return null;
        }
        C11638f name = interfaceC11936j1.getName();
        C9612q.m13918g(name, "valueParameter.name");
        if (name.m7421g()) {
            return null;
        }
        return name.m7426b();
    }

    @Override // p140hg.InterfaceC7135f
    public KType getType() {
        AbstractC7264g0 type = m15782o().getType();
        C9612q.m13918g(type, "descriptor.type");
        return new C9245e0(type, new C9363b());
    }

    public int hashCode() {
        return (this.f24483j.hashCode() * 31) + m15781p();
    }

    /* renamed from: m */
    public final AbstractC9282l<?> m15784m() {
        return this.f24483j;
    }

    @Override // p140hg.InterfaceC7135f
    /* renamed from: n */
    public boolean mo15783n() {
        InterfaceC11971r0 m15782o = m15782o();
        InterfaceC11936j1 interfaceC11936j1 = m15782o instanceof InterfaceC11936j1 ? (InterfaceC11936j1) m15782o : null;
        if (interfaceC11936j1 != null) {
            return C13801c.m1512c(interfaceC11936j1);
        }
        return false;
    }

    /* renamed from: p */
    public int m15781p() {
        return this.f24484k;
    }

    public String toString() {
        return C9292l0.f24366a.m15932f(this);
    }
}
