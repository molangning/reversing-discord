package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.internal.InterfaceC9783j0;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b&\u0010'J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082\u0010¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082\u0010¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR$\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\u000f\u0010\nR\u0011\u0010%\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, m14357d2 = {"Lkotlinx/coroutines/internal/i0;", "Lkotlinx/coroutines/internal/j0;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "i", "", "l", "(I)V", "k", "", "f", "()[Lkotlinx/coroutines/internal/j0;", "j", "m", "(II)V", "e", "()Lkotlinx/coroutines/internal/j0;", "node", "", "g", "(Lkotlinx/coroutines/internal/j0;)Z", "b", "index", "h", "(I)Lkotlinx/coroutines/internal/j0;", "a", "(Lkotlinx/coroutines/internal/j0;)V", "[Lkotlinx/coroutines/internal/j0;", "value", "c", "()I", "size", "d", "()Z", "isEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9781i0<T extends InterfaceC9783j0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    private T[] f25592a;

    /* renamed from: f */
    private final T[] m13284f() {
        T[] tArr = this.f25592a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new InterfaceC9783j0[4];
            this.f25592a = tArr2;
            return tArr2;
        } else if (m13287c() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, m13287c() * 2);
            C9612q.m13918g(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((InterfaceC9783j0[]) copyOf);
            this.f25592a = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    /* renamed from: j */
    private final void m13280j(int i) {
        this._size = i;
    }

    /* renamed from: k */
    private final void m13279k(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 >= m13287c()) {
                return;
            }
            T[] tArr = this.f25592a;
            C9612q.m13920e(tArr);
            int i3 = i2 + 1;
            if (i3 < m13287c()) {
                T t = tArr[i3];
                C9612q.m13920e(t);
                T t2 = tArr[i2];
                C9612q.m13920e(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    i2 = i3;
                }
            }
            T t3 = tArr[i];
            C9612q.m13920e(t3);
            T t4 = tArr[i2];
            C9612q.m13920e(t4);
            if (((Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            m13277m(i, i2);
            i = i2;
        }
    }

    /* renamed from: l */
    private final void m13278l(int i) {
        while (i > 0) {
            T[] tArr = this.f25592a;
            C9612q.m13920e(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            C9612q.m13920e(t);
            T t2 = tArr[i];
            C9612q.m13920e(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            m13277m(i, i2);
            i = i2;
        }
    }

    /* renamed from: m */
    private final void m13277m(int i, int i2) {
        T[] tArr = this.f25592a;
        C9612q.m13920e(tArr);
        T t = tArr[i2];
        C9612q.m13920e(t);
        T t2 = tArr[i];
        C9612q.m13920e(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }

    /* renamed from: a */
    public final void m13289a(T t) {
        t.mo13275a(this);
        T[] m13284f = m13284f();
        int m13287c = m13287c();
        m13280j(m13287c + 1);
        m13284f[m13287c] = t;
        t.setIndex(m13287c);
        m13278l(m13287c);
    }

    /* renamed from: b */
    public final T m13288b() {
        T[] tArr = this.f25592a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final int m13287c() {
        return this._size;
    }

    /* renamed from: d */
    public final boolean m13286d() {
        return m13287c() == 0;
    }

    /* renamed from: e */
    public final T m13285e() {
        T m13288b;
        synchronized (this) {
            m13288b = m13288b();
        }
        return m13288b;
    }

    /* renamed from: g */
    public final boolean m13283g(T t) {
        boolean z;
        synchronized (this) {
            if (t.mo13274b() == null) {
                z = false;
            } else {
                m13282h(t.getIndex());
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    public final T m13282h(int i) {
        T[] tArr = this.f25592a;
        C9612q.m13920e(tArr);
        m13280j(m13287c() - 1);
        if (i < m13287c()) {
            m13277m(i, m13287c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                C9612q.m13920e(t);
                T t2 = tArr[i2];
                C9612q.m13920e(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m13277m(i, i2);
                    m13278l(i2);
                }
            }
            m13279k(i);
        }
        T t3 = tArr[m13287c()];
        C9612q.m13920e(t3);
        t3.mo13275a(null);
        t3.setIndex(-1);
        tArr[m13287c()] = null;
        return t3;
    }

    /* renamed from: i */
    public final T m13281i() {
        T t;
        synchronized (this) {
            if (m13287c() > 0) {
                t = m13282h(0);
            } else {
                t = null;
            }
        }
        return t;
    }
}