package com.discord.react_gesture_handler.nested_touch;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u001c\u0010\u000e\u001a\u00020\u000f*\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m14357d2 = {"Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "origin", "Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;", "originSupplemental", "scaledTouchSlopPx", "", "cleanUp", "", "hasOriginMoved", "", "isSupplementalEvent", "event", "Landroid/view/MotionEvent;", "x", "", "y", "Origin", "react_gesture_handler_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class OriginTracker {
    private final Context context;
    private Origin origin;
    private Origin originSupplemental;
    private final int scaledTouchSlopPx;

    @Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m14357d2 = {"Lcom/discord/react_gesture_handler/nested_touch/OriginTracker$Origin;", "", "xOrigin", "", "yOrigin", "(FF)V", "getXOrigin", "()F", "getYOrigin", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "react_gesture_handler_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
    public static final class Origin {
        private final float xOrigin;
        private final float yOrigin;

        public Origin(float f, float f2) {
            this.xOrigin = f;
            this.yOrigin = f2;
        }

        public static /* synthetic */ Origin copy$default(Origin origin, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = origin.xOrigin;
            }
            if ((i & 2) != 0) {
                f2 = origin.yOrigin;
            }
            return origin.copy(f, f2);
        }

        public final float component1() {
            return this.xOrigin;
        }

        public final float component2() {
            return this.yOrigin;
        }

        public final Origin copy(float f, float f2) {
            return new Origin(f, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Origin) {
                Origin origin = (Origin) obj;
                return Float.compare(this.xOrigin, origin.xOrigin) == 0 && Float.compare(this.yOrigin, origin.yOrigin) == 0;
            }
            return false;
        }

        public final float getXOrigin() {
            return this.xOrigin;
        }

        public final float getYOrigin() {
            return this.yOrigin;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.xOrigin) * 31) + Float.floatToIntBits(this.yOrigin);
        }

        public String toString() {
            float f = this.xOrigin;
            float f2 = this.yOrigin;
            return "Origin(xOrigin=" + f + ", yOrigin=" + f2 + ")";
        }
    }

    public OriginTracker(Context context) {
        C9612q.m13917h(context, "context");
        this.context = context;
        this.scaledTouchSlopPx = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final void cleanUp() {
        this.origin = null;
        this.originSupplemental = null;
    }

    public final Context getContext() {
        return this.context;
    }

    public final boolean hasOriginMoved(boolean z, MotionEvent event) {
        C9612q.m13917h(event, "event");
        if (z) {
            if (this.originSupplemental == null) {
                this.originSupplemental = new Origin(event.getX(), event.getY());
            }
            Origin origin = this.originSupplemental;
            if (origin != null && hasOriginMoved(origin, event.getX(), event.getY())) {
                return true;
            }
        } else {
            if (this.origin == null) {
                this.origin = new Origin(event.getX(), event.getY());
            }
            Origin origin2 = this.origin;
            if (origin2 != null && hasOriginMoved(origin2, event.getX(), event.getY())) {
                return true;
            }
        }
        return false;
    }

    private final boolean hasOriginMoved(Origin origin, float f, float f2) {
        return Math.abs(f - origin.getXOrigin()) > ((float) this.scaledTouchSlopPx) || Math.abs(f2 - origin.getYOrigin()) > ((float) this.scaledTouchSlopPx);
    }
}
