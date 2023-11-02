package mh;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9536e;
import kotlin.collections.C9538f;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: mh.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC10456a {

    /* renamed from: f */
    public static final C10457a f27296f = new C10457a(null);

    /* renamed from: a */
    private final int[] f27297a;

    /* renamed from: b */
    private final int f27298b;

    /* renamed from: c */
    private final int f27299c;

    /* renamed from: d */
    private final int f27300d;

    /* renamed from: e */
    private final List<Integer> f27301e;

    /* renamed from: mh.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C10457a {
        private C10457a() {
        }

        public /* synthetic */ C10457a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AbstractC10456a(int... numbers) {
        Integer m14237J;
        int i;
        Integer m14237J2;
        int i2;
        Integer m14237J3;
        List<Integer> m14104i;
        List m14275c;
        C9612q.m13917h(numbers, "numbers");
        this.f27297a = numbers;
        m14237J = C9538f.m14237J(numbers, 0);
        if (m14237J != null) {
            i = m14237J.intValue();
        } else {
            i = -1;
        }
        this.f27298b = i;
        m14237J2 = C9538f.m14237J(numbers, 1);
        if (m14237J2 != null) {
            i2 = m14237J2.intValue();
        } else {
            i2 = -1;
        }
        this.f27299c = i2;
        m14237J3 = C9538f.m14237J(numbers, 2);
        this.f27300d = m14237J3 != null ? m14237J3.intValue() : -1;
        if (numbers.length > 3) {
            if (numbers.length <= 1024) {
                m14275c = C9536e.m14275c(numbers);
                m14104i = C9553r.m14075C0(m14275c.subList(3, numbers.length));
            } else {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + '.');
            }
        } else {
            m14104i = C9545j.m14104i();
        }
        this.f27301e = m14104i;
    }

    /* renamed from: a */
    public final int m11507a() {
        return this.f27298b;
    }

    /* renamed from: b */
    public final int m11506b() {
        return this.f27299c;
    }

    /* renamed from: c */
    public final boolean m11505c(int i, int i2, int i3) {
        int i4 = this.f27298b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.f27299c;
        if (i5 > i2) {
            return true;
        }
        if (i5 >= i2 && this.f27300d >= i3) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m11504d(AbstractC10456a version) {
        C9612q.m13917h(version, "version");
        return m11505c(version.f27298b, version.f27299c, version.f27300d);
    }

    /* renamed from: e */
    public final boolean m11503e(int i, int i2, int i3) {
        int i4 = this.f27298b;
        if (i4 < i) {
            return true;
        }
        if (i4 > i) {
            return false;
        }
        int i5 = this.f27299c;
        if (i5 < i2) {
            return true;
        }
        if (i5 <= i2 && this.f27300d <= i3) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj != null && C9612q.m13922c(getClass(), obj.getClass())) {
            AbstractC10456a abstractC10456a = (AbstractC10456a) obj;
            if (this.f27298b == abstractC10456a.f27298b && this.f27299c == abstractC10456a.f27299c && this.f27300d == abstractC10456a.f27300d && C9612q.m13922c(this.f27301e, abstractC10456a.f27301e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m11502f(AbstractC10456a ourVersion) {
        C9612q.m13917h(ourVersion, "ourVersion");
        int i = this.f27298b;
        if (i == 0) {
            if (ourVersion.f27298b == 0 && this.f27299c == ourVersion.f27299c) {
                return true;
            }
        } else if (i == ourVersion.f27298b && this.f27299c <= ourVersion.f27299c) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final int[] m11501g() {
        return this.f27297a;
    }

    public int hashCode() {
        int i = this.f27298b;
        int i2 = i + (i * 31) + this.f27299c;
        int i3 = i2 + (i2 * 31) + this.f27300d;
        return i3 + (i3 * 31) + this.f27301e.hashCode();
    }

    public String toString() {
        String m14046d0;
        boolean z;
        int[] m11501g = m11501g();
        ArrayList arrayList = new ArrayList();
        for (int i : m11501g) {
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        if (arrayList.isEmpty()) {
            return "unknown";
        }
        m14046d0 = C9553r.m14046d0(arrayList, ".", null, null, 0, null, null, 62, null);
        return m14046d0;
    }
}