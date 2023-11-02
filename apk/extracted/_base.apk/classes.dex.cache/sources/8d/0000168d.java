package com.discord.crash_reporting.system_logs;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SystemLogUtils$fetchLastTombstone$extractedGroups$1 extends AbstractC9614s implements Function1<MatchResult, String> {
    final /* synthetic */ Regex $removeDexNameExp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemLogUtils$fetchLastTombstone$extractedGroups$1(Regex regex) {
        super(1);
        this.$removeDexNameExp = regex;
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(MatchResult it) {
        C9612q.m13917h(it, "it");
        return this.$removeDexNameExp.m13867h(it.mo3925b().get(1), "classesN.dex");
    }
}