package kotlinx.serialization.json;

import dj.C6001m0;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p088ej.AbstractC6257c;
import p088ej.C6258d;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\n"}, m14357d2 = {"Lkotlinx/serialization/json/k;", "Lkotlinx/serialization/json/Json;", "", "h", "Lkotlinx/serialization/json/c;", "configuration", "Lej/c;", "module", "<init>", "(Lkotlinx/serialization/json/c;Lej/c;)V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9975k extends Json {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9975k(C9960c configuration, AbstractC6257c module) {
        super(configuration, module, null);
        C9612q.m13917h(configuration, "configuration");
        C9612q.m13917h(module, "module");
        m12704h();
    }

    /* renamed from: h */
    private final void m12704h() {
        if (C9612q.m13922c(mo265a(), C6258d.m23140a())) {
            return;
        }
        mo265a().mo23145a(new C6001m0(m12780e().m12746l(), m12780e().m12755c()));
    }
}