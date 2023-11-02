package p045cj;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.InterfaceC9936c;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004¢\u0006\u0004\b(\u0010)J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00028\u0001H$¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r*\u00028\u0001H$¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00028\u0002H$¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\b*\u00028\u0002H$¢\u0006\u0004\b\u0012\u0010\fJ\u0013\u0010\u0013\u001a\u00028\u0001*\u00028\u0002H$¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00028\u0002*\u00028\u0001H$¢\u0006\u0004\b\u0015\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u0017*\u00028\u00022\u0006\u0010\u0016\u001a\u00020\bH$¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010#\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00022\b\b\u0002\u0010\"\u001a\u00020!H$¢\u0006\u0004\b#\u0010$J/\u0010&\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010%\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH$¢\u0006\u0004\b&\u0010'\u0082\u0001\u0002*+¨\u0006,"}, m14357d2 = {"Lcj/a;", "Element", "Collection", "Builder", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/c;", "decoder", "builder", "", "j", "(Lkotlinx/serialization/encoding/c;Ljava/lang/Object;)I", "e", "(Ljava/lang/Object;)I", "", "d", "(Ljava/lang/Object;)Ljava/util/Iterator;", "a", "()Ljava/lang/Object;", "b", "l", "(Ljava/lang/Object;)Ljava/lang/Object;", "k", "size", "", "c", "(Ljava/lang/Object;I)V", "Lkotlinx/serialization/encoding/Decoder;", "previous", "f", "(Lkotlinx/serialization/encoding/Decoder;Ljava/lang/Object;)Ljava/lang/Object;", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "index", "", "checkIndex", "h", "(Lkotlinx/serialization/encoding/c;ILjava/lang/Object;Z)V", "startIndex", "g", "(Lkotlinx/serialization/encoding/c;Ljava/lang/Object;II)V", "<init>", "()V", "Lcj/s;", "Lcj/z0;", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC2556a<Element, Collection, Builder> implements KSerializer<Collection> {
    private AbstractC2556a() {
    }

    public /* synthetic */ AbstractC2556a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: i */
    public static /* synthetic */ void m32985i(AbstractC2556a abstractC2556a, InterfaceC9936c interfaceC9936c, int i, Object obj, boolean z, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        abstractC2556a.mo12790h(interfaceC9936c, i, obj, z);
    }

    /* renamed from: j */
    private final int m32984j(InterfaceC9936c interfaceC9936c, Builder builder) {
        int mo12869k = interfaceC9936c.mo12869k(getDescriptor());
        mo32796c(builder, mo12869k);
        return mo12869k;
    }

    /* renamed from: a */
    protected abstract Builder mo32798a();

    /* renamed from: b */
    protected abstract int mo32797b(Builder builder);

    /* renamed from: c */
    protected abstract void mo32796c(Builder builder, int i);

    /* renamed from: d */
    public abstract Iterator<Element> mo32795d(Collection collection);

    @Override // kotlinx.serialization.DeserializationStrategy
    public Collection deserialize(Decoder decoder) {
        C9612q.m13917h(decoder, "decoder");
        return m32986f(decoder, null);
    }

    /* renamed from: e */
    public abstract int mo12791e(Collection collection);

    /* renamed from: f */
    public final Collection m32986f(Decoder decoder, Collection collection) {
        Builder mo32798a;
        C9612q.m13917h(decoder, "decoder");
        if (collection == null || (mo32798a = mo12789k(collection)) == null) {
            mo32798a = mo32798a();
        }
        int mo32797b = mo32797b(mo32798a);
        InterfaceC9936c mo12920b = decoder.mo12920b(getDescriptor());
        if (!mo12920b.mo12865p()) {
            while (true) {
                int mo12866o = mo12920b.mo12866o(getDescriptor());
                if (mo12866o == -1) {
                    break;
                }
                m32985i(this, mo12920b, mo32797b + mo12866o, mo32798a, false, 8, null);
            }
        } else {
            mo32757g(mo12920b, mo32798a, mo32797b, m32984j(mo12920b, mo32798a));
        }
        mo12920b.mo12872c(getDescriptor());
        return mo32794l(mo32798a);
    }

    /* renamed from: g */
    protected abstract void mo32757g(InterfaceC9936c interfaceC9936c, Builder builder, int i, int i2);

    /* renamed from: h */
    protected abstract void mo12790h(InterfaceC9936c interfaceC9936c, int i, Builder builder, boolean z);

    /* renamed from: k */
    public abstract Builder mo12789k(Collection collection);

    /* renamed from: l */
    protected abstract Collection mo32794l(Builder builder);
}