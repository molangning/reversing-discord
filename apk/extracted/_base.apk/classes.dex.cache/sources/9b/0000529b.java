package p441y8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p029b9.C2190n;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: y8.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13930a extends AbstractC2461a {

    /* renamed from: j */
    final int f35871j;

    /* renamed from: k */
    private final int f35872k;

    /* renamed from: l */
    private final PendingIntent f35873l;

    /* renamed from: m */
    private final String f35874m;

    /* renamed from: n */
    public static final C13930a f35870n = new C13930a(0);
    public static final Parcelable.Creator<C13930a> CREATOR = new C13942m();

    public C13930a(int i) {
        this(i, null, null);
    }

    public C13930a(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f35871j = i;
        this.f35872k = i2;
        this.f35873l = pendingIntent;
        this.f35874m = str;
    }

    /* renamed from: J */
    public static String m1145J(int i) {
        if (i != 99) {
            if (i != 1500) {
                switch (i) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                StringBuilder sb2 = new StringBuilder(31);
                                sb2.append("UNKNOWN_ERROR_CODE(");
                                sb2.append(i);
                                sb2.append(")");
                                return sb2.toString();
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    /* renamed from: A */
    public PendingIntent m1148A() {
        return this.f35873l;
    }

    /* renamed from: G */
    public boolean m1147G() {
        return (this.f35872k == 0 || this.f35873l == null) ? false : true;
    }

    /* renamed from: H */
    public boolean m1146H() {
        return this.f35872k == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13930a)) {
            return false;
        }
        C13930a c13930a = (C13930a) obj;
        if (this.f35872k == c13930a.f35872k && C2190n.m34004b(this.f35873l, c13930a.f35873l) && C2190n.m34004b(this.f35874m, c13930a.f35874m)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C2190n.m34003c(Integer.valueOf(this.f35872k), this.f35873l, this.f35874m);
    }

    /* renamed from: r */
    public int m1144r() {
        return this.f35872k;
    }

    public String toString() {
        C2190n.C2191a m34002d = C2190n.m34002d(this);
        m34002d.m34001a("statusCode", m1145J(this.f35872k));
        m34002d.m34001a("resolution", this.f35873l);
        m34002d.m34001a("message", this.f35874m);
        return m34002d.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f35871j);
        C2464c.m33174j(parcel, 2, m1144r());
        C2464c.m33170n(parcel, 3, m1148A(), i, false);
        C2464c.m33168p(parcel, 4, m1143z(), false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public String m1143z() {
        return this.f35874m;
    }

    public C13930a(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public C13930a(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}