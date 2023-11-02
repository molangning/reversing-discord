package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.AbstractC1926a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC1926a abstractC1926a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3353a = abstractC1926a.m34993p(iconCompat.f3353a, 1);
        iconCompat.f3355c = abstractC1926a.m34996j(iconCompat.f3355c, 2);
        iconCompat.f3356d = abstractC1926a.m34992r(iconCompat.f3356d, 3);
        iconCompat.f3357e = abstractC1926a.m34993p(iconCompat.f3357e, 4);
        iconCompat.f3358f = abstractC1926a.m34993p(iconCompat.f3358f, 5);
        iconCompat.f3359g = (ColorStateList) abstractC1926a.m34992r(iconCompat.f3359g, 6);
        iconCompat.f3361i = abstractC1926a.m34991t(iconCompat.f3361i, 7);
        iconCompat.f3362j = abstractC1926a.m34991t(iconCompat.f3362j, 8);
        iconCompat.m38116v();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC1926a abstractC1926a) {
        abstractC1926a.m34988x(true, true);
        iconCompat.m38115w(abstractC1926a.m34998f());
        int i = iconCompat.f3353a;
        if (-1 != i) {
            abstractC1926a.m35008F(i, 1);
        }
        byte[] bArr = iconCompat.f3355c;
        if (bArr != null) {
            abstractC1926a.m35010B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f3356d;
        if (parcelable != null) {
            abstractC1926a.m35007H(parcelable, 3);
        }
        int i2 = iconCompat.f3357e;
        if (i2 != 0) {
            abstractC1926a.m35008F(i2, 4);
        }
        int i3 = iconCompat.f3358f;
        if (i3 != 0) {
            abstractC1926a.m35008F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f3359g;
        if (colorStateList != null) {
            abstractC1926a.m35007H(colorStateList, 6);
        }
        String str = iconCompat.f3361i;
        if (str != null) {
            abstractC1926a.m35006J(str, 7);
        }
        String str2 = iconCompat.f3362j;
        if (str2 != null) {
            abstractC1926a.m35006J(str2, 8);
        }
    }
}
