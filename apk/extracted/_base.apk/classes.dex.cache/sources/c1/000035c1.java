package p138he;

import android.content.Context;
import androidx.core.content.C0946a;

/* renamed from: he.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7089g {
    /* renamed from: a */
    public static boolean m21435a(Context context) {
        if (C0946a.m38403a(context, "android.permission.ACCESS_WIFI_STATE") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m21434b(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - i) - 1];
            bArr[(bArr.length - i) - 1] = b;
        }
    }
}