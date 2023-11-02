package io.sentry;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.react.views.text.TypefaceStyle;
import java.util.Locale;

/* renamed from: io.sentry.i5 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC7975i5 implements InterfaceC8026n1 {
    OK(ItemTouchHelper.AbstractC1746c.DEFAULT_DRAG_ANIMATION_DURATION, 299),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(TypefaceStyle.NORMAL),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(TypefaceStyle.NORMAL),
    ABORTED(409),
    OUT_OF_RANGE(TypefaceStyle.NORMAL),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);
    
    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    /* renamed from: io.sentry.i5$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7976a implements InterfaceC7894d1<EnumC7975i5> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public EnumC7975i5 mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            return EnumC7975i5.valueOf(c7993j1.m18101Y().toUpperCase(Locale.ROOT));
        }
    }

    EnumC7975i5(int i) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i;
    }

    public static EnumC7975i5 fromHttpStatusCode(int i) {
        EnumC7975i5[] values;
        for (EnumC7975i5 enumC7975i5 : values()) {
            if (enumC7975i5.matches(i)) {
                return enumC7975i5;
            }
        }
        return null;
    }

    private boolean matches(int i) {
        return i >= this.minHttpStatusCode && i <= this.maxHttpStatusCode;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18191g(name().toLowerCase(Locale.ROOT));
    }

    public static EnumC7975i5 fromHttpStatusCode(Integer num, EnumC7975i5 enumC7975i5) {
        EnumC7975i5 fromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : enumC7975i5;
        return fromHttpStatusCode != null ? fromHttpStatusCode : enumC7975i5;
    }

    EnumC7975i5(int i, int i2) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i2;
    }
}
