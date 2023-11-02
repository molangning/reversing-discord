package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.activity.result.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0270c implements Parcelable {
    public static final Parcelable.Creator<C0270c> CREATOR = new C0271a();

    /* renamed from: j */
    private final IntentSender f813j;

    /* renamed from: k */
    private final Intent f814k;

    /* renamed from: l */
    private final int f815l;

    /* renamed from: m */
    private final int f816m;

    /* renamed from: androidx.activity.result.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0271a implements Parcelable.Creator<C0270c> {
        C0271a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C0270c createFromParcel(Parcel parcel) {
            return new C0270c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C0270c[] newArray(int i) {
            return new C0270c[i];
        }
    }

    /* renamed from: androidx.activity.result.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0272b {

        /* renamed from: a */
        private IntentSender f817a;

        /* renamed from: b */
        private Intent f818b;

        /* renamed from: c */
        private int f819c;

        /* renamed from: d */
        private int f820d;

        public C0272b(IntentSender intentSender) {
            this.f817a = intentSender;
        }

        /* renamed from: a */
        public C0270c m40783a() {
            return new C0270c(this.f817a, this.f818b, this.f819c, this.f820d);
        }

        /* renamed from: b */
        public C0272b m40782b(Intent intent) {
            this.f818b = intent;
            return this;
        }

        /* renamed from: c */
        public C0272b m40781c(int i, int i2) {
            this.f820d = i;
            this.f819c = i2;
            return this;
        }
    }

    C0270c(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f813j = intentSender;
        this.f814k = intent;
        this.f815l = i;
        this.f816m = i2;
    }

    /* renamed from: a */
    public Intent m40789a() {
        return this.f814k;
    }

    /* renamed from: b */
    public int m40788b() {
        return this.f815l;
    }

    /* renamed from: d */
    public int m40787d() {
        return this.f816m;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public IntentSender m40786e() {
        return this.f813j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f813j, i);
        parcel.writeParcelable(this.f814k, i);
        parcel.writeInt(this.f815l);
        parcel.writeInt(this.f816m);
    }

    C0270c(Parcel parcel) {
        this.f813j = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f814k = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f815l = parcel.readInt();
        this.f816m = parcel.readInt();
    }
}
