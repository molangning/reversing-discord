package p164j$.util.stream;

/* renamed from: j$.util.stream.H0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
abstract class AbstractC8558H0 implements InterfaceC8548F0 {

    /* renamed from: a */
    protected final InterfaceC8548F0 f22685a;

    /* renamed from: b */
    protected final InterfaceC8548F0 f22686b;

    /* renamed from: c */
    private final long f22687c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8558H0(InterfaceC8548F0 interfaceC8548F0, InterfaceC8548F0 interfaceC8548F02) {
        this.f22685a = interfaceC8548F0;
        this.f22686b = interfaceC8548F02;
        this.f22687c = interfaceC8548F0.count() + interfaceC8548F02.count();
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC8543E0 mo17392a(int i) {
        return (InterfaceC8543E0) mo17392a(i);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: a */
    public final InterfaceC8548F0 mo17392a(int i) {
        if (i == 0) {
            return this.f22685a;
        }
        if (i == 1) {
            return this.f22686b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final long count() {
        return this.f22687c;
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: k */
    public final int mo17390k() {
        return 2;
    }
}
