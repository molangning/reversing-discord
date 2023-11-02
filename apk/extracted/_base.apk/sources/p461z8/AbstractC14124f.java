package p461z8;

import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC4612b;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p010a9.InterfaceC0097d;
import p010a9.InterfaceC0105h;
import p010a9.InterfaceC0109j;
import p461z8.C14107a;

@Deprecated
/* renamed from: z8.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC14124f {

    /* renamed from: a */
    private static final Set<AbstractC14124f> f36321a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* renamed from: z8.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC14125a extends InterfaceC0097d {
    }

    @Deprecated
    /* renamed from: z8.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC14126b extends InterfaceC0105h {
    }

    /* renamed from: c */
    public static Set<AbstractC14124f> m605c() {
        Set<AbstractC14124f> set = f36321a;
        synchronized (set) {
        }
        return set;
    }

    /* renamed from: a */
    public <A extends C14107a.InterfaceC14109b, R extends InterfaceC14132k, T extends AbstractC4612b<R, A>> T mo607a(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public <A extends C14107a.InterfaceC14109b, T extends AbstractC4612b<? extends InterfaceC14132k, A>> T mo606b(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public Looper mo604d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public boolean m603e(InterfaceC0109j interfaceC0109j) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public void m602f() {
        throw new UnsupportedOperationException();
    }
}
