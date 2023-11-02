package p373ui;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.time.Duration;
import kotlin.time.TimeMark;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H¦\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\u0007"}, m14357d2 = {"Lui/a;", "Lkotlin/time/TimeMark;", "", "other", "Lkotlin/time/Duration;", "j", "(Lui/a;)J", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: ui.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface InterfaceC12979a extends TimeMark, Comparable<InterfaceC12979a> {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: ui.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12980a {
        /* renamed from: a */
        public static int m3538a(InterfaceC12979a interfaceC12979a, InterfaceC12979a other) {
            C9612q.m13917h(other, "other");
            return Duration.m13641g(interfaceC12979a.mo3517j(other), Duration.f25397k.m13624b());
        }
    }

    /* renamed from: j */
    long mo3517j(InterfaceC12979a interfaceC12979a);
}