package com.discord.simpleast.markdown;

import android.graphics.Color;
import android.text.style.BulletSpan;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;

@Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "Landroid/text/style/BulletSpan;", "R", "S", "invoke"}, m14356k = 3, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
final class MarkdownRules$createMarkdownRules$1 extends AbstractC9614s implements Function0<BulletSpan> {
    public static final MarkdownRules$createMarkdownRules$1 INSTANCE = new MarkdownRules$createMarkdownRules$1();

    MarkdownRules$createMarkdownRules$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final BulletSpan invoke() {
        return new BulletSpan(24, Color.parseColor("#6E7B7F"));
    }
}
