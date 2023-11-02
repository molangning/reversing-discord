package com.discord.crash_reporting.system_logs;

import android.content.Context;
import com.discord.crash_reporting.system_logs.HistoricalProcessExitReason;
import com.discord.crash_reporting.system_logs.SystemLogUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.text.C9654p;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "crash", "Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SystemLogReport$reportLastCrash$1 extends AbstractC9614s implements Function1<SystemLogUtils.Tombstone, Unit> {
    final /* synthetic */ Function2<HistoricalProcessExitReason.Reason, SystemLogUtils.Tombstone, Unit> $cb;
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SystemLogReport$reportLastCrash$1(Function2<? super HistoricalProcessExitReason.Reason, ? super SystemLogUtils.Tombstone, Unit> function2, Context context) {
        super(1);
        this.$cb = function2;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SystemLogUtils.Tombstone tombstone) {
        invoke2(tombstone);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(SystemLogUtils.Tombstone tombstone) {
        boolean z;
        List<String> m13682z0;
        if (tombstone != null) {
            Context context = this.$context;
            m13682z0 = C9654p.m13682z0(tombstone.getText(), new String[]{ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE}, false, 0, 6, null);
            for (String str : m13682z0) {
                SystemLogReport.INSTANCE.recordBreadcrumb(str, "Tombstone");
            }
            SystemLogReport systemLogReport = SystemLogReport.INSTANCE;
            systemLogReport.recordBreadcrumb(tombstone.getGroupHash(), "Tombstone-Hash");
            z = systemLogReport.checkHashChanged(context, tombstone.getTextHash());
        } else {
            z = false;
        }
        Function2<HistoricalProcessExitReason.Reason, SystemLogUtils.Tombstone, Unit> function2 = this.$cb;
        HistoricalProcessExitReason.Reason lastReason = HistoricalProcessExitReason.INSTANCE.lastReason(this.$context);
        if (!z) {
            tombstone = null;
        }
        function2.invoke(lastReason, tombstone);
    }
}