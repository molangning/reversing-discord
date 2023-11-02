package p010a9;

import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC4612b;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p461z8.AbstractC14121e;
import p461z8.C14107a;
import p461z8.C14107a.InterfaceC14111d;
import p461z8.InterfaceC14132k;

/* renamed from: a9.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0119q<O extends C14107a.InterfaceC14111d> extends C0116n {
    @NotOnlyInitialized

    /* renamed from: c */
    private final AbstractC14121e<O> f483c;

    public C0119q(AbstractC14121e<O> abstractC14121e) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f483c = abstractC14121e;
    }

    @Override // p461z8.AbstractC14124f
    /* renamed from: a */
    public final <A extends C14107a.InterfaceC14109b, R extends InterfaceC14132k, T extends AbstractC4612b<R, A>> T mo607a(T t) {
        return (T) this.f483c.m626k(t);
    }

    @Override // p461z8.AbstractC14124f
    /* renamed from: b */
    public final <A extends C14107a.InterfaceC14109b, T extends AbstractC4612b<? extends InterfaceC14132k, A>> T mo606b(T t) {
        return (T) this.f483c.m621p(t);
    }

    @Override // p461z8.AbstractC14124f
    /* renamed from: d */
    public final Looper mo604d() {
        return this.f483c.m615v();
    }
}