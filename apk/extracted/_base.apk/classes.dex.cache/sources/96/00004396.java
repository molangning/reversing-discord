package p238n1;

/* renamed from: n1.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public enum EnumC10484c {
    JSON(".json"),
    ZIP(".zip");
    

    /* renamed from: j */
    public final String f27374j;

    EnumC10484c(String str) {
        this.f27374j = str;
    }

    /* renamed from: b */
    public String m11419b() {
        return ".temp" + this.f27374j;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f27374j;
    }
}