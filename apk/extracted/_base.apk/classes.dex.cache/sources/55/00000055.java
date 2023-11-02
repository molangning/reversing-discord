package p009a8;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p009a8.C0087c;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9208y;
import p383v7.AbstractC13131d;
import p383v7.C13127b;
import p383v7.InterfaceC13133f;

/* renamed from: a8.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0085a extends AbstractC13131d {

    /* renamed from: t */
    private static final Pattern f403t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o */
    private final boolean f404o;

    /* renamed from: p */
    private final C0086b f405p;

    /* renamed from: q */
    private Map<String, C0087c> f406q;

    /* renamed from: r */
    private float f407r;

    /* renamed from: s */
    private float f408s;

    public C0085a(List<byte[]> list) {
        super("SsaDecoder");
        this.f407r = -3.4028235E38f;
        this.f408s = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.f404o = true;
            String m16305E = C9191p0.m16305E(list.get(0));
            C9149a.m16452a(m16305E.startsWith("Format:"));
            this.f405p = (C0086b) C9149a.m16448e(C0086b.m41166a(m16305E));
            m41173G(new C9208y(list.get(1)));
            return;
        }
        this.f404o = false;
        this.f405p = null;
    }

    /* renamed from: B */
    private static int m41178B(long j, List<Long> list, List<List<C13127b>> list2) {
        int i;
        ArrayList arrayList;
        int size = list.size() - 1;
        while (true) {
            if (size >= 0) {
                if (list.get(size).longValue() == j) {
                    return size;
                }
                if (list.get(size).longValue() < j) {
                    i = size + 1;
                    break;
                }
                size--;
            } else {
                i = 0;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        if (i == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(list2.get(i - 1));
        }
        list2.add(i, arrayList);
        return i;
    }

    /* renamed from: C */
    private static float m41177C(int i) {
        if (i != 0) {
            if (i != 1) {
                return i != 2 ? -3.4028235E38f : 0.95f;
            }
            return 0.5f;
        }
        return 0.05f;
    }

    /* renamed from: D */
    private static C13127b m41176D(String str, C0087c c0087c, C0087c.C0089b c0089b, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        C13127b.C13129b m3142n = new C13127b.C13129b().m3142n(spannableString);
        if (c0087c != null) {
            if (c0087c.f416c != null) {
                spannableString.setSpan(new ForegroundColorSpan(c0087c.f416c.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = c0087c.f417d;
            if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                m3142n.m3140p(f3 / f2, 1);
            }
            boolean z = c0087c.f418e;
            if (z && c0087c.f419f) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (c0087c.f419f) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
        }
        int i = c0089b.f431a;
        if (i == -1) {
            if (c0087c != null) {
                i = c0087c.f415b;
            } else {
                i = -1;
            }
        }
        m3142n.m3141o(m41167M(i)).m3145k(m41168L(i)).m3147i(m41169K(i));
        PointF pointF = c0089b.f432b;
        if (pointF != null && f2 != -3.4028235E38f && f != -3.4028235E38f) {
            m3142n.m3146j(pointF.x / f);
            m3142n.m3148h(c0089b.f432b.y / f2, 0);
        } else {
            m3142n.m3146j(m41177C(m3142n.m3152d()));
            m3142n.m3148h(m41177C(m3142n.m3153c()), 0);
        }
        return m3142n.m3155a();
    }

    /* renamed from: E */
    private void m41175E(String str, C0086b c0086b, List<List<C13127b>> list, List<Long> list2) {
        C0087c c0087c;
        int i;
        C9149a.m16452a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", c0086b.f413e);
        if (split.length != c0086b.f413e) {
            C9197r.m16178h("SsaDecoder", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long m41170J = m41170J(split[c0086b.f409a]);
        if (m41170J == -9223372036854775807L) {
            C9197r.m16178h("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        long m41170J2 = m41170J(split[c0086b.f410b]);
        if (m41170J2 == -9223372036854775807L) {
            C9197r.m16178h("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        Map<String, C0087c> map = this.f406q;
        if (map != null && (i = c0086b.f411c) != -1) {
            c0087c = map.get(split[i].trim());
        } else {
            c0087c = null;
        }
        String str2 = split[c0086b.f412d];
        C13127b m41176D = m41176D(C0087c.C0089b.m41154d(str2).replace("\\N", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).replace("\\n", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).replace("\\h", " "), c0087c, C0087c.C0089b.m41156b(str2), this.f407r, this.f408s);
        int m41178B = m41178B(m41170J2, list2, list);
        for (int m41178B2 = m41178B(m41170J, list2, list); m41178B2 < m41178B; m41178B2++) {
            list.get(m41178B2).add(m41176D);
        }
    }

    /* renamed from: F */
    private void m41174F(C9208y c9208y, List<List<C13127b>> list, List<Long> list2) {
        C0086b c0086b;
        if (this.f404o) {
            c0086b = this.f405p;
        } else {
            c0086b = null;
        }
        while (true) {
            String m16082p = c9208y.m16082p();
            if (m16082p != null) {
                if (m16082p.startsWith("Format:")) {
                    c0086b = C0086b.m41166a(m16082p);
                } else if (m16082p.startsWith("Dialogue:")) {
                    if (c0086b == null) {
                        C9197r.m16178h("SsaDecoder", "Skipping dialogue line before complete format: " + m16082p);
                    } else {
                        m41175E(m16082p, c0086b, list, list2);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: G */
    private void m41173G(C9208y c9208y) {
        while (true) {
            String m16082p = c9208y.m16082p();
            if (m16082p != null) {
                if ("[Script Info]".equalsIgnoreCase(m16082p)) {
                    m41172H(c9208y);
                } else if ("[V4+ Styles]".equalsIgnoreCase(m16082p)) {
                    this.f406q = m41171I(c9208y);
                } else if ("[V4 Styles]".equalsIgnoreCase(m16082p)) {
                    C9197r.m16180f("SsaDecoder", "[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(m16082p)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0006  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0059 A[SYNTHETIC] */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m41172H(p195k8.C9208y r5) {
        /*
            r4 = this;
        L0:
            java.lang.String r0 = r5.m16082p()
            if (r0 == 0) goto L59
            int r1 = r5.m16097a()
            if (r1 == 0) goto L14
            int r1 = r5.m16090h()
            r2 = 91
            if (r1 == r2) goto L59
        L14:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 2
            if (r1 == r2) goto L1f
            goto L0
        L1f:
            r1 = 0
            r1 = r0[r1]
            java.lang.String r1 = r1.trim()
            java.lang.String r1 = p195k8.C9191p0.m16272U0(r1)
            r1.hashCode()
            java.lang.String r2 = "playresx"
            boolean r2 = r1.equals(r2)
            r3 = 1
            if (r2 != 0) goto L4c
            java.lang.String r2 = "playresy"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3f
            goto L0
        L3f:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f408s = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L4c:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f407r = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0085a.m41172H(k8.y):void");
    }

    /* renamed from: I */
    private static Map<String, C0087c> m41171I(C9208y c9208y) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0087c.C0088a c0088a = null;
        while (true) {
            String m16082p = c9208y.m16082p();
            if (m16082p == null || (c9208y.m16097a() != 0 && c9208y.m16090h() == 91)) {
                break;
            } else if (m16082p.startsWith("Format:")) {
                c0088a = C0087c.C0088a.m41158a(m16082p);
            } else if (m16082p.startsWith("Style:")) {
                if (c0088a == null) {
                    C9197r.m16178h("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + m16082p);
                } else {
                    C0087c m41164b = C0087c.m41164b(m16082p, c0088a);
                    if (m41164b != null) {
                        linkedHashMap.put(m41164b.f414a, m41164b);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: J */
    private static long m41170J(String str) {
        Matcher matcher = f403t.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong((String) C9191p0.m16243j(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) C9191p0.m16243j(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) C9191p0.m16243j(matcher.group(3))) * 1000000) + (Long.parseLong((String) C9191p0.m16243j(matcher.group(4))) * 10000);
    }

    /* renamed from: K */
    private static int m41169K(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                C9197r.m16178h("SsaDecoder", "Unknown alignment: " + i);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    /* renamed from: L */
    private static int m41168L(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                C9197r.m16178h("SsaDecoder", "Unknown alignment: " + i);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    /* renamed from: M */
    private static Layout.Alignment m41167M(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                C9197r.m16178h("SsaDecoder", "Unknown alignment: " + i);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // p383v7.AbstractC13131d
    /* renamed from: z */
    protected InterfaceC13133f mo1161z(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C9208y c9208y = new C9208y(bArr, i);
        if (!this.f404o) {
            m41173G(c9208y);
        }
        m41174F(c9208y, arrayList, arrayList2);
        return new C0090d(arrayList, arrayList2);
    }
}