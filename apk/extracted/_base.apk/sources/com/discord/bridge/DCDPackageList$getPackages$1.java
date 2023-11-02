package com.discord.bridge;

import com.discord.app_database.AppDatabaseModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
/* synthetic */ class DCDPackageList$getPackages$1 extends C9609n implements Function1<ReactApplicationContext, AppDatabaseModule> {
    public static final DCDPackageList$getPackages$1 INSTANCE = new DCDPackageList$getPackages$1();

    DCDPackageList$getPackages$1() {
        super(1, AppDatabaseModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AppDatabaseModule invoke(ReactApplicationContext p0) {
        C9612q.m13917h(p0, "p0");
        return new AppDatabaseModule(p0);
    }
}
