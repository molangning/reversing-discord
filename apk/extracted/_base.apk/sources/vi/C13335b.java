package vi;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.InterfaceC9753i0;
import p371uf.AbstractC12959a;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, m14357d2 = {"Lvi/b;", "Luf/a;", "Lkotlinx/coroutines/i0;", "Ljava/lang/reflect/Method;", "B0", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "b0", "", "_preHandler", "Ljava/lang/Object;", "<init>", "()V", "kotlinx-coroutines-android"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: vi.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13335b extends AbstractC12959a implements InterfaceC9753i0 {
    private volatile Object _preHandler;

    public C13335b() {
        super(InterfaceC9753i0.f25553b);
        this._preHandler = this;
    }

    /* renamed from: B0 */
    private final Method m2771B0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z = true;
                }
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.InterfaceC9753i0
    /* renamed from: b0 */
    public void mo2770b0(CoroutineContext coroutineContext, Throwable th2) {
        boolean z;
        Object obj;
        int i = Build.VERSION.SDK_INT;
        if (26 <= i && i < 28) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Method m2771B0 = m2771B0();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (m2771B0 != null) {
                obj = m2771B0.invoke(null, new Object[0]);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
            }
        }
    }
}
