package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.react.views.text.TypefaceStyle;
import com.google.android.datatransport.cct.C4357d;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p007a6.C0030a;
import p026b6.C2131b;
import p026b6.InterfaceC2130a;
import p026b6.InterfaceC2132c;
import p116g6.InterfaceC6553a;
import p300qb.C11815b;
import p300qb.InterfaceC11814a;
import p347t5.C12588b;
import p362u5.AbstractC12831a;
import p362u5.AbstractC12857j;
import p362u5.AbstractC12858k;
import p362u5.AbstractC12861l;
import p362u5.AbstractC12863m;
import p362u5.AbstractC12865n;
import p362u5.AbstractC12866o;
import p362u5.EnumC12870p;
import p381v5.AbstractC13093i;
import p381v5.C13092h;
import p397w5.AbstractC13396f;
import p397w5.AbstractC13398g;
import p397w5.InterfaceC13406m;

/* renamed from: com.google.android.datatransport.cct.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4357d implements InterfaceC13406m {

    /* renamed from: a */
    private final InterfaceC11814a f11149a;

    /* renamed from: b */
    private final ConnectivityManager f11150b;

    /* renamed from: c */
    private final Context f11151c;

    /* renamed from: d */
    final URL f11152d;

    /* renamed from: e */
    private final InterfaceC6553a f11153e;

    /* renamed from: f */
    private final InterfaceC6553a f11154f;

    /* renamed from: g */
    private final int f11155g;

    /* renamed from: com.google.android.datatransport.cct.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4358a {

        /* renamed from: a */
        final URL f11156a;

        /* renamed from: b */
        final AbstractC12857j f11157b;

        /* renamed from: c */
        final String f11158c;

        C4358a(URL url, AbstractC12857j abstractC12857j, String str) {
            this.f11156a = url;
            this.f11157b = abstractC12857j;
            this.f11158c = str;
        }

        /* renamed from: a */
        C4358a m29940a(URL url) {
            return new C4358a(url, this.f11157b, this.f11158c);
        }
    }

    /* renamed from: com.google.android.datatransport.cct.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4359b {

        /* renamed from: a */
        final int f11159a;

        /* renamed from: b */
        final URL f11160b;

        /* renamed from: c */
        final long f11161c;

        C4359b(int i, URL url, long j) {
            this.f11159a = i;
            this.f11160b = url;
            this.f11161c = j;
        }
    }

    C4357d(Context context, InterfaceC6553a interfaceC6553a, InterfaceC6553a interfaceC6553a2, int i) {
        this.f11149a = AbstractC12857j.m3810b();
        this.f11151c = context;
        this.f11150b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f11152d = m29941n(C4354a.f11140c);
        this.f11153e = interfaceC6553a2;
        this.f11154f = interfaceC6553a;
        this.f11155g = i;
    }

    /* renamed from: e */
    public C4359b m29950e(C4358a c4358a) {
        C0030a.m41372a("CctTransportBackend", "Making request to: %s", c4358a.f11156a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) c4358a.f11156a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f11155g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.2"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = c4358a.f11158c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f11149a.mo5258a(c4358a.f11157b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                C0030a.m41368e("CctTransportBackend", "Status Code: " + responseCode);
                C0030a.m41368e("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                C0030a.m41368e("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new C4359b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream m29942m = m29942m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        C4359b c4359b = new C4359b(responseCode, null, AbstractC12865n.m3765b(new BufferedReader(new InputStreamReader(m29942m))).mo3764c());
                        if (m29942m != null) {
                            m29942m.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        return c4359b;
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                return new C4359b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (ConnectException e) {
            e = e;
            C0030a.m41370c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C4359b(500, null, 0L);
        } catch (UnknownHostException e2) {
            e = e2;
            C0030a.m41370c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C4359b(500, null, 0L);
        } catch (IOException e3) {
            e = e3;
            C0030a.m41370c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C4359b(TypefaceStyle.NORMAL, null, 0L);
        } catch (C11815b e4) {
            e = e4;
            C0030a.m41370c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C4359b(TypefaceStyle.NORMAL, null, 0L);
        }
    }

    /* renamed from: f */
    private static int m29949f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC12866o.EnumC12868b.UNKNOWN_MOBILE_SUBTYPE.m3756b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return AbstractC12866o.EnumC12868b.COMBINED.m3756b();
        }
        if (AbstractC12866o.EnumC12868b.m3757a(subtype) == null) {
            return 0;
        }
        return subtype;
    }

    /* renamed from: g */
    private static int m29948g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC12866o.EnumC12869c.NONE.m3754b();
        }
        return networkInfo.getType();
    }

    /* renamed from: h */
    private static int m29947h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            C0030a.m41370c("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    /* renamed from: i */
    private AbstractC12857j m29946i(AbstractC13396f abstractC13396f) {
        AbstractC12861l.AbstractC12862a m3793j;
        HashMap hashMap = new HashMap();
        for (AbstractC13093i abstractC13093i : abstractC13396f.mo2656b()) {
            String mo3296j = abstractC13093i.mo3296j();
            if (!hashMap.containsKey(mo3296j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC13093i);
                hashMap.put(mo3296j, arrayList);
            } else {
                ((List) hashMap.get(mo3296j)).add(abstractC13093i);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC13093i abstractC13093i2 = (AbstractC13093i) ((List) entry.getValue()).get(0);
            AbstractC12863m.AbstractC12864a mo3775b = AbstractC12863m.m3784a().mo3771f(EnumC12870p.DEFAULT).mo3770g(this.f11154f.mo22402a()).mo3769h(this.f11153e.mo22402a()).mo3775b(AbstractC12858k.m3808a().mo3803c(AbstractC12858k.EnumC12860b.ANDROID_FIREBASE).mo3804b(AbstractC12831a.m3843a().mo3812m(Integer.valueOf(abstractC13093i2.m3299g("sdk-version"))).mo3815j(abstractC13093i2.m3304b("model")).mo3819f(abstractC13093i2.m3304b("hardware")).mo3821d(abstractC13093i2.m3304b("device")).mo3813l(abstractC13093i2.m3304b("product")).mo3814k(abstractC13093i2.m3304b("os-uild")).mo3817h(abstractC13093i2.m3304b("manufacturer")).mo3820e(abstractC13093i2.m3304b("fingerprint")).mo3822c(abstractC13093i2.m3304b("country")).mo3818g(abstractC13093i2.m3304b("locale")).mo3816i(abstractC13093i2.m3304b("mcc_mnc")).mo3823b(abstractC13093i2.m3304b("application_build")).mo3824a()).mo3805a());
            try {
                mo3775b.m3768i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                mo3775b.m3767j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC13093i abstractC13093i3 : (List) entry.getValue()) {
                C13092h mo3301e = abstractC13093i3.mo3301e();
                C12588b m3306b = mo3301e.m3306b();
                if (m3306b.equals(C12588b.m4754b("proto"))) {
                    m3793j = AbstractC12861l.m3793j(mo3301e.m3307a());
                } else if (m3306b.equals(C12588b.m4754b("json"))) {
                    m3793j = AbstractC12861l.m3794i(new String(mo3301e.m3307a(), Charset.forName("UTF-8")));
                } else {
                    C0030a.m41367f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", m3306b);
                }
                m3793j.mo3790c(abstractC13093i3.mo3300f()).mo3789d(abstractC13093i3.mo3295k()).mo3785h(abstractC13093i3.m3298h("tz-offset")).mo3788e(AbstractC12866o.m3763a().mo3758c(AbstractC12866o.EnumC12869c.m3755a(abstractC13093i3.m3299g("net-type"))).mo3759b(AbstractC12866o.EnumC12868b.m3757a(abstractC13093i3.m3299g("mobile-subtype"))).mo3760a());
                if (abstractC13093i3.mo3302d() != null) {
                    m3793j.mo3791b(abstractC13093i3.mo3302d());
                }
                arrayList3.add(m3793j.mo3792a());
            }
            mo3775b.mo3774c(arrayList3);
            arrayList2.add(mo3775b.mo3776a());
        }
        return AbstractC12857j.m3811a(arrayList2);
    }

    /* renamed from: j */
    private static TelephonyManager m29945j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: k */
    static long m29944k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
    }

    /* renamed from: l */
    public static /* synthetic */ C4358a m29943l(C4358a c4358a, C4359b c4359b) {
        URL url = c4359b.f11160b;
        if (url != null) {
            C0030a.m41372a("CctTransportBackend", "Following redirect to: %s", url);
            return c4358a.m29940a(c4359b.f11160b);
        }
        return null;
    }

    /* renamed from: m */
    private static InputStream m29942m(InputStream inputStream, String str) {
        if ("gzip".equals(str)) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    /* renamed from: n */
    private static URL m29941n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // p397w5.InterfaceC13406m
    /* renamed from: a */
    public AbstractC13398g mo2628a(AbstractC13396f abstractC13396f) {
        AbstractC12857j m29946i = m29946i(abstractC13396f);
        URL url = this.f11152d;
        String str = null;
        if (abstractC13396f.mo2655c() != null) {
            try {
                C4354a m29956c = C4354a.m29956c(abstractC13396f.mo2655c());
                if (m29956c.m29955d() != null) {
                    str = m29956c.m29955d();
                }
                if (m29956c.m29954e() != null) {
                    url = m29941n(m29956c.m29954e());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC13398g.m2651a();
            }
        }
        try {
            C4359b c4359b = (C4359b) C2131b.m34145a(5, new C4358a(url, m29946i, str), new InterfaceC2130a() { // from class: com.google.android.datatransport.cct.b
                @Override // p026b6.InterfaceC2130a
                public final Object apply(Object obj) {
                    C4357d.C4359b m29950e;
                    m29950e = C4357d.this.m29950e((C4357d.C4358a) obj);
                    return m29950e;
                }
            }, new InterfaceC2132c() { // from class: com.google.android.datatransport.cct.c
                @Override // p026b6.InterfaceC2132c
                /* renamed from: a */
                public final Object mo29953a(Object obj, Object obj2) {
                    C4357d.C4358a m29943l;
                    m29943l = C4357d.m29943l((C4357d.C4358a) obj, (C4357d.C4359b) obj2);
                    return m29943l;
                }
            });
            int i = c4359b.f11159a;
            if (i == 200) {
                return AbstractC13398g.m2647e(c4359b.f11161c);
            }
            if (i < 500 && i != 404) {
                if (i == 400) {
                    return AbstractC13398g.m2648d();
                }
                return AbstractC13398g.m2651a();
            }
            return AbstractC13398g.m2646f();
        } catch (IOException e) {
            C0030a.m41370c("CctTransportBackend", "Could not make request to the backend", e);
            return AbstractC13398g.m2646f();
        }
    }

    @Override // p397w5.InterfaceC13406m
    /* renamed from: b */
    public AbstractC13093i mo2627b(AbstractC13093i abstractC13093i) {
        NetworkInfo activeNetworkInfo = this.f11150b.getActiveNetworkInfo();
        return abstractC13093i.m3294l().m3293a("sdk-version", Build.VERSION.SDK_INT).m3291c("model", Build.MODEL).m3291c("hardware", Build.HARDWARE).m3291c("device", Build.DEVICE).m3291c("product", Build.PRODUCT).m3291c("os-uild", Build.ID).m3291c("manufacturer", Build.MANUFACTURER).m3291c("fingerprint", Build.FINGERPRINT).m3292b("tz-offset", m29944k()).m3293a("net-type", m29948g(activeNetworkInfo)).m3293a("mobile-subtype", m29949f(activeNetworkInfo)).m3291c("country", Locale.getDefault().getCountry()).m3291c("locale", Locale.getDefault().getLanguage()).m3291c("mcc_mnc", m29945j(this.f11151c).getSimOperator()).m3291c("application_build", Integer.toString(m29947h(this.f11151c))).mo3290d();
    }

    public C4357d(Context context, InterfaceC6553a interfaceC6553a, InterfaceC6553a interfaceC6553a2) {
        this(context, interfaceC6553a, interfaceC6553a2, 40000);
    }
}