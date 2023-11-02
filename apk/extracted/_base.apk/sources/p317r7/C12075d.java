package p317r7;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p008a7.C0034b;
import p008a7.C0040e;
import p008a7.C0047h;
import p008a7.C0048h0;
import p008a7.C0057j;
import p177jb.C8891c;
import p195k8.C9149a;
import p195k8.C9180k;
import p195k8.C9183l0;
import p195k8.C9200u;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p398w6.C13412f;
import p418x6.C13707g;

/* renamed from: r7.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12075d implements InterfaceC12085h {

    /* renamed from: d */
    private static final int[] f31249d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b */
    private final int f31250b;

    /* renamed from: c */
    private final boolean f31251c;

    public C12075d() {
        this(0, true);
    }

    /* renamed from: b */
    private static void m6317b(int i, List<Integer> list) {
        if (C8891c.m17074g(f31249d, i) != -1 && !list.contains(Integer.valueOf(i))) {
            list.add(Integer.valueOf(i));
        }
    }

    @SuppressLint({"SwitchIntDef"})
    /* renamed from: d */
    private InterfaceC11746i m6315d(int i, Format format, List<Format> list, C9183l0 c9183l0) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 7) {
                        if (i != 8) {
                            if (i != 11) {
                                if (i != 13) {
                                    return null;
                                }
                                return new C12105u(format.f11188l, c9183l0);
                            }
                            return m6313f(this.f31250b, this.f31251c, format, list, c9183l0);
                        }
                        return m6314e(c9183l0, format, list);
                    }
                    return new C13412f(0, 0L);
                }
                return new C0047h();
            }
            return new C0040e();
        }
        return new C0034b();
    }

    /* renamed from: e */
    private static C13707g m6314e(C9183l0 c9183l0, Format format, List<Format> list) {
        int i;
        if (m6312g(format)) {
            i = 4;
        } else {
            i = 0;
        }
        if (list == null) {
            list = Collections.emptyList();
        }
        return new C13707g(i, c9183l0, null, list);
    }

    /* renamed from: f */
    private static C0048h0 m6313f(int i, boolean z, Format format, List<Format> list, C9183l0 c9183l0) {
        int i2 = i | 16;
        if (list != null) {
            i2 |= 32;
        } else if (z) {
            list = Collections.singletonList(new Format.C4362b().m29883e0("application/cea-608").m29914E());
        } else {
            list = Collections.emptyList();
        }
        String str = format.f11194r;
        if (!TextUtils.isEmpty(str)) {
            if (!C9200u.m16168b(str, "audio/mp4a-latm")) {
                i2 |= 2;
            }
            if (!C9200u.m16168b(str, "video/avc")) {
                i2 |= 4;
            }
        }
        return new C0048h0(2, c9183l0, new C0057j(i2, list));
    }

    /* renamed from: g */
    private static boolean m6312g(Format format) {
        Metadata.InterfaceC4429b m29248d;
        Metadata metadata = format.f11195s;
        if (metadata == null) {
            return false;
        }
        for (int i = 0; i < metadata.m29247e(); i++) {
            if (metadata.m29248d(i) instanceof C12099r) {
                return !((C12099r) m29248d).f31406l.isEmpty();
            }
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m6311h(InterfaceC11746i interfaceC11746i, InterfaceC11747j interfaceC11747j) {
        try {
            boolean mo659e = interfaceC11746i.mo659e(interfaceC11747j);
            interfaceC11747j.mo6969e();
            return mo659e;
        } catch (EOFException unused) {
            interfaceC11747j.mo6969e();
            return false;
        } catch (Throwable th2) {
            interfaceC11747j.mo6969e();
            throw th2;
        }
    }

    @Override // p317r7.InterfaceC12085h
    /* renamed from: c */
    public C12073b mo6278a(Uri uri, Format format, List<Format> list, C9183l0 c9183l0, Map<String, List<String>> map, InterfaceC11747j interfaceC11747j) {
        int m16371a = C9180k.m16371a(format.f11197u);
        int m16370b = C9180k.m16370b(map);
        int m16369c = C9180k.m16369c(uri);
        int[] iArr = f31249d;
        ArrayList arrayList = new ArrayList(iArr.length);
        m6317b(m16371a, arrayList);
        m6317b(m16370b, arrayList);
        m6317b(m16369c, arrayList);
        for (int i : iArr) {
            m6317b(i, arrayList);
        }
        interfaceC11747j.mo6969e();
        InterfaceC11746i interfaceC11746i = null;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            InterfaceC11746i interfaceC11746i2 = (InterfaceC11746i) C9149a.m16448e(m6315d(intValue, format, list, c9183l0));
            if (m6311h(interfaceC11746i2, interfaceC11747j)) {
                return new C12073b(interfaceC11746i2, format, c9183l0);
            }
            if (interfaceC11746i == null && (intValue == m16371a || intValue == m16370b || intValue == m16369c || intValue == 11)) {
                interfaceC11746i = interfaceC11746i2;
            }
        }
        return new C12073b((InterfaceC11746i) C9149a.m16448e(interfaceC11746i), format, c9183l0);
    }

    public C12075d(int i, boolean z) {
        this.f31250b = i;
        this.f31251c = z;
    }
}
