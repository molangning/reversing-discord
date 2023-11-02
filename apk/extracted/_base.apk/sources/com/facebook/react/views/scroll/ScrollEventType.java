package com.facebook.react.views.scroll;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum ScrollEventType {
    BEGIN_DRAG,
    END_DRAG,
    SCROLL,
    MOMENTUM_BEGIN,
    MOMENTUM_END;

    /* renamed from: com.facebook.react.views.scroll.ScrollEventType$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static /* synthetic */ class C42621 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$views$scroll$ScrollEventType;

        static {
            int[] iArr = new int[ScrollEventType.values().length];
            $SwitchMap$com$facebook$react$views$scroll$ScrollEventType = iArr;
            try {
                iArr[ScrollEventType.BEGIN_DRAG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$views$scroll$ScrollEventType[ScrollEventType.END_DRAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$views$scroll$ScrollEventType[ScrollEventType.SCROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$views$scroll$ScrollEventType[ScrollEventType.MOMENTUM_BEGIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$views$scroll$ScrollEventType[ScrollEventType.MOMENTUM_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static String getJSEventName(ScrollEventType scrollEventType) {
        int i = C42621.$SwitchMap$com$facebook$react$views$scroll$ScrollEventType[scrollEventType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return "topMomentumScrollEnd";
                        }
                        throw new IllegalArgumentException("Unsupported ScrollEventType: " + scrollEventType);
                    }
                    return "topMomentumScrollBegin";
                }
                return "topScroll";
            }
            return "topScrollEndDrag";
        }
        return "topScrollBeginDrag";
    }
}
