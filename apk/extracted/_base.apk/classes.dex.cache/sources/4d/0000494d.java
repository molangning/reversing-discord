package pf;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087@\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0014\b\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m14357d2 = {"Lpf/b0;", "", "", "e", "(I)Ljava/lang/String;", "", "d", "(I)I", "", "other", "", "c", "(ILjava/lang/Object;)Z", "j", "I", "getData$annotations", "()V", "data", "b", "k", "a", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pf.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11549b0 implements Comparable<C11549b0> {

    /* renamed from: k */
    public static final C11550a f30055k = new C11550a(null);

    /* renamed from: j */
    private final int f30056j;

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u000b"}, m14357d2 = {"Lpf/b0$a;", "", "Lpf/b0;", "MAX_VALUE", "I", "MIN_VALUE", "", "SIZE_BITS", "SIZE_BYTES", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pf.b0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11550a {
        private C11550a() {
        }

        public /* synthetic */ C11550a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ C11549b0(int i) {
        this.f30056j = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ C11549b0 m7687a(int i) {
        return new C11549b0(i);
    }

    /* renamed from: b */
    public static int m7686b(int i) {
        return i;
    }

    /* renamed from: c */
    public static boolean m7685c(int i, Object obj) {
        return (obj instanceof C11549b0) && i == ((C11549b0) obj).m7682f();
    }

    /* renamed from: d */
    public static int m7684d(int i) {
        return i;
    }

    /* renamed from: e */
    public static String m7683e(int i) {
        return String.valueOf(i & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C11549b0 c11549b0) {
        return C11574k0.m7609a(m7682f(), c11549b0.m7682f());
    }

    public boolean equals(Object obj) {
        return m7685c(this.f30056j, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ int m7682f() {
        return this.f30056j;
    }

    public int hashCode() {
        return m7684d(this.f30056j);
    }

    public String toString() {
        return m7683e(this.f30056j);
    }
}