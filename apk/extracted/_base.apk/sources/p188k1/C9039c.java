package p188k1;

import java.util.Arrays;
import java.util.List;
import p125h1.AbstractC6861a;
import p125h1.C6872e;
import p206l1.C10008d;
import p311r1.C12020a;

/* renamed from: k1.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C9039c extends AbstractC9050n<C10008d, C10008d> {
    public C9039c(List<C12020a<C10008d>> list) {
        super(m16831d(list));
    }

    /* renamed from: c */
    private static C12020a<C10008d> m16832c(C12020a<C10008d> c12020a) {
        C10008d c10008d = c12020a.f31016b;
        C10008d c10008d2 = c12020a.f31017c;
        if (c10008d != null && c10008d2 != null && c10008d.m12614d().length != c10008d2.m12614d().length) {
            float[] m16830e = m16830e(c10008d.m12614d(), c10008d2.m12614d());
            return c12020a.m6584b(c10008d.m12617a(m16830e), c10008d2.m12617a(m16830e));
        }
        return c12020a;
    }

    /* renamed from: d */
    private static List<C12020a<C10008d>> m16831d(List<C12020a<C10008d>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, m16832c(list.get(i)));
        }
        return list;
    }

    /* renamed from: e */
    static float[] m16830e(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr3[i2];
            if (f2 != f) {
                fArr3[i] = f2;
                i++;
                f = fArr3[i2];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    @Override // p188k1.InterfaceC9049m
    /* renamed from: a */
    public AbstractC6861a<C10008d, C10008d> mo16817a() {
        return new C6872e(this.f23714a);
    }

    @Override // p188k1.AbstractC9050n, p188k1.InterfaceC9049m
    /* renamed from: b */
    public /* bridge */ /* synthetic */ List mo16816b() {
        return super.mo16816b();
    }

    @Override // p188k1.AbstractC9050n, p188k1.InterfaceC9049m
    /* renamed from: g */
    public /* bridge */ /* synthetic */ boolean mo16815g() {
        return super.mo16815g();
    }

    @Override // p188k1.AbstractC9050n
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
