package com.discord.image.dominant_color;

import android.graphics.Bitmap;
import com.discord.image.DominantColor;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.facebook.react.bridge.Promise;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class ImageManagerModule$getDominantColors$1 extends AbstractC9614s implements Function1<Bitmap, Unit> {
    final /* synthetic */ Promise $promise;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageManagerModule$getDominantColors$1(Promise promise) {
        super(1);
        this.$promise = promise;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(Bitmap bitmap) {
        int m14093t;
        if (bitmap != null) {
            List<Integer> representativeColors = DominantColor.INSTANCE.getRepresentativeColors(bitmap);
            if (representativeColors != null) {
                m14093t = C9546k.m14093t(representativeColors, 10);
                ArrayList arrayList = new ArrayList(m14093t);
                for (Number number : representativeColors) {
                    int intValue = number.intValue();
                    arrayList.add(NativeArrayExtensionsKt.nativeArrayOf(Integer.valueOf((intValue >> 16) & 255), Integer.valueOf((intValue >> 8) & 255), Integer.valueOf(intValue & 255)));
                }
                this.$promise.resolve(NativeArrayExtensionsKt.toNativeArray(arrayList));
                return;
            }
            this.$promise.reject(new Exception("Unable get representative color."));
            return;
        }
        this.$promise.reject(new Exception("Unable to decode image source."));
    }
}