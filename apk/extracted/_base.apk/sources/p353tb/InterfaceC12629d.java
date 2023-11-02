package p353tb;

/* renamed from: tb.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public @interface InterfaceC12629d {

    /* renamed from: tb.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC12630a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    EnumC12630a intEncoding() default EnumC12630a.DEFAULT;

    int tag();
}
