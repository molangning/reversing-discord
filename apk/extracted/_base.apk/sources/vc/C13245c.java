package vc;

import java.util.ArrayList;
import java.util.List;

/* renamed from: vc.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13245c {

    /* renamed from: a */
    private final List<C13244b> f34302a;

    /* renamed from: b */
    private final int f34303b;

    /* renamed from: c */
    private final boolean f34304c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13245c(List<C13244b> list, int i, boolean z) {
        this.f34302a = new ArrayList(list);
        this.f34303b = i;
        this.f34304c = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C13244b> m2964a() {
        return this.f34302a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m2963b() {
        return this.f34303b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m2962c(List<C13244b> list) {
        return this.f34302a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13245c)) {
            return false;
        }
        C13245c c13245c = (C13245c) obj;
        if (!this.f34302a.equals(c13245c.m2964a()) || this.f34304c != c13245c.f34304c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f34302a.hashCode() ^ Boolean.valueOf(this.f34304c).hashCode();
    }

    public String toString() {
        return "{ " + this.f34302a + " }";
    }
}
