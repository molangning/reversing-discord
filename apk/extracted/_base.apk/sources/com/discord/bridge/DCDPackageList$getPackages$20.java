package com.discord.bridge;

import com.discord.react.FontModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
/* synthetic */ class DCDPackageList$getPackages$20 extends C9609n implements Function1<ReactApplicationContext, FontModule> {
    public static final DCDPackageList$getPackages$20 INSTANCE = new DCDPackageList$getPackages$20();

    DCDPackageList$getPackages$20() {
        super(1, FontModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FontModule invoke(ReactApplicationContext p0) {
        C9612q.m13917h(p0, "p0");
        return new FontModule(p0);
    }
}
