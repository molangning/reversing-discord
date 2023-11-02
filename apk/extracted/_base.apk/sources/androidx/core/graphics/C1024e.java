package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.C0971e;
import androidx.core.content.res.C0980h;
import androidx.core.provider.C1090g;
import p236n.C10477a;

/* renamed from: androidx.core.graphics.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1024e {

    /* renamed from: a */
    private static final C1001c0 f3363a;

    /* renamed from: b */
    private static final C10477a<String, Typeface> f3364b;

    /* renamed from: androidx.core.graphics.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1025a extends C1090g.C1093c {

        /* renamed from: a */
        private C0980h.AbstractC0985e f3365a;

        public C1025a(C0980h.AbstractC0985e abstractC0985e) {
            this.f3365a = abstractC0985e;
        }

        @Override // androidx.core.provider.C1090g.C1093c
        /* renamed from: a */
        public void mo37910a(int i) {
            C0980h.AbstractC0985e abstractC0985e = this.f3365a;
            if (abstractC0985e != null) {
                abstractC0985e.m38222f(i);
            }
        }

        @Override // androidx.core.provider.C1090g.C1093c
        /* renamed from: b */
        public void mo37909b(Typeface typeface) {
            C0980h.AbstractC0985e abstractC0985e = this.f3365a;
            if (abstractC0985e != null) {
                abstractC0985e.m38221g(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f3363a = new C0998b0();
        } else if (i >= 28) {
            f3363a = new C1033m();
        } else if (i >= 26) {
            f3363a = new C1032l();
        } else if (i >= 24 && C1027g.m38041j()) {
            f3363a = new C1027g();
        } else {
            f3363a = new C1026f();
        }
        f3364b = new C10477a<>(16);
    }

    /* renamed from: a */
    public static Typeface m38055a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m38054b(Context context, CancellationSignal cancellationSignal, C1090g.C1092b[] c1092bArr, int i) {
        return f3363a.mo38034b(context, cancellationSignal, c1092bArr, i);
    }

    /* renamed from: c */
    public static Typeface m38053c(Context context, C0971e.InterfaceC0973b interfaceC0973b, Resources resources, int i, String str, int i2, int i3, C0980h.AbstractC0985e abstractC0985e, Handler handler, boolean z) {
        Typeface mo38035a;
        boolean z2;
        int i4;
        if (interfaceC0973b instanceof C0971e.C0976e) {
            C0971e.C0976e c0976e = (C0971e.C0976e) interfaceC0973b;
            Typeface m38049g = m38049g(c0976e.m38255c());
            if (m38049g != null) {
                if (abstractC0985e != null) {
                    abstractC0985e.m38224d(m38049g, handler);
                }
                return m38049g;
            }
            if (!z ? abstractC0985e == null : c0976e.m38257a() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                i4 = c0976e.m38254d();
            } else {
                i4 = -1;
            }
            mo38035a = C1090g.m37920c(context, c0976e.m38256b(), i3, z2, i4, C0980h.AbstractC0985e.m38223e(handler), new C1025a(abstractC0985e));
        } else {
            mo38035a = f3363a.mo38035a(context, (C0971e.C0974c) interfaceC0973b, resources, i3);
            if (abstractC0985e != null) {
                if (mo38035a != null) {
                    abstractC0985e.m38224d(mo38035a, handler);
                } else {
                    abstractC0985e.m38225c(-3, handler);
                }
            }
        }
        if (mo38035a != null) {
            f3364b.m11427d(m38051e(resources, i, str, i2, i3), mo38035a);
        }
        return mo38035a;
    }

    /* renamed from: d */
    public static Typeface m38052d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface mo38033d = f3363a.mo38033d(context, resources, i, str, i3);
        if (mo38033d != null) {
            f3364b.m11427d(m38051e(resources, i, str, i2, i3), mo38033d);
        }
        return mo38033d;
    }

    /* renamed from: e */
    private static String m38051e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* renamed from: f */
    public static Typeface m38050f(Resources resources, int i, String str, int i2, int i3) {
        return f3364b.m11428c(m38051e(resources, i, str, i2, i3));
    }

    /* renamed from: g */
    private static Typeface m38049g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
