package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.chat.presentation.message.view.GuildView;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class GuildInviteViewBinding implements ViewBinding {
    public final Barrier barrierButton;
    public final Barrier barrierHeader;
    public final ConstraintLayout itemBottomContainer;
    public final TextView itemInviteHeader;
    public final FrameLayout itemInviteHubLayout;
    public final TextView itemInviteHubLink;
    public final GuildView itemInviteImage;
    public final DCDButton itemInviteJoinedButton;
    public final LinearLayout itemInviteMemberContainer;
    public final ImageView itemInviteOnlineDot;
    public final TextView itemInviteOnlineText;
    public final SimpleDraweeView itemInviteSplash;
    public final TextView itemInviteSubtitle;
    public final SimpleDraweeView itemInviteSubtitleIcon;
    public final TextView itemInviteTitle;
    public final ImageView itemInviteTotalMemberDot;
    public final TextView itemInviteTotalMemberText;
    private final View rootView;

    private GuildInviteViewBinding(View view, Barrier barrier, Barrier barrier2, ConstraintLayout constraintLayout, TextView textView, FrameLayout frameLayout, TextView textView2, GuildView guildView, DCDButton dCDButton, LinearLayout linearLayout, ImageView imageView, TextView textView3, SimpleDraweeView simpleDraweeView, TextView textView4, SimpleDraweeView simpleDraweeView2, TextView textView5, ImageView imageView2, TextView textView6) {
        this.rootView = view;
        this.barrierButton = barrier;
        this.barrierHeader = barrier2;
        this.itemBottomContainer = constraintLayout;
        this.itemInviteHeader = textView;
        this.itemInviteHubLayout = frameLayout;
        this.itemInviteHubLink = textView2;
        this.itemInviteImage = guildView;
        this.itemInviteJoinedButton = dCDButton;
        this.itemInviteMemberContainer = linearLayout;
        this.itemInviteOnlineDot = imageView;
        this.itemInviteOnlineText = textView3;
        this.itemInviteSplash = simpleDraweeView;
        this.itemInviteSubtitle = textView4;
        this.itemInviteSubtitleIcon = simpleDraweeView2;
        this.itemInviteTitle = textView5;
        this.itemInviteTotalMemberDot = imageView2;
        this.itemInviteTotalMemberText = textView6;
    }

    public static GuildInviteViewBinding bind(View view) {
        int i = C2912R.C2914id.barrier_button;
        Barrier barrier = (Barrier) C12815a.m3875a(view, i);
        if (barrier != null) {
            i = C2912R.C2914id.barrier_header;
            Barrier barrier2 = (Barrier) C12815a.m3875a(view, i);
            if (barrier2 != null) {
                i = C2912R.C2914id.item_bottom_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) C12815a.m3875a(view, i);
                if (constraintLayout != null) {
                    i = C2912R.C2914id.item_invite_header;
                    TextView textView = (TextView) C12815a.m3875a(view, i);
                    if (textView != null) {
                        i = C2912R.C2914id.item_invite_hub_layout;
                        FrameLayout frameLayout = (FrameLayout) C12815a.m3875a(view, i);
                        if (frameLayout != null) {
                            i = C2912R.C2914id.item_invite_hub_link;
                            TextView textView2 = (TextView) C12815a.m3875a(view, i);
                            if (textView2 != null) {
                                i = C2912R.C2914id.item_invite_image;
                                GuildView guildView = (GuildView) C12815a.m3875a(view, i);
                                if (guildView != null) {
                                    i = C2912R.C2914id.item_invite_joined_button;
                                    DCDButton dCDButton = (DCDButton) C12815a.m3875a(view, i);
                                    if (dCDButton != null) {
                                        i = C2912R.C2914id.item_invite_member_container;
                                        LinearLayout linearLayout = (LinearLayout) C12815a.m3875a(view, i);
                                        if (linearLayout != null) {
                                            i = C2912R.C2914id.item_invite_online_dot;
                                            ImageView imageView = (ImageView) C12815a.m3875a(view, i);
                                            if (imageView != null) {
                                                i = C2912R.C2914id.item_invite_online_text;
                                                TextView textView3 = (TextView) C12815a.m3875a(view, i);
                                                if (textView3 != null) {
                                                    i = C2912R.C2914id.item_invite_splash;
                                                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
                                                    if (simpleDraweeView != null) {
                                                        i = C2912R.C2914id.item_invite_subtitle;
                                                        TextView textView4 = (TextView) C12815a.m3875a(view, i);
                                                        if (textView4 != null) {
                                                            i = C2912R.C2914id.item_invite_subtitle_icon;
                                                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C12815a.m3875a(view, i);
                                                            if (simpleDraweeView2 != null) {
                                                                i = C2912R.C2914id.item_invite_title;
                                                                TextView textView5 = (TextView) C12815a.m3875a(view, i);
                                                                if (textView5 != null) {
                                                                    i = C2912R.C2914id.item_invite_total_member_dot;
                                                                    ImageView imageView2 = (ImageView) C12815a.m3875a(view, i);
                                                                    if (imageView2 != null) {
                                                                        i = C2912R.C2914id.item_invite_total_member_text;
                                                                        TextView textView6 = (TextView) C12815a.m3875a(view, i);
                                                                        if (textView6 != null) {
                                                                            return new GuildInviteViewBinding(view, barrier, barrier2, constraintLayout, textView, frameLayout, textView2, guildView, dCDButton, linearLayout, imageView, textView3, simpleDraweeView, textView4, simpleDraweeView2, textView5, imageView2, textView6);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static GuildInviteViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.guild_invite_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}