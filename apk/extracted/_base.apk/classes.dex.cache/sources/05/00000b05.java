package p045cj;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import p470zi.C14278g;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m14358d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\be\u0010fJ+\u0010\b\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00028\u0000*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH$¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\nH\u0014¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u00100\u001a\u00020\nH\u0014¢\u0006\u0004\b1\u00102J-\u00106\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00132\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u0001032\b\u00105\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b6\u00107J\u000e\u00109\u001a\u00020\u00022\u0006\u00108\u001a\u00020\nJ\b\u0010:\u001a\u00020\u0012H\u0016J\b\u0010<\u001a\u0004\u0018\u00010;J\u0006\u0010=\u001a\u00020\u0012J\u0006\u0010>\u001a\u00020\u0016J\u0006\u0010?\u001a\u00020\u0019J\u0006\u0010@\u001a\u00020\u000bJ\u0006\u0010A\u001a\u00020\u001eJ\u0006\u0010B\u001a\u00020!J\u0006\u0010C\u001a\u00020$J\u0006\u0010D\u001a\u00020'J\u0006\u0010E\u001a\u00020*J\u000e\u0010F\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\nJ\u0010\u0010H\u001a\u00020G2\u0006\u00108\u001a\u00020\nH\u0016J\u0016\u0010I\u001a\u00020\u00122\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010J\u001a\u00020\u00162\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u0004\u001a\u00020\u00192\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010K\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010L\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010M\u001a\u00020!2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010N\u001a\u00020$2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010O\u001a\u00020'2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010P\u001a\u00020*2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010Q\u001a\u00020\u00022\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bJ;\u0010R\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00132\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u0001032\b\u00105\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bR\u0010SJC\u0010T\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u0013*\u00020\u000f2\u0006\u00108\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u0001032\b\u00105\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bT\u0010SJ\u0017\u0010V\u001a\u00020G2\u0006\u0010U\u001a\u00028\u0000H\u0004¢\u0006\u0004\bV\u0010WJ\u0016\u0010Y\u001a\u00020G2\f\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0004J\u000f\u0010Z\u001a\u00028\u0000H\u0004¢\u0006\u0004\bZ\u0010[R$\u0010`\u001a\u0012\u0012\u0004\u0012\u00028\u00000\\j\b\u0012\u0004\u0012\u00028\u0000`]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010b\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010ZR\u0016\u0010d\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bc\u0010[¨\u0006g"}, m14357d2 = {"Lcj/b2;", "Tag", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/c;", "E", "tag", "Lkotlin/Function0;", "block", "b0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "Y", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/Object;", "", "W", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "T", "(Ljava/lang/Object;)Z", "K", "", "L", "(Ljava/lang/Object;)B", "", "U", "(Ljava/lang/Object;)S", "R", "(Ljava/lang/Object;)I", "", "S", "(Ljava/lang/Object;)J", "", "P", "(Ljava/lang/Object;)F", "", "N", "(Ljava/lang/Object;)D", "", "M", "(Ljava/lang/Object;)C", "", "V", "(Ljava/lang/Object;)Ljava/lang/String;", "enumDescriptor", "O", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "inlineDescriptor", "Q", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "previousValue", "J", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "descriptor", "q", "D", "", "j", "w", "H", "s", "h", "l", "t", "v", "x", "z", "e", "", "c", "C", "B", "i", "f", "u", "F", "A", "m", "r", "y", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "n", ZeroconfModule.KEY_SERVICE_NAME, "a0", "(Ljava/lang/Object;)V", "other", "I", "Z", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "tagStack", "b", "flag", "X", "currentTagOrNull", "<init>", "()V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.b2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC2565b2<Tag> implements Decoder, InterfaceC9936c {

    /* renamed from: a */
    private final ArrayList<Tag> f7020a = new ArrayList<>();

    /* renamed from: b */
    private boolean f7021b;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "T", "", "Tag", "invoke", "()Ljava/lang/Object;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: cj.b2$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C2566a<T> extends AbstractC9614s implements Function0<T> {

        /* renamed from: j */
        final /* synthetic */ AbstractC2565b2<Tag> f7022j;

        /* renamed from: k */
        final /* synthetic */ DeserializationStrategy<T> f7023k;

        /* renamed from: l */
        final /* synthetic */ T f7024l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2566a(AbstractC2565b2<Tag> abstractC2565b2, DeserializationStrategy<? extends T> deserializationStrategy, T t) {
            super(0);
            this.f7022j = abstractC2565b2;
            this.f7023k = deserializationStrategy;
            this.f7024l = t;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            if (this.f7022j.mo12925D()) {
                return (T) this.f7022j.m32967J(this.f7023k, this.f7024l);
            }
            return (T) this.f7022j.mo12917j();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"<anonymous>", "T", "Tag", "invoke", "()Ljava/lang/Object;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: cj.b2$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C2567b<T> extends AbstractC9614s implements Function0<T> {

        /* renamed from: j */
        final /* synthetic */ AbstractC2565b2<Tag> f7025j;

        /* renamed from: k */
        final /* synthetic */ DeserializationStrategy<T> f7026k;

        /* renamed from: l */
        final /* synthetic */ T f7027l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2567b(AbstractC2565b2<Tag> abstractC2565b2, DeserializationStrategy<? extends T> deserializationStrategy, T t) {
            super(0);
            this.f7025j = abstractC2565b2;
            this.f7026k = deserializationStrategy;
            this.f7027l = t;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) this.f7025j.m32967J(this.f7026k, this.f7027l);
        }
    }

    public AbstractC2565b2() {
    }

    /* renamed from: b0 */
    private final <E> E m32962b0(Tag tag, Function0<? extends E> function0) {
        m32963a0(tag);
        E invoke = function0.invoke();
        if (!this.f7021b) {
            m32964Z();
        }
        this.f7021b = false;
        return invoke;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: A */
    public final char mo12878A(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo22630M(mo32965Y(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: B */
    public final byte mo12877B(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo22631L(mo32965Y(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: C */
    public final boolean mo12876C(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo22632K(mo32965Y(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: D */
    public boolean mo12925D() {
        Tag m32966X = m32966X();
        if (m32966X == null) {
            return false;
        }
        return mo23992T(m32966X);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: E */
    public final short mo12875E(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo22625U(mo32965Y(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: F */
    public final double mo12874F(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo22629N(mo32965Y(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: G */
    public abstract <T> T mo12924G(DeserializationStrategy<? extends T> deserializationStrategy);

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: H */
    public final byte mo12923H() {
        return mo22631L(m32964Z());
    }

    /* renamed from: I */
    public final void m32968I(AbstractC2565b2<Tag> other) {
        C9612q.m13917h(other, "other");
        other.f7020a.addAll(this.f7020a);
    }

    /* renamed from: J */
    protected <T> T m32967J(DeserializationStrategy<? extends T> deserializer, T t) {
        C9612q.m13917h(deserializer, "deserializer");
        return (T) mo12924G(deserializer);
    }

    /* renamed from: K */
    protected abstract boolean mo22632K(Tag tag);

    /* renamed from: L */
    protected abstract byte mo22631L(Tag tag);

    /* renamed from: M */
    protected abstract char mo22630M(Tag tag);

    /* renamed from: N */
    protected abstract double mo22629N(Tag tag);

    /* renamed from: O */
    protected abstract int mo22637O(Tag tag, SerialDescriptor serialDescriptor);

    /* renamed from: P */
    protected abstract float mo22628P(Tag tag);

    /* renamed from: Q */
    public Decoder mo23993Q(Tag tag, SerialDescriptor inlineDescriptor) {
        C9612q.m13917h(inlineDescriptor, "inlineDescriptor");
        m32963a0(tag);
        return this;
    }

    /* renamed from: R */
    protected abstract int mo22627R(Tag tag);

    /* renamed from: S */
    protected abstract long mo22626S(Tag tag);

    /* renamed from: T */
    protected boolean mo23992T(Tag tag) {
        return true;
    }

    /* renamed from: U */
    protected abstract short mo22625U(Tag tag);

    /* renamed from: V */
    protected String mo23991V(Tag tag) {
        Object mo22636W = mo22636W(tag);
        C9612q.m13919f(mo22636W, "null cannot be cast to non-null type kotlin.String");
        return (String) mo22636W;
    }

    /* renamed from: W */
    protected Object mo22636W(Tag tag) {
        throw new C14278g(C9591f0.m13969b(getClass()) + " can't retrieve untyped values");
    }

    /* renamed from: X */
    public final Tag m32966X() {
        Object m14042h0;
        m14042h0 = C9553r.m14042h0(this.f7020a);
        return (Tag) m14042h0;
    }

    /* renamed from: Y */
    protected abstract Tag mo32965Y(SerialDescriptor serialDescriptor, int i);

    /* renamed from: Z */
    protected final Tag m32964Z() {
        int m14102k;
        ArrayList<Tag> arrayList = this.f7020a;
        m14102k = C9545j.m14102k(arrayList);
        Tag remove = arrayList.remove(m14102k);
        this.f7021b = true;
        return remove;
    }

    /* renamed from: a0 */
    public final void m32963a0(Tag tag) {
        this.f7020a.add(tag);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: c */
    public void mo12872c(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: e */
    public final int mo12919e(SerialDescriptor enumDescriptor) {
        C9612q.m13917h(enumDescriptor, "enumDescriptor");
        return mo22637O(m32964Z(), enumDescriptor);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: f */
    public final long mo12871f(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo22626S(mo32965Y(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: h */
    public final int mo12918h() {
        return mo22627R(m32964Z());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: i */
    public final int mo12870i(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo22627R(mo32965Y(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: j */
    public final Void mo12917j() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: k */
    public int mo12869k(SerialDescriptor serialDescriptor) {
        return InterfaceC9936c.C9937a.m12861a(this, serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: l */
    public final long mo12916l() {
        return mo22626S(m32964Z());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: m */
    public final String mo12868m(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo23991V(mo32965Y(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: n */
    public final <T> T mo12867n(SerialDescriptor descriptor, int i, DeserializationStrategy<? extends T> deserializer, T t) {
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(deserializer, "deserializer");
        return (T) m32962b0(mo32965Y(descriptor, i), new C2566a(this, deserializer, t));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: p */
    public boolean mo12865p() {
        return InterfaceC9936c.C9937a.m12860b(this);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: q */
    public final Decoder mo12915q(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo23993Q(m32964Z(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: r */
    public final Decoder mo12864r(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo23993Q(mo32965Y(descriptor, i), descriptor.mo12683h(i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: s */
    public final short mo12914s() {
        return mo22625U(m32964Z());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: t */
    public final float mo12913t() {
        return mo22628P(m32964Z());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: u */
    public final float mo12863u(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return mo22628P(mo32965Y(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: v */
    public final double mo12912v() {
        return mo22629N(m32964Z());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: w */
    public final boolean mo12911w() {
        return mo22632K(m32964Z());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: x */
    public final char mo12910x() {
        return mo22630M(m32964Z());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: y */
    public final <T> T mo12862y(SerialDescriptor descriptor, int i, DeserializationStrategy<? extends T> deserializer, T t) {
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(deserializer, "deserializer");
        return (T) m32962b0(mo32965Y(descriptor, i), new C2567b(this, deserializer, t));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: z */
    public final String mo12909z() {
        return mo23991V(m32964Z());
    }
}