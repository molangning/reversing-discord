package io.sentry.clientreport;

import io.sentry.EnumC7960i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p164j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.clientreport.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7870a implements InterfaceC7879h {

    /* renamed from: a */
    private final Map<C7873c, AtomicLong> f21481a;

    public C7870a() {
        EnumC7875e[] values;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (EnumC7875e enumC7875e : EnumC7875e.values()) {
            for (EnumC7960i enumC7960i : EnumC7960i.values()) {
                concurrentHashMap.put(new C7873c(enumC7875e.getReason(), enumC7960i.getCategory()), new AtomicLong(0L));
            }
        }
        this.f21481a = Collections.unmodifiableMap(concurrentHashMap);
    }

    @Override // io.sentry.clientreport.InterfaceC7879h
    /* renamed from: a */
    public void mo19476a(C7873c c7873c, Long l) {
        AtomicLong atomicLong = this.f21481a.get(c7873c);
        if (atomicLong != null) {
            atomicLong.addAndGet(l.longValue());
        }
    }

    @Override // io.sentry.clientreport.InterfaceC7879h
    /* renamed from: b */
    public List<C7876f> mo19475b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<C7873c, AtomicLong> entry : this.f21481a.entrySet()) {
            Long valueOf = Long.valueOf(entry.getValue().getAndSet(0L));
            if (valueOf.longValue() > 0) {
                arrayList.add(new C7876f(entry.getKey().m19487b(), entry.getKey().m19488a(), valueOf));
            }
        }
        return arrayList;
    }
}