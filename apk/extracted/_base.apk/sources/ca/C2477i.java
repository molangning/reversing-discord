package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.views.image.ReactImageView;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.ArrayList;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: ca.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2477i extends AbstractC2461a {
    public static final Parcelable.Creator<C2477i> CREATOR = new C2483n();

    /* renamed from: r */
    public static final C2477i f6828r = new C2478a().m33151a();
    @Deprecated

    /* renamed from: s */
    public static final C2477i f6829s;
    @Deprecated

    /* renamed from: t */
    public static final C2477i f6830t;

    /* renamed from: j */
    final int f6831j;
    @Deprecated

    /* renamed from: k */
    final int f6832k;

    /* renamed from: l */
    final int f6833l;

    /* renamed from: m */
    final int f6834m;
    @Deprecated

    /* renamed from: n */
    final boolean f6835n;

    /* renamed from: o */
    final int f6836o;

    /* renamed from: p */
    final int f6837p;

    /* renamed from: q */
    private final int f6838q;

    /* renamed from: ca.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C2478a {

        /* renamed from: a */
        private int f6839a = 3;

        /* renamed from: b */
        private int f6840b = ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS;

        /* renamed from: c */
        private int f6841c = 0;

        /* renamed from: d */
        private int f6842d = -1;

        /* renamed from: a */
        public C2477i m33151a() {
            if (this.f6842d == 2 && this.f6841c == 1) {
                throw new IllegalStateException("Cannot set EARSHOT with BLE only mode.");
            }
            return new C2477i(2, 0, this.f6840b, this.f6841c, false, this.f6842d, this.f6839a, 0);
        }

        /* renamed from: b */
        public C2478a m33150b(int i) {
            boolean z;
            if (i != Integer.MAX_VALUE && (i <= 0 || i > 86400)) {
                z = false;
            } else {
                z = true;
            }
            C2198p.m33992c(z, "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", Integer.valueOf(i), 86400);
            this.f6840b = i;
            return this;
        }

        /* renamed from: c */
        public final C2478a m33149c(int i) {
            this.f6842d = 2;
            return this;
        }
    }

    static {
        C2478a c2478a = new C2478a();
        c2478a.m33149c(2);
        c2478a.m33150b(ViewDefaults.NUMBER_OF_LINES);
        C2477i m33151a = c2478a.m33151a();
        f6829s = m33151a;
        f6830t = m33151a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2477i(int r2, int r3, int r4, int r5, boolean r6, int r7, int r8, int r9) {
        /*
            r1 = this;
            r1.<init>()
            r1.f6831j = r2
            r1.f6832k = r3
            r2 = 1
            r0 = 2
            if (r3 != 0) goto Le
        Lb:
            r1.f6837p = r8
            goto L19
        Le:
            if (r3 == r0) goto L17
            r8 = 3
            if (r3 == r8) goto L14
            goto Lb
        L14:
            r1.f6837p = r0
            goto L19
        L17:
            r1.f6837p = r2
        L19:
            r1.f6834m = r5
            r1.f6835n = r6
            if (r6 == 0) goto L27
            r1.f6836o = r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.f6833l = r2
            goto L38
        L27:
            r1.f6833l = r4
            r3 = -1
            if (r7 == r3) goto L36
            if (r7 == 0) goto L36
            if (r7 == r2) goto L36
            r2 = 6
            if (r7 == r2) goto L36
            r1.f6836o = r7
            goto L38
        L36:
            r1.f6836o = r3
        L38:
            r1.f6838q = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.C2477i.<init>(int, int, int, int, boolean, int, int, int):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2477i)) {
            return false;
        }
        C2477i c2477i = (C2477i) obj;
        if (this.f6831j == c2477i.f6831j && this.f6837p == c2477i.f6837p && this.f6833l == c2477i.f6833l && this.f6834m == c2477i.f6834m && this.f6836o == c2477i.f6836o && this.f6838q == c2477i.f6838q) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f6831j * 31) + this.f6837p) * 31) + this.f6833l) * 31) + this.f6834m) * 31) + this.f6836o) * 31) + this.f6838q;
    }

    /* renamed from: r */
    public final int m33152r() {
        return this.f6838q;
    }

    public String toString() {
        String str;
        String obj;
        String obj2;
        int i = this.f6833l;
        int i2 = this.f6834m;
        String str2 = "DEFAULT";
        if (i2 == 0) {
            str = "DEFAULT";
        } else if (i2 != 1) {
            str = "UNKNOWN:" + i2;
        } else {
            str = "EARSHOT";
        }
        int i3 = this.f6836o;
        if (i3 == -1) {
            obj = "DEFAULT";
        } else {
            ArrayList arrayList = new ArrayList();
            if ((i3 & 4) > 0) {
                arrayList.add("ULTRASOUND");
            }
            if ((i3 & 2) > 0) {
                arrayList.add("BLE");
            }
            if (arrayList.isEmpty()) {
                obj = "UNKNOWN:" + i3;
            } else {
                obj = arrayList.toString();
            }
        }
        int i4 = this.f6837p;
        if (i4 == 3) {
            obj2 = "DEFAULT";
        } else {
            ArrayList arrayList2 = new ArrayList();
            if ((i4 & 1) > 0) {
                arrayList2.add("BROADCAST");
            }
            if ((i4 & 2) > 0) {
                arrayList2.add("SCAN");
            }
            if (arrayList2.isEmpty()) {
                obj2 = "UNKNOWN:" + i4;
            } else {
                obj2 = arrayList2.toString();
            }
        }
        int i5 = this.f6838q;
        if (i5 != 0) {
            if (i5 != 1) {
                str2 = "UNKNOWN: " + i5;
            } else {
                str2 = "ALWAYS_ON";
            }
        }
        return "Strategy{ttlSeconds=" + i + ", distanceType=" + str + ", discoveryMedium=" + obj + ", discoveryMode=" + obj2 + ", backgroundScanMode=" + str2 + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f6832k);
        C2464c.m33174j(parcel, 2, this.f6833l);
        C2464c.m33174j(parcel, 3, this.f6834m);
        C2464c.m33181c(parcel, 4, this.f6835n);
        C2464c.m33174j(parcel, 5, this.f6836o);
        C2464c.m33174j(parcel, 6, this.f6837p);
        C2464c.m33174j(parcel, 7, this.f6838q);
        C2464c.m33174j(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f6831j);
        C2464c.m33182b(parcel, m33183a);
    }
}
