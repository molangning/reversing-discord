package p080e8;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p080e8.C6175f;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9208y;
import p383v7.C13127b;
import p460z7.C14103a;
import p460z7.C14104b;
import p460z7.C14105c;

/* renamed from: e8.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6175f {

    /* renamed from: a */
    public static final Pattern f17473a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    private static final Pattern f17474b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    private static final Map<String, Integer> f17475c;

    /* renamed from: d */
    private static final Map<String, Integer> f17476d;

    /* renamed from: e8.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C6177b {

        /* renamed from: c */
        private static final Comparator<C6177b> f17477c = new Comparator() { // from class: e8.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m23341e;
                m23341e = C6175f.C6177b.m23341e((C6175f.C6177b) obj, (C6175f.C6177b) obj2);
                return m23341e;
            }
        };

        /* renamed from: a */
        private final C6178c f17478a;

        /* renamed from: b */
        private final int f17479b;

        /* renamed from: e */
        public static /* synthetic */ int m23341e(C6177b c6177b, C6177b c6177b2) {
            return Integer.compare(c6177b.f17478a.f17481b, c6177b2.f17478a.f17481b);
        }

        private C6177b(C6178c c6178c, int i) {
            this.f17478a = c6178c;
            this.f17479b = i;
        }
    }

    /* renamed from: e8.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6178c {

        /* renamed from: a */
        public final String f17480a;

        /* renamed from: b */
        public final int f17481b;

        /* renamed from: c */
        public final String f17482c;

        /* renamed from: d */
        public final Set<String> f17483d;

        private C6178c(String str, int i, String str2, Set<String> set) {
            this.f17481b = i;
            this.f17480a = str;
            this.f17482c = str2;
            this.f17483d = set;
        }

        /* renamed from: a */
        public static C6178c m23340a(String str, int i) {
            String str2;
            String trim = str.trim();
            C9149a.m16452a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] m16286N0 = C9191p0.m16286N0(trim, "\\.");
            String str3 = m16286N0[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < m16286N0.length; i2++) {
                hashSet.add(m16286N0[i2]);
            }
            return new C6178c(str3, i, str2, hashSet);
        }

        /* renamed from: b */
        public static C6178c m23339b() {
            return new C6178c("", 0, "", Collections.emptySet());
        }
    }

    /* renamed from: e8.f$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6179d implements Comparable<C6179d> {

        /* renamed from: j */
        public final int f17484j;

        /* renamed from: k */
        public final C6173d f17485k;

        public C6179d(int i, C6173d c6173d) {
            this.f17484j = i;
            this.f17485k = c6173d;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C6179d c6179d) {
            return Integer.compare(this.f17484j, c6179d.f17484j);
        }
    }

    /* renamed from: e8.f$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6180e {

        /* renamed from: c */
        public CharSequence f17488c;

        /* renamed from: a */
        public long f17486a = 0;

        /* renamed from: b */
        public long f17487b = 0;

        /* renamed from: d */
        public int f17489d = 2;

        /* renamed from: e */
        public float f17490e = -3.4028235E38f;

        /* renamed from: f */
        public int f17491f = 1;

        /* renamed from: g */
        public int f17492g = 0;

        /* renamed from: h */
        public float f17493h = -3.4028235E38f;

        /* renamed from: i */
        public int f17494i = Integer.MIN_VALUE;

        /* renamed from: j */
        public float f17495j = 1.0f;

        /* renamed from: k */
        public int f17496k = Integer.MIN_VALUE;

        /* renamed from: b */
        private static float m23336b(float f, int i) {
            int i2 = (f > (-3.4028235E38f) ? 1 : (f == (-3.4028235E38f) ? 0 : -1));
            if (i2 == 0 || i != 0 || (f >= 0.0f && f <= 1.0f)) {
                return i2 != 0 ? f : i == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        /* renamed from: c */
        private static Layout.Alignment m23335c(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                C9197r.m16178h("WebvttCueParser", "Unknown textAlignment: " + i);
                                return null;
                            }
                        }
                    }
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        /* renamed from: d */
        private static float m23334d(int i, float f) {
            if (i != 0) {
                if (i == 1) {
                    return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
                } else if (i == 2) {
                    return f;
                } else {
                    throw new IllegalStateException(String.valueOf(i));
                }
            }
            return 1.0f - f;
        }

        /* renamed from: e */
        private static float m23333e(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        /* renamed from: f */
        private static int m23332f(int i) {
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        return i != 5 ? 1 : 2;
                    }
                    return 0;
                }
                return 2;
            }
            return 0;
        }

        /* renamed from: a */
        public C6174e m23337a() {
            return new C6174e(m23331g().m3155a(), this.f17486a, this.f17487b);
        }

        /* renamed from: g */
        public C13127b.C13129b m23331g() {
            float f = this.f17493h;
            if (f == -3.4028235E38f) {
                f = m23333e(this.f17489d);
            }
            int i = this.f17494i;
            if (i == Integer.MIN_VALUE) {
                i = m23332f(this.f17489d);
            }
            C13127b.C13129b m3139q = new C13127b.C13129b().m3141o(m23335c(this.f17489d)).m3148h(m23336b(this.f17490e, this.f17491f), this.f17491f).m3147i(this.f17492g).m3146j(f).m3145k(i).m3143m(Math.min(this.f17495j, m23334d(i, f))).m3139q(this.f17496k);
            CharSequence charSequence = this.f17488c;
            if (charSequence != null) {
                m3139q.m3142n(charSequence);
            }
            return m3139q;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f17475c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f17476d = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m23368a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        for (String str : set) {
            Map<String, Integer> map = f17475c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i, i2, 33);
            } else {
                Map<String, Integer> map2 = f17476d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i, i2, 33);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m23367b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                spannableStringBuilder.append('>');
                return;
            case 1:
                spannableStringBuilder.append('<');
                return;
            case 2:
                spannableStringBuilder.append('&');
                return;
            case 3:
                spannableStringBuilder.append(' ');
                return;
            default:
                C9197r.m16178h("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
    }

    /* renamed from: c */
    private static void m23366c(SpannableStringBuilder spannableStringBuilder, String str, C6178c c6178c, List<C6177b> list, List<C6173d> list2) {
        int m23360i = m23360i(list2, str, c6178c);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, C6177b.f17477c);
        int i = c6178c.f17481b;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if ("rt".equals(((C6177b) arrayList.get(i3)).f17478a.f17480a)) {
                C6177b c6177b = (C6177b) arrayList.get(i3);
                int m23362g = m23362g(m23360i(list2, str, c6177b.f17478a), m23360i, 1);
                int i4 = c6177b.f17478a.f17481b - i2;
                int i5 = c6177b.f17479b - i2;
                CharSequence subSequence = spannableStringBuilder.subSequence(i4, i5);
                spannableStringBuilder.delete(i4, i5);
                spannableStringBuilder.setSpan(new C14104b(subSequence.toString(), m23362g), i, i4, 33);
                i2 += subSequence.length();
                i = i4;
            }
        }
    }

    /* renamed from: d */
    private static void m23365d(String str, C6178c c6178c, List<C6177b> list, SpannableStringBuilder spannableStringBuilder, List<C6173d> list2) {
        int i = c6178c.f17481b;
        int length = spannableStringBuilder.length();
        String str2 = c6178c.f17480a;
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c = 0;
                    break;
                }
                break;
            case 98:
                if (str2.equals("b")) {
                    c = 1;
                    break;
                }
                break;
            case 99:
                if (str2.equals("c")) {
                    c = 2;
                    break;
                }
                break;
            case 105:
                if (str2.equals("i")) {
                    c = 3;
                    break;
                }
                break;
            case 117:
                if (str2.equals("u")) {
                    c = 4;
                    break;
                }
                break;
            case 118:
                if (str2.equals("v")) {
                    c = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c = 6;
                    break;
                }
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case 2:
                m23368a(spannableStringBuilder, c6178c.f17483d, i, length);
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 7:
                m23366c(spannableStringBuilder, str, c6178c, list, list2);
                break;
            default:
                return;
        }
        List<C6179d> m23361h = m23361h(list2, str, c6178c);
        for (int i2 = 0; i2 < m23361h.size(); i2++) {
            m23364e(spannableStringBuilder, m23361h.get(i2).f17485k, i, length);
        }
    }

    /* renamed from: e */
    private static void m23364e(SpannableStringBuilder spannableStringBuilder, C6173d c6173d, int i, int i2) {
        if (c6173d == null) {
            return;
        }
        if (c6173d.m23386i() != -1) {
            C14105c.m656a(spannableStringBuilder, new StyleSpan(c6173d.m23386i()), i, i2, 33);
        }
        if (c6173d.m23383l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (c6173d.m23382m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (c6173d.m23384k()) {
            C14105c.m656a(spannableStringBuilder, new ForegroundColorSpan(c6173d.m23392c()), i, i2, 33);
        }
        if (c6173d.m23385j()) {
            C14105c.m656a(spannableStringBuilder, new BackgroundColorSpan(c6173d.m23394a()), i, i2, 33);
        }
        if (c6173d.m23391d() != null) {
            C14105c.m656a(spannableStringBuilder, new TypefaceSpan(c6173d.m23391d()), i, i2, 33);
        }
        int m23389f = c6173d.m23389f();
        if (m23389f != 1) {
            if (m23389f != 2) {
                if (m23389f == 3) {
                    C14105c.m656a(spannableStringBuilder, new RelativeSizeSpan(c6173d.m23390e() / 100.0f), i, i2, 33);
                }
            } else {
                C14105c.m656a(spannableStringBuilder, new RelativeSizeSpan(c6173d.m23390e()), i, i2, 33);
            }
        } else {
            C14105c.m656a(spannableStringBuilder, new AbsoluteSizeSpan((int) c6173d.m23390e(), true), i, i2, 33);
        }
        if (c6173d.m23393b()) {
            spannableStringBuilder.setSpan(new C14103a(), i, i2, 33);
        }
    }

    /* renamed from: f */
    private static int m23363f(String str, int i) {
        int indexOf = str.indexOf(62, i);
        if (indexOf == -1) {
            return str.length();
        }
        return indexOf + 1;
    }

    /* renamed from: g */
    private static int m23362g(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    private static List<C6179d> m23361h(List<C6173d> list, String str, C6178c c6178c) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C6173d c6173d = list.get(i);
            int m23387h = c6173d.m23387h(str, c6178c.f17480a, c6178c.f17483d, c6178c.f17482c);
            if (m23387h > 0) {
                arrayList.add(new C6179d(m23387h, c6173d));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: i */
    private static int m23360i(List<C6173d> list, String str, C6178c c6178c) {
        List<C6179d> m23361h = m23361h(list, str, c6178c);
        for (int i = 0; i < m23361h.size(); i++) {
            C6173d c6173d = m23361h.get(i).f17485k;
            if (c6173d.m23388g() != -1) {
                return c6173d.m23388g();
            }
        }
        return -1;
    }

    /* renamed from: j */
    private static String m23359j(String str) {
        String trim = str.trim();
        C9149a.m16452a(!trim.isEmpty());
        return C9191p0.m16284O0(trim, "[ \\.]")[0];
    }

    /* renamed from: k */
    private static boolean m23358k(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals("b")) {
                    c = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals("c")) {
                    c = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals("i")) {
                    c = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals("u")) {
                    c = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals("v")) {
                    c = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: l */
    public static C13127b m23357l(CharSequence charSequence) {
        C6180e c6180e = new C6180e();
        c6180e.f17488c = charSequence;
        return c6180e.m23331g().m3155a();
    }

    /* renamed from: m */
    private static C6174e m23356m(String str, Matcher matcher, C9208y c9208y, List<C6173d> list) {
        C6180e c6180e = new C6180e();
        try {
            c6180e.f17486a = C6183i.m23325d((String) C9149a.m16448e(matcher.group(1)));
            c6180e.f17487b = C6183i.m23325d((String) C9149a.m16448e(matcher.group(2)));
            m23353p((String) C9149a.m16448e(matcher.group(3)), c6180e);
            StringBuilder sb2 = new StringBuilder();
            String m16082p = c9208y.m16082p();
            while (!TextUtils.isEmpty(m16082p)) {
                if (sb2.length() > 0) {
                    sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                }
                sb2.append(m16082p.trim());
                m16082p = c9208y.m16082p();
            }
            c6180e.f17488c = m23352q(str, sb2.toString(), list);
            return c6180e.m23337a();
        } catch (NumberFormatException unused) {
            C9197r.m16178h("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* renamed from: n */
    public static C6174e m23355n(C9208y c9208y, List<C6173d> list) {
        String m16082p = c9208y.m16082p();
        if (m16082p == null) {
            return null;
        }
        Pattern pattern = f17473a;
        Matcher matcher = pattern.matcher(m16082p);
        if (matcher.matches()) {
            return m23356m(null, matcher, c9208y, list);
        }
        String m16082p2 = c9208y.m16082p();
        if (m16082p2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(m16082p2);
        if (!matcher2.matches()) {
            return null;
        }
        return m23356m(m16082p.trim(), matcher2, c9208y, list);
    }

    /* renamed from: o */
    public static C13127b.C13129b m23354o(String str) {
        C6180e c6180e = new C6180e();
        m23353p(str, c6180e);
        return c6180e.m23331g();
    }

    /* renamed from: p */
    private static void m23353p(String str, C6180e c6180e) {
        Matcher matcher = f17474b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) C9149a.m16448e(matcher.group(1));
            String str3 = (String) C9149a.m16448e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    m23350s(str3, c6180e);
                } else if ("align".equals(str2)) {
                    c6180e.f17489d = m23347v(str3);
                } else if (ViewProps.POSITION.equals(str2)) {
                    m23348u(str3, c6180e);
                } else if ("size".equals(str2)) {
                    c6180e.f17495j = C6183i.m23326c(str3);
                } else if ("vertical".equals(str2)) {
                    c6180e.f17496k = m23346w(str3);
                } else {
                    C9197r.m16178h("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                C9197r.m16178h("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* renamed from: q */
    public static SpannedString m23352q(String str, String str2, List<C6173d> list) {
        boolean z;
        boolean z2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt != '&') {
                if (charAt != '<') {
                    spannableStringBuilder.append(charAt);
                    i++;
                } else {
                    int i2 = i + 1;
                    if (i2 < str2.length()) {
                        int i3 = 1;
                        if (str2.charAt(i2) == '/') {
                            z = true;
                        } else {
                            z = false;
                        }
                        i2 = m23363f(str2, i2);
                        int i4 = i2 - 2;
                        if (str2.charAt(i4) == '/') {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z) {
                            i3 = 2;
                        }
                        int i5 = i + i3;
                        if (!z2) {
                            i4 = i2 - 1;
                        }
                        String substring = str2.substring(i5, i4);
                        if (!substring.trim().isEmpty()) {
                            String m23359j = m23359j(substring);
                            if (m23358k(m23359j)) {
                                if (z) {
                                    while (!arrayDeque.isEmpty()) {
                                        C6178c c6178c = (C6178c) arrayDeque.pop();
                                        m23365d(str, c6178c, arrayList, spannableStringBuilder, list);
                                        if (!arrayDeque.isEmpty()) {
                                            arrayList.add(new C6177b(c6178c, spannableStringBuilder.length()));
                                        } else {
                                            arrayList.clear();
                                        }
                                        if (c6178c.f17480a.equals(m23359j)) {
                                            break;
                                        }
                                    }
                                } else if (!z2) {
                                    arrayDeque.push(C6178c.m23340a(substring, spannableStringBuilder.length()));
                                }
                            }
                        }
                    }
                    i = i2;
                }
            } else {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    m23367b(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            }
        }
        while (!arrayDeque.isEmpty()) {
            m23365d(str, (C6178c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m23365d(str, C6178c.m23339b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* renamed from: r */
    private static int m23351r(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals(ViewProps.END)) {
                    c = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals(ViewProps.START)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                C9197r.m16178h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: s */
    private static void m23350s(String str, C6180e c6180e) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            c6180e.f17492g = m23351r(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            c6180e.f17490e = C6183i.m23326c(str);
            c6180e.f17491f = 0;
            return;
        }
        c6180e.f17490e = Integer.parseInt(str);
        c6180e.f17491f = 1;
    }

    /* renamed from: t */
    private static int m23349t(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals(ViewProps.END)) {
                    c = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals(ViewProps.START)) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                C9197r.m16178h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: u */
    private static void m23348u(String str, C6180e c6180e) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            c6180e.f17494i = m23349t(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        c6180e.f17493h = C6183i.m23326c(str);
    }

    /* renamed from: v */
    private static int m23347v(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals(ViewProps.END)) {
                    c = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals(ViewProps.LEFT)) {
                    c = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals(ViewProps.RIGHT)) {
                    c = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals(ViewProps.START)) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            default:
                C9197r.m16178h("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    /* renamed from: w */
    private static int m23346w(String str) {
        str.hashCode();
        if (!str.equals("lr")) {
            if (!str.equals("rl")) {
                C9197r.m16178h("WebvttCueParser", "Invalid 'vertical' value: " + str);
                return Integer.MIN_VALUE;
            }
            return 1;
        }
        return 2;
    }
}