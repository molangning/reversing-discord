package com.google.firebase.installations;

import ac.AbstractC0145d;
import android.text.TextUtils;
import cc.C2488b;
import cc.InterfaceC2487a;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.installations.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5058i {

    /* renamed from: b */
    public static final long f14260b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    private static final Pattern f14261c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    private static C5058i f14262d;

    /* renamed from: a */
    private final InterfaceC2487a f14263a;

    private C5058i(InterfaceC2487a interfaceC2487a) {
        this.f14263a = interfaceC2487a;
    }

    /* renamed from: c */
    public static C5058i m26396c() {
        return m26395d(C2488b.m33143b());
    }

    /* renamed from: d */
    public static C5058i m26395d(InterfaceC2487a interfaceC2487a) {
        if (f14262d == null) {
            f14262d = new C5058i(interfaceC2487a);
        }
        return f14262d;
    }

    /* renamed from: g */
    public static boolean m26392g(String str) {
        return f14261c.matcher(str).matches();
    }

    /* renamed from: h */
    public static boolean m26391h(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long m26398a() {
        return this.f14263a.mo33144a();
    }

    /* renamed from: b */
    public long m26397b() {
        return TimeUnit.MILLISECONDS.toSeconds(m26398a());
    }

    /* renamed from: e */
    public long m26394e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean m26393f(AbstractC0145d abstractC0145d) {
        if (TextUtils.isEmpty(abstractC0145d.mo41097b()) || abstractC0145d.mo41091h() + abstractC0145d.mo41096c() < m26397b() + f14260b) {
            return true;
        }
        return false;
    }
}