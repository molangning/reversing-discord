package pe;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C9536e;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.C11504d;

@Metadata(m14358d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b.\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b)\b\u0016\u0018\u0000 Ç\u0001*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0003jmpB\t¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u001a\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J\u000f\u0010\u001d\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0016J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\"\u001a\u00020\u000eH\u0016J\b\u0010#\u001a\u00020\u000eH\u0016J\u0012\u0010%\u001a\u00020\u000b2\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\u0000J\u0015\u0010'\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u000b¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00028\u00002\u0006\u0010)\u001a\u00020\u000b¢\u0006\u0004\b*\u0010(J\u0015\u0010,\u001a\u00028\u00002\u0006\u0010+\u001a\u00020\u000b¢\u0006\u0004\b,\u0010(J=\u00104\u001a\u00028\u00002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u00100\u001a\u00020-2\u0006\u00101\u001a\u00020-2\u0006\u00102\u001a\u00020-2\u0006\u00103\u001a\u00020-¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00028\u00002\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b8\u00109J\u001a\u0010>\u001a\u00020\u000e2\b\u0010;\u001a\u0004\u0018\u00010:2\b\u0010=\u001a\u0004\u0018\u00010<J\b\u0010?\u001a\u00020\u000eH\u0014J\u000e\u0010A\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u0007J\u000e\u0010B\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u0007J\u0016\u0010E\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020\tJ\u000e\u0010F\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tJ\b\u0010H\u001a\u0004\u0018\u00010GJ\b\u0010I\u001a\u0004\u0018\u00010GJ\u0006\u0010J\u001a\u00020\u000bJ\u0014\u0010L\u001a\u00020\u000b2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\u0012\u0010M\u001a\u00020\u000b2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030\u0000J\u0014\u0010N\u001a\u00020\u000b2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\u0014\u0010O\u001a\u00020\u000b2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J \u0010R\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010P\u001a\u00020-2\u0006\u0010Q\u001a\u00020-J\u0006\u0010S\u001a\u00020\u000eJ\u0006\u0010T\u001a\u00020\u000eJ\u0006\u0010U\u001a\u00020\u000eJ\u0010\u0010W\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020\u000bH\u0016J\u0006\u0010X\u001a\u00020\u000eJ\u0006\u0010Y\u001a\u00020\u000eJ\b\u0010Z\u001a\u00020\u000eH\u0016J\u0018\u0010[\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010D\u001a\u00020\tH\u0014J\u0018\u0010]\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\\\u001a\u00020\u0007H\u0014J\b\u0010^\u001a\u00020\u000eH\u0014J\b\u0010_\u001a\u00020\u000eH\u0014J\u0010\u0010b\u001a\u00020`2\u0006\u0010a\u001a\u00020`H\u0004J\u0006\u0010c\u001a\u00020\u000eJ\u0014\u0010f\u001a\u0006\u0012\u0002\b\u00030\u00002\b\u0010e\u001a\u0004\u0018\u00010dJ\b\u0010h\u001a\u00020gH\u0016R\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010o\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010q\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010kR\"\u0010w\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010n\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR(\u0010;\u001a\u0004\u0018\u00010:2\b\u0010x\u001a\u0004\u0018\u00010:8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R$\u0010\u007f\u001a\u00020\u00072\u0006\u0010x\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b}\u0010n\u001a\u0004\b~\u0010tR(\u0010\u0011\u001a\u00020-2\u0006\u0010x\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R(\u0010\u0010\u001a\u00020-2\u0006\u0010x\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0081\u0001\u001a\u0006\b\u0085\u0001\u0010\u0083\u0001R(\u0010\u0088\u0001\u001a\u00020\u000b2\u0006\u0010x\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bU\u0010\u0086\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R(\u0010\u008a\u0001\u001a\u00020\u000b2\u0006\u0010x\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bW\u0010\u0086\u0001\u001a\u0006\b\u0089\u0001\u0010\u0087\u0001R%\u0010\u008d\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\r\u0010n\u001a\u0005\b\u008b\u0001\u0010t\"\u0005\b\u008c\u0001\u0010vR,\u0010\u0091\u0001\u001a\u0004\u0018\u00010G2\b\u0010x\u001a\u0004\u0018\u00010G8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0016\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R,\u0010\u0093\u0001\u001a\u0004\u0018\u00010G2\b\u0010x\u001a\u0004\u0018\u00010G8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0017\u0010\u008e\u0001\u001a\u0006\b\u0092\u0001\u0010\u0090\u0001R&\u0010\u0095\u0001\u001a\u00020\u00072\u0006\u0010x\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\bX\u0010n\u001a\u0005\b\u0094\u0001\u0010tR&\u0010\u0097\u0001\u001a\u00020\u00072\u0006\u0010x\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\bS\u0010n\u001a\u0005\b\u0096\u0001\u0010tR\u001f\u0010\u009a\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0098\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u0099\u0001R(\u0010\u009e\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bI\u0010\u0086\u0001\u001a\u0006\b\u009b\u0001\u0010\u0087\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001b\u0010¡\u0001\u001a\u0005\u0018\u00010\u009f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bH\u0010 \u0001R)\u0010¤\u0001\u001a\u00030¢\u00012\u0007\u0010x\u001a\u00030¢\u00018\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0004\b\u001a\u0010{\u001a\u0006\b\u0081\u0001\u0010£\u0001R(\u0010¦\u0001\u001a\u00020-2\u0006\u0010x\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b!\u0010\u0081\u0001\u001a\u0006\b¥\u0001\u0010\u0083\u0001R(\u0010¨\u0001\u001a\u00020-2\u0006\u0010x\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b \u0010\u0081\u0001\u001a\u0006\b§\u0001\u0010\u0083\u0001R\u0017\u0010+\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000f\u0010\u0086\u0001R\u0018\u0010©\u0001\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010\u0081\u0001R\u0018\u0010ª\u0001\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0011\u0010\u0081\u0001R\u0017\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0010\u0010\u0086\u0001R&\u0010¬\u0001\u001a\u00020\u00072\u0006\u0010x\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\bY\u0010n\u001a\u0005\b«\u0001\u0010tR)\u0010=\u001a\u0004\u0018\u00010<8\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0005\b\u0012\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R\u001a\u0010³\u0001\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bT\u0010²\u0001R\u001a\u0010µ\u0001\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\b\u0010´\u0001R&\u0010¸\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010n\u001a\u0005\b¶\u0001\u0010t\"\u0005\b·\u0001\u0010vR)\u0010»\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¶\u0001\u0010\u0086\u0001\u001a\u0006\b¹\u0001\u0010\u0087\u0001\"\u0006\bº\u0001\u0010\u009d\u0001R)\u0010¾\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0086\u0001\u001a\u0006\b¼\u0001\u0010\u0087\u0001\"\u0006\b½\u0001\u0010\u009d\u0001R)\u0010Â\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¿\u0001\u0010\u0086\u0001\u001a\u0006\bÀ\u0001\u0010\u0087\u0001\"\u0006\bÁ\u0001\u0010\u009d\u0001R\u0013\u0010Ã\u0001\u001a\u00020-8F¢\u0006\u0007\u001a\u0005\bn\u0010\u0083\u0001R\u0014\u0010Å\u0001\u001a\u00020-8F¢\u0006\b\u001a\u0006\bÄ\u0001\u0010\u0083\u0001R\u0014\u0010Æ\u0001\u001a\u00020-8F¢\u0006\b\u001a\u0006\b¿\u0001\u0010\u0083\u0001R\u0014\u0010È\u0001\u001a\u00020-8F¢\u0006\b\u001a\u0006\bÇ\u0001\u0010\u0083\u0001¨\u0006Ë\u0001"}, m14357d2 = {"Lpe/d;", "ConcreteGestureHandlerT", "", "Landroid/content/Context;", "context", "Landroid/view/Window;", "T", "", "C", "Landroid/view/MotionEvent;", "event", "", "c0", "k", "", "v", "y", "x", "A", "p", "Lpe/d$c;", "pointerData", "l", "m", "Lcom/facebook/react/bridge/WritableMap;", "kotlin.jvm.PlatformType", "s", "newState", "b0", "m0", "()Lpe/d;", "prevState", "u", "t", "w", "k0", "other", "V", "shouldCancelWhenOutside", "y0", "(Z)Lpe/d;", ViewProps.ENABLED, "r0", "manualActivation", "v0", "", "leftPad", "topPad", "rightPad", "bottomPad", "width", "height", "t0", "(FFFFFF)Lpe/d;", "Lpe/e;", "controller", "u0", "(Lpe/e;)Lpe/d;", "Landroid/view/View;", "view", "Lpe/g;", "orchestrator", "i0", "f0", "pointerId", "F0", "G0", "transformedEvent", "sourceEvent", "U", "I0", "Lcom/facebook/react/bridge/WritableArray;", "r", "q", "J0", "handler", "D0", "E0", "C0", "B0", "posX", "posY", "a0", "o", "B", "i", "force", "j", "n", "z", "l0", "e0", "previousState", "h0", "g0", "d0", "Landroid/graphics/PointF;", "point", "H0", "j0", "Lpe/n;", "listener", "x0", "", "toString", "", "a", "[I", "trackedPointerIDs", "b", "I", "trackedPointersIDsCount", "c", "windowOffset", "d", "P", "()I", "A0", "(I)V", "tag", "<set-?>", "e", "Landroid/view/View;", "S", "()Landroid/view/View;", "f", "O", "state", "g", "F", "getX", "()F", "h", "getY", "Z", "()Z", "isWithinBounds", "Y", "isEnabled", "D", "n0", "actionType", "Lcom/facebook/react/bridge/WritableArray;", "getChangedTouchesPayload", "()Lcom/facebook/react/bridge/WritableArray;", "changedTouchesPayload", "getAllTouchesPayload", "allTouchesPayload", "Q", "touchEventType", "R", "trackedPointersCount", "", "[Lpe/d$c;", "trackedPointers", "K", "w0", "(Z)V", "needsPointerData", "", "[F", "hitSlop", "", "()S", "eventCoalescingKey", "getLastAbsolutePositionX", "lastAbsolutePositionX", "getLastAbsolutePositionY", "lastAbsolutePositionY", "lastEventOffsetX", "lastEventOffsetY", "L", "numberOfPointers", "Lpe/g;", "M", "()Lpe/g;", "setOrchestrator", "(Lpe/g;)V", "Lpe/n;", "onTouchEventListener", "Lpe/e;", "interactionController", "E", "o0", "activationIndex", "W", "p0", "isActive", "X", "q0", "isAwaiting", "G", "N", "z0", "shouldResetProgress", "lastRelativePositionX", "J", "lastRelativePositionY", "lastPositionInWindowX", "H", "lastPositionInWindowY", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pe.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11504d<ConcreteGestureHandlerT extends C11504d<ConcreteGestureHandlerT>> {

    /* renamed from: H */
    public static final C11506b f29859H = new C11506b(null);

    /* renamed from: I */
    private static MotionEvent.PointerProperties[] f29860I;

    /* renamed from: J */
    private static MotionEvent.PointerCoords[] f29861J;

    /* renamed from: K */
    private static short f29862K;

    /* renamed from: A */
    private C11510g f29863A;

    /* renamed from: B */
    private InterfaceC11526n f29864B;

    /* renamed from: C */
    private InterfaceC11508e f29865C;

    /* renamed from: D */
    private int f29866D;

    /* renamed from: E */
    private boolean f29867E;

    /* renamed from: F */
    private boolean f29868F;

    /* renamed from: G */
    private boolean f29869G;

    /* renamed from: a */
    private final int[] f29870a = new int[12];

    /* renamed from: b */
    private int f29871b;

    /* renamed from: c */
    private final int[] f29872c;

    /* renamed from: d */
    private int f29873d;

    /* renamed from: e */
    private View f29874e;

    /* renamed from: f */
    private int f29875f;

    /* renamed from: g */
    private float f29876g;

    /* renamed from: h */
    private float f29877h;

    /* renamed from: i */
    private boolean f29878i;

    /* renamed from: j */
    private boolean f29879j;

    /* renamed from: k */
    private int f29880k;

    /* renamed from: l */
    private WritableArray f29881l;

    /* renamed from: m */
    private WritableArray f29882m;

    /* renamed from: n */
    private int f29883n;

    /* renamed from: o */
    private int f29884o;

    /* renamed from: p */
    private final C11507c[] f29885p;

    /* renamed from: q */
    private boolean f29886q;

    /* renamed from: r */
    private float[] f29887r;

    /* renamed from: s */
    private short f29888s;

    /* renamed from: t */
    private float f29889t;

    /* renamed from: u */
    private float f29890u;

    /* renamed from: v */
    private boolean f29891v;

    /* renamed from: w */
    private float f29892w;

    /* renamed from: x */
    private float f29893x;

    /* renamed from: y */
    private boolean f29894y;

    /* renamed from: z */
    private int f29895z;

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m14357d2 = {"Lpe/d$a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lpe/d;", "handler", "Landroid/view/MotionEvent;", "event", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "e", "<init>", "(Lpe/d;Landroid/view/MotionEvent;Ljava/lang/IllegalArgumentException;)V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pe.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11505a extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C11505a(pe.C11504d<?> r12, android.view.MotionEvent r13, java.lang.IllegalArgumentException r14) {
            /*
                r11 = this;
                java.lang.String r0 = "handler"
                kotlin.jvm.internal.C9612q.m13917h(r12, r0)
                java.lang.String r0 = "event"
                kotlin.jvm.internal.C9612q.m13917h(r13, r0)
                java.lang.String r0 = "e"
                kotlin.jvm.internal.C9612q.m13917h(r14, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "\n    handler: "
                r0.append(r1)
                java.lang.Class r1 = r12.getClass()
                kotlin.reflect.KClass r1 = kotlin.jvm.internal.C9591f0.m13969b(r1)
                java.lang.String r1 = r1.mo13883l()
                r0.append(r1)
                java.lang.String r1 = "\n    state: "
                r0.append(r1)
                int r1 = r12.m7943O()
                r0.append(r1)
                java.lang.String r1 = "\n    view: "
                r0.append(r1)
                android.view.View r1 = r12.m7939S()
                r0.append(r1)
                java.lang.String r1 = "\n    orchestrator: "
                r0.append(r1)
                pe.g r1 = r12.m7945M()
                r0.append(r1)
                java.lang.String r1 = "\n    isEnabled: "
                r0.append(r1)
                boolean r1 = r12.m7933Y()
                r0.append(r1)
                java.lang.String r1 = "\n    isActive: "
                r0.append(r1)
                boolean r1 = r12.m7935W()
                r0.append(r1)
                java.lang.String r1 = "\n    isAwaiting: "
                r0.append(r1)
                boolean r1 = r12.m7934X()
                r0.append(r1)
                java.lang.String r1 = "\n    trackedPointersCount: "
                r0.append(r1)
                int r1 = pe.C11504d.m7924e(r12)
                r0.append(r1)
                java.lang.String r1 = "\n    trackedPointers: "
                r0.append(r1)
                int[] r2 = pe.C11504d.m7925d(r12)
                java.lang.String r3 = ", "
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 62
                r10 = 0
                java.lang.String r12 = kotlin.collections.C9533b.m14319b0(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r0.append(r12)
                java.lang.String r12 = "\n    while handling event: "
                r0.append(r12)
                r0.append(r13)
                java.lang.String r12 = "\n    "
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                java.lang.String r12 = kotlin.text.C9642f.m13807f(r12)
                r11.<init>(r12, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pe.C11504d.C11505a.<init>(pe.d, android.view.MotionEvent, java.lang.IllegalArgumentException):void");
        }
    }

    @Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000bR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000bR\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000bR\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000bR\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000bR\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000bR\u0014\u0010 \u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u000bR\u0014\u0010!\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u000bR\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, m14357d2 = {"Lpe/d$b;", "", "", "size", "", "d", "", "value", "", "c", "ACTION_TYPE_JS_FUNCTION_NEW_API", "I", "ACTION_TYPE_JS_FUNCTION_OLD_API", "ACTION_TYPE_NATIVE_ANIMATED_EVENT", "ACTION_TYPE_REANIMATED_WORKLET", "DIRECTION_DOWN", "DIRECTION_LEFT", "DIRECTION_RIGHT", "DIRECTION_UP", "HIT_SLOP_BOTTOM_IDX", "HIT_SLOP_HEIGHT_IDX", "HIT_SLOP_LEFT_IDX", "HIT_SLOP_NONE", "F", "HIT_SLOP_RIGHT_IDX", "HIT_SLOP_TOP_IDX", "HIT_SLOP_WIDTH_IDX", "MAX_POINTERS_COUNT", "STATE_ACTIVE", "STATE_BEGAN", "STATE_CANCELLED", "STATE_END", "STATE_FAILED", "STATE_UNDETERMINED", "", "nextEventCoalescingKey", "S", "", "Landroid/view/MotionEvent$PointerCoords;", "pointerCoords", "[Landroid/view/MotionEvent$PointerCoords;", "Landroid/view/MotionEvent$PointerProperties;", "pointerProps", "[Landroid/view/MotionEvent$PointerProperties;", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pe.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11506b {
        private C11506b() {
        }

        public /* synthetic */ C11506b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final boolean m7887c(float f) {
            return !Float.isNaN(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final void m7886d(int i) {
            if (C11504d.f29860I == null) {
                C11504d.f29860I = new MotionEvent.PointerProperties[12];
                C11504d.f29861J = new MotionEvent.PointerCoords[12];
            }
            while (i > 0) {
                MotionEvent.PointerProperties[] pointerPropertiesArr = C11504d.f29860I;
                MotionEvent.PointerCoords[] pointerCoordsArr = null;
                if (pointerPropertiesArr == null) {
                    C9612q.m13900y("pointerProps");
                    pointerPropertiesArr = null;
                }
                int i2 = i - 1;
                if (pointerPropertiesArr[i2] == null) {
                    MotionEvent.PointerProperties[] pointerPropertiesArr2 = C11504d.f29860I;
                    if (pointerPropertiesArr2 == null) {
                        C9612q.m13900y("pointerProps");
                        pointerPropertiesArr2 = null;
                    }
                    pointerPropertiesArr2[i2] = new MotionEvent.PointerProperties();
                    MotionEvent.PointerCoords[] pointerCoordsArr2 = C11504d.f29861J;
                    if (pointerCoordsArr2 == null) {
                        C9612q.m13900y("pointerCoords");
                    } else {
                        pointerCoordsArr = pointerCoordsArr2;
                    }
                    pointerCoordsArr[i2] = new MotionEvent.PointerCoords();
                    i--;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u0006\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0018\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u001a\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\t\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\"\u0010\u001c\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012\"\u0004\b\u001b\u0010\u0014¨\u0006\u001f"}, m14357d2 = {"Lpe/d$c;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "c", "()I", "pointerId", "", "b", "F", "d", "()F", "h", "(F)V", "x", "e", "i", "y", "f", "absoluteX", "g", "absoluteY", "<init>", "(IFFFF)V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pe.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11507c {

        /* renamed from: a */
        private final int f29896a;

        /* renamed from: b */
        private float f29897b;

        /* renamed from: c */
        private float f29898c;

        /* renamed from: d */
        private float f29899d;

        /* renamed from: e */
        private float f29900e;

        public C11507c(int i, float f, float f2, float f3, float f4) {
            this.f29896a = i;
            this.f29897b = f;
            this.f29898c = f2;
            this.f29899d = f3;
            this.f29900e = f4;
        }

        /* renamed from: a */
        public final float m7885a() {
            return this.f29899d;
        }

        /* renamed from: b */
        public final float m7884b() {
            return this.f29900e;
        }

        /* renamed from: c */
        public final int m7883c() {
            return this.f29896a;
        }

        /* renamed from: d */
        public final float m7882d() {
            return this.f29897b;
        }

        /* renamed from: e */
        public final float m7881e() {
            return this.f29898c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C11507c) {
                C11507c c11507c = (C11507c) obj;
                return this.f29896a == c11507c.f29896a && Float.compare(this.f29897b, c11507c.f29897b) == 0 && Float.compare(this.f29898c, c11507c.f29898c) == 0 && Float.compare(this.f29899d, c11507c.f29899d) == 0 && Float.compare(this.f29900e, c11507c.f29900e) == 0;
            }
            return false;
        }

        /* renamed from: f */
        public final void m7880f(float f) {
            this.f29899d = f;
        }

        /* renamed from: g */
        public final void m7879g(float f) {
            this.f29900e = f;
        }

        /* renamed from: h */
        public final void m7878h(float f) {
            this.f29897b = f;
        }

        public int hashCode() {
            return (((((((this.f29896a * 31) + Float.floatToIntBits(this.f29897b)) * 31) + Float.floatToIntBits(this.f29898c)) * 31) + Float.floatToIntBits(this.f29899d)) * 31) + Float.floatToIntBits(this.f29900e);
        }

        /* renamed from: i */
        public final void m7877i(float f) {
            this.f29898c = f;
        }

        public String toString() {
            return "PointerData(pointerId=" + this.f29896a + ", x=" + this.f29897b + ", y=" + this.f29898c + ", absoluteX=" + this.f29899d + ", absoluteY=" + this.f29900e + ')';
        }
    }

    public C11504d() {
        int[] iArr = new int[2];
        for (int i = 0; i < 2; i++) {
            iArr[i] = 0;
        }
        this.f29872c = iArr;
        this.f29879j = true;
        C11507c[] c11507cArr = new C11507c[12];
        for (int i2 = 0; i2 < 12; i2++) {
            c11507cArr[i2] = null;
        }
        this.f29885p = c11507cArr;
    }

    /* renamed from: A */
    private final void m7965A() {
        C11507c[] c11507cArr;
        this.f29882m = null;
        for (C11507c c11507c : this.f29885p) {
            if (c11507c != null) {
                m7915m(c11507c);
            }
        }
    }

    /* renamed from: C */
    private final int m7962C() {
        int[] iArr;
        int i = 0;
        while (i < this.f29871b) {
            int i2 = 0;
            while (true) {
                iArr = this.f29870a;
                if (i2 >= iArr.length || iArr[i2] == i) {
                    break;
                }
                i2++;
            }
            if (i2 == iArr.length) {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: T */
    private final Window m7938T(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getWindow();
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return m7938T(((ContextWrapper) context).getBaseContext());
    }

    /* renamed from: b0 */
    private final void m7928b0(int i) {
        UiThreadUtil.assertOnUiThread();
        if (this.f29875f == i) {
            return;
        }
        if (this.f29884o > 0 && (i == 5 || i == 3 || i == 1)) {
            m7909p();
        }
        int i2 = this.f29875f;
        this.f29875f = i;
        if (i == 4) {
            short s = f29862K;
            f29862K = (short) (s + 1);
            this.f29888s = s;
        }
        C11510g c11510g = this.f29863A;
        C9612q.m13920e(c11510g);
        c11510g.m7848u(this, i, i2);
        mo7821h0(i, i2);
    }

    /* renamed from: c0 */
    private final boolean m7926c0(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.f29871b) {
            return true;
        }
        int length = this.f29870a.length;
        for (int i = 0; i < length; i++) {
            int i2 = this.f29870a[i];
            if (i2 != -1 && i2 != i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b6 A[EDGE_INSN: B:84:0x00b6->B:44:0x00b6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.view.MotionEvent$PointerProperties[]] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.view.MotionEvent m7917k(android.view.MotionEvent r27) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.C11504d.m7917k(android.view.MotionEvent):android.view.MotionEvent");
    }

    /* renamed from: l */
    private final void m7916l(C11507c c11507c) {
        if (this.f29881l == null) {
            this.f29881l = Arguments.createArray();
        }
        WritableArray writableArray = this.f29881l;
        C9612q.m13920e(writableArray);
        writableArray.pushMap(m7903s(c11507c));
    }

    /* renamed from: m */
    private final void m7915m(C11507c c11507c) {
        if (this.f29882m == null) {
            this.f29882m = Arguments.createArray();
        }
        WritableArray writableArray = this.f29882m;
        C9612q.m13920e(writableArray);
        writableArray.pushMap(m7903s(c11507c));
    }

    /* renamed from: p */
    private final void m7909p() {
        C11507c[] c11507cArr;
        this.f29883n = 4;
        this.f29881l = null;
        m7965A();
        for (C11507c c11507c : this.f29885p) {
            if (c11507c != null) {
                m7916l(c11507c);
            }
        }
        this.f29884o = 0;
        C9536e.m14265m(this.f29885p, null, 0, 0, 6, null);
        m7897w();
    }

    /* renamed from: s */
    private final WritableMap m7903s(C11507c c11507c) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", c11507c.m7883c());
        createMap.putDouble("x", PixelUtil.toDIPFromPixel(c11507c.m7882d()));
        createMap.putDouble("y", PixelUtil.toDIPFromPixel(c11507c.m7881e()));
        createMap.putDouble("absoluteX", PixelUtil.toDIPFromPixel(c11507c.m7885a()));
        createMap.putDouble("absoluteY", PixelUtil.toDIPFromPixel(c11507c.m7884b()));
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m7902s0(C11504d this_applySelf) {
        C9612q.m13917h(this_applySelf, "$this_applySelf");
        this_applySelf.m7911o();
    }

    /* renamed from: v */
    private final void m7899v(MotionEvent motionEvent) {
        this.f29881l = null;
        this.f29883n = 1;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f29885p[pointerId] = new C11507c(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent.getX(motionEvent.getActionIndex()) + (motionEvent.getRawX() - motionEvent.getX())) - this.f29872c[0], (motionEvent.getY(motionEvent.getActionIndex()) + (motionEvent.getRawY() - motionEvent.getY())) - this.f29872c[1]);
        this.f29884o++;
        C11507c c11507c = this.f29885p[pointerId];
        C9612q.m13920e(c11507c);
        m7916l(c11507c);
        m7965A();
        m7897w();
    }

    /* renamed from: x */
    private final void m7895x(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        this.f29881l = null;
        this.f29883n = 2;
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            C11507c c11507c = this.f29885p[motionEvent.getPointerId(i2)];
            if (c11507c != null) {
                if (c11507c.m7882d() == motionEvent.getX(i2)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (c11507c.m7881e() == motionEvent.getY(i2)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                    }
                }
                c11507c.m7878h(motionEvent.getX(i2));
                c11507c.m7877i(motionEvent.getY(i2));
                c11507c.m7880f((motionEvent.getX(i2) + rawX) - this.f29872c[0]);
                c11507c.m7879g((motionEvent.getY(i2) + rawY) - this.f29872c[1]);
                m7916l(c11507c);
                i++;
            }
        }
        if (i > 0) {
            m7965A();
            m7897w();
        }
    }

    /* renamed from: y */
    private final void m7893y(MotionEvent motionEvent) {
        m7965A();
        this.f29881l = null;
        this.f29883n = 3;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f29885p[pointerId] = new C11507c(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent.getX(motionEvent.getActionIndex()) + (motionEvent.getRawX() - motionEvent.getX())) - this.f29872c[0], (motionEvent.getY(motionEvent.getActionIndex()) + (motionEvent.getRawY() - motionEvent.getY())) - this.f29872c[1]);
        C11507c c11507c = this.f29885p[pointerId];
        C9612q.m13920e(c11507c);
        m7916l(c11507c);
        this.f29885p[pointerId] = null;
        this.f29884o--;
        m7897w();
    }

    /* renamed from: A0 */
    public final void m7964A0(int i) {
        this.f29873d = i;
    }

    /* renamed from: B */
    public final void m7963B() {
        int i = this.f29875f;
        if (i == 4 || i == 0 || i == 2) {
            m7928b0(1);
        }
    }

    /* renamed from: B0 */
    public boolean mo7818B0(C11504d<?> handler) {
        InterfaceC11508e interfaceC11508e;
        C9612q.m13917h(handler, "handler");
        if (handler == this || (interfaceC11508e = this.f29865C) == null) {
            return false;
        }
        return interfaceC11508e.mo7875b(this, handler);
    }

    /* renamed from: C0 */
    public boolean mo7817C0(C11504d<?> handler) {
        C9612q.m13917h(handler, "handler");
        if (handler == this) {
            return true;
        }
        InterfaceC11508e interfaceC11508e = this.f29865C;
        if (interfaceC11508e != null) {
            return interfaceC11508e.mo7876a(this, handler);
        }
        return false;
    }

    /* renamed from: D */
    public final int m7961D() {
        return this.f29880k;
    }

    /* renamed from: D0 */
    public boolean m7960D0(C11504d<?> handler) {
        InterfaceC11508e interfaceC11508e;
        C9612q.m13917h(handler, "handler");
        if (handler == this || (interfaceC11508e = this.f29865C) == null) {
            return false;
        }
        return interfaceC11508e.mo7874c(this, handler);
    }

    /* renamed from: E */
    public final int m7959E() {
        return this.f29866D;
    }

    /* renamed from: E0 */
    public final boolean m7958E0(C11504d<?> handler) {
        InterfaceC11508e interfaceC11508e;
        C9612q.m13917h(handler, "handler");
        if (handler == this || (interfaceC11508e = this.f29865C) == null) {
            return false;
        }
        return interfaceC11508e.mo7873d(this, handler);
    }

    /* renamed from: F */
    public final short m7957F() {
        return this.f29888s;
    }

    /* renamed from: F0 */
    public final void m7956F0(int i) {
        int[] iArr = this.f29870a;
        if (iArr[i] == -1) {
            iArr[i] = m7962C();
            this.f29871b++;
        }
    }

    /* renamed from: G */
    public final float m7955G() {
        return (this.f29889t + this.f29892w) - this.f29872c[0];
    }

    /* renamed from: G0 */
    public final void m7954G0(int i) {
        int[] iArr = this.f29870a;
        if (iArr[i] != -1) {
            iArr[i] = -1;
            this.f29871b--;
        }
    }

    /* renamed from: H */
    public final float m7953H() {
        return (this.f29890u + this.f29893x) - this.f29872c[1];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H0 */
    public final PointF m7952H0(PointF point) {
        PointF m7871B;
        C9612q.m13917h(point, "point");
        C11510g c11510g = this.f29863A;
        if (c11510g != null && (m7871B = c11510g.m7871B(this.f29874e, point)) != null) {
            return m7871B;
        }
        point.x = Float.NaN;
        point.y = Float.NaN;
        return point;
    }

    /* renamed from: I */
    public final float m7951I() {
        return this.f29889t;
    }

    /* renamed from: I0 */
    public final void m7950I0(MotionEvent event) {
        C9612q.m13917h(event, "event");
        if (event.getActionMasked() != 0 && event.getActionMasked() != 5) {
            if (event.getActionMasked() != 1 && event.getActionMasked() != 6) {
                if (event.getActionMasked() == 2) {
                    m7895x(event);
                    return;
                }
                return;
            }
            m7895x(event);
            m7893y(event);
            return;
        }
        m7899v(event);
        m7895x(event);
    }

    /* renamed from: J */
    public final float m7949J() {
        return this.f29890u;
    }

    /* renamed from: J0 */
    public final boolean m7948J0() {
        int i;
        if (this.f29879j && (i = this.f29875f) != 1 && i != 3 && i != 5 && this.f29871b > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public final boolean m7947K() {
        return this.f29886q;
    }

    /* renamed from: L */
    public final int m7946L() {
        return this.f29895z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public final C11510g m7945M() {
        return this.f29863A;
    }

    /* renamed from: N */
    public final boolean m7944N() {
        return this.f29869G;
    }

    /* renamed from: O */
    public final int m7943O() {
        return this.f29875f;
    }

    /* renamed from: P */
    public final int m7942P() {
        return this.f29873d;
    }

    /* renamed from: Q */
    public final int m7941Q() {
        return this.f29883n;
    }

    /* renamed from: R */
    public final int m7940R() {
        return this.f29884o;
    }

    /* renamed from: S */
    public final View m7939S() {
        return this.f29874e;
    }

    /* renamed from: U */
    public final void m7937U(MotionEvent transformedEvent, MotionEvent sourceEvent) {
        int i;
        C9612q.m13917h(transformedEvent, "transformedEvent");
        C9612q.m13917h(sourceEvent, "sourceEvent");
        if (this.f29879j && (i = this.f29875f) != 3 && i != 1 && i != 5 && this.f29871b >= 1) {
            try {
                MotionEvent m7917k = m7917k(sourceEvent);
                MotionEvent motionEvent = new MotionEvent[]{m7917k(transformedEvent), m7917k}[0];
                this.f29876g = motionEvent.getX();
                this.f29877h = motionEvent.getY();
                this.f29895z = motionEvent.getPointerCount();
                boolean m7930a0 = m7930a0(this.f29874e, this.f29876g, this.f29877h);
                this.f29878i = m7930a0;
                if (this.f29894y && !m7930a0) {
                    int i2 = this.f29875f;
                    if (i2 == 4) {
                        m7911o();
                        return;
                    } else if (i2 == 2) {
                        m7963B();
                        return;
                    } else {
                        return;
                    }
                }
                C11514i c11514i = C11514i.f29922a;
                this.f29889t = c11514i.m7828a(motionEvent, true);
                this.f29890u = c11514i.m7827b(motionEvent, true);
                this.f29892w = motionEvent.getRawX() - motionEvent.getX();
                this.f29893x = motionEvent.getRawY() - motionEvent.getY();
                mo7714e0(motionEvent, m7917k);
                if (!C9612q.m13922c(motionEvent, transformedEvent)) {
                    motionEvent.recycle();
                }
                if (!C9612q.m13922c(m7917k, sourceEvent)) {
                    m7917k.recycle();
                }
            } catch (C11505a unused) {
                m7963B();
            }
        }
    }

    /* renamed from: V */
    public final boolean m7936V(C11504d<?> other) {
        C9612q.m13917h(other, "other");
        int length = this.f29870a.length;
        for (int i = 0; i < length; i++) {
            if (this.f29870a[i] != -1 && other.f29870a[i] != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W */
    public final boolean m7935W() {
        return this.f29867E;
    }

    /* renamed from: X */
    public final boolean m7934X() {
        return this.f29868F;
    }

    /* renamed from: Y */
    public final boolean m7933Y() {
        return this.f29879j;
    }

    /* renamed from: Z */
    public final boolean m7932Z() {
        return this.f29878i;
    }

    /* renamed from: a0 */
    public final boolean m7930a0(View view, float f, float f2) {
        float f3;
        boolean z;
        boolean z2;
        float f4;
        C9612q.m13920e(view);
        float width = view.getWidth();
        float height = view.getHeight();
        float[] fArr = this.f29887r;
        float f5 = 0.0f;
        if (fArr != null) {
            float f6 = fArr[0];
            float f7 = fArr[1];
            float f8 = fArr[2];
            float f9 = fArr[3];
            C11506b c11506b = f29859H;
            if (c11506b.m7887c(f6)) {
                f4 = 0.0f - f6;
            } else {
                f4 = 0.0f;
            }
            if (c11506b.m7887c(f7)) {
                f5 = 0.0f - f7;
            }
            if (c11506b.m7887c(f8)) {
                width += f8;
            }
            if (c11506b.m7887c(f9)) {
                height += f9;
            }
            float f10 = fArr[4];
            float f11 = fArr[5];
            if (c11506b.m7887c(f10)) {
                if (!c11506b.m7887c(f6)) {
                    f4 = width - f10;
                } else if (!c11506b.m7887c(f8)) {
                    width = f10 + f4;
                }
            }
            if (c11506b.m7887c(f11)) {
                if (!c11506b.m7887c(f7)) {
                    f5 = height - f11;
                } else if (!c11506b.m7887c(f9)) {
                    height = f11 + f5;
                }
            }
            f3 = f5;
            f5 = f4;
        } else {
            f3 = 0.0f;
        }
        if (f5 <= f && f <= width) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (f3 <= f2 && f2 <= height) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d0 */
    protected void mo7715d0() {
    }

    /* renamed from: e0 */
    protected void mo7714e0(MotionEvent event, MotionEvent sourceEvent) {
        C9612q.m13917h(event, "event");
        C9612q.m13917h(sourceEvent, "sourceEvent");
        m7928b0(1);
    }

    /* renamed from: f0 */
    protected void mo7813f0() {
    }

    /* renamed from: g0 */
    protected void mo7713g0() {
    }

    /* renamed from: h0 */
    protected void mo7821h0(int i, int i2) {
    }

    /* renamed from: i */
    public final void m7920i() {
        mo7712j(false);
    }

    /* renamed from: i0 */
    public final void m7919i0(View view, C11510g c11510g) {
        boolean z;
        Context context;
        if (this.f29874e == null && this.f29863A == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Arrays.fill(this.f29870a, -1);
            this.f29871b = 0;
            this.f29875f = 0;
            this.f29874e = view;
            this.f29863A = c11510g;
            View view2 = null;
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            Window m7938T = m7938T(context);
            if (m7938T != null) {
                view2 = m7938T.getDecorView();
            }
            if (view2 != null) {
                Rect rect = new Rect();
                view2.getWindowVisibleDisplayFrame(rect);
                int[] iArr = this.f29872c;
                iArr[0] = rect.left;
                iArr[1] = rect.top;
            } else {
                int[] iArr2 = this.f29872c;
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            mo7813f0();
            return;
        }
        throw new IllegalStateException("Already prepared or hasn't been reset".toString());
    }

    /* renamed from: j */
    public void mo7712j(boolean z) {
        if (!this.f29891v || z) {
            int i = this.f29875f;
            if (i == 0 || i == 2) {
                m7928b0(4);
            }
        }
    }

    /* renamed from: j0 */
    public final void m7918j0() {
        this.f29874e = null;
        this.f29863A = null;
        Arrays.fill(this.f29870a, -1);
        this.f29871b = 0;
        this.f29884o = 0;
        C9536e.m14265m(this.f29885p, null, 0, 0, 6, null);
        this.f29883n = 0;
        mo7713g0();
    }

    /* renamed from: k0 */
    public void mo7711k0() {
        this.f29886q = false;
        this.f29891v = false;
        this.f29894y = false;
        this.f29879j = true;
        this.f29887r = null;
    }

    /* renamed from: l0 */
    public void mo7746l0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m0 */
    public final ConcreteGestureHandlerT m7914m0() {
        C9612q.m13919f(this, "null cannot be cast to non-null type ConcreteGestureHandlerT of com.swmansion.gesturehandler.core.GestureHandler");
        return this;
    }

    /* renamed from: n */
    public final void m7913n() {
        if (this.f29875f == 0) {
            m7928b0(2);
        }
    }

    /* renamed from: n0 */
    public final void m7912n0(int i) {
        this.f29880k = i;
    }

    /* renamed from: o */
    public final void m7911o() {
        int i = this.f29875f;
        if (i == 4 || i == 0 || i == 2) {
            mo7715d0();
            m7928b0(3);
        }
    }

    /* renamed from: o0 */
    public final void m7910o0(int i) {
        this.f29866D = i;
    }

    /* renamed from: p0 */
    public final void m7908p0(boolean z) {
        this.f29867E = z;
    }

    /* renamed from: q */
    public final WritableArray m7907q() {
        WritableArray writableArray = this.f29882m;
        this.f29882m = null;
        return writableArray;
    }

    /* renamed from: q0 */
    public final void m7906q0(boolean z) {
        this.f29868F = z;
    }

    /* renamed from: r */
    public final WritableArray m7905r() {
        WritableArray writableArray = this.f29881l;
        this.f29881l = null;
        return writableArray;
    }

    /* renamed from: r0 */
    public final ConcreteGestureHandlerT m7904r0(boolean z) {
        final ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) m7914m0();
        if (concretegesturehandlert.f29874e != null && concretegesturehandlert.f29879j != z) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: pe.c
                @Override // java.lang.Runnable
                public final void run() {
                    C11504d.m7902s0(C11504d.this);
                }
            });
        }
        concretegesturehandlert.f29879j = z;
        return concretegesturehandlert;
    }

    /* renamed from: t */
    public void mo7820t(MotionEvent event) {
        C9612q.m13917h(event, "event");
        InterfaceC11526n interfaceC11526n = this.f29864B;
        if (interfaceC11526n != null) {
            interfaceC11526n.mo7797b(m7914m0(), event);
        }
    }

    /* renamed from: t0 */
    public final ConcreteGestureHandlerT m7901t0(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        boolean z2;
        boolean z3;
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) m7914m0();
        if (concretegesturehandlert.f29887r == null) {
            concretegesturehandlert.f29887r = new float[6];
        }
        float[] fArr = concretegesturehandlert.f29887r;
        C9612q.m13920e(fArr);
        boolean z4 = false;
        fArr[0] = f;
        float[] fArr2 = concretegesturehandlert.f29887r;
        C9612q.m13920e(fArr2);
        fArr2[1] = f2;
        float[] fArr3 = concretegesturehandlert.f29887r;
        C9612q.m13920e(fArr3);
        fArr3[2] = f3;
        float[] fArr4 = concretegesturehandlert.f29887r;
        C9612q.m13920e(fArr4);
        fArr4[3] = f4;
        float[] fArr5 = concretegesturehandlert.f29887r;
        C9612q.m13920e(fArr5);
        fArr5[4] = f5;
        float[] fArr6 = concretegesturehandlert.f29887r;
        C9612q.m13920e(fArr6);
        fArr6[5] = f6;
        C11506b c11506b = f29859H;
        if (c11506b.m7887c(f5) && c11506b.m7887c(f) && c11506b.m7887c(f3)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (c11506b.m7887c(f5) && !c11506b.m7887c(f) && !c11506b.m7887c(f3)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                if (c11506b.m7887c(f6) && c11506b.m7887c(f4) && c11506b.m7887c(f2)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    if (!c11506b.m7887c(f6) || c11506b.m7887c(f4) || c11506b.m7887c(f2)) {
                        z4 = true;
                    }
                    if (z4) {
                        return concretegesturehandlert;
                    }
                    throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined".toString());
                }
                throw new IllegalArgumentException("Cannot have all of top, bottom and height defined".toString());
            }
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined".toString());
        }
        throw new IllegalArgumentException("Cannot have all of left, right and width defined".toString());
    }

    public String toString() {
        String simpleName;
        View view = this.f29874e;
        if (view == null) {
            simpleName = null;
        } else {
            C9612q.m13920e(view);
            simpleName = view.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "@[" + this.f29873d + "]:" + simpleName;
    }

    /* renamed from: u */
    public void mo7819u(int i, int i2) {
        InterfaceC11526n interfaceC11526n = this.f29864B;
        if (interfaceC11526n != null) {
            interfaceC11526n.mo7798a(m7914m0(), i, i2);
        }
    }

    /* renamed from: u0 */
    public final ConcreteGestureHandlerT m7900u0(InterfaceC11508e interfaceC11508e) {
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) m7914m0();
        concretegesturehandlert.f29865C = interfaceC11508e;
        return concretegesturehandlert;
    }

    /* renamed from: v0 */
    public final ConcreteGestureHandlerT m7898v0(boolean z) {
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) m7914m0();
        concretegesturehandlert.f29891v = z;
        return concretegesturehandlert;
    }

    /* renamed from: w */
    public void m7897w() {
        InterfaceC11526n interfaceC11526n;
        if (this.f29881l != null && (interfaceC11526n = this.f29864B) != null) {
            interfaceC11526n.mo7796c(m7914m0());
        }
    }

    /* renamed from: w0 */
    public final void m7896w0(boolean z) {
        this.f29886q = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x0 */
    public final C11504d<?> m7894x0(InterfaceC11526n interfaceC11526n) {
        this.f29864B = interfaceC11526n;
        return this;
    }

    /* renamed from: y0 */
    public final ConcreteGestureHandlerT m7892y0(boolean z) {
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) m7914m0();
        concretegesturehandlert.f29894y = z;
        return concretegesturehandlert;
    }

    /* renamed from: z */
    public final void m7891z() {
        int i = this.f29875f;
        if (i == 2 || i == 4) {
            m7928b0(5);
        }
    }

    /* renamed from: z0 */
    public final void m7890z0(boolean z) {
        this.f29869G = z;
    }
}
