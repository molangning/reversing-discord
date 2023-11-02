package com.discord.browser_manager;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, m14357d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class BrowserManager$tryOpenUrlWithCustomTabs$1 extends AbstractC9614s implements Function1<Exception, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Function1<Exception, Unit> $onFailure;
    final /* synthetic */ String $url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BrowserManager$tryOpenUrlWithCustomTabs$1(Context context, String str, Function1<? super Exception, Unit> function1) {
        super(1);
        this.$context = context;
        this.$url = str;
        this.$onFailure = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
        invoke2(exc);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(Exception it) {
        C9612q.m13917h(it, "it");
        BrowserManager.INSTANCE.tryOpenUrlExternally(this.$context, this.$url, this.$onFailure);
    }
}