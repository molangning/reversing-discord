package p021b1;

import android.util.Log;
import java.util.Arrays;

/* renamed from: b1.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2054k0 implements InterfaceC2025c0 {

    /* renamed from: d */
    private static String f5726d = "Error formating log message: %s, with params: %s";

    /* renamed from: a */
    private EnumC2052j0 f5727a;

    /* renamed from: c */
    private boolean f5729c = false;

    /* renamed from: b */
    private boolean f5728b = false;

    public C2054k0() {
        mo34440f(EnumC2052j0.INFO, false);
    }

    @Override // p021b1.InterfaceC2025c0
    /* renamed from: a */
    public void mo34445a(String str, Object... objArr) {
        if (!this.f5729c && this.f5727a.f5719j <= 5) {
            try {
                Log.w("Adjust", C2043h1.m34474l(str, objArr));
            } catch (Exception unused) {
                Log.e("Adjust", C2043h1.m34474l(f5726d, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // p021b1.InterfaceC2025c0
    /* renamed from: b */
    public void mo34444b(String str, Object... objArr) {
        if (!this.f5729c && this.f5727a.f5719j <= 6) {
            try {
                Log.e("Adjust", C2043h1.m34474l(str, objArr));
            } catch (Exception unused) {
                Log.e("Adjust", C2043h1.m34474l(f5726d, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // p021b1.InterfaceC2025c0
    /* renamed from: c */
    public void mo34443c(String str, Object... objArr) {
        if (!this.f5729c && this.f5727a.f5719j <= 3) {
            try {
                Log.d("Adjust", C2043h1.m34474l(str, objArr));
            } catch (Exception unused) {
                Log.e("Adjust", C2043h1.m34474l(f5726d, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // p021b1.InterfaceC2025c0
    /* renamed from: d */
    public void mo34442d() {
        this.f5728b = true;
    }

    @Override // p021b1.InterfaceC2025c0
    /* renamed from: e */
    public void mo34441e(String str, Object... objArr) {
        if (this.f5727a.f5719j <= 5) {
            try {
                Log.w("Adjust", C2043h1.m34474l(str, objArr));
            } catch (Exception unused) {
                Log.e("Adjust", C2043h1.m34474l(f5726d, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // p021b1.InterfaceC2025c0
    /* renamed from: f */
    public void mo34440f(EnumC2052j0 enumC2052j0, boolean z) {
        if (this.f5728b) {
            return;
        }
        this.f5727a = enumC2052j0;
        this.f5729c = z;
    }

    @Override // p021b1.InterfaceC2025c0
    /* renamed from: g */
    public void mo34439g(String str, Object... objArr) {
        if (!this.f5729c && this.f5727a.f5719j <= 2) {
            try {
                Log.v("Adjust", C2043h1.m34474l(str, objArr));
            } catch (Exception unused) {
                Log.e("Adjust", C2043h1.m34474l(f5726d, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // p021b1.InterfaceC2025c0
    /* renamed from: h */
    public void mo34438h(String str, Object... objArr) {
        if (!this.f5729c && this.f5727a.f5719j <= 4) {
            try {
                Log.i("Adjust", C2043h1.m34474l(str, objArr));
            } catch (Exception unused) {
                Log.e("Adjust", C2043h1.m34474l(f5726d, str, Arrays.toString(objArr)));
            }
        }
    }
}
