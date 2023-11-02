package p164j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.v1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8740v1 extends CountedCompleter {

    /* renamed from: a */
    protected final InterfaceC8548F0 f22966a;

    /* renamed from: b */
    protected final int f22967b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8740v1(InterfaceC8548F0 interfaceC8548F0) {
        this.f22966a = interfaceC8548F0;
        this.f22967b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8740v1(AbstractC8740v1 abstractC8740v1, InterfaceC8548F0 interfaceC8548F0, int i) {
        super(abstractC8740v1);
        this.f22966a = interfaceC8548F0;
        this.f22967b = i;
    }

    /* renamed from: a */
    abstract void mo17381a();

    /* renamed from: b */
    abstract C8735u1 mo17380b(int i, int i2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        AbstractC8740v1 abstractC8740v1 = this;
        while (abstractC8740v1.f22966a.mo17390k() != 0) {
            abstractC8740v1.setPendingCount(abstractC8740v1.f22966a.mo17390k() - 1);
            int i = 0;
            int i2 = 0;
            while (i < abstractC8740v1.f22966a.mo17390k() - 1) {
                C8735u1 mo17380b = abstractC8740v1.mo17380b(i, abstractC8740v1.f22967b + i2);
                i2 = (int) (i2 + mo17380b.f22966a.count());
                mo17380b.fork();
                i++;
            }
            abstractC8740v1 = abstractC8740v1.mo17380b(i, abstractC8740v1.f22967b + i2);
        }
        abstractC8740v1.mo17381a();
        abstractC8740v1.propagateCompletion();
    }
}
