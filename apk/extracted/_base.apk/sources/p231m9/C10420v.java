package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p029b9.C2190n;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: m9.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10420v extends AbstractC2461a {
    public static final Parcelable.Creator<C10420v> CREATOR = new C10382f1();

    /* renamed from: j */
    private final byte[] f27229j;

    /* renamed from: k */
    private final String f27230k;

    /* renamed from: l */
    private final String f27231l;

    /* renamed from: m */
    private final String f27232m;

    public C10420v(byte[] bArr, String str, String str2, String str3) {
        this.f27229j = (byte[]) C2198p.m33985j(bArr);
        this.f27230k = (String) C2198p.m33985j(str);
        this.f27231l = str2;
        this.f27232m = (String) C2198p.m33985j(str3);
    }

    /* renamed from: A */
    public byte[] m11589A() {
        return this.f27229j;
    }

    /* renamed from: G */
    public String m11588G() {
        return this.f27230k;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10420v)) {
            return false;
        }
        C10420v c10420v = (C10420v) obj;
        if (!Arrays.equals(this.f27229j, c10420v.f27229j) || !C2190n.m34004b(this.f27230k, c10420v.f27230k) || !C2190n.m34004b(this.f27231l, c10420v.f27231l) || !C2190n.m34004b(this.f27232m, c10420v.f27232m)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2190n.m34003c(this.f27229j, this.f27230k, this.f27231l, this.f27232m);
    }

    /* renamed from: r */
    public String m11587r() {
        return this.f27232m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33178f(parcel, 2, m11589A(), false);
        C2464c.m33168p(parcel, 3, m11588G(), false);
        C2464c.m33168p(parcel, 4, m11586z(), false);
        C2464c.m33168p(parcel, 5, m11587r(), false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public String m11586z() {
        return this.f27231l;
    }
}
