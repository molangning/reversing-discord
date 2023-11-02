package gd;

import android.view.View;
import com.henninghall.date_picker.C5149h;
import com.henninghall.date_picker.C5151j;
import com.henninghall.date_picker.pickers.InterfaceC5161a;
import id.AbstractC7502g;
import id.C7496a;
import id.C7497b;
import id.C7498c;
import id.C7499d;
import id.C7500e;
import id.C7501f;
import id.C7504h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p084ed.EnumC6204b;
import p084ed.EnumC6205c;
import p084ed.EnumC6206d;
import p137hd.C7077f;
import p137hd.C7078g;
import p137hd.InterfaceC7081j;
import p453z0.C14061a;

/* renamed from: gd.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6736h {

    /* renamed from: a */
    private final C5151j f18956a;

    /* renamed from: b */
    private final C14061a f18957b;

    /* renamed from: c */
    private final C14061a f18958c;

    /* renamed from: d */
    private C7499d f18959d;

    /* renamed from: e */
    private C7498c f18960e;

    /* renamed from: f */
    private C7500e f18961f;

    /* renamed from: g */
    private C7496a f18962g;

    /* renamed from: h */
    private C7497b f18963h;

    /* renamed from: i */
    private C7501f f18964i;

    /* renamed from: j */
    private C7504h f18965j;

    /* renamed from: k */
    private View f18966k;

    /* renamed from: l */
    private final C6731c f18967l;

    /* renamed from: m */
    private HashMap<EnumC6206d, AbstractC7502g> f18968m = m21962z();

    /* renamed from: gd.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C6737a implements InterfaceC5161a.InterfaceC5163b {
        C6737a() {
            C6736h.this = r1;
        }

        @Override // com.henninghall.date_picker.pickers.InterfaceC5161a.InterfaceC5163b
        /* renamed from: a */
        public void mo21961a(InterfaceC5161a interfaceC5161a, int i, int i2) {
            boolean z;
            if (C6736h.this.f18956a.f14509p.m26086i()) {
                String m20572n = C6736h.this.f18959d.m20572n(i);
                String m20572n2 = C6736h.this.f18959d.m20572n(i2);
                if ((m20572n.equals("12") && m20572n2.equals("11")) || (m20572n.equals("11") && m20572n2.equals("12"))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C6736h.this.f18962g.f20721d.mo26003a((C6736h.this.f18962g.f20721d.getValue() + 1) % 2, false);
                }
            }
        }
    }

    /* renamed from: gd.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C6738b extends HashMap<EnumC6206d, AbstractC7502g> {
        C6738b() {
            C6736h.this = r3;
            put(EnumC6206d.DAY, r3.f18960e);
            put(EnumC6206d.YEAR, r3.f18965j);
            put(EnumC6206d.MONTH, r3.f18964i);
            put(EnumC6206d.DATE, r3.f18963h);
            put(EnumC6206d.HOUR, r3.f18959d);
            put(EnumC6206d.MINUTE, r3.f18961f);
            put(EnumC6206d.AM_PM, r3.f18962g);
        }
    }

    public C6736h(C5151j c5151j, View view) {
        this.f18956a = c5151j;
        this.f18966k = view;
        this.f18967l = new C6731c(view);
        this.f18965j = new C7504h(m21965w(C5149h.f14491l), c5151j);
        this.f18964i = new C7501f(m21965w(C5149h.f14487h), c5151j);
        this.f18963h = new C7497b(m21965w(C5149h.f14481b), c5151j);
        this.f18960e = new C7498c(m21965w(C5149h.f14482c), c5151j);
        this.f18961f = new C7500e(m21965w(C5149h.f14486g), c5151j);
        this.f18962g = new C7496a(m21965w(C5149h.f14480a), c5151j);
        this.f18959d = new C7499d(m21965w(C5149h.f14485f), c5151j);
        this.f18957b = (C14061a) view.findViewById(C5149h.f14484e);
        this.f18958c = (C14061a) view.findViewById(C5149h.f14483d);
        m21975m();
    }

    /* renamed from: i */
    private void m21979i() {
        Iterator<EnumC6206d> it = this.f18956a.f14509p.m26093b().iterator();
        while (it.hasNext()) {
            this.f18967l.m22014a(m21963y(it.next()).f20721d.getView());
        }
    }

    /* renamed from: m */
    private void m21975m() {
        this.f18959d.f20721d.setOnValueChangeListenerInScrolling(new C6737a());
    }

    /* renamed from: n */
    private List<AbstractC7502g> m21974n() {
        return new ArrayList(Arrays.asList(this.f18965j, this.f18964i, this.f18963h, this.f18960e, this.f18959d, this.f18961f, this.f18962g));
    }

    /* renamed from: o */
    private String m21973o() {
        ArrayList<AbstractC7502g> m21966v = m21966v();
        if (this.f18956a.m26032z() == EnumC6204b.date) {
            return m21966v.get(0).mo20565e() + " " + m21966v.get(1).mo20565e() + " " + m21966v.get(2).mo20565e();
        }
        return this.f18960e.mo20565e();
    }

    /* renamed from: p */
    private String m21972p(int i) {
        ArrayList<AbstractC7502g> m21966v = m21966v();
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < 3; i2++) {
            if (i2 != 0) {
                sb2.append(" ");
            }
            AbstractC7502g abstractC7502g = m21966v.get(i2);
            if (abstractC7502g instanceof C7497b) {
                sb2.append(abstractC7502g.m20575j(i));
            } else {
                sb2.append(abstractC7502g.m20573m());
            }
        }
        return sb2.toString();
    }

    /* renamed from: q */
    private String m21971q(int i) {
        if (this.f18956a.m26032z() == EnumC6204b.date) {
            return m21972p(i);
        }
        return this.f18960e.m20573m();
    }

    /* renamed from: v */
    private ArrayList<AbstractC7502g> m21966v() {
        ArrayList<AbstractC7502g> arrayList = new ArrayList<>();
        Iterator<EnumC6206d> it = this.f18956a.f14509p.m26093b().iterator();
        while (it.hasNext()) {
            arrayList.add(m21963y(it.next()));
        }
        return arrayList;
    }

    /* renamed from: w */
    private InterfaceC5161a m21965w(int i) {
        return (InterfaceC5161a) this.f18966k.findViewById(i);
    }

    /* renamed from: z */
    private HashMap<EnumC6206d, AbstractC7502g> m21962z() {
        return new C6738b();
    }

    /* renamed from: A */
    public boolean m21991A() {
        for (AbstractC7502g abstractC7502g : m21974n()) {
            if (abstractC7502g.f20721d.mo26001c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public void m21990B() {
        int m26043o = this.f18956a.m26043o();
        m21978j(new C7077f(m26043o));
        if (this.f18956a.m26060E() == EnumC6205c.iosClone) {
            this.f18957b.setDividerHeight(m26043o);
            this.f18958c.setDividerHeight(m26043o);
        }
    }

    /* renamed from: C */
    public void m21989C() {
        int m26090e = this.f18956a.f14509p.m26090e();
        m21978j(new C7078g(m26090e));
        if (this.f18956a.m26060E() == EnumC6205c.iosClone) {
            this.f18957b.setShownCount(m26090e);
            this.f18958c.setShownCount(m26090e);
        }
    }

    /* renamed from: D */
    public void m21988D() {
        this.f18967l.m22013b();
        EnumC6205c m26060E = this.f18956a.m26060E();
        EnumC6205c enumC6205c = EnumC6205c.iosClone;
        if (m26060E == enumC6205c) {
            this.f18967l.m22014a(this.f18957b);
        }
        m21979i();
        if (this.f18956a.m26060E() == enumC6205c) {
            this.f18967l.m22014a(this.f18958c);
        }
    }

    /* renamed from: j */
    public void m21978j(InterfaceC7081j interfaceC7081j) {
        for (AbstractC7502g abstractC7502g : m21974n()) {
            interfaceC7081j.mo21449a(abstractC7502g);
        }
    }

    /* renamed from: k */
    public void m21977k(InterfaceC7081j interfaceC7081j) {
        for (AbstractC7502g abstractC7502g : m21974n()) {
            if (!abstractC7502g.mo20562v()) {
                interfaceC7081j.mo21449a(abstractC7502g);
            }
        }
    }

    /* renamed from: l */
    public void m21976l(InterfaceC7081j interfaceC7081j) {
        for (AbstractC7502g abstractC7502g : m21974n()) {
            if (abstractC7502g.mo20562v()) {
                interfaceC7081j.mo21449a(abstractC7502g);
            }
        }
    }

    /* renamed from: r */
    public String m21970r() {
        return m21969s(0);
    }

    /* renamed from: s */
    public String m21969s(int i) {
        return m21971q(i) + " " + m21964x();
    }

    /* renamed from: t */
    public String m21968t() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<AbstractC7502g> it = m21966v().iterator();
        while (it.hasNext()) {
            sb2.append(it.next().m20582b());
        }
        return sb2.toString();
    }

    /* renamed from: u */
    public String m21967u() {
        return m21973o() + " " + this.f18959d.mo20565e() + " " + this.f18961f.mo20565e() + this.f18962g.mo20565e();
    }

    /* renamed from: x */
    String m21964x() {
        return this.f18959d.m20573m() + " " + this.f18961f.m20573m() + this.f18962g.m20573m();
    }

    /* renamed from: y */
    public AbstractC7502g m21963y(EnumC6206d enumC6206d) {
        return this.f18968m.get(enumC6206d);
    }
}