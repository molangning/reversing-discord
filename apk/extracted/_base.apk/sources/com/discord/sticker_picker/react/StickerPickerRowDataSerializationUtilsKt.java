package com.discord.sticker_picker.react;

import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.sticker_picker.StickerPickerRow;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;
import p304qf.AbstractC11883p;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m14357d2 = {"deserializeStickerPickerRowData", "Lcom/discord/sticker_picker/StickerPickerRow;", "data", "Lcom/facebook/react/bridge/ReadableMap;", "sticker_picker_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class StickerPickerRowDataSerializationUtilsKt {
    public static final StickerPickerRow deserializeStickerPickerRowData(ReadableMap data) {
        int m14093t;
        StickerPickerRow.Sticker sticker;
        StickerPickerRow.Sticker.Type type;
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
            if (!nonNullArray.isNull(nextInt)) {
                ReadableMap stickerRow = nonNullArray.getMap(nextInt);
                C9612q.m13918g(stickerRow, "stickerRow");
                String nonNullString = NativeMapExtensionsKt.getNonNullString(stickerRow, "stickerId");
                String nonNullString2 = NativeMapExtensionsKt.getNonNullString(stickerRow, "stickerName");
                int i4 = stickerRow.getInt("stickerType");
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 4) {
                                type = StickerPickerRow.Sticker.Type.GIF;
                            } else {
                                throw new IllegalArgumentException("Unknown type " + i4);
                            }
                        } else {
                            type = StickerPickerRow.Sticker.Type.LOTTIE;
                        }
                    } else {
                        type = StickerPickerRow.Sticker.Type.APNG;
                    }
                } else {
                    type = StickerPickerRow.Sticker.Type.PNG;
                }
                sticker = new StickerPickerRow.Sticker(nonNullString, nonNullString2, type, stickerRow.getBoolean("stickerAnimated"), NativeMapExtensionsKt.getNonNullString(stickerRow, "stickerUrl"), stickerRow.getBoolean("stickerDisabled"), stickerRow.getBoolean("stickerOpaque"));
            } else {
                sticker = null;
            }
            arrayList.add(sticker);
        }
        return new StickerPickerRow(i, i2, i3, arrayList);
    }
}
