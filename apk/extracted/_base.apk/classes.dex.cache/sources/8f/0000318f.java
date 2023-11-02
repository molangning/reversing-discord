package dj;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ;\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010R<\u0010\u0014\u001a*\u0012\u0004\u0012\u00020\u0003\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0004\u0012\u00020\u00010\u0011j\b\u0012\u0004\u0012\u00020\u0001`\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0017"}, m14357d2 = {"Ldj/u;", "", "T", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Ldj/u$a;", "key", "value", "", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Ldj/u$a;Ljava/lang/Object;)V", "Lkotlin/Function0;", "defaultValue", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Ldj/u$a;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Ldj/u$a;)Ljava/lang/Object;", "", "Lkotlinx/serialization/json/internal/DescriptorData;", "Ljava/util/Map;", "map", "<init>", "()V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6019u {

    /* renamed from: a */
    private final Map<SerialDescriptor, Map<C6020a<Object>, Object>> f17092a = C6017t.m23867a(16);

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m14357d2 = {"Ldj/u$a;", "", "T", "<init>", "()V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: dj.u$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C6020a<T> {
    }

    /* renamed from: a */
    public final <T> T m23865a(SerialDescriptor descriptor, C6020a<T> key) {
        Object obj;
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(key, "key");
        Map<C6020a<Object>, Object> map = this.f17092a.get(descriptor);
        if (map != null) {
            obj = map.get(key);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }

    /* renamed from: b */
    public final <T> T m23864b(SerialDescriptor descriptor, C6020a<T> key, Function0<? extends T> defaultValue) {
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(key, "key");
        C9612q.m13917h(defaultValue, "defaultValue");
        T t = (T) m23865a(descriptor, key);
        if (t != null) {
            return t;
        }
        T invoke = defaultValue.invoke();
        m23863c(descriptor, key, invoke);
        return invoke;
    }

    /* renamed from: c */
    public final <T> void m23863c(SerialDescriptor descriptor, C6020a<T> key, T value) {
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(key, "key");
        C9612q.m13917h(value, "value");
        Map<SerialDescriptor, Map<C6020a<Object>, Object>> map = this.f17092a;
        Map<C6020a<Object>, Object> map2 = map.get(descriptor);
        if (map2 == null) {
            map2 = C6017t.m23867a(2);
            map.put(descriptor, map2);
        }
        map2.put(key, value);
    }
}