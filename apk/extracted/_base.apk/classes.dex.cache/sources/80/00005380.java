package p465zd;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m14357d2 = {"Lzd/f;", "", "", "", "j", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "unionValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "k", "a", "l", "m", "n", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: zd.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC14159f {
    DENIED("denied"),
    NOT_DETERMINED("not-determined"),
    GRANTED("granted");
    

    /* renamed from: k */
    public static final C14160a f36433k = new C14160a(null);

    /* renamed from: j */
    private final String f36438j;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m14357d2 = {"Lzd/f$a;", "", "", "status", "Lzd/f;", "a", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: zd.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C14160a {
        private C14160a() {
        }

        public /* synthetic */ C14160a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EnumC14159f m545a(int i) {
            if (i != -1) {
                if (i != 0) {
                    return EnumC14159f.NOT_DETERMINED;
                }
                return EnumC14159f.GRANTED;
            }
            return EnumC14159f.DENIED;
        }
    }

    EnumC14159f(String str) {
        this.f36438j = str;
    }

    /* renamed from: b */
    public String m546b() {
        return this.f36438j;
    }
}