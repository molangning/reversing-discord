package com.discord.permissions;

import com.discord.permissions.NativePermissionStatus;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* renamed from: com.discord.permissions.NativePermissionManagerModule$Companion$transformHasAuthorizationResult$1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public /* synthetic */ class C3366x4956bbec extends C9609n implements Function1<Object, String> {
    public C3366x4956bbec(Object obj) {
        super(1, obj, NativePermissionStatus.Companion.class, "fromAndroidAuthorizationStatus", "fromAndroidAuthorizationStatus(Ljava/lang/Object;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(Object obj) {
        return ((NativePermissionStatus.Companion) this.receiver).fromAndroidAuthorizationStatus(obj);
    }
}