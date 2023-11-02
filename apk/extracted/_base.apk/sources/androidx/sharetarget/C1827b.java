package androidx.sharetarget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import androidx.sharetarget.C1825a;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.sharetarget.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1827b {

    /* renamed from: a */
    private static volatile ArrayList<C1825a> f5006a;

    /* renamed from: b */
    private static final Object f5007b = new Object();

    /* renamed from: a */
    private static String m35297a(XmlResourceParser xmlResourceParser, String str) {
        String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        if (attributeValue == null) {
            return xmlResourceParser.getAttributeValue(null, str);
        }
        return attributeValue;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static ArrayList<C1825a> m35296b(Context context) {
        if (f5006a == null) {
            synchronized (f5007b) {
                if (f5006a == null) {
                    f5006a = m35293e(context);
                }
            }
        }
        return f5006a;
    }

    /* renamed from: c */
    private static XmlResourceParser m35295c(Context context, ActivityInfo activityInfo) {
        XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), "android.app.shortcuts");
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
    }

    /* renamed from: d */
    private static C1825a m35294d(XmlResourceParser xmlResourceParser) {
        String m35297a = m35297a(xmlResourceParser, "targetClass");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                if (next == 2) {
                    String name = xmlResourceParser.getName();
                    name.hashCode();
                    if (!name.equals("data")) {
                        if (name.equals("category")) {
                            arrayList2.add(m35297a(xmlResourceParser, ZeroconfModule.KEY_SERVICE_NAME));
                        }
                    } else {
                        arrayList.add(m35291g(xmlResourceParser));
                    }
                } else if (next == 3 && xmlResourceParser.getName().equals("share-target")) {
                    break;
                }
            } else {
                break;
            }
        }
        if (!arrayList.isEmpty() && m35297a != null && !arrayList2.isEmpty()) {
            return new C1825a((C1825a.C1826a[]) arrayList.toArray(new C1825a.C1826a[arrayList.size()]), m35297a, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        return null;
    }

    /* renamed from: e */
    private static ArrayList<C1825a> m35293e(Context context) {
        ArrayList<C1825a> arrayList = new ArrayList<>();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (queryIntentActivities == null) {
            return arrayList;
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            Bundle bundle = activityInfo.metaData;
            if (bundle != null && bundle.containsKey("android.app.shortcuts")) {
                arrayList.addAll(m35292f(context, activityInfo));
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private static ArrayList<C1825a> m35292f(Context context, ActivityInfo activityInfo) {
        C1825a m35294d;
        ArrayList<C1825a> arrayList = new ArrayList<>();
        XmlResourceParser m35295c = m35295c(context, activityInfo);
        while (true) {
            try {
                int next = m35295c.next();
                if (next == 1) {
                    break;
                } else if (next == 2 && m35295c.getName().equals("share-target") && (m35294d = m35294d(m35295c)) != null) {
                    arrayList.add(m35294d);
                }
            } catch (Exception e) {
                Log.e("ShareTargetXmlParser", "Failed to parse the Xml resource: ", e);
            }
        }
        m35295c.close();
        return arrayList;
    }

    /* renamed from: g */
    private static C1825a.C1826a m35291g(XmlResourceParser xmlResourceParser) {
        return new C1825a.C1826a(m35297a(xmlResourceParser, "scheme"), m35297a(xmlResourceParser, ZeroconfModule.KEY_SERVICE_HOST), m35297a(xmlResourceParser, ZeroconfModule.KEY_SERVICE_PORT), m35297a(xmlResourceParser, "path"), m35297a(xmlResourceParser, "pathPattern"), m35297a(xmlResourceParser, "pathPrefix"), m35297a(xmlResourceParser, "mimeType"));
    }
}
