package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.core.DCDButton;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ActivityBookmarkViewBinding implements ViewBinding {
    public final Barrier barrierFooter;
    public final SimpleDraweeView icon;
    public final ConstraintLayout itemBottomContainer;
    public final TextView itemDescription;
    public final TextView itemHeader;
    public final SimpleDraweeView itemHero;
    public final DCDButton launchButton;
    public final OverlappingCirclesView participants;
    public final FrameLayout participantsContainer;
    public final TextView participantsInfo;
    public final LinearLayout participantsInfoContainer;
    private final View rootView;

    private ActivityBookmarkViewBinding(View view, Barrier barrier, SimpleDraweeView simpleDraweeView, ConstraintLayout constraintLayout, TextView textView, TextView textView2, SimpleDraweeView simpleDraweeView2, DCDButton dCDButton, OverlappingCirclesView overlappingCirclesView, FrameLayout frameLayout, TextView textView3, LinearLayout linearLayout) {
        this.rootView = view;
        this.barrierFooter = barrier;
        this.icon = simpleDraweeView;
        this.itemBottomContainer = constraintLayout;
        this.itemDescription = textView;
        this.itemHeader = textView2;
        this.itemHero = simpleDraweeView2;
        this.launchButton = dCDButton;
        this.participants = overlappingCirclesView;
        this.participantsContainer = frameLayout;
        this.participantsInfo = textView3;
        this.participantsInfoContainer = linearLayout;
    }

    public static ActivityBookmarkViewBinding bind(View view) {
        int i = C2912R.C2914id.barrier_footer;
        Barrier barrier = (Barrier) C12815a.m3875a(view, i);
        if (barrier != null) {
            i = C2912R.C2914id.icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
            if (simpleDraweeView != null) {
                i = C2912R.C2914id.item_bottom_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) C12815a.m3875a(view, i);
                if (constraintLayout != null) {
                    i = C2912R.C2914id.item_description;
                    TextView textView = (TextView) C12815a.m3875a(view, i);
                    if (textView != null) {
                        i = C2912R.C2914id.item_header;
                        TextView textView2 = (TextView) C12815a.m3875a(view, i);
                        if (textView2 != null) {
                            i = C2912R.C2914id.item_hero;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C12815a.m3875a(view, i);
                            if (simpleDraweeView2 != null) {
                                i = C2912R.C2914id.launch_button;
                                DCDButton dCDButton = (DCDButton) C12815a.m3875a(view, i);
                                if (dCDButton != null) {
                                    i = C2912R.C2914id.participants;
                                    OverlappingCirclesView overlappingCirclesView = (OverlappingCirclesView) C12815a.m3875a(view, i);
                                    if (overlappingCirclesView != null) {
                                        i = C2912R.C2914id.participants_container;
                                        FrameLayout frameLayout = (FrameLayout) C12815a.m3875a(view, i);
                                        if (frameLayout != null) {
                                            i = C2912R.C2914id.participants_info;
                                            TextView textView3 = (TextView) C12815a.m3875a(view, i);
                                            if (textView3 != null) {
                                                i = C2912R.C2914id.participants_info_container;
                                                LinearLayout linearLayout = (LinearLayout) C12815a.m3875a(view, i);
                                                if (linearLayout != null) {
                                                    return new ActivityBookmarkViewBinding(view, barrier, simpleDraweeView, constraintLayout, textView, textView2, simpleDraweeView2, dCDButton, overlappingCirclesView, frameLayout, textView3, linearLayout);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActivityBookmarkViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.activity_bookmark_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
