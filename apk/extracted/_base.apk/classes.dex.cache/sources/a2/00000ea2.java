package com.discord.bundle_updater;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m14357d2 = {"<anonymous>", "", "Landroid/view/ViewGroup;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class BundleUpdaterManager$showSpinnerView$2 extends AbstractC9614s implements Function1<ViewGroup, Unit> {
    final /* synthetic */ BundleUpdaterManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleUpdaterManager$showSpinnerView$2(BundleUpdaterManager bundleUpdaterManager) {
        super(1);
        this.this$0 = bundleUpdaterManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ViewGroup viewGroup) {
        invoke2(viewGroup);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(ViewGroup runOnActivity) {
        ViewGroup viewGroup;
        C9612q.m13917h(runOnActivity, "$this$runOnActivity");
        viewGroup = this.this$0.progressLayout;
        runOnActivity.addView(viewGroup);
    }
}