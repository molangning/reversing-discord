package p120gc;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: gc.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6721d {

    /* renamed from: b */
    private static volatile C6721d f18936b;

    /* renamed from: a */
    private final Set<AbstractC6723f> f18937a = new HashSet();

    C6721d() {
    }

    /* renamed from: a */
    public static C6721d m22038a() {
        C6721d c6721d = f18936b;
        if (c6721d == null) {
            synchronized (C6721d.class) {
                c6721d = f18936b;
                if (c6721d == null) {
                    c6721d = new C6721d();
                    f18936b = c6721d;
                }
            }
        }
        return c6721d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Set<AbstractC6723f> m22037b() {
        Set<AbstractC6723f> unmodifiableSet;
        synchronized (this.f18937a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f18937a);
        }
        return unmodifiableSet;
    }
}
