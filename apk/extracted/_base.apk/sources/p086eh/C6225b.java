package p086eh;

import java.util.Set;
import kotlin.collections.C9559v;
import kotlin.jvm.internal.C9612q;
import p142hi.EnumC7317r1;
import p305qg.InterfaceC11920f1;

/* renamed from: eh.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C6225b {
    /* renamed from: a */
    public static final C6224a m23211a(EnumC7317r1 enumC7317r1, boolean z, boolean z2, InterfaceC11920f1 interfaceC11920f1) {
        Set set;
        C9612q.m13917h(enumC7317r1, "<this>");
        if (interfaceC11920f1 != null) {
            set = C9559v.m14008c(interfaceC11920f1);
        } else {
            set = null;
        }
        return new C6224a(enumC7317r1, null, z2, z, set, null, 34, null);
    }

    /* renamed from: b */
    public static /* synthetic */ C6224a m23210b(EnumC7317r1 enumC7317r1, boolean z, boolean z2, InterfaceC11920f1 interfaceC11920f1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            interfaceC11920f1 = null;
        }
        return m23211a(enumC7317r1, z, z2, interfaceC11920f1);
    }
}
