package com.discord.chat.presentation.message.view.polls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.C2912R;
import com.discord.chat.databinding.PollRecyclerViewBinding;
import com.discord.chat.presentation.message.messagepart.PollMessageAccessory;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 JM\u0010\r\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00052\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u000bH\u0017ø\u0001\u0000R \u0010\u000f\u001a\u00020\u000e8\u0004X\u0084\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00158$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/polls/BasePollWithRecyclerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/chat/presentation/message/view/polls/PollPresenter;", "Lcom/discord/chat/presentation/message/messagepart/PollMessageAccessory;", "accessory", "Lkotlin/Function3;", "Lcom/discord/primitives/ChannelId;", "Lcom/discord/primitives/MessageId;", "", "", "onTapAnswer", "Lkotlin/Function2;", "onTapSubmitVote", "bind", "Lcom/discord/chat/databinding/PollRecyclerViewBinding;", "binding", "Lcom/discord/chat/databinding/PollRecyclerViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/PollRecyclerViewBinding;", "getBinding$annotations", "()V", "Lcom/discord/chat/presentation/message/view/polls/PollAnswerAdapter;", "getMyAdapter", "()Lcom/discord/chat/presentation/message/view/polls/PollAnswerAdapter;", "myAdapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class BasePollWithRecyclerView extends ConstraintLayout implements PollPresenter {
    private final PollRecyclerViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BasePollWithRecyclerView(Context context) {
        this(context, null, 0, 6, null);
        C9612q.m13917h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BasePollWithRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ BasePollWithRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$6$lambda$5(Function2 onTapSubmitVote, PollMessageAccessory accessory, View view) {
        C9612q.m13917h(onTapSubmitVote, "$onTapSubmitVote");
        C9612q.m13917h(accessory, "$accessory");
        onTapSubmitVote.invoke(ChannelId.m42047boximpl(accessory.m41728getChannelIdo4g7jtM()), MessageId.m42073boximpl(accessory.mo41659getMessageId3Eiw7ao()));
    }

    protected static /* synthetic */ void getBinding$annotations() {
    }

    @Override // com.discord.chat.presentation.message.view.polls.PollPresenter
    public void bind(final PollMessageAccessory accessory, Function3<? super ChannelId, ? super MessageId, ? super String, Unit> onTapAnswer, final Function2<? super ChannelId, ? super MessageId, Unit> onTapSubmitVote) {
        int backgroundTertiary;
        float f;
        C9612q.m13917h(accessory, "accessory");
        C9612q.m13917h(onTapAnswer, "onTapAnswer");
        C9612q.m13917h(onTapSubmitVote, "onTapSubmitVote");
        getMyAdapter().setData(accessory.getAnswers(), new BasePollWithRecyclerView$bind$1(onTapAnswer, accessory));
        View bind$lambda$4 = this.binding.getRoot();
        if (accessory.getData().getHasVoted()) {
            backgroundTertiary = ThemeManagerKt.getTheme().getTextPositive();
        } else {
            backgroundTertiary = ThemeManagerKt.getTheme().getBackgroundTertiary();
        }
        C9612q.m13918g(bind$lambda$4, "bind$lambda$4");
        ViewBackgroundUtilsKt.setBackgroundRectangle(bind$lambda$4, ThemeManagerKt.getTheme().getBackgroundSecondary(), SizeUtilsKt.getDpToPx(16), Integer.valueOf(backgroundTertiary), SizeUtilsKt.getDpToPx(1));
        this.binding.questionText.setText(accessory.getData().getQuestion().getText());
        this.binding.expirationLabel.setText(accessory.getData().getExpirationLabel());
        DCDButton dCDButton = this.binding.submitVote;
        dCDButton.setEnabled(accessory.getData().getCanSubmitVote());
        if (accessory.getData().getCanSubmitVote()) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        dCDButton.setAlpha(f);
        dCDButton.setOnClickButtonListener(new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.polls.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasePollWithRecyclerView.bind$lambda$6$lambda$5(Function2.this, accessory, view);
            }
        });
        dCDButton.setText(accessory.getData().getSubmitVoteLabel());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final PollRecyclerViewBinding getBinding() {
        return this.binding;
    }

    protected abstract PollAnswerAdapter<?> getMyAdapter();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePollWithRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9612q.m13917h(context, "context");
        PollRecyclerViewBinding inflate = PollRecyclerViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        View _init_$lambda$0 = inflate.getRoot();
        setClipChildren(false);
        setClipToPadding(false);
        _init_$lambda$0.setElevation(SizeUtilsKt.getDpToPx(4));
        C9612q.m13918g(_init_$lambda$0, "_init_$lambda$0");
        int dpToPx = SizeUtilsKt.getDpToPx(16);
        _init_$lambda$0.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        TextView _init_$lambda$1 = inflate.questionText;
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        C9612q.m13918g(_init_$lambda$1, "_init_$lambda$1");
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, discordFont);
        TextView _init_$lambda$2 = inflate.expirationLabel;
        _init_$lambda$2.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        C9612q.m13918g(_init_$lambda$2, "_init_$lambda$2");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$2, discordFont);
        DCDButton _init_$lambda$3 = inflate.submitVote;
        C9612q.m13918g(_init_$lambda$3, "_init_$lambda$3");
        DCDButton.setBackgroundRectangle$default(_init_$lambda$3, ColorUtilsKt.getColorCompat(_init_$lambda$3, C2912R.color.brand_500), SizeUtilsKt.getDpToPx(20), null, 0, 12, null);
        _init_$lambda$3.setTextColor(Integer.valueOf(ColorUtilsKt.getColorCompat(_init_$lambda$3, C2912R.color.white)));
    }
}
