package p461z8;

import android.text.TextUtils;
import androidx.collection.C0624a;
import java.util.ArrayList;
import p010a9.C0093b;
import p029b9.C2198p;
import p441y8.C13930a;

/* renamed from: z8.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C14119c extends Exception {

    /* renamed from: j */
    private final C0624a<C0093b<?>, C13930a> f36305j;

    public C14119c(C0624a<C0093b<?>, C13930a> c0624a) {
        this.f36305j = c0624a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C0093b<?> c0093b : this.f36305j.keySet()) {
            C13930a c13930a = (C13930a) C2198p.m33985j(this.f36305j.get(c0093b));
            z &= !c13930a.m1146H();
            String m41152b = c0093b.m41152b();
            String valueOf = String.valueOf(c13930a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(m41152b).length() + 2 + valueOf.length());
            sb2.append(m41152b);
            sb2.append(": ");
            sb2.append(valueOf);
            arrayList.add(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        if (z) {
            sb3.append("None of the queried APIs are available. ");
        } else {
            sb3.append("Some of the queried APIs are unavailable. ");
        }
        sb3.append(TextUtils.join("; ", arrayList));
        return sb3.toString();
    }
}
