package p045cj;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u0004\b\u0002\u0010\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0007\u001a\u00020\u0006*\u00028\u0001H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t*\u00028\u0001H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, m14357d2 = {"Lcj/t;", "E", "", "C", "B", "Lcj/s;", "", "p", "(Ljava/util/Collection;)I", "", "o", "(Ljava/util/Collection;)Ljava/util/Iterator;", "Lkotlinx/serialization/KSerializer;", "element", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC2639t<E, C extends Collection<? extends E>, B> extends AbstractC2636s<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2639t(KSerializer<E> element) {
        super(element, null);
        C9612q.m13917h(element, "element");
    }

    @Override // p045cj.AbstractC2556a
    /* renamed from: o */
    public Iterator<E> mo32795d(C c) {
        C9612q.m13917h(c, "<this>");
        return c.iterator();
    }

    @Override // p045cj.AbstractC2556a
    /* renamed from: p */
    public int mo12791e(C c) {
        C9612q.m13917h(c, "<this>");
        return c.size();
    }
}