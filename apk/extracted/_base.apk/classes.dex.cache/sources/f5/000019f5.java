package com.discord.media.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "mimeType", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* renamed from: com.discord.media.utils.ContentResolverMedia$QueryType$Companion$getUnsupportedImageMimeTypes$1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class C3288x69014d2f extends AbstractC9614s implements Function1<String, CharSequence> {
    public static final C3288x69014d2f INSTANCE = new C3288x69014d2f();

    C3288x69014d2f() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(String mimeType) {
        C9612q.m13917h(mimeType, "mimeType");
        return "'" + mimeType + "'";
    }
}