package p019b;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import p019b.InterfaceC1956a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: b.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1960b implements Parcelable {
    public static final Parcelable.Creator<C1960b> CREATOR = new C1961a();

    /* renamed from: j */
    final boolean f5402j = false;

    /* renamed from: k */
    final Handler f5403k = null;

    /* renamed from: l */
    InterfaceC1956a f5404l;

    /* renamed from: b.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1961a implements Parcelable.Creator<C1960b> {
        C1961a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C1960b createFromParcel(Parcel parcel) {
            return new C1960b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C1960b[] newArray(int i) {
            return new C1960b[i];
        }
    }

    /* renamed from: b.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class BinderC1962b extends InterfaceC1956a.AbstractBinderC1957a {
        BinderC1962b() {
            C1960b.this = r1;
        }

        @Override // p019b.InterfaceC1956a
        /* renamed from: E */
        public void mo34885E(int i, Bundle bundle) {
            C1960b c1960b = C1960b.this;
            Handler handler = c1960b.f5403k;
            if (handler != null) {
                handler.post(new RunnableC1963c(i, bundle));
            } else {
                c1960b.mo34888a(i, bundle);
            }
        }
    }

    /* renamed from: b.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1963c implements Runnable {

        /* renamed from: j */
        final int f5406j;

        /* renamed from: k */
        final Bundle f5407k;

        RunnableC1963c(int i, Bundle bundle) {
            C1960b.this = r1;
            this.f5406j = i;
            this.f5407k = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1960b.this.mo34888a(this.f5406j, this.f5407k);
        }
    }

    C1960b(Parcel parcel) {
        this.f5404l = InterfaceC1956a.AbstractBinderC1957a.m34891b(parcel.readStrongBinder());
    }

    /* renamed from: a */
    protected void mo34888a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f5404l == null) {
                this.f5404l = new BinderC1962b();
            }
            parcel.writeStrongBinder(this.f5404l.asBinder());
        }
    }
}