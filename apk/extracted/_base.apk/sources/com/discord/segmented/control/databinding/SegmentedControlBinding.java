package com.discord.segmented.control.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.discord.segmented.control.C3467R;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class SegmentedControlBinding implements ViewBinding {
    public final CardView rootCardView;
    private final CardView rootView;
    public final LinearLayout segmentContainer;
    public final CardView selectedSegmentBg;

    private SegmentedControlBinding(CardView cardView, CardView cardView2, LinearLayout linearLayout, CardView cardView3) {
        this.rootView = cardView;
        this.rootCardView = cardView2;
        this.segmentContainer = linearLayout;
        this.selectedSegmentBg = cardView3;
    }

    public static SegmentedControlBinding bind(View view) {
        CardView cardView = (CardView) view;
        int i = C3467R.C3469id.segmentContainer;
        LinearLayout linearLayout = (LinearLayout) C12815a.m3875a(view, i);
        if (linearLayout != null) {
            i = C3467R.C3469id.selectedSegmentBg;
            CardView cardView2 = (CardView) C12815a.m3875a(view, i);
            if (cardView2 != null) {
                return new SegmentedControlBinding(cardView, cardView, linearLayout, cardView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static SegmentedControlBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SegmentedControlBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C3467R.layout.segmented_control, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public CardView getRoot() {
        return this.rootView;
    }
}
