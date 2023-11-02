package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.drawee.drawable.C3614f;
import com.facebook.drawee.drawable.C3618j;
import com.facebook.drawee.drawable.C3619k;
import com.facebook.drawee.drawable.C3623m;
import com.facebook.drawee.drawable.C3624n;
import com.facebook.drawee.drawable.InterfaceC3610c;
import com.facebook.drawee.drawable.InterfaceC3617i;
import com.facebook.drawee.drawable.RoundedColorDrawable;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.C3628a;
import p006a5.C0025b;
import p394w2.C13379j;
import p414x2.C13677a;

/* renamed from: com.facebook.drawee.generic.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3630b {

    /* renamed from: a */
    private static final Drawable f9997a = new ColorDrawable(0);

    /* renamed from: a */
    private static Drawable m31400a(Drawable drawable, C3628a c3628a, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            C3618j c3618j = new C3618j(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            m31399b(c3618j, c3628a);
            return c3618j;
        } else if (drawable instanceof NinePatchDrawable) {
            C3623m c3623m = new C3623m((NinePatchDrawable) drawable);
            m31399b(c3623m, c3628a);
            return c3623m;
        } else if (drawable instanceof ColorDrawable) {
            RoundedColorDrawable m31539f = RoundedColorDrawable.m31539f((ColorDrawable) drawable);
            m31399b(m31539f, c3628a);
            return m31539f;
        } else {
            C13677a.m1868J("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
    }

    /* renamed from: b */
    static void m31399b(InterfaceC3617i interfaceC3617i, C3628a c3628a) {
        interfaceC3617i.mo31499a(c3628a.m31413i());
        interfaceC3617i.mo31493g(c3628a.m31418d());
        interfaceC3617i.setBorder(c3628a.m31420b(), c3628a.m31419c());
        interfaceC3617i.mo31498b(c3628a.m31415g());
        interfaceC3617i.mo31495e(c3628a.m31411k());
        interfaceC3617i.mo31496d(c3628a.m31414h());
    }

    /* renamed from: c */
    static InterfaceC3610c m31398c(InterfaceC3610c interfaceC3610c) {
        while (true) {
            Drawable drawable = interfaceC3610c.getDrawable();
            if (drawable == interfaceC3610c || !(drawable instanceof InterfaceC3610c)) {
                break;
            }
            interfaceC3610c = (InterfaceC3610c) drawable;
        }
        return interfaceC3610c;
    }

    /* renamed from: d */
    public static Drawable m31397d(Drawable drawable, C3628a c3628a, Resources resources) {
        try {
            if (C0025b.m41375d()) {
                C0025b.m41378a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && c3628a != null && c3628a.m31412j() == C3628a.EnumC3629a.BITMAP_ONLY) {
                if (drawable instanceof C3614f) {
                    InterfaceC3610c m31398c = m31398c((C3614f) drawable);
                    m31398c.setDrawable(m31400a(m31398c.setDrawable(f9997a), c3628a, resources));
                    return drawable;
                }
                Drawable m31400a = m31400a(drawable, c3628a, resources);
                if (C0025b.m41375d()) {
                    C0025b.m41377b();
                }
                return m31400a;
            }
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
            return drawable;
        } finally {
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
    }

    /* renamed from: e */
    public static Drawable m31396e(Drawable drawable, C3628a c3628a) {
        try {
            if (C0025b.m41375d()) {
                C0025b.m41378a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && c3628a != null && c3628a.m31412j() == C3628a.EnumC3629a.OVERLAY_COLOR) {
                C3619k c3619k = new C3619k(drawable);
                m31399b(c3619k, c3628a);
                c3619k.m31501i(c3628a.m31416f());
                return c3619k;
            }
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
            return drawable;
        } finally {
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
    }

    /* renamed from: f */
    public static Drawable m31395f(Drawable drawable, ScalingUtils.ScaleType scaleType) {
        return m31394g(drawable, scaleType, null);
    }

    /* renamed from: g */
    public static Drawable m31394g(Drawable drawable, ScalingUtils.ScaleType scaleType, PointF pointF) {
        if (C0025b.m41375d()) {
            C0025b.m41378a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable != null && scaleType != null) {
            C3624n c3624n = new C3624n(drawable, scaleType);
            if (pointF != null) {
                c3624n.m31485l(pointF);
            }
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
            return c3624n;
        }
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
        return drawable;
    }

    /* renamed from: h */
    static void m31393h(InterfaceC3617i interfaceC3617i) {
        interfaceC3617i.mo31499a(false);
        interfaceC3617i.mo31497c(0.0f);
        interfaceC3617i.setBorder(0, 0.0f);
        interfaceC3617i.mo31498b(0.0f);
        interfaceC3617i.mo31495e(false);
        interfaceC3617i.mo31496d(false);
    }

    /* renamed from: i */
    public static void m31392i(InterfaceC3610c interfaceC3610c, C3628a c3628a, Resources resources) {
        InterfaceC3610c m31398c = m31398c(interfaceC3610c);
        Drawable drawable = m31398c.getDrawable();
        if (c3628a != null && c3628a.m31412j() == C3628a.EnumC3629a.BITMAP_ONLY) {
            if (drawable instanceof InterfaceC3617i) {
                m31399b((InterfaceC3617i) drawable, c3628a);
            } else if (drawable != null) {
                m31398c.setDrawable(f9997a);
                m31398c.setDrawable(m31400a(drawable, c3628a, resources));
            }
        } else if (drawable instanceof InterfaceC3617i) {
            m31393h((InterfaceC3617i) drawable);
        }
    }

    /* renamed from: j */
    public static void m31391j(InterfaceC3610c interfaceC3610c, C3628a c3628a) {
        Drawable drawable = interfaceC3610c.getDrawable();
        if (c3628a != null && c3628a.m31412j() == C3628a.EnumC3629a.OVERLAY_COLOR) {
            if (drawable instanceof C3619k) {
                C3619k c3619k = (C3619k) drawable;
                m31399b(c3619k, c3628a);
                c3619k.m31501i(c3628a.m31416f());
                return;
            }
            interfaceC3610c.setDrawable(m31396e(interfaceC3610c.setDrawable(f9997a), c3628a));
        } else if (drawable instanceof C3619k) {
            Drawable drawable2 = f9997a;
            interfaceC3610c.setDrawable(((C3619k) drawable).setCurrent(drawable2));
            drawable2.setCallback(null);
        }
    }

    /* renamed from: k */
    public static C3624n m31390k(InterfaceC3610c interfaceC3610c, ScalingUtils.ScaleType scaleType) {
        Drawable m31395f = m31395f(interfaceC3610c.setDrawable(f9997a), scaleType);
        interfaceC3610c.setDrawable(m31395f);
        C13379j.m2676h(m31395f, "Parent has no child drawable!");
        return (C3624n) m31395f;
    }
}