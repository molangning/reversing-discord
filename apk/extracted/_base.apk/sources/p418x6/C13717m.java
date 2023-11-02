package p418x6;

import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.List;
import p102fb.C6380j;
import p151i6.C7402m;
import p173j7.C8858c;
import p195k8.C9208y;
import p296q6.C11765x;
import p296q6.InterfaceC11747j;

/* renamed from: x6.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13717m {

    /* renamed from: d */
    private static final C6380j f35341d = C6380j.m22824d(':');

    /* renamed from: e */
    private static final C6380j f35342e = C6380j.m22824d('*');

    /* renamed from: a */
    private final List<C13718a> f35343a = new ArrayList();

    /* renamed from: b */
    private int f35344b = 0;

    /* renamed from: c */
    private int f35345c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x6.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13718a {

        /* renamed from: a */
        public final int f35346a;

        /* renamed from: b */
        public final long f35347b;

        /* renamed from: c */
        public final int f35348c;

        public C13718a(int i, long j, int i2) {
            this.f35346a = i;
            this.f35347b = j;
            this.f35348c = i2;
        }
    }

    /* renamed from: a */
    private void m1657a(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        C9208y c9208y = new C9208y(8);
        interfaceC11747j.readFully(c9208y.m16094d(), 0, 8);
        this.f35345c = c9208y.m16081q() + 8;
        if (c9208y.m16084n() != 1397048916) {
            c11765x.f30668a = 0L;
            return;
        }
        c11765x.f30668a = interfaceC11747j.getPosition() - (this.f35345c - 12);
        this.f35344b = 2;
    }

    /* renamed from: b */
    private static int m1656b(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw new C7402m("Invalid SEF name");
        }
    }

    /* renamed from: d */
    private void m1654d(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        long length = interfaceC11747j.getLength();
        int i = (this.f35345c - 12) - 8;
        C9208y c9208y = new C9208y(i);
        interfaceC11747j.readFully(c9208y.m16094d(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            c9208y.m16098Q(2);
            short m16079s = c9208y.m16079s();
            if (m16079s != 2192 && m16079s != 2816 && m16079s != 2817 && m16079s != 2819 && m16079s != 2820) {
                c9208y.m16098Q(8);
            } else {
                this.f35343a.add(new C13718a(m16079s, (length - this.f35345c) - c9208y.m16081q(), c9208y.m16081q()));
            }
        }
        if (this.f35343a.isEmpty()) {
            c11765x.f30668a = 0L;
            return;
        }
        this.f35344b = 3;
        c11765x.f30668a = this.f35343a.get(0).f35347b;
    }

    /* renamed from: e */
    private void m1653e(InterfaceC11747j interfaceC11747j, List<Metadata.InterfaceC4429b> list) {
        long position = interfaceC11747j.getPosition();
        int length = (int) ((interfaceC11747j.getLength() - interfaceC11747j.getPosition()) - this.f35345c);
        C9208y c9208y = new C9208y(length);
        interfaceC11747j.readFully(c9208y.m16094d(), 0, length);
        for (int i = 0; i < this.f35343a.size(); i++) {
            C13718a c13718a = this.f35343a.get(i);
            c9208y.m16099P((int) (c13718a.f35347b - position));
            c9208y.m16098Q(4);
            int m16081q = c9208y.m16081q();
            int m1656b = m1656b(c9208y.m16114A(m16081q));
            int i2 = c13718a.f35348c - (m16081q + 8);
            if (m1656b != 2192) {
                if (m1656b != 2816 && m1656b != 2817 && m1656b != 2819 && m1656b != 2820) {
                    throw new IllegalStateException();
                }
            } else {
                list.add(m1652f(c9208y, i2));
            }
        }
    }

    /* renamed from: f */
    private static C8858c m1652f(C9208y c9208y, int i) {
        ArrayList arrayList = new ArrayList();
        List<String> m22822f = f35342e.m22822f(c9208y.m16114A(i));
        for (int i2 = 0; i2 < m22822f.size(); i2++) {
            List<String> m22822f2 = f35341d.m22822f(m22822f.get(i2));
            if (m22822f2.size() == 3) {
                try {
                    arrayList.add(new C8858c.C8860b(Long.parseLong(m22822f2.get(0)), Long.parseLong(m22822f2.get(1)), 1 << (Integer.parseInt(m22822f2.get(2)) - 1)));
                } catch (NumberFormatException e) {
                    throw new C7402m(e);
                }
            } else {
                throw new C7402m();
            }
        }
        return new C8858c(arrayList);
    }

    /* renamed from: c */
    public int m1655c(InterfaceC11747j interfaceC11747j, C11765x c11765x, List<Metadata.InterfaceC4429b> list) {
        int i = this.f35344b;
        long j = 0;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        m1653e(interfaceC11747j, list);
                        c11765x.f30668a = 0L;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    m1654d(interfaceC11747j, c11765x);
                }
            } else {
                m1657a(interfaceC11747j, c11765x);
            }
        } else {
            long length = interfaceC11747j.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            c11765x.f30668a = j;
            this.f35344b = 1;
        }
        return 1;
    }

    /* renamed from: g */
    public void m1651g() {
        this.f35343a.clear();
        this.f35344b = 0;
    }
}
