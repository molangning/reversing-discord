package com.discord.chat.presentation.message.decorations;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.chat.presentation.message.view.ThreadEmbedView;
import com.discord.chat.presentation.spine.SpineParentMessage;
import com.discord.misc.utilities.size.SizeUtilsKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;
import p304qf.AbstractC11883p;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m14357d2 = {"Lcom/discord/chat/presentation/message/decorations/ThreadSpineItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "contentStartPositionPx", "", "(Landroid/content/Context;I)V", "showThreadSpine", "", "getShowThreadSpine", "()Z", "setShowThreadSpine", "(Z)V", "spineDrawer", "Lcom/discord/chat/presentation/message/decorations/SpineDrawer;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ThreadSpineItemDecoration extends RecyclerView.ItemDecoration {
    private boolean showThreadSpine;
    private final SpineDrawer spineDrawer;

    public ThreadSpineItemDecoration(Context context, int i) {
        C9612q.m13917h(context, "context");
        this.spineDrawer = new SpineDrawer(context, i);
        this.showThreadSpine = true;
    }

    public final boolean getShowThreadSpine() {
        return this.showThreadSpine;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        SpineParentMessage spineParentMessage;
        View spineOriginView;
        int i;
        C9612q.m13917h(canvas, "canvas");
        C9612q.m13917h(parent, "parent");
        C9612q.m13917h(state, "state");
        super.onDraw(canvas, parent, state);
        if (!this.showThreadSpine) {
            return;
        }
        ViewParent parent2 = parent.getParent();
        if (parent2 instanceof SpineParentMessage) {
            spineParentMessage = (SpineParentMessage) parent2;
        } else {
            spineParentMessage = null;
        }
        if (spineParentMessage != null && (spineOriginView = spineParentMessage.getSpineOriginView()) != null) {
            int left = spineOriginView.getLeft() + (spineOriginView.getMeasuredWidth() / 2);
            Iterator<Integer> it = new IntRange(0, parent.getChildCount()).iterator();
            while (it.hasNext()) {
                int nextInt = ((AbstractC11883p) it).nextInt();
                View childAt = parent.getChildAt(nextInt);
                if (childAt != null) {
                    C9612q.m13918g(childAt, "getChildAt(index)");
                    if (childAt instanceof ThreadEmbedView) {
                        this.spineDrawer.drawSpineCurve(canvas, parent, childAt, childAt, left);
                    } else if (childAt instanceof MessageContentView) {
                        if (nextInt == 0) {
                            i = ((MessageContentView) childAt).getLineHeight() + SizeUtilsKt.getDpToPx(2);
                        } else {
                            i = 0;
                        }
                        this.spineDrawer.drawSpinePiece(canvas, parent, childAt, left, i);
                    } else {
                        SpineDrawer.drawSpinePiece$default(this.spineDrawer, canvas, parent, childAt, left, 0, 16, null);
                    }
                }
            }
        }
    }

    public final void setShowThreadSpine(boolean z) {
        this.showThreadSpine = z;
    }
}