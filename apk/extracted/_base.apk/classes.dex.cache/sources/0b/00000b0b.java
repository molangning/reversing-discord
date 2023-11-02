package p045cj;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import p470zi.C14278g;
import p470zi.InterfaceC14279h;

@Metadata(m14358d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\bb\u0010cJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001b\u0010\n\u001a\u00028\u0000*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020 H\u0014¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020#H\u0014¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020+H\u0014¢\u0006\u0004\b,\u0010-J'\u00100\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0006H\u0014¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020\u00022\u0006\u0010\f\u001a\u00028\u00002\u0006\u00102\u001a\u00020\u0004H\u0014¢\u0006\u0004\b3\u00104J\u000e\u00106\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0004J\b\u00107\u001a\u00020\u000fH\u0016J\b\u00108\u001a\u00020\u000fH\u0016J\u000e\u00109\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010:\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0017J\u000e\u0010;\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u001aJ\u000e\u0010<\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010=\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u001dJ\u000e\u0010>\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020 J\u000e\u0010?\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020#J\u000e\u0010@\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020(J\u000e\u0010A\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020+J\u0016\u0010B\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010C\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0004H\u0016J\u000e\u0010D\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u0004J\u0010\u0010E\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u0004H\u0014J\u001e\u0010F\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bJ\u001e\u0010G\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0017J\u001e\u0010H\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001aJ\u001e\u0010I\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u001e\u0010J\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001dJ\u001e\u0010K\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020 J\u001e\u0010L\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020#J\u001e\u0010M\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020(J\u001e\u0010N\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020+J\u0016\u0010O\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J;\u0010R\u001a\u00020\u000f\"\u0004\b\u0001\u0010\u001b2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00010P2\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\bR\u0010SJA\u0010T\u001a\u00020\u000f\"\b\b\u0001\u0010\u001b*\u00020\r2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00010P2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\bT\u0010SJ\u0017\u0010V\u001a\u00020\u000f2\u0006\u0010U\u001a\u00028\u0000H\u0004¢\u0006\u0004\bV\u0010\u0013J\u000f\u0010W\u001a\u00028\u0000H\u0004¢\u0006\u0004\bW\u0010XR$\u0010]\u001a\u0012\u0012\u0004\u0012\u00028\u00000Yj\b\u0012\u0004\u0012\u00028\u0000`Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010_\u001a\u00028\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b^\u0010XR\u0016\u0010a\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b`\u0010X¨\u0006d"}, m14357d2 = {"Lcj/c2;", "Tag", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "desc", "", "index", "", "G", "Z", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/Object;", "tag", "", "value", "", "V", "(Ljava/lang/Object;Ljava/lang/Object;)V", "R", "(Ljava/lang/Object;)V", "S", "P", "(Ljava/lang/Object;I)V", "", "J", "(Ljava/lang/Object;B)V", "", "T", "(Ljava/lang/Object;S)V", "", "Q", "(Ljava/lang/Object;J)V", "", "N", "(Ljava/lang/Object;F)V", "", "L", "(Ljava/lang/Object;D)V", "I", "(Ljava/lang/Object;Z)V", "", "K", "(Ljava/lang/Object;C)V", "", "U", "(Ljava/lang/Object;Ljava/lang/String;)V", "enumDescriptor", "ordinal", "M", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "inlineDescriptor", "O", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "descriptor", "l", "v", "o", "r", "g", "q", "A", "m", "t", "f", "u", "F", "k", "b", "c", "W", "x", "p", "B", "w", "D", "s", "C", "n", "y", "e", "Lzi/h;", "serializer", "i", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILzi/h;Ljava/lang/Object;)V", "E", ZeroconfModule.KEY_SERVICE_NAME, "b0", "a0", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "tagStack", "X", "currentTag", "Y", "currentTagOrNull", "<init>", "()V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.c2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC2571c2<Tag> implements Encoder, CompositeEncoder {

    /* renamed from: a */
    private final ArrayList<Tag> f7028a = new ArrayList<>();

    /* renamed from: G */
    private final boolean m32954G(SerialDescriptor serialDescriptor, int i) {
        m32936b0(mo32938Z(serialDescriptor, i));
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: A */
    public final void mo12908A(int i) {
        m32946P(m32937a0(), i);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: B */
    public final void mo12907B(SerialDescriptor descriptor, int i, short s) {
        C9612q.m13917h(descriptor, "descriptor");
        m32943T(mo32938Z(descriptor, i), s);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: C */
    public final void mo12906C(SerialDescriptor descriptor, int i, double d) {
        C9612q.m13917h(descriptor, "descriptor");
        m32949L(mo32938Z(descriptor, i), d);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: D */
    public final void mo12905D(SerialDescriptor descriptor, int i, long j) {
        C9612q.m13917h(descriptor, "descriptor");
        m32945Q(mo32938Z(descriptor, i), j);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: E */
    public <T> void mo12904E(SerialDescriptor descriptor, int i, InterfaceC14279h<? super T> serializer, T t) {
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(serializer, "serializer");
        if (m32954G(descriptor, i)) {
            m32953H(serializer, t);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: F */
    public final void mo12903F(String value) {
        C9612q.m13917h(value, "value");
        m32942U(m32937a0(), value);
    }

    /* renamed from: H */
    public <T> void m32953H(InterfaceC14279h<? super T> interfaceC14279h, T t) {
        Encoder.C9933a.m12927c(this, interfaceC14279h, t);
    }

    /* renamed from: I */
    protected void m32952I(Tag tag, boolean z) {
        mo22612V(tag, Boolean.valueOf(z));
    }

    /* renamed from: J */
    protected void m32951J(Tag tag, byte b) {
        mo22612V(tag, Byte.valueOf(b));
    }

    /* renamed from: K */
    protected void m32950K(Tag tag, char c) {
        mo22612V(tag, Character.valueOf(c));
    }

    /* renamed from: L */
    protected void m32949L(Tag tag, double d) {
        mo22612V(tag, Double.valueOf(d));
    }

    /* renamed from: M */
    protected abstract void mo22614M(Tag tag, SerialDescriptor serialDescriptor, int i);

    /* renamed from: N */
    protected void m32948N(Tag tag, float f) {
        mo22612V(tag, Float.valueOf(f));
    }

    /* renamed from: O */
    protected Encoder m32947O(Tag tag, SerialDescriptor inlineDescriptor) {
        C9612q.m13917h(inlineDescriptor, "inlineDescriptor");
        m32936b0(tag);
        return this;
    }

    /* renamed from: P */
    protected void m32946P(Tag tag, int i) {
        mo22612V(tag, Integer.valueOf(i));
    }

    /* renamed from: Q */
    protected void m32945Q(Tag tag, long j) {
        mo22612V(tag, Long.valueOf(j));
    }

    /* renamed from: R */
    protected void m32944R(Tag tag) {
    }

    /* renamed from: S */
    protected abstract void mo22613S(Tag tag);

    /* renamed from: T */
    protected void m32943T(Tag tag, short s) {
        mo22612V(tag, Short.valueOf(s));
    }

    /* renamed from: U */
    protected void m32942U(Tag tag, String value) {
        C9612q.m13917h(value, "value");
        mo22612V(tag, value);
    }

    /* renamed from: V */
    protected abstract void mo22612V(Tag tag, Object obj);

    /* renamed from: W */
    protected void m32941W(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
    }

    /* renamed from: X */
    protected final Tag m32940X() {
        Object m14044f0;
        m14044f0 = C9553r.m14044f0(this.f7028a);
        return (Tag) m14044f0;
    }

    /* renamed from: Y */
    public final Tag m32939Y() {
        Object m14042h0;
        m14042h0 = C9553r.m14042h0(this.f7028a);
        return (Tag) m14042h0;
    }

    /* renamed from: Z */
    protected abstract Tag mo32938Z(SerialDescriptor serialDescriptor, int i);

    /* renamed from: a0 */
    protected final Tag m32937a0() {
        int m14102k;
        if (!this.f7028a.isEmpty()) {
            ArrayList<Tag> arrayList = this.f7028a;
            m14102k = C9545j.m14102k(arrayList);
            return arrayList.remove(m14102k);
        }
        throw new C14278g("No tag in stack for requested element");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: b */
    public CompositeEncoder mo12900b(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        return this;
    }

    /* renamed from: b0 */
    protected final void m32936b0(Tag tag) {
        this.f7028a.add(tag);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: c */
    public final void mo12899c(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        if (!this.f7028a.isEmpty()) {
            m32937a0();
        }
        m32941W(descriptor);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: e */
    public final Encoder mo12898e(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return m32947O(mo32938Z(descriptor, i), descriptor.mo12683h(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: f */
    public final void mo12897f(double d) {
        m32949L(m32937a0(), d);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: g */
    public final void mo12896g(byte b) {
        m32951J(m32937a0(), b);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: h */
    public abstract <T> void mo12895h(InterfaceC14279h<? super T> interfaceC14279h, T t);

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: i */
    public <T> void mo12894i(SerialDescriptor descriptor, int i, InterfaceC14279h<? super T> serializer, T t) {
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(serializer, "serializer");
        if (m32954G(descriptor, i)) {
            mo12895h(serializer, t);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: j */
    public CompositeEncoder mo12893j(SerialDescriptor serialDescriptor, int i) {
        return Encoder.C9933a.m12929a(this, serialDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: k */
    public final void mo12931k(SerialDescriptor enumDescriptor, int i) {
        C9612q.m13917h(enumDescriptor, "enumDescriptor");
        mo22614M(m32937a0(), enumDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: l */
    public final Encoder mo12892l(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        return m32947O(m32937a0(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: m */
    public final void mo12891m(long j) {
        m32945Q(m32937a0(), j);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: n */
    public final void mo12890n(SerialDescriptor descriptor, int i, char c) {
        C9612q.m13917h(descriptor, "descriptor");
        m32950K(mo32938Z(descriptor, i), c);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: o */
    public void mo12930o() {
        mo22613S(m32937a0());
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: p */
    public final void mo12889p(SerialDescriptor descriptor, int i, byte b) {
        C9612q.m13917h(descriptor, "descriptor");
        m32951J(mo32938Z(descriptor, i), b);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: q */
    public final void mo12888q(short s) {
        m32943T(m32937a0(), s);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: r */
    public final void mo12887r(boolean z) {
        m32952I(m32937a0(), z);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: s */
    public final void mo12886s(SerialDescriptor descriptor, int i, float f) {
        C9612q.m13917h(descriptor, "descriptor");
        m32948N(mo32938Z(descriptor, i), f);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: t */
    public final void mo12885t(float f) {
        m32948N(m32937a0(), f);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: u */
    public final void mo12884u(char c) {
        m32950K(m32937a0(), c);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: v */
    public void mo12883v() {
        m32944R(m32940X());
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: w */
    public final void mo12882w(SerialDescriptor descriptor, int i, int i2) {
        C9612q.m13917h(descriptor, "descriptor");
        m32946P(mo32938Z(descriptor, i), i2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: x */
    public final void mo12881x(SerialDescriptor descriptor, int i, boolean z) {
        C9612q.m13917h(descriptor, "descriptor");
        m32952I(mo32938Z(descriptor, i), z);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: y */
    public final void mo12880y(SerialDescriptor descriptor, int i, String value) {
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(value, "value");
        m32942U(mo32938Z(descriptor, i), value);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: z */
    public boolean mo12879z(SerialDescriptor serialDescriptor, int i) {
        return CompositeEncoder.C9931a.m12934a(this, serialDescriptor, i);
    }
}