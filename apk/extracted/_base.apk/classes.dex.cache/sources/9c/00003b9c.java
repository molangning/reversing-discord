package p164j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8510h {

    /* renamed from: b */
    private static final C8510h f22624b = new C8510h();

    /* renamed from: a */
    private final Object f22625a;

    private C8510h() {
        this.f22625a = null;
    }

    private C8510h(Object obj) {
        obj.getClass();
        this.f22625a = obj;
    }

    /* renamed from: a */
    public static C8510h m17633a() {
        return f22624b;
    }

    /* renamed from: d */
    public static C8510h m17630d(Object obj) {
        return new C8510h(obj);
    }

    /* renamed from: b */
    public final Object m17632b() {
        Object obj = this.f22625a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean m17631c() {
        return this.f22625a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8510h) {
            return AbstractC8516n.m17601o(this.f22625a, ((C8510h) obj).f22625a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f22625a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f22625a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}