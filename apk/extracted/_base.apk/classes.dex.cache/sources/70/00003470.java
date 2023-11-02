package gg;

import cg.InterfaceC2533a;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p304qf.AbstractC11884q;
import wf.C13538c;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0016\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B!\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u001e"}, m14357d2 = {"Lgg/e;", "", "", "Lqf/q;", "i", "", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "j", "J", "a", "()J", "first", "k", "e", "last", "l", "h", "step", ViewProps.START, "endInclusive", "<init>", "(JJJ)V", "m", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: gg.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6752e implements Iterable<Long>, InterfaceC2533a {

    /* renamed from: m */
    public static final C6753a f18985m = new C6753a(null);

    /* renamed from: j */
    private final long f18986j;

    /* renamed from: k */
    private final long f18987k;

    /* renamed from: l */
    private final long f18988l;

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\n"}, m14357d2 = {"Lgg/e$a;", "", "", "rangeStart", "rangeEnd", "step", "Lgg/e;", "a", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: gg.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6753a {
        private C6753a() {
        }

        public /* synthetic */ C6753a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C6752e m21952a(long j, long j2, long j3) {
            return new C6752e(j, j2, j3);
        }
    }

    public C6752e(long j, long j2, long j3) {
        if (j3 != 0) {
            if (j3 != Long.MIN_VALUE) {
                this.f18986j = j;
                this.f18987k = C13538c.m2276d(j, j2, j3);
                this.f18988l = j3;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    /* renamed from: a */
    public final long m21956a() {
        return this.f18986j;
    }

    /* renamed from: e */
    public final long m21955e() {
        return this.f18987k;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6752e) {
            if (!isEmpty() || !((C6752e) obj).isEmpty()) {
                C6752e c6752e = (C6752e) obj;
                if (this.f18986j != c6752e.f18986j || this.f18987k != c6752e.f18987k || this.f18988l != c6752e.f18988l) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final long m21954h() {
        return this.f18988l;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = 31;
        long j2 = this.f18986j;
        long j3 = this.f18987k;
        long j4 = j * (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32)));
        long j5 = this.f18988l;
        return (int) (j4 + (j5 ^ (j5 >>> 32)));
    }

    @Override // java.lang.Iterable
    /* renamed from: i */
    public AbstractC11884q iterator() {
        return new C6754f(this.f18986j, this.f18987k, this.f18988l);
    }

    public boolean isEmpty() {
        int i = (this.f18988l > 0L ? 1 : (this.f18988l == 0L ? 0 : -1));
        long j = this.f18986j;
        long j2 = this.f18987k;
        if (i > 0) {
            if (j > j2) {
                return true;
            }
        } else if (j < j2) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2;
        long j;
        if (this.f18988l > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f18986j);
            sb2.append("..");
            sb2.append(this.f18987k);
            sb2.append(" step ");
            j = this.f18988l;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f18986j);
            sb2.append(" downTo ");
            sb2.append(this.f18987k);
            sb2.append(" step ");
            j = -this.f18988l;
        }
        sb2.append(j);
        return sb2.toString();
    }
}