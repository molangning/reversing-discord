package p045cj;

import com.facebook.react.uimanager.ViewProps;
import gg.C6759j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11558e0;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0002ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u0002H\u0010ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR\u001f\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0019"}, m14357d2 = {"Lcj/j2;", "Lcj/q1;", "Lpf/e0;", "", "requiredCapacity", "", "b", "(I)V", "Lpf/d0;", "c", "e", "(J)V", "f", "()[J", "a", "[J", "buffer", "<set-?>", "I", "d", "()I", ViewProps.POSITION, "bufferWithData", "<init>", "([JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.j2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2604j2 extends AbstractC2632q1<C11558e0> {

    /* renamed from: a */
    private long[] f7077a;

    /* renamed from: b */
    private int f7078b;

    private C2604j2(long[] jArr) {
        this.f7077a = jArr;
        this.f7078b = C11558e0.m7645t(jArr);
        mo32766b(10);
    }

    public /* synthetic */ C2604j2(long[] jArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }

    @Override // p045cj.AbstractC2632q1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C11558e0 mo32767a() {
        return C11558e0.m7654a(m32874f());
    }

    @Override // p045cj.AbstractC2632q1
    /* renamed from: b */
    public void mo32766b(int i) {
        int m21930c;
        if (C11558e0.m7645t(this.f7077a) < i) {
            long[] jArr = this.f7077a;
            m21930c = C6759j.m21930c(i, C11558e0.m7645t(jArr) * 2);
            long[] copyOf = Arrays.copyOf(jArr, m21930c);
            C9612q.m13918g(copyOf, "copyOf(this, newSize)");
            this.f7077a = C11558e0.m7652h(copyOf);
        }
    }

    @Override // p045cj.AbstractC2632q1
    /* renamed from: d */
    public int mo32765d() {
        return this.f7078b;
    }

    /* renamed from: e */
    public final void m32875e(long j) {
        AbstractC2632q1.m32829c(this, 0, 1, null);
        long[] jArr = this.f7077a;
        int mo32765d = mo32765d();
        this.f7078b = mo32765d + 1;
        C11558e0.m7641x(jArr, mo32765d, j);
    }

    /* renamed from: f */
    public long[] m32874f() {
        long[] copyOf = Arrays.copyOf(this.f7077a, mo32765d());
        C9612q.m13918g(copyOf, "copyOf(this, newSize)");
        return C11558e0.m7652h(copyOf);
    }
}