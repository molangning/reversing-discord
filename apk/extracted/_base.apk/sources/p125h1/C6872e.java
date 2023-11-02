package p125h1;

import java.util.List;
import p206l1.C10008d;
import p311r1.C12020a;

/* renamed from: h1.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6872e extends AbstractC6874g<C10008d> {

    /* renamed from: i */
    private final C10008d f19136i;

    public C6872e(List<C12020a<C10008d>> list) {
        super(list);
        C10008d c10008d = list.get(0).f31016b;
        int m12613e = c10008d != null ? c10008d.m12613e() : 0;
        this.f19136i = new C10008d(new float[m12613e], new int[m12613e]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p125h1.AbstractC6861a
    /* renamed from: p */
    public C10008d mo21711i(C12020a<C10008d> c12020a, float f) {
        this.f19136i.m12612f(c12020a.f31016b, c12020a.f31017c, f);
        return this.f19136i;
    }
}
