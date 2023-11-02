package p296q6;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p008a7.C0032a0;
import p008a7.C0034b;
import p008a7.C0040e;
import p008a7.C0047h;
import p008a7.C0048h0;
import p027b7.C2134b;
import p195k8.C9180k;
import p316r6.C12071b;
import p336s6.C12406d;
import p348t6.C12597c;
import p363u6.C12871a;
import p382v6.C13119e;
import p398w6.C13412f;
import p418x6.C13707g;
import p418x6.C13713k;
import p439y6.C13916d;

/* renamed from: q6.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11744g implements InterfaceC11753o {

    /* renamed from: m */
    private static final int[] f30625m = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: n */
    private static final Constructor<? extends InterfaceC11746i> f30626n;

    /* renamed from: b */
    private boolean f30627b;

    /* renamed from: c */
    private int f30628c;

    /* renamed from: d */
    private int f30629d;

    /* renamed from: e */
    private int f30630e;

    /* renamed from: f */
    private int f30631f;

    /* renamed from: g */
    private int f30632g;

    /* renamed from: h */
    private int f30633h;

    /* renamed from: i */
    private int f30634i;

    /* renamed from: k */
    private int f30636k;

    /* renamed from: j */
    private int f30635j = 1;

    /* renamed from: l */
    private int f30637l = 112800;

    static {
        Constructor<? extends InterfaceC11746i> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(InterfaceC11746i.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        f30626n = constructor;
    }

    /* renamed from: c */
    private void m7008c(int i, List<InterfaceC11746i> list) {
        switch (i) {
            case 0:
                list.add(new C0034b());
                return;
            case 1:
                list.add(new C0040e());
                return;
            case 2:
                list.add(new C0047h(this.f30628c | (this.f30627b ? 1 : 0)));
                return;
            case 3:
                list.add(new C12071b(this.f30629d | (this.f30627b ? 1 : 0)));
                return;
            case 4:
                Constructor<? extends InterfaceC11746i> constructor = f30626n;
                if (constructor != null) {
                    try {
                        list.add(constructor.newInstance(Integer.valueOf(this.f30630e)));
                        return;
                    } catch (Exception e) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
                    }
                }
                list.add(new C12406d(this.f30630e));
                return;
            case 5:
                list.add(new C12597c());
                return;
            case 6:
                list.add(new C13119e(this.f30631f));
                return;
            case 7:
                list.add(new C13412f(this.f30634i | (this.f30627b ? 1 : 0)));
                return;
            case 8:
                list.add(new C13707g(this.f30633h));
                list.add(new C13713k(this.f30632g));
                return;
            case 9:
                list.add(new C13916d());
                return;
            case 10:
                list.add(new C0032a0());
                return;
            case 11:
                list.add(new C0048h0(this.f30635j, this.f30636k, this.f30637l));
                return;
            case 12:
                list.add(new C2134b());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new C12871a());
                return;
        }
    }

    @Override // p296q6.InterfaceC11753o
    /* renamed from: a */
    public synchronized InterfaceC11746i[] mo1203a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr;
        arrayList = new ArrayList(14);
        int m16370b = C9180k.m16370b(map);
        if (m16370b != -1) {
            m7008c(m16370b, arrayList);
        }
        int m16369c = C9180k.m16369c(uri);
        if (m16369c != -1 && m16369c != m16370b) {
            m7008c(m16369c, arrayList);
        }
        for (int i : f30625m) {
            if (i != m16370b && i != m16369c) {
                m7008c(i, arrayList);
            }
        }
        return (InterfaceC11746i[]) arrayList.toArray(new InterfaceC11746i[arrayList.size()]);
    }

    @Override // p296q6.InterfaceC11753o
    /* renamed from: b */
    public synchronized InterfaceC11746i[] mo1202b() {
        return mo1203a(Uri.EMPTY, new HashMap());
    }
}