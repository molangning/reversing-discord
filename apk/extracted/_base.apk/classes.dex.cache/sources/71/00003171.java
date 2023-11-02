package dj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0014J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u001b"}, m14357d2 = {"Ldj/h0;", "Ldj/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "d0", "tag", "Lkotlinx/serialization/json/JsonElement;", "h0", "o", "Lkotlinx/serialization/json/JsonArray;", "f", "Lkotlinx/serialization/json/JsonArray;", "y0", "()Lkotlinx/serialization/json/JsonArray;", "value", "g", "I", "size", "h", "currentIndex", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonArray;)V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5989h0 extends AbstractC5977c {

    /* renamed from: f */
    private final JsonArray f17036f;

    /* renamed from: g */
    private final int f17037g;

    /* renamed from: h */
    private int f17038h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5989h0(Json json, JsonArray value) {
        super(json, value, null);
        C9612q.m13917h(json, "json");
        C9612q.m13917h(value, "value");
        this.f17036f = value;
        this.f17037g = mo23935w0().size();
        this.f17038h = -1;
    }

    @Override // p045cj.AbstractC2564b1
    /* renamed from: d0 */
    protected String mo23937d0(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return String.valueOf(i);
    }

    @Override // dj.AbstractC5977c
    /* renamed from: h0 */
    protected JsonElement mo23936h0(String tag) {
        C9612q.m13917h(tag, "tag");
        return mo23935w0().get(Integer.parseInt(tag));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: o */
    public int mo12866o(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        int i = this.f17038h;
        if (i < this.f17037g - 1) {
            int i2 = i + 1;
            this.f17038h = i2;
            return i2;
        }
        return -1;
    }

    @Override // dj.AbstractC5977c
    /* renamed from: y0 */
    public JsonArray mo23935w0() {
        return this.f17036f;
    }
}