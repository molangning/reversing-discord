package com.discord.reactions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1786c;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.reactions.ReactionView;
import com.discord.recycler_view.ids.IdUtilsKt;
import com.discord.recycler_view.utils.ItemDiffer;
import com.discord.theme.DiscordTheme;
import com.discord.theme.ThemeManager;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u001c\u001a\u00020\u0004H\u0002J\b\u0010\u001d\u001a\u00020\u0004H\u0002J\b\u0010\u001e\u001a\u00020\u0004H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0004H\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0016J\u0018\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0004H\u0016J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0004H\u0016J \u0001\u0010)\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00172\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010*\u001a\u00020\u000bH\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, m14357d2 = {"Lcom/discord/reactions/ReactionsViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "reactionHeight", "", "(I)V", "addNewBurstReactionAccessibilityLabel", "", "addNewReactionAccessibilityLabel", "addReactionLabel", "canAddNewBurstReactions", "", "canAddNewReactions", "messageId", "onAddBurstReactionClick", "Landroid/view/View$OnClickListener;", "onAddReactionClick", "onReactionClick", "Lkotlin/Function1;", "Lcom/discord/reactions/ReactionView$Reaction;", "", "onReactionLongPress", "reactions", "", "reactionsTheme", "Lcom/discord/reactions/ReactionView$ReactionsTheme;", "theme", "Lcom/discord/theme/DiscordTheme;", "getAddBurstReactionIndex", "getAddReactionIndex", "getItemCount", "getItemId", "", ViewProps.POSITION, "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setReactions", "areChatAnimationsEnabled", "ViewType", "reactions_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class ReactionsViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private String addNewBurstReactionAccessibilityLabel;
    private String addNewReactionAccessibilityLabel;
    private String addReactionLabel;
    private boolean canAddNewBurstReactions;
    private boolean canAddNewReactions;
    private String messageId;
    private View.OnClickListener onAddBurstReactionClick;
    private View.OnClickListener onAddReactionClick;
    private Function1<? super ReactionView.Reaction, Unit> onReactionClick;
    private Function1<? super ReactionView.Reaction, Unit> onReactionLongPress;
    private final int reactionHeight;
    private List<? extends ReactionView.Reaction> reactions;
    private ReactionView.ReactionsTheme reactionsTheme;
    private DiscordTheme theme;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/reactions/ReactionsViewAdapter$ViewType;", "", "(Ljava/lang/String;I)V", "BurstReaction", "Reaction", "AddReaction", "AddBurstReaction", "reactions_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    private enum ViewType {
        BurstReaction,
        Reaction,
        AddReaction,
        AddBurstReaction
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[ViewType.BurstReaction.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewType.Reaction.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewType.AddReaction.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ViewType.AddBurstReaction.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReactionsViewAdapter(int i) {
        List<? extends ReactionView.Reaction> m14104i;
        this.reactionHeight = i;
        m14104i = C9545j.m14104i();
        this.reactions = m14104i;
        setHasStableIds(true);
    }

    private final int getAddBurstReactionIndex() {
        return this.canAddNewBurstReactions ? this.reactions.size() : this.reactions.size() + 1;
    }

    private final int getAddReactionIndex() {
        return this.canAddNewBurstReactions ? this.reactions.size() + 1 : this.reactions.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int size = this.reactions.size();
        if (this.canAddNewReactions) {
            int i = size + 1;
            if (this.canAddNewBurstReactions) {
                return i + 1;
            }
            return i;
        }
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        String str = null;
        if (i == getAddBurstReactionIndex()) {
            String str2 = this.messageId;
            if (str2 == null) {
                C9612q.m13900y("messageId");
                str2 = null;
            }
            String str3 = this.addReactionLabel;
            if (str3 == null) {
                C9612q.m13900y("addReactionLabel");
            } else {
                str = str3;
            }
            return IdUtilsKt.convertToId(str2 + "_add_burst_reactions_" + str);
        } else if (i == getAddReactionIndex()) {
            String str4 = this.messageId;
            if (str4 == null) {
                C9612q.m13900y("messageId");
                str4 = null;
            }
            String str5 = this.addReactionLabel;
            if (str5 == null) {
                C9612q.m13900y("addReactionLabel");
            } else {
                str = str5;
            }
            return IdUtilsKt.convertToId(str4 + "_add_reactions_" + str);
        } else {
            ReactionView.Reaction reaction = this.reactions.get(i);
            String str6 = this.messageId;
            if (str6 == null) {
                C9612q.m13900y("messageId");
            } else {
                str = str6;
            }
            return IdUtilsKt.convertToId(str + "_" + reaction.getEmoji().getEmojiId() + reaction.isBurstReaction());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        ViewType viewType;
        if (i == getAddBurstReactionIndex()) {
            viewType = ViewType.AddBurstReaction;
        } else if (i == getAddReactionIndex()) {
            viewType = ViewType.AddReaction;
        } else if (this.reactions.get(i).isBurstReaction()) {
            viewType = ViewType.BurstReaction;
        } else {
            viewType = ViewType.Reaction;
        }
        return viewType.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        C9612q.m13917h(holder, "holder");
        ThemeManager themeManager = ThemeManager.INSTANCE;
        DiscordTheme themeOverride = themeManager.getThemeOverride();
        themeManager.setThemeOverride(this.theme);
        View.OnClickListener onClickListener = null;
        Function1<? super ReactionView.Reaction, Unit> function1 = null;
        Function1<? super ReactionView.Reaction, Unit> function12 = null;
        View.OnClickListener onClickListener2 = null;
        if (holder instanceof BurstReactionViewHolder) {
            ReactionView.Reaction reaction = this.reactions.get(i);
            BurstReactionViewHolder burstReactionViewHolder = (BurstReactionViewHolder) holder;
            Function1<? super ReactionView.Reaction, Unit> function13 = this.onReactionClick;
            if (function13 == null) {
                C9612q.m13900y("onReactionClick");
                function13 = null;
            }
            Function1<? super ReactionView.Reaction, Unit> function14 = this.onReactionLongPress;
            if (function14 == null) {
                C9612q.m13900y("onReactionLongPress");
            } else {
                function1 = function14;
            }
            burstReactionViewHolder.bind(reaction, function13, function1);
        } else if (holder instanceof ReactionViewHolder) {
            ReactionView.Reaction reaction2 = this.reactions.get(i);
            ReactionViewHolder reactionViewHolder = (ReactionViewHolder) holder;
            Function1<? super ReactionView.Reaction, Unit> function15 = this.onReactionClick;
            if (function15 == null) {
                C9612q.m13900y("onReactionClick");
                function15 = null;
            }
            Function1<? super ReactionView.Reaction, Unit> function16 = this.onReactionLongPress;
            if (function16 == null) {
                C9612q.m13900y("onReactionLongPress");
            } else {
                function12 = function16;
            }
            reactionViewHolder.bind(reaction2, function15, function12, this.reactionsTheme);
        } else if (holder instanceof AddReactionViewHolder) {
            AddReactionViewHolder addReactionViewHolder = (AddReactionViewHolder) holder;
            String str = this.addReactionLabel;
            if (str == null) {
                C9612q.m13900y("addReactionLabel");
                str = null;
            }
            String str2 = this.addNewReactionAccessibilityLabel;
            if (str2 == null) {
                C9612q.m13900y("addNewReactionAccessibilityLabel");
                str2 = null;
            }
            View.OnClickListener onClickListener3 = this.onAddReactionClick;
            if (onClickListener3 == null) {
                C9612q.m13900y("onAddReactionClick");
            } else {
                onClickListener2 = onClickListener3;
            }
            addReactionViewHolder.bind(str, str2, onClickListener2, this.reactionsTheme);
        } else if (holder instanceof AddBurstReactionViewHolder) {
            AddBurstReactionViewHolder addBurstReactionViewHolder = (AddBurstReactionViewHolder) holder;
            String str3 = this.addReactionLabel;
            if (str3 == null) {
                C9612q.m13900y("addReactionLabel");
                str3 = null;
            }
            String str4 = this.addNewBurstReactionAccessibilityLabel;
            if (str4 == null) {
                C9612q.m13900y("addNewBurstReactionAccessibilityLabel");
                str4 = null;
            }
            View.OnClickListener onClickListener4 = this.onAddBurstReactionClick;
            if (onClickListener4 == null) {
                C9612q.m13900y("onAddBurstReactionClick");
            } else {
                onClickListener = onClickListener4;
            }
            addBurstReactionViewHolder.bind(str3, str4, onClickListener, this.reactionsTheme);
        } else {
            throw new IllegalStateException(("Invalid view holder type " + holder.getClass()).toString());
        }
        themeManager.setThemeOverride(themeOverride);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        RecyclerView.ViewHolder burstReactionViewHolder;
        C9612q.m13917h(parent, "parent");
        FlexboxLayoutManager.C4577c c4577c = new FlexboxLayoutManager.C4577c(-2, this.reactionHeight);
        ThemeManager themeManager = ThemeManager.INSTANCE;
        DiscordTheme themeOverride = themeManager.getThemeOverride();
        themeManager.setThemeOverride(this.theme);
        int i2 = WhenMappings.$EnumSwitchMapping$0[ViewType.values()[i].ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        Context context = parent.getContext();
                        C9612q.m13918g(context, "parent.context");
                        AddReactionView addReactionView = new AddReactionView(context, null, 2, null);
                        addReactionView.setLayoutParams(c4577c);
                        burstReactionViewHolder = new AddBurstReactionViewHolder(addReactionView);
                    } else {
                        throw new C11581q();
                    }
                } else {
                    Context context2 = parent.getContext();
                    C9612q.m13918g(context2, "parent.context");
                    AddReactionView addReactionView2 = new AddReactionView(context2, null, 2, null);
                    addReactionView2.setLayoutParams(c4577c);
                    burstReactionViewHolder = new AddReactionViewHolder(addReactionView2);
                }
            } else {
                Context context3 = parent.getContext();
                C9612q.m13918g(context3, "parent.context");
                ReactionView reactionView = new ReactionView(context3, null, 2, null);
                reactionView.setLayoutParams(c4577c);
                burstReactionViewHolder = new ReactionViewHolder(reactionView);
            }
        } else {
            Context context4 = parent.getContext();
            C9612q.m13918g(context4, "parent.context");
            BurstReactionView burstReactionView = new BurstReactionView(context4, null, 2, null);
            burstReactionView.setLayoutParams(c4577c);
            burstReactionViewHolder = new BurstReactionViewHolder(burstReactionView);
        }
        themeManager.setThemeOverride(themeOverride);
        return burstReactionViewHolder;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setReactions(String messageId, List<? extends ReactionView.Reaction> reactions, boolean z, boolean z2, String addReactionLabel, String addNewReactionAccessibilityLabel, String addNewBurstReactionAccessibilityLabel, ReactionView.ReactionsTheme reactionsTheme, View.OnClickListener onAddReactionClick, View.OnClickListener onAddBurstReactionClick, Function1<? super ReactionView.Reaction, Unit> onReactionClick, Function1<? super ReactionView.Reaction, Unit> onReactionLongPress, DiscordTheme discordTheme, boolean z3) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(reactions, "reactions");
        C9612q.m13917h(addReactionLabel, "addReactionLabel");
        C9612q.m13917h(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        C9612q.m13917h(addNewBurstReactionAccessibilityLabel, "addNewBurstReactionAccessibilityLabel");
        C9612q.m13917h(onAddReactionClick, "onAddReactionClick");
        C9612q.m13917h(onAddBurstReactionClick, "onAddBurstReactionClick");
        C9612q.m13917h(onReactionClick, "onReactionClick");
        C9612q.m13917h(onReactionLongPress, "onReactionLongPress");
        this.messageId = messageId;
        this.canAddNewReactions = z;
        this.canAddNewBurstReactions = z2;
        this.addReactionLabel = addReactionLabel;
        this.addNewReactionAccessibilityLabel = addNewReactionAccessibilityLabel;
        this.addNewBurstReactionAccessibilityLabel = addNewBurstReactionAccessibilityLabel;
        this.reactionsTheme = reactionsTheme;
        this.onAddReactionClick = onAddReactionClick;
        this.onAddBurstReactionClick = onAddBurstReactionClick;
        this.onReactionClick = onReactionClick;
        this.onReactionLongPress = onReactionLongPress;
        this.theme = discordTheme;
        if (z3) {
            List<? extends ReactionView.Reaction> list = this.reactions;
            this.reactions = reactions;
            C1786c.C1791e m35427b = C1786c.m35427b(new ItemDiffer(list, reactions), true);
            C9612q.m13918g(m35427b, "calculateDiff(differ, true)");
            m35427b.m35416c(this);
            return;
        }
        this.reactions = reactions;
        notifyDataSetChanged();
    }
}
