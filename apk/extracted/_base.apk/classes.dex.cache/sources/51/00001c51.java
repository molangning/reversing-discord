package com.discord.notifications.renderer.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import kotlin.text.MatchResult;
import p355ti.C12786b;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* renamed from: com.discord.notifications.renderer.utils.RenderNotificationMessageContentKt$renderNotificationMessageContent$cleaned$2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C3355xb68ee08d extends AbstractC9614s implements Function1<MatchResult, CharSequence> {
    public static final C3355xb68ee08d INSTANCE = new C3355xb68ee08d();

    C3355xb68ee08d() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(MatchResult it) {
        String m13748z;
        C9612q.m13917h(it, "it");
        C12786b c12786b = it.mo3923d().get(1);
        C9612q.m13920e(c12786b);
        m13748z = C9653o.m13748z("X", c12786b.m3927a().length());
        return m13748z;
    }
}