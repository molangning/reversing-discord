package com.henninghall.date_picker;

import com.facebook.react.bridge.Dynamic;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import p084ed.EnumC6203a;
import p084ed.EnumC6204b;
import p084ed.EnumC6205c;
import p104fd.AbstractC6402k;
import p104fd.C6392a;
import p104fd.C6393b;
import p104fd.C6394c;
import p104fd.C6395d;
import p104fd.C6396e;
import p104fd.C6397f;
import p104fd.C6398g;
import p104fd.C6399h;
import p104fd.C6400i;
import p104fd.C6401j;
import p104fd.C6403l;
import p104fd.C6404m;
import p104fd.C6405n;
import p164j$.util.DesugarTimeZone;

/* renamed from: com.henninghall.date_picker.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5151j {

    /* renamed from: a */
    private Calendar f14494a = null;

    /* renamed from: b */
    private final C6392a f14495b = new C6392a();

    /* renamed from: c */
    private final C6401j f14496c = new C6401j();

    /* renamed from: d */
    private final C6397f f14497d = new C6397f();

    /* renamed from: e */
    private final C6394c f14498e = new C6394c();

    /* renamed from: f */
    private final C6403l f14499f = new C6403l();

    /* renamed from: g */
    private final C6400i f14500g = new C6400i();

    /* renamed from: h */
    private final C6399h f14501h = new C6399h();

    /* renamed from: i */
    private final C6398g f14502i = new C6398g();

    /* renamed from: j */
    private final C6404m f14503j = new C6404m();

    /* renamed from: k */
    private final C6395d f14504k = new C6395d();

    /* renamed from: l */
    private final C6405n f14505l = new C6405n();

    /* renamed from: m */
    private final C6393b f14506m = new C6393b();

    /* renamed from: n */
    private final C6396e f14507n = new C6396e();

    /* renamed from: o */
    private final HashMap f14508o = new C5152a();

    /* renamed from: p */
    public C5137b f14509p = new C5137b(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.henninghall.date_picker.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5152a extends HashMap<String, AbstractC6402k> {
        C5152a() {
            C5151j.this = r3;
            put("date", r3.f14495b);
            put("mode", r3.f14496c);
            put("locale", r3.f14497d);
            put("fadeToColor", r3.f14498e);
            put("textColor", r3.f14499f);
            put("minuteInterval", r3.f14500g);
            put("minimumDate", r3.f14501h);
            put("maximumDate", r3.f14502i);
            put("timezoneOffsetInMinutes", r3.f14503j);
            put("height", r3.f14504k);
            put("androidVariant", r3.f14505l);
            put("dividerHeight", r3.f14506m);
            put("is24hourSource", r3.f14507n);
        }
    }

    /* renamed from: B */
    private AbstractC6402k m26063B(String str) {
        return (AbstractC6402k) this.f14508o.get(str);
    }

    /* renamed from: n */
    private Calendar m26044n() {
        return C5153k.m26024h(m26039s(), m26061D());
    }

    /* renamed from: A */
    public Calendar m26064A() {
        Calendar m26044n = m26044n();
        int m26033y = m26033y();
        if (m26033y <= 1) {
            return m26044n;
        }
        m26044n.add(12, -(Integer.parseInt(new SimpleDateFormat("mm", m26037u()).format(m26044n.getTime())) % m26033y));
        return (Calendar) m26044n.clone();
    }

    /* renamed from: C */
    public String m26062C() {
        return this.f14499f.m22796a();
    }

    /* renamed from: D */
    public TimeZone m26061D() {
        char c;
        Integer m22796a = this.f14503j.m22796a();
        if (m22796a == null) {
            return TimeZone.getDefault();
        }
        int abs = Math.abs(m22796a.intValue());
        if (m22796a.intValue() < 0) {
            c = '-';
        } else {
            c = '+';
        }
        int floor = (int) Math.floor(abs / 60.0f);
        return DesugarTimeZone.getTimeZone("GMT" + c + floor + ":" + C5153k.m26020l(abs - (floor * 60)));
    }

    /* renamed from: E */
    public EnumC6205c m26060E() {
        return this.f14505l.m22796a();
    }

    /* renamed from: F */
    public void m26059F(Calendar calendar) {
        this.f14494a = calendar;
    }

    /* renamed from: G */
    public void m26058G(String str, Dynamic dynamic) {
        m26063B(str).m22795b(dynamic);
    }

    /* renamed from: o */
    public int m26043o() {
        return this.f14506m.m22796a().intValue();
    }

    /* renamed from: p */
    public String m26042p() {
        return this.f14498e.m22796a();
    }

    /* renamed from: q */
    public Integer m26041q() {
        return this.f14504k.m22796a();
    }

    /* renamed from: r */
    public EnumC6203a m26040r() {
        return this.f14507n.m22796a();
    }

    /* renamed from: s */
    public String m26039s() {
        return this.f14495b.m22796a();
    }

    /* renamed from: t */
    public Calendar m26038t() {
        return this.f14494a;
    }

    /* renamed from: u */
    public Locale m26037u() {
        return this.f14497d.m22796a();
    }

    /* renamed from: v */
    public String m26036v() {
        return this.f14497d.m22802f();
    }

    /* renamed from: w */
    public Calendar m26035w() {
        return C5153k.m26024h(this.f14502i.m22796a(), m26061D());
    }

    /* renamed from: x */
    public Calendar m26034x() {
        return C5153k.m26024h(this.f14501h.m22796a(), m26061D());
    }

    /* renamed from: y */
    public int m26033y() {
        return this.f14500g.m22796a().intValue();
    }

    /* renamed from: z */
    public EnumC6204b m26032z() {
        return this.f14496c.m22796a();
    }
}