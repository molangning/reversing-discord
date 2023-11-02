package p441y8;

import android.content.Context;
import android.util.Log;

/* renamed from: y8.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13952w {

    /* renamed from: a */
    static final AbstractBinderC13950u f35906a = new BinderC13944o(AbstractBinderC13948s.m1102c("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b */
    static final AbstractBinderC13950u f35907b = new BinderC13945p(AbstractBinderC13948s.m1102c("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c */
    static final AbstractBinderC13950u f35908c = new BinderC13946q(AbstractBinderC13948s.m1102c("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d */
    static final AbstractBinderC13950u f35909d = new BinderC13947r(AbstractBinderC13948s.m1102c("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: e */
    private static final Object f35910e = new Object();

    /* renamed from: f */
    private static Context f35911f;

    /* renamed from: a */
    public static synchronized void m1098a(Context context) {
        synchronized (C13952w.class) {
            if (f35911f == null) {
                if (context != null) {
                    f35911f = context.getApplicationContext();
                    return;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }
}