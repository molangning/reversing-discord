package com.discord.external_pip;

import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import pf.C11583s;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Lpf/s;", "", "result", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class ExternalPipModule$enterPipMode$1 extends AbstractC9614s implements Function1<C11583s<? extends Unit>, Unit> {
    final /* synthetic */ Promise $onResultPromise;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalPipModule$enterPipMode$1(Promise promise) {
        super(1);
        this.$onResultPromise = promise;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C11583s<? extends Unit> c11583s) {
        m41935invoke(c11583s.m7588j());
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void m41935invoke(Object obj) {
        if (C11583s.m7590h(obj)) {
            this.$onResultPromise.resolve(Boolean.TRUE);
        } else {
            this.$onResultPromise.reject(C11583s.m7593e(obj));
        }
    }
}