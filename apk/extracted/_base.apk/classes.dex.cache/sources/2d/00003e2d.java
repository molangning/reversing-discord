package p195k8;

/* renamed from: k8.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9161f {

    /* renamed from: a */
    private final InterfaceC9155c f24116a;

    /* renamed from: b */
    private boolean f24117b;

    public C9161f() {
        this(InterfaceC9155c.f24108a);
    }

    /* renamed from: a */
    public synchronized void m16419a() {
        while (!this.f24117b) {
            wait();
        }
    }

    /* renamed from: b */
    public synchronized boolean m16418b() {
        boolean z;
        z = this.f24117b;
        this.f24117b = false;
        return z;
    }

    /* renamed from: c */
    public synchronized boolean m16417c() {
        return this.f24117b;
    }

    /* renamed from: d */
    public synchronized boolean m16416d() {
        if (this.f24117b) {
            return false;
        }
        this.f24117b = true;
        notifyAll();
        return true;
    }

    public C9161f(InterfaceC9155c interfaceC9155c) {
        this.f24116a = interfaceC9155c;
    }
}