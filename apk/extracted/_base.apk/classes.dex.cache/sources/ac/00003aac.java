package p164j$.time.format;

/* renamed from: j$.time.format.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public enum EnumC8309l implements InterfaceC8304g {
    SENSITIVE,
    INSENSITIVE,
    STRICT,
    LENIENT;

    @Override // p164j$.time.format.InterfaceC8304g
    /* renamed from: a */
    public final boolean mo17882a(C8315r c8315r, StringBuilder sb2) {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return "ParseStrict(false)";
                    }
                    throw new IllegalStateException("Unreachable");
                }
                return "ParseStrict(true)";
            }
            return "ParseCaseSensitive(false)";
        }
        return "ParseCaseSensitive(true)";
    }
}