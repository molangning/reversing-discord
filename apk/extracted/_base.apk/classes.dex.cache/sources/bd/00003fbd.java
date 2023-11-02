package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p304qf.AbstractC11872e;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0006J \u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m14357d2 = {"Lkotlin/collections/s;", "T", "Lqf/e;", "", "index", "get", "(I)Ljava/lang/Object;", "", "clear", "e", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "add", "(ILjava/lang/Object;)V", "", "j", "Ljava/util/List;", "delegate", "a", "()I", "size", "<init>", "(Ljava/util/List;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlin.collections.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9556s<T> extends AbstractC11872e<T> {

    /* renamed from: j */
    private final List<T> f25316j;

    public C9556s(List<T> delegate) {
        C9612q.m13917h(delegate, "delegate");
        this.f25316j = delegate;
    }

    @Override // p304qf.AbstractC11872e
    /* renamed from: a */
    public int mo6128a() {
        return this.f25316j.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        int m14078I;
        List<T> list = this.f25316j;
        m14078I = C9551p.m14078I(this, i);
        list.add(m14078I, t);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f25316j.clear();
    }

    @Override // p304qf.AbstractC11872e
    /* renamed from: e */
    public T mo6127e(int i) {
        int m14079H;
        List<T> list = this.f25316j;
        m14079H = C9551p.m14079H(this, i);
        return list.remove(m14079H);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        int m14079H;
        List<T> list = this.f25316j;
        m14079H = C9551p.m14079H(this, i);
        return list.get(m14079H);
    }

    @Override // java.util.AbstractList, java.util.List
    public T set(int i, T t) {
        int m14079H;
        List<T> list = this.f25316j;
        m14079H = C9551p.m14079H(this, i);
        return list.set(m14079H, t);
    }
}