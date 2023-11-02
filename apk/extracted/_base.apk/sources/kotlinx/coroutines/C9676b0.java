package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u000f"}, m14357d2 = {"Lkotlinx/coroutines/b0;", "", "", "b", "()Z", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Throwable;", "cause", "handled", "<init>", "(Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9676b0 {

    /* renamed from: b */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f25414b = AtomicIntegerFieldUpdater.newUpdater(C9676b0.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a */
    public final Throwable f25415a;

    public C9676b0(Throwable th2, boolean z) {
        this.f25415a = th2;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: a */
    public final boolean m13572a() {
        return this._handled;
    }

    /* renamed from: b */
    public final boolean m13571b() {
        return f25414b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return C9839p0.m13120a(this) + '[' + this.f25415a + ']';
    }

    public /* synthetic */ C9676b0(Throwable th2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, (i & 2) != 0 ? false : z);
    }
}
