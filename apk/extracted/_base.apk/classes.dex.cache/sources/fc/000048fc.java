package p283p9;

import android.util.Base64;
import java.util.Random;

/* renamed from: p9.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11468c {

    /* renamed from: a */
    private static final Random f29803a = new Random();

    /* renamed from: a */
    public static String m8031a() {
        byte[] bArr = new byte[16];
        f29803a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}