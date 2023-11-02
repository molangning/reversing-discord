package p436y3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import p005a4.InterfaceC0019a;
import p005a4.InterfaceC0020b;
import p414x2.C13677a;
import p415x3.C13682c;
import p415x3.InterfaceC13680a;
import p415x3.InterfaceC13685d;

/* renamed from: y3.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13871a implements InterfaceC13680a, C13682c.InterfaceC13684b {

    /* renamed from: l */
    private static final Class<?> f35700l = C13871a.class;

    /* renamed from: a */
    private final PlatformBitmapFactory f35701a;

    /* renamed from: b */
    private final InterfaceC13872b f35702b;

    /* renamed from: c */
    private final InterfaceC13685d f35703c;

    /* renamed from: d */
    private final InterfaceC13873c f35704d;

    /* renamed from: e */
    private final InterfaceC0019a f35705e;

    /* renamed from: f */
    private final InterfaceC0020b f35706f;

    /* renamed from: h */
    private Rect f35708h;

    /* renamed from: i */
    private int f35709i;

    /* renamed from: j */
    private int f35710j;

    /* renamed from: k */
    private Bitmap.Config f35711k = Bitmap.Config.ARGB_8888;

    /* renamed from: g */
    private final Paint f35707g = new Paint(6);

    public C13871a(PlatformBitmapFactory platformBitmapFactory, InterfaceC13872b interfaceC13872b, InterfaceC13685d interfaceC13685d, InterfaceC13873c interfaceC13873c, InterfaceC0019a interfaceC0019a, InterfaceC0020b interfaceC0020b) {
        this.f35701a = platformBitmapFactory;
        this.f35702b = interfaceC13872b;
        this.f35703c = interfaceC13685d;
        this.f35704d = interfaceC13873c;
        this.f35705e = interfaceC0019a;
        this.f35706f = interfaceC0020b;
        m1334n();
    }

    /* renamed from: k */
    private boolean m1337k(int i, CloseableReference<Bitmap> closeableReference, Canvas canvas, int i2) {
        if (!CloseableReference.m31727Q(closeableReference)) {
            return false;
        }
        if (this.f35708h == null) {
            canvas.drawBitmap(closeableReference.m31730D(), 0.0f, 0.0f, this.f35707g);
        } else {
            canvas.drawBitmap(closeableReference.m31730D(), (Rect) null, this.f35708h, this.f35707g);
        }
        if (i2 != 3) {
            this.f35702b.mo706b(i, closeableReference, i2);
            return true;
        }
        return true;
    }

    /* renamed from: l */
    private boolean m1336l(Canvas canvas, int i, int i2) {
        CloseableReference<Bitmap> mo703e;
        boolean m1337k;
        boolean z = false;
        int i3 = 1;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            return false;
                        }
                        mo703e = this.f35702b.mo705c(i);
                        m1337k = m1337k(i, mo703e, canvas, 3);
                        i3 = -1;
                    } else {
                        mo703e = this.f35701a.m31202b(this.f35709i, this.f35710j, this.f35711k);
                        if (m1335m(i, mo703e) && m1337k(i, mo703e, canvas, 2)) {
                            z = true;
                        }
                        m1337k = z;
                        i3 = 3;
                    }
                } else {
                    mo703e = this.f35702b.mo704d(i, this.f35709i, this.f35710j);
                    if (m1335m(i, mo703e) && m1337k(i, mo703e, canvas, 1)) {
                        z = true;
                    }
                    m1337k = z;
                    i3 = 2;
                }
            } else {
                mo703e = this.f35702b.mo703e(i);
                m1337k = m1337k(i, mo703e, canvas, 0);
            }
            CloseableReference.m31715v(mo703e);
            if (!m1337k && i3 != -1) {
                return m1336l(canvas, i, i3);
            }
            return m1337k;
        } catch (RuntimeException e) {
            C13677a.m1873E(f35700l, "Failed to create frame bitmap", e);
            return false;
        } finally {
            CloseableReference.m31715v(null);
        }
    }

    /* renamed from: m */
    private boolean m1335m(int i, CloseableReference<Bitmap> closeableReference) {
        if (!CloseableReference.m31727Q(closeableReference)) {
            return false;
        }
        boolean mo1333a = this.f35704d.mo1333a(i, closeableReference.m31730D());
        if (!mo1333a) {
            CloseableReference.m31715v(closeableReference);
        }
        return mo1333a;
    }

    /* renamed from: n */
    private void m1334n() {
        int width;
        int mo1330e = this.f35704d.mo1330e();
        this.f35709i = mo1330e;
        int i = -1;
        if (mo1330e == -1) {
            Rect rect = this.f35708h;
            if (rect == null) {
                width = -1;
            } else {
                width = rect.width();
            }
            this.f35709i = width;
        }
        int mo1332c = this.f35704d.mo1332c();
        this.f35710j = mo1332c;
        if (mo1332c == -1) {
            Rect rect2 = this.f35708h;
            if (rect2 != null) {
                i = rect2.height();
            }
            this.f35710j = i;
        }
    }

    @Override // p415x3.InterfaceC13685d
    /* renamed from: a */
    public int mo1347a() {
        return this.f35703c.mo1347a();
    }

    @Override // p415x3.InterfaceC13685d
    /* renamed from: b */
    public int mo1346b() {
        return this.f35703c.mo1346b();
    }

    @Override // p415x3.InterfaceC13680a
    /* renamed from: c */
    public int mo1345c() {
        return this.f35710j;
    }

    @Override // p415x3.InterfaceC13680a
    public void clear() {
        this.f35702b.clear();
    }

    @Override // p415x3.InterfaceC13680a
    /* renamed from: d */
    public void mo1344d(Rect rect) {
        this.f35708h = rect;
        this.f35704d.mo1331d(rect);
        m1334n();
    }

    @Override // p415x3.InterfaceC13680a
    /* renamed from: e */
    public int mo1343e() {
        return this.f35709i;
    }

    @Override // p415x3.InterfaceC13680a
    /* renamed from: f */
    public void mo1342f(ColorFilter colorFilter) {
        this.f35707g.setColorFilter(colorFilter);
    }

    @Override // p415x3.InterfaceC13680a
    /* renamed from: g */
    public boolean mo1341g(Drawable drawable, Canvas canvas, int i) {
        InterfaceC0020b interfaceC0020b;
        boolean m1336l = m1336l(canvas, i, 0);
        InterfaceC0019a interfaceC0019a = this.f35705e;
        if (interfaceC0019a != null && (interfaceC0020b = this.f35706f) != null) {
            interfaceC0019a.mo41379a(interfaceC0020b, this.f35702b, this, i);
        }
        return m1336l;
    }

    @Override // p415x3.C13682c.InterfaceC13684b
    /* renamed from: h */
    public void mo1340h() {
        clear();
    }

    @Override // p415x3.InterfaceC13685d
    /* renamed from: i */
    public int mo1339i(int i) {
        return this.f35703c.mo1339i(i);
    }

    @Override // p415x3.InterfaceC13680a
    /* renamed from: j */
    public void mo1338j(int i) {
        this.f35707g.setAlpha(i);
    }
}