package io.sentry;

/* renamed from: io.sentry.r1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC8128r1 {

    /* renamed from: io.sentry.r1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC8129a implements InterfaceC8128r1 {
        NANOSECOND,
        MICROSECOND,
        MILLISECOND,
        SECOND,
        MINUTE,
        HOUR,
        DAY,
        WEEK;

        @Override // io.sentry.InterfaceC8128r1
        public /* bridge */ /* synthetic */ String apiName() {
            return C8121q1.m18466a(this);
        }
    }

    String apiName();

    String name();
}
