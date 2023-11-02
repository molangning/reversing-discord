package gg;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0013B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0014"}, m14357d2 = {"Lgg/g;", "Lgg/e;", "", "", "value", "", "o", "isEmpty", "other", "equals", "", "hashCode", "", "toString", ViewProps.START, "endInclusive", "<init>", "(JJ)V", "n", "a", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: gg.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6755g extends C6752e {

    /* renamed from: n */
    public static final C6756a f18993n = new C6756a(null);

    /* renamed from: o */
    private static final C6755g f18994o = new C6755g(1, 0);

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m14357d2 = {"Lgg/g$a;", "", "Lgg/g;", "EMPTY", "Lgg/g;", "a", "()Lgg/g;", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: gg.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6756a {
        private C6756a() {
        }

        public /* synthetic */ C6756a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C6755g m21949a() {
            return C6755g.f18994o;
        }
    }

    public C6755g(long j, long j2) {
        super(j, j2, 1L);
    }

    @Override // gg.C6752e
    public boolean equals(Object obj) {
        if (obj instanceof C6755g) {
            if (!isEmpty() || !((C6755g) obj).isEmpty()) {
                C6755g c6755g = (C6755g) obj;
                if (m21956a() != c6755g.m21956a() || m21955e() != c6755g.m21955e()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // gg.C6752e
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (m21956a() ^ (m21956a() >>> 32))) + (m21955e() ^ (m21955e() >>> 32)));
    }

    @Override // gg.C6752e
    public boolean isEmpty() {
        return m21956a() > m21955e();
    }

    /* renamed from: o */
    public boolean m21950o(long j) {
        return m21956a() <= j && j <= m21955e();
    }

    @Override // gg.C6752e
    public String toString() {
        return m21956a() + ".." + m21955e();
    }
}
