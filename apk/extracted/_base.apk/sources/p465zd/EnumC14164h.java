package p465zd;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m14357d2 = {"Lzd/h;", "", "", "", "j", "Ljava/lang/String;", "getUnionValue", "()Ljava/lang/String;", "unionValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "k", "a", "l", "m", "n", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: zd.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC14164h {
    SPEED("speed"),
    BALANCED("balanced"),
    QUALITY("quality");
    

    /* renamed from: k */
    public static final C14165a f36448k = new C14165a(null);

    /* renamed from: j */
    private final String f36453j;

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\b"}, m14357d2 = {"Lzd/h$a;", "", "Lzd/h;", "", "unionValue", "a", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: zd.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C14165a {
        private C14165a() {
        }

        public /* synthetic */ C14165a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public EnumC14164h m538a(String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1924829944) {
                    if (hashCode != 109641799) {
                        if (hashCode == 651215103 && str.equals("quality")) {
                            return EnumC14164h.QUALITY;
                        }
                    } else if (str.equals("speed")) {
                        return EnumC14164h.SPEED;
                    }
                } else if (str.equals("balanced")) {
                    return EnumC14164h.BALANCED;
                }
            }
            return EnumC14164h.BALANCED;
        }
    }

    EnumC14164h(String str) {
        this.f36453j = str;
    }
}
