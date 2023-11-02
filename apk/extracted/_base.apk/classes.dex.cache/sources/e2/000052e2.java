package p446yd;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C9560w;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005\"\u0017\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m14357d2 = {"", "", "filter", "a", "(Ljava/util/Set;Ljava/util/Set;)Ljava/lang/Long;", "Ljava/util/Set;", "bestProfiles", "Landroid/hardware/camera2/params/DynamicRangeProfiles;", "b", "(Landroid/hardware/camera2/params/DynamicRangeProfiles;)Ljava/lang/Long;", "bestProfile", "react-native-vision-camera_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: yd.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14001m {

    /* renamed from: a */
    private static final Set<Long> f35999a;

    static {
        Set<Long> m14002i;
        m14002i = C9560w.m14002i(8L, 4L, 2L);
        f35999a = m14002i;
    }

    /* renamed from: a */
    private static final Long m939a(Set<Long> set, Set<Long> set2) {
        for (Number number : set2) {
            long longValue = number.longValue();
            if (set.contains(Long.valueOf(longValue))) {
                return Long.valueOf(longValue);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final Long m938b(DynamicRangeProfiles dynamicRangeProfiles) {
        C9612q.m13917h(dynamicRangeProfiles, "<this>");
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        C9612q.m13918g(supportedProfiles, "supportedProfiles");
        return m939a(supportedProfiles, f35999a);
    }
}