package dj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC9935b;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.C9960c;
import kotlinx.serialization.json.InterfaceC9974j;
import kotlinx.serialization.json.Json;
import p045cj.AbstractC2561b;
import p088ej.AbstractC6257c;
import p470zi.C14275d;
import p470zi.InterfaceC14279h;

@Metadata(m14358d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00105\u001a\u000201\u0012\u0006\u00108\u001a\u000206\u0012\u0010\u0010;\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u000109¢\u0006\u0004\bH\u0010IB1\b\u0010\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u00105\u001a\u000201\u0012\u0006\u00108\u001a\u000206\u0012\u000e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000109¢\u0006\u0004\bH\u0010LJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016J+\u0010\u000f\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016JA\u0010\u0016\u001a\u00020\u0005\"\b\b\u0000\u0010\u000b*\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u001eH\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020!H\u0016J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020#H\u0016J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020%H\u0016J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020'H\u0016J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020)H\u0016J\u0018\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00105\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00107R\u001e\u0010;\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010:R\u001a\u0010@\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b.\u0010?R\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010BR\u0016\u0010E\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010F¨\u0006M"}, m14357d2 = {"Ldj/o0;", "Lkotlinx/serialization/json/j;", "Lkotlinx/serialization/encoding/b;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "I", "", "index", "", "z", "T", "Lzi/h;", "serializer", "value", "h", "(Lzi/h;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "b", "c", "G", "", "E", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILzi/h;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Encoder;", "l", "o", "r", "", "g", "", "q", "A", "", "m", "", "t", "", "f", "", "u", "", "F", "enumDescriptor", "k", "Ldj/h;", "a", "Ldj/h;", "composer", "Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/Json;", "d", "()Lkotlinx/serialization/json/Json;", "json", "Ldj/t0;", "Ldj/t0;", "mode", "", "[Lkotlinx/serialization/json/j;", "modeReuseCache", "Lej/c;", "e", "Lej/c;", "()Lej/c;", "serializersModule", "Lkotlinx/serialization/json/c;", "Lkotlinx/serialization/json/c;", "configuration", "Z", "forceQuoting", "Ljava/lang/String;", "polymorphicDiscriminator", "<init>", "(Ldj/h;Lkotlinx/serialization/json/Json;Ldj/t0;[Lkotlinx/serialization/json/j;)V", "Ldj/k0;", "output", "(Ldj/k0;Lkotlinx/serialization/json/Json;Ldj/t0;[Lkotlinx/serialization/json/j;)V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.o0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6007o0 extends AbstractC9935b implements InterfaceC9974j {

    /* renamed from: a */
    private final C5988h f17069a;

    /* renamed from: b */
    private final Json f17070b;

    /* renamed from: c */
    private final EnumC6018t0 f17071c;

    /* renamed from: d */
    private final InterfaceC9974j[] f17072d;

    /* renamed from: e */
    private final AbstractC6257c f17073e;

    /* renamed from: f */
    private final C9960c f17074f;

    /* renamed from: g */
    private boolean f17075g;

    /* renamed from: h */
    private String f17076h;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: dj.o0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C6008a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17077a;

        static {
            int[] iArr = new int[EnumC6018t0.values().length];
            try {
                iArr[EnumC6018t0.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6018t0.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6018t0.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17077a = iArr;
        }
    }

    public C6007o0(C5988h composer, Json json, EnumC6018t0 mode, InterfaceC9974j[] interfaceC9974jArr) {
        C9612q.m13917h(composer, "composer");
        C9612q.m13917h(json, "json");
        C9612q.m13917h(mode, "mode");
        this.f17069a = composer;
        this.f17070b = json;
        this.f17071c = mode;
        this.f17072d = interfaceC9974jArr;
        this.f17073e = mo12705d().mo265a();
        this.f17074f = mo12705d().m12780e();
        int ordinal = mode.ordinal();
        if (interfaceC9974jArr != null) {
            InterfaceC9974j interfaceC9974j = interfaceC9974jArr[ordinal];
            if (interfaceC9974j == null && interfaceC9974j == this) {
                return;
            }
            interfaceC9974jArr[ordinal] = this;
        }
    }

    /* renamed from: I */
    private final void m23897I(SerialDescriptor serialDescriptor) {
        this.f17069a.mo23878c();
        String str = this.f17076h;
        C9612q.m13920e(str);
        mo12903F(str);
        this.f17069a.m23946e(':');
        this.f17069a.mo23877o();
        mo12903F(serialDescriptor.mo12682i());
    }

    @Override // kotlinx.serialization.encoding.AbstractC9935b, kotlinx.serialization.encoding.Encoder
    /* renamed from: A */
    public void mo12908A(int i) {
        if (this.f17075g) {
            mo12903F(String.valueOf(i));
        } else {
            this.f17069a.mo23892h(i);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC9935b, kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: E */
    public <T> void mo12904E(SerialDescriptor descriptor, int i, InterfaceC14279h<? super T> serializer, T t) {
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(serializer, "serializer");
        if (t != null || this.f17074f.m12752f()) {
            super.mo12904E(descriptor, i, serializer, t);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC9935b, kotlinx.serialization.encoding.Encoder
    /* renamed from: F */
    public void mo12903F(String value) {
        C9612q.m13917h(value, "value");
        this.f17069a.mo23939m(value);
    }

    @Override // kotlinx.serialization.encoding.AbstractC9935b
    /* renamed from: G */
    public boolean mo12902G(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        int i2 = C6008a.f17077a[this.f17071c.ordinal()];
        if (i2 != 1) {
            boolean z = false;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (!this.f17069a.m23947a()) {
                        this.f17069a.m23946e(',');
                    }
                    this.f17069a.mo23878c();
                    mo12903F(C5975b0.m24000f(descriptor, mo12705d(), i));
                    this.f17069a.m23946e(':');
                    this.f17069a.mo23877o();
                } else {
                    if (i == 0) {
                        this.f17075g = true;
                    }
                    if (i == 1) {
                        this.f17069a.m23946e(',');
                        this.f17069a.mo23877o();
                        this.f17075g = false;
                    }
                }
            } else if (!this.f17069a.m23947a()) {
                if (i % 2 == 0) {
                    this.f17069a.m23946e(',');
                    this.f17069a.mo23878c();
                    z = true;
                } else {
                    this.f17069a.m23946e(':');
                    this.f17069a.mo23877o();
                }
                this.f17075g = z;
            } else {
                this.f17075g = true;
                this.f17069a.mo23878c();
            }
        } else {
            if (!this.f17069a.m23947a()) {
                this.f17069a.m23946e(',');
            }
            this.f17069a.mo23878c();
        }
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: a */
    public AbstractC6257c mo12932a() {
        return this.f17073e;
    }

    @Override // kotlinx.serialization.encoding.AbstractC9935b, kotlinx.serialization.encoding.Encoder
    /* renamed from: b */
    public CompositeEncoder mo12900b(SerialDescriptor descriptor) {
        InterfaceC9974j interfaceC9974j;
        C9612q.m13917h(descriptor, "descriptor");
        EnumC6018t0 m23861b = C6021u0.m23861b(mo12705d(), descriptor);
        char c = m23861b.f17090j;
        if (c != 0) {
            this.f17069a.m23946e(c);
            this.f17069a.mo23879b();
        }
        if (this.f17076h != null) {
            m23897I(descriptor);
            this.f17076h = null;
        }
        if (this.f17071c == m23861b) {
            return this;
        }
        InterfaceC9974j[] interfaceC9974jArr = this.f17072d;
        if (interfaceC9974jArr == null || (interfaceC9974j = interfaceC9974jArr[m23861b.ordinal()]) == null) {
            return new C6007o0(this.f17069a, mo12705d(), m23861b, this.f17072d);
        }
        return interfaceC9974j;
    }

    @Override // kotlinx.serialization.encoding.AbstractC9935b, kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: c */
    public void mo12899c(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        if (this.f17071c.f17091k != 0) {
            this.f17069a.mo23876p();
            this.f17069a.mo23878c();
            this.f17069a.m23946e(this.f17071c.f17091k);
        }
    }

    @Override // kotlinx.serialization.json.InterfaceC9974j
    /* renamed from: d */
    public Json mo12705d() {
        return this.f17070b;
    }

    @Override // kotlinx.serialization.encoding.AbstractC9935b, kotlinx.serialization.encoding.Encoder
    /* renamed from: f */
    public void mo12897f(double d) {
        boolean z;
        if (this.f17075g) {
            mo12903F(String.valueOf(d));
        } else {
            this.f17069a.m23945f(d);
        }
        if (!this.f17074f.m12757a()) {
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw C5973a0.m24016b(Double.valueOf(d), this.f17069a.f17034a.toString());
            }
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC9935b, kotlinx.serialization.encoding.Encoder
    /* renamed from: g */
    public void mo12896g(byte b) {
        if (this.f17075g) {
            mo12903F(String.valueOf((int) b));
        } else {
            this.f17069a.mo23893d(b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.AbstractC9935b, kotlinx.serialization.encoding.Encoder
    /* renamed from: h */
    public <T> void mo12895h(InterfaceC14279h<? super T> serializer, T t) {
        C9612q.m13917h(serializer, "serializer");
        if ((serializer instanceof AbstractC2561b) && !mo12705d().m12780e().m12746l()) {
            AbstractC2561b abstractC2561b = (AbstractC2561b) serializer;
            String m23915c = C5999l0.m23915c(serializer.getDescriptor(), mo12705d());
            C9612q.m13919f(t, "null cannot be cast to non-null type kotlin.Any");
            InterfaceC14279h m266b = C14275d.m266b(abstractC2561b, this, t);
            C5999l0.m23912f(abstractC2561b, m266b, m23915c);
            C5999l0.m23916b(m266b.getDescriptor().mo12684g());
            this.f17076h = m23915c;
            m266b.serialize(this, t);
            return;
        }
        serializer.serialize(this, t);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: k */
    public void mo12931k(SerialDescriptor enumDescriptor, int i) {
        C9612q.m13917h(enumDescriptor, "enumDescriptor");
        mo12903F(enumDescriptor.mo12686e(i));
    }

    @Override // kotlinx.serialization.encoding.AbstractC9935b, kotlinx.serialization.encoding.Encoder
    /* renamed from: l */
    public Encoder mo12892l(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        if (C6010p0.m23894b(descriptor)) {
            C5988h c5988h = this.f17069a;
            if (!(c5988h instanceof C6011q)) {
                c5988h = new C6011q(c5988h.f17034a, this.f17075g);
            }
            return new C6007o0(c5988h, mo12705d(), this.f17071c, (InterfaceC9974j[]) null);
        } else if (C6010p0.m23895a(descriptor)) {
            C5988h c5988h2 = this.f17069a;
            if (!(c5988h2 instanceof C5990i)) {
                c5988h2 = new C5990i(c5988h2.f17034a, this.f17075g);
            }
            return new C6007o0(c5988h2, mo12705d(), this.f17071c, (InterfaceC9974j[]) null);
        } else {
            return super.mo12892l(descriptor);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC9935b, kotlinx.serialization.encoding.Encoder
    /* renamed from: m */
    public void mo12891m(long j) {
        if (this.f17075g) {
            mo12903F(String.valueOf(j));
        } else {
            this.f17069a.mo23891i(j);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: o */
    public void mo12930o() {
        this.f17069a.m23943j("null");
    }

    @Override // kotlinx.serialization.encoding.AbstractC9935b, kotlinx.serialization.encoding.Encoder
    /* renamed from: q */
    public void mo12888q(short s) {
        if (this.f17075g) {
            mo12903F(String.valueOf((int) s));
        } else {
            this.f17069a.mo23890k(s);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC9935b, kotlinx.serialization.encoding.Encoder
    /* renamed from: r */
    public void mo12887r(boolean z) {
        if (this.f17075g) {
            mo12903F(String.valueOf(z));
        } else {
            this.f17069a.m23942l(z);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC9935b, kotlinx.serialization.encoding.Encoder
    /* renamed from: t */
    public void mo12885t(float f) {
        boolean z;
        if (this.f17075g) {
            mo12903F(String.valueOf(f));
        } else {
            this.f17069a.m23944g(f);
        }
        if (!this.f17074f.m12757a()) {
            if (!Float.isInfinite(f) && !Float.isNaN(f)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw C5973a0.m24016b(Float.valueOf(f), this.f17069a.f17034a.toString());
            }
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC9935b, kotlinx.serialization.encoding.Encoder
    /* renamed from: u */
    public void mo12884u(char c) {
        mo12903F(String.valueOf(c));
    }

    @Override // kotlinx.serialization.encoding.AbstractC9935b, kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: z */
    public boolean mo12879z(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return this.f17074f.m12753e();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6007o0(InterfaceC5997k0 output, Json json, EnumC6018t0 mode, InterfaceC9974j[] modeReuseCache) {
        this(C6015s.m23870a(output, json), json, mode, modeReuseCache);
        C9612q.m13917h(output, "output");
        C9612q.m13917h(json, "json");
        C9612q.m13917h(mode, "mode");
        C9612q.m13917h(modeReuseCache, "modeReuseCache");
    }
}
