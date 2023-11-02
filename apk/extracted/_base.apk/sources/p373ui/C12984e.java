package p373ui;

import kotlin.Metadata;
import p373ui.C12985f;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0015\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\u0015"}, m14357d2 = {"Lui/e;", "", "", "d", "", "toString", "Lui/f$a;", "c", "()J", "timeMark", "Lkotlin/time/Duration;", "b", "(J)J", "one", "another", "a", "(JJ)J", "J", "zero", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: ui.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12984e {

    /* renamed from: a */
    public static final C12984e f33747a = new C12984e();

    /* renamed from: b */
    private static final long f33748b = System.nanoTime();

    private C12984e() {
    }

    /* renamed from: d */
    private final long m3528d() {
        return System.nanoTime() - f33748b;
    }

    /* renamed from: a */
    public final long m3531a(long j, long j2) {
        return C12983d.m3532c(j, j2);
    }

    /* renamed from: b */
    public final long m3530b(long j) {
        return C12983d.m3534a(m3528d(), j);
    }

    /* renamed from: c */
    public long m3529c() {
        return C12985f.C12986a.m3523d(m3528d());
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
