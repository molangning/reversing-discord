package p305qg;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.C9544i;
import kotlin.jvm.internal.C9612q;
import li.InterfaceC10202k;
import pf.C11591x;
import ph.C11638f;

/* renamed from: qg.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C12004z<Type extends InterfaceC10202k> extends AbstractC11930h1<Type> {

    /* renamed from: a */
    private final C11638f f30995a;

    /* renamed from: b */
    private final Type f30996b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12004z(C11638f underlyingPropertyName, Type underlyingType) {
        super(null);
        C9612q.m13917h(underlyingPropertyName, "underlyingPropertyName");
        C9612q.m13917h(underlyingType, "underlyingType");
        this.f30995a = underlyingPropertyName;
        this.f30996b = underlyingType;
    }

    @Override // p305qg.AbstractC11930h1
    /* renamed from: a */
    public List<Pair<C11638f, Type>> mo6639a() {
        List<Pair<C11638f, Type>> m14109d;
        m14109d = C9544i.m14109d(C11591x.m7577a(this.f30995a, this.f30996b));
        return m14109d;
    }

    /* renamed from: c */
    public final C11638f m6638c() {
        return this.f30995a;
    }

    /* renamed from: d */
    public final Type m6637d() {
        return this.f30996b;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f30995a + ", underlyingType=" + this.f30996b + ')';
    }
}
