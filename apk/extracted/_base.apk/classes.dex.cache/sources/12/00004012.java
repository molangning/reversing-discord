package kotlin.ranges;

import cg.InterfaceC2533a;
import com.facebook.react.uimanager.ViewProps;
import gg.C6751d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p304qf.AbstractC11883p;
import wf.C13538c;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0016\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB!\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u001d"}, m14357d2 = {"Lkotlin/ranges/a;", "", "", "Lqf/p;", "i", "", "isEmpty", "", "other", "equals", "hashCode", "", "toString", "j", "I", "a", "()I", "first", "k", "e", "last", "l", "h", "step", ViewProps.START, "endInclusive", "<init>", "(III)V", "m", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlin.ranges.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9627a implements Iterable<Integer>, InterfaceC2533a {

    /* renamed from: m */
    public static final C9628a f25362m = new C9628a(null);

    /* renamed from: j */
    private final int f25363j;

    /* renamed from: k */
    private final int f25364k;

    /* renamed from: l */
    private final int f25365l;

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\n"}, m14357d2 = {"Lkotlin/ranges/a$a;", "", "", "rangeStart", "rangeEnd", "step", "Lkotlin/ranges/a;", "a", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.ranges.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9628a {
        private C9628a() {
        }

        public /* synthetic */ C9628a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9627a m13886a(int i, int i2, int i3) {
            return new C9627a(i, i2, i3);
        }
    }

    public C9627a(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.f25363j = i;
                this.f25364k = C13538c.m2277c(i, i2, i3);
                this.f25365l = i3;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    /* renamed from: a */
    public final int m13890a() {
        return this.f25363j;
    }

    /* renamed from: e */
    public final int m13889e() {
        return this.f25364k;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9627a) {
            if (!isEmpty() || !((C9627a) obj).isEmpty()) {
                C9627a c9627a = (C9627a) obj;
                if (this.f25363j != c9627a.f25363j || this.f25364k != c9627a.f25364k || this.f25365l != c9627a.f25365l) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final int m13888h() {
        return this.f25365l;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f25363j * 31) + this.f25364k) * 31) + this.f25365l;
    }

    @Override // java.lang.Iterable
    /* renamed from: i */
    public AbstractC11883p iterator() {
        return new C6751d(this.f25363j, this.f25364k, this.f25365l);
    }

    public boolean isEmpty() {
        if (this.f25365l > 0) {
            if (this.f25363j > this.f25364k) {
                return true;
            }
        } else if (this.f25363j < this.f25364k) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2;
        int i;
        if (this.f25365l > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f25363j);
            sb2.append("..");
            sb2.append(this.f25364k);
            sb2.append(" step ");
            i = this.f25365l;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f25363j);
            sb2.append(" downTo ");
            sb2.append(this.f25364k);
            sb2.append(" step ");
            i = -this.f25365l;
        }
        sb2.append(i);
        return sb2.toString();
    }
}