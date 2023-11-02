package id;

import android.graphics.Paint;
import com.henninghall.date_picker.C5146f;
import com.henninghall.date_picker.C5151j;
import com.henninghall.date_picker.C5153k;
import com.henninghall.date_picker.pickers.InterfaceC5161a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import p084ed.EnumC6204b;

/* renamed from: id.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7498c extends AbstractC7502g {

    /* renamed from: h */
    private static int f20714h = 150;

    /* renamed from: f */
    private String f20715f;

    /* renamed from: g */
    private HashMap<String, String> f20716g;

    public C7498c(InterfaceC5161a interfaceC5161a, C5151j c5151j) {
        super(interfaceC5161a, c5151j);
    }

    /* renamed from: A */
    private Calendar m20590A() {
        Calendar m26064A;
        Calendar m26035w = this.f20718a.m26035w();
        Calendar m26034x = this.f20718a.m26034x();
        if (m26035w != null) {
            return (Calendar) m26035w.clone();
        }
        if (m26034x != null) {
            m26064A = (Calendar) m26034x.clone();
            m26064A.add(5, m26064A.getActualMaximum(6) / 2);
        } else {
            m26064A = this.f20718a.m26064A();
            m26064A.add(5, f20714h / 2);
        }
        return m26064A;
    }

    /* renamed from: B */
    private Calendar m20589B() {
        Calendar m26035w = this.f20718a.m26035w();
        Calendar m26034x = this.f20718a.m26034x();
        if (m26034x != null) {
            return (Calendar) m26034x.clone();
        }
        if (m26035w != null) {
            Calendar calendar = (Calendar) m26035w.clone();
            calendar.add(5, (-calendar.getActualMaximum(6)) / 2);
            return calendar;
        }
        Calendar m26064A = this.f20718a.m26064A();
        m26064A.add(5, (-f20714h) / 2);
        return m26064A;
    }

    /* renamed from: C */
    private String m20588C(Calendar calendar) {
        return this.f20722e.format(calendar.getTime());
    }

    /* renamed from: D */
    private String m20587D(String str) {
        String m26022j = C5153k.m26022j(this.f20718a.m26037u());
        if (Character.isUpperCase(str.charAt(0))) {
            return C5153k.m26031a(m26022j);
        }
        return m26022j;
    }

    /* renamed from: x */
    private String m20586x(Calendar calendar) {
        return m20585y().format(calendar.getTime());
    }

    /* renamed from: y */
    private SimpleDateFormat m20585y() {
        return new SimpleDateFormat(m20584z(), this.f20718a.m26037u());
    }

    /* renamed from: z */
    private String m20584z() {
        return C5146f.m26074d(this.f20718a.m26036v());
    }

    @Override // id.AbstractC7502g
    /* renamed from: e */
    public String mo20565e() {
        return C5146f.m26076b(this.f20718a.m26037u()).replace("EEEE", "EEE").replace("MMMM", "MMM");
    }

    @Override // id.AbstractC7502g
    /* renamed from: l */
    public Paint.Align mo20564l() {
        return Paint.Align.RIGHT;
    }

    @Override // id.AbstractC7502g
    /* renamed from: o */
    public ArrayList<String> mo20563o() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f20716g = new HashMap<>();
        Calendar m20589B = m20589B();
        Calendar m20590A = m20590A();
        while (!m20589B.after(m20590A)) {
            String m20588C = m20588C(m20589B);
            arrayList.add(m20588C);
            this.f20716g.put(m20588C, m20586x(m20589B));
            if (C5153k.m26025g(m20589B)) {
                this.f20715f = m20588C;
            }
            m20589B.add(5, 1);
        }
        return arrayList;
    }

    @Override // id.AbstractC7502g
    /* renamed from: t */
    public String mo20567t(String str) {
        if (str.equals(this.f20715f)) {
            return m20587D(str);
        }
        return this.f20716g.get(str);
    }

    @Override // id.AbstractC7502g
    /* renamed from: v */
    public boolean mo20562v() {
        return this.f20718a.m26032z() == EnumC6204b.datetime;
    }

    @Override // id.AbstractC7502g
    /* renamed from: w */
    public boolean mo20561w() {
        return false;
    }
}