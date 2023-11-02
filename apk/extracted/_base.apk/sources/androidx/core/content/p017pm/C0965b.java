package androidx.core.content.p017pm;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.core.content.p017pm.AbstractC0963a;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.C1138f;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p375v.AbstractC13004a;

/* renamed from: androidx.core.content.pm.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0965b {

    /* renamed from: a */
    private static volatile AbstractC0963a<?> f3281a;

    /* renamed from: b */
    private static volatile List<AbstractC13004a> f3282b;

    /* renamed from: androidx.core.content.pm.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C0966a {
        /* renamed from: a */
        static String m38318a(List<ShortcutInfo> list) {
            int rank;
            String id2;
            int rank2;
            int i = -1;
            String str = null;
            for (ShortcutInfo shortcutInfo : list) {
                rank = shortcutInfo.getRank();
                if (rank > i) {
                    id2 = shortcutInfo.getId();
                    rank2 = shortcutInfo.getRank();
                    str = id2;
                    i = rank2;
                }
            }
            return str;
        }
    }

    private C0965b() {
    }

    /* renamed from: a */
    static boolean m38327a(Context context, ShortcutInfoCompat shortcutInfoCompat) {
        Bitmap decodeStream;
        IconCompat m38129i;
        IconCompat iconCompat = shortcutInfoCompat.f3258i;
        if (iconCompat == null) {
            return false;
        }
        int i = iconCompat.f3353a;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream m38118t = iconCompat.m38118t(context);
        if (m38118t == null || (decodeStream = BitmapFactory.decodeStream(m38118t)) == null) {
            return false;
        }
        if (i == 6) {
            m38129i = IconCompat.m38132f(decodeStream);
        } else {
            m38129i = IconCompat.m38129i(decodeStream);
        }
        shortcutInfoCompat.f3258i = m38129i;
        return true;
    }

    /* renamed from: b */
    public static int m38326b(Context context) {
        int maxShortcutCountPerActivity;
        C1138f.m37824f(context);
        if (Build.VERSION.SDK_INT >= 25) {
            maxShortcutCountPerActivity = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
            return maxShortcutCountPerActivity;
        }
        return 5;
    }

    /* renamed from: c */
    private static String m38325c(List<ShortcutInfoCompat> list) {
        int i = -1;
        String str = null;
        for (ShortcutInfoCompat shortcutInfoCompat : list) {
            if (shortcutInfoCompat.m38348n() > i) {
                str = shortcutInfoCompat.m38355g();
                i = shortcutInfoCompat.m38348n();
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<p375v.AbstractC13004a> m38324d(android.content.Context r8) {
        /*
            java.util.List<v.a> r0 = androidx.core.content.p017pm.C0965b.f3282b
            if (r0 != 0) goto L71
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.core.content.pm.SHORTCUT_LISTENER"
            r2.<init>(r3)
            java.lang.String r3 = r8.getPackageName()
            r2.setPackage(r3)
            r3 = 128(0x80, float:1.794E-43)
            java.util.List r1 = r1.queryIntentActivities(r2, r3)
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r1.next()
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            if (r2 != 0) goto L36
            goto L25
        L36:
            android.os.Bundle r2 = r2.metaData
            if (r2 != 0) goto L3b
            goto L25
        L3b:
            java.lang.String r3 = "androidx.core.content.pm.shortcut_listener_impl"
            java.lang.String r2 = r2.getString(r3)
            if (r2 != 0) goto L44
            goto L25
        L44:
            java.lang.Class<androidx.core.content.pm.b> r3 = androidx.core.content.p017pm.C0965b.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Exception -> L25
            r4 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r4, r3)     // Catch: java.lang.Exception -> L25
            java.lang.String r3 = "getInstance"
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L25
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r4] = r7     // Catch: java.lang.Exception -> L25
            java.lang.reflect.Method r2 = r2.getMethod(r3, r6)     // Catch: java.lang.Exception -> L25
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L25
            r3[r4] = r8     // Catch: java.lang.Exception -> L25
            r4 = 0
            java.lang.Object r2 = r2.invoke(r4, r3)     // Catch: java.lang.Exception -> L25
            v.a r2 = (p375v.AbstractC13004a) r2     // Catch: java.lang.Exception -> L25
            r0.add(r2)     // Catch: java.lang.Exception -> L25
            goto L25
        L6b:
            java.util.List<v.a> r8 = androidx.core.content.p017pm.C0965b.f3282b
            if (r8 != 0) goto L71
            androidx.core.content.p017pm.C0965b.f3282b = r0
        L71:
            java.util.List<v.a> r8 = androidx.core.content.p017pm.C0965b.f3282b
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p017pm.C0965b.m38324d(android.content.Context):java.util.List");
    }

    /* renamed from: e */
    private static AbstractC0963a<?> m38323e(Context context) {
        if (f3281a == null) {
            try {
                f3281a = (AbstractC0963a) Class.forName("o0.a", false, C0965b.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f3281a == null) {
                f3281a = new AbstractC0963a.C0964a();
            }
        }
        return f3281a;
    }

    /* renamed from: f */
    public static List<ShortcutInfoCompat> m38322f(Context context, int i) {
        List pinnedShortcuts;
        List dynamicShortcuts;
        List manifestShortcuts;
        List shortcuts;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            shortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(i);
            return ShortcutInfoCompat.m38360b(context, shortcuts);
        } else if (i2 >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            ArrayList arrayList = new ArrayList();
            if ((i & 1) != 0) {
                manifestShortcuts = shortcutManager.getManifestShortcuts();
                arrayList.addAll(manifestShortcuts);
            }
            if ((i & 2) != 0) {
                dynamicShortcuts = shortcutManager.getDynamicShortcuts();
                arrayList.addAll(dynamicShortcuts);
            }
            if ((i & 4) != 0) {
                pinnedShortcuts = shortcutManager.getPinnedShortcuts();
                arrayList.addAll(pinnedShortcuts);
            }
            return ShortcutInfoCompat.m38360b(context, arrayList);
        } else {
            if ((i & 2) != 0) {
                try {
                    return m38323e(context).mo9546b();
                } catch (Exception unused) {
                }
            }
            return Collections.emptyList();
        }
    }

    /* renamed from: g */
    public static boolean m38321g(Context context, ShortcutInfoCompat shortcutInfoCompat) {
        boolean isRateLimitingActive;
        List dynamicShortcuts;
        C1138f.m37824f(context);
        C1138f.m37824f(shortcutInfoCompat);
        int i = Build.VERSION.SDK_INT;
        if (i <= 32 && shortcutInfoCompat.m38346p(1)) {
            for (AbstractC13004a abstractC13004a : m38324d(context)) {
                abstractC13004a.m3436b(Collections.singletonList(shortcutInfoCompat));
            }
            return true;
        }
        int m38326b = m38326b(context);
        if (m38326b == 0) {
            return false;
        }
        if (i <= 29) {
            m38327a(context, shortcutInfoCompat);
        }
        if (i >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(shortcutInfoCompat.m38345q());
        } else if (i >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            isRateLimitingActive = shortcutManager.isRateLimitingActive();
            if (isRateLimitingActive) {
                return false;
            }
            dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= m38326b) {
                shortcutManager.removeDynamicShortcuts(Arrays.asList(C0966a.m38318a(dynamicShortcuts)));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(shortcutInfoCompat.m38345q()));
        }
        AbstractC0963a<?> m38323e = m38323e(context);
        try {
            List<ShortcutInfoCompat> mo9546b = m38323e.mo9546b();
            if (mo9546b.size() >= m38326b) {
                m38323e.mo9544d(Arrays.asList(m38325c(mo9546b)));
            }
            m38323e.mo9547a(Arrays.asList(shortcutInfoCompat));
            for (AbstractC13004a abstractC13004a2 : m38324d(context)) {
                abstractC13004a2.m3436b(Collections.singletonList(shortcutInfoCompat));
            }
            m38319i(context, shortcutInfoCompat.m38355g());
            return true;
        } catch (Exception unused) {
            for (AbstractC13004a abstractC13004a3 : m38324d(context)) {
                abstractC13004a3.m3436b(Collections.singletonList(shortcutInfoCompat));
            }
            m38319i(context, shortcutInfoCompat.m38355g());
            return false;
        } catch (Throwable th2) {
            for (AbstractC13004a abstractC13004a4 : m38324d(context)) {
                abstractC13004a4.m3436b(Collections.singletonList(shortcutInfoCompat));
            }
            m38319i(context, shortcutInfoCompat.m38355g());
            throw th2;
        }
    }

    /* renamed from: h */
    public static void m38320h(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        m38323e(context).mo9545c();
        for (AbstractC13004a abstractC13004a : m38324d(context)) {
            abstractC13004a.m3437a();
        }
    }

    /* renamed from: i */
    public static void m38319i(Context context, String str) {
        C1138f.m37824f(context);
        C1138f.m37824f(str);
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        }
        for (AbstractC13004a abstractC13004a : m38324d(context)) {
            abstractC13004a.m3435c(Collections.singletonList(str));
        }
    }
}
