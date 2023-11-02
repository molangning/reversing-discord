package com.discord.simpleast.core.simple;

import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9544i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;

@Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004H\n¢\u0006\u0002\b\u0005"}, m14357d2 = {"<anonymous>", "", "Landroid/text/style/CharacterStyle;", "R", "S", "invoke"}, m14356k = 3, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
final class SimpleMarkdownRules$createBoldRule$1 extends AbstractC9614s implements Function0<List<? extends CharacterStyle>> {
    public static final SimpleMarkdownRules$createBoldRule$1 INSTANCE = new SimpleMarkdownRules$createBoldRule$1();

    SimpleMarkdownRules$createBoldRule$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends CharacterStyle> invoke() {
        List<? extends CharacterStyle> m14109d;
        m14109d = C9544i.m14109d(new StyleSpan(1));
        return m14109d;
    }
}