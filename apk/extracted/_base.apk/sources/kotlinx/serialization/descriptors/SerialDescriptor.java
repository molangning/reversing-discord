package kotlinx.serialization.descriptors;

import bj.AbstractC2342h;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9543h;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H'R\u001a\u0010\u0012\u001a\u00020\u00048&X§\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0017\u001a\u00020\u00138&X§\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010 \u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0011\u001a\u0004\b\u001d\u0010\u001eR \u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0011\u001a\u0004\b!\u0010\"¨\u0006%"}, m14357d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "index", "", "e", ZeroconfModule.KEY_SERVICE_NAME, "c", "", "", "f", "h", "", "j", "i", "()Ljava/lang/String;", "getSerialName$annotations", "()V", "serialName", "Lbj/h;", "g", "()Lbj/h;", "getKind$annotations", "kind", "b", "()Z", "isNullable$annotations", "isNullable", "isInline", "d", "()I", "getElementsCount$annotations", "elementsCount", "getAnnotations", "()Ljava/util/List;", "getAnnotations$annotations", "annotations", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface SerialDescriptor {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: kotlinx.serialization.descriptors.SerialDescriptor$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9927a {
        /* renamed from: a */
        public static List<Annotation> m12940a(SerialDescriptor serialDescriptor) {
            return C9543h.m14145i();
        }

        /* renamed from: b */
        public static boolean m12939b(SerialDescriptor serialDescriptor) {
            return false;
        }

        /* renamed from: c */
        public static boolean m12938c(SerialDescriptor serialDescriptor) {
            return false;
        }
    }

    /* renamed from: b */
    boolean mo12689b();

    /* renamed from: c */
    int mo12688c(String str);

    /* renamed from: d */
    int mo12687d();

    /* renamed from: e */
    String mo12686e(int i);

    /* renamed from: f */
    List<Annotation> mo12685f(int i);

    /* renamed from: g */
    AbstractC2342h mo12684g();

    List<Annotation> getAnnotations();

    /* renamed from: h */
    SerialDescriptor mo12683h(int i);

    /* renamed from: i */
    String mo12682i();

    boolean isInline();

    /* renamed from: j */
    boolean mo12681j(int i);
}
