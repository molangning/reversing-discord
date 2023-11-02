package p119g9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p154i9.C7478d;

/* renamed from: g9.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6578a {
    @Deprecated
    /* renamed from: a */
    public static byte[] m22387a(Context context, String str) {
        MessageDigest m22386b;
        PackageInfo m20600e = C7478d.m20598a(context).m20600e(str, 64);
        Signature[] signatureArr = m20600e.signatures;
        if (signatureArr != null && signatureArr.length == 1 && (m22386b = m22386b("SHA1")) != null) {
            return m22386b.digest(m20600e.signatures[0].toByteArray());
        }
        return null;
    }

    /* renamed from: b */
    public static MessageDigest m22386b(String str) {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
