package dj;

import bj.AbstractC2345i;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import dj.C6019u;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.C9987v;
import kotlinx.serialization.json.InterfaceC9980p;
import kotlinx.serialization.json.InterfaceC9981q;
import kotlinx.serialization.json.Json;
import p304qf.C11889v;
import p470zi.C14278g;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0005H\u0000\u001a\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u001c\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0004H\u0000\u001a&\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0000\"2\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00118\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\",\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00190\u00118\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0013\u0012\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001d"}, m14357d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/json/Json;", "json", "", "", "", "b", "descriptor", "d", "index", "f", "Lkotlinx/serialization/json/q;", "k", ZeroconfModule.KEY_SERVICE_NAME, "g", "suffix", "i", "Ldj/u$a;", "a", "Ldj/u$a;", "e", "()Ldj/u$a;", "getJsonDeserializationNamesKey$annotations", "()V", "JsonDeserializationNamesKey", "", "getJsonSerializationNamesKey", "getJsonSerializationNamesKey$annotations", "JsonSerializationNamesKey", "kotlinx-serialization-json"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: dj.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5975b0 {

    /* renamed from: a */
    private static final C6019u.C6020a<Map<String, Integer>> f17008a = new C6019u.C6020a<>();

    /* renamed from: b */
    private static final C6019u.C6020a<String[]> f17009b = new C6019u.C6020a<>();

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"", "", "", "a", "()Ljava/util/Map;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: dj.b0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5976a extends AbstractC9614s implements Function0<Map<String, ? extends Integer>> {

        /* renamed from: j */
        final /* synthetic */ SerialDescriptor f17010j;

        /* renamed from: k */
        final /* synthetic */ Json f17011k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5976a(SerialDescriptor serialDescriptor, Json json) {
            super(0);
            this.f17010j = serialDescriptor;
            this.f17011k = json;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Map<String, Integer> invoke() {
            return C5975b0.m24004b(this.f17010j, this.f17011k);
        }
    }

    /* renamed from: b */
    public static final Map<String, Integer> m24004b(SerialDescriptor serialDescriptor, Json json) {
        Map<String, Integer> m6754h;
        Object m14031s0;
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m23995k(serialDescriptor, json);
        int mo12687d = serialDescriptor.mo12687d();
        for (int i = 0; i < mo12687d; i++) {
            List<Annotation> mo12685f = serialDescriptor.mo12685f(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj : mo12685f) {
                if (obj instanceof InterfaceC9980p) {
                    arrayList.add(obj);
                }
            }
            m14031s0 = C9553r.m14031s0(arrayList);
            InterfaceC9980p interfaceC9980p = (InterfaceC9980p) m14031s0;
            if (interfaceC9980p != null && (names = interfaceC9980p.names()) != null) {
                for (String str : names) {
                    m24003c(linkedHashMap, serialDescriptor, str, i);
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            m6754h = C11889v.m6754h();
            return m6754h;
        }
        return linkedHashMap;
    }

    /* renamed from: c */
    private static final void m24003c(Map<String, Integer> map, SerialDescriptor serialDescriptor, String str, int i) {
        Object m6753i;
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("The suggested name '");
        sb2.append(str);
        sb2.append("' for property ");
        sb2.append(serialDescriptor.mo12686e(i));
        sb2.append(" is already one of the names for property ");
        m6753i = C11889v.m6753i(map, str);
        sb2.append(serialDescriptor.mo12686e(((Number) m6753i).intValue()));
        sb2.append(" in ");
        sb2.append(serialDescriptor);
        throw new C6027z(sb2.toString());
    }

    /* renamed from: d */
    public static final Map<String, Integer> m24002d(Json json, SerialDescriptor descriptor) {
        C9612q.m13917h(json, "<this>");
        C9612q.m13917h(descriptor, "descriptor");
        return (Map) C9987v.m12678a(json).m23864b(descriptor, f17008a, new C5976a(descriptor, json));
    }

    /* renamed from: e */
    public static final C6019u.C6020a<Map<String, Integer>> m24001e() {
        return f17008a;
    }

    /* renamed from: f */
    public static final String m24000f(SerialDescriptor serialDescriptor, Json json, int i) {
        C9612q.m13917h(serialDescriptor, "<this>");
        C9612q.m13917h(json, "json");
        m23995k(serialDescriptor, json);
        return serialDescriptor.mo12686e(i);
    }

    /* renamed from: g */
    public static final int m23999g(SerialDescriptor serialDescriptor, Json json, String name) {
        C9612q.m13917h(serialDescriptor, "<this>");
        C9612q.m13917h(json, "json");
        C9612q.m13917h(name, "name");
        m23995k(serialDescriptor, json);
        int mo12688c = serialDescriptor.mo12688c(name);
        if (mo12688c != -3) {
            return mo12688c;
        }
        if (!json.m12780e().m12747k()) {
            return mo12688c;
        }
        return m23998h(json, serialDescriptor, name);
    }

    /* renamed from: h */
    private static final int m23998h(Json json, SerialDescriptor serialDescriptor, String str) {
        Integer num = m24002d(json, serialDescriptor).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* renamed from: i */
    public static final int m23997i(SerialDescriptor serialDescriptor, Json json, String name, String suffix) {
        C9612q.m13917h(serialDescriptor, "<this>");
        C9612q.m13917h(json, "json");
        C9612q.m13917h(name, "name");
        C9612q.m13917h(suffix, "suffix");
        int m23999g = m23999g(serialDescriptor, json, name);
        if (m23999g != -3) {
            return m23999g;
        }
        throw new C14278g(serialDescriptor.mo12682i() + " does not contain element with name '" + name + '\'' + suffix);
    }

    /* renamed from: j */
    public static /* synthetic */ int m23996j(SerialDescriptor serialDescriptor, Json json, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return m23997i(serialDescriptor, json, str, str2);
    }

    /* renamed from: k */
    public static final InterfaceC9981q m23995k(SerialDescriptor serialDescriptor, Json json) {
        C9612q.m13917h(serialDescriptor, "<this>");
        C9612q.m13917h(json, "json");
        if (C9612q.m13922c(serialDescriptor.mo12684g(), AbstractC2345i.C2346a.f6455a)) {
            json.m12780e().m12750h();
            return null;
        }
        return null;
    }
}