package p167j1;

import p073e1.C6062k;
import p236n.C10477a;

/* renamed from: j1.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C8786g {

    /* renamed from: b */
    private static final C8786g f23056b = new C8786g();

    /* renamed from: a */
    private final C10477a<String, C6062k> f23057a = new C10477a<>(20);

    C8786g() {
    }

    /* renamed from: b */
    public static C8786g m17249b() {
        return f23056b;
    }

    /* renamed from: a */
    public C6062k m17250a(String str) {
        if (str == null) {
            return null;
        }
        return this.f23057a.m11428c(str);
    }

    /* renamed from: c */
    public void m17248c(String str, C6062k c6062k) {
        if (str == null) {
            return;
        }
        this.f23057a.m11427d(str, c6062k);
    }
}
