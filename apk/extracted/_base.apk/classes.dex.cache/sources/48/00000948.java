package p024b4;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.common.references.CloseableReference;
import p191k4.InterfaceC9053a;
import p226m4.C10256d;
import p414x2.C13677a;
import p436y3.InterfaceC13872b;
import p436y3.InterfaceC13873c;

/* renamed from: b4.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2120b implements InterfaceC13873c {

    /* renamed from: e */
    private static final Class<?> f5982e = C2120b.class;

    /* renamed from: a */
    private final InterfaceC13872b f5983a;

    /* renamed from: b */
    private InterfaceC9053a f5984b;

    /* renamed from: c */
    private C10256d f5985c;

    /* renamed from: d */
    private final C10256d.InterfaceC10258b f5986d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b4.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C2121a implements C10256d.InterfaceC10258b {
        C2121a() {
            C2120b.this = r1;
        }

        @Override // p226m4.C10256d.InterfaceC10258b
        /* renamed from: a */
        public void mo11998a(int i, Bitmap bitmap) {
        }

        @Override // p226m4.C10256d.InterfaceC10258b
        /* renamed from: b */
        public CloseableReference<Bitmap> mo11997b(int i) {
            return C2120b.this.f5983a.mo703e(i);
        }
    }

    public C2120b(InterfaceC13872b interfaceC13872b, InterfaceC9053a interfaceC9053a) {
        C2121a c2121a = new C2121a();
        this.f5986d = c2121a;
        this.f5983a = interfaceC13872b;
        this.f5984b = interfaceC9053a;
        this.f5985c = new C10256d(interfaceC9053a, c2121a);
    }

    @Override // p436y3.InterfaceC13873c
    /* renamed from: a */
    public boolean mo1333a(int i, Bitmap bitmap) {
        try {
            this.f5985c.m11999g(i, bitmap);
            return true;
        } catch (IllegalStateException e) {
            C13677a.m1855i(f5982e, e, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i));
            return false;
        }
    }

    @Override // p436y3.InterfaceC13873c
    /* renamed from: c */
    public int mo1332c() {
        return this.f5984b.getHeight();
    }

    @Override // p436y3.InterfaceC13873c
    /* renamed from: d */
    public void mo1331d(Rect rect) {
        InterfaceC9053a mo12024e = this.f5984b.mo12024e(rect);
        if (mo12024e != this.f5984b) {
            this.f5984b = mo12024e;
            this.f5985c = new C10256d(mo12024e, this.f5986d);
        }
    }

    @Override // p436y3.InterfaceC13873c
    /* renamed from: e */
    public int mo1330e() {
        return this.f5984b.getWidth();
    }
}