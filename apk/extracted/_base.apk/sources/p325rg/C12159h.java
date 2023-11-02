package p325rg;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9612q;
import p325rg.InterfaceC12155g;
import ph.C11633c;

/* renamed from: rg.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C12159h implements InterfaceC12155g {

    /* renamed from: j */
    private final List<InterfaceC12149c> f31606j;

    /* JADX WARN: Multi-variable type inference failed */
    public C12159h(List<? extends InterfaceC12149c> annotations) {
        C9612q.m13917h(annotations, "annotations");
        this.f31606j = annotations;
    }

    @Override // p325rg.InterfaceC12155g
    /* renamed from: b */
    public InterfaceC12149c mo6024b(C11633c c11633c) {
        return InterfaceC12155g.C12158b.m6035a(this, c11633c);
    }

    @Override // p325rg.InterfaceC12155g
    public boolean isEmpty() {
        return this.f31606j.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC12149c> iterator() {
        return this.f31606j.iterator();
    }

    @Override // p325rg.InterfaceC12155g
    /* renamed from: q */
    public boolean mo6023q(C11633c c11633c) {
        return InterfaceC12155g.C12158b.m6034b(this, c11633c);
    }

    public String toString() {
        return this.f31606j.toString();
    }
}
