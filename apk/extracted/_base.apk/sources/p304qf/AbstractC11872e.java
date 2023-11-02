package p304qf;

import cg.InterfaceC2535c;
import java.util.AbstractList;
import java.util.List;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m14357d2 = {"Lqf/e;", "E", "", "Ljava/util/AbstractList;", "", "index", "e", "(I)Ljava/lang/Object;", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: qf.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC11872e<E> extends AbstractList<E> implements List<E>, InterfaceC2535c {
    /* renamed from: a */
    public abstract int mo6128a();

    /* renamed from: e */
    public abstract E mo6127e(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return mo6127e(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo6128a();
    }
}
