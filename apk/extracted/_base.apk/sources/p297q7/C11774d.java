package p297q7;

import p195k8.C9191p0;

/* renamed from: q7.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11774d {

    /* renamed from: a */
    public final String f30707a;

    /* renamed from: b */
    public final String f30708b;

    /* renamed from: c */
    public final String f30709c;

    public C11774d(String str, String str2, String str3) {
        this.f30707a = str;
        this.f30708b = str2;
        this.f30709c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11774d.class != obj.getClass()) {
            return false;
        }
        C11774d c11774d = (C11774d) obj;
        if (C9191p0.m16257c(this.f30707a, c11774d.f30707a) && C9191p0.m16257c(this.f30708b, c11774d.f30708b) && C9191p0.m16257c(this.f30709c, c11774d.f30709c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f30707a.hashCode() * 31;
        String str = this.f30708b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.f30709c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }
}
