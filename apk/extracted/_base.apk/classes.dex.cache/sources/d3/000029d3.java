package com.google.android.exoplayer2.p049ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.exoplayer2.p049ui.C4499c;
import gb.AbstractC6701u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p195k8.C9149a;
import p195k8.C9191p0;
import p460z7.C14103a;
import p460z7.C14104b;
import p460z7.C14106d;

/* renamed from: com.google.android.exoplayer2.ui.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4499c {

    /* renamed from: a */
    private static final Pattern f12169a = Pattern.compile("(&#13;)?&#10;");

    /* renamed from: com.google.android.exoplayer2.ui.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4501b {

        /* renamed from: a */
        public final String f12170a;

        /* renamed from: b */
        public final Map<String, String> f12171b;

        private C4501b(String str, Map<String, String> map) {
            this.f12170a = str;
            this.f12171b = map;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4502c {

        /* renamed from: e */
        private static final Comparator<C4502c> f12172e = new Comparator() { // from class: com.google.android.exoplayer2.ui.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m28810e;
                m28810e = C4499c.C4502c.m28810e((C4499c.C4502c) obj, (C4499c.C4502c) obj2);
                return m28810e;
            }
        };

        /* renamed from: f */
        private static final Comparator<C4502c> f12173f = new Comparator() { // from class: com.google.android.exoplayer2.ui.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m28809f;
                m28809f = C4499c.C4502c.m28809f((C4499c.C4502c) obj, (C4499c.C4502c) obj2);
                return m28809f;
            }
        };

        /* renamed from: a */
        public final int f12174a;

        /* renamed from: b */
        public final int f12175b;

        /* renamed from: c */
        public final String f12176c;

        /* renamed from: d */
        public final String f12177d;

        /* renamed from: e */
        public static /* synthetic */ int m28810e(C4502c c4502c, C4502c c4502c2) {
            int compare = Integer.compare(c4502c2.f12175b, c4502c.f12175b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = c4502c.f12176c.compareTo(c4502c2.f12176c);
            if (compareTo != 0) {
                return compareTo;
            }
            return c4502c.f12177d.compareTo(c4502c2.f12177d);
        }

        /* renamed from: f */
        public static /* synthetic */ int m28809f(C4502c c4502c, C4502c c4502c2) {
            int compare = Integer.compare(c4502c2.f12174a, c4502c.f12174a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = c4502c2.f12176c.compareTo(c4502c.f12176c);
            if (compareTo != 0) {
                return compareTo;
            }
            return c4502c2.f12177d.compareTo(c4502c.f12177d);
        }

        private C4502c(int i, int i2, String str, String str2) {
            this.f12174a = i;
            this.f12175b = i2;
            this.f12176c = str;
            this.f12177d = str2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.c$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4503d {

        /* renamed from: a */
        private final List<C4502c> f12178a = new ArrayList();

        /* renamed from: b */
        private final List<C4502c> f12179b = new ArrayList();
    }

    /* renamed from: a */
    public static C4501b m28822a(CharSequence charSequence, float f) {
        if (charSequence == null) {
            return new C4501b("", AbstractC6701u.m22104k());
        }
        if (!(charSequence instanceof Spanned)) {
            return new C4501b(m28821b(charSequence), AbstractC6701u.m22104k());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet<Integer> hashSet = new HashSet();
        int i = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        for (Integer num : hashSet) {
            int intValue = num.intValue();
            hashMap.put(C4498b.m28824a("bg_" + intValue), C9191p0.m16307D("background-color:%s;", C4498b.m28823b(intValue)));
        }
        SparseArray<C4503d> m28820c = m28820c(spanned, f);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i2 = 0;
        while (i < m28820c.size()) {
            int keyAt = m28820c.keyAt(i);
            sb2.append(m28821b(spanned.subSequence(i2, keyAt)));
            C4503d c4503d = m28820c.get(keyAt);
            Collections.sort(c4503d.f12179b, C4502c.f12173f);
            for (C4502c c4502c : c4503d.f12179b) {
                sb2.append(c4502c.f12177d);
            }
            Collections.sort(c4503d.f12178a, C4502c.f12172e);
            for (C4502c c4502c2 : c4503d.f12178a) {
                sb2.append(c4502c2.f12176c);
            }
            i++;
            i2 = keyAt;
        }
        sb2.append(m28821b(spanned.subSequence(i2, spanned.length())));
        return new C4501b(sb2.toString(), hashMap);
    }

    /* renamed from: b */
    private static String m28821b(CharSequence charSequence) {
        return f12169a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    /* renamed from: c */
    private static SparseArray<C4503d> m28820c(Spanned spanned, float f) {
        Object[] spans;
        SparseArray<C4503d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String m28818e = m28818e(obj, f);
            String m28819d = m28819d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (m28818e != null) {
                C9149a.m16448e(m28819d);
                C4502c c4502c = new C4502c(spanStart, spanEnd, m28818e, m28819d);
                m28817f(sparseArray, spanStart).f12178a.add(c4502c);
                m28817f(sparseArray, spanEnd).f12179b.add(c4502c);
            }
        }
        return sparseArray;
    }

    /* renamed from: d */
    private static String m28819d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof C14103a) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof C14106d)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style != 1) {
                if (style != 2) {
                    if (style == 3) {
                        return "</i></b>";
                    }
                } else {
                    return "</i>";
                }
            } else {
                return "</b>";
            }
        } else if (obj instanceof C14104b) {
            return "<rt>" + m28821b(((C14104b) obj).f36295a) + "</rt></ruby>";
        } else if (obj instanceof UnderlineSpan) {
            return "</u>";
        }
        return null;
    }

    /* renamed from: e */
    private static String m28818e(Object obj, float f) {
        float size;
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return C9191p0.m16307D("<span style='color:%s;'>", C4498b.m28823b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return C9191p0.m16307D("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof C14103a) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            if (absoluteSizeSpan.getDip()) {
                size = absoluteSizeSpan.getSize();
            } else {
                size = absoluteSizeSpan.getSize() / f;
            }
            return C9191p0.m16307D("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
        } else if (obj instanceof RelativeSizeSpan) {
            return C9191p0.m16307D("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        } else {
            if (obj instanceof TypefaceSpan) {
                String family = ((TypefaceSpan) obj).getFamily();
                if (family == null) {
                    return null;
                }
                return C9191p0.m16307D("<span style='font-family:\"%s\";'>", family);
            } else if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style != 1) {
                    if (style != 2) {
                        if (style != 3) {
                            return null;
                        }
                        return "<b><i>";
                    }
                    return "<i>";
                }
                return "<b>";
            } else if (obj instanceof C14104b) {
                int i = ((C14104b) obj).f36296b;
                if (i != -1) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return "<ruby style='ruby-position:under;'>";
                    }
                    return "<ruby style='ruby-position:over;'>";
                }
                return "<ruby style='ruby-position:unset;'>";
            } else if (obj instanceof UnderlineSpan) {
                return "<u>";
            } else {
                if (!(obj instanceof C14106d)) {
                    return null;
                }
                C14106d c14106d = (C14106d) obj;
                return C9191p0.m16307D("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", m28815h(c14106d.f36297a, c14106d.f36298b), m28816g(c14106d.f36299c));
            }
        }
    }

    /* renamed from: f */
    private static C4503d m28817f(SparseArray<C4503d> sparseArray, int i) {
        C4503d c4503d = sparseArray.get(i);
        if (c4503d == null) {
            C4503d c4503d2 = new C4503d();
            sparseArray.put(i, c4503d2);
            return c4503d2;
        }
        return c4503d;
    }

    /* renamed from: g */
    private static String m28816g(int i) {
        return i != 2 ? "over right" : "under left";
    }

    /* renamed from: h */
    private static String m28815h(int i, int i2) {
        StringBuilder sb2 = new StringBuilder();
        if (i2 != 1) {
            if (i2 == 2) {
                sb2.append("open ");
            }
        } else {
            sb2.append("filled ");
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        sb2.append("unset");
                    } else {
                        sb2.append("sesame");
                    }
                } else {
                    sb2.append("dot");
                }
            } else {
                sb2.append("circle");
            }
        } else {
            sb2.append(ViewProps.NONE);
        }
        return sb2.toString();
    }
}