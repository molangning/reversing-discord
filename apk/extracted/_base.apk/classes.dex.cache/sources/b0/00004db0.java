package tf;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aJ\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000e"}, m14357d2 = {"", ViewProps.START, "isDaemon", "Ljava/lang/ClassLoader;", "contextClassLoader", "", ZeroconfModule.KEY_SERVICE_NAME, "", "priority", "Lkotlin/Function0;", "", "block", "Ljava/lang/Thread;", "a", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: tf.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12672a {

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m14357d2 = {"tf/a$a", "Ljava/lang/Thread;", "", "run", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: tf.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12673a extends Thread {

        /* renamed from: j */
        final /* synthetic */ Function0<Unit> f32853j;

        C12673a(Function0<Unit> function0) {
            this.f32853j = function0;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f32853j.invoke();
        }
    }

    /* renamed from: a */
    public static final Thread m4552a(boolean z, boolean z2, ClassLoader classLoader, String str, int i, Function0<Unit> block) {
        C9612q.m13917h(block, "block");
        C12673a c12673a = new C12673a(block);
        if (z2) {
            c12673a.setDaemon(true);
        }
        if (i > 0) {
            c12673a.setPriority(i);
        }
        if (str != null) {
            c12673a.setName(str);
        }
        if (classLoader != null) {
            c12673a.setContextClassLoader(classLoader);
        }
        if (z) {
            c12673a.start();
        }
        return c12673a;
    }

    /* renamed from: b */
    public static /* synthetic */ Thread m4551b(boolean z, boolean z2, ClassLoader classLoader, String str, int i, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        ClassLoader classLoader2 = (i2 & 4) != 0 ? null : classLoader;
        String str2 = (i2 & 8) != 0 ? null : str;
        if ((i2 & 16) != 0) {
            i = -1;
        }
        return m4552a(z3, z4, classLoader2, str2, i, function0);
    }
}