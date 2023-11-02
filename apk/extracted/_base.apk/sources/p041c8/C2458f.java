package p041c8;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayDeque;
import java.util.Map;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;
import p460z7.C14103a;
import p460z7.C14104b;
import p460z7.C14105c;
import p460z7.C14106d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c8.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2458f {
    /* renamed from: a */
    public static void m33250a(Spannable spannable, int i, int i2, C2459g c2459g, C2456d c2456d, Map<String, C2459g> map, int i3) {
        C2456d m33246e;
        int i4;
        int i5 = -1;
        if (c2459g.m33225k() != -1) {
            spannable.setSpan(new StyleSpan(c2459g.m33225k()), i, i2, 33);
        }
        if (c2459g.m33218r()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (c2459g.m33217s()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (c2459g.m33220p()) {
            C14105c.m656a(spannable, new ForegroundColorSpan(c2459g.m33233c()), i, i2, 33);
        }
        if (c2459g.m33221o()) {
            C14105c.m656a(spannable, new BackgroundColorSpan(c2459g.m33234b()), i, i2, 33);
        }
        if (c2459g.m33232d() != null) {
            C14105c.m656a(spannable, new TypefaceSpan(c2459g.m33232d()), i, i2, 33);
        }
        if (c2459g.m33222n() != null) {
            C2451b c2451b = (C2451b) C9149a.m16448e(c2459g.m33222n());
            int i6 = c2451b.f6742a;
            if (i6 == -1) {
                if (i3 != 2 && i3 != 1) {
                    i6 = 1;
                } else {
                    i6 = 3;
                }
                i4 = 1;
            } else {
                i4 = c2451b.f6743b;
            }
            int i7 = c2451b.f6744c;
            if (i7 == -2) {
                i7 = 1;
            }
            C14105c.m656a(spannable, new C14106d(i6, i4, i7), i, i2, 33);
        }
        int m33227i = c2459g.m33227i();
        if (m33227i != 2) {
            if (m33227i == 3 || m33227i == 4) {
                spannable.setSpan(new C2450a(), i, i2, 33);
            }
        } else {
            C2456d m33247d = m33247d(c2456d, map);
            if (m33247d != null && (m33246e = m33246e(m33247d, map)) != null) {
                if (m33246e.m33260g() == 1 && m33246e.m33261f(0).f6763b != null) {
                    String str = (String) C9191p0.m16243j(m33246e.m33261f(0).f6763b);
                    C2459g c2459g2 = m33247d.f6767f;
                    if (c2459g2 != null) {
                        i5 = c2459g2.m33228h();
                    }
                    spannable.setSpan(new C14104b(str, i5), i, i2, 33);
                } else {
                    C9197r.m16180f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                }
            }
        }
        if (c2459g.m33223m()) {
            C14105c.m656a(spannable, new C14103a(), i, i2, 33);
        }
        int m33230f = c2459g.m33230f();
        if (m33230f != 1) {
            if (m33230f != 2) {
                if (m33230f == 3) {
                    C14105c.m656a(spannable, new RelativeSizeSpan(c2459g.m33231e() / 100.0f), i, i2, 33);
                    return;
                }
                return;
            }
            C14105c.m656a(spannable, new RelativeSizeSpan(c2459g.m33231e()), i, i2, 33);
            return;
        }
        C14105c.m656a(spannable, new AbsoluteSizeSpan((int) c2459g.m33231e(), true), i, i2, 33);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m33249b(String str) {
        return str.replaceAll("\r\n", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).replaceAll(" *\n *", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).replaceAll(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m33248c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }

    /* renamed from: d */
    private static C2456d m33247d(C2456d c2456d, Map<String, C2459g> map) {
        while (c2456d != null) {
            C2459g m33245f = m33245f(c2456d.f6767f, c2456d.m33255l(), map);
            if (m33245f != null && m33245f.m33227i() == 1) {
                return c2456d;
            }
            c2456d = c2456d.f6771j;
        }
        return null;
    }

    /* renamed from: e */
    private static C2456d m33246e(C2456d c2456d, Map<String, C2459g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c2456d);
        while (!arrayDeque.isEmpty()) {
            C2456d c2456d2 = (C2456d) arrayDeque.pop();
            C2459g m33245f = m33245f(c2456d2.f6767f, c2456d2.m33255l(), map);
            if (m33245f != null && m33245f.m33227i() == 3) {
                return c2456d2;
            }
            for (int m33260g = c2456d2.m33260g() - 1; m33260g >= 0; m33260g--) {
                arrayDeque.push(c2456d2.m33261f(m33260g));
            }
        }
        return null;
    }

    /* renamed from: f */
    public static C2459g m33245f(C2459g c2459g, String[] strArr, Map<String, C2459g> map) {
        int i = 0;
        if (c2459g == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C2459g c2459g2 = new C2459g();
                int length = strArr.length;
                while (i < length) {
                    c2459g2.m33235a(map.get(strArr[i]));
                    i++;
                }
                return c2459g2;
            }
        } else if (strArr != null && strArr.length == 1) {
            return c2459g.m33235a(map.get(strArr[0]));
        } else {
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    c2459g.m33235a(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return c2459g;
    }
}
