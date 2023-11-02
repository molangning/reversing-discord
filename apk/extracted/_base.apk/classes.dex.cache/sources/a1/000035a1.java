package p136hc;

import lc.C10119a;
import lc.C10120b;

/* renamed from: hc.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7057c {

    /* renamed from: a */
    private final AbstractC7056b f19322a;

    /* renamed from: b */
    private C10120b f19323b;

    public C7057c(AbstractC7056b abstractC7056b) {
        if (abstractC7056b != null) {
            this.f19322a = abstractC7056b;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    /* renamed from: a */
    public C10120b m21478a() {
        if (this.f19323b == null) {
            this.f19323b = this.f19322a.mo12212b();
        }
        return this.f19323b;
    }

    /* renamed from: b */
    public C10119a m21477b(int i, C10119a c10119a) {
        return this.f19322a.mo12220c(i, c10119a);
    }

    /* renamed from: c */
    public int m21476c() {
        return this.f19322a.m21481d();
    }

    /* renamed from: d */
    public int m21475d() {
        return this.f19322a.m21479f();
    }

    /* renamed from: e */
    public boolean m21474e() {
        return this.f19322a.m21480e().mo21466f();
    }

    /* renamed from: f */
    public C7057c m21473f() {
        return new C7057c(this.f19322a.mo12213a(this.f19322a.m21480e().mo21465g()));
    }

    public String toString() {
        try {
            return m21478a().toString();
        } catch (C7064j unused) {
            return "";
        }
    }
}