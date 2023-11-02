package p253o0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import androidx.collection.C0624a;
import androidx.core.content.p017pm.ShortcutInfoCompat;
import androidx.core.util.C1132a;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.uimanager.events.TouchesHelper;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: o0.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C10933b {

    /* renamed from: o0.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C10934a {

        /* renamed from: a */
        final String f28699a;

        /* renamed from: b */
        final String f28700b;

        /* renamed from: c */
        final ShortcutInfoCompat f28701c;

        public C10934a(ShortcutInfoCompat shortcutInfoCompat, String str, String str2) {
            this.f28701c = shortcutInfoCompat;
            this.f28699a = str;
            this.f28700b = str2;
        }
    }

    /* renamed from: a */
    private static String m9527a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        if (attributeValue == null) {
            return xmlPullParser.getAttributeValue(null, str);
        }
        return attributeValue;
    }

    /* renamed from: b */
    public static Map<String, C10934a> m9526b(File file, Context context) {
        FileInputStream fileInputStream;
        C10934a m9523e;
        ShortcutInfoCompat shortcutInfoCompat;
        C0624a c0624a = new C0624a();
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Exception e) {
            file.delete();
            Log.e("ShortcutInfoCompatSaver", "Failed to load saved values from file " + file.getAbsolutePath() + ". Old state removed, new added", e);
        }
        if (!file.exists()) {
            fileInputStream.close();
            return c0624a;
        }
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(fileInputStream, "UTF_8");
        while (true) {
            int next = newPullParser.next();
            if (next == 1) {
                break;
            } else if (next == 2 && newPullParser.getName().equals(TouchesHelper.TARGET_KEY) && (m9523e = m9523e(newPullParser, context)) != null && (shortcutInfoCompat = m9523e.f28701c) != null) {
                c0624a.put(shortcutInfoCompat.m38355g(), m9523e);
            }
        }
        fileInputStream.close();
        return c0624a;
    }

    /* renamed from: c */
    private static ComponentName m9525c(XmlPullParser xmlPullParser) {
        String m9527a = m9527a(xmlPullParser, "component");
        if (TextUtils.isEmpty(m9527a)) {
            return null;
        }
        return ComponentName.unflattenFromString(m9527a);
    }

    /* renamed from: d */
    private static Intent m9524d(XmlPullParser xmlPullParser) {
        String m9527a = m9527a(xmlPullParser, "action");
        String m9527a2 = m9527a(xmlPullParser, "targetPackage");
        String m9527a3 = m9527a(xmlPullParser, "targetClass");
        if (m9527a == null) {
            return null;
        }
        Intent intent = new Intent(m9527a);
        if (!TextUtils.isEmpty(m9527a2) && !TextUtils.isEmpty(m9527a3)) {
            intent.setClassName(m9527a2, m9527a3);
        }
        return intent;
    }

    /* renamed from: e */
    private static C10934a m9523e(XmlPullParser xmlPullParser, Context context) {
        if (!xmlPullParser.getName().equals(TouchesHelper.TARGET_KEY)) {
            return null;
        }
        String m9527a = m9527a(xmlPullParser, "id");
        String m9527a2 = m9527a(xmlPullParser, "short_label");
        if (TextUtils.isEmpty(m9527a) || TextUtils.isEmpty(m9527a2)) {
            return null;
        }
        int parseInt = Integer.parseInt(m9527a(xmlPullParser, "rank"));
        String m9527a3 = m9527a(xmlPullParser, "long_label");
        String m9527a4 = m9527a(xmlPullParser, "disabled_message");
        ComponentName m9525c = m9525c(xmlPullParser);
        String m9527a5 = m9527a(xmlPullParser, "icon_resource_name");
        String m9527a6 = m9527a(xmlPullParser, "icon_bitmap_path");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    name.hashCode();
                    if (!name.equals("intent")) {
                        if (name.equals("categories")) {
                            String m9527a7 = m9527a(xmlPullParser, ZeroconfModule.KEY_SERVICE_NAME);
                            if (!TextUtils.isEmpty(m9527a7)) {
                                hashSet.add(m9527a7);
                            }
                        }
                    } else {
                        Intent m9524d = m9524d(xmlPullParser);
                        if (m9524d != null) {
                            arrayList.add(m9524d);
                        }
                    }
                } else if (next == 3 && xmlPullParser.getName().equals(TouchesHelper.TARGET_KEY)) {
                    break;
                }
            } else {
                break;
            }
        }
        ShortcutInfoCompat.C0962b m38332l = new ShortcutInfoCompat.C0962b(context, m9527a).m38331m(m9527a2).m38332l(parseInt);
        if (!TextUtils.isEmpty(m9527a3)) {
            m38332l.m38335i(m9527a3);
        }
        if (!TextUtils.isEmpty(m9527a4)) {
            m38332l.m38340d(m9527a4);
        }
        if (m9525c != null) {
            m38332l.m38342b(m9525c);
        }
        if (!arrayList.isEmpty()) {
            m38332l.m38337g((Intent[]) arrayList.toArray(new Intent[0]));
        }
        if (!hashSet.isEmpty()) {
            m38332l.m38341c(hashSet);
        }
        return new C10934a(m38332l.m38343a(), m9527a5, m9527a6);
    }

    /* renamed from: f */
    public static void m9522f(List<C10934a> list, File file) {
        C1132a c1132a = new C1132a(file);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream m37838e = c1132a.m37838e();
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(m37838e);
                XmlSerializer newSerializer = Xml.newSerializer();
                newSerializer.setOutput(bufferedOutputStream, "UTF_8");
                newSerializer.startDocument(null, Boolean.TRUE);
                newSerializer.startTag(null, "share_targets");
                for (C10934a c10934a : list) {
                    m9518j(newSerializer, c10934a);
                }
                newSerializer.endTag(null, "share_targets");
                newSerializer.endDocument();
                bufferedOutputStream.flush();
                m37838e.flush();
                c1132a.m37841b(m37838e);
            } catch (Exception e) {
                e = e;
                fileOutputStream = m37838e;
                Log.e("ShortcutInfoCompatSaver", "Failed to write to file " + c1132a.m37840c(), e);
                c1132a.m37842a(fileOutputStream);
                throw new RuntimeException("Failed to write to file " + c1132a.m37840c(), e);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* renamed from: g */
    private static void m9521g(XmlSerializer xmlSerializer, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        xmlSerializer.attribute(null, str, str2);
    }

    /* renamed from: h */
    private static void m9520h(XmlSerializer xmlSerializer, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        xmlSerializer.startTag(null, "categories");
        m9521g(xmlSerializer, ZeroconfModule.KEY_SERVICE_NAME, str);
        xmlSerializer.endTag(null, "categories");
    }

    /* renamed from: i */
    private static void m9519i(XmlSerializer xmlSerializer, Intent intent) {
        xmlSerializer.startTag(null, "intent");
        m9521g(xmlSerializer, "action", intent.getAction());
        if (intent.getComponent() != null) {
            m9521g(xmlSerializer, "targetPackage", intent.getComponent().getPackageName());
            m9521g(xmlSerializer, "targetClass", intent.getComponent().getClassName());
        }
        xmlSerializer.endTag(null, "intent");
    }

    /* renamed from: j */
    private static void m9518j(XmlSerializer xmlSerializer, C10934a c10934a) {
        xmlSerializer.startTag(null, TouchesHelper.TARGET_KEY);
        ShortcutInfoCompat shortcutInfoCompat = c10934a.f28701c;
        m9521g(xmlSerializer, "id", shortcutInfoCompat.m38355g());
        m9521g(xmlSerializer, "short_label", shortcutInfoCompat.m38347o().toString());
        m9521g(xmlSerializer, "rank", Integer.toString(shortcutInfoCompat.m38348n()));
        if (!TextUtils.isEmpty(shortcutInfoCompat.m38350l())) {
            m9521g(xmlSerializer, "long_label", shortcutInfoCompat.m38350l().toString());
        }
        if (!TextUtils.isEmpty(shortcutInfoCompat.m38357e())) {
            m9521g(xmlSerializer, "disabled_message", shortcutInfoCompat.m38357e().toString());
        }
        if (shortcutInfoCompat.m38359c() != null) {
            m9521g(xmlSerializer, "component", shortcutInfoCompat.m38359c().flattenToString());
        }
        if (!TextUtils.isEmpty(c10934a.f28699a)) {
            m9521g(xmlSerializer, "icon_resource_name", c10934a.f28699a);
        }
        if (!TextUtils.isEmpty(c10934a.f28700b)) {
            m9521g(xmlSerializer, "icon_bitmap_path", c10934a.f28700b);
        }
        for (Intent intent : shortcutInfoCompat.m38353i()) {
            m9519i(xmlSerializer, intent);
        }
        for (String str : shortcutInfoCompat.m38358d()) {
            m9520h(xmlSerializer, str);
        }
        xmlSerializer.endTag(null, TouchesHelper.TARGET_KEY);
    }
}