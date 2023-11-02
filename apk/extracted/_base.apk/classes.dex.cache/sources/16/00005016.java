package vg;

import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import ph.C11632b;

/* renamed from: vg.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13286h {
    /* renamed from: b */
    public static final String m2844b(C11632b c11632b) {
        String m13763C;
        String m7458b = c11632b.m7464i().m7458b();
        C9612q.m13918g(m7458b, "relativeClassName.asString()");
        m13763C = C9653o.m13763C(m7458b, '.', '$', false, 4, null);
        if (!c11632b.m7465h().m7456d()) {
            return c11632b.m7465h() + '.' + m13763C;
        }
        return m13763C;
    }
}