package androidx.activity;

import androidx.core.util.Consumer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC0256g {

    /* renamed from: a */
    private boolean f782a;

    /* renamed from: b */
    private CopyOnWriteArrayList<InterfaceC0250a> f783b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private Consumer<Boolean> f784c;

    public AbstractC0256g(boolean z) {
        this.f782a = z;
    }

    /* renamed from: a */
    public void m40816a(InterfaceC0250a interfaceC0250a) {
        this.f783b.add(interfaceC0250a);
    }

    /* renamed from: b */
    public abstract void mo24970b();

    /* renamed from: c */
    public final boolean m40815c() {
        return this.f782a;
    }

    /* renamed from: d */
    public final void m40814d() {
        Iterator<InterfaceC0250a> it = this.f783b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* renamed from: e */
    public void m40813e(InterfaceC0250a interfaceC0250a) {
        this.f783b.remove(interfaceC0250a);
    }

    /* renamed from: f */
    public final void m40812f(boolean z) {
        this.f782a = z;
        Consumer<Boolean> consumer = this.f784c;
        if (consumer != null) {
            consumer.accept(Boolean.valueOf(z));
        }
    }

    /* renamed from: g */
    public void m40811g(Consumer<Boolean> consumer) {
        this.f784c = consumer;
    }
}