package com.discord.span.utilities;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m14357d2 = {"<anonymous>", "", "it", "Ljava/lang/Object;", "kotlin.jvm.PlatformType", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
final class SpannableStringBuilderExtensionsKt$debugSpans$1 extends AbstractC9614s implements Function1<Object, CharSequence> {
    public static final SpannableStringBuilderExtensionsKt$debugSpans$1 INSTANCE = new SpannableStringBuilderExtensionsKt$debugSpans$1();

    SpannableStringBuilderExtensionsKt$debugSpans$1() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        C9612q.m13918g(simpleName, "it::class.java.simpleName");
        return simpleName;
    }
}
