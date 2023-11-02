package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p304qf.AbstractC11866c;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\b\u0012\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m14357d2 = {"Lkotlin/collections/t;", "T", "Lqf/c;", "", "index", "get", "(I)Ljava/lang/Object;", "", "k", "Ljava/util/List;", "delegate", "a", "()I", "size", "<init>", "(Ljava/util/List;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlin.collections.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9557t<T> extends AbstractC11866c<T> {

    /* renamed from: k */
    private final List<T> f25317k;

    /* JADX WARN: Multi-variable type inference failed */
    public C9557t(List<? extends T> delegate) {
        C9612q.m13917h(delegate, "delegate");
        this.f25317k = delegate;
    }

    @Override // p304qf.AbstractC11861a
    /* renamed from: a */
    public int mo3916a() {
        return this.f25317k.size();
    }

    @Override // p304qf.AbstractC11866c, java.util.List
    public T get(int i) {
        int m14079H;
        List<T> list = this.f25317k;
        m14079H = C9551p.m14079H(this, i);
        return list.get(m14079H);
    }
}