package p164j$.util.function;

import java.util.function.IntBinaryOperator;

/* renamed from: j$.util.function.F */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8427F implements IntBinaryOperator {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8429G f22549a;

    private /* synthetic */ C8427F(InterfaceC8429G interfaceC8429G) {
        this.f22549a = interfaceC8429G;
    }

    /* renamed from: a */
    public static /* synthetic */ IntBinaryOperator m17708a(InterfaceC8429G interfaceC8429G) {
        if (interfaceC8429G == null) {
            return null;
        }
        return interfaceC8429G instanceof C8425E ? ((C8425E) interfaceC8429G).f22548a : new C8427F(interfaceC8429G);
    }

    @Override // java.util.function.IntBinaryOperator
    public final /* synthetic */ int applyAsInt(int i, int i2) {
        return this.f22549a.applyAsInt(i, i2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8429G interfaceC8429G = this.f22549a;
        if (obj instanceof C8427F) {
            obj = ((C8427F) obj).f22549a;
        }
        return interfaceC8429G.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22549a.hashCode();
    }
}
