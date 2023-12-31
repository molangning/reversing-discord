package de;

import com.otaliastudios.zoom.AbsolutePoint;
import com.otaliastudios.zoom.ScaledPoint;
import com.otaliastudios.zoom.ZoomLogger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0002\u0003\tBa\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u001f\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u0003\u0010\fR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b \u0010\"R\u001a\u0010%\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0017\u0010\fR\u001a\u0010&\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0014\u0010'\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\f¨\u0006*"}, m14357d2 = {"Lde/c;", "", "", "a", "F", "j", "()F", "zoom", "", "b", "Z", "l", "()Z", "isZoomRelative", "c", "canOverZoom", "Lcom/otaliastudios/zoom/AbsolutePoint;", "d", "Lcom/otaliastudios/zoom/AbsolutePoint;", "f", "()Lcom/otaliastudios/zoom/AbsolutePoint;", "pan", "Lcom/otaliastudios/zoom/ScaledPoint;", "e", "Lcom/otaliastudios/zoom/ScaledPoint;", "i", "()Lcom/otaliastudios/zoom/ScaledPoint;", "scaledPan", "k", "isPanRelative", "g", "canOverPan", "h", "Ljava/lang/Float;", "()Ljava/lang/Float;", "pivotX", "pivotY", "notify", "hasPan", "hasZoom", "<init>", "(FZZLcom/otaliastudios/zoom/AbsolutePoint;Lcom/otaliastudios/zoom/ScaledPoint;ZZLjava/lang/Float;Ljava/lang/Float;Z)V", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
/* renamed from: de.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5827c {

    /* renamed from: l */
    public static final C5829b f16683l = new C5829b(null);

    /* renamed from: m */
    private static final String f16684m;

    /* renamed from: n */
    private static final ZoomLogger f16685n;

    /* renamed from: a */
    private final float f16686a;

    /* renamed from: b */
    private final boolean f16687b;

    /* renamed from: c */
    private final boolean f16688c;

    /* renamed from: d */
    private final AbsolutePoint f16689d;

    /* renamed from: e */
    private final ScaledPoint f16690e;

    /* renamed from: f */
    private final boolean f16691f;

    /* renamed from: g */
    private final boolean f16692g;

    /* renamed from: h */
    private final Float f16693h;

    /* renamed from: i */
    private final Float f16694i;

    /* renamed from: j */
    private final boolean f16695j;

    /* renamed from: k */
    private final boolean f16696k;

    @Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u0010#J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\rJ!\u0010\u0011\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0012J#\u0010\u0016\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001cR(\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u001c\u0012\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\"\u0010\u000b\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010+R\"\u0010.\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010\u001f\"\u0004\b(\u0010!¨\u00060"}, m14357d2 = {"Lde/c$a;", "", "", "zoom", "", "overZoom", "", "i", "(FZ)V", "Lcom/otaliastudios/zoom/AbsolutePoint;", "delta", "overPan", "b", "(Lcom/otaliastudios/zoom/AbsolutePoint;Z)V", "pan", "d", "Lcom/otaliastudios/zoom/ScaledPoint;", "c", "(Lcom/otaliastudios/zoom/ScaledPoint;Z)V", "e", "pivotX", "pivotY", "f", "(Ljava/lang/Float;Ljava/lang/Float;)V", "Lde/c;", "a", "()Lde/c;", "F", "Z", "zoomRelative", "getOverZoom$library_release", "()Z", "setOverZoom$library_release", "(Z)V", "getOverZoom$library_release$annotations", "()V", "Lcom/otaliastudios/zoom/AbsolutePoint;", "Lcom/otaliastudios/zoom/ScaledPoint;", "scaledPan", "panRelative", "g", "getOverPan$library_release", "h", "Ljava/lang/Float;", "j", "getNotify$library_release", "notify", "<init>", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: de.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5828a {

        /* renamed from: b */
        private boolean f16698b;

        /* renamed from: c */
        private boolean f16699c;

        /* renamed from: d */
        private AbsolutePoint f16700d;

        /* renamed from: e */
        private ScaledPoint f16701e;

        /* renamed from: f */
        private boolean f16702f;

        /* renamed from: g */
        private boolean f16703g;

        /* renamed from: h */
        private Float f16704h;

        /* renamed from: i */
        private Float f16705i;

        /* renamed from: a */
        private float f16697a = Float.NaN;

        /* renamed from: j */
        private boolean f16706j = true;

        /* renamed from: a */
        public final C5827c m24402a() {
            return new C5827c(this.f16697a, this.f16698b, this.f16699c, this.f16700d, this.f16701e, this.f16702f, this.f16703g, this.f16704h, this.f16705i, this.f16706j, null);
        }

        /* renamed from: b */
        public final void m24401b(AbsolutePoint absolutePoint, boolean z) {
            this.f16701e = null;
            this.f16700d = absolutePoint;
            this.f16702f = true;
            this.f16703g = z;
        }

        /* renamed from: c */
        public final void m24400c(ScaledPoint scaledPoint, boolean z) {
            this.f16701e = scaledPoint;
            this.f16700d = null;
            this.f16702f = true;
            this.f16703g = z;
        }

        /* renamed from: d */
        public final void m24399d(AbsolutePoint absolutePoint, boolean z) {
            this.f16701e = null;
            this.f16700d = absolutePoint;
            this.f16702f = false;
            this.f16703g = z;
        }

        /* renamed from: e */
        public final void m24398e(ScaledPoint scaledPoint, boolean z) {
            this.f16701e = scaledPoint;
            this.f16700d = null;
            this.f16702f = false;
            this.f16703g = z;
        }

        /* renamed from: f */
        public final void m24397f(Float f, Float f2) {
            this.f16704h = f;
            this.f16705i = f2;
        }

        /* renamed from: g */
        public final void m24396g(boolean z) {
            this.f16706j = z;
        }

        /* renamed from: h */
        public final void m24395h(boolean z) {
            this.f16703g = z;
        }

        /* renamed from: i */
        public final void m24394i(float f, boolean z) {
            this.f16697a = f;
            this.f16698b = false;
            this.f16699c = z;
        }
    }

    @Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\rJ#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m14357d2 = {"Lde/c$b;", "", "Lkotlin/Function1;", "Lde/c$a;", "", "builder", "Lde/c;", "a", "(Lkotlin/jvm/functions/Function1;)Lde/c;", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "getLOG$annotations", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: de.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5829b {
        private C5829b() {
        }

        public /* synthetic */ C5829b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C5827c m24393a(Function1<? super C5828a, Unit> builder) {
            C9612q.m13917h(builder, "builder");
            C5828a c5828a = new C5828a();
            builder.invoke(c5828a);
            return c5828a.m24402a();
        }
    }

    static {
        String TAG = C5827c.class.getSimpleName();
        f16684m = TAG;
        ZoomLogger.C5364a c5364a = ZoomLogger.f15197b;
        C9612q.m13918g(TAG, "TAG");
        f16685n = c5364a.m25354a(TAG);
    }

    private C5827c(float f, boolean z, boolean z2, AbsolutePoint absolutePoint, ScaledPoint scaledPoint, boolean z3, boolean z4, Float f2, Float f3, boolean z5) {
        this.f16686a = f;
        this.f16687b = z;
        this.f16688c = z2;
        this.f16689d = absolutePoint;
        this.f16690e = scaledPoint;
        this.f16691f = z3;
        this.f16692g = z4;
        this.f16693h = f2;
        this.f16694i = f3;
        this.f16695j = z5;
        if (absolutePoint != null && scaledPoint != null) {
            throw new IllegalStateException("Can only use either pan or scaledPan");
        }
        this.f16696k = (absolutePoint == null && scaledPoint == null) ? false : true;
    }

    public /* synthetic */ C5827c(float f, boolean z, boolean z2, AbsolutePoint absolutePoint, ScaledPoint scaledPoint, boolean z3, boolean z4, Float f2, Float f3, boolean z5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, z, z2, absolutePoint, scaledPoint, z3, z4, f2, f3, z5);
    }

    /* renamed from: a */
    public final boolean m24414a() {
        return this.f16692g;
    }

    /* renamed from: b */
    public final boolean m24413b() {
        return this.f16688c;
    }

    /* renamed from: c */
    public final boolean m24412c() {
        return this.f16696k;
    }

    /* renamed from: d */
    public final boolean m24411d() {
        return !Float.isNaN(this.f16686a);
    }

    /* renamed from: e */
    public final boolean m24410e() {
        return this.f16695j;
    }

    /* renamed from: f */
    public final AbsolutePoint m24409f() {
        return this.f16689d;
    }

    /* renamed from: g */
    public final Float m24408g() {
        return this.f16693h;
    }

    /* renamed from: h */
    public final Float m24407h() {
        return this.f16694i;
    }

    /* renamed from: i */
    public final ScaledPoint m24406i() {
        return this.f16690e;
    }

    /* renamed from: j */
    public final float m24405j() {
        return this.f16686a;
    }

    /* renamed from: k */
    public final boolean m24404k() {
        return this.f16691f;
    }

    /* renamed from: l */
    public final boolean m24403l() {
        return this.f16687b;
    }
}