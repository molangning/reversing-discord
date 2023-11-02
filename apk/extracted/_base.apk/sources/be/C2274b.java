package be;

import com.otaliastudios.zoom.ZoomEngine;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0012"}, m14357d2 = {"Lbe/b;", "", "", "c", "()V", "b", "Lcom/otaliastudios/zoom/ZoomEngine$c;", "listener", "a", "(Lcom/otaliastudios/zoom/ZoomEngine$c;)V", "Lcom/otaliastudios/zoom/ZoomEngine;", "Lcom/otaliastudios/zoom/ZoomEngine;", "engine", "", "Ljava/util/List;", "listeners", "<init>", "(Lcom/otaliastudios/zoom/ZoomEngine;)V", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
/* renamed from: be.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2274b {

    /* renamed from: a */
    private final ZoomEngine f6392a;

    /* renamed from: b */
    private final List<ZoomEngine.InterfaceC5356c> f6393b;

    public C2274b(ZoomEngine engine) {
        C9612q.m13917h(engine, "engine");
        this.f6392a = engine;
        this.f6393b = new ArrayList();
    }

    /* renamed from: a */
    public final void m33688a(ZoomEngine.InterfaceC5356c listener) {
        C9612q.m13917h(listener, "listener");
        if (!this.f6393b.contains(listener)) {
            this.f6393b.add(listener);
        }
    }

    /* renamed from: b */
    public final void m33687b() {
        for (ZoomEngine.InterfaceC5356c interfaceC5356c : this.f6393b) {
            interfaceC5356c.onIdle(this.f6392a);
        }
    }

    /* renamed from: c */
    public final void m33686c() {
        for (ZoomEngine.InterfaceC5356c interfaceC5356c : this.f6393b) {
            ZoomEngine zoomEngine = this.f6392a;
            interfaceC5356c.onUpdate(zoomEngine, zoomEngine.m25378y());
        }
    }
}
