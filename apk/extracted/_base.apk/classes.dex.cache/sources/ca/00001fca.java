package com.discord.simpleast.code;

import com.discord.simpleast.core.node.StyleNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"RC", "p1", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Iterable;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
final /* synthetic */ class Xml$TagNode$render$typeStylesProvider$1<RC> extends C9609n implements Function1<RC, Iterable<?>> {
    public Xml$TagNode$render$typeStylesProvider$1(StyleNode.SpanProvider spanProvider) {
        super(1, spanProvider, StyleNode.SpanProvider.class, "get", "get(Ljava/lang/Object;)Ljava/lang/Iterable;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Iterable<?> invoke(Object obj) {
        return invoke((Xml$TagNode$render$typeStylesProvider$1<RC>) obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Iterable<?> invoke(RC rc) {
        return ((StyleNode.SpanProvider) this.receiver).get(rc);
    }
}