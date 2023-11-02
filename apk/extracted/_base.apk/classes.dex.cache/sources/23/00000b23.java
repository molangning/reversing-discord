package p045cj;

import com.facebook.react.uimanager.ViewProps;
import gg.C6759j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11552c0;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\u0002H\u0010ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, m14357d2 = {"Lcj/h2;", "Lcj/q1;", "Lpf/c0;", "", "requiredCapacity", "", "b", "(I)V", "Lpf/b0;", "c", "e", "f", "()[I", "a", "[I", "buffer", "<set-?>", "I", "d", "()I", ViewProps.POSITION, "bufferWithData", "<init>", "([ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.h2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2595h2 extends AbstractC2632q1<C11552c0> {

    /* renamed from: a */
    private int[] f7064a;

    /* renamed from: b */
    private int f7065b;

    private C2595h2(int[] iArr) {
        this.f7064a = iArr;
        this.f7065b = C11552c0.m7672t(iArr);
        mo32766b(10);
    }

    public /* synthetic */ C2595h2(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    @Override // p045cj.AbstractC2632q1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C11552c0 mo32767a() {
        return C11552c0.m7681a(m32893f());
    }

    @Override // p045cj.AbstractC2632q1
    /* renamed from: b */
    public void mo32766b(int i) {
        int m21930c;
        if (C11552c0.m7672t(this.f7064a) < i) {
            int[] iArr = this.f7064a;
            m21930c = C6759j.m21930c(i, C11552c0.m7672t(iArr) * 2);
            int[] copyOf = Arrays.copyOf(iArr, m21930c);
            C9612q.m13918g(copyOf, "copyOf(this, newSize)");
            this.f7064a = C11552c0.m7679h(copyOf);
        }
    }

    @Override // p045cj.AbstractC2632q1
    /* renamed from: d */
    public int mo32765d() {
        return this.f7065b;
    }

    /* renamed from: e */
    public final void m32894e(int i) {
        AbstractC2632q1.m32829c(this, 0, 1, null);
        int[] iArr = this.f7064a;
        int mo32765d = mo32765d();
        this.f7065b = mo32765d + 1;
        C11552c0.m7668x(iArr, mo32765d, i);
    }

    /* renamed from: f */
    public int[] m32893f() {
        int[] copyOf = Arrays.copyOf(this.f7064a, mo32765d());
        C9612q.m13918g(copyOf, "copyOf(this, newSize)");
        return C11552c0.m7679h(copyOf);
    }
}