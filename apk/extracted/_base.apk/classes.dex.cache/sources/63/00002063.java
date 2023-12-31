package com.discord.sticker.sticker_types;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p208l3.C10035c;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J/\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J'\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m14357d2 = {"Lcom/discord/sticker/sticker_types/PNGStickerView;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", ReactTextInputShadowNode.PROP_PLACEHOLDER, "Landroid/graphics/drawable/ShapeDrawable;", "loadGifImage", "", "url", "", "widthDp", "", "heightDp", "animate", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "loadImage", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "sticker_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class PNGStickerView extends SimpleDraweeView {
    private final ShapeDrawable placeholder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PNGStickerView(Context context) {
        super(context);
        C9612q.m13917h(context, "context");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new OvalShape());
        shapeDrawable.getPaint().setColor(ThemeManagerKt.getTheme().getBackgroundAccent());
        this.placeholder = shapeDrawable;
    }

    public final void loadGifImage(String url, Integer num, Integer num2, boolean z) {
        int i;
        C9612q.m13917h(url, "url");
        setController(C10035c.m12506g().m31650O(url).m31598z(z).build());
        int i2 = ViewDefaults.NUMBER_OF_LINES;
        if (num != null) {
            i = num.intValue();
        } else {
            i = Integer.MAX_VALUE;
        }
        setMaxWidth(i);
        if (num2 != null) {
            i2 = num2.intValue();
        }
        setMaxHeight(i2);
    }

    public final void loadImage(String url, Integer num, Integer num2) {
        int i;
        C9612q.m13917h(url, "url");
        setImageURI(url);
        getHierarchy().m31466t(ScalingUtils.ScaleType.f9840e);
        getHierarchy().m31460z(this.placeholder);
        int i2 = ViewDefaults.NUMBER_OF_LINES;
        if (num != null) {
            i = num.intValue();
        } else {
            i = Integer.MAX_VALUE;
        }
        setMaxWidth(i);
        if (num2 != null) {
            i2 = num2.intValue();
        }
        setMaxHeight(i2);
    }
}