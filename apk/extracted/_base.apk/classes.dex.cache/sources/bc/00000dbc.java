package com.discord.blur;

import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, m14357d2 = {"Lcom/discord/blur/BlurViewAPI;", "Lcom/discord/blur/BlurViewAPIBase;", "setBlurTint", "", ViewProps.COLOR, "", "setBlurTintIOSParityCompensation", "Target", "blur_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public interface BlurViewAPI extends BlurViewAPIBase {

    @Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000f"}, m14357d2 = {"Lcom/discord/blur/BlurViewAPI$Target;", "Lcom/discord/blur/BlurViewAPIBase;", "viewRef", "Landroid/view/ViewGroup;", "getViewRef", "()Landroid/view/ViewGroup;", "addBlurRect", "", "rectId", "", "windowX", "windowY", "width", "height", "removeBlurRect", "blur_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface Target extends BlurViewAPIBase {
        void addBlurRect(int i, int i2, int i3, int i4, int i5);

        ViewGroup getViewRef();

        void removeBlurRect(int i);
    }

    void setBlurTint(int i);

    void setBlurTintIOSParityCompensation(int i);
}