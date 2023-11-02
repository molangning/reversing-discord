package com.google.android.exoplayer2;

import p195k8.C9191p0;

/* renamed from: com.google.android.exoplayer2.j0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4419j0 {

    /* renamed from: a */
    public final String f11625a;

    /* renamed from: com.google.android.exoplayer2.j0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4421b {

        /* renamed from: a */
        private String f11626a;

        /* renamed from: a */
        public C4419j0 m29279a() {
            return new C4419j0(this.f11626a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4419j0.class == obj.getClass()) {
            return C9191p0.m16257c(this.f11625a, ((C4419j0) obj).f11625a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f11625a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    private C4419j0(String str) {
        this.f11625a = str;
    }
}