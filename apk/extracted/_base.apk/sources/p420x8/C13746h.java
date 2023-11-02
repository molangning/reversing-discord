package p420x8;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x8.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13746h implements Parcelable {
    public static final Parcelable.Creator<C13746h> CREATOR = new C13744f();

    /* renamed from: j */
    Messenger f35471j;

    public C13746h(IBinder iBinder) {
        this.f35471j = new Messenger(iBinder);
    }

    /* renamed from: a */
    public final IBinder m1596a() {
        Messenger messenger = this.f35471j;
        messenger.getClass();
        return messenger.getBinder();
    }

    /* renamed from: b */
    public final void m1595b(Message message) {
        Messenger messenger = this.f35471j;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m1596a().equals(((C13746h) obj).m1596a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return m1596a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f35471j;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
