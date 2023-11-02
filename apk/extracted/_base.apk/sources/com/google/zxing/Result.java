package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;
import p136hc.C7069o;
import p136hc.EnumC7055a;
import p136hc.EnumC7068n;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class Result {

    /* renamed from: a */
    private final String f14443a;

    /* renamed from: b */
    private final byte[] f14444b;

    /* renamed from: c */
    private final int f14445c;

    /* renamed from: d */
    private C7069o[] f14446d;

    /* renamed from: e */
    private final EnumC7055a f14447e;

    /* renamed from: f */
    private Map<EnumC7068n, Object> f14448f;

    /* renamed from: g */
    private final long f14449g;

    public Result(String str, byte[] bArr, C7069o[] c7069oArr, EnumC7055a enumC7055a) {
        this(str, bArr, c7069oArr, enumC7055a, System.currentTimeMillis());
    }

    /* renamed from: a */
    public void m26114a(C7069o[] c7069oArr) {
        C7069o[] c7069oArr2 = this.f14446d;
        if (c7069oArr2 == null) {
            this.f14446d = c7069oArr;
        } else if (c7069oArr != null && c7069oArr.length > 0) {
            C7069o[] c7069oArr3 = new C7069o[c7069oArr2.length + c7069oArr.length];
            System.arraycopy(c7069oArr2, 0, c7069oArr3, 0, c7069oArr2.length);
            System.arraycopy(c7069oArr, 0, c7069oArr3, c7069oArr2.length, c7069oArr.length);
            this.f14446d = c7069oArr3;
        }
    }

    /* renamed from: b */
    public EnumC7055a m26113b() {
        return this.f14447e;
    }

    /* renamed from: c */
    public byte[] m26112c() {
        return this.f14444b;
    }

    /* renamed from: d */
    public Map<EnumC7068n, Object> m26111d() {
        return this.f14448f;
    }

    /* renamed from: e */
    public C7069o[] m26110e() {
        return this.f14446d;
    }

    /* renamed from: f */
    public String m26109f() {
        return this.f14443a;
    }

    /* renamed from: g */
    public void m26108g(Map<EnumC7068n, Object> map) {
        if (map != null) {
            Map<EnumC7068n, Object> map2 = this.f14448f;
            if (map2 == null) {
                this.f14448f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: h */
    public void m26107h(EnumC7068n enumC7068n, Object obj) {
        if (this.f14448f == null) {
            this.f14448f = new EnumMap(EnumC7068n.class);
        }
        this.f14448f.put(enumC7068n, obj);
    }

    public String toString() {
        return this.f14443a;
    }

    public Result(String str, byte[] bArr, C7069o[] c7069oArr, EnumC7055a enumC7055a, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, c7069oArr, enumC7055a, j);
    }

    public Result(String str, byte[] bArr, int i, C7069o[] c7069oArr, EnumC7055a enumC7055a, long j) {
        this.f14443a = str;
        this.f14444b = bArr;
        this.f14445c = i;
        this.f14446d = c7069oArr;
        this.f14447e = enumC7055a;
        this.f14448f = null;
        this.f14449g = j;
    }
}
