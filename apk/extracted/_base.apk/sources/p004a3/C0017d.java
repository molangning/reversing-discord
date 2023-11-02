package p004a3;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import java.util.IdentityHashMap;
import java.util.Map;
import p394w2.C13379j;
import p414x2.C13677a;

/* renamed from: a3.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C0017d<T> {

    /* renamed from: d */
    private static final Map<Object, Integer> f22d = new IdentityHashMap();

    /* renamed from: a */
    private T f23a;

    /* renamed from: b */
    private int f24b = 1;

    /* renamed from: c */
    private final InterfaceC0016c<T> f25c;

    /* renamed from: a3.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C0018a extends RuntimeException {
        public C0018a() {
            super("Null shared reference");
        }
    }

    public C0017d(T t, InterfaceC0016c<T> interfaceC0016c) {
        this.f23a = (T) C13379j.m2677g(t);
        this.f25c = (InterfaceC0016c) C13379j.m2677g(interfaceC0016c);
        m41397a(t);
    }

    /* renamed from: a */
    private static void m41397a(Object obj) {
        if (CloseableReference.m31720e0() && ((obj instanceof Bitmap) || (obj instanceof InterfaceC0014a))) {
            return;
        }
        Map<Object, Integer> map = f22d;
        synchronized (map) {
            Integer num = map.get(obj);
            if (num == null) {
                map.put(obj, 1);
            } else {
                map.put(obj, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    /* renamed from: c */
    private synchronized int m41395c() {
        boolean z;
        int i;
        m41393e();
        if (this.f24b > 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        i = this.f24b - 1;
        this.f24b = i;
        return i;
    }

    /* renamed from: e */
    private void m41393e() {
        if (m41390h(this)) {
            return;
        }
        throw new C0018a();
    }

    /* renamed from: h */
    public static boolean m41390h(C0017d<?> c0017d) {
        return c0017d != null && c0017d.m41391g();
    }

    /* renamed from: i */
    private static void m41389i(Object obj) {
        Map<Object, Integer> map = f22d;
        synchronized (map) {
            Integer num = map.get(obj);
            if (num == null) {
                C13677a.m1864N("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
            } else if (num.intValue() == 1) {
                map.remove(obj);
            } else {
                map.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    /* renamed from: b */
    public synchronized void m41396b() {
        m41393e();
        this.f24b++;
    }

    /* renamed from: d */
    public void m41394d() {
        T t;
        if (m41395c() == 0) {
            synchronized (this) {
                t = this.f23a;
                this.f23a = null;
            }
            if (t != null) {
                this.f25c.release(t);
                m41389i(t);
            }
        }
    }

    /* renamed from: f */
    public synchronized T m41392f() {
        return this.f23a;
    }

    /* renamed from: g */
    public synchronized boolean m41391g() {
        boolean z;
        if (this.f24b > 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
