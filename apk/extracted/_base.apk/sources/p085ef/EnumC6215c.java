package p085ef;

import bf.InterfaceC2276b;
import gf.InterfaceC6741b;

/* renamed from: ef.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC6215c implements InterfaceC6741b, InterfaceC2276b {
    INSTANCE,
    NEVER;

    @Override // bf.InterfaceC2276b
    /* renamed from: b */
    public boolean mo16034b() {
        return this == INSTANCE;
    }

    @Override // gf.InterfaceC6745f
    public void clear() {
    }

    @Override // bf.InterfaceC2276b
    public void dispose() {
    }

    @Override // gf.InterfaceC6745f
    public boolean isEmpty() {
        return true;
    }

    @Override // gf.InterfaceC6745f
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // gf.InterfaceC6745f
    public Object poll() {
        return null;
    }
}
