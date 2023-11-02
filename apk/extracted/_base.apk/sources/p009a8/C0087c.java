package p009a8;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p177jb.C8891c;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a8.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0087c {

    /* renamed from: a */
    public final String f414a;

    /* renamed from: b */
    public final int f415b;

    /* renamed from: c */
    public final Integer f416c;

    /* renamed from: d */
    public final float f417d;

    /* renamed from: e */
    public final boolean f418e;

    /* renamed from: f */
    public final boolean f419f;

    /* renamed from: a8.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C0088a {

        /* renamed from: a */
        public final int f420a;

        /* renamed from: b */
        public final int f421b;

        /* renamed from: c */
        public final int f422c;

        /* renamed from: d */
        public final int f423d;

        /* renamed from: e */
        public final int f424e;

        /* renamed from: f */
        public final int f425f;

        /* renamed from: g */
        public final int f426g;

        private C0088a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f420a = i;
            this.f421b = i2;
            this.f422c = i3;
            this.f423d = i4;
            this.f424e = i5;
            this.f425f = i6;
            this.f426g = i7;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        public static C0088a m41158a(String str) {
            char c;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            for (int i7 = 0; i7 < split.length; i7++) {
                String m16272U0 = C9191p0.m16272U0(split[i7].trim());
                m16272U0.hashCode();
                switch (m16272U0.hashCode()) {
                    case -1178781136:
                        if (m16272U0.equals("italic")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -70925746:
                        if (m16272U0.equals("primarycolour")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3029637:
                        if (m16272U0.equals("bold")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3373707:
                        if (m16272U0.equals(ZeroconfModule.KEY_SERVICE_NAME)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 366554320:
                        if (m16272U0.equals("fontsize")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1767875043:
                        if (m16272U0.equals("alignment")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        i6 = i7;
                        break;
                    case 1:
                        i3 = i7;
                        break;
                    case 2:
                        i5 = i7;
                        break;
                    case 3:
                        i = i7;
                        break;
                    case 4:
                        i4 = i7;
                        break;
                    case 5:
                        i2 = i7;
                        break;
                }
            }
            if (i != -1) {
                return new C0088a(i, i2, i3, i4, i5, i6, split.length);
            }
            return null;
        }
    }

    /* renamed from: a8.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C0089b {

        /* renamed from: c */
        private static final Pattern f427c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d */
        private static final Pattern f428d = Pattern.compile(C9191p0.m16307D("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e */
        private static final Pattern f429e = Pattern.compile(C9191p0.m16307D("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f */
        private static final Pattern f430f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a */
        public final int f431a;

        /* renamed from: b */
        public final PointF f432b;

        private C0089b(int i, PointF pointF) {
            this.f431a = i;
            this.f432b = pointF;
        }

        /* renamed from: a */
        private static int m41157a(String str) {
            Matcher matcher = f430f.matcher(str);
            if (matcher.find()) {
                return C0087c.m41162d((String) C9149a.m16448e(matcher.group(1)));
            }
            return -1;
        }

        /* renamed from: b */
        public static C0089b m41156b(String str) {
            Matcher matcher = f427c.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String str2 = (String) C9149a.m16448e(matcher.group(1));
                try {
                    PointF m41155c = m41155c(str2);
                    if (m41155c != null) {
                        pointF = m41155c;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int m41157a = m41157a(str2);
                    if (m41157a != -1) {
                        i = m41157a;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new C0089b(i, pointF);
        }

        /* renamed from: c */
        private static PointF m41155c(String str) {
            String group;
            String group2;
            Matcher matcher = f428d.matcher(str);
            Matcher matcher2 = f429e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    C9197r.m16180f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else if (find2) {
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            } else {
                return null;
            }
            return new PointF(Float.parseFloat(((String) C9149a.m16448e(group)).trim()), Float.parseFloat(((String) C9149a.m16448e(group2)).trim()));
        }

        /* renamed from: d */
        public static String m41154d(String str) {
            return f427c.matcher(str).replaceAll("");
        }
    }

    private C0087c(String str, int i, Integer num, float f, boolean z, boolean z2) {
        this.f414a = str;
        this.f415b = i;
        this.f416c = num;
        this.f417d = f;
        this.f418e = z;
        this.f419f = z2;
    }

    /* renamed from: b */
    public static C0087c m41164b(String str, C0088a c0088a) {
        int i;
        Integer num;
        float f;
        boolean z;
        C9149a.m16452a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i2 = c0088a.f426g;
        boolean z2 = false;
        if (length != i2) {
            C9197r.m16178h("SsaStyle", C9191p0.m16307D("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i2), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[c0088a.f420a].trim();
            int i3 = c0088a.f421b;
            if (i3 != -1) {
                i = m41162d(split[i3].trim());
            } else {
                i = -1;
            }
            int i4 = c0088a.f422c;
            if (i4 != -1) {
                num = m41160f(split[i4].trim());
            } else {
                num = null;
            }
            int i5 = c0088a.f423d;
            if (i5 != -1) {
                f = m41159g(split[i5].trim());
            } else {
                f = -3.4028235E38f;
            }
            int i6 = c0088a.f424e;
            if (i6 != -1) {
                z = m41161e(split[i6].trim());
            } else {
                z = false;
            }
            int i7 = c0088a.f425f;
            if (i7 != -1) {
                z2 = m41161e(split[i7].trim());
            }
            return new C0087c(trim, i, num, f, z, z2);
        } catch (RuntimeException e) {
            C9197r.m16177i("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
            return null;
        }
    }

    /* renamed from: c */
    private static boolean m41163c(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static int m41162d(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (m41163c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        C9197r.m16178h("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    /* renamed from: e */
    private static boolean m41161e(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            C9197r.m16177i("SsaStyle", "Failed to parse bold/italic: '" + str + "'", e);
            return false;
        }
    }

    /* renamed from: f */
    public static Integer m41160f(String str) {
        long parseLong;
        boolean z;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z = true;
            } else {
                z = false;
            }
            C9149a.m16452a(z);
            int m17078c = C8891c.m17078c(((parseLong >> 24) & 255) ^ 255);
            int m17078c2 = C8891c.m17078c((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(m17078c, C8891c.m17078c(parseLong & 255), C8891c.m17078c((parseLong >> 8) & 255), m17078c2));
        } catch (IllegalArgumentException e) {
            C9197r.m16177i("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* renamed from: g */
    private static float m41159g(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            C9197r.m16177i("SsaStyle", "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }
}
