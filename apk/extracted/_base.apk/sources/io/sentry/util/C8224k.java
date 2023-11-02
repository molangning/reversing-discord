package io.sentry.util;

import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.InterfaceC8243v0;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: io.sentry.util.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8224k {

    /* renamed from: a */
    private static final Charset f22145a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static List<Object> m18207a(AtomicIntegerArray atomicIntegerArray) {
        int length = atomicIntegerArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(Integer.valueOf(atomicIntegerArray.get(i)));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static byte[] m18206b(InterfaceC8243v0 interfaceC8243v0, InterfaceC8040o0 interfaceC8040o0, InterfaceC8026n1 interfaceC8026n1) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f22145a));
            try {
                interfaceC8243v0.mo17984a(interfaceC8026n1, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Could not serialize serializable", th4);
            return null;
        }
    }

    /* renamed from: c */
    public static Map<String, Object> m18205c(Calendar calendar) {
        HashMap hashMap = new HashMap();
        hashMap.put("year", Integer.valueOf(calendar.get(1)));
        hashMap.put("month", Integer.valueOf(calendar.get(2)));
        hashMap.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        hashMap.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        hashMap.put("minute", Integer.valueOf(calendar.get(12)));
        hashMap.put("second", Integer.valueOf(calendar.get(13)));
        return hashMap;
    }
}
