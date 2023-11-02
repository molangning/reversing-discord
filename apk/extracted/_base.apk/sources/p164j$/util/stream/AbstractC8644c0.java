package p164j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8644c0 extends AbstractC8649d0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8644c0(AbstractC8643c abstractC8643c, int i) {
        super(abstractC8643c, i);
    }

    @Override // p164j$.util.stream.AbstractC8643c
    /* renamed from: J1 */
    final boolean mo17456J1() {
        return false;
    }

    @Override // p164j$.util.stream.AbstractC8643c, p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // p164j$.util.stream.AbstractC8643c, p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }
}
