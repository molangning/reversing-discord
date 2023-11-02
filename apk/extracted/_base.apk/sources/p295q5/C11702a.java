package p295q5;

import android.os.Parcel;
import android.os.Parcelable;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: q5.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11702a implements Parcelable {
    public static final Parcelable.Creator<C11702a> CREATOR = new C11703a();

    /* renamed from: j */
    private final int f30508j;

    /* renamed from: k */
    private final String f30509k;

    /* renamed from: l */
    private final String f30510l;

    /* renamed from: m */
    private final String f30511m;

    /* renamed from: n */
    private final List<InetAddress> f30512n;

    /* renamed from: o */
    private final Map<String, String> f30513o;

    /* renamed from: p */
    private final int f30514p;

    /* renamed from: q */
    private final String f30515q;

    /* renamed from: r */
    private final int f30516r;

    /* renamed from: q5.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class C11703a implements Parcelable.Creator<C11702a> {
        C11703a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C11702a createFromParcel(Parcel parcel) {
            return new C11702a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C11702a[] newArray(int i) {
            return new C11702a[i];
        }
    }

    protected C11702a(C11704b c11704b) {
        this.f30508j = c11704b.f30517a;
        this.f30509k = c11704b.f30518b;
        this.f30510l = c11704b.f30519c;
        this.f30511m = c11704b.f30520d;
        this.f30514p = c11704b.f30521e;
        this.f30512n = Collections.unmodifiableList(c11704b.f30522f);
        this.f30513o = Collections.unmodifiableMap(c11704b.f30523g);
        this.f30515q = c11704b.f30524h;
        this.f30516r = c11704b.f30525i;
    }

    /* renamed from: P */
    private static List<InetAddress> m7134P(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readInt; i++) {
            arrayList.add((InetAddress) parcel.readSerializable());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: Q */
    private static Map<String, String> m7133Q(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (readString != null && readString2 != null) {
                hashMap.put(readString, readString2);
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: T */
    private static void m7132T(Parcel parcel, List<InetAddress> list) {
        if (list == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(list.size());
        for (InetAddress inetAddress : list) {
            parcel.writeSerializable(inetAddress);
        }
    }

    /* renamed from: U */
    private static void m7131U(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    /* renamed from: A */
    public int m7140A() {
        return this.f30514p;
    }

    /* renamed from: G */
    public List<InetAddress> m7139G() {
        return this.f30512n;
    }

    /* renamed from: H */
    public int m7138H() {
        return this.f30516r;
    }

    /* renamed from: J */
    public String m7137J() {
        return this.f30510l;
    }

    /* renamed from: M */
    public String m7136M() {
        return this.f30509k;
    }

    /* renamed from: O */
    public Map<String, String> m7135O() {
        return this.f30513o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11702a)) {
            return false;
        }
        C11702a c11702a = (C11702a) obj;
        if (this.f30514p != c11702a.f30514p) {
            return false;
        }
        String str = this.f30509k;
        if (str == null ? c11702a.f30509k != null : !str.equals(c11702a.f30509k)) {
            return false;
        }
        String str2 = this.f30510l;
        if (str2 == null ? c11702a.f30510l != null : !str2.equals(c11702a.f30510l)) {
            return false;
        }
        String str3 = this.f30511m;
        String str4 = c11702a.f30511m;
        if (str3 != null) {
            if (str3.equals(str4)) {
                return true;
            }
        } else if (str4 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f30509k;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.f30510l;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f30511m;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return ((i5 + i3) * 31) + this.f30514p;
    }

    public String toString() {
        return "BonjourService{flags=" + this.f30508j + ", domain='" + this.f30511m + "', regType='" + this.f30510l + "', serviceName='" + this.f30509k + "', dnsRecords=" + this.f30513o + ", ifIndex=" + this.f30514p + ", hostname='" + this.f30515q + "', port=" + this.f30516r + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f30508j);
        parcel.writeString(this.f30509k);
        parcel.writeString(this.f30510l);
        parcel.writeString(this.f30511m);
        m7131U(parcel, this.f30513o);
        m7132T(parcel, this.f30512n);
        parcel.writeInt(this.f30514p);
        parcel.writeString(this.f30515q);
        parcel.writeInt(this.f30516r);
    }

    /* renamed from: x */
    public String m7121x() {
        return this.f30511m;
    }

    /* renamed from: y */
    public int m7120y() {
        return this.f30508j;
    }

    /* renamed from: z */
    public String m7119z() {
        return this.f30515q;
    }

    /* renamed from: q5.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C11704b {

        /* renamed from: a */
        private final int f30517a;

        /* renamed from: b */
        private final String f30518b;

        /* renamed from: c */
        private final String f30519c;

        /* renamed from: d */
        private final String f30520d;

        /* renamed from: e */
        private final int f30521e;

        /* renamed from: f */
        private List<InetAddress> f30522f;

        /* renamed from: g */
        private Map<String, String> f30523g;

        /* renamed from: h */
        private String f30524h;

        /* renamed from: i */
        private int f30525i;

        public C11704b(int i, int i2, String str, String str2, String str3) {
            this.f30522f = new ArrayList();
            this.f30523g = new HashMap();
            this.f30517a = i;
            this.f30518b = str;
            this.f30519c = str2;
            this.f30520d = str3;
            this.f30521e = i2;
        }

        /* renamed from: j */
        public C11702a m7107j() {
            return new C11702a(this);
        }

        /* renamed from: k */
        public C11704b m7106k(Map<String, String> map) {
            this.f30523g = map;
            return this;
        }

        /* renamed from: l */
        public C11704b m7105l(int i) {
            this.f30525i = i;
            return this;
        }

        public C11704b(C11702a c11702a) {
            this.f30522f = new ArrayList();
            this.f30523g = new HashMap();
            this.f30517a = c11702a.f30508j;
            this.f30518b = c11702a.f30509k;
            this.f30519c = c11702a.f30510l;
            this.f30520d = c11702a.f30511m;
            this.f30521e = c11702a.f30514p;
            this.f30523g = new HashMap(c11702a.f30513o);
            this.f30522f = new ArrayList(c11702a.f30512n);
            this.f30524h = c11702a.f30515q;
            this.f30525i = c11702a.f30516r;
        }
    }

    protected C11702a(Parcel parcel) {
        this.f30508j = parcel.readInt();
        this.f30509k = parcel.readString();
        this.f30510l = parcel.readString();
        this.f30511m = parcel.readString();
        this.f30513o = m7133Q(parcel);
        this.f30512n = m7134P(parcel);
        this.f30514p = parcel.readInt();
        this.f30515q = parcel.readString();
        this.f30516r = parcel.readInt();
    }
}
