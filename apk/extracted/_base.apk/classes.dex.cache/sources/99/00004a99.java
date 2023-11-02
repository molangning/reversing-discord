package p304qf;

import cg.InterfaceC2533a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0004H\u0096\u0002R \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m14357d2 = {"Lqf/n;", "T", "", "Lqf/m;", "", "iterator", "Lkotlin/Function0;", "j", "Lkotlin/jvm/functions/Function0;", "iteratorFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: qf.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11881n<T> implements Iterable<C11880m<? extends T>>, InterfaceC2533a {

    /* renamed from: j */
    private final Function0<Iterator<T>> f30876j;

    /* JADX WARN: Multi-variable type inference failed */
    public C11881n(Function0<? extends Iterator<? extends T>> iteratorFactory) {
        C9612q.m13917h(iteratorFactory, "iteratorFactory");
        this.f30876j = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator<C11880m<T>> iterator() {
        return new C11882o(this.f30876j.invoke());
    }
}