package p073e1;

import java.util.Arrays;

/* renamed from: e1.p0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C6073p0<V> {

    /* renamed from: a */
    private final V f17289a;

    /* renamed from: b */
    private final Throwable f17290b;

    public C6073p0(V v) {
        this.f17289a = v;
        this.f17290b = null;
    }

    /* renamed from: a */
    public Throwable m23647a() {
        return this.f17290b;
    }

    /* renamed from: b */
    public V m23646b() {
        return this.f17289a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6073p0)) {
            return false;
        }
        C6073p0 c6073p0 = (C6073p0) obj;
        if (m23646b() != null && m23646b().equals(c6073p0.m23646b())) {
            return true;
        }
        if (m23647a() == null || c6073p0.m23647a() == null) {
            return false;
        }
        return m23647a().toString().equals(m23647a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{m23646b(), m23647a()});
    }

    public C6073p0(Throwable th2) {
        this.f17290b = th2;
        this.f17289a = null;
    }
}