package pf;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\n\b\u0087@\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0014\b\u0001\u0012\u0006\u0010\u0012\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\u0088\u0001\u0012\u0092\u0001\u00020\rø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m14357d2 = {"Lpf/z;", "", "", "e", "(B)Ljava/lang/String;", "", "d", "(B)I", "", "other", "", "c", "(BLjava/lang/Object;)Z", "", "j", "B", "getData$annotations", "()V", "data", "b", "(B)B", "k", "a", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pf.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11593z implements Comparable<C11593z> {

    /* renamed from: k */
    public static final C11594a f30104k = new C11594a(null);

    /* renamed from: j */
    private final byte f30105j;

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\f"}, m14357d2 = {"Lpf/z$a;", "", "Lpf/z;", "MAX_VALUE", "B", "MIN_VALUE", "", "SIZE_BITS", "I", "SIZE_BYTES", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pf.z$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11594a {
        private C11594a() {
        }

        public /* synthetic */ C11594a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ C11593z(byte b) {
        this.f30105j = b;
    }

    /* renamed from: a */
    public static final /* synthetic */ C11593z m7576a(byte b) {
        return new C11593z(b);
    }

    /* renamed from: b */
    public static byte m7575b(byte b) {
        return b;
    }

    /* renamed from: c */
    public static boolean m7574c(byte b, Object obj) {
        return (obj instanceof C11593z) && b == ((C11593z) obj).m7571f();
    }

    /* renamed from: d */
    public static int m7573d(byte b) {
        return b;
    }

    /* renamed from: e */
    public static String m7572e(byte b) {
        return String.valueOf(b & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C11593z c11593z) {
        return C9612q.m13915j(m7571f() & 255, c11593z.m7571f() & 255);
    }

    public boolean equals(Object obj) {
        return m7574c(this.f30105j, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ byte m7571f() {
        return this.f30105j;
    }

    public int hashCode() {
        return m7573d(this.f30105j);
    }

    public String toString() {
        return m7572e(this.f30105j);
    }
}