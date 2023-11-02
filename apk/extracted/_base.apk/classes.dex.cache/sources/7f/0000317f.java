package dj;

import bj.AbstractC2342h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC9934a;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import kotlinx.serialization.json.C9960c;
import kotlinx.serialization.json.InterfaceC9962e;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import p045cj.AbstractC2561b;
import p088ej.AbstractC6257c;
import p470zi.C14270a;
import pf.C11568i;

@Metadata(m14358d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001<B1\u0012\u0006\u0010@\u001a\u00020;\u0012\u0006\u0010C\u001a\u00020A\u0012\u0006\u0010F\u001a\u00020D\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010O\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bV\u0010WJ\u0016\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016J#\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010!\u001a\u00020\u0007H\u0016J\n\u0010#\u001a\u0004\u0018\u00010\"H\u0016J=\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00192\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\b\u0010$\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010(\u001a\u00020\u0007H\u0016J\b\u0010*\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020+H\u0016J\b\u0010-\u001a\u00020\u000eH\u0016J\b\u0010/\u001a\u00020.H\u0016J\b\u00101\u001a\u000200H\u0016J\b\u00103\u001a\u000202H\u0016J\b\u00105\u001a\u000204H\u0016J\b\u00106\u001a\u00020\u0005H\u0016J\u0010\u00108\u001a\u0002072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010:\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\tH\u0016R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010BR\u0014\u0010F\u001a\u00020D8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b \u0010ER\u001a\u0010J\u001a\u00020G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010H\u001a\u0004\b<\u0010IR\u0016\u0010L\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010QR\u0016\u0010U\u001a\u0004\u0018\u00010S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010T¨\u0006X"}, m14357d2 = {"Ldj/n0;", "Lkotlinx/serialization/json/e;", "", "Lkotlinx/serialization/encoding/a;", "Ldj/n0$a;", "", "unknownKey", "", "S", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "R", "K", "", "N", "index", "L", "O", "key", "Q", "M", "P", "Lkotlinx/serialization/json/JsonElement;", "g", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "G", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/c;", "b", "c", "D", "", "j", "previousValue", "y", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "o", "w", "", "H", "", "s", "h", "", "l", "", "t", "", "v", "", "x", "z", "Lkotlinx/serialization/encoding/Decoder;", "q", "enumDescriptor", "e", "Lkotlinx/serialization/json/Json;", "a", "Lkotlinx/serialization/json/Json;", "d", "()Lkotlinx/serialization/json/Json;", "json", "Ldj/t0;", "Ldj/t0;", "mode", "Ldj/a;", "Ldj/a;", "lexer", "Lej/c;", "Lej/c;", "()Lej/c;", "serializersModule", "I", "currentIndex", "f", "Ldj/n0$a;", "discriminatorHolder", "Lkotlinx/serialization/json/c;", "Lkotlinx/serialization/json/c;", "configuration", "Ldj/x;", "Ldj/x;", "elementMarker", "<init>", "(Lkotlinx/serialization/json/Json;Ldj/t0;Ldj/a;Lkotlinx/serialization/descriptors/SerialDescriptor;Ldj/n0$a;)V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.n0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C6003n0 extends AbstractC9934a implements InterfaceC9962e {

    /* renamed from: a */
    private final Json f17059a;

    /* renamed from: b */
    private final EnumC6018t0 f17060b;

    /* renamed from: c */
    public final AbstractC5972a f17061c;

    /* renamed from: d */
    private final AbstractC6257c f17062d;

    /* renamed from: e */
    private int f17063e;

    /* renamed from: f */
    private C6004a f17064f;

    /* renamed from: g */
    private final C9960c f17065g;

    /* renamed from: h */
    private final C6024x f17066h;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m14357d2 = {"Ldj/n0$a;", "", "", "a", "Ljava/lang/String;", "discriminatorToSkip", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: dj.n0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C6004a {

        /* renamed from: a */
        public String f17067a;

        public C6004a(String str) {
            this.f17067a = str;
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: dj.n0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C6005b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17068a;

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
            try {
                iArr[EnumC6018t0.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f17068a = iArr;
        }
    }

    public C6003n0(Json json, EnumC6018t0 mode, AbstractC5972a lexer, SerialDescriptor descriptor, C6004a c6004a) {
        C6024x c6024x;
        C9612q.m13917h(json, "json");
        C9612q.m13917h(mode, "mode");
        C9612q.m13917h(lexer, "lexer");
        C9612q.m13917h(descriptor, "descriptor");
        this.f17059a = json;
        this.f17060b = mode;
        this.f17061c = lexer;
        this.f17062d = json.mo265a();
        this.f17063e = -1;
        this.f17064f = c6004a;
        C9960c m12780e = json.m12780e();
        this.f17065g = m12780e;
        if (m12780e.m12752f()) {
            c6024x = null;
        } else {
            c6024x = new C6024x(descriptor);
        }
        this.f17066h = c6024x;
    }

    /* renamed from: K */
    private final void m23907K() {
        if (this.f17061c.m24047E() != 4) {
            return;
        }
        AbstractC5972a.m24019y(this.f17061c, "Unexpected leading comma", 0, null, 6, null);
        throw new C11568i();
    }

    /* renamed from: L */
    private final boolean m23906L(SerialDescriptor serialDescriptor, int i) {
        String m24046F;
        Json json = this.f17059a;
        SerialDescriptor mo12683h = serialDescriptor.mo12683h(i);
        if (!mo12683h.mo12689b() && this.f17061c.m24042M(true)) {
            return true;
        }
        if (!C9612q.m13922c(mo12683h.mo12684g(), AbstractC2342h.C2344b.f6454a) || ((mo12683h.mo12689b() && this.f17061c.m24042M(false)) || (m24046F = this.f17061c.m24046F(this.f17065g.m12745m())) == null || C5975b0.m23999g(mo12683h, json, m24046F) != -3)) {
            return false;
        }
        this.f17061c.m24027q();
        return true;
    }

    /* renamed from: M */
    private final int m23905M() {
        boolean mo23886L = this.f17061c.mo23886L();
        if (this.f17061c.mo23884f()) {
            int i = this.f17063e;
            if (i != -1 && !mo23886L) {
                AbstractC5972a.m24019y(this.f17061c, "Expected end of the array or comma", 0, null, 6, null);
                throw new C11568i();
            }
            int i2 = i + 1;
            this.f17063e = i2;
            return i2;
        } else if (!mo23886L) {
            return -1;
        } else {
            AbstractC5972a.m24019y(this.f17061c, "Unexpected trailing comma", 0, null, 6, null);
            throw new C11568i();
        }
    }

    /* renamed from: N */
    private final int m23904N() {
        boolean z;
        int i;
        int i2;
        int i3 = this.f17063e;
        boolean z2 = false;
        if (i3 % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i3 != -1) {
                z2 = this.f17061c.mo23886L();
            }
        } else {
            this.f17061c.mo23880o(':');
        }
        if (this.f17061c.mo23884f()) {
            if (z) {
                if (this.f17063e == -1) {
                    AbstractC5972a abstractC5972a = this.f17061c;
                    boolean z3 = !z2;
                    i2 = abstractC5972a.f17004a;
                    if (!z3) {
                        AbstractC5972a.m24019y(abstractC5972a, "Unexpected trailing comma", i2, null, 4, null);
                        throw new C11568i();
                    }
                } else {
                    AbstractC5972a abstractC5972a2 = this.f17061c;
                    i = abstractC5972a2.f17004a;
                    if (!z2) {
                        AbstractC5972a.m24019y(abstractC5972a2, "Expected comma after the key-value pair", i, null, 4, null);
                        throw new C11568i();
                    }
                }
            }
            int i4 = this.f17063e + 1;
            this.f17063e = i4;
            return i4;
        } else if (!z2) {
            return -1;
        } else {
            AbstractC5972a.m24019y(this.f17061c, "Expected '}', but had ',' instead", 0, null, 6, null);
            throw new C11568i();
        }
    }

    /* renamed from: O */
    private final int m23903O(SerialDescriptor serialDescriptor) {
        boolean z;
        boolean mo23886L = this.f17061c.mo23886L();
        while (this.f17061c.mo23884f()) {
            String m23902P = m23902P();
            this.f17061c.mo23880o(':');
            int m23999g = C5975b0.m23999g(serialDescriptor, this.f17059a, m23902P);
            boolean z2 = false;
            if (m23999g != -3) {
                if (this.f17065g.m12754d() && m23906L(serialDescriptor, m23999g)) {
                    z = this.f17061c.mo23886L();
                } else {
                    C6024x c6024x = this.f17066h;
                    if (c6024x != null) {
                        c6024x.m23858c(m23999g);
                    }
                    return m23999g;
                }
            } else {
                z2 = true;
                z = false;
            }
            if (z2) {
                mo23886L = m23901Q(m23902P);
            } else {
                mo23886L = z;
            }
        }
        if (!mo23886L) {
            C6024x c6024x2 = this.f17066h;
            if (c6024x2 != null) {
                return c6024x2.m23857d();
            }
            return -1;
        }
        AbstractC5972a.m24019y(this.f17061c, "Unexpected trailing comma", 0, null, 6, null);
        throw new C11568i();
    }

    /* renamed from: P */
    private final String m23902P() {
        if (this.f17065g.m12745m()) {
            return this.f17061c.m24024t();
        }
        return this.f17061c.mo23883k();
    }

    /* renamed from: Q */
    private final boolean m23901Q(String str) {
        if (!this.f17065g.m12751g() && !m23899S(this.f17064f, str)) {
            this.f17061c.m24050A(str);
        } else {
            this.f17061c.m24045H(this.f17065g.m12745m());
        }
        return this.f17061c.mo23886L();
    }

    /* renamed from: R */
    private final void m23900R(SerialDescriptor serialDescriptor) {
        do {
        } while (mo12866o(serialDescriptor) != -1);
    }

    /* renamed from: S */
    private final boolean m23899S(C6004a c6004a, String str) {
        if (c6004a == null || !C9612q.m13922c(c6004a.f17067a, str)) {
            return false;
        }
        c6004a.f17067a = null;
        return true;
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.Decoder
    /* renamed from: D */
    public boolean mo12925D() {
        C6024x c6024x = this.f17066h;
        return ((c6024x != null ? c6024x.m23859b() : false) || AbstractC5972a.m24041N(this.f17061c, false, 1, null)) ? false : true;
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.Decoder
    /* renamed from: G */
    public <T> T mo12924G(DeserializationStrategy<? extends T> deserializer) {
        DeserializationStrategy<T> deserializationStrategy;
        C9612q.m13917h(deserializer, "deserializer");
        try {
            if ((deserializer instanceof AbstractC2561b) && !this.f17059a.m12780e().m12746l()) {
                String m23915c = C5999l0.m23915c(deserializer.getDescriptor(), this.f17059a);
                String mo23882l = this.f17061c.mo23882l(m23915c, this.f17065g.m12745m());
                if (mo23882l != null) {
                    deserializationStrategy = ((AbstractC2561b) deserializer).mo12947c(this, mo23882l);
                } else {
                    deserializationStrategy = null;
                }
                if (deserializationStrategy == null) {
                    return (T) C5999l0.m23914d(this, deserializer);
                }
                this.f17064f = new C6004a(m23915c);
                return deserializationStrategy.deserialize(this);
            }
            return deserializer.deserialize(this);
        } catch (C14270a e) {
            List<String> m272a = e.m272a();
            throw new C14270a(m272a, e.getMessage() + " at path: " + this.f17061c.f17005b.m23973a(), e);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.Decoder
    /* renamed from: H */
    public byte mo12923H() {
        long m24028p = this.f17061c.m24028p();
        byte b = (byte) m24028p;
        if (m24028p == b) {
            return b;
        }
        AbstractC5972a abstractC5972a = this.f17061c;
        AbstractC5972a.m24019y(abstractC5972a, "Failed to parse byte for input '" + m24028p + '\'', 0, null, 6, null);
        throw new C11568i();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: a */
    public AbstractC6257c mo12873a() {
        return this.f17062d;
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.Decoder
    /* renamed from: b */
    public InterfaceC9936c mo12920b(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        EnumC6018t0 m23861b = C6021u0.m23861b(this.f17059a, descriptor);
        this.f17061c.f17005b.m23971c(descriptor);
        this.f17061c.mo23880o(m23861b.f17090j);
        m23907K();
        int i = C6005b.f17068a[m23861b.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (this.f17060b == m23861b && this.f17059a.m12780e().m12752f()) {
                return this;
            }
            return new C6003n0(this.f17059a, m23861b, this.f17061c, descriptor, this.f17064f);
        }
        return new C6003n0(this.f17059a, m23861b, this.f17061c, descriptor, this.f17064f);
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: c */
    public void mo12872c(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        if (this.f17059a.m12780e().m12751g() && descriptor.mo12687d() == 0) {
            m23900R(descriptor);
        }
        this.f17061c.mo23880o(this.f17060b.f17091k);
        this.f17061c.f17005b.m23972b();
    }

    @Override // kotlinx.serialization.json.InterfaceC9962e
    /* renamed from: d */
    public final Json mo12744d() {
        return this.f17059a;
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.Decoder
    /* renamed from: e */
    public int mo12919e(SerialDescriptor enumDescriptor) {
        C9612q.m13917h(enumDescriptor, "enumDescriptor");
        Json json = this.f17059a;
        String mo12909z = mo12909z();
        return C5975b0.m23997i(enumDescriptor, json, mo12909z, " at path " + this.f17061c.f17005b.m23973a());
    }

    @Override // kotlinx.serialization.json.InterfaceC9962e
    /* renamed from: g */
    public JsonElement mo12743g() {
        return new C5993j0(this.f17059a.m12780e(), this.f17061c).m23929e();
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.Decoder
    /* renamed from: h */
    public int mo12918h() {
        long m24028p = this.f17061c.m24028p();
        int i = (int) m24028p;
        if (m24028p == i) {
            return i;
        }
        AbstractC5972a abstractC5972a = this.f17061c;
        AbstractC5972a.m24019y(abstractC5972a, "Failed to parse int for input '" + m24028p + '\'', 0, null, 6, null);
        throw new C11568i();
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.Decoder
    /* renamed from: j */
    public Void mo12917j() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.Decoder
    /* renamed from: l */
    public long mo12916l() {
        return this.f17061c.m24028p();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: o */
    public int mo12866o(SerialDescriptor descriptor) {
        int m23904N;
        C9612q.m13917h(descriptor, "descriptor");
        int i = C6005b.f17068a[this.f17060b.ordinal()];
        if (i != 2) {
            if (i != 4) {
                m23904N = m23905M();
            } else {
                m23904N = m23903O(descriptor);
            }
        } else {
            m23904N = m23904N();
        }
        if (this.f17060b != EnumC6018t0.MAP) {
            this.f17061c.f17005b.m23967g(m23904N);
        }
        return m23904N;
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.Decoder
    /* renamed from: q */
    public Decoder mo12915q(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        if (C6010p0.m23894b(descriptor)) {
            return new C6022v(this.f17061c, this.f17059a);
        }
        return super.mo12915q(descriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.Decoder
    /* renamed from: s */
    public short mo12914s() {
        long m24028p = this.f17061c.m24028p();
        short s = (short) m24028p;
        if (m24028p == s) {
            return s;
        }
        AbstractC5972a abstractC5972a = this.f17061c;
        AbstractC5972a.m24019y(abstractC5972a, "Failed to parse short for input '" + m24028p + '\'', 0, null, 6, null);
        throw new C11568i();
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.Decoder
    /* renamed from: t */
    public float mo12913t() {
        boolean z;
        AbstractC5972a abstractC5972a = this.f17061c;
        String m24025s = abstractC5972a.m24025s();
        try {
            float parseFloat = Float.parseFloat(m24025s);
            if (!this.f17059a.m12780e().m12757a()) {
                if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C5973a0.m24009i(this.f17061c, Float.valueOf(parseFloat));
                    throw new C11568i();
                }
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            AbstractC5972a.m24019y(abstractC5972a, "Failed to parse type 'float' for input '" + m24025s + '\'', 0, null, 6, null);
            throw new C11568i();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.Decoder
    /* renamed from: v */
    public double mo12912v() {
        boolean z;
        AbstractC5972a abstractC5972a = this.f17061c;
        String m24025s = abstractC5972a.m24025s();
        try {
            double parseDouble = Double.parseDouble(m24025s);
            if (!this.f17059a.m12780e().m12757a()) {
                if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C5973a0.m24009i(this.f17061c, Double.valueOf(parseDouble));
                    throw new C11568i();
                }
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            AbstractC5972a.m24019y(abstractC5972a, "Failed to parse type 'double' for input '" + m24025s + '\'', 0, null, 6, null);
            throw new C11568i();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.Decoder
    /* renamed from: w */
    public boolean mo12911w() {
        if (this.f17065g.m12745m()) {
            return this.f17061c.m24031i();
        }
        return this.f17061c.m24033g();
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.Decoder
    /* renamed from: x */
    public char mo12910x() {
        String m24025s = this.f17061c.m24025s();
        if (m24025s.length() == 1) {
            return m24025s.charAt(0);
        }
        AbstractC5972a abstractC5972a = this.f17061c;
        AbstractC5972a.m24019y(abstractC5972a, "Expected single char, but got '" + m24025s + '\'', 0, null, 6, null);
        throw new C11568i();
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: y */
    public <T> T mo12862y(SerialDescriptor descriptor, int i, DeserializationStrategy<? extends T> deserializer, T t) {
        boolean z;
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(deserializer, "deserializer");
        if (this.f17060b == EnumC6018t0.MAP && (i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f17061c.f17005b.m23970d();
        }
        T t2 = (T) super.mo12862y(descriptor, i, deserializer, t);
        if (z) {
            this.f17061c.f17005b.m23968f(t2);
        }
        return t2;
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.Decoder
    /* renamed from: z */
    public String mo12909z() {
        if (this.f17065g.m12745m()) {
            return this.f17061c.m24024t();
        }
        return this.f17061c.m24027q();
    }
}