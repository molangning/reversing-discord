package p408wh;

import kotlin.jvm.internal.C9612q;

/* renamed from: wh.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC13583a implements Comparable<AbstractC13583a> {
    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(AbstractC13583a other) {
        C9612q.m13917h(other, "other");
        int compareTo = mo341b().compareTo(other.mo341b());
        if (compareTo == 0 && !mo2155c() && other.mo2155c()) {
            return 1;
        }
        return compareTo;
    }

    /* renamed from: b */
    public abstract EnumC13584b mo341b();

    /* renamed from: c */
    public abstract boolean mo2155c();
}
