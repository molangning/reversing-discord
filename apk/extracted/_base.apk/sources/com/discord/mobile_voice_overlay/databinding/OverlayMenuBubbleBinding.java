package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.discord.mobile_voice_overlay.C3317R;
import com.discord.mobile_voice_overlay.views.OverlayMenuView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class OverlayMenuBubbleBinding implements ViewBinding {
    public final LinearLayout overlayHeader;
    public final View overlayLinkedAnchorView;
    public final TextView overlayMembersOverflowText;
    public final RecyclerView overlayMembersRecycler;
    public final OverlayMenuView overlayMenu;
    private final LinearLayout rootView;

    private OverlayMenuBubbleBinding(LinearLayout linearLayout, LinearLayout linearLayout2, View view, TextView textView, RecyclerView recyclerView, OverlayMenuView overlayMenuView) {
        this.rootView = linearLayout;
        this.overlayHeader = linearLayout2;
        this.overlayLinkedAnchorView = view;
        this.overlayMembersOverflowText = textView;
        this.overlayMembersRecycler = recyclerView;
        this.overlayMenu = overlayMenuView;
    }

    public static OverlayMenuBubbleBinding bind(View view) {
        View m3875a;
        int i = C3317R.C3319id.overlay_header;
        LinearLayout linearLayout = (LinearLayout) C12815a.m3875a(view, i);
        if (linearLayout != null && (m3875a = C12815a.m3875a(view, (i = C3317R.C3319id.overlay_linked_anchor_view))) != null) {
            i = C3317R.C3319id.overlay_members_overflow_text;
            TextView textView = (TextView) C12815a.m3875a(view, i);
            if (textView != null) {
                i = C3317R.C3319id.overlay_members_recycler;
                RecyclerView recyclerView = (RecyclerView) C12815a.m3875a(view, i);
                if (recyclerView != null) {
                    i = C3317R.C3319id.overlay_menu;
                    OverlayMenuView overlayMenuView = (OverlayMenuView) C12815a.m3875a(view, i);
                    if (overlayMenuView != null) {
                        return new OverlayMenuBubbleBinding((LinearLayout) view, linearLayout, m3875a, textView, recyclerView, overlayMenuView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static OverlayMenuBubbleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static OverlayMenuBubbleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C3317R.layout.overlay_menu_bubble, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
