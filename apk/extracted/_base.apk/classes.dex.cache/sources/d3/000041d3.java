package p208l3;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.C3616h;
import p006a5.C0025b;
import p361u4.InterfaceC12830a;
import p380v4.AbstractC13063c;
import p380v4.C13064d;

/* renamed from: l3.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10033a implements InterfaceC12830a {

    /* renamed from: a */
    private final Resources f26077a;

    /* renamed from: b */
    private final InterfaceC12830a f26078b;

    public C10033a(Resources resources, InterfaceC12830a interfaceC12830a) {
        this.f26077a = resources;
        this.f26078b = interfaceC12830a;
    }

    /* renamed from: c */
    private static boolean m12514c(C13064d c13064d) {
        if (c13064d.m3367A() != 1 && c13064d.m3367A() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m12513d(C13064d c13064d) {
        if (c13064d.m3366D() != 0 && c13064d.m3366D() != -1) {
            return true;
        }
        return false;
    }

    @Override // p361u4.InterfaceC12830a
    /* renamed from: a */
    public boolean mo3845a(AbstractC13063c abstractC13063c) {
        return true;
    }

    @Override // p361u4.InterfaceC12830a
    /* renamed from: b */
    public Drawable mo3844b(AbstractC13063c abstractC13063c) {
        try {
            if (C0025b.m41375d()) {
                C0025b.m41378a("DefaultDrawableFactory#createDrawable");
            }
            if (abstractC13063c instanceof C13064d) {
                C13064d c13064d = (C13064d) abstractC13063c;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f26077a, c13064d.mo3363o());
                if (!m12513d(c13064d) && !m12514c(c13064d)) {
                    return bitmapDrawable;
                }
                C3616h c3616h = new C3616h(bitmapDrawable, c13064d.m3366D(), c13064d.m3367A());
                if (C0025b.m41375d()) {
                    C0025b.m41377b();
                }
                return c3616h;
            }
            InterfaceC12830a interfaceC12830a = this.f26078b;
            if (interfaceC12830a != null && interfaceC12830a.mo3845a(abstractC13063c)) {
                Drawable mo3844b = this.f26078b.mo3844b(abstractC13063c);
                if (C0025b.m41375d()) {
                    C0025b.m41377b();
                }
                return mo3844b;
            } else if (C0025b.m41375d()) {
                C0025b.m41377b();
                return null;
            } else {
                return null;
            }
        } finally {
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
    }
}