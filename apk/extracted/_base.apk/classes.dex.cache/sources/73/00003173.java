package dj;

import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.C9964g;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import p304qf.C11889v;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0014J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006!"}, m14357d2 = {"Ldj/i0;", "Ldj/g0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "d0", "o", "tag", "Lkotlinx/serialization/json/JsonElement;", "h0", "", "c", "Lkotlinx/serialization/json/JsonObject;", "k", "Lkotlinx/serialization/json/JsonObject;", "A0", "()Lkotlinx/serialization/json/JsonObject;", "value", "", "l", "Ljava/util/List;", "keys", "m", "I", "size", "n", ViewProps.POSITION, "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonObject;)V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5991i0 extends C5987g0 {

    /* renamed from: k */
    private final JsonObject f17040k;

    /* renamed from: l */
    private final List<String> f17041l;

    /* renamed from: m */
    private final int f17042m;

    /* renamed from: n */
    private int f17043n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5991i0(Json json, JsonObject value) {
        super(json, value, null, null, 12, null);
        List<String> m14075C0;
        C9612q.m13917h(json, "json");
        C9612q.m13917h(value, "value");
        this.f17040k = value;
        m14075C0 = C9553r.m14075C0(mo23935w0().keySet());
        this.f17041l = m14075C0;
        this.f17042m = m14075C0.size() * 2;
        this.f17043n = -1;
    }

    @Override // dj.C5987g0, dj.AbstractC5977c
    /* renamed from: A0 */
    public JsonObject mo23935w0() {
        return this.f17040k;
    }

    @Override // dj.C5987g0, dj.AbstractC5977c, p045cj.AbstractC2565b2, kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: c */
    public void mo12872c(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
    }

    @Override // dj.C5987g0, p045cj.AbstractC2564b1
    /* renamed from: d0 */
    protected String mo23937d0(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return this.f17041l.get(i / 2);
    }

    @Override // dj.C5987g0, dj.AbstractC5977c
    /* renamed from: h0 */
    protected JsonElement mo23936h0(String tag) {
        Object m6753i;
        C9612q.m13917h(tag, "tag");
        if (this.f17043n % 2 == 0) {
            return C9964g.m12736d(tag);
        }
        m6753i = C11889v.m6753i(mo23935w0(), tag);
        return (JsonElement) m6753i;
    }

    @Override // dj.C5987g0, kotlinx.serialization.encoding.InterfaceC9936c
    /* renamed from: o */
    public int mo12866o(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        int i = this.f17043n;
        if (i < this.f17042m - 1) {
            int i2 = i + 1;
            this.f17043n = i2;
            return i2;
        }
        return -1;
    }
}