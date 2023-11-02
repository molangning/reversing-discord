package pf;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001bJ \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0011\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010¨\u0006\u001d"}, m14357d2 = {"Lpf/k;", "", "", "major", "minor", "patch", "b", "", "toString", "", "other", "", "equals", "hashCode", "a", "j", "I", "getMajor", "()I", "k", "getMinor", "l", "getPatch", "m", "version", "<init>", "(III)V", "(II)V", "n", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pf.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11572k implements Comparable<C11572k> {

    /* renamed from: n */
    public static final C11573a f30078n = new C11573a(null);

    /* renamed from: o */
    public static final C11572k f30079o = C11575l.m7605a();

    /* renamed from: j */
    private final int f30080j;

    /* renamed from: k */
    private final int f30081k;

    /* renamed from: l */
    private final int f30082l;

    /* renamed from: m */
    private final int f30083m;

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m14357d2 = {"Lpf/k$a;", "", "Lpf/k;", "CURRENT", "Lpf/k;", "", "MAX_COMPONENT_VALUE", "I", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pf.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11573a {
        private C11573a() {
        }

        public /* synthetic */ C11573a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C11572k(int i, int i2, int i3) {
        this.f30080j = i;
        this.f30081k = i2;
        this.f30082l = i3;
        this.f30083m = m7610b(i, i2, i3);
    }

    /* renamed from: b */
    private final int m7610b(int i, int i2, int i3) {
        boolean z = false;
        if (new IntRange(0, 255).contains(i) && new IntRange(0, 255).contains(i2) && new IntRange(0, 255).contains(i3)) {
            z = true;
        }
        if (z) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C11572k other) {
        C9612q.m13917h(other, "other");
        return this.f30083m - other.f30083m;
    }

    public boolean equals(Object obj) {
        C11572k c11572k;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11572k) {
            c11572k = (C11572k) obj;
        } else {
            c11572k = null;
        }
        if (c11572k != null && this.f30083m == c11572k.f30083m) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f30083m;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30080j);
        sb2.append('.');
        sb2.append(this.f30081k);
        sb2.append('.');
        sb2.append(this.f30082l);
        return sb2.toString();
    }

    public C11572k(int i, int i2) {
        this(i, i2, 0);
    }
}