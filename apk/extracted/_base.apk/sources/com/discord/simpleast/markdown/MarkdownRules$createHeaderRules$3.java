package com.discord.simpleast.markdown;

import android.text.style.CharacterStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;

@Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\b\u0006"}, m14357d2 = {"<anonymous>", "Landroid/text/style/CharacterStyle;", "R", "S", "p1", "", "invoke"}, m14356k = 3, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
final /* synthetic */ class MarkdownRules$createHeaderRules$3 extends C9609n implements Function1<Integer, CharacterStyle> {
    final /* synthetic */ MarkdownRules$createHeaderRules$1 $spanProvider$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkdownRules$createHeaderRules$3(MarkdownRules$createHeaderRules$1 markdownRules$createHeaderRules$1) {
        super(1, null, "spanProvider", "invoke(I)Landroid/text/style/CharacterStyle;", 0);
        this.$spanProvider$1 = markdownRules$createHeaderRules$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ CharacterStyle invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final CharacterStyle invoke(int i) {
        return this.$spanProvider$1.invoke(i);
    }
}
