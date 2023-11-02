package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0005R\u0014\u0010\u0007\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m14357d2 = {"Lkotlinx/coroutines/i2;", "Lkotlinx/coroutines/CoroutineDispatcher;", "", "toString", "G0", "F0", "()Lkotlinx/coroutines/i2;", "immediate", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.i2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC9760i2 extends CoroutineDispatcher {
    /* renamed from: F0 */
    public abstract AbstractC9760i2 mo2767F0();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G0 */
    public final String m13344G0() {
        AbstractC9760i2 abstractC9760i2;
        AbstractC9760i2 m13568c = C9677b1.m13568c();
        if (this == m13568c) {
            return "Dispatchers.Main";
        }
        try {
            abstractC9760i2 = m13568c.mo2767F0();
        } catch (UnsupportedOperationException unused) {
            abstractC9760i2 = null;
        }
        if (this != abstractC9760i2) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String m13344G0 = m13344G0();
        if (m13344G0 == null) {
            return C9839p0.m13120a(this) + '@' + C9839p0.m13119b(this);
        }
        return m13344G0;
    }
}
