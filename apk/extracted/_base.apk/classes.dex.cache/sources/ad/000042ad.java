package p226m4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import p191k4.C9054b;
import p191k4.C9059e;
import p191k4.InterfaceC9053a;
import p191k4.InterfaceC9057c;
import p191k4.InterfaceC9058d;
import p241n4.C10500a;

/* renamed from: m4.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10251a implements InterfaceC9053a {

    /* renamed from: a */
    private final C10500a f26686a;

    /* renamed from: b */
    private final C9059e f26687b;

    /* renamed from: c */
    private final InterfaceC9057c f26688c;

    /* renamed from: d */
    private final Rect f26689d;

    /* renamed from: e */
    private final int[] f26690e;

    /* renamed from: f */
    private final int[] f26691f;

    /* renamed from: g */
    private final int f26692g;

    /* renamed from: h */
    private final C9054b[] f26693h;

    /* renamed from: i */
    private final Rect f26694i = new Rect();

    /* renamed from: j */
    private final Rect f26695j = new Rect();

    /* renamed from: k */
    private final boolean f26696k;

    /* renamed from: l */
    private Bitmap f26697l;

    public C10251a(C10500a c10500a, C9059e c9059e, Rect rect, boolean z) {
        this.f26686a = c10500a;
        this.f26687b = c9059e;
        InterfaceC9057c m16800d = c9059e.m16800d();
        this.f26688c = m16800d;
        int[] mo16807j = m16800d.mo16807j();
        this.f26690e = mo16807j;
        c10500a.m11355a(mo16807j);
        this.f26692g = c10500a.m11353c(mo16807j);
        this.f26691f = c10500a.m11354b(mo16807j);
        this.f26689d = m12018k(m16800d, rect);
        this.f26696k = z;
        this.f26693h = new C9054b[m16800d.mo16814a()];
        for (int i = 0; i < this.f26688c.mo16814a(); i++) {
            this.f26693h[i] = this.f26688c.mo16812c(i);
        }
    }

    /* renamed from: j */
    private synchronized void m12019j() {
        Bitmap bitmap = this.f26697l;
        if (bitmap != null) {
            bitmap.recycle();
            this.f26697l = null;
        }
    }

    /* renamed from: k */
    private static Rect m12018k(InterfaceC9057c interfaceC9057c, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, interfaceC9057c.getWidth(), interfaceC9057c.getHeight());
        }
        return new Rect(0, 0, Math.min(rect.width(), interfaceC9057c.getWidth()), Math.min(rect.height(), interfaceC9057c.getHeight()));
    }

    /* renamed from: l */
    private synchronized Bitmap m12017l(int i, int i2) {
        Bitmap bitmap = this.f26697l;
        if (bitmap != null && (bitmap.getWidth() < i || this.f26697l.getHeight() < i2)) {
            m12019j();
        }
        if (this.f26697l == null) {
            this.f26697l = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }
        this.f26697l.eraseColor(0);
        return this.f26697l;
    }

    /* renamed from: m */
    private void m12016m(Canvas canvas, InterfaceC9058d interfaceC9058d) {
        int width;
        int height;
        int mo16805b;
        int mo16804c;
        if (this.f26696k) {
            float max = Math.max(interfaceC9058d.getWidth() / Math.min(interfaceC9058d.getWidth(), canvas.getWidth()), interfaceC9058d.getHeight() / Math.min(interfaceC9058d.getHeight(), canvas.getHeight()));
            width = (int) (interfaceC9058d.getWidth() / max);
            height = (int) (interfaceC9058d.getHeight() / max);
            mo16805b = (int) (interfaceC9058d.mo16805b() / max);
            mo16804c = (int) (interfaceC9058d.mo16804c() / max);
        } else {
            width = interfaceC9058d.getWidth();
            height = interfaceC9058d.getHeight();
            mo16805b = interfaceC9058d.mo16805b();
            mo16804c = interfaceC9058d.mo16804c();
        }
        synchronized (this) {
            Bitmap m12017l = m12017l(width, height);
            this.f26697l = m12017l;
            interfaceC9058d.mo16806a(width, height, m12017l);
            canvas.save();
            canvas.translate(mo16805b, mo16804c);
            canvas.drawBitmap(this.f26697l, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        }
    }

    /* renamed from: n */
    private void m12015n(Canvas canvas, InterfaceC9058d interfaceC9058d) {
        double width = this.f26689d.width() / this.f26688c.getWidth();
        double height = this.f26689d.height() / this.f26688c.getHeight();
        int round = (int) Math.round(interfaceC9058d.getWidth() * width);
        int round2 = (int) Math.round(interfaceC9058d.getHeight() * height);
        int mo16805b = (int) (interfaceC9058d.mo16805b() * width);
        int mo16804c = (int) (interfaceC9058d.mo16804c() * height);
        synchronized (this) {
            int width2 = this.f26689d.width();
            int height2 = this.f26689d.height();
            m12017l(width2, height2);
            Bitmap bitmap = this.f26697l;
            if (bitmap != null) {
                interfaceC9058d.mo16806a(round, round2, bitmap);
            }
            this.f26694i.set(0, 0, width2, height2);
            this.f26695j.set(mo16805b, mo16804c, width2 + mo16805b, height2 + mo16804c);
            Bitmap bitmap2 = this.f26697l;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, this.f26694i, this.f26695j, (Paint) null);
            }
        }
    }

    @Override // p191k4.InterfaceC9053a
    /* renamed from: a */
    public int mo12028a() {
        return this.f26688c.mo16814a();
    }

    @Override // p191k4.InterfaceC9053a
    /* renamed from: b */
    public int mo12027b() {
        return this.f26688c.mo16813b();
    }

    @Override // p191k4.InterfaceC9053a
    /* renamed from: c */
    public C9054b mo12026c(int i) {
        return this.f26693h[i];
    }

    @Override // p191k4.InterfaceC9053a
    /* renamed from: d */
    public void mo12025d(int i, Canvas canvas) {
        InterfaceC9058d mo16808i = this.f26688c.mo16808i(i);
        try {
            if (this.f26688c.mo16811e()) {
                m12015n(canvas, mo16808i);
            } else {
                m12016m(canvas, mo16808i);
            }
        } finally {
            mo16808i.dispose();
        }
    }

    @Override // p191k4.InterfaceC9053a
    /* renamed from: e */
    public InterfaceC9053a mo12024e(Rect rect) {
        if (m12018k(this.f26688c, rect).equals(this.f26689d)) {
            return this;
        }
        return new C10251a(this.f26686a, this.f26687b, rect, this.f26696k);
    }

    @Override // p191k4.InterfaceC9053a
    /* renamed from: f */
    public int mo12023f(int i) {
        return this.f26690e[i];
    }

    @Override // p191k4.InterfaceC9053a
    /* renamed from: g */
    public int mo12022g() {
        return this.f26689d.height();
    }

    @Override // p191k4.InterfaceC9053a
    public int getHeight() {
        return this.f26688c.getHeight();
    }

    @Override // p191k4.InterfaceC9053a
    public int getWidth() {
        return this.f26688c.getWidth();
    }

    @Override // p191k4.InterfaceC9053a
    /* renamed from: h */
    public int mo12021h() {
        return this.f26689d.width();
    }

    @Override // p191k4.InterfaceC9053a
    /* renamed from: i */
    public C9059e mo12020i() {
        return this.f26687b;
    }
}