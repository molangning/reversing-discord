package kotlinx.serialization.json;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlinx.serialization.KSerializer;
import p470zi.InterfaceC14277f;
import pf.C11577n;
import pf.EnumC11580p;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002HÆ\u0001R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m14357d2 = {"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/KSerializer;", "serializer", "", "j", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "content", "", "e", "()Z", "isString", "<init>", "()V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
@InterfaceC14277f(with = C9982r.class)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class JsonNull extends JsonPrimitive {
    public static final JsonNull INSTANCE = new JsonNull();

    /* renamed from: j */
    private static final String f25848j = "null";

    /* renamed from: k */
    private static final /* synthetic */ Lazy<KSerializer<Object>> f25849k;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: kotlinx.serialization.json.JsonNull$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C9955a extends AbstractC9614s implements Function0<KSerializer<Object>> {

        /* renamed from: j */
        public static final C9955a f25850j = new C9955a();

        C9955a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return C9982r.f25885a;
        }
    }

    static {
        Lazy<KSerializer<Object>> m7600b;
        m7600b = C11577n.m7600b(EnumC11580p.PUBLICATION, C9955a.f25850j);
        f25849k = m7600b;
    }

    private JsonNull() {
        super(null);
    }

    /* renamed from: h */
    private final /* synthetic */ Lazy m12769h() {
        return f25849k;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* renamed from: a */
    public String mo12700a() {
        return f25848j;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* renamed from: e */
    public boolean mo12699e() {
        return false;
    }

    public final KSerializer<JsonNull> serializer() {
        return (KSerializer) m12769h().getValue();
    }
}
