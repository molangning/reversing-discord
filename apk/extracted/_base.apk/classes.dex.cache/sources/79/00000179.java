package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.IBinder;
import com.discord.media.utils.DiscordVideoMediaSource;

/* renamed from: androidx.appcompat.app.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class ServiceC0338r extends Service {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.r$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0339a {
        /* renamed from: a */
        static int m40545a() {
            return 512;
        }
    }

    /* renamed from: a */
    public static ServiceInfo m40546a(Context context) {
        int i;
        if (Build.VERSION.SDK_INT >= 24) {
            i = C0339a.m40545a() | 128;
        } else {
            i = DiscordVideoMediaSource.DEFAULT_WIDTH;
        }
        return context.getPackageManager().getServiceInfo(new ComponentName(context, ServiceC0338r.class), i);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}