package p164j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8513k {

    /* renamed from: c */
    private static final C8513k f22629c = new C8513k();

    /* renamed from: a */
    private final boolean f22630a;

    /* renamed from: b */
    private final int f22631b;

    private C8513k() {
        this.f22630a = false;
        this.f22631b = 0;
    }

    private C8513k(int i) {
        this.f22630a = true;
        this.f22631b = i;
    }

    /* renamed from: a */
    public static C8513k m17617a() {
        return f22629c;
    }

    /* renamed from: d */
    public static C8513k m17614d(int i) {
        return new C8513k(i);
    }

    /* renamed from: b */
    public final int m17616b() {
        if (this.f22630a) {
            return this.f22631b;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean m17615c() {
        return this.f22630a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8513k) {
            C8513k c8513k = (C8513k) obj;
            boolean z = this.f22630a;
            if (z && c8513k.f22630a) {
                if (this.f22631b == c8513k.f22631b) {
                    return true;
                }
            } else if (z == c8513k.f22630a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f22630a) {
            return this.f22631b;
        }
        return 0;
    }

    public final String toString() {
        return this.f22630a ? String.format("OptionalInt[%s]", Integer.valueOf(this.f22631b)) : "OptionalInt.empty";
    }
}