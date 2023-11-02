package p238n1;

import android.content.Context;
import android.util.Pair;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import p073e1.C6062k;
import p073e1.C6073p0;
import p073e1.C6081t;
import p291q1.C11674f;

/* renamed from: n1.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10489h {

    /* renamed from: a */
    private final C10488g f27376a;

    /* renamed from: b */
    private final InterfaceC10487f f27377b;

    public C10489h(C10488g c10488g, InterfaceC10487f interfaceC10487f) {
        this.f27376a = c10488g;
        this.f27377b = interfaceC10487f;
    }

    /* renamed from: a */
    private C6062k m11405a(Context context, String str, String str2) {
        C10488g c10488g;
        Pair<EnumC10484c, InputStream> m11412a;
        C6073p0<C6062k> m23604p;
        if (str2 == null || (c10488g = this.f27376a) == null || (m11412a = c10488g.m11412a(str)) == null) {
            return null;
        }
        EnumC10484c enumC10484c = (EnumC10484c) m11412a.first;
        InputStream inputStream = (InputStream) m11412a.second;
        if (enumC10484c == EnumC10484c.ZIP) {
            m23604p = C6081t.m23594z(context, new ZipInputStream(inputStream), str2);
        } else {
            m23604p = C6081t.m23604p(inputStream, str2);
        }
        if (m23604p.m23646b() != null) {
            return m23604p.m23646b();
        }
        return null;
    }

    /* renamed from: b */
    private C6073p0<C6062k> m11404b(Context context, String str, String str2) {
        boolean z;
        C11674f.m7235a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                InterfaceC10485d mo11413a = this.f27377b.mo11413a(str);
                if (mo11413a.mo11416X()) {
                    C6073p0<C6062k> m11402d = m11402d(context, str, mo11413a.mo11417M(), mo11413a.mo11418J(), str2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Completed fetch from network. Success: ");
                    if (m11402d.m23646b() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sb2.append(z);
                    C11674f.m7235a(sb2.toString());
                    try {
                        mo11413a.close();
                    } catch (IOException e) {
                        C11674f.m7232d("LottieFetchResult close failed ", e);
                    }
                    return m11402d;
                }
                C6073p0<C6062k> c6073p0 = new C6073p0<>(new IllegalArgumentException(mo11413a.mo11415k0()));
                try {
                    mo11413a.close();
                } catch (IOException e2) {
                    C11674f.m7232d("LottieFetchResult close failed ", e2);
                }
                return c6073p0;
            } catch (Exception e3) {
                C6073p0<C6062k> c6073p02 = new C6073p0<>(e3);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e4) {
                        C11674f.m7232d("LottieFetchResult close failed ", e4);
                    }
                }
                return c6073p02;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e5) {
                    C11674f.m7232d("LottieFetchResult close failed ", e5);
                }
            }
            throw th2;
        }
    }

    /* renamed from: d */
    private C6073p0<C6062k> m11402d(Context context, String str, InputStream inputStream, String str2, String str3) {
        C6073p0<C6062k> m11400f;
        EnumC10484c enumC10484c;
        C10488g c10488g;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            C11674f.m7235a("Received json response.");
            enumC10484c = EnumC10484c.JSON;
            m11400f = m11401e(str, inputStream, str3);
        } else {
            C11674f.m7235a("Handling zip response.");
            EnumC10484c enumC10484c2 = EnumC10484c.ZIP;
            m11400f = m11400f(context, str, inputStream, str3);
            enumC10484c = enumC10484c2;
        }
        if (str3 != null && m11400f.m23646b() != null && (c10488g = this.f27376a) != null) {
            c10488g.m11407f(str, enumC10484c);
        }
        return m11400f;
    }

    /* renamed from: e */
    private C6073p0<C6062k> m11401e(String str, InputStream inputStream, String str2) {
        C10488g c10488g;
        if (str2 != null && (c10488g = this.f27376a) != null) {
            return C6081t.m23604p(new FileInputStream(c10488g.m11406g(str, inputStream, EnumC10484c.JSON).getAbsolutePath()), str);
        }
        return C6081t.m23604p(inputStream, null);
    }

    /* renamed from: f */
    private C6073p0<C6062k> m11400f(Context context, String str, InputStream inputStream, String str2) {
        C10488g c10488g;
        if (str2 != null && (c10488g = this.f27376a) != null) {
            return C6081t.m23594z(context, new ZipInputStream(new FileInputStream(c10488g.m11406g(str, inputStream, EnumC10484c.ZIP))), str);
        }
        return C6081t.m23594z(context, new ZipInputStream(inputStream), null);
    }

    /* renamed from: c */
    public C6073p0<C6062k> m11403c(Context context, String str, String str2) {
        C6062k m11405a = m11405a(context, str, str2);
        if (m11405a != null) {
            return new C6073p0<>(m11405a);
        }
        C11674f.m7235a("Animation for " + str + " not found in cache. Fetching from network.");
        return m11404b(context, str, str2);
    }
}