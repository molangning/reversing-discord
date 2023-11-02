package p383v7;

import com.google.android.exoplayer2.Format;
import p009a8.C0085a;
import p028b8.C2142a;
import p041c8.C2452c;
import p061d8.C5781a;
import p080e8.C6171b;
import p080e8.C6182h;
import p399w7.C13417a;
import p399w7.C13421c;
import p419x7.C13724a;
import p440y7.C13927a;

/* renamed from: v7.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC13136i {

    /* renamed from: a */
    public static final InterfaceC13136i f34137a = new C13137a();

    /* renamed from: v7.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C13137a implements InterfaceC13136i {
        C13137a() {
        }

        @Override // p383v7.InterfaceC13136i
        /* renamed from: a */
        public boolean mo3128a(Format format) {
            String str = format.f11197u;
            if (!"text/vtt".equals(str) && !"text/x-ssa".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-subrip".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/cea-608".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/dvbsubs".equals(str) && !"application/pgs".equals(str)) {
                return false;
            }
            return true;
        }

        @Override // p383v7.InterfaceC13136i
        /* renamed from: b */
        public InterfaceC13134g mo3127b(Format format) {
            String str = format.f11197u;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            c = '\n';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new C13724a(format.f11199w);
                    case 1:
                        return new C13927a();
                    case 2:
                        return new C6171b();
                    case 3:
                        return new C6182h();
                    case 4:
                        return new C5781a(format.f11199w);
                    case 5:
                        return new C0085a(format.f11199w);
                    case 6:
                    case 7:
                        return new C13417a(str, format.f11183M, 16000L);
                    case '\b':
                        return new C13421c(format.f11183M, format.f11199w);
                    case '\t':
                        return new C2142a();
                    case '\n':
                        return new C2452c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    /* renamed from: a */
    boolean mo3128a(Format format);

    /* renamed from: b */
    InterfaceC13134g mo3127b(Format format);
}