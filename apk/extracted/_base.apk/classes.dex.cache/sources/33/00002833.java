package com.facebook.react.views.scroll;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.PixelUtil;
import java.util.Map;
import p058d5.C5743a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactScrollViewCommandHelper {
    public static final int COMMAND_FLASH_SCROLL_INDICATORS = 3;
    public static final int COMMAND_SCROLL_TO = 1;
    public static final int COMMAND_SCROLL_TO_END = 2;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface ScrollCommandHandler<T> {
        void flashScrollIndicators(T t);

        void scrollTo(T t, ScrollToCommandData scrollToCommandData);

        void scrollToEnd(T t, ScrollToEndCommandData scrollToEndCommandData);
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class ScrollToCommandData {
        public final boolean mAnimated;
        public final int mDestX;
        public final int mDestY;

        ScrollToCommandData(int i, int i2, boolean z) {
            this.mDestX = i;
            this.mDestY = i2;
            this.mAnimated = z;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class ScrollToEndCommandData {
        public final boolean mAnimated;

        ScrollToEndCommandData(boolean z) {
            this.mAnimated = z;
        }
    }

    public static Map<String, Integer> getCommandsMap() {
        return MapBuilder.m30468of("scrollTo", 1, "scrollToEnd", 2, "flashScrollIndicators", 3);
    }

    public static <T> void receiveCommand(ScrollCommandHandler<T> scrollCommandHandler, T t, int i, ReadableArray readableArray) {
        C5743a.m24583c(scrollCommandHandler);
        C5743a.m24583c(t);
        C5743a.m24583c(readableArray);
        if (i == 1) {
            scrollTo(scrollCommandHandler, t, readableArray);
        } else if (i == 2) {
            scrollToEnd(scrollCommandHandler, t, readableArray);
        } else if (i == 3) {
            scrollCommandHandler.flashScrollIndicators(t);
        } else {
            throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), scrollCommandHandler.getClass().getSimpleName()));
        }
    }

    private static <T> void scrollTo(ScrollCommandHandler<T> scrollCommandHandler, T t, ReadableArray readableArray) {
        scrollCommandHandler.scrollTo(t, new ScrollToCommandData(Math.round(PixelUtil.toPixelFromDIP(readableArray.getDouble(0))), Math.round(PixelUtil.toPixelFromDIP(readableArray.getDouble(1))), readableArray.getBoolean(2)));
    }

    private static <T> void scrollToEnd(ScrollCommandHandler<T> scrollCommandHandler, T t, ReadableArray readableArray) {
        scrollCommandHandler.scrollToEnd(t, new ScrollToEndCommandData(readableArray.getBoolean(0)));
    }

    public static <T> void receiveCommand(ScrollCommandHandler<T> scrollCommandHandler, T t, String str, ReadableArray readableArray) {
        C5743a.m24583c(scrollCommandHandler);
        C5743a.m24583c(t);
        C5743a.m24583c(readableArray);
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -402165208:
                if (str.equals("scrollTo")) {
                    c = 0;
                    break;
                }
                break;
            case 28425985:
                if (str.equals("flashScrollIndicators")) {
                    c = 1;
                    break;
                }
                break;
            case 2055114131:
                if (str.equals("scrollToEnd")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                scrollTo(scrollCommandHandler, t, readableArray);
                return;
            case 1:
                scrollCommandHandler.flashScrollIndicators(t);
                return;
            case 2:
                scrollToEnd(scrollCommandHandler, t, readableArray);
                return;
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %s received by %s.", str, scrollCommandHandler.getClass().getSimpleName()));
        }
    }
}