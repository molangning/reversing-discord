package af;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import p466ze.C14177a;
import ye.AbstractC14015g;

/* renamed from: af.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0150a {

    /* renamed from: a */
    private static final AbstractC14015g f553a = C14177a.m519d(new CallableC0151a());

    /* renamed from: af.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class CallableC0151a implements Callable<AbstractC14015g> {
        CallableC0151a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public AbstractC14015g call() {
            return C0152b.f554a;
        }
    }

    /* renamed from: af.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C0152b {

        /* renamed from: a */
        static final AbstractC14015g f554a = new C0153b(new Handler(Looper.getMainLooper()), false);
    }

    /* renamed from: a */
    public static AbstractC14015g m41058a() {
        return C14177a.m518e(f553a);
    }
}