package p045cj;

import com.facebook.react.uimanager.ViewProps;
import gg.C6759j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m14357d2 = {"Lcj/w;", "Lcj/q1;", "", "", "requiredCapacity", "", "b", "(I)V", "", "c", "e", "(D)V", "f", "()[D", "a", "[D", "buffer", "<set-?>", "I", "d", "()I", ViewProps.POSITION, "bufferWithData", "<init>", "([D)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2648w extends AbstractC2632q1<double[]> {

    /* renamed from: a */
    private double[] f7127a;

    /* renamed from: b */
    private int f7128b;

    public C2648w(double[] bufferWithData) {
        C9612q.m13917h(bufferWithData, "bufferWithData");
        this.f7127a = bufferWithData;
        this.f7128b = bufferWithData.length;
        mo32766b(10);
    }

    @Override // p045cj.AbstractC2632q1
    /* renamed from: b */
    public void mo32766b(int i) {
        int m21930c;
        double[] dArr = this.f7127a;
        if (dArr.length < i) {
            m21930c = C6759j.m21930c(i, dArr.length * 2);
            double[] copyOf = Arrays.copyOf(dArr, m21930c);
            C9612q.m13918g(copyOf, "copyOf(this, newSize)");
            this.f7127a = copyOf;
        }
    }

    @Override // p045cj.AbstractC2632q1
    /* renamed from: d */
    public int mo32765d() {
        return this.f7128b;
    }

    /* renamed from: e */
    public final void m32784e(double d) {
        AbstractC2632q1.m32829c(this, 0, 1, null);
        double[] dArr = this.f7127a;
        int mo32765d = mo32765d();
        this.f7128b = mo32765d + 1;
        dArr[mo32765d] = d;
    }

    @Override // p045cj.AbstractC2632q1
    /* renamed from: f */
    public double[] mo32767a() {
        double[] copyOf = Arrays.copyOf(this.f7127a, mo32765d());
        C9612q.m13918g(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
