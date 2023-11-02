package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractC9760i2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.InterfaceC9688d1;
import kotlinx.coroutines.InterfaceC9899u0;
import pf.C11568i;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b!\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016J\u001e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, m14357d2 = {"Lkotlinx/coroutines/internal/w;", "Lkotlinx/coroutines/i2;", "Lkotlinx/coroutines/u0;", "", "I0", "Lkotlin/coroutines/CoroutineContext;", "context", "", "D0", "", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlinx/coroutines/d1;", "R", "H0", "Lkotlinx/coroutines/CancellableContinuation;", "", "continuation", "J0", "", "toString", "", "l", "Ljava/lang/Throwable;", "cause", "m", "Ljava/lang/String;", "errorHint", "F0", "()Lkotlinx/coroutines/i2;", "immediate", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9805w extends AbstractC9760i2 implements InterfaceC9899u0 {

    /* renamed from: l */
    private final Throwable f25631l;

    /* renamed from: m */
    private final String f25632m;

    public C9805w(Throwable th2, String str) {
        this.f25631l = th2;
        this.f25632m = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 == null) goto L10;
     */
    /* renamed from: I0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Void m13203I0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f25631l
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f25632m
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f25631l
            r1.<init>(r0, r2)
            throw r1
        L36:
            kotlinx.coroutines.internal.C9804v.m13206d()
            pf.i r0 = new pf.i
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C9805w.m13203I0():java.lang.Void");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: D0 */
    public boolean mo2768D0(CoroutineContext coroutineContext) {
        m13203I0();
        throw new C11568i();
    }

    @Override // kotlinx.coroutines.AbstractC9760i2
    /* renamed from: F0 */
    public AbstractC9760i2 mo2767F0() {
        return this;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: H0 */
    public Void mo2769B0(CoroutineContext coroutineContext, Runnable runnable) {
        m13203I0();
        throw new C11568i();
    }

    @Override // kotlinx.coroutines.InterfaceC9899u0
    /* renamed from: J0 */
    public Void mo2761v(long j, CancellableContinuation<? super Unit> cancellableContinuation) {
        m13203I0();
        throw new C11568i();
    }

    @Override // kotlinx.coroutines.InterfaceC9899u0
    /* renamed from: R */
    public InterfaceC9688d1 mo2760R(long j, Runnable runnable, CoroutineContext coroutineContext) {
        m13203I0();
        throw new C11568i();
    }

    @Override // kotlinx.coroutines.AbstractC9760i2, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f25631l != null) {
            str = ", cause=" + this.f25631l;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }
}
