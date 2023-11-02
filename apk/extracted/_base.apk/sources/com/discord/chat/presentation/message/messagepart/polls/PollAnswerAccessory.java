package com.discord.chat.presentation.message.messagepart.polls;

import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.polls.PollAnswer;
import com.discord.recycler_view.utils.ItemDiffableType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003JM\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, m14357d2 = {"Lcom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessory;", "Lcom/discord/recycler_view/utils/ItemDiffableType;", "answer", "Lcom/discord/chat/bridge/polls/PollAnswer;", "attachments", "", "Lcom/discord/chat/bridge/attachment/Attachment;", "canTapAnswers", "", "canShowVoteCounts", "hasVoted", "myAvatarUrl", "", "(Lcom/discord/chat/bridge/polls/PollAnswer;Ljava/util/List;ZZZLjava/lang/String;)V", "getAnswer", "()Lcom/discord/chat/bridge/polls/PollAnswer;", "getAttachments", "()Ljava/util/List;", "getCanShowVoteCounts", "()Z", "getCanTapAnswers", "getHasVoted", "itemId", "", "getItemId", "()Ljava/lang/Object;", "getMyAvatarUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PollAnswerAccessory implements ItemDiffableType {
    private final PollAnswer answer;
    private final List<Attachment> attachments;
    private final boolean canShowVoteCounts;
    private final boolean canTapAnswers;
    private final boolean hasVoted;
    private final String myAvatarUrl;

    public PollAnswerAccessory(PollAnswer answer, List<Attachment> attachments, boolean z, boolean z2, boolean z3, String str) {
        C9612q.m13917h(answer, "answer");
        C9612q.m13917h(attachments, "attachments");
        this.answer = answer;
        this.attachments = attachments;
        this.canTapAnswers = z;
        this.canShowVoteCounts = z2;
        this.hasVoted = z3;
        this.myAvatarUrl = str;
    }

    public static /* synthetic */ PollAnswerAccessory copy$default(PollAnswerAccessory pollAnswerAccessory, PollAnswer pollAnswer, List list, boolean z, boolean z2, boolean z3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            pollAnswer = pollAnswerAccessory.answer;
        }
        List<Attachment> list2 = list;
        if ((i & 2) != 0) {
            list2 = pollAnswerAccessory.attachments;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            z = pollAnswerAccessory.canTapAnswers;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = pollAnswerAccessory.canShowVoteCounts;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = pollAnswerAccessory.hasVoted;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            str = pollAnswerAccessory.myAvatarUrl;
        }
        return pollAnswerAccessory.copy(pollAnswer, list3, z4, z5, z6, str);
    }

    public final PollAnswer component1() {
        return this.answer;
    }

    public final List<Attachment> component2() {
        return this.attachments;
    }

    public final boolean component3() {
        return this.canTapAnswers;
    }

    public final boolean component4() {
        return this.canShowVoteCounts;
    }

    public final boolean component5() {
        return this.hasVoted;
    }

    public final String component6() {
        return this.myAvatarUrl;
    }

    public final PollAnswerAccessory copy(PollAnswer answer, List<Attachment> attachments, boolean z, boolean z2, boolean z3, String str) {
        C9612q.m13917h(answer, "answer");
        C9612q.m13917h(attachments, "attachments");
        return new PollAnswerAccessory(answer, attachments, z, z2, z3, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PollAnswerAccessory) {
            PollAnswerAccessory pollAnswerAccessory = (PollAnswerAccessory) obj;
            return C9612q.m13922c(this.answer, pollAnswerAccessory.answer) && C9612q.m13922c(this.attachments, pollAnswerAccessory.attachments) && this.canTapAnswers == pollAnswerAccessory.canTapAnswers && this.canShowVoteCounts == pollAnswerAccessory.canShowVoteCounts && this.hasVoted == pollAnswerAccessory.hasVoted && C9612q.m13922c(this.myAvatarUrl, pollAnswerAccessory.myAvatarUrl);
        }
        return false;
    }

    public final PollAnswer getAnswer() {
        return this.answer;
    }

    public final List<Attachment> getAttachments() {
        return this.attachments;
    }

    public final boolean getCanShowVoteCounts() {
        return this.canShowVoteCounts;
    }

    public final boolean getCanTapAnswers() {
        return this.canTapAnswers;
    }

    public final boolean getHasVoted() {
        return this.hasVoted;
    }

    @Override // com.discord.recycler_view.utils.ItemDiffableType
    public Object getItemId() {
        return this.answer.getAnswerId();
    }

    public final String getMyAvatarUrl() {
        return this.myAvatarUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.answer.hashCode() * 31) + this.attachments.hashCode()) * 31;
        boolean z = this.canTapAnswers;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.canShowVoteCounts;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.hasVoted;
        int i5 = (i4 + (z3 ? 1 : z3 ? 1 : 0)) * 31;
        String str = this.myAvatarUrl;
        return i5 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        PollAnswer pollAnswer = this.answer;
        List<Attachment> list = this.attachments;
        boolean z = this.canTapAnswers;
        boolean z2 = this.canShowVoteCounts;
        boolean z3 = this.hasVoted;
        String str = this.myAvatarUrl;
        return "PollAnswerAccessory(answer=" + pollAnswer + ", attachments=" + list + ", canTapAnswers=" + z + ", canShowVoteCounts=" + z2 + ", hasVoted=" + z3 + ", myAvatarUrl=" + str + ")";
    }
}
