package p164j$.util.stream;

import p164j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.S */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8601S extends AbstractC8605T {

    /* renamed from: b */
    final Consumer f22750b;

    public C8601S(Consumer consumer, boolean z) {
        super(z);
        this.f22750b = consumer;
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f22750b.accept(obj);
    }
}