package bf;

/* renamed from: bf.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C2279e extends AbstractC2278d<Runnable> {
    public C2279e(Runnable runnable) {
        super(runnable);
    }

    @Override // bf.AbstractC2278d
    /* renamed from: c */
    public void mo33682a(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + mo16034b() + ", " + get() + ")";
    }
}