package fi;

import gi.C6820m;
import gi.InterfaceC6815i;
import gi.InterfaceC6821n;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KProperty;
import p325rg.InterfaceC12149c;
import p325rg.InterfaceC12155g;
import ph.C11633c;

/* renamed from: fi.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C6426a implements InterfaceC12155g {

    /* renamed from: k */
    static final /* synthetic */ KProperty<Object>[] f18058k = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C6426a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: j */
    private final InterfaceC6815i f18059j;

    public C6426a(InterfaceC6821n storageManager, Function0<? extends List<? extends InterfaceC12149c>> compute) {
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(compute, "compute");
        this.f18059j = storageManager.mo21867c(compute);
    }

    /* renamed from: a */
    private final List<InterfaceC12149c> m22780a() {
        return (List) C6820m.m21871a(this.f18059j, this, f18058k[0]);
    }

    @Override // p325rg.InterfaceC12155g
    /* renamed from: b */
    public InterfaceC12149c mo6024b(C11633c c11633c) {
        return InterfaceC12155g.C12158b.m6035a(this, c11633c);
    }

    @Override // p325rg.InterfaceC12155g
    public boolean isEmpty() {
        return m22780a().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC12149c> iterator() {
        return m22780a().iterator();
    }

    @Override // p325rg.InterfaceC12155g
    /* renamed from: q */
    public boolean mo6023q(C11633c c11633c) {
        return InterfaceC12155g.C12158b.m6034b(this, c11633c);
    }
}