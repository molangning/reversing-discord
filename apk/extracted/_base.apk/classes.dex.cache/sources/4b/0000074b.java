package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.lifecycle.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC1681d0 {

    /* renamed from: a */
    private final Map<String, Object> f4507a = new HashMap();

    /* renamed from: b */
    private final Set<Closeable> f4508b = new LinkedHashSet();

    /* renamed from: c */
    private volatile boolean f4509c = false;

    /* renamed from: b */
    private static void m36045b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    public final void m36046a() {
        this.f4509c = true;
        Map<String, Object> map = this.f4507a;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.f4507a.values()) {
                    m36045b(obj);
                }
            }
        }
        Set<Closeable> set = this.f4508b;
        if (set != null) {
            synchronized (set) {
                for (Closeable closeable : this.f4508b) {
                    m36045b(closeable);
                }
            }
        }
        mo35975d();
    }

    /* renamed from: c */
    public <T> T m36044c(String str) {
        T t;
        Map<String, Object> map = this.f4507a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.f4507a.get(str);
        }
        return t;
    }

    /* renamed from: d */
    public void mo35975d() {
    }

    /* renamed from: e */
    public <T> T m36043e(String str, T t) {
        Object obj;
        synchronized (this.f4507a) {
            obj = this.f4507a.get(str);
            if (obj == null) {
                this.f4507a.put(str, t);
            }
        }
        if (obj != null) {
            t = obj;
        }
        if (this.f4509c) {
            m36045b(t);
        }
        return t;
    }
}