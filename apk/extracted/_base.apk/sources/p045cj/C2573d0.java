package p045cj;

import com.facebook.react.uimanager.ViewProps;
import gg.C6759j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m14357d2 = {"Lcj/d0;", "Lcj/q1;", "", "", "requiredCapacity", "", "b", "(I)V", "", "c", "e", "(F)V", "f", "()[F", "a", "[F", "buffer", "<set-?>", "I", "d", "()I", ViewProps.POSITION, "bufferWithData", "<init>", "([F)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2573d0 extends AbstractC2632q1<float[]> {

    /* renamed from: a */
    private float[] f7029a;

    /* renamed from: b */
    private int f7030b;

    public C2573d0(float[] bufferWithData) {
        C9612q.m13917h(bufferWithData, "bufferWithData");
        this.f7029a = bufferWithData;
        this.f7030b = bufferWithData.length;
        mo32766b(10);
    }

    @Override // p045cj.AbstractC2632q1
    /* renamed from: b */
    public void mo32766b(int i) {
        int m21930c;
        float[] fArr = this.f7029a;
        if (fArr.length < i) {
            m21930c = C6759j.m21930c(i, fArr.length * 2);
            float[] copyOf = Arrays.copyOf(fArr, m21930c);
            C9612q.m13918g(copyOf, "copyOf(this, newSize)");
            this.f7029a = copyOf;
        }
    }

    @Override // p045cj.AbstractC2632q1
    /* renamed from: d */
    public int mo32765d() {
        return this.f7030b;
    }

    /* renamed from: e */
    public final void m32935e(float f) {
        AbstractC2632q1.m32829c(this, 0, 1, null);
        float[] fArr = this.f7029a;
        int mo32765d = mo32765d();
        this.f7030b = mo32765d + 1;
        fArr[mo32765d] = f;
    }

    @Override // p045cj.AbstractC2632q1
    /* renamed from: f */
    public float[] mo32767a() {
        float[] copyOf = Arrays.copyOf(this.f7029a, mo32765d());
        C9612q.m13918g(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
