package p041c8;

import android.text.TextUtils;
import com.facebook.react.uimanager.ViewProps;
import gb.AbstractC6711w;
import java.util.regex.Pattern;

/* renamed from: c8.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C2451b {

    /* renamed from: d */
    private static final Pattern f6737d = Pattern.compile("\\s+");

    /* renamed from: e */
    private static final AbstractC6711w<String> f6738e = AbstractC6711w.m22063y("auto", ViewProps.NONE);

    /* renamed from: f */
    private static final AbstractC6711w<String> f6739f = AbstractC6711w.m22062z("dot", "sesame", "circle");

    /* renamed from: g */
    private static final AbstractC6711w<String> f6740g = AbstractC6711w.m22063y("filled", "open");

    /* renamed from: h */
    private static final AbstractC6711w<String> f6741h = AbstractC6711w.m22062z("after", "before", "outside");

    /* renamed from: a */
    public final int f6742a;

    /* renamed from: b */
    public final int f6743b;

    /* renamed from: c */
    public final int f6744c;

    private C2451b(int i, int i2, int i3) {
        this.f6742a = i;
        this.f6743b = i2;
        this.f6744c = i3;
    }

    /* renamed from: a */
    public static C2451b m33282a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return m33281b(AbstractC6711w.m22068t(TextUtils.split(trim, f6737d)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0081, code lost:
        if (r9.equals("auto") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x00fe, code lost:
        if (r9.equals("dot") == false) goto L59;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p041c8.C2451b m33281b(gb.AbstractC6711w<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p041c8.C2451b.m33281b(gb.w):c8.b");
    }
}