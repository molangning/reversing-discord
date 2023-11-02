package p118g8;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import java.util.Locale;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9200u;

/* renamed from: g8.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6567c implements InterfaceC6577m {

    /* renamed from: a */
    private final Resources f18606a;

    public C6567c(Resources resources) {
        this.f18606a = (Resources) C9149a.m16448e(resources);
    }

    /* renamed from: b */
    private String m22397b(Format format) {
        int i = format.f11178H;
        if (i != -1 && i >= 1) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 6 && i != 7) {
                        if (i != 8) {
                            return this.f18606a.getString(C6575k.f18662s);
                        }
                        return this.f18606a.getString(C6575k.f18664u);
                    }
                    return this.f18606a.getString(C6575k.f18663t);
                }
                return this.f18606a.getString(C6575k.f18661r);
            }
            return this.f18606a.getString(C6575k.f18653j);
        }
        return "";
    }

    /* renamed from: c */
    private String m22396c(Format format) {
        int i = format.f11193q;
        if (i == -1) {
            return "";
        }
        return this.f18606a.getString(C6575k.f18652i, Float.valueOf(i / 1000000.0f));
    }

    /* renamed from: d */
    private String m22395d(Format format) {
        return TextUtils.isEmpty(format.f11187k) ? "" : format.f11187k;
    }

    /* renamed from: e */
    private String m22394e(Format format) {
        String m22389j = m22389j(m22393f(format), m22391h(format));
        if (TextUtils.isEmpty(m22389j)) {
            return m22395d(format);
        }
        return m22389j;
    }

    /* renamed from: f */
    private String m22393f(Format format) {
        Locale locale;
        String str = format.f11188l;
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            if (C9191p0.f24171a >= 21) {
                locale = Locale.forLanguageTag(str);
            } else {
                locale = new Locale(str);
            }
            return locale.getDisplayName();
        }
        return "";
    }

    /* renamed from: g */
    private String m22392g(Format format) {
        int i = format.f11202z;
        int i2 = format.f11171A;
        if (i != -1 && i2 != -1) {
            return this.f18606a.getString(C6575k.f18654k, Integer.valueOf(i), Integer.valueOf(i2));
        }
        return "";
    }

    /* renamed from: h */
    private String m22391h(Format format) {
        String str;
        if ((format.f11190n & 2) != 0) {
            str = this.f18606a.getString(C6575k.f18655l);
        } else {
            str = "";
        }
        if ((format.f11190n & 4) != 0) {
            str = m22389j(str, this.f18606a.getString(C6575k.f18658o));
        }
        if ((format.f11190n & 8) != 0) {
            str = m22389j(str, this.f18606a.getString(C6575k.f18657n));
        }
        if ((format.f11190n & 1088) != 0) {
            return m22389j(str, this.f18606a.getString(C6575k.f18656m));
        }
        return str;
    }

    /* renamed from: i */
    private static int m22390i(Format format) {
        int m16158l = C9200u.m16158l(format.f11197u);
        if (m16158l != -1) {
            return m16158l;
        }
        if (C9200u.m16155o(format.f11194r) != null) {
            return 2;
        }
        if (C9200u.m16167c(format.f11194r) != null) {
            return 1;
        }
        if (format.f11202z != -1 || format.f11171A != -1) {
            return 2;
        }
        if (format.f11178H == -1 && format.f11179I == -1) {
            return -1;
        }
        return 1;
    }

    /* renamed from: j */
    private String m22389j(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = this.f18606a.getString(C6575k.f18651h, str, str2);
                }
            }
        }
        return str;
    }

    @Override // p118g8.InterfaceC6577m
    /* renamed from: a */
    public String mo22388a(Format format) {
        String m22394e;
        int m22390i = m22390i(format);
        if (m22390i == 2) {
            m22394e = m22389j(m22391h(format), m22392g(format), m22396c(format));
        } else if (m22390i == 1) {
            m22394e = m22389j(m22394e(format), m22397b(format), m22396c(format));
        } else {
            m22394e = m22394e(format);
        }
        if (m22394e.length() == 0) {
            return this.f18606a.getString(C6575k.f18665v);
        }
        return m22394e;
    }
}