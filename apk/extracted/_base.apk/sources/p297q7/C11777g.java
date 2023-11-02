package p297q7;

import p195k8.C9191p0;

/* renamed from: q7.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11777g {

    /* renamed from: a */
    public final String f30720a;

    /* renamed from: b */
    public final String f30721b;

    /* renamed from: c */
    public final String f30722c;

    /* renamed from: d */
    public final String f30723d;

    /* renamed from: e */
    public final String f30724e;

    public C11777g(String str, String str2, String str3, String str4, String str5) {
        this.f30720a = str;
        this.f30721b = str2;
        this.f30722c = str3;
        this.f30723d = str4;
        this.f30724e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11777g c11777g = (C11777g) obj;
        if (C9191p0.m16257c(this.f30720a, c11777g.f30720a) && C9191p0.m16257c(this.f30721b, c11777g.f30721b) && C9191p0.m16257c(this.f30722c, c11777g.f30722c) && C9191p0.m16257c(this.f30723d, c11777g.f30723d) && C9191p0.m16257c(this.f30724e, c11777g.f30724e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f30720a;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = (527 + i) * 31;
        String str2 = this.f30721b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.f30722c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str4 = this.f30723d;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str5 = this.f30724e;
        if (str5 != null) {
            i5 = str5.hashCode();
        }
        return i9 + i5;
    }
}
