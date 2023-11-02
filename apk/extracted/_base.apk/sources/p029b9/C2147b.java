package p029b9;

import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import p461z8.C14118b;

/* renamed from: b9.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2147b {
    /* renamed from: a */
    public static C14118b m34123a(Status status) {
        if (status.m28241G()) {
            return new ResolvableApiException(status);
        }
        return new C14118b(status);
    }
}
