package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import p470zi.C14278g;

@Metadata(m14358d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0012\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b6\u00107J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J/\u0010#\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0010\u0010'\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0016\u0010)\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u0010*\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u0010+\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u0010,\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u0010-\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u0010.\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u0010/\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u00100\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0016\u00101\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eJ\u0018\u00102\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000eH\u0016J=\u00103\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001f2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\b\u0010\"\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b3\u00104JC\u00105\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001f*\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u000e2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000 2\b\u0010\"\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b5\u00104¨\u00068"}, m14357d2 = {"Lkotlinx/serialization/encoding/a;", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/c;", "", "J", "", "D", "", "j", "w", "", "H", "", "s", "", "h", "", "l", "", "t", "", "v", "", "x", "", "z", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "e", "descriptor", "q", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "previousValue", "I", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "b", "", "c", "index", "C", "B", "E", "i", "f", "u", "F", "A", "m", "r", "y", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "n", "<init>", "()V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.encoding.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC9934a implements Decoder, InterfaceC9936c {
    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: A */
    public final char mo12878A(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo12910x();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: B */
    public final byte mo12877B(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo12923H();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: C */
    public final boolean mo12876C(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo12911w();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: D */
    public boolean mo12925D() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: E */
    public final short mo12875E(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo12914s();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: F */
    public final double mo12874F(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo12912v();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: G */
    public <T> T mo12924G(DeserializationStrategy<? extends T> deserializationStrategy) {
        return (T) Decoder.C9932a.m12933a(this, deserializationStrategy);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: H */
    public abstract byte mo12923H();

    /* renamed from: I */
    public <T> T m12922I(DeserializationStrategy<? extends T> deserializer, T t) {
        C9612q.m13917h(deserializer, "deserializer");
        return (T) mo12924G(deserializer);
    }

    /* renamed from: J */
    public Object m12921J() {
        throw new C14278g(C9591f0.m13969b(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: b */
    public InterfaceC9936c mo12920b(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        return this;
    }

    /* renamed from: c */
    public void mo12872c(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: e */
    public int mo12919e(SerialDescriptor enumDescriptor) {
        C9612q.m13917h(enumDescriptor, "enumDescriptor");
        Object m12921J = m12921J();
        C9612q.m13919f(m12921J, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) m12921J).intValue();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: f */
    public final long mo12871f(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo12916l();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: h */
    public abstract int mo12918h();

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: i */
    public final int mo12870i(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo12918h();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: j */
    public Void mo12917j() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: k */
    public int mo12869k(SerialDescriptor serialDescriptor) {
        return InterfaceC9936c.C9937a.m12861a(this, serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: l */
    public abstract long mo12916l();

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: m */
    public final String mo12868m(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo12909z();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: n */
    public final <T> T mo12867n(SerialDescriptor descriptor, int i, DeserializationStrategy<? extends T> deserializer, T t) {
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(deserializer, "deserializer");
        if (!deserializer.getDescriptor().mo12689b() && !mo12925D()) {
            return (T) mo12917j();
        }
        return (T) m12922I(deserializer, t);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: p */
    public boolean mo12865p() {
        return InterfaceC9936c.C9937a.m12860b(this);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: q */
    public Decoder mo12915q(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: r */
    public Decoder mo12864r(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo12915q(descriptor.mo12683h(i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: s */
    public abstract short mo12914s();

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: t */
    public float mo12913t() {
        Object m12921J = m12921J();
        C9612q.m13919f(m12921J, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) m12921J).floatValue();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: u */
    public final float mo12863u(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo12913t();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: v */
    public double mo12912v() {
        Object m12921J = m12921J();
        C9612q.m13919f(m12921J, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) m12921J).doubleValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: w */
    public boolean mo12911w() {
        Object m12921J = m12921J();
        C9612q.m13919f(m12921J, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) m12921J).booleanValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: x */
    public char mo12910x() {
        Object m12921J = m12921J();
        C9612q.m13919f(m12921J, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) m12921J).charValue();
    }

    /* renamed from: y */
    public <T> T mo12862y(SerialDescriptor descriptor, int i, DeserializationStrategy<? extends T> deserializer, T t) {
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(deserializer, "deserializer");
        return (T) m12922I(deserializer, t);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: z */
    public String mo12909z() {
        Object m12921J = m12921J();
        C9612q.m13919f(m12921J, "null cannot be cast to non-null type kotlin.String");
        return (String) m12921J;
    }
}
