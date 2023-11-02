package p081e9;

import android.util.Log;
import java.util.Locale;
import p029b9.C2174i;

/* renamed from: e9.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6186a {

    /* renamed from: a */
    private final String f17503a;

    /* renamed from: b */
    private final String f17504b;

    /* renamed from: c */
    private final C2174i f17505c;

    /* renamed from: d */
    private final int f17506d;

    public C6186a(String str, String... strArr) {
        String sb2;
        if (strArr.length == 0) {
            sb2 = "";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.f17504b = sb2;
        this.f17503a = str;
        this.f17505c = new C2174i(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.f17503a, i)) {
            i++;
        }
        this.f17506d = i;
    }

    /* renamed from: a */
    public void m23321a(String str, Object... objArr) {
        if (m23318d(3)) {
            Log.d(this.f17503a, m23319c(str, objArr));
        }
    }

    /* renamed from: b */
    public void m23320b(String str, Object... objArr) {
        Log.e(this.f17503a, m23319c(str, objArr));
    }

    /* renamed from: c */
    protected String m23319c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f17504b.concat(str);
    }

    /* renamed from: d */
    public boolean m23318d(int i) {
        return this.f17506d <= i;
    }
}
