package io.sentry.config;

import io.sentry.C8023m5;
import java.util.ArrayList;
import java.util.Properties;

/* renamed from: io.sentry.config.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7888h {
    /* renamed from: a */
    public static InterfaceC7887g m19457a() {
        Properties m19468a;
        Properties m19468a2;
        C8023m5 c8023m5 = new C8023m5();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C7890j());
        arrayList.add(new C7884d());
        String property = System.getProperty("sentry.properties.file");
        if (property != null && (m19468a2 = new C7885e(property, c8023m5).m19468a()) != null) {
            arrayList.add(new C7889i(m19468a2));
        }
        String str = System.getenv("SENTRY_PROPERTIES_FILE");
        if (str != null && (m19468a = new C7885e(str, c8023m5).m19468a()) != null) {
            arrayList.add(new C7889i(m19468a));
        }
        Properties m19470a = new C7882b(c8023m5).m19470a();
        if (m19470a != null) {
            arrayList.add(new C7889i(m19470a));
        }
        Properties m19468a3 = new C7885e("sentry.properties", c8023m5).m19468a();
        if (m19468a3 != null) {
            arrayList.add(new C7889i(m19468a3));
        }
        return new C7883c(arrayList);
    }
}