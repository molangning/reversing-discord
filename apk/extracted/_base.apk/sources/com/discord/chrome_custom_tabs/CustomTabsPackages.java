package com.discord.chrome_custom_tabs;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\f\u0010\n\u001a\u0004\u0018\u00010\u0004*\u00020\u000bJ\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r*\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m14357d2 = {"Lcom/discord/chrome_custom_tabs/CustomTabsPackages;", "", "()V", "CHROME_BETA_PACKAGE", "", "CHROME_DEV_PACKAGE", "CHROME_LOCAL_PACKAGE", "CHROME_PROD_PACKAGE", "getDefaultViewIntentHandler", "Landroid/content/Intent;", "getCustomTabsDefaultPackage", "Landroid/content/Context;", "getCustomTabsPackages", "", "chrome_custom_tabs_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class CustomTabsPackages {
    private static final String CHROME_BETA_PACKAGE = "com.chrome.beta";
    private static final String CHROME_DEV_PACKAGE = "com.chrome.dev";
    private static final String CHROME_LOCAL_PACKAGE = "com.google.android.apps.chrome";
    private static final String CHROME_PROD_PACKAGE = "com.android.chrome";
    public static final CustomTabsPackages INSTANCE = new CustomTabsPackages();

    private CustomTabsPackages() {
    }

    private final List<String> getCustomTabsPackages(Context context) {
        List<ResolveInfo> queryIntentActivities;
        ResolveInfo resolveService;
        String str;
        ActivityInfo activityInfo;
        Intent defaultViewIntentHandler = getDefaultViewIntentHandler();
        if (Build.VERSION.SDK_INT >= 33) {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(defaultViewIntentHandler, PackageManager.ResolveInfoFlags.of(0));
        } else {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(defaultViewIntentHandler, 0);
        }
        C9612q.m13918g(queryIntentActivities, "if (Build.VERSION.SDK_IN…solveInfoFlags)\n        }");
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent = new Intent().setAction("android.support.customtabs.action.CustomTabsService").setPackage(resolveInfo.activityInfo.packageName);
            C9612q.m13918g(intent, "Intent()\n               …activityInfo.packageName)");
            if (Build.VERSION.SDK_INT >= 33) {
                resolveService = context.getPackageManager().resolveService(intent, PackageManager.ResolveInfoFlags.of(0));
            } else {
                resolveService = context.getPackageManager().resolveService(intent, 0);
            }
            if (resolveService != null && (activityInfo = resolveService.activityInfo) != null) {
                str = activityInfo.packageName;
            } else {
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private final Intent getDefaultViewIntentHandler() {
        Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));
        C9612q.m13918g(data, "Intent()\n            .se…mParts(\"http\", \"\", null))");
        return data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getCustomTabsDefaultPackage(Context context) {
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Object m14054V;
        C9612q.m13917h(context, "<this>");
        List<String> customTabsPackages = getCustomTabsPackages(context);
        Iterator<T> it = customTabsPackages.iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                obj = it.next();
                if (C9612q.m13922c((String) obj, CHROME_PROD_PACKAGE)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 == null) {
            Iterator<T> it2 = customTabsPackages.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (C9612q.m13922c((String) obj2, CHROME_BETA_PACKAGE)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            String str3 = (String) obj2;
            if (str3 == null) {
                Iterator<T> it3 = customTabsPackages.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj3 = it3.next();
                        if (C9612q.m13922c((String) obj3, CHROME_DEV_PACKAGE)) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                String str4 = (String) obj3;
                if (str4 == null) {
                    Iterator<T> it4 = customTabsPackages.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Object next = it4.next();
                        if (C9612q.m13922c((String) next, CHROME_LOCAL_PACKAGE)) {
                            str = next;
                            break;
                        }
                    }
                    String str5 = str;
                    if (str5 == null) {
                        m14054V = C9553r.m14054V(customTabsPackages);
                        return (String) m14054V;
                    }
                    return str5;
                }
                return str4;
            }
            return str3;
        }
        return str2;
    }
}
