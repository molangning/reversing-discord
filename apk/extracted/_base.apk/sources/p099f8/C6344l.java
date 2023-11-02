package p099f8;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.CaptioningManager;
import gb.AbstractC6693s;
import java.util.ArrayList;
import java.util.Locale;
import p195k8.C9191p0;

/* renamed from: f8.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6344l implements Parcelable {
    public static final Parcelable.Creator<C6344l> CREATOR;

    /* renamed from: p */
    public static final C6344l f17972p;
    @Deprecated

    /* renamed from: q */
    public static final C6344l f17973q;

    /* renamed from: j */
    public final AbstractC6693s<String> f17974j;

    /* renamed from: k */
    public final int f17975k;

    /* renamed from: l */
    public final AbstractC6693s<String> f17976l;

    /* renamed from: m */
    public final int f17977m;

    /* renamed from: n */
    public final boolean f17978n;

    /* renamed from: o */
    public final int f17979o;

    /* renamed from: f8.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C6345a implements Parcelable.Creator<C6344l> {
        C6345a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C6344l createFromParcel(Parcel parcel) {
            return new C6344l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C6344l[] newArray(int i) {
            return new C6344l[i];
        }
    }

    static {
        C6344l mo22884a = new C6346b().mo22884a();
        f17972p = mo22884a;
        f17973q = mo22884a;
        CREATOR = new C6345a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6344l(AbstractC6693s<String> abstractC6693s, int i, AbstractC6693s<String> abstractC6693s2, int i2, boolean z, int i3) {
        this.f17974j = abstractC6693s;
        this.f17975k = i;
        this.f17976l = abstractC6693s2;
        this.f17977m = i2;
        this.f17978n = z;
        this.f17979o = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6344l c6344l = (C6344l) obj;
        if (this.f17974j.equals(c6344l.f17974j) && this.f17975k == c6344l.f17975k && this.f17976l.equals(c6344l.f17976l) && this.f17977m == c6344l.f17977m && this.f17978n == c6344l.f17978n && this.f17979o == c6344l.f17979o) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((this.f17974j.hashCode() + 31) * 31) + this.f17975k) * 31) + this.f17976l.hashCode()) * 31) + this.f17977m) * 31) + (this.f17978n ? 1 : 0)) * 31) + this.f17979o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f17974j);
        parcel.writeInt(this.f17975k);
        parcel.writeList(this.f17976l);
        parcel.writeInt(this.f17977m);
        C9191p0.m16262Z0(parcel, this.f17978n);
        parcel.writeInt(this.f17979o);
    }

    /* renamed from: f8.l$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C6346b {

        /* renamed from: a */
        AbstractC6693s<String> f17980a;

        /* renamed from: b */
        int f17981b;

        /* renamed from: c */
        AbstractC6693s<String> f17982c;

        /* renamed from: d */
        int f17983d;

        /* renamed from: e */
        boolean f17984e;

        /* renamed from: f */
        int f17985f;

        public C6346b(Context context) {
            this();
            mo22883b(context);
        }

        /* renamed from: c */
        private void m22882c(Context context) {
            CaptioningManager captioningManager;
            if ((C9191p0.f24171a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f17983d = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f17982c = AbstractC6693s.m22130y(C9191p0.m16273U(locale));
                }
            }
        }

        /* renamed from: a */
        public C6344l mo22884a() {
            return new C6344l(this.f17980a, this.f17981b, this.f17982c, this.f17983d, this.f17984e, this.f17985f);
        }

        /* renamed from: b */
        public C6346b mo22883b(Context context) {
            if (C9191p0.f24171a >= 19) {
                m22882c(context);
            }
            return this;
        }

        @Deprecated
        public C6346b() {
            this.f17980a = AbstractC6693s.m22131x();
            this.f17981b = 0;
            this.f17982c = AbstractC6693s.m22131x();
            this.f17983d = 0;
            this.f17984e = false;
            this.f17985f = 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C6346b(C6344l c6344l) {
            this.f17980a = c6344l.f17974j;
            this.f17981b = c6344l.f17975k;
            this.f17982c = c6344l.f17976l;
            this.f17983d = c6344l.f17977m;
            this.f17984e = c6344l.f17978n;
            this.f17985f = c6344l.f17979o;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6344l(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.f17974j = AbstractC6693s.m22134u(arrayList);
        this.f17975k = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.f17976l = AbstractC6693s.m22134u(arrayList2);
        this.f17977m = parcel.readInt();
        this.f17978n = C9191p0.m16300G0(parcel);
        this.f17979o = parcel.readInt();
    }
}
