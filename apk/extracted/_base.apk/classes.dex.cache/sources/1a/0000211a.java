package com.discord.user_search_worker;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "it", "Lcom/discord/user_search_worker/UserSearchWorkerResult;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class UserSearchWorker$searchUsers$sortedResults$1 extends AbstractC9614s implements Function1<UserSearchWorkerResult, Comparable<?>> {
    public static final UserSearchWorker$searchUsers$sortedResults$1 INSTANCE = new UserSearchWorker$searchUsers$sortedResults$1();

    UserSearchWorker$searchUsers$sortedResults$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Comparable<?> invoke(UserSearchWorkerResult it) {
        C9612q.m13917h(it, "it");
        return Double.valueOf(-it.getScore());
    }
}