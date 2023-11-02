package androidx.activity.contextaware;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class ContextAwareHelper {

    /* renamed from: a */
    private final Set<OnContextAvailableListener> f776a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private volatile Context f777b;

    /* renamed from: a */
    public void m40824a(OnContextAvailableListener onContextAvailableListener) {
        if (this.f777b != null) {
            onContextAvailableListener.mo36535a(this.f777b);
        }
        this.f776a.add(onContextAvailableListener);
    }

    /* renamed from: b */
    public void m40823b() {
        this.f777b = null;
    }

    /* renamed from: c */
    public void m40822c(Context context) {
        this.f777b = context;
        for (OnContextAvailableListener onContextAvailableListener : this.f776a) {
            onContextAvailableListener.mo36535a(context);
        }
    }

    /* renamed from: d */
    public Context m40821d() {
        return this.f777b;
    }

    /* renamed from: e */
    public void m40820e(OnContextAvailableListener onContextAvailableListener) {
        this.f776a.remove(onContextAvailableListener);
    }
}