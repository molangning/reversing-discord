package p191k4;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import java.util.List;
import p038c5.InterfaceC2396a;

/* renamed from: k4.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9060f {

    /* renamed from: a */
    private final InterfaceC9057c f23772a;

    /* renamed from: b */
    private CloseableReference<Bitmap> f23773b;

    /* renamed from: c */
    private List<CloseableReference<Bitmap>> f23774c;

    /* renamed from: d */
    private int f23775d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9060f(InterfaceC9057c interfaceC9057c) {
        this.f23772a = interfaceC9057c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.facebook.common.references.CloseableReference<android.graphics.Bitmap>>, com.facebook.common.references.CloseableReference<android.graphics.Bitmap>] */
    /* renamed from: a */
    public C9059e m16798a() {
        try {
            return new C9059e(this);
        } finally {
            CloseableReference.m31715v(this.f23773b);
            this.f23773b = null;
            CloseableReference.m31731A(this.f23774c);
            this.f23774c = null;
        }
    }

    /* renamed from: b */
    public InterfaceC2396a m16797b() {
        return null;
    }

    /* renamed from: c */
    public List<CloseableReference<Bitmap>> m16796c() {
        return CloseableReference.m31716t(this.f23774c);
    }

    /* renamed from: d */
    public int m16795d() {
        return this.f23775d;
    }

    /* renamed from: e */
    public InterfaceC9057c m16794e() {
        return this.f23772a;
    }

    /* renamed from: f */
    public CloseableReference<Bitmap> m16793f() {
        return CloseableReference.m31717s(this.f23773b);
    }

    /* renamed from: g */
    public C9060f m16792g(InterfaceC2396a interfaceC2396a) {
        return this;
    }

    /* renamed from: h */
    public C9060f m16791h(List<CloseableReference<Bitmap>> list) {
        this.f23774c = CloseableReference.m31716t(list);
        return this;
    }

    /* renamed from: i */
    public C9060f m16790i(int i) {
        this.f23775d = i;
        return this;
    }

    /* renamed from: j */
    public C9060f m16789j(CloseableReference<Bitmap> closeableReference) {
        this.f23773b = CloseableReference.m31717s(closeableReference);
        return this;
    }
}
