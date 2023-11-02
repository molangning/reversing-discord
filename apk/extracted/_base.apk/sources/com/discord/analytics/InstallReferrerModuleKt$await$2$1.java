package com.discord.analytics;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "it", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class InstallReferrerModuleKt$await$2$1 extends AbstractC9614s implements Function1<Throwable, Unit> {
    final /* synthetic */ InstallReferrerClient $this_await;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallReferrerModuleKt$await$2$1(InstallReferrerClient installReferrerClient) {
        super(1);
        this.$this_await = installReferrerClient;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        InstallReferrerClient installReferrerClient = this.$this_await;
        try {
            C11583s.C11584a c11584a = C11583s.f30090k;
            installReferrerClient.mo32438a();
            C11583s.m7596b(Unit.f25302a);
        } catch (Throwable th3) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            C11583s.m7596b(C11586t.m7587a(th3));
        }
    }
}
