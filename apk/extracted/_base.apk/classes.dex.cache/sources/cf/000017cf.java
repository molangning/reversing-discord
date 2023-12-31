package com.discord.friend_finder.react;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;

@Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m14357d2 = {"<anonymous>", "", "it", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class FriendFinderSerializerKt$serializeHasContactPermissionsResult$1 extends AbstractC9614s implements Function1<Object, Object> {
    public static final FriendFinderSerializerKt$serializeHasContactPermissionsResult$1 INSTANCE = new FriendFinderSerializerKt$serializeHasContactPermissionsResult$1();

    FriendFinderSerializerKt$serializeHasContactPermissionsResult$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int mapResultToContactsPermission;
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            mapResultToContactsPermission = FriendFinderSerializerKt.mapResultToContactsPermission(str);
            return Integer.valueOf(mapResultToContactsPermission);
        }
        return null;
    }
}