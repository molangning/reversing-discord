package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p029b9.C2190n;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: ca.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2467a extends AbstractC2461a {
    public static final Parcelable.Creator<C2467a> CREATOR = new C2480k();

    /* renamed from: p */
    public static final C2467a f6808p;

    /* renamed from: j */
    final int f6809j;

    /* renamed from: k */
    private final List f6810k;

    /* renamed from: l */
    private final List f6811l;

    /* renamed from: m */
    private final boolean f6812m;

    /* renamed from: n */
    private final List f6813n;

    /* renamed from: o */
    private final int f6814o;

    /* renamed from: ca.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2468a {

        /* renamed from: d */
        private boolean f6818d;

        /* renamed from: a */
        private final Set f6815a = new HashSet();

        /* renamed from: b */
        private final List f6816b = new ArrayList();

        /* renamed from: c */
        private final Set f6817c = new HashSet();

        /* renamed from: e */
        private int f6819e = 0;

        /* renamed from: a */
        public C2467a m33158a() {
            boolean z = true;
            if (!this.f6818d && this.f6815a.isEmpty()) {
                z = false;
            }
            C2198p.m33982m(z, "At least one of the include methods must be called.");
            return new C2467a(2, new ArrayList(this.f6815a), this.f6816b, this.f6818d, new ArrayList(this.f6817c), this.f6819e);
        }

        /* renamed from: b */
        public C2468a m33157b() {
            this.f6818d = true;
            return this;
        }
    }

    static {
        C2468a c2468a = new C2468a();
        c2468a.m33157b();
        f6808p = c2468a.m33158a();
    }

    public C2467a(int i, List list, List list2, boolean z, List list3, int i2) {
        this.f6809j = i;
        this.f6810k = Collections.unmodifiableList((List) C2198p.m33985j(list));
        this.f6812m = z;
        this.f6811l = Collections.unmodifiableList(list2 == null ? Collections.emptyList() : list2);
        this.f6813n = Collections.unmodifiableList(list3 == null ? Collections.emptyList() : list3);
        this.f6814o = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2467a)) {
            return false;
        }
        C2467a c2467a = (C2467a) obj;
        if (this.f6812m == c2467a.f6812m && C2190n.m34004b(this.f6810k, c2467a.f6810k) && C2190n.m34004b(this.f6811l, c2467a.f6811l) && C2190n.m34004b(this.f6813n, c2467a.f6813n)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C2190n.m34003c(this.f6810k, this.f6811l, Boolean.valueOf(this.f6812m), this.f6813n);
    }

    public String toString() {
        boolean z = this.f6812m;
        String valueOf = String.valueOf(this.f6810k);
        return "MessageFilter{includeAllMyTypes=" + z + ", messageTypes=" + valueOf + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33164t(parcel, 1, this.f6810k, false);
        C2464c.m33164t(parcel, 2, this.f6811l, false);
        C2464c.m33181c(parcel, 3, this.f6812m);
        C2464c.m33164t(parcel, 4, this.f6813n, false);
        C2464c.m33174j(parcel, 5, this.f6814o);
        C2464c.m33174j(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f6809j);
        C2464c.m33182b(parcel, m33183a);
    }
}