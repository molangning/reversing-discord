package p282p8;

import android.net.Uri;
import android.util.LogPrinter;

/* renamed from: p8.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11456e {

    /* renamed from: b */
    private static final Uri f29779b;

    /* renamed from: a */
    private final LogPrinter f29780a = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        f29779b = builder.build();
    }
}