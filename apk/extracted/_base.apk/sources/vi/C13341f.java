package vi;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.bridge.BaseJavaModule;
import kotlin.Metadata;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0001\"\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\f\"\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m14357d2 = {"Landroid/os/Handler;", "", ZeroconfModule.KEY_SERVICE_NAME, "Lvi/e;", "b", "(Landroid/os/Handler;Ljava/lang/String;)Lvi/e;", "Landroid/os/Looper;", "", BaseJavaModule.METHOD_TYPE_ASYNC, "a", "Lvi/e;", "getMain$annotations", "()V", "Main", "Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: vi.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13341f {

    /* renamed from: a */
    public static final AbstractC13340e f34414a;
    private static volatile Choreographer choreographer;

    static {
        Object m7596b;
        try {
            C11583s.C11584a c11584a = C11583s.f30090k;
            m7596b = C11583s.m7596b(new C13337d(m2759a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th2) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            m7596b = C11583s.m7596b(C11586t.m7587a(th2));
        }
        f34414a = C11583s.m7591g(m7596b) ? null : m7596b;
    }

    /* renamed from: a */
    public static final Handler m2759a(Looper looper, boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT >= 28) {
                Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
                if (invoke != null) {
                    return (Handler) invoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
            }
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    /* renamed from: b */
    public static final AbstractC13340e m2758b(Handler handler, String str) {
        return new C13337d(handler, str);
    }
}
