package dj;

import bj.AbstractC2322d;
import bj.AbstractC2342h;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C9560w;
import kotlin.collections.C9561x;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC9936c;
import kotlinx.serialization.json.C9964g;
import kotlinx.serialization.json.C9987v;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p045cj.C2619n0;
import p304qf.C11889v;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010)J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006*"}, m14357d2 = {"Ldj/g0;", "Ldj/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "tag", "", "z0", "y0", "o", "D", "d0", "Lkotlinx/serialization/json/JsonElement;", "h0", "Lkotlinx/serialization/encoding/c;", "b", "", "c", "Lkotlinx/serialization/json/JsonObject;", "f", "Lkotlinx/serialization/json/JsonObject;", "A0", "()Lkotlinx/serialization/json/JsonObject;", "value", "g", "Ljava/lang/String;", "polyDiscriminator", "h", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "polyDescriptor", "i", "I", ViewProps.POSITION, "j", "Z", "forceNull", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C5987g0 extends AbstractC5977c {

    /* renamed from: f */
    private final JsonObject f17029f;

    /* renamed from: g */
    private final String f17030g;

    /* renamed from: h */
    private final SerialDescriptor f17031h;

    /* renamed from: i */
    private int f17032i;

    /* renamed from: j */
    private boolean f17033j;

    public /* synthetic */ C5987g0(Json json, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonObject, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : serialDescriptor);
    }

    /* renamed from: y0 */
    private final boolean m23949y0(SerialDescriptor serialDescriptor, int i) {
        boolean z;
        if (!mo12744d().m12780e().m12752f() && !serialDescriptor.mo12681j(i) && serialDescriptor.mo12683h(i).mo12689b()) {
            z = true;
        } else {
            z = false;
        }
        this.f17033j = z;
        return z;
    }

    /* renamed from: z0 */
    private final boolean m23948z0(SerialDescriptor serialDescriptor, int i, String str) {
        JsonPrimitive jsonPrimitive;
        Json mo12744d = mo12744d();
        SerialDescriptor mo12683h = serialDescriptor.mo12683h(i);
        if (!mo12683h.mo12689b() && (mo23936h0(str) instanceof JsonNull)) {
            return true;
        }
        if (C9612q.m13922c(mo12683h.mo12684g(), AbstractC2342h.C2344b.f6454a) && (!mo12683h.mo12689b() || !(mo23936h0(str) instanceof JsonNull))) {
            JsonElement mo23936h0 = mo23936h0(str);
            String str2 = null;
            if (mo23936h0 instanceof JsonPrimitive) {
                jsonPrimitive = (JsonPrimitive) mo23936h0;
            } else {
                jsonPrimitive = null;
            }
            if (jsonPrimitive != null) {
                str2 = C9964g.m12732h(jsonPrimitive);
            }
            if (str2 != null && C5975b0.m23999g(mo12683h, mo12744d, str2) == -3) {
                return true;
            }
        }
        return false;
    }

    @Override // dj.AbstractC5977c
    /* renamed from: A0 */
    public JsonObject mo23935w0() {
        return this.f17029f;
    }

    @Override // dj.AbstractC5977c, p045cj.AbstractC2565b2, kotlinx.serialization.encoding.Decoder
    /* renamed from: D */
    public boolean mo12925D() {
        return !this.f17033j && super.mo12925D();
    }

    @Override // dj.AbstractC5977c, kotlinx.serialization.encoding.Decoder
    /* renamed from: b */
    public InterfaceC9936c mo12920b(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        if (descriptor == this.f17031h) {
            return this;
        }
        return super.mo12920b(descriptor);
    }

    @Override // dj.AbstractC5977c, p045cj.AbstractC2565b2, kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: c */
    public void mo12872c(SerialDescriptor descriptor) {
        Set set;
        Set<String> m13999l;
        C9612q.m13917h(descriptor, "descriptor");
        if (!this.f17014e.m12751g() && !(descriptor.mo12684g() instanceof AbstractC2322d)) {
            C5975b0.m23995k(descriptor, mo12744d());
            if (!this.f17014e.m12747k()) {
                m13999l = C2619n0.m32838a(descriptor);
            } else {
                Set<String> m32838a = C2619n0.m32838a(descriptor);
                Map map = (Map) C9987v.m12678a(mo12744d()).m23865a(descriptor, C5975b0.m24001e());
                if (map != null) {
                    set = map.keySet();
                } else {
                    set = null;
                }
                if (set == null) {
                    set = C9560w.m14007d();
                }
                m13999l = C9561x.m13999l(m32838a, set);
            }
            for (String str : mo23935w0().keySet()) {
                if (!m13999l.contains(str) && !C9612q.m13922c(str, this.f17030g)) {
                    throw C5973a0.m24012f(str, mo23935w0().toString());
                }
            }
        }
    }

    @Override // p045cj.AbstractC2564b1
    /* renamed from: d0 */
    protected String mo23937d0(SerialDescriptor descriptor, int i) {
        Object obj;
        boolean z;
        C9612q.m13917h(descriptor, "descriptor");
        C5975b0.m23995k(descriptor, mo12744d());
        String mo12686e = descriptor.mo12686e(i);
        if (!this.f17014e.m12747k()) {
            return mo12686e;
        }
        if (mo23935w0().keySet().contains(mo12686e)) {
            return mo12686e;
        }
        Map<String, Integer> m24002d = C5975b0.m24002d(mo12744d(), descriptor);
        Iterator<T> it = mo23935w0().keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Integer num = m24002d.get((String) obj);
                if (num != null && num.intValue() == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            return str;
        }
        return mo12686e;
    }

    @Override // dj.AbstractC5977c
    /* renamed from: h0 */
    protected JsonElement mo23936h0(String tag) {
        Object m6753i;
        C9612q.m13917h(tag, "tag");
        m6753i = C11889v.m6753i(mo23935w0(), tag);
        return (JsonElement) m6753i;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: o */
    public int mo12866o(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        while (this.f17032i < descriptor.mo12687d()) {
            int i = this.f17032i;
            this.f17032i = i + 1;
            String mo32965Y = mo32965Y(descriptor, i);
            int i2 = this.f17032i - 1;
            this.f17033j = false;
            if (mo23935w0().containsKey(mo32965Y) || m23949y0(descriptor, i2)) {
                if (!this.f17014e.m12754d() || !m23948z0(descriptor, i2, mo32965Y)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5987g0(Json json, JsonObject value, String str, SerialDescriptor serialDescriptor) {
        super(json, value, null);
        C9612q.m13917h(json, "json");
        C9612q.m13917h(value, "value");
        this.f17029f = value;
        this.f17030g = str;
        this.f17031h = serialDescriptor;
    }
}
