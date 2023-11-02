package pf;

import co.discord.media_engine.C2689b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0087@\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0014\b\u0001\u0012\u0006\u0010\u0012\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\u0088\u0001\u0012\u0092\u0001\u00020\rø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m14357d2 = {"Lpf/d0;", "", "", "e", "(J)Ljava/lang/String;", "", "d", "(J)I", "", "other", "", "c", "(JLjava/lang/Object;)Z", "", "j", "J", "getData$annotations", "()V", "data", "b", "(J)J", "k", "a", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pf.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11555d0 implements Comparable<C11555d0> {

    /* renamed from: k */
    public static final C11556a f30064k = new C11556a(null);

    /* renamed from: j */
    private final long f30065j;

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\f"}, m14357d2 = {"Lpf/d0$a;", "", "Lpf/d0;", "MAX_VALUE", "J", "MIN_VALUE", "", "SIZE_BITS", "I", "SIZE_BYTES", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pf.d0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11556a {
        private C11556a() {
        }

        public /* synthetic */ C11556a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ C11555d0(long j) {
        this.f30065j = j;
    }

    /* renamed from: a */
    public static final /* synthetic */ C11555d0 m7662a(long j) {
        return new C11555d0(j);
    }

    /* renamed from: b */
    public static long m7661b(long j) {
        return j;
    }

    /* renamed from: c */
    public static boolean m7660c(long j, Object obj) {
        return (obj instanceof C11555d0) && j == ((C11555d0) obj).m7657f();
    }

    /* renamed from: d */
    public static int m7659d(long j) {
        return C2689b.m32716a(j);
    }

    /* renamed from: e */
    public static String m7658e(long j) {
        return C11574k0.m7607c(j);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C11555d0 c11555d0) {
        return C11574k0.m7608b(m7657f(), c11555d0.m7657f());
    }

    public boolean equals(Object obj) {
        return m7660c(this.f30065j, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ long m7657f() {
        return this.f30065j;
    }

    public int hashCode() {
        return m7659d(this.f30065j);
    }

    public String toString() {
        return m7658e(this.f30065j);
    }
}