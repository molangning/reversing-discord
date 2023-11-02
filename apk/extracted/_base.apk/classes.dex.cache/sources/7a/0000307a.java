package p057d4;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p005a4.C0021c;
import p005a4.C0023d;
import p005a4.InterfaceC0020b;
import p024b4.C2119a;
import p024b4.C2120b;
import p037c4.C2392a;
import p056d3.InterfaceC5739b;
import p191k4.C9059e;
import p191k4.InterfaceC9053a;
import p191k4.InterfaceC9057c;
import p226m4.C10253c;
import p226m4.InterfaceC10252b;
import p278p4.InterfaceC11396i;
import p361u4.InterfaceC12830a;
import p380v4.AbstractC13063c;
import p380v4.C13061a;
import p394w2.C13379j;
import p415x3.C13682c;
import p415x3.InterfaceC13680a;
import p436y3.C13871a;
import p436y3.InterfaceC13872b;
import p436y3.InterfaceC13873c;
import p456z3.C14084a;
import p456z3.C14085b;
import p456z3.C14086c;
import p456z3.C14087d;

/* renamed from: d4.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5742a implements InterfaceC12830a {

    /* renamed from: a */
    private final InterfaceC10252b f16518a;

    /* renamed from: b */
    private final ScheduledExecutorService f16519b;

    /* renamed from: c */
    private final ExecutorService f16520c;

    /* renamed from: d */
    private final InterfaceC5739b f16521d;

    /* renamed from: e */
    private final PlatformBitmapFactory f16522e;

    /* renamed from: f */
    private final InterfaceC11396i<CacheKey, AbstractC13063c> f16523f;

    /* renamed from: g */
    private final Supplier<Integer> f16524g;

    /* renamed from: h */
    private final Supplier<Integer> f16525h;

    /* renamed from: i */
    private final Supplier<Boolean> f16526i;

    public C5742a(InterfaceC10252b interfaceC10252b, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, InterfaceC5739b interfaceC5739b, PlatformBitmapFactory platformBitmapFactory, InterfaceC11396i<CacheKey, AbstractC13063c> interfaceC11396i, Supplier<Integer> supplier, Supplier<Integer> supplier2, Supplier<Boolean> supplier3) {
        this.f16518a = interfaceC10252b;
        this.f16519b = scheduledExecutorService;
        this.f16520c = executorService;
        this.f16521d = interfaceC5739b;
        this.f16522e = platformBitmapFactory;
        this.f16523f = interfaceC11396i;
        this.f16524g = supplier;
        this.f16525h = supplier2;
        this.f16526i = supplier3;
    }

    /* renamed from: c */
    private InterfaceC9053a m24591c(C9059e c9059e) {
        InterfaceC9057c m16800d = c9059e.m16800d();
        return this.f16518a.mo12014a(c9059e, new Rect(0, 0, m16800d.getWidth(), m16800d.getHeight()));
    }

    /* renamed from: d */
    private C10253c m24590d(C9059e c9059e) {
        return new C10253c(new C14084a(c9059e.hashCode(), this.f16526i.get().booleanValue()), this.f16523f);
    }

    /* renamed from: e */
    private InterfaceC13680a m24589e(C9059e c9059e, Bitmap.Config config) {
        C0023d c0023d;
        InterfaceC0020b interfaceC0020b;
        InterfaceC9053a m24591c = m24591c(c9059e);
        InterfaceC13872b m24588f = m24588f(c9059e);
        C2120b c2120b = new C2120b(m24588f, m24591c);
        int intValue = this.f16525h.get().intValue();
        if (intValue > 0) {
            C0023d c0023d2 = new C0023d(intValue);
            interfaceC0020b = m24587g(c2120b, config);
            c0023d = c0023d2;
        } else {
            c0023d = null;
            interfaceC0020b = null;
        }
        return C13682c.m1816n(new C13871a(this.f16522e, m24588f, new C2119a(m24591c), c2120b, c0023d, interfaceC0020b), this.f16521d, this.f16519b);
    }

    /* renamed from: f */
    private InterfaceC13872b m24588f(C9059e c9059e) {
        int intValue = this.f16524g.get().intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    return new C14087d();
                }
                return new C14086c();
            }
            return new C14085b(m24590d(c9059e), false);
        }
        return new C14085b(m24590d(c9059e), true);
    }

    /* renamed from: g */
    private InterfaceC0020b m24587g(InterfaceC13873c interfaceC13873c, Bitmap.Config config) {
        PlatformBitmapFactory platformBitmapFactory = this.f16522e;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return new C0021c(platformBitmapFactory, interfaceC13873c, config, this.f16520c);
    }

    @Override // p361u4.InterfaceC12830a
    /* renamed from: a */
    public boolean mo3845a(AbstractC13063c abstractC13063c) {
        return abstractC13063c instanceof C13061a;
    }

    @Override // p361u4.InterfaceC12830a
    /* renamed from: h */
    public C2392a mo3844b(AbstractC13063c abstractC13063c) {
        Bitmap.Config config;
        C13061a c13061a = (C13061a) abstractC13063c;
        InterfaceC9057c m3372o = c13061a.m3372o();
        C9059e c9059e = (C9059e) C13379j.m2677g(c13061a.m3371q());
        if (m3372o != null) {
            config = m3372o.mo16809h();
        } else {
            config = null;
        }
        return new C2392a(m24589e(c9059e, config));
    }
}