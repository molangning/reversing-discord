package p164j$.util.stream;

import p164j$.util.function.Consumer;
import p164j$.util.function.Predicate;
import p164j$.util.function.ToDoubleFunction;
import p164j$.util.function.ToIntFunction;
import p164j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.T1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8607T1 extends AbstractC8651d2 {

    /* renamed from: b */
    public final /* synthetic */ int f22757b;

    /* renamed from: c */
    final /* synthetic */ AbstractC8643c f22758c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8607T1(AbstractC8643c abstractC8643c, InterfaceC8671h2 interfaceC8671h2, int i) {
        super(interfaceC8671h2);
        this.f22757b = i;
        this.f22758c = abstractC8643c;
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f22757b;
        InterfaceC8671h2 interfaceC8671h2 = this.f22839a;
        AbstractC8643c abstractC8643c = this.f22758c;
        switch (i) {
            case 0:
                ((Consumer) ((C8743w) abstractC8643c).f22972t).accept(obj);
                interfaceC8671h2.accept(obj);
                return;
            case 1:
                if (((Predicate) ((C8743w) abstractC8643c).f22972t).test(obj)) {
                    interfaceC8671h2.accept(obj);
                    return;
                }
                return;
            case 2:
                interfaceC8671h2.accept(((C8615V1) abstractC8643c).f22775t.apply(obj));
                return;
            case 3:
                interfaceC8671h2.accept(((ToIntFunction) ((C8748x) abstractC8643c).f22987t).applyAsInt(obj));
                return;
            case 4:
                interfaceC8671h2.accept(((ToLongFunction) ((C8753y) abstractC8643c).f22993t).applyAsLong(obj));
                return;
            case 5:
                interfaceC8671h2.accept(((ToDoubleFunction) ((C8738v) abstractC8643c).f22964t).applyAsDouble(obj));
                return;
            default:
                Stream stream = (Stream) ((C8615V1) abstractC8643c).f22775t.apply(obj);
                if (stream != null) {
                    try {
                        ((Stream) stream.sequential()).forEach(interfaceC8671h2);
                    } catch (Throwable th2) {
                        try {
                            stream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
        }
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        int i = this.f22757b;
        InterfaceC8671h2 interfaceC8671h2 = this.f22839a;
        switch (i) {
            case 1:
                interfaceC8671h2.mo17302g(-1L);
                return;
            case 6:
                interfaceC8671h2.mo17302g(-1L);
                return;
            default:
                interfaceC8671h2.mo17302g(j);
                return;
        }
    }
}