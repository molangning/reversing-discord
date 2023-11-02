package p009a8;

import android.text.TextUtils;
import com.facebook.react.uimanager.ViewProps;
import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: a8.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C0086b {

    /* renamed from: a */
    public final int f409a;

    /* renamed from: b */
    public final int f410b;

    /* renamed from: c */
    public final int f411c;

    /* renamed from: d */
    public final int f412d;

    /* renamed from: e */
    public final int f413e;

    private C0086b(int i, int i2, int i3, int i4, int i5) {
        this.f409a = i;
        this.f410b = i2;
        this.f411c = i3;
        this.f412d = i4;
        this.f413e = i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static C0086b m41166a(String str) {
        char c;
        C9149a.m16452a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < split.length; i5++) {
            String m16272U0 = C9191p0.m16272U0(split[i5].trim());
            m16272U0.hashCode();
            switch (m16272U0.hashCode()) {
                case 100571:
                    if (m16272U0.equals(ViewProps.END)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (m16272U0.equals("text")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (m16272U0.equals(ViewProps.START)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (m16272U0.equals("style")) {
                        c = 3;
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
                    i2 = i5;
                    break;
                case 1:
                    i4 = i5;
                    break;
                case 2:
                    i = i5;
                    break;
                case 3:
                    i3 = i5;
                    break;
            }
        }
        if (i != -1 && i2 != -1 && i4 != -1) {
            return new C0086b(i, i2, i3, i4, split.length);
        }
        return null;
    }
}
