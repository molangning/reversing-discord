package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.core.provider.C1083e;
import com.facebook.react.views.text.TypefaceStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p356u.C12814i;

/* renamed from: androidx.core.content.res.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0971e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.res.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0972a {
        /* renamed from: a */
        static int m38265a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* renamed from: androidx.core.content.res.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0973b {
    }

    /* renamed from: androidx.core.content.res.e$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0974c implements InterfaceC0973b {

        /* renamed from: a */
        private final C0975d[] f3300a;

        public C0974c(C0975d[] c0975dArr) {
            this.f3300a = c0975dArr;
        }

        /* renamed from: a */
        public C0975d[] m38264a() {
            return this.f3300a;
        }
    }

    /* renamed from: androidx.core.content.res.e$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0975d {

        /* renamed from: a */
        private final String f3301a;

        /* renamed from: b */
        private final int f3302b;

        /* renamed from: c */
        private final boolean f3303c;

        /* renamed from: d */
        private final String f3304d;

        /* renamed from: e */
        private final int f3305e;

        /* renamed from: f */
        private final int f3306f;

        public C0975d(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f3301a = str;
            this.f3302b = i;
            this.f3303c = z;
            this.f3304d = str2;
            this.f3305e = i2;
            this.f3306f = i3;
        }

        /* renamed from: a */
        public String m38263a() {
            return this.f3301a;
        }

        /* renamed from: b */
        public int m38262b() {
            return this.f3306f;
        }

        /* renamed from: c */
        public int m38261c() {
            return this.f3305e;
        }

        /* renamed from: d */
        public String m38260d() {
            return this.f3304d;
        }

        /* renamed from: e */
        public int m38259e() {
            return this.f3302b;
        }

        /* renamed from: f */
        public boolean m38258f() {
            return this.f3303c;
        }
    }

    /* renamed from: androidx.core.content.res.e$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0976e implements InterfaceC0973b {

        /* renamed from: a */
        private final C1083e f3307a;

        /* renamed from: b */
        private final int f3308b;

        /* renamed from: c */
        private final int f3309c;

        /* renamed from: d */
        private final String f3310d;

        public C0976e(C1083e c1083e, int i, int i2, String str) {
            this.f3307a = c1083e;
            this.f3309c = i;
            this.f3308b = i2;
            this.f3310d = str;
        }

        /* renamed from: a */
        public int m38257a() {
            return this.f3309c;
        }

        /* renamed from: b */
        public C1083e m38256b() {
            return this.f3307a;
        }

        /* renamed from: c */
        public String m38255c() {
            return this.f3310d;
        }

        /* renamed from: d */
        public int m38254d() {
            return this.f3308b;
        }
    }

    /* renamed from: a */
    private static int m38273a(TypedArray typedArray, int i) {
        return C0972a.m38265a(typedArray, i);
    }

    /* renamed from: b */
    public static InterfaceC0973b m38272b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m38270d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m38271c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m38273a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m38266h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m38266h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static InterfaceC0973b m38270d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m38269e(xmlPullParser, resources);
        }
        m38267g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static InterfaceC0973b m38269e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C12814i.f33295h);
        String string = obtainAttributes.getString(C12814i.f33296i);
        String string2 = obtainAttributes.getString(C12814i.f33300m);
        String string3 = obtainAttributes.getString(C12814i.f33301n);
        int resourceId = obtainAttributes.getResourceId(C12814i.f33297j, 0);
        int integer = obtainAttributes.getInteger(C12814i.f33298k, 1);
        int integer2 = obtainAttributes.getInteger(C12814i.f33299l, 500);
        String string4 = obtainAttributes.getString(C12814i.f33302o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m38267g(xmlPullParser);
            }
            return new C0976e(new C1083e(string, string2, string3, m38271c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m38268f(xmlPullParser, resources));
                } else {
                    m38267g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C0974c((C0975d[]) arrayList.toArray(new C0975d[0]));
    }

    /* renamed from: f */
    private static C0975d m38268f(XmlPullParser xmlPullParser, Resources resources) {
        boolean z;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C12814i.f33303p);
        int i = C12814i.f33312y;
        if (!obtainAttributes.hasValue(i)) {
            i = C12814i.f33305r;
        }
        int i2 = obtainAttributes.getInt(i, TypefaceStyle.NORMAL);
        int i3 = C12814i.f33310w;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = C12814i.f33306s;
        }
        if (1 == obtainAttributes.getInt(i3, 0)) {
            z = true;
        } else {
            z = false;
        }
        int i4 = C12814i.f33313z;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = C12814i.f33307t;
        }
        int i5 = C12814i.f33311x;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = C12814i.f33308u;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = C12814i.f33309v;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = C12814i.f33304q;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m38267g(xmlPullParser);
        }
        return new C0975d(string2, i2, z, string, i6, resourceId);
    }

    /* renamed from: g */
    private static void m38267g(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    private static List<byte[]> m38266h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
