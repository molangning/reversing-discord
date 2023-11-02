package io.sentry.clientreport;

import io.sentry.C7898d4;
import io.sentry.C7991j;
import io.sentry.C8020m3;
import io.sentry.C8132r4;
import io.sentry.EnumC7960i;
import io.sentry.EnumC8011l4;
import io.sentry.EnumC8021m4;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: io.sentry.clientreport.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7874d implements InterfaceC7878g {

    /* renamed from: a */
    private final InterfaceC7879h f21487a = new C7870a();

    /* renamed from: b */
    private final C8132r4 f21488b;

    public C7874d(C8132r4 c8132r4) {
        this.f21488b = c8132r4;
    }

    /* renamed from: e */
    private EnumC7960i m19486e(EnumC8011l4 enumC8011l4) {
        if (EnumC8011l4.Event.equals(enumC8011l4)) {
            return EnumC7960i.Error;
        }
        if (EnumC8011l4.Session.equals(enumC8011l4)) {
            return EnumC7960i.Session;
        }
        if (EnumC8011l4.Transaction.equals(enumC8011l4)) {
            return EnumC7960i.Transaction;
        }
        if (EnumC8011l4.UserFeedback.equals(enumC8011l4)) {
            return EnumC7960i.UserReport;
        }
        if (EnumC8011l4.Profile.equals(enumC8011l4)) {
            return EnumC7960i.Profile;
        }
        if (EnumC8011l4.Attachment.equals(enumC8011l4)) {
            return EnumC7960i.Attachment;
        }
        return EnumC7960i.Default;
    }

    /* renamed from: f */
    private void m19485f(String str, String str2, Long l) {
        this.f21487a.mo19476a(new C7873c(str, str2), l);
    }

    /* renamed from: h */
    private void m19483h(C7871b c7871b) {
        if (c7871b == null) {
            return;
        }
        for (C7876f c7876f : c7871b.m19492a()) {
            m19485f(c7876f.m19480c(), c7876f.m19482a(), c7876f.m19481b());
        }
    }

    @Override // io.sentry.clientreport.InterfaceC7878g
    /* renamed from: a */
    public void mo19474a(EnumC7875e enumC7875e, EnumC7960i enumC7960i) {
        try {
            m19485f(enumC7875e.getReason(), enumC7960i.getCategory(), 1L);
        } catch (Throwable th2) {
            this.f21488b.getLogger().mo18137a(EnumC8021m4.ERROR, th2, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.InterfaceC7878g
    /* renamed from: b */
    public void mo19473b(EnumC7875e enumC7875e, C8020m3 c8020m3) {
        if (c8020m3 == null) {
            return;
        }
        try {
            for (C7898d4 c7898d4 : c8020m3.m18986c()) {
                mo19472c(enumC7875e, c7898d4);
            }
        } catch (Throwable th2) {
            this.f21488b.getLogger().mo18137a(EnumC8021m4.ERROR, th2, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.InterfaceC7878g
    /* renamed from: c */
    public void mo19472c(EnumC7875e enumC7875e, C7898d4 c7898d4) {
        if (c7898d4 == null) {
            return;
        }
        try {
            EnumC8011l4 m19309b = c7898d4.m19359y().m19309b();
            if (EnumC8011l4.ClientReport.equals(m19309b)) {
                try {
                    m19483h(c7898d4.m19362v(this.f21488b.getSerializer()));
                } catch (Exception unused) {
                    this.f21488b.getLogger().mo18135c(EnumC8021m4.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                }
            } else {
                m19485f(enumC7875e.getReason(), m19486e(m19309b).getCategory(), 1L);
            }
        } catch (Throwable th2) {
            this.f21488b.getLogger().mo18137a(EnumC8021m4.ERROR, th2, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.InterfaceC7878g
    /* renamed from: d */
    public C8020m3 mo19471d(C8020m3 c8020m3) {
        C7871b m19484g = m19484g();
        if (m19484g == null) {
            return c8020m3;
        }
        try {
            this.f21488b.getLogger().mo18135c(EnumC8021m4.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList = new ArrayList();
            for (C7898d4 c7898d4 : c8020m3.m18986c()) {
                arrayList.add(c7898d4);
            }
            arrayList.add(C7898d4.m19366r(this.f21488b.getSerializer(), m19484g));
            return new C8020m3(c8020m3.m18987b(), arrayList);
        } catch (Throwable th2) {
            this.f21488b.getLogger().mo18137a(EnumC8021m4.ERROR, th2, "Unable to attach client report to envelope.", new Object[0]);
            return c8020m3;
        }
    }

    /* renamed from: g */
    C7871b m19484g() {
        Date m19088c = C7991j.m19088c();
        List<C7876f> mo19475b = this.f21487a.mo19475b();
        if (mo19475b.isEmpty()) {
            return null;
        }
        return new C7871b(m19088c, mo19475b);
    }
}
