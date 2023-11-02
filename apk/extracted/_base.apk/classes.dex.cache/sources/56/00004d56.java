package p346t4;

import java.io.IOException;
import java.io.InputStream;
import p075e3.C6101d;
import p380v4.C13065e;
import p394w2.C13368b;
import p394w2.C13379j;
import p394w2.C13386n;
import p455z2.C14077f;
import p455z2.InterfaceC14072a;

/* renamed from: t4.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12582f {

    /* renamed from: g */
    private boolean f32654g;

    /* renamed from: h */
    private final InterfaceC14072a f32655h;

    /* renamed from: c */
    private int f32650c = 0;

    /* renamed from: b */
    private int f32649b = 0;

    /* renamed from: d */
    private int f32651d = 0;

    /* renamed from: f */
    private int f32653f = 0;

    /* renamed from: e */
    private int f32652e = 0;

    /* renamed from: a */
    private int f32648a = 0;

    public C12582f(InterfaceC14072a interfaceC14072a) {
        this.f32655h = (InterfaceC14072a) C13379j.m2677g(interfaceC14072a);
    }

    /* renamed from: a */
    private boolean m4766a(InputStream inputStream) {
        int read;
        int i = this.f32652e;
        while (this.f32648a != 6 && (read = inputStream.read()) != -1) {
            try {
                int i2 = this.f32650c + 1;
                this.f32650c = i2;
                if (this.f32654g) {
                    this.f32648a = 6;
                    this.f32654g = false;
                    return false;
                }
                int i3 = this.f32648a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (i3 != 5) {
                                        C13379j.m2675i(false);
                                    } else {
                                        int i4 = ((this.f32649b << 8) + read) - 2;
                                        C6101d.m23576a(inputStream, i4);
                                        this.f32650c += i4;
                                        this.f32648a = 2;
                                    }
                                } else {
                                    this.f32648a = 5;
                                }
                            } else if (read == 255) {
                                this.f32648a = 3;
                            } else if (read == 0) {
                                this.f32648a = 2;
                            } else if (read == 217) {
                                this.f32654g = true;
                                m4761f(i2 - 2);
                                this.f32648a = 2;
                            } else {
                                if (read == 218) {
                                    m4761f(i2 - 2);
                                }
                                if (m4765b(read)) {
                                    this.f32648a = 4;
                                } else {
                                    this.f32648a = 2;
                                }
                            }
                        } else if (read == 255) {
                            this.f32648a = 3;
                        }
                    } else if (read == 216) {
                        this.f32648a = 2;
                    } else {
                        this.f32648a = 6;
                    }
                } else if (read == 255) {
                    this.f32648a = 1;
                } else {
                    this.f32648a = 6;
                }
                this.f32649b = read;
            } catch (IOException e) {
                C13386n.m2666a(e);
            }
        }
        if (this.f32648a == 6 || this.f32652e == i) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m4765b(int i) {
        if (i == 1) {
            return false;
        }
        return ((i >= 208 && i <= 215) || i == 217 || i == 216) ? false : true;
    }

    /* renamed from: f */
    private void m4761f(int i) {
        int i2 = this.f32651d;
        if (i2 > 0) {
            this.f32653f = i;
        }
        this.f32651d = i2 + 1;
        this.f32652e = i2;
    }

    /* renamed from: c */
    public int m4764c() {
        return this.f32653f;
    }

    /* renamed from: d */
    public int m4763d() {
        return this.f32652e;
    }

    /* renamed from: e */
    public boolean m4762e() {
        return this.f32654g;
    }

    /* renamed from: g */
    public boolean m4760g(C13065e c13065e) {
        if (this.f32648a == 6 || c13065e.m3344R() <= this.f32650c) {
            return false;
        }
        C14077f c14077f = new C14077f(c13065e.m3349H(), this.f32655h.get(16384), this.f32655h);
        try {
            C6101d.m23576a(c14077f, this.f32650c);
            return m4766a(c14077f);
        } catch (IOException e) {
            C13386n.m2666a(e);
            return false;
        } finally {
            C13368b.m2699b(c14077f);
        }
    }
}