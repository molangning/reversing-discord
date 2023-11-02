package com.facebook.yoga;

import p192k5.InterfaceC9061a;

@InterfaceC9061a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);
    

    /* renamed from: j */
    private final int f11060j;

    YogaLogLevel(int i) {
        this.f11060j = i;
    }

    @InterfaceC9061a
    public static YogaLogLevel fromInt(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return FATAL;
                            }
                            throw new IllegalArgumentException("Unknown enum value: " + i);
                        }
                        return VERBOSE;
                    }
                    return DEBUG;
                }
                return INFO;
            }
            return WARN;
        }
        return ERROR;
    }
}
