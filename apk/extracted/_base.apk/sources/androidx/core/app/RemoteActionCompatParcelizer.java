package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.AbstractC1926a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1926a abstractC1926a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3177a = (IconCompat) abstractC1926a.m34989v(remoteActionCompat.f3177a, 1);
        remoteActionCompat.f3178b = abstractC1926a.m34995l(remoteActionCompat.f3178b, 2);
        remoteActionCompat.f3179c = abstractC1926a.m34995l(remoteActionCompat.f3179c, 3);
        remoteActionCompat.f3180d = (PendingIntent) abstractC1926a.m34992r(remoteActionCompat.f3180d, 4);
        remoteActionCompat.f3181e = abstractC1926a.m34997h(remoteActionCompat.f3181e, 5);
        remoteActionCompat.f3182f = abstractC1926a.m34997h(remoteActionCompat.f3182f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1926a abstractC1926a) {
        abstractC1926a.m34988x(false, false);
        abstractC1926a.m35003M(remoteActionCompat.f3177a, 1);
        abstractC1926a.m35009D(remoteActionCompat.f3178b, 2);
        abstractC1926a.m35009D(remoteActionCompat.f3179c, 3);
        abstractC1926a.m35007H(remoteActionCompat.f3180d, 4);
        abstractC1926a.m34987z(remoteActionCompat.f3181e, 5);
        abstractC1926a.m34987z(remoteActionCompat.f3182f, 6);
    }
}
