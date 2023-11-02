package p305qg;

/* renamed from: qg.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public enum EnumC11918f {
    CLASS("class"),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");
    

    /* renamed from: j */
    private final String f30926j;

    EnumC11918f(String str) {
        this.f30926j = str;
    }

    /* renamed from: b */
    public final boolean m6717b() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}