package ee;

import android.annotation.SuppressLint;
import com.otaliastudios.zoom.C5365a;
import com.otaliastudios.zoom.OverPanRangeProvider;
import com.otaliastudios.zoom.ScaledPoint;
import com.otaliastudios.zoom.ZoomEngine;
import com.otaliastudios.zoom.ZoomLogger;
import de.C5822b;
import gg.C6759j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ?2\u00020\u0001:\u0002G\u0010B\u001d\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\f\u0010D\u001a\b\u0012\u0004\u0012\u00020C0B¢\u0006\u0004\bE\u0010FJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001d\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010!\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019R\"\u0010%\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0017\"\u0004\b$\u0010\u0019R\"\u0010*\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010&\u001a\u0004\b\u001e\u0010'\"\u0004\b(\u0010)R\"\u00101\u001a\u00020+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00106\u001a\u0002028@X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b\"\u00105R\u0014\u00108\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0017R\u0014\u0010:\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0017R\u001a\u0010>\u001a\u00020\n8@X\u0080\u0004¢\u0006\f\u0012\u0004\b<\u0010=\u001a\u0004\b3\u0010;R\u001a\u0010A\u001a\u00020\n8@X\u0080\u0004¢\u0006\f\u0012\u0004\b@\u0010=\u001a\u0004\b?\u0010;¨\u0006H"}, m14357d2 = {"Lee/b;", "Lee/a;", "", "horizontal", "Lee/b$b;", "output", "", "d", "(ZLee/b$b;)V", "allowOverScroll", "", "c", "(ZZ)F", "", "gravity", "extraSpace", "b", "(IFZ)F", "Lcom/otaliastudios/zoom/ZoomEngine;", "Lcom/otaliastudios/zoom/ZoomEngine;", "engine", "Z", "g", "()Z", "p", "(Z)V", "horizontalOverPanEnabled", "k", "s", "verticalOverPanEnabled", "e", "h", "q", "horizontalPanEnabled", "f", "l", "t", "verticalPanEnabled", "I", "()I", "o", "(I)V", "alignment", "Lcom/otaliastudios/zoom/OverPanRangeProvider;", "Lcom/otaliastudios/zoom/OverPanRangeProvider;", "getOverPanRangeProvider$library_release", "()Lcom/otaliastudios/zoom/OverPanRangeProvider;", "r", "(Lcom/otaliastudios/zoom/OverPanRangeProvider;)V", "overPanRangeProvider", "Lcom/otaliastudios/zoom/ScaledPoint;", "i", "Lcom/otaliastudios/zoom/ScaledPoint;", "()Lcom/otaliastudios/zoom/ScaledPoint;", "correction", "n", "isOverEnabled", "m", "isEnabled", "()F", "getMaxHorizontalOverPan$library_release$annotations", "()V", "maxHorizontalOverPan", "j", "getMaxVerticalOverPan$library_release$annotations", "maxVerticalOverPan", "Lkotlin/Function0;", "Lde/b;", "provider", "<init>", "(Lcom/otaliastudios/zoom/ZoomEngine;Lkotlin/jvm/functions/Function0;)V", "a", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
/* renamed from: ee.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6208b extends AbstractC6207a {

    /* renamed from: j */
    public static final C6209a f17595j = new C6209a(null);

    /* renamed from: k */
    private static final String f17596k;

    /* renamed from: l */
    private static final ZoomLogger f17597l;

    /* renamed from: b */
    private final ZoomEngine f17598b;

    /* renamed from: c */
    private boolean f17599c;

    /* renamed from: d */
    private boolean f17600d;

    /* renamed from: e */
    private boolean f17601e;

    /* renamed from: f */
    private boolean f17602f;

    /* renamed from: g */
    private int f17603g;

    /* renamed from: h */
    private OverPanRangeProvider f17604h;

    /* renamed from: i */
    private final ScaledPoint f17605i;

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m14357d2 = {"Lee/b$a;", "", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: ee.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6209a {
        private C6209a() {
        }

        public /* synthetic */ C6209a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\nR(\u0010\u000b\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u000f\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\n\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\r\u0010\bR(\u0010\u0012\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0004\u0012\u0004\b\u0011\u0010\n\u001a\u0004\b\f\u0010\u0006\"\u0004\b\u0010\u0010\bR\"\u0010\u0019\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m14357d2 = {"Lee/b$b;", "", "", "a", "I", "c", "()I", "h", "(I)V", "getMinValue$library_release$annotations", "()V", "minValue", "b", "e", "getCurrentValue$library_release$annotations", "currentValue", "g", "getMaxValue$library_release$annotations", "maxValue", "", "d", "Z", "()Z", "f", "(Z)V", "isInOverPan", "<init>", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: ee.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6210b {

        /* renamed from: a */
        private int f17606a;

        /* renamed from: b */
        private int f17607b;

        /* renamed from: c */
        private int f17608c;

        /* renamed from: d */
        private boolean f17609d;

        /* renamed from: a */
        public final int m23263a() {
            return this.f17607b;
        }

        /* renamed from: b */
        public final int m23262b() {
            return this.f17608c;
        }

        /* renamed from: c */
        public final int m23261c() {
            return this.f17606a;
        }

        /* renamed from: d */
        public final boolean m23260d() {
            return this.f17609d;
        }

        /* renamed from: e */
        public final void m23259e(int i) {
            this.f17607b = i;
        }

        /* renamed from: f */
        public final void m23258f(boolean z) {
            this.f17609d = z;
        }

        /* renamed from: g */
        public final void m23257g(int i) {
            this.f17608c = i;
        }

        /* renamed from: h */
        public final void m23256h(int i) {
            this.f17606a = i;
        }
    }

    static {
        String TAG = C6208b.class.getSimpleName();
        f17596k = TAG;
        ZoomLogger.C5364a c5364a = ZoomLogger.f15197b;
        C9612q.m13918g(TAG, "TAG");
        f17597l = c5364a.m25354a(TAG);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6208b(ZoomEngine engine, Function0<C5822b> provider) {
        super(provider);
        C9612q.m13917h(engine, "engine");
        C9612q.m13917h(provider, "provider");
        this.f17598b = engine;
        this.f17599c = true;
        this.f17600d = true;
        this.f17601e = true;
        this.f17602f = true;
        this.f17603g = 51;
        this.f17604h = OverPanRangeProvider.f15160b;
        this.f17605i = new ScaledPoint(0.0f, 0.0f, 3, null);
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: b */
    public final float m23282b(int i, float f, boolean z) {
        int i2 = z ? i & 7 : i & 112;
        if (i2 != 1) {
            if (i2 != 3) {
                if (i2 == 5) {
                    return f;
                }
                if (i2 != 16) {
                    if (i2 != 48 && i2 == 80) {
                        return f;
                    }
                }
            }
            return 0.0f;
        }
        return f * 0.5f;
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: c */
    public final float m23281c(boolean z, boolean z2) {
        float m24423x;
        float m24435l;
        float m24432o;
        boolean z3;
        float f;
        int m25349e;
        float f2;
        float m21924i;
        C5822b m23283a = m23283a();
        if (z) {
            m24423x = m23283a.m24424w();
        } else {
            m24423x = m23283a.m24423x();
        }
        C5822b m23283a2 = m23283a();
        if (z) {
            m24435l = m23283a2.m24434m();
        } else {
            m24435l = m23283a2.m24435l();
        }
        C5822b m23283a3 = m23283a();
        if (z) {
            m24432o = m23283a3.m24431p();
        } else {
            m24432o = m23283a3.m24432o();
        }
        if (z) {
            z3 = this.f17599c;
        } else {
            z3 = this.f17600d;
        }
        float f3 = 0.0f;
        if (z3 && z2) {
            if (z) {
                f = m23275i();
            } else {
                f = m23274j();
            }
        } else {
            f = 0.0f;
        }
        if (z) {
            m25349e = C5365a.f15202a.m25350d(this.f17603g, 0);
        } else {
            m25349e = C5365a.f15202a.m25349e(this.f17603g, 0);
        }
        if (m24432o <= m24435l) {
            f2 = m24435l - m24432o;
            if (m25349e != 0) {
                f3 = m23282b(m25349e, f2, z);
                f2 = f3;
            }
        } else {
            f3 = m24435l - m24432o;
            f2 = 0.0f;
        }
        m21924i = C6759j.m21924i(m24423x, f3 - f, f2 + f);
        return m21924i - m24423x;
    }

    /* renamed from: d */
    public final void m23280d(boolean z, C6210b output) {
        float m24423x;
        float m24435l;
        float m24432o;
        int m25352b;
        C9612q.m13917h(output, "output");
        C5822b m23283a = m23283a();
        if (z) {
            m24423x = m23283a.m24424w();
        } else {
            m24423x = m23283a.m24423x();
        }
        int i = (int) m24423x;
        C5822b m23283a2 = m23283a();
        if (z) {
            m24435l = m23283a2.m24434m();
        } else {
            m24435l = m23283a2.m24435l();
        }
        int i2 = (int) m24435l;
        C5822b m23283a3 = m23283a();
        if (z) {
            m24432o = m23283a3.m24431p();
        } else {
            m24432o = m23283a3.m24432o();
        }
        int i3 = (int) m24432o;
        boolean z2 = false;
        int m23281c = (int) m23281c(z, false);
        if (z) {
            m25352b = C5365a.f15202a.m25353a(this.f17603g);
        } else {
            m25352b = C5365a.f15202a.m25352b(this.f17603g);
        }
        if (i3 > i2) {
            output.m23256h(-(i3 - i2));
            output.m23257g(0);
        } else if (C5365a.f15202a.m25351c(m25352b)) {
            output.m23256h(0);
            output.m23257g(i2 - i3);
        } else {
            int i4 = i + m23281c;
            output.m23256h(i4);
            output.m23257g(i4);
        }
        output.m23259e(i);
        if (m23281c != 0) {
            z2 = true;
        }
        output.m23258f(z2);
    }

    /* renamed from: e */
    public final int m23279e() {
        return this.f17603g;
    }

    /* renamed from: f */
    public final ScaledPoint m23278f() {
        this.f17605i.m25454g(Float.valueOf(m23281c(true, false)), Float.valueOf(m23281c(false, false)));
        return this.f17605i;
    }

    /* renamed from: g */
    public final boolean m23277g() {
        return this.f17599c;
    }

    /* renamed from: h */
    public final boolean m23276h() {
        return this.f17601e;
    }

    /* renamed from: i */
    public final float m23275i() {
        float m21931b;
        float mo25462a = this.f17604h.mo25462a(this.f17598b, true);
        if (mo25462a < 0.0f) {
            f17597l.m25356g("Received negative maxHorizontalOverPan value, coercing to 0");
            m21931b = C6759j.m21931b(mo25462a, 0.0f);
            return m21931b;
        }
        return mo25462a;
    }

    /* renamed from: j */
    public final float m23274j() {
        float m21931b;
        float mo25462a = this.f17604h.mo25462a(this.f17598b, false);
        if (mo25462a < 0.0f) {
            f17597l.m25356g("Received negative maxVerticalOverPan value, coercing to 0");
            m21931b = C6759j.m21931b(mo25462a, 0.0f);
            return m21931b;
        }
        return mo25462a;
    }

    /* renamed from: k */
    public final boolean m23273k() {
        return this.f17600d;
    }

    /* renamed from: l */
    public final boolean m23272l() {
        return this.f17602f;
    }

    /* renamed from: m */
    public boolean m23271m() {
        return this.f17601e || this.f17602f;
    }

    /* renamed from: n */
    public boolean m23270n() {
        return this.f17599c || this.f17600d;
    }

    /* renamed from: o */
    public final void m23269o(int i) {
        this.f17603g = i;
    }

    /* renamed from: p */
    public final void m23268p(boolean z) {
        this.f17599c = z;
    }

    /* renamed from: q */
    public final void m23267q(boolean z) {
        this.f17601e = z;
    }

    /* renamed from: r */
    public final void m23266r(OverPanRangeProvider overPanRangeProvider) {
        C9612q.m13917h(overPanRangeProvider, "<set-?>");
        this.f17604h = overPanRangeProvider;
    }

    /* renamed from: s */
    public final void m23265s(boolean z) {
        this.f17600d = z;
    }

    /* renamed from: t */
    public final void m23264t(boolean z) {
        this.f17602f = z;
    }
}
