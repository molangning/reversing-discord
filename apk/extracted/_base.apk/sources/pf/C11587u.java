package pf;

import androidx.concurrent.futures.C0647b;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\b\u0002\u0018\u0000 \u0018*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\u0006B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0015\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m14357d2 = {"Lpf/u;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "a", "", "toString", "Lkotlin/Function0;", "j", "Lkotlin/jvm/functions/Function0;", "initializer", "", "k", "Ljava/lang/Object;", "_value", "l", "final", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "m", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pf.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11587u<T> implements Lazy<T>, Serializable {

    /* renamed from: m */
    public static final C11588a f30093m = new C11588a(null);

    /* renamed from: n */
    private static final AtomicReferenceFieldUpdater<C11587u<?>, Object> f30094n = AtomicReferenceFieldUpdater.newUpdater(C11587u.class, Object.class, "k");

    /* renamed from: j */
    private volatile Function0<? extends T> f30095j;

    /* renamed from: k */
    private volatile Object f30096k;

    /* renamed from: l */
    private final Object f30097l;

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bRd\u0010\u0005\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m14357d2 = {"Lpf/u$a;", "", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lpf/u;", "kotlin.jvm.PlatformType", "valueUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pf.u$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11588a {
        private C11588a() {
        }

        public /* synthetic */ C11588a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C11587u(Function0<? extends T> initializer) {
        C9612q.m13917h(initializer, "initializer");
        this.f30095j = initializer;
        C11561f0 c11561f0 = C11561f0.f30069a;
        this.f30096k = c11561f0;
        this.f30097l = c11561f0;
    }

    /* renamed from: a */
    public boolean m7585a() {
        return this.f30096k != C11561f0.f30069a;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        T t = (T) this.f30096k;
        C11561f0 c11561f0 = C11561f0.f30069a;
        if (t != c11561f0) {
            return t;
        }
        Function0<? extends T> function0 = this.f30095j;
        if (function0 != null) {
            T invoke = function0.invoke();
            if (C0647b.m39437a(f30094n, this, c11561f0, invoke)) {
                this.f30095j = null;
                return invoke;
            }
        }
        return (T) this.f30096k;
    }

    public String toString() {
        return m7585a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
