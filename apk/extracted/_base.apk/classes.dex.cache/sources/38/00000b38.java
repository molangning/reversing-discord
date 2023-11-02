package p045cj;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p140hg.InterfaceC7130c;
import p140hg.InterfaceC7141i;
import p470zi.C14278g;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000\u001a!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0010\u0010\n\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\bH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\bH\u0000\u001a\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0000\u001a\u0012\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b*\u00020\u000eH\u0000\" \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00058\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u0012\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m14357d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "a", "", "", "b", "(Ljava/util/List;)[Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlin/reflect/KClass;", "", "f", "e", "className", "d", "Lkotlin/reflect/KType;", "", "c", "[Lkotlinx/serialization/descriptors/SerialDescriptor;", "getEMPTY_DESCRIPTOR_ARRAY$annotations", "()V", "EMPTY_DESCRIPTOR_ARRAY", "kotlinx-serialization-core"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: cj.m1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2616m1 {

    /* renamed from: a */
    private static final SerialDescriptor[] f7090a = new SerialDescriptor[0];

    /* renamed from: a */
    public static final Set<String> m32848a(SerialDescriptor serialDescriptor) {
        C9612q.m13917h(serialDescriptor, "<this>");
        if (serialDescriptor instanceof InterfaceC2610l) {
            return ((InterfaceC2610l) serialDescriptor).mo12858a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.mo12687d());
        int mo12687d = serialDescriptor.mo12687d();
        for (int i = 0; i < mo12687d; i++) {
            hashSet.add(serialDescriptor.mo12686e(i));
        }
        return hashSet;
    }

    /* renamed from: b */
    public static final SerialDescriptor[] m32847b(List<? extends SerialDescriptor> list) {
        boolean z;
        SerialDescriptor[] serialDescriptorArr;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            list = null;
        }
        if (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) {
            return f7090a;
        }
        return serialDescriptorArr;
    }

    /* renamed from: c */
    public static final KClass<Object> m32846c(KType kType) {
        C9612q.m13917h(kType, "<this>");
        InterfaceC7130c mo13879j = kType.mo13879j();
        if (mo13879j instanceof KClass) {
            return (KClass) mo13879j;
        }
        if (mo13879j instanceof InterfaceC7141i) {
            throw new IllegalStateException(("Captured type parameter " + mo13879j + " from generic non-reified function. Such functionality cannot be supported as " + mo13879j + " is erased, either specify serializer explicitly or make calling function inline with reified " + mo13879j).toString());
        }
        throw new IllegalStateException(("Only KClass supported as classifier, got " + mo13879j).toString());
    }

    /* renamed from: d */
    public static final String m32845d(String className) {
        C9612q.m13917h(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    /* renamed from: e */
    public static final String m32844e(KClass<?> kClass) {
        C9612q.m13917h(kClass, "<this>");
        String mo13883l = kClass.mo13883l();
        if (mo13883l == null) {
            mo13883l = "<local class name not available>";
        }
        return m32845d(mo13883l);
    }

    /* renamed from: f */
    public static final Void m32843f(KClass<?> kClass) {
        C9612q.m13917h(kClass, "<this>");
        throw new C14278g(m32844e(kClass));
    }
}