package p219lh;

import java.io.InputStream;
import kh.C9422m;
import kotlin.Pair;
import kotlin.jvm.internal.C9612q;
import p326rh.C12183g;
import p467zf.C14180c;
import pf.C11591x;

/* renamed from: lh.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10191c {
    /* renamed from: a */
    public static final Pair<C9422m, C10188a> m12133a(InputStream inputStream) {
        C9422m c9422m;
        C9612q.m13917h(inputStream, "<this>");
        try {
            C10188a m12135a = C10188a.f26495g.m12135a(inputStream);
            if (m12135a.m12136h()) {
                C12183g m5865d = C12183g.m5865d();
                C10190b.m12134a(m5865d);
                c9422m = C9422m.m15199X(inputStream, m5865d);
            } else {
                c9422m = null;
            }
            Pair<C9422m, C10188a> m7577a = C11591x.m7577a(c9422m, m12135a);
            C14180c.m514a(inputStream, null);
            return m7577a;
        } finally {
        }
    }
}