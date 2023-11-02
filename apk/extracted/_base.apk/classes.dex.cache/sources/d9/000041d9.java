package p209l4;

import com.facebook.cache.common.CacheKey;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import java.util.concurrent.ExecutorService;
import p278p4.InterfaceC11396i;
import p314r4.InterfaceC12053e;
import p359u2.InterfaceExecutorServiceC12825f;
import p380v4.AbstractC13063c;

/* renamed from: l4.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10039b {

    /* renamed from: a */
    private static boolean f26095a;

    /* renamed from: b */
    private static InterfaceC10038a f26096b;

    /* renamed from: a */
    public static InterfaceC10038a m12498a(PlatformBitmapFactory platformBitmapFactory, InterfaceC12053e interfaceC12053e, InterfaceC11396i<CacheKey, AbstractC13063c> interfaceC11396i, boolean z, ExecutorService executorService) {
        if (!f26095a) {
            try {
                f26096b = (InterfaceC10038a) AnimatedFactoryV2Impl.class.getConstructor(PlatformBitmapFactory.class, InterfaceC12053e.class, InterfaceC11396i.class, Boolean.TYPE, InterfaceExecutorServiceC12825f.class).newInstance(platformBitmapFactory, interfaceC12053e, interfaceC11396i, Boolean.valueOf(z), executorService);
            } catch (Throwable unused) {
            }
            if (f26096b != null) {
                f26095a = true;
            }
        }
        return f26096b;
    }
}