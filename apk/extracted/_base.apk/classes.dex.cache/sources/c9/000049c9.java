package p291q1;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import p073e1.C6043e;
import p073e1.InterfaceC6067m0;

/* renamed from: q1.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C11673e implements InterfaceC6067m0 {

    /* renamed from: a */
    private static final Set<String> f30438a = new HashSet();

    @Override // p073e1.InterfaceC6067m0
    /* renamed from: a */
    public void mo7240a(String str) {
        mo7237d(str, null);
    }

    @Override // p073e1.InterfaceC6067m0
    /* renamed from: b */
    public void mo7239b(String str, Throwable th2) {
        if (C6043e.f17116a) {
            Log.d("LOTTIE", str, th2);
        }
    }

    @Override // p073e1.InterfaceC6067m0
    /* renamed from: c */
    public void mo7238c(String str) {
        m7236e(str, null);
    }

    @Override // p073e1.InterfaceC6067m0
    /* renamed from: d */
    public void mo7237d(String str, Throwable th2) {
        Set<String> set = f30438a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th2);
        set.add(str);
    }

    /* renamed from: e */
    public void m7236e(String str, Throwable th2) {
        if (C6043e.f17116a) {
            Log.d("LOTTIE", str, th2);
        }
    }
}