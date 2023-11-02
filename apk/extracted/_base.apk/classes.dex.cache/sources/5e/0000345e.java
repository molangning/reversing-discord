package gd;

import android.view.View;
import com.henninghall.date_picker.C5139c;
import com.henninghall.date_picker.C5151j;
import id.AbstractC7502g;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: gd.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6734f implements InterfaceC6733e {

    /* renamed from: a */
    private final C6736h f18952a;

    /* renamed from: b */
    private final C5151j f18953b;

    /* renamed from: c */
    private final C6732d f18954c;

    /* renamed from: d */
    private final View f18955d;

    public C6734f(C6736h c6736h, C5151j c5151j, C6732d c6732d, View view) {
        this.f18952a = c6736h;
        this.f18954c = c6732d;
        this.f18953b = c5151j;
        this.f18955d = view;
    }

    /* renamed from: b */
    private boolean m21996b() {
        SimpleDateFormat m21994d = m21994d();
        String m21970r = this.f18952a.m21970r();
        try {
            m21994d.setLenient(false);
            m21994d.parse(m21970r);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private Calendar m21995c() {
        SimpleDateFormat m21994d = m21994d();
        m21994d.setLenient(false);
        for (int i = 0; i < 10; i++) {
            try {
                String m21969s = this.f18952a.m21969s(i);
                Calendar calendar = Calendar.getInstance(this.f18953b.m26061D());
                calendar.setTime(m21994d.parse(m21969s));
                return calendar;
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    private SimpleDateFormat m21994d() {
        TimeZone m26061D = this.f18953b.m26061D();
        SimpleDateFormat m22010c = this.f18954c.m22010c();
        m22010c.setTimeZone(m26061D);
        return m22010c;
    }

    /* renamed from: e */
    private Calendar m21993e() {
        SimpleDateFormat m21994d = m21994d();
        String m21970r = this.f18952a.m21970r();
        Calendar calendar = Calendar.getInstance(this.f18953b.m26061D());
        try {
            m21994d.setLenient(true);
            calendar.setTime(m21994d.parse(m21970r));
            return calendar;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // gd.InterfaceC6733e
    /* renamed from: a */
    public void mo21997a(AbstractC7502g abstractC7502g) {
        if (this.f18952a.m21991A()) {
            return;
        }
        if (!m21996b()) {
            Calendar m21995c = m21995c();
            if (m21995c != null) {
                this.f18954c.m22011b(m21995c);
                return;
            }
            return;
        }
        Calendar m21993e = m21993e();
        if (m21993e == null) {
            return;
        }
        Calendar m26034x = this.f18953b.m26034x();
        if (m26034x != null && m21993e.before(m26034x)) {
            this.f18954c.m22011b(m26034x);
            return;
        }
        Calendar m26035w = this.f18953b.m26035w();
        if (m26035w != null && m21993e.after(m26035w)) {
            this.f18954c.m22011b(m26035w);
            return;
        }
        String m22009d = this.f18954c.m22009d();
        this.f18954c.m22002k(m21993e);
        C5139c.m26084b(m21993e, m22009d, this.f18955d);
    }
}