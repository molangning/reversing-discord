package io.sentry.internal.modules;

import io.sentry.InterfaceC8040o0;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: io.sentry.internal.modules.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7983a extends AbstractC7987d {

    /* renamed from: d */
    private final List<InterfaceC7984b> f21656d;

    public C7983a(List<InterfaceC7984b> list, InterfaceC8040o0 interfaceC8040o0) {
        super(interfaceC8040o0);
        this.f21656d = list;
    }

    @Override // io.sentry.internal.modules.AbstractC7987d
    /* renamed from: b */
    protected Map<String, String> mo19092b() {
        TreeMap treeMap = new TreeMap();
        for (InterfaceC7984b interfaceC7984b : this.f21656d) {
            Map<String, String> mo19094a = interfaceC7984b.mo19094a();
            if (mo19094a != null) {
                treeMap.putAll(mo19094a);
            }
        }
        return treeMap;
    }
}