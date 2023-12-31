package com.discord.emoji_picker.react;

import com.discord.emoji_picker.EmojiPickerRow;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;
import p304qf.AbstractC11883p;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m14357d2 = {"deserializeEmojiPickerRowData", "Lcom/discord/emoji_picker/EmojiPickerRow;", "data", "Lcom/facebook/react/bridge/ReadableMap;", "emoji_picker_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class EmojiPickerRowDataSerializationUtilsKt {
    public static final EmojiPickerRow deserializeEmojiPickerRowData(ReadableMap data) {
        int m14093t;
        EmojiPickerRow.Emoji emoji;
        C9612q.m13917h(data, "data");
        int i = data.getInt("rowContentWidth");
        int i2 = data.getInt("rowContentPaddingVertical");
        int i3 = data.getInt("itemSize");
        ReadableArray nonNullArray = NativeMapExtensionsKt.getNonNullArray(data, "items");
        IntRange sizeRange = NativeArrayExtensionsKt.sizeRange(nonNullArray);
        m14093t = C9546k.m14093t(sizeRange, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        Iterator<Integer> it = sizeRange.iterator();
        while (it.hasNext()) {
            int nextInt = ((AbstractC11883p) it).nextInt();
            if (!nonNullArray.isNull(nextInt) && !NativeMapExtensionsKt.getBoolean(nonNullArray.getMap(nextInt), "invisible", false)) {
                ReadableMap emojiRaw = nonNullArray.getMap(nextInt);
                String string = emojiRaw.getString("emojiId");
                C9612q.m13918g(emojiRaw, "emojiRaw");
                emoji = new EmojiPickerRow.Emoji(string, NativeMapExtensionsKt.getNonNullString(emojiRaw, "emojiName"), NativeMapExtensionsKt.getNonNullString(emojiRaw, "emojiUrl"), NativeMapExtensionsKt.getBoolean(emojiRaw, "disabled", false));
            } else {
                emoji = null;
            }
            arrayList.add(emoji);
        }
        return new EmojiPickerRow(i, i2, i3, arrayList);
    }
}