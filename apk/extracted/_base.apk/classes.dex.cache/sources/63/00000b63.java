package p045cj;

import kotlin.Metadata;
import kotlin.collections.C9538f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\nB)\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u001a"}, m14357d2 = {"Lcj/z;", "", "", "elementsCount", "", "e", "index", "", "b", "c", "a", "d", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlin/Function2;", "", "Lkotlin/jvm/functions/Function2;", "readIfAbsent", "", "J", "lowerMarks", "[J", "highMarksArray", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function2;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2659z {

    /* renamed from: e */
    private static final C2660a f7149e = new C2660a(null);
    @Deprecated

    /* renamed from: f */
    private static final long[] f7150f = new long[0];

    /* renamed from: a */
    private final SerialDescriptor f7151a;

    /* renamed from: b */
    private final Function2<SerialDescriptor, Integer, Boolean> f7152b;

    /* renamed from: c */
    private long f7153c;

    /* renamed from: d */
    private final long[] f7154d;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lcj/z$a;", "", "", "EMPTY_HIGH_MARKS", "[J", "<init>", "()V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: cj.z$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static final class C2660a {
        private C2660a() {
        }

        public /* synthetic */ C2660a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2659z(SerialDescriptor descriptor, Function2<? super SerialDescriptor, ? super Integer, Boolean> readIfAbsent) {
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(readIfAbsent, "readIfAbsent");
        this.f7151a = descriptor;
        this.f7152b = readIfAbsent;
        int mo12687d = descriptor.mo12687d();
        if (mo12687d <= 64) {
            this.f7153c = mo12687d != 64 ? (-1) << mo12687d : 0L;
            this.f7154d = f7150f;
            return;
        }
        this.f7153c = 0L;
        this.f7154d = m32758e(mo12687d);
    }

    /* renamed from: b */
    private final void m32761b(int i) {
        int i2 = (i >>> 6) - 1;
        long[] jArr = this.f7154d;
        jArr[i2] = jArr[i2] | (1 << (i & 63));
    }

    /* renamed from: c */
    private final int m32760c() {
        int length = this.f7154d.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = i2 * 64;
            long j = this.f7154d[i];
            while (j != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                j |= 1 << numberOfTrailingZeros;
                int i4 = numberOfTrailingZeros + i3;
                if (this.f7152b.invoke(this.f7151a, Integer.valueOf(i4)).booleanValue()) {
                    this.f7154d[i] = j;
                    return i4;
                }
            }
            this.f7154d[i] = j;
            i = i2;
        }
        return -1;
    }

    /* renamed from: e */
    private final long[] m32758e(int i) {
        int m14241H;
        long[] jArr = new long[(i - 1) >>> 6];
        if ((i & 63) != 0) {
            m14241H = C9538f.m14241H(jArr);
            jArr[m14241H] = (-1) << i;
        }
        return jArr;
    }

    /* renamed from: a */
    public final void m32762a(int i) {
        if (i < 64) {
            this.f7153c |= 1 << i;
        } else {
            m32761b(i);
        }
    }

    /* renamed from: d */
    public final int m32759d() {
        int numberOfTrailingZeros;
        int mo12687d = this.f7151a.mo12687d();
        do {
            long j = this.f7153c;
            if (j != -1) {
                numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                this.f7153c |= 1 << numberOfTrailingZeros;
            } else if (mo12687d > 64) {
                return m32760c();
            } else {
                return -1;
            }
        } while (!this.f7152b.invoke(this.f7151a, Integer.valueOf(numberOfTrailingZeros)).booleanValue());
        return numberOfTrailingZeros;
    }
}