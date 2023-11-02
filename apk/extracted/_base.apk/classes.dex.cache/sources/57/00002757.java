package com.facebook.react.uimanager.layoutanimation;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum LayoutAnimationType {
    CREATE,
    UPDATE,
    DELETE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.uimanager.layoutanimation.LayoutAnimationType$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C42331 {

        /* renamed from: $SwitchMap$com$facebook$react$uimanager$layoutanimation$LayoutAnimationType */
        static final /* synthetic */ int[] f10924x364296ff;

        static {
            int[] iArr = new int[LayoutAnimationType.values().length];
            f10924x364296ff = iArr;
            try {
                iArr[LayoutAnimationType.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10924x364296ff[LayoutAnimationType.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10924x364296ff[LayoutAnimationType.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String toString(LayoutAnimationType layoutAnimationType) {
        int i = C42331.f10924x364296ff[layoutAnimationType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "delete";
                }
                throw new IllegalArgumentException("Unsupported LayoutAnimationType: " + layoutAnimationType);
            }
            return "update";
        }
        return "create";
    }
}