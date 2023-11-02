package com.discord.permissions;

import com.discord.permissions.NativePermissionStatus;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
/* synthetic */ class NativePermissionManagerModule$Companion$transformRequestResult$1 extends C9609n implements Function1<Object, String> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public NativePermissionManagerModule$Companion$transformRequestResult$1(Object obj) {
        super(1, obj, NativePermissionStatus.Companion.class, "fromAndroidPermissionStatus", "fromAndroidPermissionStatus(Ljava/lang/Object;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(Object obj) {
        return ((NativePermissionStatus.Companion) this.receiver).fromAndroidPermissionStatus(obj);
    }
}
