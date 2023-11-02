package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p029b9.C2190n;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p042c9.C2466e;

/* renamed from: m9.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10403o extends AbstractC2461a {
    public static final Parcelable.Creator<C10403o> CREATOR = new C10431z0();

    /* renamed from: j */
    private final String f27168j;

    /* renamed from: k */
    private final String f27169k;

    /* renamed from: l */
    private final byte[] f27170l;

    /* renamed from: m */
    private final C10383g f27171m;

    /* renamed from: n */
    private final C10380f f27172n;

    /* renamed from: o */
    private final C10386h f27173o;

    /* renamed from: p */
    private final C10377e f27174p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10403o(String str, String str2, byte[] bArr, C10383g c10383g, C10380f c10380f, C10386h c10386h, C10377e c10377e) {
        boolean z;
        if ((c10383g != null && c10380f == null && c10386h == null) || ((c10383g == null && c10380f != null && c10386h == null) || (c10383g == null && c10380f == null && c10386h != null))) {
            z = true;
        } else {
            z = false;
        }
        C2198p.m33994a(z);
        this.f27168j = str;
        this.f27169k = str2;
        this.f27170l = bArr;
        this.f27171m = c10383g;
        this.f27172n = c10380f;
        this.f27173o = c10386h;
        this.f27174p = c10377e;
    }

    /* renamed from: r */
    public static C10403o m11621r(byte[] bArr) {
        return (C10403o) C2466e.m33159a(bArr, CREATOR);
    }

    /* renamed from: A */
    public byte[] m11624A() {
        return this.f27170l;
    }

    /* renamed from: G */
    public AbstractC10388i m11623G() {
        C10383g c10383g = this.f27171m;
        if (c10383g != null) {
            return c10383g;
        }
        C10380f c10380f = this.f27172n;
        if (c10380f != null) {
            return c10380f;
        }
        C10386h c10386h = this.f27173o;
        if (c10386h != null) {
            return c10386h;
        }
        throw new IllegalStateException("No response set.");
    }

    /* renamed from: H */
    public String m11622H() {
        return this.f27169k;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10403o)) {
            return false;
        }
        C10403o c10403o = (C10403o) obj;
        if (!C2190n.m34004b(this.f27168j, c10403o.f27168j) || !C2190n.m34004b(this.f27169k, c10403o.f27169k) || !Arrays.equals(this.f27170l, c10403o.f27170l) || !C2190n.m34004b(this.f27171m, c10403o.f27171m) || !C2190n.m34004b(this.f27172n, c10403o.f27172n) || !C2190n.m34004b(this.f27173o, c10403o.f27173o) || !C2190n.m34004b(this.f27174p, c10403o.f27174p)) {
            return false;
        }
        return true;
    }

    public String getId() {
        return this.f27168j;
    }

    public int hashCode() {
        return C2190n.m34003c(this.f27168j, this.f27169k, this.f27170l, this.f27172n, this.f27171m, this.f27173o, this.f27174p);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33168p(parcel, 1, getId(), false);
        C2464c.m33168p(parcel, 2, m11622H(), false);
        C2464c.m33178f(parcel, 3, m11624A(), false);
        C2464c.m33170n(parcel, 4, this.f27171m, i, false);
        C2464c.m33170n(parcel, 5, this.f27172n, i, false);
        C2464c.m33170n(parcel, 6, this.f27173o, i, false);
        C2464c.m33170n(parcel, 7, m11620z(), i, false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public C10377e m11620z() {
        return this.f27174p;
    }
}
