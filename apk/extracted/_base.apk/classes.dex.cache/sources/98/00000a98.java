package p041c8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p195k8.C9149a;
import p383v7.C13127b;

/* renamed from: c8.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2456d {

    /* renamed from: a */
    public final String f6762a;

    /* renamed from: b */
    public final String f6763b;

    /* renamed from: c */
    public final boolean f6764c;

    /* renamed from: d */
    public final long f6765d;

    /* renamed from: e */
    public final long f6766e;

    /* renamed from: f */
    public final C2459g f6767f;

    /* renamed from: g */
    private final String[] f6768g;

    /* renamed from: h */
    public final String f6769h;

    /* renamed from: i */
    public final String f6770i;

    /* renamed from: j */
    public final C2456d f6771j;

    /* renamed from: k */
    private final HashMap<String, Integer> f6772k;

    /* renamed from: l */
    private final HashMap<String, Integer> f6773l;

    /* renamed from: m */
    private List<C2456d> f6774m;

    private C2456d(String str, String str2, long j, long j2, C2459g c2459g, String[] strArr, String str3, String str4, C2456d c2456d) {
        boolean z;
        this.f6762a = str;
        this.f6763b = str2;
        this.f6770i = str4;
        this.f6767f = c2459g;
        this.f6768g = strArr;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.f6764c = z;
        this.f6765d = j;
        this.f6766e = j2;
        this.f6769h = (String) C9149a.m16448e(str3);
        this.f6771j = c2456d;
        this.f6772k = new HashMap<>();
        this.f6773l = new HashMap<>();
    }

    /* renamed from: b */
    private void m33265b(Map<String, C2459g> map, C13127b.C13129b c13129b, int i, int i2, int i3) {
        C2459g m33245f = C2458f.m33245f(this.f6767f, this.f6768g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c13129b.m3151e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c13129b.m3142n(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (m33245f != null) {
            C2458f.m33250a(spannableStringBuilder2, i, i2, m33245f, this.f6771j, map, i3);
            if (m33245f.m33226j() != Float.MAX_VALUE && "p".equals(this.f6762a)) {
                c13129b.m3144l((m33245f.m33226j() * (-90.0f)) / 100.0f);
            }
            c13129b.m3141o(m33245f.m33224l());
        }
    }

    /* renamed from: c */
    public static C2456d m33264c(String str, long j, long j2, C2459g c2459g, String[] strArr, String str2, String str3, C2456d c2456d) {
        return new C2456d(str, null, j, j2, c2459g, strArr, str2, str3, c2456d);
    }

    /* renamed from: d */
    public static C2456d m33263d(String str) {
        return new C2456d(null, C2458f.m33249b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* renamed from: e */
    private static void m33262e(SpannableStringBuilder spannableStringBuilder) {
        C2450a[] c2450aArr;
        for (C2450a c2450a : (C2450a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C2450a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c2450a), spannableStringBuilder.getSpanEnd(c2450a), "");
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    /* renamed from: i */
    private void m33258i(TreeSet<Long> treeSet, boolean z) {
        boolean z2;
        boolean equals = "p".equals(this.f6762a);
        boolean equals2 = "div".equals(this.f6762a);
        if (z || equals || (equals2 && this.f6770i != null)) {
            long j = this.f6765d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f6766e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f6774m == null) {
            return;
        }
        for (int i = 0; i < this.f6774m.size(); i++) {
            C2456d c2456d = this.f6774m.get(i);
            if (!z && !equals) {
                z2 = false;
            } else {
                z2 = true;
            }
            c2456d.m33258i(treeSet, z2);
        }
    }

    /* renamed from: k */
    private static SpannableStringBuilder m33256k(String str, Map<String, C13127b.C13129b> map) {
        if (!map.containsKey(str)) {
            C13127b.C13129b c13129b = new C13127b.C13129b();
            c13129b.m3142n(new SpannableStringBuilder());
            map.put(str, c13129b);
        }
        return (SpannableStringBuilder) C9149a.m16448e(map.get(str).m3151e());
    }

    /* renamed from: n */
    private void m33253n(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f6769h)) {
            str = this.f6769h;
        }
        if (m33254m(j) && "div".equals(this.f6762a) && this.f6770i != null) {
            list.add(new Pair<>(str, this.f6770i));
            return;
        }
        for (int i = 0; i < m33260g(); i++) {
            m33261f(i).m33253n(j, str, list);
        }
    }

    /* renamed from: o */
    private void m33252o(long j, Map<String, C2459g> map, Map<String, C2457e> map2, String str, Map<String, C13127b.C13129b> map3) {
        String str2;
        int i;
        if (!m33254m(j)) {
            return;
        }
        if ("".equals(this.f6769h)) {
            str2 = str;
        } else {
            str2 = this.f6769h;
        }
        Iterator<Map.Entry<String, Integer>> it = this.f6773l.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Integer> next = it.next();
            String key = next.getKey();
            if (this.f6772k.containsKey(key)) {
                i = this.f6772k.get(key).intValue();
            }
            int i2 = i;
            int intValue = next.getValue().intValue();
            if (i2 != intValue) {
                m33265b(map, (C13127b.C13129b) C9149a.m16448e(map3.get(key)), i2, intValue, ((C2457e) C9149a.m16448e(map2.get(str2))).f6784j);
            }
        }
        while (i < m33260g()) {
            m33261f(i).m33252o(j, map, map2, str2, map3);
            i++;
        }
    }

    /* renamed from: p */
    private void m33251p(long j, boolean z, String str, Map<String, C13127b.C13129b> map) {
        boolean z2;
        this.f6772k.clear();
        this.f6773l.clear();
        if ("metadata".equals(this.f6762a)) {
            return;
        }
        if (!"".equals(this.f6769h)) {
            str = this.f6769h;
        }
        if (this.f6764c && z) {
            m33256k(str, map).append((CharSequence) C9149a.m16448e(this.f6763b));
        } else if ("br".equals(this.f6762a) && z) {
            m33256k(str, map).append('\n');
        } else if (m33254m(j)) {
            for (Map.Entry<String, C13127b.C13129b> entry : map.entrySet()) {
                this.f6772k.put(entry.getKey(), Integer.valueOf(((CharSequence) C9149a.m16448e(entry.getValue().m3151e())).length()));
            }
            boolean equals = "p".equals(this.f6762a);
            for (int i = 0; i < m33260g(); i++) {
                C2456d m33261f = m33261f(i);
                if (!z && !equals) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                m33261f.m33251p(j, z2, str, map);
            }
            if (equals) {
                C2458f.m33248c(m33256k(str, map));
            }
            for (Map.Entry<String, C13127b.C13129b> entry2 : map.entrySet()) {
                this.f6773l.put(entry2.getKey(), Integer.valueOf(((CharSequence) C9149a.m16448e(entry2.getValue().m3151e())).length()));
            }
        }
    }

    /* renamed from: a */
    public void m33266a(C2456d c2456d) {
        if (this.f6774m == null) {
            this.f6774m = new ArrayList();
        }
        this.f6774m.add(c2456d);
    }

    /* renamed from: f */
    public C2456d m33261f(int i) {
        List<C2456d> list = this.f6774m;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int m33260g() {
        List<C2456d> list = this.f6774m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: h */
    public List<C13127b> m33259h(long j, Map<String, C2459g> map, Map<String, C2457e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        m33253n(j, this.f6769h, arrayList);
        TreeMap treeMap = new TreeMap();
        m33251p(j, false, this.f6769h, treeMap);
        m33252o(j, map, map2, this.f6769h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C2457e c2457e = (C2457e) C9149a.m16448e(map2.get(pair.first));
                arrayList2.add(new C13127b.C13129b().m3150f(decodeByteArray).m3146j(c2457e.f6776b).m3145k(0).m3148h(c2457e.f6777c, 0).m3147i(c2457e.f6779e).m3143m(c2457e.f6780f).m3149g(c2457e.f6781g).m3139q(c2457e.f6784j).m3155a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C2457e c2457e2 = (C2457e) C9149a.m16448e(map2.get(entry.getKey()));
            C13127b.C13129b c13129b = (C13127b.C13129b) entry.getValue();
            m33262e((SpannableStringBuilder) C9149a.m16448e(c13129b.m3151e()));
            c13129b.m3148h(c2457e2.f6777c, c2457e2.f6778d);
            c13129b.m3147i(c2457e2.f6779e);
            c13129b.m3146j(c2457e2.f6776b);
            c13129b.m3143m(c2457e2.f6780f);
            c13129b.m3140p(c2457e2.f6783i, c2457e2.f6782h);
            c13129b.m3139q(c2457e2.f6784j);
            arrayList2.add(c13129b.m3155a());
        }
        return arrayList2;
    }

    /* renamed from: j */
    public long[] m33257j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        m33258i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    /* renamed from: l */
    public String[] m33255l() {
        return this.f6768g;
    }

    /* renamed from: m */
    public boolean m33254m(long j) {
        long j2 = this.f6765d;
        return (j2 == -9223372036854775807L && this.f6766e == -9223372036854775807L) || (j2 <= j && this.f6766e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.f6766e) || (j2 <= j && j < this.f6766e));
    }
}