package p164j$.util.stream;

/* renamed from: j$.util.stream.u1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public class C8735u1 extends AbstractC8740v1 {

    /* renamed from: c */
    public final /* synthetic */ int f22959c;

    /* renamed from: d */
    private final Object f22960d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8735u1(InterfaceC8543E0 interfaceC8543E0, Object obj) {
        this(interfaceC8543E0, obj, 0);
        this.f22959c = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8735u1(InterfaceC8548F0 interfaceC8548F0, Object obj, int i) {
        super(interfaceC8548F0);
        this.f22959c = i;
        this.f22960d = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8735u1(InterfaceC8548F0 interfaceC8548F0, Object[] objArr) {
        this(interfaceC8548F0, objArr, 1);
        this.f22959c = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8735u1(C8735u1 c8735u1, InterfaceC8543E0 interfaceC8543E0, int i) {
        super(c8735u1, interfaceC8543E0, i);
        this.f22959c = 0;
        this.f22960d = c8735u1.f22960d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8735u1(C8735u1 c8735u1, InterfaceC8548F0 interfaceC8548F0, int i) {
        super(c8735u1, interfaceC8548F0, i);
        this.f22959c = 1;
        this.f22960d = (Object[]) c8735u1.f22960d;
    }

    @Override // p164j$.util.stream.AbstractC8740v1
    /* renamed from: a */
    final void mo17381a() {
        switch (this.f22959c) {
            case 0:
                ((InterfaceC8543E0) this.f22966a).mo17429c(this.f22967b, this.f22960d);
                return;
            default:
                this.f22966a.mo17391f((Object[]) this.f22960d, this.f22967b);
                return;
        }
    }

    @Override // p164j$.util.stream.AbstractC8740v1
    /* renamed from: b */
    final C8735u1 mo17380b(int i, int i2) {
        switch (this.f22959c) {
            case 0:
                return new C8735u1(this, ((InterfaceC8543E0) this.f22966a).mo17392a(i), i2);
            default:
                return new C8735u1(this, this.f22966a.mo17392a(i), i2);
        }
    }
}