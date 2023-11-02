package com.discord.portals;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003Jq\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, m14357d2 = {"Lcom/discord/portals/PortalViewContext;", "", "view", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "removeViewFromParent", "Lkotlin/Function1;", "", "onViewAddedToPortal", "onViewRemovedFromPortal", "returnViewToParent", "(Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getOnViewAddedToPortal", "()Lkotlin/jvm/functions/Function1;", "getOnViewRemovedFromPortal", "getRemoveViewFromParent", "getReturnViewToParent", "getView", "()Ljava/lang/ref/WeakReference;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "portals_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class PortalViewContext {
    private final Function1<View, Unit> onViewAddedToPortal;
    private final Function1<View, Unit> onViewRemovedFromPortal;
    private final Function1<View, Unit> removeViewFromParent;
    private final Function1<View, Unit> returnViewToParent;
    private final WeakReference<View> view;

    /* JADX WARN: Multi-variable type inference failed */
    public PortalViewContext(WeakReference<View> view, Function1<? super View, Unit> removeViewFromParent, Function1<? super View, Unit> onViewAddedToPortal, Function1<? super View, Unit> onViewRemovedFromPortal, Function1<? super View, Unit> returnViewToParent) {
        C9612q.m13917h(view, "view");
        C9612q.m13917h(removeViewFromParent, "removeViewFromParent");
        C9612q.m13917h(onViewAddedToPortal, "onViewAddedToPortal");
        C9612q.m13917h(onViewRemovedFromPortal, "onViewRemovedFromPortal");
        C9612q.m13917h(returnViewToParent, "returnViewToParent");
        this.view = view;
        this.removeViewFromParent = removeViewFromParent;
        this.onViewAddedToPortal = onViewAddedToPortal;
        this.onViewRemovedFromPortal = onViewRemovedFromPortal;
        this.returnViewToParent = returnViewToParent;
    }

    public static /* synthetic */ PortalViewContext copy$default(PortalViewContext portalViewContext, WeakReference weakReference, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i, Object obj) {
        WeakReference<View> weakReference2 = weakReference;
        if ((i & 1) != 0) {
            weakReference2 = portalViewContext.view;
        }
        Function1<View, Unit> function15 = function1;
        if ((i & 2) != 0) {
            function15 = portalViewContext.removeViewFromParent;
        }
        Function1 function16 = function15;
        Function1<View, Unit> function17 = function12;
        if ((i & 4) != 0) {
            function17 = portalViewContext.onViewAddedToPortal;
        }
        Function1 function18 = function17;
        Function1<View, Unit> function19 = function13;
        if ((i & 8) != 0) {
            function19 = portalViewContext.onViewRemovedFromPortal;
        }
        Function1 function110 = function19;
        Function1<View, Unit> function111 = function14;
        if ((i & 16) != 0) {
            function111 = portalViewContext.returnViewToParent;
        }
        return portalViewContext.copy(weakReference2, function16, function18, function110, function111);
    }

    public final WeakReference<View> component1() {
        return this.view;
    }

    public final Function1<View, Unit> component2() {
        return this.removeViewFromParent;
    }

    public final Function1<View, Unit> component3() {
        return this.onViewAddedToPortal;
    }

    public final Function1<View, Unit> component4() {
        return this.onViewRemovedFromPortal;
    }

    public final Function1<View, Unit> component5() {
        return this.returnViewToParent;
    }

    public final PortalViewContext copy(WeakReference<View> view, Function1<? super View, Unit> removeViewFromParent, Function1<? super View, Unit> onViewAddedToPortal, Function1<? super View, Unit> onViewRemovedFromPortal, Function1<? super View, Unit> returnViewToParent) {
        C9612q.m13917h(view, "view");
        C9612q.m13917h(removeViewFromParent, "removeViewFromParent");
        C9612q.m13917h(onViewAddedToPortal, "onViewAddedToPortal");
        C9612q.m13917h(onViewRemovedFromPortal, "onViewRemovedFromPortal");
        C9612q.m13917h(returnViewToParent, "returnViewToParent");
        return new PortalViewContext(view, removeViewFromParent, onViewAddedToPortal, onViewRemovedFromPortal, returnViewToParent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PortalViewContext) {
            PortalViewContext portalViewContext = (PortalViewContext) obj;
            return C9612q.m13922c(this.view, portalViewContext.view) && C9612q.m13922c(this.removeViewFromParent, portalViewContext.removeViewFromParent) && C9612q.m13922c(this.onViewAddedToPortal, portalViewContext.onViewAddedToPortal) && C9612q.m13922c(this.onViewRemovedFromPortal, portalViewContext.onViewRemovedFromPortal) && C9612q.m13922c(this.returnViewToParent, portalViewContext.returnViewToParent);
        }
        return false;
    }

    public final Function1<View, Unit> getOnViewAddedToPortal() {
        return this.onViewAddedToPortal;
    }

    public final Function1<View, Unit> getOnViewRemovedFromPortal() {
        return this.onViewRemovedFromPortal;
    }

    public final Function1<View, Unit> getRemoveViewFromParent() {
        return this.removeViewFromParent;
    }

    public final Function1<View, Unit> getReturnViewToParent() {
        return this.returnViewToParent;
    }

    public final WeakReference<View> getView() {
        return this.view;
    }

    public int hashCode() {
        return (((((((this.view.hashCode() * 31) + this.removeViewFromParent.hashCode()) * 31) + this.onViewAddedToPortal.hashCode()) * 31) + this.onViewRemovedFromPortal.hashCode()) * 31) + this.returnViewToParent.hashCode();
    }

    public String toString() {
        WeakReference<View> weakReference = this.view;
        Function1<View, Unit> function1 = this.removeViewFromParent;
        Function1<View, Unit> function12 = this.onViewAddedToPortal;
        Function1<View, Unit> function13 = this.onViewRemovedFromPortal;
        Function1<View, Unit> function14 = this.returnViewToParent;
        return "PortalViewContext(view=" + weakReference + ", removeViewFromParent=" + function1 + ", onViewAddedToPortal=" + function12 + ", onViewRemovedFromPortal=" + function13 + ", returnViewToParent=" + function14 + ")";
    }
}
