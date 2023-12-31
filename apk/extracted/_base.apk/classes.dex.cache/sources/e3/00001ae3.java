package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.mobile_voice_overlay.C3317R;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class ViewOverlayMenuBinding implements ViewBinding {
    public final SimpleDraweeView disconnectBtn;
    public final CardView menuBottom;
    public final CardView menuTop;
    public final ConstraintLayout menuTopStatusContainer;
    public final SimpleDraweeView muteToggle;
    public final TextView overlayChannelName;
    public final TextView overlayGuildName;
    public final TextView overlayInviteLink;
    public final SimpleDraweeView overlayNetworkIcon;
    public final TextView overlayOpenApp;
    public final TextView overlaySwitchChannels;
    private final View rootView;
    public final SimpleDraweeView srcToggle;

    private ViewOverlayMenuBinding(View view, SimpleDraweeView simpleDraweeView, CardView cardView, CardView cardView2, ConstraintLayout constraintLayout, SimpleDraweeView simpleDraweeView2, TextView textView, TextView textView2, TextView textView3, SimpleDraweeView simpleDraweeView3, TextView textView4, TextView textView5, SimpleDraweeView simpleDraweeView4) {
        this.rootView = view;
        this.disconnectBtn = simpleDraweeView;
        this.menuBottom = cardView;
        this.menuTop = cardView2;
        this.menuTopStatusContainer = constraintLayout;
        this.muteToggle = simpleDraweeView2;
        this.overlayChannelName = textView;
        this.overlayGuildName = textView2;
        this.overlayInviteLink = textView3;
        this.overlayNetworkIcon = simpleDraweeView3;
        this.overlayOpenApp = textView4;
        this.overlaySwitchChannels = textView5;
        this.srcToggle = simpleDraweeView4;
    }

    public static ViewOverlayMenuBinding bind(View view) {
        int i = C3317R.C3319id.disconnect_btn;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
        if (simpleDraweeView != null) {
            i = C3317R.C3319id.menu_bottom;
            CardView cardView = (CardView) C12815a.m3875a(view, i);
            if (cardView != null) {
                i = C3317R.C3319id.menu_top;
                CardView cardView2 = (CardView) C12815a.m3875a(view, i);
                if (cardView2 != null) {
                    i = C3317R.C3319id.menu_top_status_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) C12815a.m3875a(view, i);
                    if (constraintLayout != null) {
                        i = C3317R.C3319id.mute_toggle;
                        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C12815a.m3875a(view, i);
                        if (simpleDraweeView2 != null) {
                            i = C3317R.C3319id.overlay_channel_name;
                            TextView textView = (TextView) C12815a.m3875a(view, i);
                            if (textView != null) {
                                i = C3317R.C3319id.overlay_guild_name;
                                TextView textView2 = (TextView) C12815a.m3875a(view, i);
                                if (textView2 != null) {
                                    i = C3317R.C3319id.overlay_invite_link;
                                    TextView textView3 = (TextView) C12815a.m3875a(view, i);
                                    if (textView3 != null) {
                                        i = C3317R.C3319id.overlay_network_icon;
                                        SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) C12815a.m3875a(view, i);
                                        if (simpleDraweeView3 != null) {
                                            i = C3317R.C3319id.overlay_open_app;
                                            TextView textView4 = (TextView) C12815a.m3875a(view, i);
                                            if (textView4 != null) {
                                                i = C3317R.C3319id.overlay_switch_channels;
                                                TextView textView5 = (TextView) C12815a.m3875a(view, i);
                                                if (textView5 != null) {
                                                    i = C3317R.C3319id.src_toggle;
                                                    SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) C12815a.m3875a(view, i);
                                                    if (simpleDraweeView4 != null) {
                                                        return new ViewOverlayMenuBinding(view, simpleDraweeView, cardView, cardView2, constraintLayout, simpleDraweeView2, textView, textView2, textView3, simpleDraweeView3, textView4, textView5, simpleDraweeView4);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewOverlayMenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3317R.layout.view_overlay_menu, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}