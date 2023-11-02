package p389vh;

import kotlin.jvm.internal.C9612q;
import ph.C11632b;

/* renamed from: vh.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13300f {

    /* renamed from: a */
    private final C11632b f34376a;

    /* renamed from: b */
    private final int f34377b;

    public C13300f(C11632b classId, int i) {
        C9612q.m13917h(classId, "classId");
        this.f34376a = classId;
        this.f34377b = i;
    }

    /* renamed from: a */
    public final C11632b m2824a() {
        return this.f34376a;
    }

    /* renamed from: b */
    public final int m2823b() {
        return this.f34377b;
    }

    /* renamed from: c */
    public final int m2822c() {
        return this.f34377b;
    }

    /* renamed from: d */
    public final C11632b m2821d() {
        return this.f34376a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13300f) {
            C13300f c13300f = (C13300f) obj;
            return C9612q.m13922c(this.f34376a, c13300f.f34376a) && this.f34377b == c13300f.f34377b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f34376a.hashCode() * 31) + this.f34377b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i = this.f34377b;
        for (int i2 = 0; i2 < i; i2++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.f34376a);
        int i3 = this.f34377b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb2.append(">");
        }
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
