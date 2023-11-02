package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* renamed from: io.sentry.v0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC8243v0 {
    /* renamed from: a */
    <T> void mo17984a(T t, Writer writer);

    /* renamed from: b */
    void mo17983b(C8020m3 c8020m3, OutputStream outputStream);

    /* renamed from: c */
    <T> T mo17982c(Reader reader, Class<T> cls);

    /* renamed from: d */
    C8020m3 mo17981d(InputStream inputStream);

    /* renamed from: e */
    <T, R> T mo17980e(Reader reader, Class<T> cls, InterfaceC7894d1<R> interfaceC7894d1);

    /* renamed from: f */
    String mo17979f(Map<String, Object> map);
}
