package kotlinx.serialization.json;

import cg.InterfaceC2533a;
import dj.C6014r0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import p164j$.util.Map;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.BiFunction;
import p164j$.util.function.Function;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0001$B\u001b\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\"\u0010#J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001H\u0096\u0001J\u0013\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0003J\t\u0010\n\u001a\u00020\u0005H\u0096\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00150\u00148\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, m14357d2 = {"Lkotlinx/serialization/json/JsonObject;", "Lkotlinx/serialization/json/JsonElement;", "", "", "key", "", "a", "value", "e", "h", "isEmpty", "", "other", "equals", "", "hashCode", "toString", "j", "Ljava/util/Map;", "content", "", "", "i", "()Ljava/util/Set;", "entries", "k", "keys", "o", "()I", "size", "", "p", "()Ljava/util/Collection;", "values", "<init>", "(Ljava/util/Map;)V", "Companion", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
@InterfaceC14277f(with = C9984t.class)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class JsonObject extends JsonElement implements Map<String, JsonElement>, InterfaceC2533a, p164j$.util.Map {
    public static final Companion Companion = new Companion(null);

    /* renamed from: j */
    private final Map<String, JsonElement> f25851j;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lkotlinx/serialization/json/JsonObject$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonObject;", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<JsonObject> serializer() {
            return C9984t.f25888a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"", "", "Lkotlinx/serialization/json/JsonElement;", "<name for destructuring parameter 0>", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.json.JsonObject$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C9956a extends AbstractC9614s implements Function1<Map.Entry<? extends String, ? extends JsonElement>, CharSequence> {

        /* renamed from: j */
        public static final C9956a f25852j = new C9956a();

        C9956a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(Map.Entry<String, ? extends JsonElement> entry) {
            C9612q.m13917h(entry, "<name for destructuring parameter 0>");
            StringBuilder sb2 = new StringBuilder();
            C6014r0.m23873c(sb2, entry.getKey());
            sb2.append(':');
            sb2.append(entry.getValue());
            String sb3 = sb2.toString();
            C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JsonObject(Map<String, ? extends JsonElement> content) {
        super(null);
        C9612q.m13917h(content, "content");
        this.f25851j = content;
    }

    /* renamed from: a */
    public boolean m12768a(String key) {
        C9612q.m13917h(key, "key");
        return this.f25851j.containsKey(key);
    }

    @Override // java.util.Map, p164j$.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p164j$.util.Map
    public /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.serialization.json.JsonElement, java.lang.Object] */
    @Override // java.util.Map
    public /* synthetic */ JsonElement compute(String str, java.util.function.BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        return compute(str, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // p164j$.util.Map
    public /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.serialization.json.JsonElement, java.lang.Object] */
    @Override // java.util.Map
    public /* synthetic */ JsonElement computeIfAbsent(String str, java.util.function.Function<? super String, ? extends JsonElement> function) {
        return computeIfAbsent(str, Function.VivifiedWrapper.convert(function));
    }

    @Override // p164j$.util.Map
    public /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.serialization.json.JsonElement, java.lang.Object] */
    @Override // java.util.Map
    public /* synthetic */ JsonElement computeIfPresent(String str, java.util.function.BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        return computeIfPresent(str, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p164j$.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return m12768a((String) obj);
        }
        return false;
    }

    @Override // java.util.Map, p164j$.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof JsonElement) {
            return m12767e((JsonElement) obj);
        }
        return false;
    }

    /* renamed from: e */
    public boolean m12767e(JsonElement value) {
        C9612q.m13917h(value, "value");
        return this.f25851j.containsValue(value);
    }

    @Override // java.util.Map, p164j$.util.Map
    public final /* bridge */ Set<Map.Entry<String, JsonElement>> entrySet() {
        return m12765i();
    }

    @Override // java.util.Map, p164j$.util.Map
    public boolean equals(Object obj) {
        return C9612q.m13922c(this.f25851j, obj);
    }

    @Override // p164j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer<? super String, ? super JsonElement> biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, p164j$.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof String) {
            return m12766h((String) obj);
        }
        return null;
    }

    @Override // java.util.Map, p164j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    /* renamed from: h */
    public JsonElement m12766h(String key) {
        C9612q.m13917h(key, "key");
        return this.f25851j.get(key);
    }

    @Override // java.util.Map, p164j$.util.Map
    public int hashCode() {
        return this.f25851j.hashCode();
    }

    /* renamed from: i */
    public Set<Map.Entry<String, JsonElement>> m12765i() {
        return this.f25851j.entrySet();
    }

    @Override // java.util.Map, p164j$.util.Map
    public boolean isEmpty() {
        return this.f25851j.isEmpty();
    }

    /* renamed from: k */
    public Set<String> m12764k() {
        return this.f25851j.keySet();
    }

    @Override // java.util.Map, p164j$.util.Map
    public final /* bridge */ Set<String> keySet() {
        return m12764k();
    }

    @Override // p164j$.util.Map
    public /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.serialization.json.JsonElement, java.lang.Object] */
    @Override // java.util.Map
    public /* synthetic */ JsonElement merge(String str, JsonElement jsonElement, java.util.function.BiFunction<? super JsonElement, ? super JsonElement, ? extends JsonElement> biFunction) {
        return merge(str, jsonElement, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    /* renamed from: o */
    public int m12763o() {
        return this.f25851j.size();
    }

    /* renamed from: p */
    public Collection<JsonElement> m12762p() {
        return this.f25851j.values();
    }

    @Override // java.util.Map, p164j$.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, p164j$.util.Map
    public void putAll(java.util.Map<? extends String, ? extends JsonElement> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, p164j$.util.Map
    public /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, p164j$.util.Map
    /* renamed from: r */
    public JsonElement remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, p164j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, p164j$.util.Map
    public /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, p164j$.util.Map
    public /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p164j$.util.Map
    public void replaceAll(BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ void replaceAll(java.util.function.BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p164j$.util.Map
    public final /* bridge */ int size() {
        return m12763o();
    }

    public String toString() {
        String m14046d0;
        m14046d0 = C9553r.m14046d0(this.f25851j.entrySet(), ",", "{", "}", 0, null, C9956a.f25852j, 24, null);
        return m14046d0;
    }

    @Override // java.util.Map, p164j$.util.Map
    public final /* bridge */ Collection<JsonElement> values() {
        return m12762p();
    }
}
