package com.discord.bridge;

import com.discord.security_key.SecurityKeyManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
/* synthetic */ class DCDPackageList$getPackages$41 extends C9609n implements Function1<ReactApplicationContext, SecurityKeyManagerModule> {
    public static final DCDPackageList$getPackages$41 INSTANCE = new DCDPackageList$getPackages$41();

    DCDPackageList$getPackages$41() {
        super(1, SecurityKeyManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final SecurityKeyManagerModule invoke(ReactApplicationContext p0) {
        C9612q.m13917h(p0, "p0");
        return new SecurityKeyManagerModule(p0);
    }
}