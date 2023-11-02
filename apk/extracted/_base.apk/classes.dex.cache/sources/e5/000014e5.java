package com.discord.chat.reactevents;

import android.content.Context;
import com.discord.chat.bridge.MediaType;
import com.discord.chat.bridge.botuikit.SelectComponent;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.events.TapReactionOverflow;
import com.discord.chat.presentation.list.ScrollDirection;
import com.discord.chat.presentation.list.ScrollState;
import com.discord.chat.reactevents.TapImageData;
import com.discord.primitives.ApplicationId;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import com.discord.primitives.UserId;
import com.discord.reactevents.ReactEvent;
import com.discord.reactevents.ReactEvents;
import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0007\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B-\u0012\b\u0010é\u0001\u001a\u00030è\u0001\u0012\b\u0010ë\u0001\u001a\u00030ê\u0001\u0012\u000e\u0010í\u0001\u001a\t\u0012\u0004\u0012\u00020D0ì\u0001¢\u0006\u0006\bî\u0001\u0010ï\u0001J%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001dH\u0016J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016J%\u0010&\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J%\u0010(\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010%J%\u0010*\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010\u0012J?\u00104\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\n2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J%\u00106\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u0010\u0012J$\u00108\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0016J.\u0010:\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n2\b\u00109\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010=\u001a\u00020\u00062\u0006\u0010<\u001a\u00020;H\u0016J'\u0010A\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010B\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\nH\u0016J\u0010\u0010C\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016Ji\u0010R\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\n2\u0006\u0010G\u001a\u00020D2\u0006\u0010H\u001a\u00020D2\u0006\u0010I\u001a\u00020D2\u0006\u0010J\u001a\u00020D2\u0006\u0010L\u001a\u00020K2\b\u0010N\u001a\u0004\u0018\u00010M2\b\u0010O\u001a\u0004\u0018\u00010DH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bP\u0010QJ9\u0010Y\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010S\u001a\u00020D2\b\u0010U\u001a\u0004\u0018\u00010T2\b\u0010V\u001a\u0004\u0018\u00010TH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bW\u0010XJ\b\u0010Z\u001a\u00020\u0006H\u0016J\b\u0010[\u001a\u00020\u0006H\u0016J\u0018\u0010\\\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010]\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001dH\u0016J%\u0010a\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010^\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b_\u0010`J-\u0010e\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bc\u0010dJ-\u0010g\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bf\u0010dJ1\u0010k\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010h\u001a\u0004\u0018\u00010TH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bi\u0010jJ\u0018\u0010n\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\n2\u0006\u0010m\u001a\u00020\nH\u0016J\b\u0010o\u001a\u00020\u0006H\u0016J(\u0010q\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010p\u001a\u00020\nH\u0016J-\u0010v\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\u0006\u0010s\u001a\u00020rH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bt\u0010uJ\u0010\u0010x\u001a\u00020\u00062\u0006\u0010w\u001a\u00020\nH\u0016J\u001d\u0010{\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\by\u0010zJ\u001d\u0010}\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b|\u0010zJ%\u0010\u007f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b~\u0010\u0012J\u0012\u0010\u0081\u0001\u001a\u00020\u00062\u0007\u0010\u0080\u0001\u001a\u00020\nH\u0016J\u001b\u0010\u0084\u0001\u001a\u00020\u00062\u0007\u0010\u0082\u0001\u001a\u00020\n2\u0007\u0010\u0083\u0001\u001a\u00020\nH\u0016J'\u0010\u0086\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0085\u0001\u0010%J\u001f\u0010\u0088\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0087\u0001\u0010zJ\u001f\u0010\u008a\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0089\u0001\u0010zJ\u0013\u0010\u008d\u0001\u001a\u00020\u00062\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0016J'\u0010\u008f\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u008e\u0001\u0010\u0012J)\u0010\u0093\u0001\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0007\u00107\u001a\u00030\u0090\u0001H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J'\u0010\u0095\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0094\u0001\u0010\u0012J'\u0010\u0097\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0096\u0001\u0010\u0012J'\u0010\u0099\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0098\u0001\u0010\u0012J\t\u0010\u009a\u0001\u001a\u00020\u0006H\u0016J\u001f\u0010\u009c\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u009b\u0001\u0010zJ3\u0010 \u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001f\u0010¢\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b¡\u0001\u0010zJ\u0012\u0010¤\u0001\u001a\u00020\u00062\u0007\u0010£\u0001\u001a\u00020\nH\u0016J'\u0010¦\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b¥\u0001\u0010\u0012J'\u0010¨\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b§\u0001\u0010\u0012J=\u0010¯\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010ª\u0001\u001a\u00030©\u00012\b\u0010«\u0001\u001a\u00030©\u00012\u0007\u0010¬\u0001\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001JG\u0010´\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010ª\u0001\u001a\u00030©\u00012\b\u0010°\u0001\u001a\u00030©\u00012\u0007\u0010¬\u0001\u001a\u00020\u000f2\b\u0010±\u0001\u001a\u00030©\u0001H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b²\u0001\u0010³\u0001J*\u0010·\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\t\u0010µ\u0001\u001a\u0004\u0018\u00010\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b¶\u0001\u0010@J\u0012\u0010¹\u0001\u001a\u00020\u00062\u0007\u0010¸\u0001\u001a\u00020\nH\u0016J\u0012\u0010º\u0001\u001a\u00020\u00062\u0007\u0010¸\u0001\u001a\u00020\nH\u0016J(\u0010¼\u0001\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b»\u0001\u0010\u0092\u0001J;\u0010Á\u0001\u001a\u00020\u00062\u0007\u00107\u001a\u00030\u0090\u00012\u0007\u0010½\u0001\u001a\u00020\u00142\u0007\u0010¾\u0001\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u001f\u0010Ã\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\bÂ\u0001\u0010zJ1\u0010Æ\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0007\u0010Ä\u0001\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÅ\u0001\u0010\u009f\u0001J>\u0010Ë\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\t\u0010Ç\u0001\u001a\u0004\u0018\u00010\n2\t\u0010È\u0001\u001a\u0004\u0018\u00010\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\u0012\u0010Í\u0001\u001a\u00020\u00062\u0007\u0010Ì\u0001\u001a\u00020\nH\u0016J0\u0010Ð\u0001\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010Î\u0001\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\bÏ\u0001\u0010dJ'\u0010Ò\u0001\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\bÑ\u0001\u0010`J\u001b\u0010Õ\u0001\u001a\u00020\u00062\u0007\u0010Ó\u0001\u001a\u00020D2\u0007\u0010Ô\u0001\u001a\u00020DH\u0016J\t\u0010Ö\u0001\u001a\u00020\u0006H\u0016R%\u0010Ù\u0001\u001a\u0010\u0012\u0005\u0012\u00030Ø\u0001\u0012\u0004\u0012\u00020\u00060×\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001RO\u0010Þ\u0001\u001a/\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010D\u0012\u0007\u0012\u0005\u0018\u00010Ü\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010Û\u0001j\u0005\u0018\u0001`Ý\u00018\u0016X\u0096\u0004ø\u0001\u0001¢\u0006\u0010\n\u0006\bÞ\u0001\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001R>\u0010ä\u0001\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0006\u0018\u00010â\u0001j\u0005\u0018\u0001`ã\u00018\u0016X\u0096\u0004ø\u0001\u0001¢\u0006\u0010\n\u0006\bä\u0001\u0010å\u0001\u001a\u0006\bæ\u0001\u0010ç\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006ð\u0001"}, m14357d2 = {"Lcom/discord/chat/reactevents/ChatViewEventHandler;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/primitives/MessageId;", "messageId", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "node", "", "onLinkClicked-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", "onLinkClicked", "", "url", "title", "onLinkClicked-u7_MRrM", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/discord/primitives/UserId;", "userId", "onLongPressAvatar-x5gers8", "(Ljava/lang/String;J)V", "onLongPressAvatar", "Lcom/discord/primitives/ChannelId;", "channelId", "Lcom/discord/reactions/ReactionView$Reaction;", "reaction", "onLongPressReaction-Eqy5D80", "(Ljava/lang/String;JLcom/discord/reactions/ReactionView$Reaction;)V", "onLongPressReaction", "onLongPressUsername-x5gers8", "onLongPressUsername", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onLongPressCommand", "Lcom/discord/chat/presentation/list/ScrollState;", "scrollState", "onScrollStateChanged", "Lcom/discord/chat/bridge/sticker/Sticker;", "sticker", "onStickerClicked-Ayv7vGE", "(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V", "onStickerClicked", "onStickerLongClicked-Ayv7vGE", "onStickerLongClicked", "onTapAvatar-x5gers8", "onTapAvatar", "", "messageFlags", "customId", "Lcom/discord/primitives/ApplicationId;", "applicationId", "", "indices", "onTapButtonActionComponent-NkFJqEg", "(Ljava/lang/String;JLjava/lang/String;J[I)V", "onTapButtonActionComponent", "onTapCall-pfaIj0E", "onTapCall", "guildId", "onTapChannel", "originalLink", "onLongPressChannel", "", "text", "onTapCopyText", "giftCode", "onTapGiftCodeAccept-NU4t8f8", "(Ljava/lang/String;Ljava/lang/String;)V", "onTapGiftCodeAccept", "onTapGiftCodeEmbed", "onLinkLongClicked", "", "attachmentIndex", "type", "viewWidth", "viewHeight", "viewX", "viewY", "Lcom/discord/chat/reactevents/ViewResizeMode;", "viewResizeMode", "", "portal", "embedIndex", "onTapImage-a6FnO-k", "(Ljava/lang/String;ILjava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;Ljava/lang/Double;Ljava/lang/Integer;)V", "onTapImage", "index", "", "primary", "secondary", "onTapInviteEmbed-AFFcxXc", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;)V", "onTapInviteEmbed", "onTapLoadMessagesAfter", "onTapLoadMessagesBefore", "onTapMention", "onTapCommand", "originId", "onTapMessageReply-0eiqbug", "(JLjava/lang/String;)V", "onTapMessageReply", "summaryId", "onTapSummary-sekaTiM", "(JLjava/lang/String;Ljava/lang/String;)V", "onTapSummary", "onTapSummaryJump-sekaTiM", "onTapSummaryJump", "isBurst", "onTapReaction-u7_MRrM", "(Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;)V", "onTapReaction", "roleName", "roleIconSource", "onTapRoleIcon", "onTapSuppressNotificationsIcon", "roleId", "onTapConnectionsRoleTag", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "selectComponent", "onTapSelectActionComponent-u7_MRrM", "(Ljava/lang/String;JLcom/discord/chat/bridge/botuikit/SelectComponent;)V", "onTapSelectActionComponent", "timestamp", "onTapTimestamp", "onTapThreadEmbed-1xi1bu0", "(Ljava/lang/String;)V", "onTapThreadEmbed", "onTapToggleBlockedMessages-1xi1bu0", "onTapToggleBlockedMessages", "onTapUsername-x5gers8", "onTapUsername", "fileId", "onTapUploadProgressClose", "uploaderId", "itemId", "onTapCancelUploadItem", "onWelcomeReplyClicked-Ayv7vGE", "onWelcomeReplyClicked", "onTapInviteToSpeak-1xi1bu0", "onTapInviteToSpeak", "onTapJoinActivity-1xi1bu0", "onTapJoinActivity", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "emoji", "onTapEmoji", "onTapFollowForumPost-pfaIj0E", "onTapFollowForumPost", "Lcom/discord/primitives/GuildId;", "onTapShareForumPost-mgk6anA", "(JJ)V", "onTapShareForumPost", "onTapReactionOverflow-pfaIj0E", "onTapReactionOverflow", "onTapAutoModerationActions-pfaIj0E", "onTapAutoModerationActions", "onTapAutoModerationFeedback-pfaIj0E", "onTapAutoModerationFeedback", "onTapOpTag", "onTapSeeMore-1xi1bu0", "onTapSeeMore", "tagType", "onTapTag-Eqy5D80", "(Ljava/lang/String;JLjava/lang/String;)V", "onTapTag", "onTapRemix-1xi1bu0", "onTapRemix", "description", "onTapShowAltText", "onInitiateReply-pfaIj0E", "onInitiateReply", "onInitiateEdit-pfaIj0E", "onInitiateEdit", "", "totalDurationSecs", "startDurationSecs", "senderUserId", "voiceMessagePlaybackStarted-OuNwOLg", "(Ljava/lang/String;FFJ)V", "voiceMessagePlaybackStarted", "endDurationSecs", "durationListeningSecs", "voiceMessagePlaybackEnded-HuwN0RY", "(Ljava/lang/String;FFJF)V", "voiceMessagePlaybackEnded", "errorMessage", "voiceMessagePlaybackFailed-ntcYbpo", "voiceMessagePlaybackFailed", "embeddedActivityKey", "onTapJoinEmbeddedActivity", "onTapDismissEmbeddedActivity", "onTapActivityBookmarkEmbed-uU1mFKc", "onTapActivityBookmarkEmbed", "parentChannelId", "threadId", "onTapPostPreviewEmbed-kUTrp-s", "(JJJLjava/lang/String;)V", "onTapPostPreviewEmbed", "onTapDismissMediaPostSharePrompt-1xi1bu0", "onTapDismissMediaPostSharePrompt", "buttonType", "onTapChannelPromptButton-Eqy5D80", "onTapChannelPromptButton", "attachmentId", "embedId", "onTapObscuredMediaLearnMore-8a0ehIg", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "onTapObscuredMediaLearnMore", "classificationId", "onTapSafetyPolicyNoticeEmbed", "answerId", "onTapPollAnswer-sekaTiM", "onTapPollAnswer", "onTapPollSubmitVote-0eiqbug", "onTapPollSubmitVote", "firstVisibleMessageIndex", "lastVisibleMessageIndex", "onFirstLayout", "onCompleteFirstLayout", "Lkotlin/Function1;", "Lcom/discord/reactevents/ReactEvent;", "emitReactEvent", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function4;", "Lcom/discord/chat/bridge/MediaType;", "Lcom/discord/chat/presentation/events/MessageLongPress;", "onMessageLongPressed", "Lkotlin/jvm/functions/Function4;", "getOnMessageLongPressed", "()Lkotlin/jvm/functions/Function4;", "Lkotlin/Function2;", "Lcom/discord/chat/presentation/events/MessageTapped;", "onMessageTapped", "Lkotlin/jvm/functions/Function2;", "getOnMessageTapped", "()Lkotlin/jvm/functions/Function2;", "Landroid/content/Context;", "context", "Lcom/discord/reactevents/ReactEvents;", "reactEvents", "Lkotlin/Function0;", "reactTag", "<init>", "(Landroid/content/Context;Lcom/discord/reactevents/ReactEvents;Lkotlin/jvm/functions/Function0;)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class ChatViewEventHandler implements ChatEventHandler {
    private final Function1<ReactEvent, Unit> emitReactEvent;
    private final Function4<MessageId, ChannelId, Integer, MediaType, Unit> onMessageLongPressed;
    private final Function2<MessageId, ChannelId, Unit> onMessageTapped;

    public ChatViewEventHandler(Context context, ReactEvents reactEvents, Function0<Integer> reactTag) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(reactEvents, "reactEvents");
        C9612q.m13917h(reactTag, "reactTag");
        this.emitReactEvent = new ChatViewEventHandler$emitReactEvent$1(reactEvents, context, reactTag);
        this.onMessageLongPressed = new ChatViewEventHandler$onMessageLongPressed$1(this);
        this.onMessageTapped = new ChatViewEventHandler$onMessageTapped$1(this);
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: getOnMessageLongPressed */
    public Function4<MessageId, ChannelId, Integer, MediaType, Unit> mo41622getOnMessageLongPressed() {
        return this.onMessageLongPressed;
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: getOnMessageTapped */
    public Function2<MessageId, ChannelId, Unit> mo41623getOnMessageTapped() {
        return this.onMessageTapped;
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onCompleteFirstLayout() {
        this.emitReactEvent.invoke(new CompleteFirstLayoutData());
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onFirstLayout(int i, int i2) {
        this.emitReactEvent.invoke(new FirstLayoutData(i, i2));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onInitiateEdit-pfaIj0E */
    public void mo41574onInitiateEditpfaIj0E(String messageId, long j) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new InitiateEditData(messageId, j, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onInitiateReply-pfaIj0E */
    public void mo41575onInitiateReplypfaIj0E(String messageId, long j) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new InitiateReplyData(messageId, j, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onLinkClicked-ntcYbpo */
    public void mo41576onLinkClickedntcYbpo(String messageId, LinkContentNode node) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(node, "node");
        this.emitReactEvent.invoke(new TapLinkData(messageId, node, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onLinkClicked-u7_MRrM */
    public void mo41577onLinkClickedu7_MRrM(String messageId, String url, String str) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(url, "url");
        Function1<ReactEvent, Unit> function1 = this.emitReactEvent;
        if (str == null) {
            str = "";
        }
        function1.invoke(new TapLinkData(messageId, str, url, null, null, 24, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onLinkLongClicked(LinkContentNode node) {
        C9612q.m13917h(node, "node");
        this.emitReactEvent.invoke(new LongPressLinkData(node.getTarget()));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onLongPressAvatar-x5gers8 */
    public void mo41578onLongPressAvatarx5gers8(String messageId, long j) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new LongPressAvatarData(MessageId.m42079toStringimpl(messageId), UserId.m42118toStringimpl(j)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onLongPressChannel(String channelId, String str, String str2, String str3) {
        C9612q.m13917h(channelId, "channelId");
        this.emitReactEvent.invoke(new LongPressChannelData(str, channelId, str2, str3));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onLongPressCommand(CommandMentionContentNode node) {
        C9612q.m13917h(node, "node");
        this.emitReactEvent.invoke(new LongPressCommandData(node));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onLongPressReaction-Eqy5D80 */
    public void mo41579onLongPressReactionEqy5D80(String messageId, long j, ReactionView.Reaction reaction) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new LongPressReactionData(messageId, j, reaction, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onLongPressUsername-x5gers8 */
    public void mo41580onLongPressUsernamex5gers8(String messageId, long j) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new LongPressUsernameData(MessageId.m42079toStringimpl(messageId), UserId.m42118toStringimpl(j)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onScrollStateChanged(ScrollState scrollState) {
        boolean z;
        boolean z2;
        boolean z3;
        C9612q.m13917h(scrollState, "scrollState");
        if (scrollState.isNearBottom() && scrollState.getScrollDirection() == ScrollDirection.DOWN) {
            z = true;
        } else {
            z = false;
        }
        if (scrollState.isNearTop() && scrollState.getScrollDirection() == ScrollDirection.UP) {
            z2 = true;
        } else {
            z2 = false;
        }
        Function1<ReactEvent, Unit> function1 = this.emitReactEvent;
        boolean isAtBottom = scrollState.isAtBottom();
        boolean isDragging = scrollState.isDragging();
        boolean isSettling = scrollState.isSettling();
        if (!scrollState.isNearBottom() && !scrollState.isAtBottom()) {
            z3 = true;
        } else {
            z3 = false;
        }
        function1.invoke(new ChatScrollPositionEvent(isAtBottom, z, z2, isDragging, isSettling, z3, scrollState.isFirstMessageVisible(), scrollState.getFirstVisibleMessageIndex(), scrollState.getLastVisibleMessageIndex()));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onStickerClicked-Ayv7vGE */
    public void mo41581onStickerClickedAyv7vGE(Sticker sticker, String messageId) {
        C9612q.m13917h(sticker, "sticker");
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapStickerData(sticker, messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onStickerLongClicked-Ayv7vGE */
    public void mo41582onStickerLongClickedAyv7vGE(Sticker sticker, String messageId) {
        C9612q.m13917h(sticker, "sticker");
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new LongPressStickerData(messageId, sticker, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapActivityBookmarkEmbed-uU1mFKc */
    public void mo41583onTapActivityBookmarkEmbeduU1mFKc(long j, long j2) {
        this.emitReactEvent.invoke(new TapActivityBookmarkEmbedData(ApplicationId.m42041toStringimpl(j), ChannelId.m42054toStringimpl(j2)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapAutoModerationActions-pfaIj0E */
    public void mo41584onTapAutoModerationActionspfaIj0E(String messageId, long j) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapAutoModerationActionsData(MessageId.m42079toStringimpl(messageId), ChannelId.m42054toStringimpl(j)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapAutoModerationFeedback-pfaIj0E */
    public void mo41585onTapAutoModerationFeedbackpfaIj0E(String messageId, long j) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapAutoModerationFeedbackData(MessageId.m42079toStringimpl(messageId), ChannelId.m42054toStringimpl(j)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapAvatar-x5gers8 */
    public void mo41586onTapAvatarx5gers8(String messageId, long j) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapAvatarData(MessageId.m42079toStringimpl(messageId), UserId.m42118toStringimpl(j)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapButtonActionComponent-NkFJqEg */
    public void mo41587onTapButtonActionComponentNkFJqEg(String messageId, long j, String str, long j2, int[] indices) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(indices, "indices");
        this.emitReactEvent.invoke(new TapButtonActionComponent(messageId, j, str, j2, indices, (DefaultConstructorMarker) null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapCall-pfaIj0E */
    public void mo41588onTapCallpfaIj0E(String messageId, long j) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapCallData(messageId, j, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapCancelUploadItem(String uploaderId, String itemId) {
        C9612q.m13917h(uploaderId, "uploaderId");
        C9612q.m13917h(itemId, "itemId");
        this.emitReactEvent.invoke(new TapCancelUploadItemData(uploaderId, itemId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapChannel(String channelId, String str, String str2) {
        C9612q.m13917h(channelId, "channelId");
        this.emitReactEvent.invoke(new TapChannelData(str, channelId, str2));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapChannelPromptButton-Eqy5D80 */
    public void mo41589onTapChannelPromptButtonEqy5D80(String messageId, long j, String buttonType) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(buttonType, "buttonType");
        this.emitReactEvent.invoke(new TapChannelPromptButtonData(MessageId.m42079toStringimpl(messageId), ChannelId.m42054toStringimpl(j), buttonType));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapCommand(CommandMentionContentNode node) {
        C9612q.m13917h(node, "node");
        this.emitReactEvent.invoke(new TapCommandData(node));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapConnectionsRoleTag(String userId, String guildId, String channelId, String roleId) {
        C9612q.m13917h(userId, "userId");
        C9612q.m13917h(guildId, "guildId");
        C9612q.m13917h(channelId, "channelId");
        C9612q.m13917h(roleId, "roleId");
        this.emitReactEvent.invoke(new TapConnectionsRoleTagData(userId, guildId, channelId, roleId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapCopyText(CharSequence text) {
        C9612q.m13917h(text, "text");
        this.emitReactEvent.invoke(new TapCopyText(text));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapDismissEmbeddedActivity(String embeddedActivityKey) {
        C9612q.m13917h(embeddedActivityKey, "embeddedActivityKey");
        this.emitReactEvent.invoke(new TapDismissEmbeddedActivityData(embeddedActivityKey));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapDismissMediaPostSharePrompt-1xi1bu0 */
    public void mo41590onTapDismissMediaPostSharePrompt1xi1bu0(String messageId) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapDismissMediaPostSharePromptData(messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapEmoji(EmojiContentNode emoji) {
        C9612q.m13917h(emoji, "emoji");
        this.emitReactEvent.invoke(new TapEmojiData(emoji));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapFollowForumPost-pfaIj0E */
    public void mo41591onTapFollowForumPostpfaIj0E(String messageId, long j) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapFollowForumPost(MessageId.m42079toStringimpl(messageId), ChannelId.m42054toStringimpl(j)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapGiftCodeAccept-NU4t8f8 */
    public void mo41592onTapGiftCodeAcceptNU4t8f8(String giftCode, String str) {
        C9612q.m13917h(giftCode, "giftCode");
        this.emitReactEvent.invoke(new TapGiftCodeAcceptData(giftCode, str, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapGiftCodeEmbed(String giftCode) {
        C9612q.m13917h(giftCode, "giftCode");
        this.emitReactEvent.invoke(new TapGiftCodeEmbedData(giftCode));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapImage-a6FnO-k */
    public void mo41593onTapImagea6FnOk(String messageId, int i, String type, int i2, int i3, int i4, int i5, ViewResizeMode viewResizeMode, Double d, Integer num) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(type, "type");
        C9612q.m13917h(viewResizeMode, "viewResizeMode");
        this.emitReactEvent.invoke(new TapImageData(MessageId.m42079toStringimpl(messageId), i, type, new TapImageData.Layout(i2, i3, i4, i5, viewResizeMode), d, num));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapInviteEmbed-AFFcxXc */
    public void mo41594onTapInviteEmbedAFFcxXc(String messageId, int i, Boolean bool, Boolean bool2) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapInviteEvent(messageId, i, bool, bool2));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapInviteToSpeak-1xi1bu0 */
    public void mo41595onTapInviteToSpeak1xi1bu0(String messageId) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapInviteToSpeakData(messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapJoinActivity-1xi1bu0 */
    public void mo41596onTapJoinActivity1xi1bu0(String messageId) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapJoinActivityData(messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapJoinEmbeddedActivity(String embeddedActivityKey) {
        C9612q.m13917h(embeddedActivityKey, "embeddedActivityKey");
        this.emitReactEvent.invoke(new TapJoinEmbeddedActivityData(embeddedActivityKey));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapLoadMessagesAfter() {
        this.emitReactEvent.invoke(new TapSeparatorData("load_more_after", null, 2, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapLoadMessagesBefore() {
        this.emitReactEvent.invoke(new TapSeparatorData("load_more_before", null, 2, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapMention(String userId, String channelId) {
        C9612q.m13917h(userId, "userId");
        C9612q.m13917h(channelId, "channelId");
        this.emitReactEvent.invoke(new TapMentionData(userId, channelId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapMessageReply-0eiqbug */
    public void mo41597onTapMessageReply0eiqbug(long j, String originId) {
        C9612q.m13917h(originId, "originId");
        this.emitReactEvent.invoke(new TapMessageReplyData(ChannelId.m42054toStringimpl(j), MessageId.m42079toStringimpl(originId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapObscuredMediaLearnMore-8a0ehIg */
    public void mo41598onTapObscuredMediaLearnMore8a0ehIg(String messageId, long j, String str, String str2) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapObscuredMediaLearnMoreData(MessageId.m42079toStringimpl(messageId), ChannelId.m42054toStringimpl(j), String.valueOf(str), String.valueOf(str2)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapOpTag() {
        this.emitReactEvent.invoke(TapOpTagData.INSTANCE);
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapPollAnswer-sekaTiM */
    public void mo41599onTapPollAnswersekaTiM(long j, String messageId, String answerId) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(answerId, "answerId");
        this.emitReactEvent.invoke(new TapPollAnswer(ChannelId.m42054toStringimpl(j), MessageId.m42079toStringimpl(messageId), answerId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapPollSubmitVote-0eiqbug */
    public void mo41600onTapPollSubmitVote0eiqbug(long j, String messageId) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapPollSubmitVote(ChannelId.m42054toStringimpl(j), MessageId.m42079toStringimpl(messageId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapPostPreviewEmbed-kUTrp-s */
    public void mo41601onTapPostPreviewEmbedkUTrps(long j, long j2, long j3, String messageId) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapPostPreviewEmbedData(GuildId.m42067toStringimpl(j), ChannelId.m42054toStringimpl(j2), ChannelId.m42054toStringimpl(j3), messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapReaction-u7_MRrM */
    public void mo41602onTapReactionu7_MRrM(String messageId, ReactionView.Reaction reaction, Boolean bool) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapReactionData(messageId, reaction, bool, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapReactionOverflow-pfaIj0E */
    public void mo41603onTapReactionOverflowpfaIj0E(String messageId, long j) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapReactionOverflow(MessageId.m42079toStringimpl(messageId), ChannelId.m42054toStringimpl(j)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapRemix-1xi1bu0 */
    public void mo41604onTapRemix1xi1bu0(String messageId) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapRemixData(messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapRoleIcon(String roleName, String roleIconSource) {
        C9612q.m13917h(roleName, "roleName");
        C9612q.m13917h(roleIconSource, "roleIconSource");
        this.emitReactEvent.invoke(new TapRoleIconData(roleName, roleIconSource));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapSafetyPolicyNoticeEmbed(String classificationId) {
        C9612q.m13917h(classificationId, "classificationId");
        this.emitReactEvent.invoke(new TapSafetyPolicyNoticeEmbed(String.valueOf(classificationId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapSeeMore-1xi1bu0 */
    public void mo41605onTapSeeMore1xi1bu0(String messageId) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapSeeMoreData(messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapSelectActionComponent-u7_MRrM */
    public void mo41606onTapSelectActionComponentu7_MRrM(String messageId, long j, SelectComponent selectComponent) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(selectComponent, "selectComponent");
        this.emitReactEvent.invoke(new TapSelectActionComponent(messageId, j, selectComponent, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapShareForumPost-mgk6anA */
    public void mo41607onTapShareForumPostmgk6anA(long j, long j2) {
        this.emitReactEvent.invoke(new TapShareForumPost(ChannelId.m42054toStringimpl(j), GuildId.m42067toStringimpl(j2)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapShowAltText(String description) {
        C9612q.m13917h(description, "description");
        this.emitReactEvent.invoke(new TapShowAltTextData(description));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapSummary-sekaTiM */
    public void mo41608onTapSummarysekaTiM(long j, String messageId, String summaryId) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(summaryId, "summaryId");
        this.emitReactEvent.invoke(new TapSummaryData(ChannelId.m42054toStringimpl(j), MessageId.m42079toStringimpl(messageId), summaryId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapSummaryJump-sekaTiM */
    public void mo41609onTapSummaryJumpsekaTiM(long j, String messageId, String summaryId) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(summaryId, "summaryId");
        this.emitReactEvent.invoke(new TapSummaryJumpData(ChannelId.m42054toStringimpl(j), MessageId.m42079toStringimpl(messageId), summaryId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapSuppressNotificationsIcon() {
        this.emitReactEvent.invoke(TapSuppressNotificationsIconData.INSTANCE);
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapTag-Eqy5D80 */
    public void mo41610onTapTagEqy5D80(String messageId, long j, String str) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapTagData(messageId, j, str, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapThreadEmbed-1xi1bu0 */
    public void mo41611onTapThreadEmbed1xi1bu0(String messageId) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapThreadEmbedEvent(messageId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapTimestamp(String timestamp) {
        C9612q.m13917h(timestamp, "timestamp");
        this.emitReactEvent.invoke(new TapTimestampEvent(timestamp));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapToggleBlockedMessages-1xi1bu0 */
    public void mo41612onTapToggleBlockedMessages1xi1bu0(String messageId) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapSeparatorData("toggle", MessageId.m42079toStringimpl(messageId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapUploadProgressClose(String fileId) {
        C9612q.m13917h(fileId, "fileId");
        this.emitReactEvent.invoke(new TapUploadProgressCloseData(fileId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapUsername-x5gers8 */
    public void mo41613onTapUsernamex5gers8(String messageId, long j) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapUsernameData(MessageId.m42079toStringimpl(messageId), UserId.m42118toStringimpl(j)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onWelcomeReplyClicked-Ayv7vGE */
    public void mo41614onWelcomeReplyClickedAyv7vGE(Sticker sticker, String messageId) {
        C9612q.m13917h(sticker, "sticker");
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapWelcomeReplyData(sticker.getId(), messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: voiceMessagePlaybackEnded-HuwN0RY */
    public void mo41615voiceMessagePlaybackEndedHuwN0RY(String messageId, float f, float f2, long j, float f3) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new VoiceMessagePlaybackEndedData(messageId, f, f2, j, f3, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: voiceMessagePlaybackFailed-ntcYbpo */
    public void mo41616voiceMessagePlaybackFailedntcYbpo(String messageId, String str) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new VoiceMessagePlaybackFailedData(messageId, str, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: voiceMessagePlaybackStarted-OuNwOLg */
    public void mo41617voiceMessagePlaybackStartedOuNwOLg(String messageId, float f, float f2, long j) {
        C9612q.m13917h(messageId, "messageId");
        this.emitReactEvent.invoke(new VoiceMessagePlaybackStartedData(messageId, f, f2, j, null));
    }
}