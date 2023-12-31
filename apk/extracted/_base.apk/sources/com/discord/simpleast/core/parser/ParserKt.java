package com.discord.simpleast.core.parser;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a<\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0005H\u0082\b¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m14357d2 = {"firstMapOrNull", "V", "T", "", "predicate", "Lkotlin/Function1;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "simpleast-core_release"}, m14356k = 2, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class ParserKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V> V firstMapOrNull(List<? extends T> list, Function1<? super T, ? extends V> function1) {
        Iterator<? extends T> it = list.iterator();
        while (it.hasNext()) {
            V invoke = function1.invoke((T) it.next());
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }
}
