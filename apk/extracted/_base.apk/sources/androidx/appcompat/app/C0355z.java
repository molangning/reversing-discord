package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C0960h;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C0355z {

    /* renamed from: d */
    private static C0355z f1131d;

    /* renamed from: a */
    private final Context f1132a;

    /* renamed from: b */
    private final LocationManager f1133b;

    /* renamed from: c */
    private final C0356a f1134c = new C0356a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.z$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0356a {

        /* renamed from: a */
        boolean f1135a;

        /* renamed from: b */
        long f1136b;

        C0356a() {
        }
    }

    C0355z(Context context, LocationManager locationManager) {
        this.f1132a = context;
        this.f1133b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0355z m40503a(Context context) {
        if (f1131d == null) {
            Context applicationContext = context.getApplicationContext();
            f1131d = new C0355z(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1131d;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m40502b() {
        Location location;
        Location location2 = null;
        if (C0960h.m38362b(this.f1132a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = m40501c("network");
        } else {
            location = null;
        }
        if (C0960h.m38362b(this.f1132a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = m40501c("gps");
        }
        if (location2 != null && location != null) {
            if (location2.getTime() > location.getTime()) {
                return location2;
            }
            return location;
        } else if (location2 != null) {
            return location2;
        } else {
            return location;
        }
    }

    /* renamed from: c */
    private Location m40501c(String str) {
        try {
            if (this.f1133b.isProviderEnabled(str)) {
                return this.f1133b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m40499e() {
        return this.f1134c.f1136b > System.currentTimeMillis();
    }

    /* renamed from: f */
    private void m40498f(Location location) {
        long j;
        long j2;
        C0356a c0356a = this.f1134c;
        long currentTimeMillis = System.currentTimeMillis();
        C0354y m40504b = C0354y.m40504b();
        m40504b.m40505a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        m40504b.m40505a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = true;
        if (m40504b.f1130c != 1) {
            z = false;
        }
        boolean z2 = z;
        long j3 = m40504b.f1129b;
        long j4 = m40504b.f1128a;
        m40504b.m40505a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j5 = m40504b.f1129b;
        if (j3 != -1 && j4 != -1) {
            if (currentTimeMillis > j4) {
                j2 = j5 + 0;
            } else if (currentTimeMillis > j3) {
                j2 = j4 + 0;
            } else {
                j2 = j3 + 0;
            }
            j = j2 + 60000;
        } else {
            j = 43200000 + currentTimeMillis;
        }
        c0356a.f1135a = z2;
        c0356a.f1136b = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m40500d() {
        C0356a c0356a = this.f1134c;
        if (m40499e()) {
            return c0356a.f1135a;
        }
        Location m40502b = m40502b();
        if (m40502b != null) {
            m40498f(m40502b);
            return c0356a.f1135a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        if (i >= 6 && i < 22) {
            return false;
        }
        return true;
    }
}
