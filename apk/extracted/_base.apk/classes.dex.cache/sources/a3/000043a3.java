package p240n3;

import android.graphics.Rect;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.drawee.backends.pipeline.C3587a;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p056d3.InterfaceC5739b;
import p256o3.C10978a;
import p256o3.C10980b;
import p256o3.C10981c;
import p380v4.AbstractC13063c;
import p394w2.C13382m;
import p416x4.C13688c;

/* renamed from: n3.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10497g implements InterfaceC10498h {

    /* renamed from: a */
    private final C3587a f27409a;

    /* renamed from: b */
    private final InterfaceC5739b f27410b;

    /* renamed from: c */
    private final C10499i f27411c = new C10499i();

    /* renamed from: d */
    private final Supplier<Boolean> f27412d;

    /* renamed from: e */
    private C10493c f27413e;

    /* renamed from: f */
    private InterfaceC10492b f27414f;

    /* renamed from: g */
    private C10981c f27415g;

    /* renamed from: h */
    private C10978a f27416h;

    /* renamed from: i */
    private C13688c f27417i;

    /* renamed from: j */
    private List<InterfaceC10496f> f27418j;

    /* renamed from: k */
    private boolean f27419k;

    public C10497g(InterfaceC5739b interfaceC5739b, C3587a c3587a, Supplier<Boolean> supplier) {
        this.f27410b = interfaceC5739b;
        this.f27409a = c3587a;
        this.f27412d = supplier;
    }

    /* renamed from: h */
    private void m11387h() {
        if (this.f27416h == null) {
            this.f27416h = new C10978a(this.f27410b, this.f27411c, this, this.f27412d, C13382m.f34465b);
        }
        if (this.f27415g == null) {
            this.f27415g = new C10981c(this.f27410b, this.f27411c);
        }
        if (this.f27414f == null) {
            this.f27414f = new C10980b(this.f27411c, this);
        }
        C10493c c10493c = this.f27413e;
        if (c10493c == null) {
            this.f27413e = new C10493c(this.f27409a.m31550v(), this.f27414f);
        } else {
            c10493c.m11397a(this.f27409a.m31550v());
        }
        if (this.f27417i == null) {
            this.f27417i = new C13688c(this.f27415g, this.f27413e);
        }
    }

    @Override // p240n3.InterfaceC10498h
    /* renamed from: a */
    public void mo11385a(C10499i c10499i, int i) {
        List<InterfaceC10496f> list;
        c10499i.m11367o(i);
        if (this.f27419k && (list = this.f27418j) != null && !list.isEmpty()) {
            if (i == 3) {
                m11391d();
            }
            C10495e m11382B = c10499i.m11382B();
            for (InterfaceC10496f interfaceC10496f : this.f27418j) {
                interfaceC10496f.m11394a(m11382B, i);
            }
        }
    }

    @Override // p240n3.InterfaceC10498h
    /* renamed from: b */
    public void mo11384b(C10499i c10499i, int i) {
        List<InterfaceC10496f> list;
        if (this.f27419k && (list = this.f27418j) != null && !list.isEmpty()) {
            C10495e m11382B = c10499i.m11382B();
            for (InterfaceC10496f interfaceC10496f : this.f27418j) {
                interfaceC10496f.m11393b(m11382B, i);
            }
        }
    }

    /* renamed from: c */
    public void m11392c(InterfaceC10496f interfaceC10496f) {
        if (interfaceC10496f == null) {
            return;
        }
        if (this.f27418j == null) {
            this.f27418j = new CopyOnWriteArrayList();
        }
        this.f27418j.add(interfaceC10496f);
    }

    /* renamed from: d */
    public void m11391d() {
        DraweeHierarchy mo31385f = this.f27409a.mo31385f();
        if (mo31385f != null && mo31385f.mo31384d() != null) {
            Rect bounds = mo31385f.mo31384d().getBounds();
            this.f27411c.m11360v(bounds.width());
            this.f27411c.m11361u(bounds.height());
        }
    }

    /* renamed from: e */
    public void m11390e() {
        List<InterfaceC10496f> list = this.f27418j;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: f */
    public void m11389f() {
        m11390e();
        m11388g(false);
        this.f27411c.m11380b();
    }

    /* renamed from: g */
    public void m11388g(boolean z) {
        this.f27419k = z;
        if (z) {
            m11387h();
            InterfaceC10492b interfaceC10492b = this.f27414f;
            if (interfaceC10492b != null) {
                this.f27409a.m31649f0(interfaceC10492b);
            }
            C10978a c10978a = this.f27416h;
            if (c10978a != null) {
                this.f27409a.m31561k(c10978a);
            }
            C13688c c13688c = this.f27417i;
            if (c13688c != null) {
                this.f27409a.m31648g0(c13688c);
                return;
            }
            return;
        }
        InterfaceC10492b interfaceC10492b2 = this.f27414f;
        if (interfaceC10492b2 != null) {
            this.f27409a.m31633v0(interfaceC10492b2);
        }
        C10978a c10978a2 = this.f27416h;
        if (c10978a2 != null) {
            this.f27409a.m31580Q(c10978a2);
        }
        C13688c c13688c2 = this.f27417i;
        if (c13688c2 != null) {
            this.f27409a.m31632w0(c13688c2);
        }
    }

    /* renamed from: i */
    public void m11386i(AbstractDraweeControllerBuilder<PipelineDraweeControllerBuilder, ImageRequest, CloseableReference<AbstractC13063c>, ImageInfo> abstractDraweeControllerBuilder) {
        this.f27411c.m11373i(abstractDraweeControllerBuilder.m31610n(), abstractDraweeControllerBuilder.m31609o(), abstractDraweeControllerBuilder.m31611m());
    }
}