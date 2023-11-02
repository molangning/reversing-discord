package p337s7;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p212l7.C10059c;
import p259o6.C11028l;

/* renamed from: s7.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12413f extends AbstractC12423h {

    /* renamed from: n */
    public static final C12413f f32250n = new C12413f("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d */
    public final List<Uri> f32251d;

    /* renamed from: e */
    public final List<C12415b> f32252e;

    /* renamed from: f */
    public final List<C12414a> f32253f;

    /* renamed from: g */
    public final List<C12414a> f32254g;

    /* renamed from: h */
    public final List<C12414a> f32255h;

    /* renamed from: i */
    public final List<C12414a> f32256i;

    /* renamed from: j */
    public final Format f32257j;

    /* renamed from: k */
    public final List<Format> f32258k;

    /* renamed from: l */
    public final Map<String, String> f32259l;

    /* renamed from: m */
    public final List<C11028l> f32260m;

    /* renamed from: s7.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12414a {

        /* renamed from: a */
        public final Uri f32261a;

        /* renamed from: b */
        public final Format f32262b;

        /* renamed from: c */
        public final String f32263c;

        /* renamed from: d */
        public final String f32264d;

        public C12414a(Uri uri, Format format, String str, String str2) {
            this.f32261a = uri;
            this.f32262b = format;
            this.f32263c = str;
            this.f32264d = str2;
        }
    }

    /* renamed from: s7.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12415b {

        /* renamed from: a */
        public final Uri f32265a;

        /* renamed from: b */
        public final Format f32266b;

        /* renamed from: c */
        public final String f32267c;

        /* renamed from: d */
        public final String f32268d;

        /* renamed from: e */
        public final String f32269e;

        /* renamed from: f */
        public final String f32270f;

        public C12415b(Uri uri, Format format, String str, String str2, String str3, String str4) {
            this.f32265a = uri;
            this.f32266b = format;
            this.f32267c = str;
            this.f32268d = str2;
            this.f32269e = str3;
            this.f32270f = str4;
        }

        /* renamed from: b */
        public static C12415b m5337b(Uri uri) {
            return new C12415b(uri, new Format.C4362b().m29900S("0").m29908K("application/x-mpegURL").m29914E(), null, null, null, null);
        }

        /* renamed from: a */
        public C12415b m5338a(Format format) {
            return new C12415b(this.f32265a, format, this.f32267c, this.f32268d, this.f32269e, this.f32270f);
        }
    }

    public C12413f(String str, List<String> list, List<C12415b> list2, List<C12414a> list3, List<C12414a> list4, List<C12414a> list5, List<C12414a> list6, Format format, List<Format> list7, boolean z, Map<String, String> map, List<C11028l> list8) {
        super(str, list, z);
        List<Format> list9;
        this.f32251d = Collections.unmodifiableList(m5339f(list2, list3, list4, list5, list6));
        this.f32252e = Collections.unmodifiableList(list2);
        this.f32253f = Collections.unmodifiableList(list3);
        this.f32254g = Collections.unmodifiableList(list4);
        this.f32255h = Collections.unmodifiableList(list5);
        this.f32256i = Collections.unmodifiableList(list6);
        this.f32257j = format;
        if (list7 != null) {
            list9 = Collections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f32258k = list9;
        this.f32259l = Collections.unmodifiableMap(map);
        this.f32260m = Collections.unmodifiableList(list8);
    }

    /* renamed from: b */
    private static void m5343b(List<C12414a> list, List<Uri> list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).f32261a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    /* renamed from: d */
    private static <T> List<T> m5341d(List<T> list, int i, List<C10059c> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            T t = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    C10059c c10059c = list2.get(i3);
                    if (c10059c.f26155k == i && c10059c.f26156l == i2) {
                        arrayList.add(t);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static C12413f m5340e(String str) {
        return new C12413f("", Collections.emptyList(), Collections.singletonList(C12415b.m5337b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    /* renamed from: f */
    private static List<Uri> m5339f(List<C12415b> list, List<C12414a> list2, List<C12414a> list3, List<C12414a> list4, List<C12414a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).f32265a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m5343b(list2, arrayList);
        m5343b(list3, arrayList);
        m5343b(list4, arrayList);
        m5343b(list5, arrayList);
        return arrayList;
    }

    @Override // p212l7.InterfaceC10057a
    /* renamed from: c */
    public C12413f mo3731a(List<C10059c> list) {
        return new C12413f(this.f32311a, this.f32312b, m5341d(this.f32252e, 0, list), Collections.emptyList(), m5341d(this.f32254g, 1, list), m5341d(this.f32255h, 2, list), Collections.emptyList(), this.f32257j, this.f32258k, this.f32313c, this.f32259l, this.f32260m);
    }
}