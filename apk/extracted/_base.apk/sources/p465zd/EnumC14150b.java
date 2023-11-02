package p465zd;

import com.facebook.react.uimanager.ViewProps;
import com.mrousavy.camera.C5335s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m14357d2 = {"Lzd/b;", "", "", "", "j", "Ljava/lang/String;", "getUnionValue", "()Ljava/lang/String;", "unionValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "k", "a", "l", "m", "n", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: zd.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC14150b {
    OFF("off"),
    ON(ViewProps.f10920ON),
    AUTO("auto");
    

    /* renamed from: k */
    public static final C14151a f36405k = new C14151a(null);

    /* renamed from: j */
    private final String f36410j;

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\b"}, m14357d2 = {"Lzd/b$a;", "", "Lzd/b;", "", "unionValue", "a", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: zd.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C14151a {
        private C14151a() {
        }

        public /* synthetic */ C14151a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public EnumC14150b m560a(String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 3551) {
                    if (hashCode != 109935) {
                        if (hashCode == 3005871 && str.equals("auto")) {
                            return EnumC14150b.AUTO;
                        }
                    } else if (str.equals("off")) {
                        return EnumC14150b.OFF;
                    }
                } else if (str.equals(ViewProps.f10920ON)) {
                    return EnumC14150b.ON;
                }
            }
            if (str == null) {
                str = "(null)";
            }
            throw new C5335s("flash", str);
        }
    }

    EnumC14150b(String str) {
        this.f36410j = str;
    }
}
