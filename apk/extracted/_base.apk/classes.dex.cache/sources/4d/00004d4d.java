package p344t2;

/* renamed from: t2.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12573c implements InterfaceC12572b {

    /* renamed from: a */
    private static C12573c f32638a;

    private C12573c() {
    }

    /* renamed from: b */
    public static synchronized C12573c m4780b() {
        C12573c c12573c;
        synchronized (C12573c.class) {
            if (f32638a == null) {
                f32638a = new C12573c();
            }
            c12573c = f32638a;
        }
        return c12573c;
    }

    @Override // p344t2.InterfaceC12572b
    /* renamed from: a */
    public void mo4781a(InterfaceC12571a interfaceC12571a) {
    }
}