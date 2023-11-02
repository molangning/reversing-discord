package id;

import android.graphics.Paint;
import com.henninghall.date_picker.C5151j;
import com.henninghall.date_picker.pickers.InterfaceC5161a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import p084ed.EnumC6204b;

/* renamed from: id.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC7502g {

    /* renamed from: a */
    protected final C5151j f20718a;

    /* renamed from: b */
    private Calendar f20719b;

    /* renamed from: c */
    private ArrayList<String> f20720c = new ArrayList<>();

    /* renamed from: d */
    public InterfaceC5161a f20721d;

    /* renamed from: e */
    public SimpleDateFormat f20722e;

    /* renamed from: id.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C7503a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20723a;

        static {
            int[] iArr = new int[EnumC6204b.values().length];
            f20723a = iArr;
            try {
                iArr[EnumC6204b.date.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20723a[EnumC6204b.time.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20723a[EnumC6204b.datetime.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AbstractC7502g(InterfaceC5161a interfaceC5161a, C5151j c5151j) {
        this.f20718a = c5151j;
        this.f20721d = interfaceC5161a;
        this.f20722e = new SimpleDateFormat(mo20565e(), c5151j.m26037u());
        interfaceC5161a.setTextAlign(mo20564l());
        interfaceC5161a.setWrapSelectorWheel(mo20561w());
    }

    /* renamed from: c */
    private String[] m20581c(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(mo20567t(it.next()));
        }
        return (String[]) arrayList2.toArray(new String[0]);
    }

    /* renamed from: d */
    private SimpleDateFormat m20580d(Locale locale) {
        return new SimpleDateFormat(mo20565e(), locale);
    }

    /* renamed from: g */
    private int m20578g() {
        return this.f20721d.getValue();
    }

    /* renamed from: h */
    private int m20577h(Calendar calendar) {
        this.f20722e.setTimeZone(this.f20718a.m26061D());
        return this.f20720c.indexOf(this.f20722e.format(calendar.getTime()));
    }

    /* renamed from: k */
    private String m20574k(Calendar calendar, Locale locale) {
        return m20580d(locale).format(calendar.getTime());
    }

    /* renamed from: p */
    private void m20571p() {
        this.f20721d.setMinValue(0);
        this.f20721d.setMaxValue(0);
        ArrayList<String> mo20563o = mo20563o();
        this.f20720c = mo20563o;
        this.f20721d.setDisplayedValues(m20581c(mo20563o));
        this.f20721d.setMaxValue(this.f20720c.size() - 1);
    }

    /* renamed from: a */
    public void m20583a(Calendar calendar) {
        this.f20721d.mo26002b(m20577h(calendar));
    }

    /* renamed from: b */
    public String m20582b() {
        return mo20567t(m20572n(m20578g()));
    }

    /* renamed from: e */
    public abstract String mo20565e();

    /* renamed from: f */
    public int mo20579f() {
        EnumC6204b m26032z = this.f20718a.m26032z();
        if (this.f20718a.f14509p.m26087h()) {
            return 10;
        }
        if (C7503a.f20723a[m26032z.ordinal()] != 1) {
            return 5;
        }
        return 15;
    }

    /* renamed from: i */
    public String m20576i(Calendar calendar) {
        return m20574k(calendar, this.f20718a.m26037u());
    }

    /* renamed from: j */
    public String m20575j(int i) {
        if (!mo20562v()) {
            return this.f20722e.format(this.f20719b.getTime());
        }
        int size = this.f20720c.size();
        return m20572n(((m20578g() + size) - i) % size);
    }

    /* renamed from: l */
    public abstract Paint.Align mo20564l();

    /* renamed from: m */
    public String m20573m() {
        if (!mo20562v()) {
            return this.f20722e.format(this.f20719b.getTime());
        }
        return m20572n(m20578g());
    }

    /* renamed from: n */
    public String m20572n(int i) {
        return this.f20720c.get(i);
    }

    /* renamed from: o */
    public abstract ArrayList<String> mo20563o();

    /* renamed from: q */
    public void m20570q() {
        this.f20722e = new SimpleDateFormat(mo20565e(), this.f20718a.m26037u());
        if (!mo20562v()) {
            return;
        }
        m20571p();
    }

    /* renamed from: r */
    public void m20569r() {
        this.f20721d.setItemPaddingHorizontal(mo20579f());
    }

    /* renamed from: s */
    public void m20568s(Calendar calendar) {
        this.f20722e.setTimeZone(this.f20718a.m26061D());
        this.f20719b = calendar;
        int m20577h = m20577h(calendar);
        if (m20577h > -1) {
            if (this.f20721d.getValue() == 0) {
                this.f20721d.setValue(m20577h);
            } else {
                this.f20721d.mo26002b(m20577h);
            }
        }
    }

    /* renamed from: t */
    public String mo20567t(String str) {
        return str;
    }

    /* renamed from: u */
    public void m20566u() {
        int i;
        if (mo20562v()) {
            i = 0;
        } else {
            i = 8;
        }
        this.f20721d.setVisibility(i);
    }

    /* renamed from: v */
    public abstract boolean mo20562v();

    /* renamed from: w */
    public abstract boolean mo20561w();
}