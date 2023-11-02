package dj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9660s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC9934a;
import kotlinx.serialization.json.Json;
import p088ej.AbstractC6257c;
import pf.C11568i;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u001a"}, m14357d2 = {"Ldj/v;", "Lkotlinx/serialization/encoding/a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "o", "h", "", "l", "", "H", "", "s", "Ldj/a;", "a", "Ldj/a;", "lexer", "Lej/c;", "b", "Lej/c;", "()Lej/c;", "serializersModule", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Ldj/a;Lkotlinx/serialization/json/Json;)V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6022v extends AbstractC9934a {

    /* renamed from: a */
    private final AbstractC5972a f17093a;

    /* renamed from: b */
    private final AbstractC6257c f17094b;

    public C6022v(AbstractC5972a lexer, Json json) {
        C9612q.m13917h(lexer, "lexer");
        C9612q.m13917h(json, "json");
        this.f17093a = lexer;
        this.f17094b = json.mo265a();
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.Decoder
    /* renamed from: H */
    public byte mo12923H() {
        AbstractC5972a abstractC5972a = this.f17093a;
        String m24025s = abstractC5972a.m24025s();
        try {
            return C9660s.m13672a(m24025s);
        } catch (IllegalArgumentException unused) {
            AbstractC5972a.m24019y(abstractC5972a, "Failed to parse type 'UByte' for input '" + m24025s + '\'', 0, null, 6, null);
            throw new C11568i();
        }
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: a */
    public AbstractC6257c mo12873a() {
        return this.f17094b;
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.Decoder
    /* renamed from: h */
    public int mo12918h() {
        AbstractC5972a abstractC5972a = this.f17093a;
        String m24025s = abstractC5972a.m24025s();
        try {
            return C9660s.m13669d(m24025s);
        } catch (IllegalArgumentException unused) {
            AbstractC5972a.m24019y(abstractC5972a, "Failed to parse type 'UInt' for input '" + m24025s + '\'', 0, null, 6, null);
            throw new C11568i();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.Decoder
    /* renamed from: l */
    public long mo12916l() {
        AbstractC5972a abstractC5972a = this.f17093a;
        String m24025s = abstractC5972a.m24025s();
        try {
            return C9660s.m13666g(m24025s);
        } catch (IllegalArgumentException unused) {
            AbstractC5972a.m24019y(abstractC5972a, "Failed to parse type 'ULong' for input '" + m24025s + '\'', 0, null, 6, null);
            throw new C11568i();
        }
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: o */
    public int mo12866o(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // kotlinx.serialization.encoding.AbstractC9934a, kotlinx.serialization.encoding.Decoder
    /* renamed from: s */
    public short mo12914s() {
        AbstractC5972a abstractC5972a = this.f17093a;
        String m24025s = abstractC5972a.m24025s();
        try {
            return C9660s.m13663j(m24025s);
        } catch (IllegalArgumentException unused) {
            AbstractC5972a.m24019y(abstractC5972a, "Failed to parse type 'UShort' for input '" + m24025s + '\'', 0, null, 6, null);
            throw new C11568i();
        }
    }
}
