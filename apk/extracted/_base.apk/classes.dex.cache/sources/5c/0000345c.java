package gd;

import android.view.View;
import com.henninghall.date_picker.C5151j;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import p137hd.C7071a;
import p137hd.C7073b;
import p137hd.C7074c;
import p137hd.C7075d;
import p137hd.C7076e;
import p137hd.C7079h;
import p137hd.C7080i;

/* renamed from: gd.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6732d {

    /* renamed from: a */
    private final C5151j f18947a;

    /* renamed from: b */
    private final View f18948b;

    /* renamed from: c */
    private C6736h f18949c;

    /* renamed from: d */
    private C6730b f18950d;

    /* renamed from: e */
    private C6735g f18951e = new C6735g();

    public C6732d(C5151j c5151j, View view) {
        this.f18947a = c5151j;
        this.f18948b = view;
        this.f18949c = new C6736h(c5151j, view);
        m22012a();
    }

    /* renamed from: a */
    private void m22012a() {
        this.f18949c.m21978j(new C7071a(new C6734f(this.f18949c, this.f18947a, this, this.f18948b)));
    }

    /* renamed from: b */
    public void m22011b(Calendar calendar) {
        this.f18949c.m21977k(new C7076e(calendar));
        this.f18949c.m21976l(new C7073b(calendar));
    }

    /* renamed from: c */
    public SimpleDateFormat m22010c() {
        return new SimpleDateFormat(this.f18949c.m21967u(), this.f18947a.m26037u());
    }

    /* renamed from: d */
    public String m22009d() {
        return this.f18949c.m21968t();
    }

    /* renamed from: e */
    public void m22008e(int i, int i2) {
        this.f18951e.m21992a(this.f18949c.m21963y(this.f18947a.f14509p.m26093b().get(i)), i2);
    }

    /* renamed from: f */
    public void m22007f() {
        this.f18949c.m21978j(new C7076e(this.f18947a.m26064A()));
    }

    /* renamed from: g */
    public void m22006g() {
        this.f18949c.m21978j(new C7075d());
    }

    /* renamed from: h */
    public void m22005h() {
        this.f18949c.m21990B();
    }

    /* renamed from: i */
    public void m22004i() {
        if (this.f18947a.f14509p.m26088g()) {
            return;
        }
        C6730b c6730b = new C6730b(this.f18947a, this.f18948b);
        this.f18950d = c6730b;
        c6730b.m22016a();
    }

    /* renamed from: j */
    public void m22003j() {
        this.f18949c.m21989C();
    }

    /* renamed from: k */
    public void m22002k(Calendar calendar) {
        this.f18947a.m26059F(calendar);
    }

    /* renamed from: l */
    public void m22001l() {
        this.f18949c.m21978j(new C7079h(this.f18947a.m26062C()));
    }

    /* renamed from: m */
    public void m22000m() {
        this.f18949c.m21988D();
    }

    /* renamed from: n */
    public void m21999n() {
        this.f18949c.m21976l(new C7074c());
    }

    /* renamed from: o */
    public void m21998o() {
        this.f18949c.m21978j(new C7080i());
    }
}