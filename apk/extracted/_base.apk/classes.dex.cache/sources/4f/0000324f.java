package ee;

import com.otaliastudios.zoom.OverZoomRangeProvider;
import com.otaliastudios.zoom.ZoomEngine;
import com.otaliastudios.zoom.ZoomLogger;
import de.C5822b;
import gg.C6759j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001IB\u001d\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D¢\u0006\u0004\bG\u0010HJ\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\"\u0010 \u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u001fR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u001fR\"\u0010*\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b$\u0010\u0011\"\u0004\b+\u0010\u001fR\"\u0010.\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\"\u00105\u001a\u00020/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010;\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010>\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u00106\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R\u001a\u0010A\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\b?\u0010@\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010C\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\bB\u0010@\u001a\u0004\b!\u0010\u0011¨\u0006J"}, m14357d2 = {"Lee/c;", "Lee/a;", "", "realZoom", "n", "(F)F", "zoom", "u", "maxZoom", "", "type", "", "p", "(FI)V", "minZoom", "q", "i", "()F", "f", "value", "", "allowOverZoom", "b", "(FZ)F", "Lcom/otaliastudios/zoom/ZoomEngine;", "Lcom/otaliastudios/zoom/ZoomEngine;", "engine", "c", "F", "k", "t", "(F)V", "transformationZoom", "d", "h", "setMinZoom", "e", "I", "j", "()I", "setMinZoomMode", "(I)V", "minZoomMode", "setMaxZoom", "g", "setMaxZoomMode", "maxZoomMode", "Lcom/otaliastudios/zoom/OverZoomRangeProvider;", "Lcom/otaliastudios/zoom/OverZoomRangeProvider;", "getOverZoomRangeProvider$library_release", "()Lcom/otaliastudios/zoom/OverZoomRangeProvider;", "s", "(Lcom/otaliastudios/zoom/OverZoomRangeProvider;)V", "overZoomRangeProvider", "Z", "l", "()Z", "o", "(Z)V", "isEnabled", "m", "r", "isOverEnabled", "getMaxOverZoomIn$library_release$annotations", "()V", "maxOverZoomIn", "getMaxOverZoomOut$library_release$annotations", "maxOverZoomOut", "Lkotlin/Function0;", "Lde/b;", "provider", "<init>", "(Lcom/otaliastudios/zoom/ZoomEngine;Lkotlin/jvm/functions/Function0;)V", "a", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
/* renamed from: ee.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6211c extends AbstractC6207a {

    /* renamed from: k */
    public static final C6212a f17610k = new C6212a(null);

    /* renamed from: l */
    private static final String f17611l;

    /* renamed from: m */
    private static final ZoomLogger f17612m;

    /* renamed from: b */
    private final ZoomEngine f17613b;

    /* renamed from: c */
    private float f17614c;

    /* renamed from: d */
    private float f17615d;

    /* renamed from: e */
    private int f17616e;

    /* renamed from: f */
    private float f17617f;

    /* renamed from: g */
    private int f17618g;

    /* renamed from: h */
    private OverZoomRangeProvider f17619h;

    /* renamed from: i */
    private boolean f17620i;

    /* renamed from: j */
    private boolean f17621j;

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m14357d2 = {"Lee/c$a;", "", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: ee.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6212a {
        private C6212a() {
        }

        public /* synthetic */ C6212a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String TAG = C6211c.class.getSimpleName();
        f17611l = TAG;
        ZoomLogger.C5364a c5364a = ZoomLogger.f15197b;
        C9612q.m13918g(TAG, "TAG");
        f17612m = c5364a.m25354a(TAG);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6211c(ZoomEngine engine, Function0<C5822b> provider) {
        super(provider);
        C9612q.m13917h(engine, "engine");
        C9612q.m13917h(provider, "provider");
        this.f17613b = engine;
        this.f17615d = 0.8f;
        this.f17617f = 2.5f;
        this.f17619h = OverZoomRangeProvider.f15164b;
        this.f17620i = true;
        this.f17621j = true;
    }

    /* renamed from: b */
    public final float m23255b(float f, boolean z) {
        float m21924i;
        float m23248i = m23248i();
        float m23251f = m23251f();
        if (z && m23244m()) {
            m23248i -= m23253d();
            m23251f += m23254c();
        }
        if (m23251f < m23248i) {
            int i = this.f17618g;
            if (i != this.f17616e) {
                if (i == 0) {
                    m23248i = m23251f;
                } else {
                    m23251f = m23248i;
                }
            } else {
                throw new IllegalStateException("maxZoom is less than minZoom: " + m23251f + " < " + m23248i);
            }
        }
        m21924i = C6759j.m21924i(f, m23248i, m23251f);
        return m21924i;
    }

    /* renamed from: c */
    public final float m23254c() {
        float m21931b;
        float mo25461a = this.f17619h.mo25461a(this.f17613b, true);
        if (mo25461a < 0.0f) {
            f17612m.m25356g("Received negative maxOverZoomIn value, coercing to 0");
            m21931b = C6759j.m21931b(mo25461a, 0.0f);
            return m21931b;
        }
        return mo25461a;
    }

    /* renamed from: d */
    public final float m23253d() {
        float m21931b;
        float mo25461a = this.f17619h.mo25461a(this.f17613b, false);
        if (mo25461a < 0.0f) {
            f17612m.m25356g("Received negative maxOverZoomOut value, coercing to 0");
            m21931b = C6759j.m21931b(mo25461a, 0.0f);
            return m21931b;
        }
        return mo25461a;
    }

    /* renamed from: e */
    public final float m23252e() {
        return this.f17617f;
    }

    /* renamed from: f */
    public final float m23251f() {
        int i = this.f17618g;
        if (i != 0) {
            if (i == 1) {
                return this.f17617f;
            }
            throw new IllegalArgumentException(C9612q.m13909p("Unknown ZoomType ", Integer.valueOf(this.f17618g)));
        }
        return m23236u(this.f17617f);
    }

    /* renamed from: g */
    public final int m23250g() {
        return this.f17618g;
    }

    /* renamed from: h */
    public final float m23249h() {
        return this.f17615d;
    }

    /* renamed from: i */
    public final float m23248i() {
        int i = this.f17616e;
        if (i != 0) {
            if (i == 1) {
                return this.f17615d;
            }
            throw new IllegalArgumentException(C9612q.m13909p("Unknown ZoomType ", Integer.valueOf(this.f17616e)));
        }
        return m23236u(this.f17615d);
    }

    /* renamed from: j */
    public final int m23247j() {
        return this.f17616e;
    }

    /* renamed from: k */
    public final float m23246k() {
        return this.f17614c;
    }

    /* renamed from: l */
    public boolean m23245l() {
        return this.f17620i;
    }

    /* renamed from: m */
    public boolean m23244m() {
        return this.f17621j;
    }

    /* renamed from: n */
    public final float m23243n(float f) {
        return f / this.f17614c;
    }

    /* renamed from: o */
    public void m23242o(boolean z) {
        this.f17620i = z;
    }

    /* renamed from: p */
    public final void m23241p(float f, int i) {
        if (f >= 0.0f) {
            this.f17617f = f;
            this.f17618g = i;
            return;
        }
        throw new IllegalArgumentException("Max zoom should be >= 0.");
    }

    /* renamed from: q */
    public final void m23240q(float f, int i) {
        if (f >= 0.0f) {
            this.f17615d = f;
            this.f17616e = i;
            return;
        }
        throw new IllegalArgumentException("Min zoom should be >= 0");
    }

    /* renamed from: r */
    public void m23239r(boolean z) {
        this.f17621j = z;
    }

    /* renamed from: s */
    public final void m23238s(OverZoomRangeProvider overZoomRangeProvider) {
        C9612q.m13917h(overZoomRangeProvider, "<set-?>");
        this.f17619h = overZoomRangeProvider;
    }

    /* renamed from: t */
    public final void m23237t(float f) {
        this.f17614c = f;
    }

    /* renamed from: u */
    public final float m23236u(float f) {
        return f * this.f17614c;
    }
}