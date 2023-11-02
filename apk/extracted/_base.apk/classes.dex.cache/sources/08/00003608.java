package p141hh;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import p325rg.InterfaceC12149c;
import p325rg.InterfaceC12155g;
import ph.C11633c;

/* renamed from: hh.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7160c implements InterfaceC12155g {

    /* renamed from: j */
    private final C11633c f19523j;

    public C7160c(C11633c fqNameToMatch) {
        C9612q.m13917h(fqNameToMatch, "fqNameToMatch");
        this.f19523j = fqNameToMatch;
    }

    @Override // p325rg.InterfaceC12155g
    /* renamed from: a */
    public C7159b mo6024b(C11633c fqName) {
        C9612q.m13917h(fqName, "fqName");
        if (C9612q.m13922c(fqName, this.f19523j)) {
            return C7159b.f19522a;
        }
        return null;
    }

    @Override // p325rg.InterfaceC12155g
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC12149c> iterator() {
        List m14104i;
        m14104i = C9545j.m14104i();
        return m14104i.iterator();
    }

    @Override // p325rg.InterfaceC12155g
    /* renamed from: q */
    public boolean mo6023q(C11633c c11633c) {
        return InterfaceC12155g.C12158b.m6034b(this, c11633c);
    }
}