package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.AbstractC9760i2;
import si.C12545m;
import si.C12552o;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, m14357d2 = {"Lkotlinx/coroutines/internal/u;", "", "Lkotlinx/coroutines/i2;", "a", "", "b", "Z", "FAST_SERVICE_LOADER_ENABLED", "c", "Lkotlinx/coroutines/i2;", "dispatcher", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9803u {

    /* renamed from: a */
    public static final C9803u f25627a;

    /* renamed from: b */
    private static final boolean f25628b;

    /* renamed from: c */
    public static final AbstractC9760i2 f25629c;

    static {
        C9803u c9803u = new C9803u();
        f25627a = c9803u;
        f25628b = C9770e0.m13323e("kotlinx.coroutines.fast.service.loader", true);
        f25629c = c9803u.m13210a();
    }

    private C9803u() {
    }

    /* renamed from: a */
    private final AbstractC9760i2 m13210a() {
        Sequence m4881c;
        List<InterfaceC9802t> m4867E;
        Object next;
        AbstractC9760i2 m13205e;
        try {
            if (f25628b) {
                m4867E = C9780i.f25591a.m13293c();
            } else {
                m4881c = C12545m.m4881c(ServiceLoader.load(InterfaceC9802t.class, InterfaceC9802t.class.getClassLoader()).iterator());
                m4867E = C12552o.m4867E(m4881c);
            }
            Iterator<T> it = m4867E.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int mo2772c = ((InterfaceC9802t) next).mo2772c();
                    do {
                        Object next2 = it.next();
                        int mo2772c2 = ((InterfaceC9802t) next2).mo2772c();
                        if (mo2772c < mo2772c2) {
                            next = next2;
                            mo2772c = mo2772c2;
                        }
                    } while (it.hasNext());
                }
            }
            InterfaceC9802t interfaceC9802t = (InterfaceC9802t) next;
            if (interfaceC9802t == null || (m13205e = C9804v.m13205e(interfaceC9802t, m4867E)) == null) {
                return C9804v.m13208b(null, null, 3, null);
            }
            return m13205e;
        } catch (Throwable th2) {
            return C9804v.m13208b(th2, null, 2, null);
        }
    }
}