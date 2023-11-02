package p045cj;

import com.facebook.react.uimanager.ViewProps;
import gg.C6759j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m14357d2 = {"Lcj/l0;", "Lcj/q1;", "", "", "requiredCapacity", "", "b", "(I)V", "c", "e", "f", "()[I", "a", "[I", "buffer", "<set-?>", "I", "d", "()I", ViewProps.POSITION, "bufferWithData", "<init>", "([I)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2611l0 extends AbstractC2632q1<int[]> {

    /* renamed from: a */
    private int[] f7083a;

    /* renamed from: b */
    private int f7084b;

    public C2611l0(int[] bufferWithData) {
        C9612q.m13917h(bufferWithData, "bufferWithData");
        this.f7083a = bufferWithData;
        this.f7084b = bufferWithData.length;
        mo32766b(10);
    }

    @Override // p045cj.AbstractC2632q1
    /* renamed from: b */
    public void mo32766b(int i) {
        int m21930c;
        int[] iArr = this.f7083a;
        if (iArr.length < i) {
            m21930c = C6759j.m21930c(i, iArr.length * 2);
            int[] copyOf = Arrays.copyOf(iArr, m21930c);
            C9612q.m13918g(copyOf, "copyOf(this, newSize)");
            this.f7083a = copyOf;
        }
    }

    @Override // p045cj.AbstractC2632q1
    /* renamed from: d */
    public int mo32765d() {
        return this.f7084b;
    }

    /* renamed from: e */
    public final void m32870e(int i) {
        AbstractC2632q1.m32829c(this, 0, 1, null);
        int[] iArr = this.f7083a;
        int mo32765d = mo32765d();
        this.f7084b = mo32765d + 1;
        iArr[mo32765d] = i;
    }

    @Override // p045cj.AbstractC2632q1
    /* renamed from: f */
    public int[] mo32767a() {
        int[] copyOf = Arrays.copyOf(this.f7083a, mo32765d());
        C9612q.m13918g(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
