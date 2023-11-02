package io.sentry;

import io.sentry.EnumC8011l4;
import io.sentry.util.C8229o;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: io.sentry.e4 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7909e4 implements InterfaceC8026n1 {

    /* renamed from: j */
    private final String f21549j;

    /* renamed from: k */
    private final String f21550k;

    /* renamed from: l */
    private final EnumC8011l4 f21551l;

    /* renamed from: m */
    private final int f21552m;

    /* renamed from: n */
    private final Callable<Integer> f21553n;

    /* renamed from: o */
    private final String f21554o;

    /* renamed from: p */
    private Map<String, Object> f21555p;

    /* renamed from: io.sentry.e4$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7910a implements InterfaceC7894d1<C7909e4> {
        /* renamed from: c */
        private Exception m19306c(String str, InterfaceC8040o0 interfaceC8040o0) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C7909e4 mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            HashMap hashMap = null;
            EnumC8011l4 enumC8011l4 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -1106363674:
                        if (m18105R.equals("length")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -734768633:
                        if (m18105R.equals("filename")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -672977706:
                        if (m18105R.equals("attachment_type")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3575610:
                        if (m18105R.equals("type")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 831846208:
                        if (m18105R.equals("content_type")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        i = c7993j1.m18107I();
                        break;
                    case 1:
                        str2 = c7993j1.m19061T0();
                        break;
                    case 2:
                        str3 = c7993j1.m19061T0();
                        break;
                    case 3:
                        enumC8011l4 = (EnumC8011l4) c7993j1.m19062S0(interfaceC8040o0, new EnumC8011l4.C8012a());
                        break;
                    case 4:
                        str = c7993j1.m19061T0();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, hashMap, m18105R);
                        break;
                }
            }
            if (enumC8011l4 != null) {
                C7909e4 c7909e4 = new C7909e4(enumC8011l4, i, str, str2, str3);
                c7909e4.m19308c(hashMap);
                c7993j1.m18091q();
                return c7909e4;
            }
            throw m19306c("type", interfaceC8040o0);
        }
    }

    public C7909e4(EnumC8011l4 enumC8011l4, int i, String str, String str2, String str3) {
        this.f21551l = (EnumC8011l4) C8229o.m18169c(enumC8011l4, "type is required");
        this.f21549j = str;
        this.f21552m = i;
        this.f21550k = str2;
        this.f21553n = null;
        this.f21554o = str3;
    }

    /* renamed from: a */
    public int m19310a() {
        Callable<Integer> callable = this.f21553n;
        if (callable != null) {
            try {
                return callable.call().intValue();
            } catch (Throwable unused) {
                return -1;
            }
        }
        return this.f21552m;
    }

    /* renamed from: b */
    public EnumC8011l4 m19309b() {
        return this.f21551l;
    }

    /* renamed from: c */
    public void m19308c(Map<String, Object> map) {
        this.f21555p = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21549j != null) {
            interfaceC7919f2.mo18193e("content_type").mo18191g(this.f21549j);
        }
        if (this.f21550k != null) {
            interfaceC7919f2.mo18193e("filename").mo18191g(this.f21550k);
        }
        interfaceC7919f2.mo18193e("type").mo18188j(interfaceC8040o0, this.f21551l);
        if (this.f21554o != null) {
            interfaceC7919f2.mo18193e("attachment_type").mo18191g(this.f21554o);
        }
        interfaceC7919f2.mo18193e("length").mo18197a(m19310a());
        Map<String, Object> map = this.f21555p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21555p.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7909e4(EnumC8011l4 enumC8011l4, Callable<Integer> callable, String str, String str2, String str3) {
        this.f21551l = (EnumC8011l4) C8229o.m18169c(enumC8011l4, "type is required");
        this.f21549j = str;
        this.f21552m = -1;
        this.f21550k = str2;
        this.f21553n = callable;
        this.f21554o = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7909e4(EnumC8011l4 enumC8011l4, Callable<Integer> callable, String str, String str2) {
        this(enumC8011l4, callable, str, str2, (String) null);
    }
}
