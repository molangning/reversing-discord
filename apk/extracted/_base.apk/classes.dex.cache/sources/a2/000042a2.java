package p223m1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;
import p073e1.C6059j0;
import p073e1.C6062k;
import p111g1.C6522d;
import p167j1.C8784e;
import p206l1.C10005a;
import p206l1.C10023p;
import p254o1.C10953j;

/* renamed from: m1.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10240g extends AbstractC10231b {

    /* renamed from: D */
    private final C6522d f26650D;

    /* renamed from: E */
    private final C10233c f26651E;

    public C10240g(C6059j0 c6059j0, C10236e c10236e, C10233c c10233c, C6062k c6062k) {
        super(c6059j0, c10236e);
        this.f26651E = c10233c;
        C6522d c6522d = new C6522d(c6059j0, this, new C10023p("__container", c10236e.m12070n(), false), c6062k);
        this.f26650D = c6522d;
        c6522d.mo12106b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // p223m1.AbstractC10231b
    /* renamed from: I */
    protected void mo12056I(C8784e c8784e, int i, List<C8784e> list, C8784e c8784e2) {
        this.f26650D.mo12105d(c8784e, i, list, c8784e2);
    }

    @Override // p223m1.AbstractC10231b, p111g1.InterfaceC6523e
    /* renamed from: e */
    public void mo12038e(RectF rectF, Matrix matrix, boolean z) {
        super.mo12038e(rectF, matrix, z);
        this.f26650D.mo12038e(rectF, this.f26583o, z);
    }

    @Override // p223m1.AbstractC10231b
    /* renamed from: u */
    void mo12034u(Canvas canvas, Matrix matrix, int i) {
        this.f26650D.mo12103h(canvas, matrix, i);
    }

    @Override // p223m1.AbstractC10231b
    /* renamed from: w */
    public C10005a mo12055w() {
        C10005a mo12055w = super.mo12055w();
        if (mo12055w != null) {
            return mo12055w;
        }
        return this.f26651E.mo12055w();
    }

    @Override // p223m1.AbstractC10231b
    /* renamed from: y */
    public C10953j mo12054y() {
        C10953j mo12054y = super.mo12054y();
        if (mo12054y != null) {
            return mo12054y;
        }
        return this.f26651E.mo12054y();
    }
}