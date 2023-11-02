package p380v4;

import p191k4.C9059e;
import p191k4.InterfaceC9057c;

/* renamed from: v4.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13061a extends AbstractC13063c {

    /* renamed from: l */
    private C9059e f33841l;

    /* renamed from: m */
    private boolean f33842m;

    public C13061a(C9059e c9059e) {
        this(c9059e, true);
    }

    @Override // p380v4.AbstractC13063c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            C9059e c9059e = this.f33841l;
            if (c9059e == null) {
                return;
            }
            this.f33841l = null;
            c9059e.m16803a();
        }
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo
    public synchronized int getHeight() {
        int height;
        C9059e c9059e = this.f33841l;
        if (c9059e == null) {
            height = 0;
        } else {
            height = c9059e.m16800d().getHeight();
        }
        return height;
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo
    public synchronized int getWidth() {
        int width;
        C9059e c9059e = this.f33841l;
        if (c9059e == null) {
            width = 0;
        } else {
            width = c9059e.m16800d().getWidth();
        }
        return width;
    }

    @Override // p380v4.AbstractC13063c
    /* renamed from: h */
    public synchronized int mo3364h() {
        int mo16810g;
        C9059e c9059e = this.f33841l;
        if (c9059e == null) {
            mo16810g = 0;
        } else {
            mo16810g = c9059e.m16800d().mo16810g();
        }
        return mo16810g;
    }

    @Override // p380v4.AbstractC13063c
    /* renamed from: i */
    public boolean mo3370i() {
        return this.f33842m;
    }

    @Override // p380v4.AbstractC13063c
    public synchronized boolean isClosed() {
        boolean z;
        if (this.f33841l == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: o */
    public synchronized InterfaceC9057c m3372o() {
        InterfaceC9057c m16800d;
        C9059e c9059e = this.f33841l;
        if (c9059e == null) {
            m16800d = null;
        } else {
            m16800d = c9059e.m16800d();
        }
        return m16800d;
    }

    /* renamed from: q */
    public synchronized C9059e m3371q() {
        return this.f33841l;
    }

    public C13061a(C9059e c9059e, boolean z) {
        this.f33841l = c9059e;
        this.f33842m = z;
    }
}