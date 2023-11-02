package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import p045cj.C2574d1;
import p470zi.InterfaceC14279h;

@Metadata(m14358d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b/\u00100J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0019H\u0016J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u001bH\u0016J\u0010\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nJ\u001e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000eJ\u001e\u0010 \u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0010J\u001e\u0010!\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ\u001e\u0010\"\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0013J\u001e\u0010#\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0015J\u001e\u0010$\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0017J\u001e\u0010%\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0019J\u001e\u0010&\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u001bJ\u0016\u0010'\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bJ;\u0010+\u001a\u00020\u0006\"\u0004\b\u0000\u0010(2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b+\u0010,JA\u0010.\u001a\u00020\u0006\"\b\b\u0000\u0010(*\u00020-2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b.\u0010,¨\u00061"}, m14357d2 = {"Lkotlinx/serialization/encoding/b;", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "b", "", "c", "", "index", "", "G", "value", "r", "", "g", "", "q", "A", "", "m", "", "t", "", "f", "", "u", "", "F", "l", "x", "p", "B", "w", "D", "s", "C", "n", "y", "e", "T", "Lzi/h;", "serializer", "i", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILzi/h;Ljava/lang/Object;)V", "", "E", "<init>", "()V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.encoding.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC9935b implements Encoder, CompositeEncoder {
    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: A */
    public abstract void mo12908A(int i);

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: B */
    public final void mo12907B(SerialDescriptor descriptor, int i, short s) {
        C9612q.m13917h(descriptor, "descriptor");
        if (mo12902G(descriptor, i)) {
            mo12888q(s);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: C */
    public final void mo12906C(SerialDescriptor descriptor, int i, double d) {
        C9612q.m13917h(descriptor, "descriptor");
        if (mo12902G(descriptor, i)) {
            mo12897f(d);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: D */
    public final void mo12905D(SerialDescriptor descriptor, int i, long j) {
        C9612q.m13917h(descriptor, "descriptor");
        if (mo12902G(descriptor, i)) {
            mo12891m(j);
        }
    }

    /* renamed from: E */
    public <T> void mo12904E(SerialDescriptor descriptor, int i, InterfaceC14279h<? super T> serializer, T t) {
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(serializer, "serializer");
        if (mo12902G(descriptor, i)) {
            m12901H(serializer, t);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: F */
    public abstract void mo12903F(String str);

    /* renamed from: G */
    public boolean mo12902G(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return true;
    }

    /* renamed from: H */
    public <T> void m12901H(InterfaceC14279h<? super T> interfaceC14279h, T t) {
        Encoder.C9933a.m12927c(this, interfaceC14279h, t);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: b */
    public CompositeEncoder mo12900b(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        return this;
    }

    /* renamed from: c */
    public void mo12899c(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: e */
    public final Encoder mo12898e(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        if (mo12902G(descriptor, i)) {
            return mo12892l(descriptor.mo12683h(i));
        }
        return C2574d1.f7031a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: f */
    public abstract void mo12897f(double d);

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: g */
    public abstract void mo12896g(byte b);

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: h */
    public <T> void mo12895h(InterfaceC14279h<? super T> interfaceC14279h, T t) {
        Encoder.C9933a.m12926d(this, interfaceC14279h, t);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: i */
    public <T> void mo12894i(SerialDescriptor descriptor, int i, InterfaceC14279h<? super T> serializer, T t) {
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(serializer, "serializer");
        if (mo12902G(descriptor, i)) {
            mo12895h(serializer, t);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: j */
    public CompositeEncoder mo12893j(SerialDescriptor serialDescriptor, int i) {
        return Encoder.C9933a.m12929a(this, serialDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: l */
    public Encoder mo12892l(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: m */
    public abstract void mo12891m(long j);

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: n */
    public final void mo12890n(SerialDescriptor descriptor, int i, char c) {
        C9612q.m13917h(descriptor, "descriptor");
        if (mo12902G(descriptor, i)) {
            mo12884u(c);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: p */
    public final void mo12889p(SerialDescriptor descriptor, int i, byte b) {
        C9612q.m13917h(descriptor, "descriptor");
        if (mo12902G(descriptor, i)) {
            mo12896g(b);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: q */
    public abstract void mo12888q(short s);

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: r */
    public abstract void mo12887r(boolean z);

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: s */
    public final void mo12886s(SerialDescriptor descriptor, int i, float f) {
        C9612q.m13917h(descriptor, "descriptor");
        if (mo12902G(descriptor, i)) {
            mo12885t(f);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: t */
    public abstract void mo12885t(float f);

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: u */
    public abstract void mo12884u(char c);

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: v */
    public void mo12883v() {
        Encoder.C9933a.m12928b(this);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: w */
    public final void mo12882w(SerialDescriptor descriptor, int i, int i2) {
        C9612q.m13917h(descriptor, "descriptor");
        if (mo12902G(descriptor, i)) {
            mo12908A(i2);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: x */
    public final void mo12881x(SerialDescriptor descriptor, int i, boolean z) {
        C9612q.m13917h(descriptor, "descriptor");
        if (mo12902G(descriptor, i)) {
            mo12887r(z);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: y */
    public final void mo12880y(SerialDescriptor descriptor, int i, String value) {
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(value, "value");
        if (mo12902G(descriptor, i)) {
            mo12903F(value);
        }
    }

    /* renamed from: z */
    public boolean mo12879z(SerialDescriptor serialDescriptor, int i) {
        return CompositeEncoder.C9931a.m12934a(this, serialDescriptor, i);
    }
}