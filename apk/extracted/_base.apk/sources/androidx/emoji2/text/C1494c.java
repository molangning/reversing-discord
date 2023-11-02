package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.core.provider.C1083e;
import androidx.core.util.C1138f;
import androidx.emoji2.text.C1500e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.emoji2.text.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1494c {

    /* renamed from: androidx.emoji2.text.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1495a {

        /* renamed from: a */
        private final C1496b f3900a;

        public C1495a(C1496b c1496b) {
            this.f3900a = c1496b == null ? m36665e() : c1496b;
        }

        /* renamed from: a */
        private C1500e.AbstractC1504c m36669a(Context context, C1083e c1083e) {
            if (c1083e == null) {
                return null;
            }
            return new C1517j(context, c1083e);
        }

        /* renamed from: b */
        private List<List<byte[]>> m36668b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        /* renamed from: d */
        private C1083e m36666d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new C1083e(str, str2, "emojicompat-emoji-font", m36668b(this.f3900a.mo36659b(packageManager, str2)));
        }

        /* renamed from: e */
        private static C1496b m36665e() {
            if (Build.VERSION.SDK_INT >= 28) {
                return new C1498d();
            }
            return new C1497c();
        }

        /* renamed from: f */
        private boolean m36664f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        /* renamed from: g */
        private ProviderInfo m36663g(PackageManager packageManager) {
            for (ResolveInfo resolveInfo : this.f3900a.mo36660c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0)) {
                ProviderInfo mo36661a = this.f3900a.mo36661a(resolveInfo);
                if (m36664f(mo36661a)) {
                    return mo36661a;
                }
            }
            return null;
        }

        /* renamed from: c */
        public C1500e.AbstractC1504c m36667c(Context context) {
            return m36669a(context, m36662h(context));
        }

        /* renamed from: h */
        C1083e m36662h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            C1138f.m37823g(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo m36663g = m36663g(packageManager);
            if (m36663g == null) {
                return null;
            }
            try {
                return m36666d(m36663g, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1496b {
        /* renamed from: a */
        public ProviderInfo mo36661a(ResolveInfo resolveInfo) {
            throw null;
        }

        /* renamed from: b */
        public Signature[] mo36659b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        /* renamed from: c */
        public List<ResolveInfo> mo36660c(PackageManager packageManager, Intent intent, int i) {
            throw null;
        }
    }

    /* renamed from: androidx.emoji2.text.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1497c extends C1496b {
        @Override // androidx.emoji2.text.C1494c.C1496b
        /* renamed from: a */
        public ProviderInfo mo36661a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.C1494c.C1496b
        /* renamed from: c */
        public List<ResolveInfo> mo36660c(PackageManager packageManager, Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    /* renamed from: androidx.emoji2.text.c$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1498d extends C1497c {
        @Override // androidx.emoji2.text.C1494c.C1496b
        /* renamed from: b */
        public Signature[] mo36659b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* renamed from: a */
    public static C1517j m36670a(Context context) {
        return (C1517j) new C1495a(null).m36667c(context);
    }
}
