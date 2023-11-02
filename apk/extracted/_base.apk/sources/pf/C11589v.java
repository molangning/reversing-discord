package pf;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B!\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0015\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m14357d2 = {"Lpf/v;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "a", "", "toString", "Lkotlin/Function0;", "j", "Lkotlin/jvm/functions/Function0;", "initializer", "", "k", "Ljava/lang/Object;", "_value", "l", "lock", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pf.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11589v<T> implements Lazy<T>, Serializable {

    /* renamed from: j */
    private Function0<? extends T> f30098j;

    /* renamed from: k */
    private volatile Object f30099k;

    /* renamed from: l */
    private final Object f30100l;

    public C11589v(Function0<? extends T> initializer, Object obj) {
        C9612q.m13917h(initializer, "initializer");
        this.f30098j = initializer;
        this.f30099k = C11561f0.f30069a;
        this.f30100l = obj == null ? this : obj;
    }

    /* renamed from: a */
    public boolean m7584a() {
        return this.f30099k != C11561f0.f30069a;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        T t;
        T t2 = (T) this.f30099k;
        C11561f0 c11561f0 = C11561f0.f30069a;
        if (t2 != c11561f0) {
            return t2;
        }
        synchronized (this.f30100l) {
            t = (T) this.f30099k;
            if (t == c11561f0) {
                Function0<? extends T> function0 = this.f30098j;
                C9612q.m13920e(function0);
                t = function0.invoke();
                this.f30099k = t;
                this.f30098j = null;
            }
        }
        return t;
    }

    public String toString() {
        return m7584a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ C11589v(Function0 function0, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i & 2) != 0 ? null : obj);
    }
}
