package p045cj;

import com.facebook.react.uimanager.ViewProps;
import gg.C6759j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m14357d2 = {"Lcj/g;", "Lcj/q1;", "", "", "requiredCapacity", "", "b", "(I)V", "", "c", "e", "(Z)V", "f", "()[Z", "a", "[Z", "buffer", "<set-?>", "I", "d", "()I", ViewProps.POSITION, "bufferWithData", "<init>", "([Z)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2586g extends AbstractC2632q1<boolean[]> {

    /* renamed from: a */
    private boolean[] f7049a;

    /* renamed from: b */
    private int f7050b;

    public C2586g(boolean[] bufferWithData) {
        C9612q.m13917h(bufferWithData, "bufferWithData");
        this.f7049a = bufferWithData;
        this.f7050b = bufferWithData.length;
        mo32766b(10);
    }

    @Override // p045cj.AbstractC2632q1
    /* renamed from: b */
    public void mo32766b(int i) {
        int m21930c;
        boolean[] zArr = this.f7049a;
        if (zArr.length < i) {
            m21930c = C6759j.m21930c(i, zArr.length * 2);
            boolean[] copyOf = Arrays.copyOf(zArr, m21930c);
            C9612q.m13918g(copyOf, "copyOf(this, newSize)");
            this.f7049a = copyOf;
        }
    }

    @Override // p045cj.AbstractC2632q1
    /* renamed from: d */
    public int mo32765d() {
        return this.f7050b;
    }

    /* renamed from: e */
    public final void m32910e(boolean z) {
        AbstractC2632q1.m32829c(this, 0, 1, null);
        boolean[] zArr = this.f7049a;
        int mo32765d = mo32765d();
        this.f7050b = mo32765d + 1;
        zArr[mo32765d] = z;
    }

    @Override // p045cj.AbstractC2632q1
    /* renamed from: f */
    public boolean[] mo32767a() {
        boolean[] copyOf = Arrays.copyOf(this.f7049a, mo32765d());
        C9612q.m13918g(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
