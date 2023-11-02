package lc;

import java.util.List;

/* renamed from: lc.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10123e {

    /* renamed from: a */
    private final byte[] f26402a;

    /* renamed from: b */
    private int f26403b;

    /* renamed from: c */
    private final String f26404c;

    /* renamed from: d */
    private final List<byte[]> f26405d;

    /* renamed from: e */
    private final String f26406e;

    /* renamed from: f */
    private Integer f26407f;

    /* renamed from: g */
    private Integer f26408g;

    /* renamed from: h */
    private Object f26409h;

    /* renamed from: i */
    private final int f26410i;

    /* renamed from: j */
    private final int f26411j;

    public C10123e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    /* renamed from: a */
    public List<byte[]> m12235a() {
        return this.f26405d;
    }

    /* renamed from: b */
    public String m12234b() {
        return this.f26406e;
    }

    /* renamed from: c */
    public int m12233c() {
        return this.f26403b;
    }

    /* renamed from: d */
    public Object m12232d() {
        return this.f26409h;
    }

    /* renamed from: e */
    public byte[] m12231e() {
        return this.f26402a;
    }

    /* renamed from: f */
    public int m12230f() {
        return this.f26410i;
    }

    /* renamed from: g */
    public int m12229g() {
        return this.f26411j;
    }

    /* renamed from: h */
    public String m12228h() {
        return this.f26404c;
    }

    /* renamed from: i */
    public boolean m12227i() {
        return this.f26410i >= 0 && this.f26411j >= 0;
    }

    /* renamed from: j */
    public void m12226j(Integer num) {
        this.f26408g = num;
    }

    /* renamed from: k */
    public void m12225k(Integer num) {
        this.f26407f = num;
    }

    /* renamed from: l */
    public void m12224l(int i) {
        this.f26403b = i;
    }

    /* renamed from: m */
    public void m12223m(Object obj) {
        this.f26409h = obj;
    }

    public C10123e(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.f26402a = bArr;
        this.f26403b = bArr == null ? 0 : bArr.length * 8;
        this.f26404c = str;
        this.f26405d = list;
        this.f26406e = str2;
        this.f26410i = i2;
        this.f26411j = i;
    }
}
