package p305qg;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C9612q;
import li.InterfaceC10202k;
import p304qf.C11889v;
import ph.C11638f;

/* renamed from: qg.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11932i0<Type extends InterfaceC10202k> extends AbstractC11930h1<Type> {

    /* renamed from: a */
    private final List<Pair<C11638f, Type>> f30931a;

    /* renamed from: b */
    private final Map<C11638f, Type> f30932b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C11932i0(List<? extends Pair<C11638f, ? extends Type>> underlyingPropertyNamesToTypes) {
        super(null);
        Map<C11638f, Type> m6744r;
        boolean z;
        C9612q.m13917h(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f30931a = underlyingPropertyNamesToTypes;
        m6744r = C11889v.m6744r(mo6639a());
        if (m6744r.size() == mo6639a().size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f30932b = m6744r;
            return;
        }
        throw new IllegalArgumentException("Some properties have the same names".toString());
    }

    @Override // p305qg.AbstractC11930h1
    /* renamed from: a */
    public List<Pair<C11638f, Type>> mo6639a() {
        return this.f30931a;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + mo6639a() + ')';
    }
}
