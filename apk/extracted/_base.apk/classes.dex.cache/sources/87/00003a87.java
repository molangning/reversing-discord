package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* renamed from: io.sentry.z1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C8278z1 implements InterfaceC8243v0 {

    /* renamed from: a */
    private static final C8278z1 f22250a = new C8278z1();

    private C8278z1() {
    }

    /* renamed from: g */
    public static C8278z1 m17978g() {
        return f22250a;
    }

    @Override // io.sentry.InterfaceC8243v0
    /* renamed from: a */
    public <T> void mo17984a(T t, Writer writer) {
    }

    @Override // io.sentry.InterfaceC8243v0
    /* renamed from: b */
    public void mo17983b(C8020m3 c8020m3, OutputStream outputStream) {
    }

    @Override // io.sentry.InterfaceC8243v0
    /* renamed from: c */
    public <T> T mo17982c(Reader reader, Class<T> cls) {
        return null;
    }

    @Override // io.sentry.InterfaceC8243v0
    /* renamed from: d */
    public C8020m3 mo17981d(InputStream inputStream) {
        return null;
    }

    @Override // io.sentry.InterfaceC8243v0
    /* renamed from: e */
    public <T, R> T mo17980e(Reader reader, Class<T> cls, InterfaceC7894d1<R> interfaceC7894d1) {
        return null;
    }

    @Override // io.sentry.InterfaceC8243v0
    /* renamed from: f */
    public String mo17979f(Map<String, Object> map) {
        return "";
    }
}