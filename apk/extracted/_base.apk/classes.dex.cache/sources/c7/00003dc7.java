package p191k4;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import java.util.List;
import p038c5.InterfaceC2396a;
import p394w2.C13379j;

/* renamed from: k4.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9059e {

    /* renamed from: a */
    private final InterfaceC9057c f23768a;

    /* renamed from: b */
    private final int f23769b;

    /* renamed from: c */
    private CloseableReference<Bitmap> f23770c;

    /* renamed from: d */
    private List<CloseableReference<Bitmap>> f23771d;

    public C9059e(C9060f c9060f) {
        this.f23768a = (InterfaceC9057c) C13379j.m2677g(c9060f.m16794e());
        this.f23769b = c9060f.m16795d();
        this.f23770c = c9060f.m16793f();
        this.f23771d = c9060f.m16796c();
        c9060f.m16797b();
    }

    /* renamed from: b */
    public static C9059e m16802b(InterfaceC9057c interfaceC9057c) {
        return new C9059e(interfaceC9057c);
    }

    /* renamed from: e */
    public static C9060f m16799e(InterfaceC9057c interfaceC9057c) {
        return new C9060f(interfaceC9057c);
    }

    /* renamed from: a */
    public synchronized void m16803a() {
        CloseableReference.m31715v(this.f23770c);
        this.f23770c = null;
        CloseableReference.m31731A(this.f23771d);
        this.f23771d = null;
    }

    /* renamed from: c */
    public InterfaceC2396a m16801c() {
        return null;
    }

    /* renamed from: d */
    public InterfaceC9057c m16800d() {
        return this.f23768a;
    }

    private C9059e(InterfaceC9057c interfaceC9057c) {
        this.f23768a = (InterfaceC9057c) C13379j.m2677g(interfaceC9057c);
        this.f23769b = 0;
    }
}