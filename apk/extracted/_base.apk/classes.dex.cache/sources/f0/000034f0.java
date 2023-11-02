package p125h1;

import android.graphics.Path;
import java.util.List;
import p111g1.InterfaceC6539s;
import p206l1.C10021n;
import p291q1.C11679k;
import p311r1.C12020a;

/* renamed from: h1.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6880m extends AbstractC6861a<C10021n, Path> {

    /* renamed from: i */
    private final C10021n f19148i;

    /* renamed from: j */
    private final Path f19149j;

    /* renamed from: k */
    private List<InterfaceC6539s> f19150k;

    public C6880m(List<C12020a<C10021n>> list) {
        super(list);
        this.f19148i = new C10021n();
        this.f19149j = new Path();
    }

    @Override // p125h1.AbstractC6861a
    /* renamed from: p */
    public Path mo21711i(C12020a<C10021n> c12020a, float f) {
        this.f19148i.m12552c(c12020a.f31016b, c12020a.f31017c, f);
        C10021n c10021n = this.f19148i;
        List<InterfaceC6539s> list = this.f19150k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c10021n = this.f19150k.get(size).mo22427g(c10021n);
            }
        }
        C11679k.m7196h(c10021n, this.f19149j);
        return this.f19149j;
    }

    /* renamed from: q */
    public void m21731q(List<InterfaceC6539s> list) {
        this.f19150k = list;
    }
}