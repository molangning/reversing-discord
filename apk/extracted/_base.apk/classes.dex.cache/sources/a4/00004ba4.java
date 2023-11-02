package p325rg;

/* renamed from: rg.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C12148b implements InterfaceC12147a {

    /* renamed from: j */
    private final InterfaceC12155g f31582j;

    public C12148b(InterfaceC12155g interfaceC12155g) {
        if (interfaceC12155g == null) {
            m6046g0(0);
        }
        this.f31582j = interfaceC12155g;
    }

    /* renamed from: g0 */
    private static /* synthetic */ void m6046g0(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(format);
        }
    }

    @Override // p325rg.InterfaceC12147a
    public InterfaceC12155g getAnnotations() {
        InterfaceC12155g interfaceC12155g = this.f31582j;
        if (interfaceC12155g == null) {
            m6046g0(1);
        }
        return interfaceC12155g;
    }
}