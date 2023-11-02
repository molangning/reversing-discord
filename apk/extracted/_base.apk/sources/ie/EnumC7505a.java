package ie;

import android.net.NetworkInfo;

/* renamed from: ie.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC7505a {
    CG_2G("2g"),
    CG_3G("3g"),
    CG_4G("4g"),
    CG_5G("5g");
    

    /* renamed from: j */
    public final String f20732j;

    EnumC7505a(String str) {
        this.f20732j = str;
    }

    /* renamed from: a */
    public static EnumC7505a m20556a(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return null;
        }
        int subtype = networkInfo.getSubtype();
        if (subtype != 20) {
            switch (subtype) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return CG_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                    return CG_3G;
                case 13:
                case 15:
                    return CG_4G;
                default:
                    return null;
            }
        }
        return CG_5G;
    }
}
