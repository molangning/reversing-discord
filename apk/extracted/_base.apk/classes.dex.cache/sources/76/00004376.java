package p233mf;

/* renamed from: mf.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10452e<T> {

    /* renamed from: a */
    final float f27287a;

    /* renamed from: b */
    int f27288b;

    /* renamed from: c */
    int f27289c;

    /* renamed from: d */
    int f27290d;

    /* renamed from: e */
    T[] f27291e;

    public C10452e() {
        this(16, 0.75f);
    }

    /* renamed from: c */
    static int m11517c(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    /* renamed from: a */
    public boolean m11519a(T t) {
        T t2;
        T[] tArr = this.f27291e;
        int i = this.f27288b;
        int m11517c = m11517c(t.hashCode()) & i;
        T t3 = tArr[m11517c];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                m11517c = (m11517c + 1) & i;
                t2 = tArr[m11517c];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[m11517c] = t;
        int i2 = this.f27289c + 1;
        this.f27289c = i2;
        if (i2 >= this.f27290d) {
            m11516d();
        }
        return true;
    }

    /* renamed from: b */
    public Object[] m11518b() {
        return this.f27291e;
    }

    /* renamed from: d */
    void m11516d() {
        T t;
        T[] tArr = this.f27291e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        int i3 = this.f27289c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                    t = tArr[length];
                } while (t == null);
                int m11517c = m11517c(t.hashCode()) & i2;
                if (tArr2[m11517c] != null) {
                    do {
                        m11517c = (m11517c + 1) & i2;
                    } while (tArr2[m11517c] != null);
                }
                tArr2[m11517c] = tArr[length];
                i3 = i4;
            } else {
                this.f27288b = i2;
                this.f27290d = (int) (i * this.f27287a);
                this.f27291e = tArr2;
                return;
            }
        }
    }

    /* renamed from: e */
    public boolean m11515e(T t) {
        T t2;
        T[] tArr = this.f27291e;
        int i = this.f27288b;
        int m11517c = m11517c(t.hashCode()) & i;
        T t3 = tArr[m11517c];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return m11514f(m11517c, tArr, i);
        }
        do {
            m11517c = (m11517c + 1) & i;
            t2 = tArr[m11517c];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return m11514f(m11517c, tArr, i);
    }

    /* renamed from: f */
    boolean m11514f(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f27289c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int m11517c = m11517c(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i < m11517c && m11517c <= i3) {
                        i4 = i3 + 1;
                    }
                } else {
                    if (i >= m11517c && m11517c > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    public C10452e(int i, float f) {
        this.f27287a = f;
        int m11513a = C10453f.m11513a(i);
        this.f27288b = m11513a - 1;
        this.f27290d = (int) (f * m11513a);
        this.f27291e = (T[]) new Object[m11513a];
    }
}