package pf;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u000f\u0012\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001a\u0010\u000b\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, m14357d2 = {"Lpf/h;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "toString", "j", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pf.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11565h<T> implements Lazy<T>, Serializable {

    /* renamed from: j */
    private final T f30072j;

    public C11565h(T t) {
        this.f30072j = t;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        return this.f30072j;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
