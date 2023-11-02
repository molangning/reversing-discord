package p164j$.util.stream;

import p164j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.Q0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8595Q0 extends AbstractC8558H0 implements InterfaceC8543E0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8595Q0(InterfaceC8543E0 interfaceC8543E0, InterfaceC8543E0 interfaceC8543E02) {
        super(interfaceC8543E0, interfaceC8543E02);
    }

    @Override // p164j$.util.stream.InterfaceC8543E0
    /* renamed from: b */
    public final Object mo17430b() {
        long count = count();
        if (count < 2147483639) {
            Object newArray = newArray((int) count);
            mo17429c(0, newArray);
            return newArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // p164j$.util.stream.InterfaceC8543E0
    /* renamed from: c */
    public final void mo17429c(int i, Object obj) {
        InterfaceC8548F0 interfaceC8548F0 = this.f22685a;
        ((InterfaceC8543E0) interfaceC8548F0).mo17429c(i, obj);
        ((InterfaceC8543E0) this.f22686b).mo17429c(i + ((int) ((InterfaceC8543E0) interfaceC8548F0).count()), obj);
    }

    @Override // p164j$.util.stream.InterfaceC8543E0
    /* renamed from: d */
    public final void mo17428d(Object obj) {
        ((InterfaceC8543E0) this.f22685a).mo17428d(obj);
        ((InterfaceC8543E0) this.f22686b).mo17428d(obj);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: p */
    public final /* synthetic */ Object[] mo17389p(IntFunction intFunction) {
        return AbstractC8744w0.m17317y0(this, intFunction);
    }

    public final String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f22685a, this.f22686b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}
