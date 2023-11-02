package dj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m14357d2 = {"Ldj/d0;", "Ldj/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "o", "", "tag", "Lkotlinx/serialization/json/JsonElement;", "h0", "Lkotlinx/serialization/json/JsonPrimitive;", "f", "Lkotlinx/serialization/json/JsonPrimitive;", "y0", "()Lkotlinx/serialization/json/JsonPrimitive;", "value", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonPrimitive;)V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5981d0 extends AbstractC5977c {

    /* renamed from: f */
    private final JsonPrimitive f17020f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5981d0(Json json, JsonPrimitive value) {
        super(json, value, null);
        C9612q.m13917h(json, "json");
        C9612q.m13917h(value, "value");
        this.f17020f = value;
        m32963a0("primitive");
    }

    @Override // dj.AbstractC5977c
    /* renamed from: h0 */
    protected JsonElement mo23936h0(String tag) {
        boolean z;
        C9612q.m13917h(tag, "tag");
        if (tag == "primitive") {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return mo23935w0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: o */
    public int mo12866o(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        return 0;
    }

    @Override // dj.AbstractC5977c
    /* renamed from: y0 */
    public JsonPrimitive mo23935w0() {
        return this.f17020f;
    }
}