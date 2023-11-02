package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import androidx.core.util.C1138f;

/* renamed from: androidx.core.content.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0958g {

    /* renamed from: a */
    private final String f3247a;

    /* renamed from: b */
    private final LocusId f3248b;

    /* renamed from: androidx.core.content.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C0959a {
        /* renamed from: a */
        static LocusId m38365a(String str) {
            return new LocusId(str);
        }

        /* renamed from: b */
        static String m38364b(LocusId locusId) {
            String id2;
            id2 = locusId.getId();
            return id2;
        }
    }

    public C0958g(String str) {
        this.f3247a = (String) C1138f.m37821i(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3248b = C0959a.m38365a(str);
        } else {
            this.f3248b = null;
        }
    }

    /* renamed from: b */
    private String m38368b() {
        int length = this.f3247a.length();
        return length + "_chars";
    }

    /* renamed from: d */
    public static C0958g m38366d(LocusId locusId) {
        C1138f.m37823g(locusId, "locusId cannot be null");
        return new C0958g((String) C1138f.m37821i(C0959a.m38364b(locusId), "id cannot be empty"));
    }

    /* renamed from: a */
    public String m38369a() {
        return this.f3247a;
    }

    /* renamed from: c */
    public LocusId m38367c() {
        return this.f3248b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0958g.class != obj.getClass()) {
            return false;
        }
        C0958g c0958g = (C0958g) obj;
        String str = this.f3247a;
        if (str == null) {
            if (c0958g.f3247a == null) {
                return true;
            }
            return false;
        }
        return str.equals(c0958g.f3247a);
    }

    public int hashCode() {
        String str = this.f3247a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LocusIdCompat[" + m38368b() + "]";
    }
}
