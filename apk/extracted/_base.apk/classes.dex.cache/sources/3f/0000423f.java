package p217lf;

import gf.InterfaceC6742c;
import lk.InterfaceC10220b;

/* renamed from: lf.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC10141c implements InterfaceC6742c<Object> {
    INSTANCE;

    /* renamed from: a */
    public static void m12186a(InterfaceC10220b<?> interfaceC10220b) {
        interfaceC10220b.mo905a(INSTANCE);
        interfaceC10220b.mo12122d();
    }

    /* renamed from: b */
    public static void m12185b(Throwable th2, InterfaceC10220b<?> interfaceC10220b) {
        interfaceC10220b.mo905a(INSTANCE);
        interfaceC10220b.onError(th2);
    }

    @Override // gf.InterfaceC6741b
    /* renamed from: c */
    public int mo12184c(int i) {
        return i & 2;
    }

    @Override // lk.InterfaceC10221c
    public void cancel() {
    }

    @Override // gf.InterfaceC6745f
    public void clear() {
    }

    @Override // lk.InterfaceC10221c
    /* renamed from: g */
    public void mo12120g(long j) {
        EnumC10143e.m12178f(j);
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

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }
}