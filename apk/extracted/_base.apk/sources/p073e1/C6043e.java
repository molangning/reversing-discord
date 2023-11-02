package p073e1;

import android.content.Context;
import java.io.File;
import p238n1.C10483b;
import p238n1.C10488g;
import p238n1.C10489h;
import p238n1.InterfaceC10486e;
import p238n1.InterfaceC10487f;
import p291q1.C11676h;

/* renamed from: e1.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6043e {

    /* renamed from: a */
    public static boolean f17116a = false;

    /* renamed from: b */
    private static boolean f17117b = false;

    /* renamed from: c */
    private static boolean f17118c = true;

    /* renamed from: d */
    private static boolean f17119d = true;

    /* renamed from: e */
    private static InterfaceC10487f f17120e;

    /* renamed from: f */
    private static InterfaceC10486e f17121f;

    /* renamed from: g */
    private static volatile C10489h f17122g;

    /* renamed from: h */
    private static volatile C10488g f17123h;

    /* renamed from: i */
    private static ThreadLocal<C11676h> f17124i;

    /* renamed from: b */
    public static void m23828b(String str) {
        if (!f17117b) {
            return;
        }
        m23825e().m7231a(str);
    }

    /* renamed from: c */
    public static float m23827c(String str) {
        if (!f17117b) {
            return 0.0f;
        }
        return m23825e().m7230b(str);
    }

    /* renamed from: d */
    public static boolean m23826d() {
        return f17119d;
    }

    /* renamed from: e */
    private static C11676h m23825e() {
        C11676h c11676h = f17124i.get();
        if (c11676h == null) {
            C11676h c11676h2 = new C11676h();
            f17124i.set(c11676h2);
            return c11676h2;
        }
        return c11676h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ File m23824f(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    /* renamed from: g */
    public static C10488g m23823g(Context context) {
        if (!f17118c) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        C10488g c10488g = f17123h;
        if (c10488g == null) {
            synchronized (C10488g.class) {
                c10488g = f17123h;
                if (c10488g == null) {
                    InterfaceC10486e interfaceC10486e = f17121f;
                    if (interfaceC10486e == null) {
                        interfaceC10486e = new InterfaceC10486e() { // from class: e1.d
                            @Override // p238n1.InterfaceC10486e
                            /* renamed from: a */
                            public final File mo11414a() {
                                File m23824f;
                                m23824f = C6043e.m23824f(applicationContext);
                                return m23824f;
                            }
                        };
                    }
                    c10488g = new C10488g(interfaceC10486e);
                    f17123h = c10488g;
                }
            }
        }
        return c10488g;
    }

    /* renamed from: h */
    public static C10489h m23822h(Context context) {
        C10489h c10489h = f17122g;
        if (c10489h == null) {
            synchronized (C10489h.class) {
                c10489h = f17122g;
                if (c10489h == null) {
                    C10488g m23823g = m23823g(context);
                    InterfaceC10487f interfaceC10487f = f17120e;
                    if (interfaceC10487f == null) {
                        interfaceC10487f = new C10483b();
                    }
                    c10489h = new C10489h(m23823g, interfaceC10487f);
                    f17122g = c10489h;
                }
            }
        }
        return c10489h;
    }
}
