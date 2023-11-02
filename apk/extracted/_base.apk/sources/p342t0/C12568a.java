package p342t0;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* renamed from: t0.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C12568a {
    private C12568a() {
    }

    /* renamed from: a */
    public static <T extends InterfaceC12569b> T m4783a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).m35013a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    /* renamed from: b */
    public static <T extends InterfaceC12569b> T m4782b(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(C12568a.class.getClassLoader());
            return (T) m4783a(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
