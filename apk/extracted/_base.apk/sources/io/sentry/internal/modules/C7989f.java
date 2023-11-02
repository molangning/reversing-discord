package io.sentry.internal.modules;

import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import io.sentry.util.C8211a;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: io.sentry.internal.modules.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7989f extends AbstractC7987d {

    /* renamed from: d */
    private final ClassLoader f21666d;

    public C7989f(InterfaceC8040o0 interfaceC8040o0) {
        this(interfaceC8040o0, C7989f.class.getClassLoader());
    }

    @Override // io.sentry.internal.modules.AbstractC7987d
    /* renamed from: b */
    protected Map<String, String> mo19092b() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream resourceAsStream = this.f21666d.getResourceAsStream("sentry-external-modules.txt");
            if (resourceAsStream == null) {
                this.f21663a.mo18135c(EnumC8021m4.INFO, "%s file was not found.", "sentry-external-modules.txt");
                return treeMap;
            }
            return m19095c(resourceAsStream);
        } catch (SecurityException e) {
            this.f21663a.mo18136b(EnumC8021m4.INFO, "Access to resources denied.", e);
            return treeMap;
        }
    }

    C7989f(InterfaceC8040o0 interfaceC8040o0, ClassLoader classLoader) {
        super(interfaceC8040o0);
        this.f21666d = C8211a.m18240a(classLoader);
    }
}
