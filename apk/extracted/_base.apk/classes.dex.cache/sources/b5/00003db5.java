package p188k1;

import android.graphics.PointF;
import java.util.List;
import p125h1.AbstractC6861a;
import p125h1.C6877j;
import p125h1.C6878k;
import p311r1.C12020a;

/* renamed from: k1.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C9041e implements InterfaceC9049m<PointF, PointF> {

    /* renamed from: a */
    private final List<C12020a<PointF>> f23698a;

    public C9041e(List<C12020a<PointF>> list) {
        this.f23698a = list;
    }

    @Override // p188k1.InterfaceC9049m
    /* renamed from: a */
    public AbstractC6861a<PointF, PointF> mo16817a() {
        if (this.f23698a.get(0).m6577i()) {
            return new C6878k(this.f23698a);
        }
        return new C6877j(this.f23698a);
    }

    @Override // p188k1.InterfaceC9049m
    /* renamed from: b */
    public List<C12020a<PointF>> mo16816b() {
        return this.f23698a;
    }

    @Override // p188k1.InterfaceC9049m
    /* renamed from: g */
    public boolean mo16815g() {
        return this.f23698a.size() == 1 && this.f23698a.get(0).m6577i();
    }
}