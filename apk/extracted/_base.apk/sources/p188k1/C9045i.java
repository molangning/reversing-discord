package p188k1;

import android.graphics.PointF;
import java.util.List;
import p125h1.AbstractC6861a;
import p125h1.C6881n;
import p311r1.C12020a;

/* renamed from: k1.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C9045i implements InterfaceC9049m<PointF, PointF> {

    /* renamed from: a */
    private final C9038b f23699a;

    /* renamed from: b */
    private final C9038b f23700b;

    public C9045i(C9038b c9038b, C9038b c9038b2) {
        this.f23699a = c9038b;
        this.f23700b = c9038b2;
    }

    @Override // p188k1.InterfaceC9049m
    /* renamed from: a */
    public AbstractC6861a<PointF, PointF> mo16817a() {
        return new C6881n(this.f23699a.mo16817a(), this.f23700b.mo16817a());
    }

    @Override // p188k1.InterfaceC9049m
    /* renamed from: b */
    public List<C12020a<PointF>> mo16816b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p188k1.InterfaceC9049m
    /* renamed from: g */
    public boolean mo16815g() {
        return this.f23699a.mo16815g() && this.f23700b.mo16815g();
    }
}
