package p277p3;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import p277p3.AbstractC11375a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p3.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11377b extends AbstractC11375a {

    /* renamed from: b */
    private final Object f29616b = new Object();

    /* renamed from: f */
    private final Runnable f29620f = new RunnableC11378a();

    /* renamed from: d */
    private ArrayList<AbstractC11375a.InterfaceC11376a> f29618d = new ArrayList<>();

    /* renamed from: e */
    private ArrayList<AbstractC11375a.InterfaceC11376a> f29619e = new ArrayList<>();

    /* renamed from: c */
    private final Handler f29617c = new Handler(Looper.getMainLooper());

    /* renamed from: p3.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class RunnableC11378a implements Runnable {
        RunnableC11378a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C11377b.this.f29616b) {
                ArrayList arrayList = C11377b.this.f29619e;
                C11377b c11377b = C11377b.this;
                c11377b.f29619e = c11377b.f29618d;
                C11377b.this.f29618d = arrayList;
            }
            int size = C11377b.this.f29619e.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC11375a.InterfaceC11376a) C11377b.this.f29619e.get(i)).release();
            }
            C11377b.this.f29619e.clear();
        }
    }

    @Override // p277p3.AbstractC11375a
    /* renamed from: a */
    public void mo8204a(AbstractC11375a.InterfaceC11376a interfaceC11376a) {
        synchronized (this.f29616b) {
            this.f29618d.remove(interfaceC11376a);
        }
    }

    @Override // p277p3.AbstractC11375a
    /* renamed from: d */
    public void mo8203d(AbstractC11375a.InterfaceC11376a interfaceC11376a) {
        if (!AbstractC11375a.m8205c()) {
            interfaceC11376a.release();
            return;
        }
        synchronized (this.f29616b) {
            if (this.f29618d.contains(interfaceC11376a)) {
                return;
            }
            this.f29618d.add(interfaceC11376a);
            boolean z = true;
            if (this.f29618d.size() != 1) {
                z = false;
            }
            if (z) {
                this.f29617c.post(this.f29620f);
            }
        }
    }
}
