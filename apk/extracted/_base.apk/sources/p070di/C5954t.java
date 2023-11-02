package p070di;

import kotlin.jvm.internal.C9612q;
import ph.C11632b;

/* renamed from: di.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5954t<T> {

    /* renamed from: a */
    private final T f16957a;

    /* renamed from: b */
    private final T f16958b;

    /* renamed from: c */
    private final String f16959c;

    /* renamed from: d */
    private final C11632b f16960d;

    public C5954t(T t, T t2, String filePath, C11632b classId) {
        C9612q.m13917h(filePath, "filePath");
        C9612q.m13917h(classId, "classId");
        this.f16957a = t;
        this.f16958b = t2;
        this.f16959c = filePath;
        this.f16960d = classId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5954t) {
            C5954t c5954t = (C5954t) obj;
            return C9612q.m13922c(this.f16957a, c5954t.f16957a) && C9612q.m13922c(this.f16958b, c5954t.f16958b) && C9612q.m13922c(this.f16959c, c5954t.f16959c) && C9612q.m13922c(this.f16960d, c5954t.f16960d);
        }
        return false;
    }

    public int hashCode() {
        T t = this.f16957a;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f16958b;
        return ((((hashCode + (t2 != null ? t2.hashCode() : 0)) * 31) + this.f16959c.hashCode()) * 31) + this.f16960d.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f16957a + ", expectedVersion=" + this.f16958b + ", filePath=" + this.f16959c + ", classId=" + this.f16960d + ')';
    }
}
