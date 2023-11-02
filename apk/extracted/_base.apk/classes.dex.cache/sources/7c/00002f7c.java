package com.swmansion.gesturehandler.react;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import pe.EnumC11532r;
import pe.InterfaceC11544x;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/l;", "Lpe/x;", "Landroid/view/View;", "view", "Lpe/r;", "a", "Landroid/view/ViewGroup;", "parent", "", "index", "c", "", "b", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.swmansion.gesturehandler.react.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5565l implements InterfaceC11544x {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.swmansion.gesturehandler.react.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C5566a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15584a;

        static {
            int[] iArr = new int[PointerEvents.values().length];
            try {
                iArr[PointerEvents.BOX_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEvents.BOX_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEvents.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PointerEvents.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f15584a = iArr;
        }
    }

    @Override // pe.InterfaceC11544x
    /* renamed from: a */
    public EnumC11532r mo7710a(View view) {
        PointerEvents pointerEvents;
        C9612q.m13917h(view, "view");
        if (view instanceof ReactPointerEventsView) {
            pointerEvents = ((ReactPointerEventsView) view).getPointerEvents();
            C9612q.m13918g(pointerEvents, "{\n        (view as React…ew).pointerEvents\n      }");
        } else {
            pointerEvents = PointerEvents.AUTO;
        }
        if (!view.isEnabled()) {
            if (pointerEvents == PointerEvents.AUTO) {
                return EnumC11532r.BOX_NONE;
            }
            if (pointerEvents == PointerEvents.BOX_ONLY) {
                return EnumC11532r.NONE;
            }
        }
        int i = C5566a.f15584a[pointerEvents.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return EnumC11532r.AUTO;
                    }
                    throw new C11581q();
                }
                return EnumC11532r.NONE;
            }
            return EnumC11532r.BOX_NONE;
        }
        return EnumC11532r.BOX_ONLY;
    }

    @Override // pe.InterfaceC11544x
    /* renamed from: b */
    public boolean mo7709b(ViewGroup view) {
        C9612q.m13917h(view, "view");
        if (view.getClipChildren()) {
            return true;
        }
        if (view instanceof ReactViewGroup) {
            return C9612q.m13922c(ViewProps.HIDDEN, ((ReactViewGroup) view).getOverflow());
        }
        return false;
    }

    @Override // pe.InterfaceC11544x
    /* renamed from: c */
    public View mo7708c(ViewGroup parent, int i) {
        C9612q.m13917h(parent, "parent");
        if (parent instanceof ReactViewGroup) {
            View childAt = parent.getChildAt(((ReactViewGroup) parent).getZIndexMappedChildIndex(i));
            C9612q.m13918g(childAt, "{\n      parent.getChildA…dChildIndex(index))\n    }");
            return childAt;
        }
        View childAt2 = parent.getChildAt(i);
        C9612q.m13918g(childAt2, "parent.getChildAt(index)");
        return childAt2;
    }
}