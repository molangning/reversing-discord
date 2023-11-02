package p247nb;

import java.util.Set;
import p423xb.InterfaceC13776b;

/* renamed from: nb.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
abstract class AbstractC10527a implements InterfaceC10538e {
    @Override // p247nb.InterfaceC10538e
    /* renamed from: a */
    public <T> T mo11278a(Class<T> cls) {
        InterfaceC13776b<T> mo11275d = mo11275d(cls);
        if (mo11275d == null) {
            return null;
        }
        return mo11275d.get();
    }

    @Override // p247nb.InterfaceC10538e
    /* renamed from: c */
    public <T> Set<T> mo11276c(Class<T> cls) {
        return mo11277b(cls).get();
    }
}
