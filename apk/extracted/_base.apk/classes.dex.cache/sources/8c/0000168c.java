package com.discord.crash_reporting.system_logs;

import com.discord.crash_reporting.system_logs.SystemLogUtils;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m14357d2 = {"<anonymous>", "", "crashes", "Ljava/util/LinkedList;", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SystemLogUtils$fetchLastTombstone$1 extends AbstractC9614s implements Function1<LinkedList<String>, Unit> {
    final /* synthetic */ Function1<SystemLogUtils.Tombstone, Unit> $cb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SystemLogUtils$fetchLastTombstone$1(Function1<? super SystemLogUtils.Tombstone, Unit> function1) {
        super(1);
        this.$cb = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LinkedList<String> linkedList) {
        invoke2(linkedList);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(LinkedList<String> crashes) {
        SystemLogUtils.Tombstone fetchLastTombstone;
        C9612q.m13917h(crashes, "crashes");
        Function1<SystemLogUtils.Tombstone, Unit> function1 = this.$cb;
        fetchLastTombstone = SystemLogUtils.INSTANCE.fetchLastTombstone(crashes);
        function1.invoke(fetchLastTombstone);
    }
}