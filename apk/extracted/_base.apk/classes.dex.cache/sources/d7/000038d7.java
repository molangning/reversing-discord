package io.sentry.cache;

import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC7894d1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* renamed from: io.sentry.cache.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C7848c {

    /* renamed from: a */
    private static final Charset f21444a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static void m19552a(C8132r4 c8132r4, String str, String str2) {
        File m19551b = m19551b(c8132r4, str);
        if (m19551b == null) {
            c8132r4.getLogger().mo18135c(EnumC8021m4.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(m19551b, str2);
        if (file.exists()) {
            c8132r4.getLogger().mo18135c(EnumC8021m4.DEBUG, "Deleting %s from scope cache", str2);
            if (!file.delete()) {
                c8132r4.getLogger().mo18135c(EnumC8021m4.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
    }

    /* renamed from: b */
    private static File m19551b(C8132r4 c8132r4, String str) {
        String cacheDirPath = c8132r4.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    /* renamed from: c */
    public static <T, R> T m19550c(C8132r4 c8132r4, String str, String str2, Class<T> cls, InterfaceC7894d1<R> interfaceC7894d1) {
        File m19551b = m19551b(c8132r4, str);
        if (m19551b == null) {
            c8132r4.getLogger().mo18135c(EnumC8021m4.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(m19551b, str2);
        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f21444a));
                if (interfaceC7894d1 == null) {
                    T t = (T) c8132r4.getSerializer().mo17982c(bufferedReader, cls);
                    bufferedReader.close();
                    return t;
                }
                T t2 = (T) c8132r4.getSerializer().mo17980e(bufferedReader, cls, interfaceC7894d1);
                bufferedReader.close();
                return t2;
            } catch (Throwable th2) {
                c8132r4.getLogger().mo18137a(EnumC8021m4.ERROR, th2, "Error reading entity from scope cache: %s", str2);
            }
        } else {
            c8132r4.getLogger().mo18135c(EnumC8021m4.DEBUG, "No entry stored for %s", str2);
        }
        return null;
    }

    /* renamed from: d */
    public static <T> void m19549d(C8132r4 c8132r4, T t, String str, String str2) {
        File m19551b = m19551b(c8132r4, str);
        if (m19551b == null) {
            c8132r4.getLogger().mo18135c(EnumC8021m4.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        File file = new File(m19551b, str2);
        if (file.exists()) {
            c8132r4.getLogger().mo18135c(EnumC8021m4.DEBUG, "Overwriting %s in scope cache", str2);
            if (!file.delete()) {
                c8132r4.getLogger().mo18135c(EnumC8021m4.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f21444a));
            c8132r4.getSerializer().mo17984a(t, bufferedWriter);
            bufferedWriter.close();
            fileOutputStream.close();
        } catch (Throwable th2) {
            c8132r4.getLogger().mo18137a(EnumC8021m4.ERROR, th2, "Error persisting entity: %s", str2);
        }
    }
}