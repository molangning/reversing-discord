package p385v9;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: v9.i1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13192i1 {

    /* renamed from: f */
    static HashMap f34208f;

    /* renamed from: k */
    private static Object f34213k;

    /* renamed from: l */
    private static boolean f34214l;

    /* renamed from: a */
    public static final Uri f34203a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f34204b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f34205c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f34206d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    private static final AtomicBoolean f34207e = new AtomicBoolean();

    /* renamed from: g */
    static final HashMap f34209g = new HashMap();

    /* renamed from: h */
    static final HashMap f34210h = new HashMap();

    /* renamed from: i */
    static final HashMap f34211i = new HashMap();

    /* renamed from: j */
    static final HashMap f34212j = new HashMap();

    /* renamed from: m */
    static final String[] f34215m = new String[0];

    /* JADX WARN: Removed duplicated region for block: B:178:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m3043b(android.content.ContentResolver r16, java.lang.String r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p385v9.C13192i1.m3043b(android.content.ContentResolver, java.lang.String, boolean):boolean");
    }

    /* renamed from: c */
    private static void m3042c(ContentResolver contentResolver) {
        if (f34208f == null) {
            f34207e.set(false);
            f34208f = new HashMap();
            f34213k = new Object();
            f34214l = false;
            contentResolver.registerContentObserver(f34203a, true, new C13189h1(null));
        } else if (f34207e.getAndSet(false)) {
            f34208f.clear();
            f34209g.clear();
            f34210h.clear();
            f34211i.clear();
            f34212j.clear();
            f34213k = new Object();
            f34214l = false;
        }
    }

    /* renamed from: d */
    private static void m3041d(Object obj, String str, String str2) {
        synchronized (C13192i1.class) {
            if (obj == f34213k) {
                f34208f.put("gms:nearby:requires_gms_check", str2);
            }
        }
    }
}