package p060d7;

import com.google.android.exoplayer2.Format;
import p079e7.C6169b;
import p098f7.C6316b;
import p131h7.C7022a;
import p152i7.C7425h;
import p194k7.C9137c;

/* renamed from: d7.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC5776c {

    /* renamed from: a */
    public static final InterfaceC5776c f16599a = new C5777a();

    /* renamed from: d7.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5777a implements InterfaceC5776c {
        C5777a() {
        }

        @Override // p060d7.InterfaceC5776c
        /* renamed from: a */
        public boolean mo24520a(Format format) {
            String str = format.f11197u;
            if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
                return false;
            }
            return true;
        }

        @Override // p060d7.InterfaceC5776c
        /* renamed from: b */
        public InterfaceC5775b mo24519b(Format format) {
            String str = format.f11197u;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new C6169b();
                    case 1:
                        return new C7022a();
                    case 2:
                        return new C7425h();
                    case 3:
                        return new C6316b();
                    case 4:
                        return new C9137c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    /* renamed from: a */
    boolean mo24520a(Format format);

    /* renamed from: b */
    InterfaceC5775b mo24519b(Format format);
}