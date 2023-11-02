package p409wi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m14358d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¨\u0006\n"}, m14357d2 = {"E", "", "capacity", "Lwi/e;", "onBufferOverflow", "Lkotlin/Function1;", "", "onUndeliveredElement", "Lwi/f;", "a", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: wi.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13607h {
    /* renamed from: a */
    public static final <E> InterfaceC13604f<E> m2103a(int i, EnumC13603e enumC13603e, Function1<? super E, Unit> function1) {
        int i2 = 1;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != Integer.MAX_VALUE) {
                        if (i == 1 && enumC13603e == EnumC13603e.DROP_OLDEST) {
                            return new C13617o(function1);
                        }
                        return new C13601d(i, enumC13603e, function1);
                    }
                    return new C13618p(function1);
                } else if (enumC13603e == EnumC13603e.SUSPEND) {
                    return new C13626v(function1);
                } else {
                    return new C13601d(1, enumC13603e, function1);
                }
            }
            if (enumC13603e != EnumC13603e.SUSPEND) {
                i2 = 0;
            }
            if (i2 != 0) {
                return new C13617o(function1);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (enumC13603e == EnumC13603e.SUSPEND) {
            i2 = InterfaceC13604f.f35007h.m2107a();
        }
        return new C13601d(i2, enumC13603e, function1);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC13604f m2102b(int i, EnumC13603e enumC13603e, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            enumC13603e = EnumC13603e.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        return m2103a(i, enumC13603e, function1);
    }
}
