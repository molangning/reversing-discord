package com.discord.bridge;

import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
/* synthetic */ class DCDPackageList$getPackages$4 extends C9609n implements Function1<ReactApplicationContext, AudioPlayerManagerModule> {
    public static final DCDPackageList$getPackages$4 INSTANCE = new DCDPackageList$getPackages$4();

    DCDPackageList$getPackages$4() {
        super(1, AudioPlayerManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AudioPlayerManagerModule invoke(ReactApplicationContext p0) {
        C9612q.m13917h(p0, "p0");
        return new AudioPlayerManagerModule(p0);
    }
}