package p325rg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import ph.C11633c;

/* renamed from: rg.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C12166l implements InterfaceC12155g {

    /* renamed from: j */
    private final InterfaceC12155g f31615j;

    /* renamed from: k */
    private final boolean f31616k;

    /* renamed from: l */
    private final Function1<C11633c, Boolean> f31617l;

    /* JADX WARN: Multi-variable type inference failed */
    public C12166l(InterfaceC12155g delegate, boolean z, Function1<? super C11633c, Boolean> fqNameFilter) {
        C9612q.m13917h(delegate, "delegate");
        C9612q.m13917h(fqNameFilter, "fqNameFilter");
        this.f31615j = delegate;
        this.f31616k = z;
        this.f31617l = fqNameFilter;
    }

    /* renamed from: a */
    private final boolean m6025a(InterfaceC12149c interfaceC12149c) {
        C11633c mo6030e = interfaceC12149c.mo6030e();
        if (mo6030e != null && this.f31617l.invoke(mo6030e).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // p325rg.InterfaceC12155g
    /* renamed from: b */
    public InterfaceC12149c mo6024b(C11633c fqName) {
        C9612q.m13917h(fqName, "fqName");
        if (this.f31617l.invoke(fqName).booleanValue()) {
            return this.f31615j.mo6024b(fqName);
        }
        return null;
    }

    @Override // p325rg.InterfaceC12155g
    public boolean isEmpty() {
        boolean z;
        InterfaceC12155g<InterfaceC12149c> interfaceC12155g = this.f31615j;
        if (!(interfaceC12155g instanceof Collection) || !((Collection) interfaceC12155g).isEmpty()) {
            for (InterfaceC12149c interfaceC12149c : interfaceC12155g) {
                if (m6025a(interfaceC12149c)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (this.f31616k) {
            if (!z) {
                return true;
            }
            return false;
        }
        return z;
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC12149c> iterator() {
        InterfaceC12155g interfaceC12155g = this.f31615j;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC12149c interfaceC12149c : interfaceC12155g) {
            if (m6025a(interfaceC12149c)) {
                arrayList.add(interfaceC12149c);
            }
        }
        return arrayList.iterator();
    }

    @Override // p325rg.InterfaceC12155g
    /* renamed from: q */
    public boolean mo6023q(C11633c fqName) {
        C9612q.m13917h(fqName, "fqName");
        if (this.f31617l.invoke(fqName).booleanValue()) {
            return this.f31615j.mo6023q(fqName);
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12166l(InterfaceC12155g delegate, Function1<? super C11633c, Boolean> fqNameFilter) {
        this(delegate, false, fqNameFilter);
        C9612q.m13917h(delegate, "delegate");
        C9612q.m13917h(fqNameFilter, "fqNameFilter");
    }
}