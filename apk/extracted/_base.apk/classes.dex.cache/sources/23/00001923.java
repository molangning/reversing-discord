package com.discord.media.engine;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.discord.async_init.AsyncInitDispatcher;
import com.discord.logging.Log;
import com.discord.media.engine.types.Debug;
import com.discord.media.engine.types.NativeTypeExtensionsKt;
import com.discord.media.engine.video.AttachedVideoSinks;
import com.discord.media.engine.video.screen_capture.ScreenCapturer;
import com.discord.media.engine.video.screen_capture.ThumbnailEmitter;
import com.discord.p047native.engine.AudioInputDeviceDescription;
import com.discord.p047native.engine.AudioOutputDeviceDescription;
import com.discord.p047native.engine.ConnectionInfo;
import com.discord.p047native.engine.NativeConnection;
import com.discord.p047native.engine.NativeEngine;
import com.discord.p047native.engine.NativeSpeedTestConnection;
import com.discord.p047native.engine.VideoInputDeviceDescription;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.util.JSStackTrace;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9536e;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9819l0;
import kotlinx.coroutines.C9824m0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;
import org.webrtc.VideoFrame;
import org.webrtc.voiceengine.WebRtcAudioManager;

@Metadata(m14358d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b`\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 û\u00012\u00020\u0001:\u0004û\u0001ü\u0001B\u001f\u0012\b\u0010Þ\u0001\u001a\u00030Ý\u0001\u0012\n\b\u0002\u0010ø\u0001\u001a\u00030÷\u0001¢\u0006\u0006\bù\u0001\u0010ú\u0001J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\r\u001a\u00020\bJ#\u0010\u0013\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\u00020\b2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\b2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u0014H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0015H\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0015H\u0000¢\u0006\u0004\b#\u0010!J\u0017\u0010(\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000fH\u0000¢\u0006\u0004\b&\u0010'J5\u0010-\u001a\u00020\b2$\u0010+\u001a \u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010*0)\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\b,\u0010\u0012J\u0017\u00101\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u0002H\u0000¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u0004H\u0000¢\u0006\u0004\b/\u0010\u001dJ5\u00103\u001a\u00020\b2$\u0010+\u001a \u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010*0)\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\b2\u0010\u0012J\u0017\u00105\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u0002H\u0000¢\u0006\u0004\b4\u00100J\u0017\u00105\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u0004H\u0000¢\u0006\u0004\b4\u0010\u001dJ5\u00107\u001a\u00020\b2$\u0010+\u001a \u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010*0)\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\b6\u0010\u0012J\u0017\u0010:\u001a\u00020\b2\u0006\u00108\u001a\u00020\u0004H\u0000¢\u0006\u0004\b9\u0010\u001dJ\u0017\u0010:\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u0002H\u0000¢\u0006\u0004\b9\u00100Je\u0010>\u001a\u00020\b2T\u0010+\u001aP\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010*0)\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010*0)\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010*0)\u0012\u0004\u0012\u00020\b0;H\u0000¢\u0006\u0004\b<\u0010=J-\u0010C\u001a\u00020\b2\u0006\u0010?\u001a\u00020\u00042\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0001¢\u0006\u0004\bA\u0010BJ\u0017\u0010F\u001a\u00020\b2\u0006\u0010D\u001a\u00020\u0015H\u0000¢\u0006\u0004\bE\u0010!J)\u0010H\u001a\u00020\b2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0014H\u0000¢\u0006\u0004\bG\u0010\u0017J)\u0010K\u001a\u00020\b2\u0018\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040I\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\bJ\u0010\u0012J#\u0010M\u001a\u00020\b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\bL\u0010\u0012J#\u0010O\u001a\u00020\b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\bN\u0010\u0012J1\u0010R\u001a\u00020\b2\u0006\u0010P\u001a\u00020\u00042\u0018\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040I\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\bQ\u0010BJ+\u0010T\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00042\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\bS\u0010BJ)\u0010V\u001a\u00020\b2\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0014H\u0000¢\u0006\u0004\bU\u0010\u0017J\u0017\u0010Y\u001a\u00020\b2\u0006\u0010W\u001a\u00020\u000fH\u0000¢\u0006\u0004\bX\u0010'JD\u0010\\\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\u00042$\u0010+\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010*\u0012\u0004\u0012\u00020\b0\u0014J3\u0010_\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0014H\u0000¢\u0006\u0004\b]\u0010^J?\u0010c\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022$\u0010\u0010\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0`H\u0000¢\u0006\u0004\ba\u0010bJ?\u0010e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022$\u0010\u0010\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0`H\u0000¢\u0006\u0004\bd\u0010bJ=\u0010j\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060fj\u0002`g\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0;H\u0000¢\u0006\u0004\bh\u0010iJC\u0010l\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022(\u0010\u0010\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060fj\u0002`g\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0`H\u0000¢\u0006\u0004\bk\u0010bJ\u0017\u0010n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\bm\u00100J\u001f\u0010s\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010p\u001a\u00020oH\u0000¢\u0006\u0004\bq\u0010rJ;\u0010y\u001a\u00020\b2\u0006\u0010t\u001a\u00020\u00022\u0006\u0010u\u001a\u00020\u00022\u0006\u0010v\u001a\u00020\u00022\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\bw\u0010xJ\u0017\u0010{\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\bz\u00100J(\u0010\u0080\u0001\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010|\u001a\u00020\u00022\u0006\u0010}\u001a\u00020\u0004H\u0000¢\u0006\u0004\b~\u0010\u007fJ7\u0010\u0086\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010\u0081\u0001\u001a\u00020\u00022\u0007\u0010\u0082\u0001\u001a\u00020\u00022\u0007\u0010\u0083\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J6\u0010\u0089\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040I\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J$\u0010\u008c\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J%\u0010\u008f\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010\u008d\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0006\b\u008e\u0001\u0010\u008b\u0001J$\u0010\u0091\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020\u0004H\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u008b\u0001J%\u0010\u0095\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010\u0092\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J6\u0010\u009a\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020\u00042\u0007\u0010\u0096\u0001\u001a\u00020\u00152\u0007\u0010\u0097\u0001\u001a\u00020\u0015H\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J,\u0010\u009d\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0015H\u0000¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J-\u0010¡\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020\u00042\u0007\u0010\u009e\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u001c\u0010¤\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0006\b¢\u0001\u0010£\u0001J%\u0010§\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010¥\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0006\b¦\u0001\u0010\u0094\u0001J%\u0010ª\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010¨\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0006\b©\u0001\u0010\u0094\u0001J%\u0010®\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010«\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J$\u0010±\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u0015H\u0000¢\u0006\u0006\b¯\u0001\u0010°\u0001J.\u0010¶\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010²\u0001\u001a\u00020\u000f2\u0007\u0010³\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0006\b´\u0001\u0010µ\u0001J0\u0010¸\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0006\b·\u0001\u0010\u0088\u0001J%\u0010»\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010¹\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\bº\u0001\u0010\u00ad\u0001J9\u0010¿\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010¼\u0001\u001a\u00020\u00022\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0006\b½\u0001\u0010¾\u0001JE\u0010À\u0001\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\u00042$\u0010+\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010*\u0012\u0004\u0012\u00020\b0\u0014JA\u0010Â\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022$\u0010\u0010\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0`H\u0000¢\u0006\u0005\bÁ\u0001\u0010bJA\u0010Ä\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022$\u0010\u0010\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0`H\u0000¢\u0006\u0005\bÃ\u0001\u0010bJ\u0019\u0010Æ\u0001\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0005\bÅ\u0001\u00100J6\u0010È\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040I\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0006\bÇ\u0001\u0010\u0088\u0001J0\u0010Ê\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0006\bÉ\u0001\u0010\u0088\u0001J>\u0010Í\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00042\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0014H\u0000¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u001c\u0010Ï\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0006\bÎ\u0001\u0010£\u0001J3\u0010Ó\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00042\r\u0010+\u001a\t\u0012\u0004\u0012\u00020\b0Ð\u0001H\u0000¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J5\u0010Õ\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0014H\u0000¢\u0006\u0005\bÔ\u0001\u0010^J$\u0010×\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0006\bÖ\u0001\u0010\u008b\u0001J%\u0010Ù\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010¹\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\bØ\u0001\u0010\u00ad\u0001J\u001a\u0010Ü\u0001\u001a\u00020\b2\u0007\u0010Ú\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\bÛ\u0001\u0010'R\u0018\u0010Þ\u0001\u001a\u00030Ý\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u0017\u0010à\u0001\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u0018\u0010ã\u0001\u001a\u00030â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R\u0018\u0010æ\u0001\u001a\u00030å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u001c\u0010é\u0001\u001a\u0005\u0018\u00010è\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u0018\u0010ì\u0001\u001a\u00030ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\u0018\u0010ï\u0001\u001a\u00030î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R\u001c\u0010ò\u0001\u001a\u0005\u0018\u00010ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R\u0018\u0010ö\u0001\u001a\u00030ñ\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bô\u0001\u0010õ\u0001¨\u0006ý\u0001"}, m14357d2 = {"Lcom/discord/media/engine/MediaEngine;", "", "", "connectionId", "", JSStackTrace.METHOD_NAME_KEY, "Lcom/discord/native/engine/NativeConnection;", "getConnection", "", "stopScreenCapturerForConnection", "forceStopScreenCapturer", "Lcom/discord/native/engine/NativeSpeedTestConnection;", "getSpeedTestConnection", "reset", "Lkotlin/Function1;", "", "cb", "setOnNoInputCallback$media_engine_release", "(Lkotlin/jvm/functions/Function1;)V", "setOnNoInputCallback", "Lkotlin/Function2;", "", "setOnVoiceCallback$media_engine_release", "(Lkotlin/jvm/functions/Function2;)V", "setOnVoiceCallback", "setActiveSinksChangeCallback$media_engine_release", "setActiveSinksChangeCallback", "optionsJSON", "setTransportOptions$media_engine_release", "(Ljava/lang/String;)V", "setTransportOptions", "volume", "setInputVolume$media_engine_release", "(F)V", "setInputVolume", "setOutputVolume$media_engine_release", "setOutputVolume", "enable", "setEmitVADLevel2$media_engine_release", "(Z)V", "setEmitVADLevel2", "", "", "callback", "getInputDevices$media_engine_release", "getInputDevices", "deviceIndex", "setInputDevice$media_engine_release", "(I)V", "setInputDevice", "getOutputDevices$media_engine_release", "getOutputDevices", "setOutputDevice$media_engine_release", "setOutputDevice", "getVideoInputDevices$media_engine_release", "getVideoInputDevices", "deviceName", "setVideoInputDevice$media_engine_release", "setVideoInputDevice", "Lkotlin/Function3;", "setDeviceChangeCallback$media_engine_release", "(Lkotlin/jvm/functions/Function3;)V", "setDeviceChangeCallback", "streamIdentifier", "Lorg/webrtc/VideoFrame;", "setVideoOutputSink$media_engine_release", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "setVideoOutputSink", "threshold", "setNoInputThreshold$media_engine_release", "setNoInputThreshold", "getAudioSubsystem$media_engine_release", "getAudioSubsystem", "", "getSupportedVideoCodecs$media_engine_release", "getSupportedVideoCodecs", "getCodecCapabilities$media_engine_release", "getCodecCapabilities", "getCodecSurvey$media_engine_release", "getCodecSurvey", "regionsWithIpsJSON", "rankRtcRegions$media_engine_release", "rankRtcRegions", "startLocalAudioRecording$media_engine_release", "startLocalAudioRecording", "stopLocalAudioRecording$media_engine_release", "stopLocalAudioRecording", ViewProps.ENABLED, "setAudioInputEnabled$media_engine_release", "setAudioInputEnabled", "userId", "connectionOptionsJSON", "createVoiceConnection", "connectionInstanceSetOnSpeakingCallback$media_engine_release", "(ILkotlin/jvm/functions/Function2;)Lkotlin/Unit;", "connectionInstanceSetOnSpeakingCallback", "Lkotlin/Function4;", "connectionInstanceSetOnPingCallback$media_engine_release", "(ILkotlin/jvm/functions/Function4;)Lkotlin/Unit;", "connectionInstanceSetOnPingCallback", "connectionInstanceSetOnPingTimeoutCallback$media_engine_release", "connectionInstanceSetOnPingTimeoutCallback", "", "Lcom/discord/media/engine/types/SSRC64;", "connectionInstanceSetOnFirstFrameCallback$media_engine_release", "(ILkotlin/jvm/functions/Function3;)Lkotlin/Unit;", "connectionInstanceSetOnFirstFrameCallback", "connectionInstanceSetOnVideoCallback$media_engine_release", "connectionInstanceSetOnVideoCallback", "connectionInstanceDestroy$media_engine_release", "connectionInstanceDestroy", "Landroid/content/Intent;", "permissions", "connectionInstanceStartBroadcast$media_engine_release", "(ILandroid/content/Intent;)V", "connectionInstanceStartBroadcast", "width", "height", "intervalSeconds", "setBroadcastThumbnailParams$media_engine_release", "(IIILkotlin/jvm/functions/Function1;)V", "setBroadcastThumbnailParams", "connectionInstanceStopBroadcast$media_engine_release", "connectionInstanceStopBroadcast", "errorCode", "errorMessage", "connectionInstanceStopBroadcastWithError$media_engine_release", "(IILjava/lang/String;)V", "connectionInstanceStopBroadcastWithError", "baseDelayMs", "maxDelayMs", "maxAttempts", "connectionInstanceConfigureConnectionRetries$media_engine_release", "(IIII)Lkotlin/Unit;", "connectionInstanceConfigureConnectionRetries", "connectionInstanceGetEncryptionModes$media_engine_release", "(ILkotlin/jvm/functions/Function1;)Lkotlin/Unit;", "connectionInstanceGetEncryptionModes", "connectionInstanceSetTransportOptions$media_engine_release", "(ILjava/lang/String;)Lkotlin/Unit;", "connectionInstanceSetTransportOptions", "usersJSON", "connectionInstanceMergeUsers$media_engine_release", "connectionInstanceMergeUsers", "connectionInstanceDestroyUser$media_engine_release", "connectionInstanceDestroyUser", "broadcasting", "connectionInstanceSetVideoBroadcast$media_engine_release", "(IZ)Lkotlin/Unit;", "connectionInstanceSetVideoBroadcast", ViewProps.LEFT, ViewProps.RIGHT, "connectionInstanceSetLocalPan$media_engine_release", "(ILjava/lang/String;FF)Lkotlin/Unit;", "connectionInstanceSetLocalPan", "connectionInstanceSetLocalVolume$media_engine_release", "(ILjava/lang/String;F)Lkotlin/Unit;", "connectionInstanceSetLocalVolume", "mute", "connectionInstanceSetLocalMute$media_engine_release", "(ILjava/lang/String;Z)Lkotlin/Unit;", "connectionInstanceSetLocalMute", "connectionInstanceFastUdpReconnect$media_engine_release", "(I)Lkotlin/Unit;", "connectionInstanceFastUdpReconnect", "muted", "connectionInstanceSetSelfMute$media_engine_release", "connectionInstanceSetSelfMute", "deafened", "connectionInstanceSetSelfDeafen$media_engine_release", "connectionInstanceSetSelfDeafen", "delay", "connectionInstanceSetMinimumOutputDelay$media_engine_release", "(II)Lkotlin/Unit;", "connectionInstanceSetMinimumOutputDelay", "connectionInstanceSetNoInputThreshold$media_engine_release", "(IF)Lkotlin/Unit;", "connectionInstanceSetNoInputThreshold", AppStateModule.APP_STATE_ACTIVE, "priority", "connectionInstanceSetPTTActive$media_engine_release", "(IZZ)Lkotlin/Unit;", "connectionInstanceSetPTTActive", "connectionInstanceGetStats$media_engine_release", "connectionInstanceGetStats", "pingInterval", "connectionInstanceSetPingInterval$media_engine_release", "connectionInstanceSetPingInterval", "filter", "connectionInstanceGetFilteredStats$media_engine_release", "(IILkotlin/jvm/functions/Function1;)Lkotlin/Unit;", "connectionInstanceGetFilteredStats", "createSpeedTestConnection", "speedTestConnectionInstanceSetOnPingCallback$media_engine_release", "speedTestConnectionInstanceSetOnPingCallback", "speedTestConnectionInstanceSetOnPingTimeoutCallback$media_engine_release", "speedTestConnectionInstanceSetOnPingTimeoutCallback", "speedTestConnectionInstanceDestroy$media_engine_release", "speedTestConnectionInstanceDestroy", "speedTestConnectionInstanceGetEncryptionModes$media_engine_release", "speedTestConnectionInstanceGetEncryptionModes", "speedTestConnectionInstanceGetNetworkOverhead$media_engine_release", "speedTestConnectionInstanceGetNetworkOverhead", "speedTestConnectionInstanceStartSpeedTestSender$media_engine_release", "(ILjava/lang/String;Lkotlin/jvm/functions/Function2;)Lkotlin/Unit;", "speedTestConnectionInstanceStartSpeedTestSender", "speedTestConnectionInstanceStopSpeedTestSender$media_engine_release", "speedTestConnectionInstanceStopSpeedTestSender", "Lkotlin/Function0;", "speedTestConnectionInstanceStartSpeedTestReceiver$media_engine_release", "(ILjava/lang/String;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;", "speedTestConnectionInstanceStartSpeedTestReceiver", "speedTestConnectionInstanceStopSpeedTestReceiver$media_engine_release", "speedTestConnectionInstanceStopSpeedTestReceiver", "speedTestConnectionInstanceSetTransportOptions$media_engine_release", "speedTestConnectionInstanceSetTransportOptions", "speedTestConnectionInstanceSetPingInterval$media_engine_release", "speedTestConnectionInstanceSetPingInterval", "hasFullbandPerformance", "setHasFullbandPerformance$media_engine_release", "setHasFullbandPerformance", "Landroid/content/Context;", "context", "Landroid/content/Context;", "instanceCreationNs", "J", "Lcom/discord/media/engine/MediaEngineNativeConnections;", "engineConnections", "Lcom/discord/media/engine/MediaEngineNativeConnections;", "Lcom/discord/media/engine/MediaEngineNativeSpeedTestConnections;", "engineSpeedTestConnections", "Lcom/discord/media/engine/MediaEngineNativeSpeedTestConnections;", "Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;", "screenCapturer", "Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;", "Lcom/discord/async_init/AsyncInitDispatcher;", "dispatcher", "Lcom/discord/async_init/AsyncInitDispatcher;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/discord/native/engine/NativeEngine;", "engineInstance", "Lcom/discord/native/engine/NativeEngine;", "getEngine", "()Lcom/discord/native/engine/NativeEngine;", "engine", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineDispatcher", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Companion", "ScreenCapturerForConnection", "media_engine_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaEngine {
    public static final Companion Companion = new Companion(null);
    public static final int MaxSupportedProtocolVersion = 1;
    private static final Set<String> OPEN_SL_DEVICE_ALLOW_LIST;
    private static final String TAG = "MediaEngine";
    private static final int THUMBNAIL_JPEG_QUALITY = 92;
    private final Context context;
    private final CoroutineScope coroutineScope;
    private final AsyncInitDispatcher dispatcher;
    private final MediaEngineNativeConnections engineConnections;
    private NativeEngine engineInstance;
    private final MediaEngineNativeSpeedTestConnections engineSpeedTestConnections;
    private final long instanceCreationNs;
    private ScreenCapturerForConnection screenCapturer;

    @Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\f\u0010\u000e\u001a\u00020\u000f*\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m14357d2 = {"Lcom/discord/media/engine/MediaEngine$Companion;", "", "()V", "MaxSupportedProtocolVersion", "", "OPEN_SL_DEVICE_ALLOW_LIST", "", "", "TAG", "THUMBNAIL_JPEG_QUALITY", "encodeThumbnail", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "compressToJpegBytes", "", "media_engine_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final byte[] compressToJpegBytes(Bitmap bitmap) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 92, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C9612q.m13918g(byteArray, "ByteArrayOutputStream()\n…           .toByteArray()");
            return byteArray;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0061 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object encodeThumbnail(android.graphics.Bitmap r6, kotlin.coroutines.Continuation<? super java.lang.String> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.discord.media.engine.MediaEngine$Companion$encodeThumbnail$1
                if (r0 == 0) goto L13
                r0 = r7
                com.discord.media.engine.MediaEngine$Companion$encodeThumbnail$1 r0 = (com.discord.media.engine.MediaEngine$Companion$encodeThumbnail$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.discord.media.engine.MediaEngine$Companion$encodeThumbnail$1 r0 = new com.discord.media.engine.MediaEngine$Companion$encodeThumbnail$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = p388vf.C13271b.m2873d()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r6 = r0.L$0
                java.lang.String r6 = (java.lang.String) r6
                pf.C11586t.m7586b(r7)
                goto L62
            L30:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L38:
                java.lang.Object r6 = r0.L$0
                byte[] r6 = (byte[]) r6
                pf.C11586t.m7586b(r7)
                goto L52
            L40:
                pf.C11586t.m7586b(r7)
                byte[] r6 = r5.compressToJpegBytes(r6)
                r0.L$0 = r6
                r0.label = r4
                java.lang.Object r7 = kotlinx.coroutines.C9690d3.m13555a(r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r7 = 0
                java.lang.String r6 = android.util.Base64.encodeToString(r6, r7)
                r0.L$0 = r6
                r0.label = r3
                java.lang.Object r7 = kotlinx.coroutines.C9690d3.m13555a(r0)
                if (r7 != r1) goto L62
                return r1
            L62:
                java.lang.String r7 = "string"
                kotlin.jvm.internal.C9612q.m13918g(r6, r7)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.media.engine.MediaEngine.Companion.encodeThumbnail(android.graphics.Bitmap, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m14357d2 = {"Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;", "", "screenCapturer", "Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;", "connectionId", "", "(Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;I)V", "getConnectionId", "()I", "getScreenCapturer", "()Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "release", "", "toString", "", "media_engine_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class ScreenCapturerForConnection {
        private final int connectionId;
        private final ScreenCapturer screenCapturer;

        public ScreenCapturerForConnection(ScreenCapturer screenCapturer, int i) {
            C9612q.m13917h(screenCapturer, "screenCapturer");
            this.screenCapturer = screenCapturer;
            this.connectionId = i;
        }

        public static /* synthetic */ ScreenCapturerForConnection copy$default(ScreenCapturerForConnection screenCapturerForConnection, ScreenCapturer screenCapturer, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                screenCapturer = screenCapturerForConnection.screenCapturer;
            }
            if ((i2 & 2) != 0) {
                i = screenCapturerForConnection.connectionId;
            }
            return screenCapturerForConnection.copy(screenCapturer, i);
        }

        public final ScreenCapturer component1() {
            return this.screenCapturer;
        }

        public final int component2() {
            return this.connectionId;
        }

        public final ScreenCapturerForConnection copy(ScreenCapturer screenCapturer, int i) {
            C9612q.m13917h(screenCapturer, "screenCapturer");
            return new ScreenCapturerForConnection(screenCapturer, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ScreenCapturerForConnection) {
                ScreenCapturerForConnection screenCapturerForConnection = (ScreenCapturerForConnection) obj;
                return C9612q.m13922c(this.screenCapturer, screenCapturerForConnection.screenCapturer) && this.connectionId == screenCapturerForConnection.connectionId;
            }
            return false;
        }

        public final int getConnectionId() {
            return this.connectionId;
        }

        public final ScreenCapturer getScreenCapturer() {
            return this.screenCapturer;
        }

        public int hashCode() {
            return (this.screenCapturer.hashCode() * 31) + this.connectionId;
        }

        public final void release() {
            this.screenCapturer.release();
        }

        public String toString() {
            ScreenCapturer screenCapturer = this.screenCapturer;
            int i = this.connectionId;
            return "ScreenCapturerForConnection(screenCapturer=" + screenCapturer + ", connectionId=" + i + ")";
        }
    }

    static {
        Set<String> m14002i;
        m14002i = C9560w.m14002i("Pixel", "Pixel XL", "Pixel 3a XL", "Pixel 4", "Pixel 4 XL", "Pixel 5");
        OPEN_SL_DEVICE_ALLOW_LIST = m14002i;
    }

    public MediaEngine(Context context, CoroutineDispatcher coroutineDispatcher) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(coroutineDispatcher, "coroutineDispatcher");
        this.context = context;
        this.instanceCreationNs = System.nanoTime();
        this.engineConnections = new MediaEngineNativeConnections();
        this.engineSpeedTestConnections = new MediaEngineNativeSpeedTestConnections();
        this.dispatcher = new AsyncInitDispatcher(TAG, 0L, 2, null);
        this.coroutineScope = C9824m0.m13174a(coroutineDispatcher.mo1459e0(new C9819l0(TAG)));
    }

    public static final void connectionInstanceGetEncryptionModes$lambda$54(Function1 callback, String[] modes) {
        C9612q.m13917h(callback, "$callback");
        C9612q.m13917h(modes, "modes");
        callback.invoke(modes);
    }

    public static final void connectionInstanceGetFilteredStats$lambda$56(Function1 callback, String stats) {
        C9612q.m13917h(callback, "$callback");
        C9612q.m13917h(stats, "stats");
        callback.invoke(stats);
    }

    public static final void connectionInstanceGetStats$lambda$55(Function1 callback, String stats) {
        C9612q.m13917h(callback, "$callback");
        C9612q.m13917h(stats, "stats");
        callback.invoke(stats);
    }

    public static final void connectionInstanceSetOnFirstFrameCallback$lambda$50(Function3 cb, String userId, long j, String streamId) {
        C9612q.m13917h(cb, "$cb");
        C9612q.m13917h(userId, "userId");
        C9612q.m13917h(streamId, "streamId");
        cb.invoke(userId, Long.valueOf(j), streamId);
    }

    public static final void connectionInstanceSetOnPingCallback$lambda$48(Function4 cb, int i, String server, int i2, int i3) {
        C9612q.m13917h(cb, "$cb");
        C9612q.m13917h(server, "server");
        cb.invoke(Integer.valueOf(i), server, Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static final void connectionInstanceSetOnPingTimeoutCallback$lambda$49(Function4 cb, String server, int i, int i2, int i3) {
        C9612q.m13917h(cb, "$cb");
        C9612q.m13917h(server, "server");
        cb.invoke(server, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static final void connectionInstanceSetOnSpeakingCallback$lambda$47(Function2 cb, String userId, int i) {
        C9612q.m13917h(cb, "$cb");
        C9612q.m13917h(userId, "userId");
        cb.invoke(userId, Integer.valueOf(i));
    }

    public static final void connectionInstanceSetOnVideoCallback$lambda$51(Function4 cb, String userId, long j, String streamId, String videoStreamParametersJSON) {
        C9612q.m13917h(cb, "$cb");
        C9612q.m13917h(userId, "userId");
        C9612q.m13917h(streamId, "streamId");
        C9612q.m13917h(videoStreamParametersJSON, "videoStreamParametersJSON");
        cb.invoke(userId, Long.valueOf(j), streamId, videoStreamParametersJSON);
    }

    public static final void createSpeedTestConnection$lambda$57(Function2 callback, ConnectionInfo connectionInfo, String errorMessage) {
        C9612q.m13917h(callback, "$callback");
        C9612q.m13917h(connectionInfo, "connectionInfo");
        C9612q.m13917h(errorMessage, "errorMessage");
        Log log = Log.INSTANCE;
        Log.i$default(log, TAG, "On created with " + connectionInfo + ", " + errorMessage, (Throwable) null, 4, (Object) null);
        callback.invoke(errorMessage, NativeTypeExtensionsKt.toMap(connectionInfo));
    }

    public static final void createVoiceConnection$lambda$45(Function2 callback, ConnectionInfo connectionInfo, String errorMessage) {
        C9612q.m13917h(callback, "$callback");
        C9612q.m13917h(connectionInfo, "connectionInfo");
        C9612q.m13917h(errorMessage, "errorMessage");
        Log log = Log.INSTANCE;
        Log.i$default(log, TAG, "On created with " + connectionInfo + ", " + errorMessage, (Throwable) null, 4, (Object) null);
        callback.invoke(errorMessage, NativeTypeExtensionsKt.toMap(connectionInfo));
    }

    private final void forceStopScreenCapturer() {
        ScreenCapturerForConnection screenCapturerForConnection = this.screenCapturer;
        if (screenCapturerForConnection != null) {
            screenCapturerForConnection.release();
        }
        this.screenCapturer = null;
    }

    public static final void getCodecCapabilities$lambda$32$lambda$31(Function1 callback, String codecs) {
        C9612q.m13917h(callback, "$callback");
        C9612q.m13917h(codecs, "codecs");
        callback.invoke(codecs);
    }

    private final NativeConnection getConnection(int i, String str) {
        NativeConnection nativeConnection = this.engineConnections.get(i);
        if (nativeConnection == null) {
            Log log = Log.INSTANCE;
            Log.w$default(log, TAG, "[" + str + "] no NativeConnection for connectionId=" + i + ", returning null", (Throwable) null, 4, (Object) null);
        }
        return nativeConnection;
    }

    public final NativeEngine getEngine() {
        NativeEngine nativeEngine = this.engineInstance;
        if (nativeEngine != null) {
            return nativeEngine;
        }
        Debug debug = Debug.INSTANCE;
        System.nanoTime();
        WebRtcAudioManager.setBlacklistDeviceForOpenSLESUsage(!OPEN_SL_DEVICE_ALLOW_LIST.contains(Build.MODEL));
        NativeEngine nativeEngine2 = new NativeEngine(this.context, 2);
        nativeEngine2.enableBuiltInAEC(true);
        nativeEngine2.setAudioInputEnabled(false);
        this.engineInstance = nativeEngine2;
        this.dispatcher.setInitialized(true);
        return nativeEngine2;
    }

    public static final void getInputDevices$lambda$10$lambda$9(Function1 callback, AudioInputDeviceDescription[] devices) {
        C9612q.m13917h(callback, "$callback");
        C9612q.m13917h(devices, "devices");
        callback.invoke(NativeTypeExtensionsKt.toListOfMaps(devices));
    }

    public static final void getOutputDevices$lambda$15$lambda$14(Function1 callback, AudioOutputDeviceDescription[] devices) {
        C9612q.m13917h(callback, "$callback");
        C9612q.m13917h(devices, "devices");
        callback.invoke(NativeTypeExtensionsKt.toListOfMaps(devices));
    }

    private final NativeSpeedTestConnection getSpeedTestConnection(int i, String str) {
        NativeSpeedTestConnection nativeSpeedTestConnection = this.engineSpeedTestConnections.get(i);
        if (nativeSpeedTestConnection == null) {
            Log log = Log.INSTANCE;
            Log.w$default(log, TAG, "[" + str + "] no NativeSpeedTestConnection for connectionId=" + i + ", returning null", (Throwable) null, 4, (Object) null);
        }
        return nativeSpeedTestConnection;
    }

    public static final void getSupportedVideoCodecs$lambda$29$lambda$28(Function1 callback, String[] codecs) {
        C9612q.m13917h(callback, "$callback");
        C9612q.m13917h(codecs, "codecs");
        callback.invoke(codecs);
    }

    public static final void getVideoInputDevices$lambda$20$lambda$19(Function1 callback, VideoInputDeviceDescription[] videoInputDevices) {
        C9612q.m13917h(callback, "$callback");
        C9612q.m13917h(videoInputDevices, "videoInputDevices");
        callback.invoke(NativeTypeExtensionsKt.toListOfMaps(videoInputDevices));
    }

    public static final void rankRtcRegions$lambda$38$lambda$37(Function1 callback, String[] regions) {
        C9612q.m13917h(callback, "$callback");
        C9612q.m13917h(regions, "regions");
        callback.invoke(regions);
    }

    public static final void speedTestConnectionInstanceGetEncryptionModes$lambda$61(Function1 callback, String[] modes) {
        C9612q.m13917h(callback, "$callback");
        C9612q.m13917h(modes, "modes");
        callback.invoke(modes);
    }

    public static final void speedTestConnectionInstanceGetNetworkOverhead$lambda$62(Function1 callback, int i) {
        C9612q.m13917h(callback, "$callback");
        callback.invoke(Integer.valueOf(i));
    }

    public static final void speedTestConnectionInstanceSetOnPingCallback$lambda$59(Function4 cb, int i, String server, int i2, int i3) {
        C9612q.m13917h(cb, "$cb");
        C9612q.m13917h(server, "server");
        cb.invoke(Integer.valueOf(i), server, Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static final void speedTestConnectionInstanceSetOnPingTimeoutCallback$lambda$60(Function4 cb, String server, int i, int i2, int i3) {
        C9612q.m13917h(cb, "$cb");
        C9612q.m13917h(server, "server");
        cb.invoke(server, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static final void speedTestConnectionInstanceStartSpeedTestReceiver$lambda$64(Function0 callback) {
        C9612q.m13917h(callback, "$callback");
        callback.invoke();
    }

    public static final void speedTestConnectionInstanceStartSpeedTestSender$lambda$63(Function2 callback, int i, String desc) {
        C9612q.m13917h(callback, "$callback");
        C9612q.m13917h(desc, "desc");
        callback.invoke(Integer.valueOf(i), desc);
    }

    public static final void speedTestConnectionInstanceStopSpeedTestReceiver$lambda$65(Function2 callback, int i, String results) {
        C9612q.m13917h(callback, "$callback");
        C9612q.m13917h(results, "results");
        callback.invoke(Integer.valueOf(i), results);
    }

    public static final void startLocalAudioRecording$lambda$40(Function1 callback, boolean z) {
        C9612q.m13917h(callback, "$callback");
        callback.invoke(Boolean.valueOf(z));
    }

    public static final void stopLocalAudioRecording$lambda$42$lambda$41(Function2 callback, String fileName, int i) {
        C9612q.m13917h(callback, "$callback");
        C9612q.m13917h(fileName, "fileName");
        callback.invoke(fileName, Integer.valueOf(i));
    }

    private final void stopScreenCapturerForConnection(int i) {
        ScreenCapturerForConnection screenCapturerForConnection = this.screenCapturer;
        boolean z = false;
        if (screenCapturerForConnection != null && screenCapturerForConnection.getConnectionId() == i) {
            z = true;
        }
        if (z) {
            ScreenCapturerForConnection screenCapturerForConnection2 = this.screenCapturer;
            if (screenCapturerForConnection2 != null) {
                screenCapturerForConnection2.release();
            }
            this.screenCapturer = null;
        }
    }

    /* renamed from: connectionInstanceConfigureConnectionRetries$media_engine_release */
    public final Unit m31903x39e7e3d4(int i, int i2, int i3, int i4) {
        NativeConnection connection = getConnection(i, "configureConnectionRetries");
        if (connection != null) {
            connection.configureConnectionRetries(i2, i3, i4);
            return Unit.f25302a;
        }
        return null;
    }

    public final void connectionInstanceDestroy$media_engine_release(int i) {
        stopScreenCapturerForConnection(i);
        this.engineConnections.removeAndDispose(i);
    }

    public final Unit connectionInstanceDestroyUser$media_engine_release(int i, String userId) {
        C9612q.m13917h(userId, "userId");
        NativeConnection connection = getConnection(i, "destroyUser");
        if (connection != null) {
            connection.destroyUser(userId);
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceFastUdpReconnect$media_engine_release(int i) {
        NativeConnection connection = getConnection(i, "fastUdpReconnect");
        if (connection != null) {
            connection.fastUdpReconnect();
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceGetEncryptionModes$media_engine_release(int i, final Function1<? super String[], Unit> callback) {
        C9612q.m13917h(callback, "callback");
        NativeConnection connection = getConnection(i, "getEncryptionModes");
        if (connection != null) {
            connection.getEncryptionModes(new NativeConnection.GetEncryptionModesCallback() { // from class: com.discord.media.engine.z
                @Override // com.discord.p047native.engine.NativeConnection.GetEncryptionModesCallback
                public final void onEncryptionModes(String[] strArr) {
                    MediaEngine.connectionInstanceGetEncryptionModes$lambda$54(Function1.this, strArr);
                }
            });
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceGetFilteredStats$media_engine_release(int i, int i2, final Function1<? super String, Unit> callback) {
        C9612q.m13917h(callback, "callback");
        NativeConnection connection = getConnection(i, "getFilteredStats");
        if (connection != null) {
            connection.getFilteredStats(i2, new NativeConnection.GetStatsCallback() { // from class: com.discord.media.engine.i
                @Override // com.discord.p047native.engine.NativeConnection.GetStatsCallback
                public final void onStats(String str) {
                    MediaEngine.connectionInstanceGetFilteredStats$lambda$56(Function1.this, str);
                }
            });
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceGetStats$media_engine_release(int i, final Function1<? super String, Unit> callback) {
        C9612q.m13917h(callback, "callback");
        NativeConnection connection = getConnection(i, "getStats");
        if (connection != null) {
            connection.getStats(new NativeConnection.GetStatsCallback() { // from class: com.discord.media.engine.q
                @Override // com.discord.p047native.engine.NativeConnection.GetStatsCallback
                public final void onStats(String str) {
                    MediaEngine.connectionInstanceGetStats$lambda$55(Function1.this, str);
                }
            });
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceMergeUsers$media_engine_release(int i, String usersJSON) {
        C9612q.m13917h(usersJSON, "usersJSON");
        NativeConnection connection = getConnection(i, "mergeUsers");
        if (connection != null) {
            connection.mergeUsers(usersJSON);
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceSetLocalMute$media_engine_release(int i, String userId, boolean z) {
        C9612q.m13917h(userId, "userId");
        NativeConnection connection = getConnection(i, "setLocalMute");
        if (connection != null) {
            connection.setLocalMute(userId, z);
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceSetLocalPan$media_engine_release(int i, String userId, float f, float f2) {
        C9612q.m13917h(userId, "userId");
        NativeConnection connection = getConnection(i, "setLocalPan");
        if (connection != null) {
            connection.setLocalPan(userId, f, f2);
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceSetLocalVolume$media_engine_release(int i, String userId, float f) {
        C9612q.m13917h(userId, "userId");
        NativeConnection connection = getConnection(i, "setLocalVolume");
        if (connection != null) {
            connection.setLocalVolume(userId, f);
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceSetMinimumOutputDelay$media_engine_release(int i, int i2) {
        NativeConnection connection = getConnection(i, "setMinimumOutputDelay");
        if (connection != null) {
            connection.setMinimumOutputDelay(i2);
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceSetNoInputThreshold$media_engine_release(int i, float f) {
        NativeConnection connection = getConnection(i, "setNoInputThreshold");
        if (connection != null) {
            connection.setNoInputThreshold(f);
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceSetOnFirstFrameCallback$media_engine_release(int i, final Function3<? super String, ? super Long, ? super String, Unit> cb) {
        C9612q.m13917h(cb, "cb");
        NativeConnection connection = getConnection(i, "setOnFirstFrameCallback");
        if (connection != null) {
            connection.setOnFirstFrameCallback(new NativeConnection.OnFirstFrameCallback() { // from class: com.discord.media.engine.d
                @Override // com.discord.p047native.engine.NativeConnection.OnFirstFrameCallback
                public final void onFirstFrame(String str, long j, String str2) {
                    MediaEngine.connectionInstanceSetOnFirstFrameCallback$lambda$50(Function3.this, str, j, str2);
                }
            });
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceSetOnPingCallback$media_engine_release(int i, final Function4<? super Integer, ? super String, ? super Integer, ? super Integer, Unit> cb) {
        C9612q.m13917h(cb, "cb");
        NativeConnection connection = getConnection(i, "setOnPingCallback");
        if (connection != null) {
            connection.setOnPingCallback(new NativeConnection.OnPingCallback() { // from class: com.discord.media.engine.f
                @Override // com.discord.p047native.engine.NativeConnection.OnPingCallback
                public final void onPing(int i2, String str, int i3, int i4) {
                    MediaEngine.connectionInstanceSetOnPingCallback$lambda$48(Function4.this, i2, str, i3, i4);
                }
            });
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceSetOnPingTimeoutCallback$media_engine_release(int i, final Function4<? super String, ? super Integer, ? super Integer, ? super Integer, Unit> cb) {
        C9612q.m13917h(cb, "cb");
        NativeConnection connection = getConnection(i, "setOnPingTimeoutCallback");
        if (connection != null) {
            connection.setOnPingTimeoutCallback(new NativeConnection.OnPingTimeoutCallback() { // from class: com.discord.media.engine.k
                @Override // com.discord.p047native.engine.NativeConnection.OnPingTimeoutCallback
                public final void onPingTimeout(String str, int i2, int i3, int i4) {
                    MediaEngine.connectionInstanceSetOnPingTimeoutCallback$lambda$49(Function4.this, str, i2, i3, i4);
                }
            });
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceSetOnSpeakingCallback$media_engine_release(int i, final Function2<? super String, ? super Integer, Unit> cb) {
        C9612q.m13917h(cb, "cb");
        NativeConnection connection = getConnection(i, "setOnSpeakingCallback");
        if (connection != null) {
            connection.setOnSpeakingCallback(new NativeConnection.OnSpeakingCallback() { // from class: com.discord.media.engine.y
                @Override // com.discord.p047native.engine.NativeConnection.OnSpeakingCallback
                public final void onSpeaking(String str, int i2) {
                    MediaEngine.connectionInstanceSetOnSpeakingCallback$lambda$47(Function2.this, str, i2);
                }
            });
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceSetOnVideoCallback$media_engine_release(int i, final Function4<? super String, ? super Long, ? super String, ? super String, Unit> cb) {
        C9612q.m13917h(cb, "cb");
        NativeConnection connection = getConnection(i, "setOnVideoCallback");
        if (connection != null) {
            connection.setOnVideoCallback(new NativeConnection.OnVideoCallback() { // from class: com.discord.media.engine.c
                @Override // com.discord.p047native.engine.NativeConnection.OnVideoCallback
                public final void onVideo(String str, long j, String str2, String str3) {
                    MediaEngine.connectionInstanceSetOnVideoCallback$lambda$51(Function4.this, str, j, str2, str3);
                }
            });
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceSetPTTActive$media_engine_release(int i, boolean z, boolean z2) {
        NativeConnection connection = getConnection(i, "setPTTActive");
        if (connection != null) {
            connection.setPTTActive(z, z2);
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceSetPingInterval$media_engine_release(int i, int i2) {
        NativeConnection connection = getConnection(i, "setPingInterval");
        if (connection != null) {
            connection.setPingInterval(i2);
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceSetSelfDeafen$media_engine_release(int i, boolean z) {
        NativeConnection connection = getConnection(i, "setSelfDeafen");
        if (connection != null) {
            connection.setSelfDeafen(z);
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceSetSelfMute$media_engine_release(int i, boolean z) {
        NativeConnection connection = getConnection(i, "setSelfMute");
        if (connection != null) {
            connection.setSelfMute(z);
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceSetTransportOptions$media_engine_release(int i, String optionsJSON) {
        C9612q.m13917h(optionsJSON, "optionsJSON");
        NativeConnection connection = getConnection(i, "setTransportOptions");
        if (connection != null) {
            connection.setTransportOptions(optionsJSON);
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit connectionInstanceSetVideoBroadcast$media_engine_release(int i, boolean z) {
        NativeConnection connection = getConnection(i, "setVideoBroadcast");
        if (connection != null) {
            connection.setVideoBroadcast(z);
            return Unit.f25302a;
        }
        return null;
    }

    public final void connectionInstanceStartBroadcast$media_engine_release(int i, Intent permissions) {
        C9612q.m13917h(permissions, "permissions");
        NativeConnection connection = getConnection(i, "startBroadcast");
        if (connection != null) {
            forceStopScreenCapturer();
            ScreenCapturer screenCapturer = new ScreenCapturer(permissions);
            this.screenCapturer = new ScreenCapturerForConnection(screenCapturer, i);
            connection.startBroadcast(screenCapturer, screenCapturer.getSoundshare().getNativeInstance());
        }
    }

    public final void connectionInstanceStopBroadcast$media_engine_release(int i) {
        NativeConnection connection = getConnection(i, "stopBroadcast");
        if (connection != null) {
            connection.stopBroadcast();
        }
        stopScreenCapturerForConnection(i);
    }

    public final void connectionInstanceStopBroadcastWithError$media_engine_release(int i, int i2, String errorMessage) {
        C9612q.m13917h(errorMessage, "errorMessage");
        NativeConnection connection = getConnection(i, "stopBroadcastWithError");
        if (connection != null) {
            connection.stopBroadcast();
        }
        stopScreenCapturerForConnection(i);
    }

    public final void createSpeedTestConnection(int i, String userId, String connectionOptionsJSON, final Function2<? super String, ? super Map<String, ? extends Object>, Unit> callback) {
        C9612q.m13917h(userId, "userId");
        C9612q.m13917h(connectionOptionsJSON, "connectionOptionsJSON");
        C9612q.m13917h(callback, "callback");
        this.engineSpeedTestConnections.register(i, getEngine().createSpeedTestConnection(userId, connectionOptionsJSON, new NativeEngine.ConnectToServerCallback() { // from class: com.discord.media.engine.g
            @Override // com.discord.p047native.engine.NativeEngine.ConnectToServerCallback
            public final void onConnectToServer(ConnectionInfo connectionInfo, String str) {
                MediaEngine.createSpeedTestConnection$lambda$57(Function2.this, connectionInfo, str);
            }
        }));
    }

    public final void createVoiceConnection(int i, String userId, String connectionOptionsJSON, final Function2<? super String, ? super Map<String, ? extends Object>, Unit> callback) {
        C9612q.m13917h(userId, "userId");
        C9612q.m13917h(connectionOptionsJSON, "connectionOptionsJSON");
        C9612q.m13917h(callback, "callback");
        this.engineConnections.register(i, getEngine().createVoiceConnection(userId, connectionOptionsJSON, new NativeEngine.ConnectToServerCallback() { // from class: com.discord.media.engine.h
            @Override // com.discord.p047native.engine.NativeEngine.ConnectToServerCallback
            public final void onConnectToServer(ConnectionInfo connectionInfo, String str) {
                MediaEngine.createVoiceConnection$lambda$45(Function2.this, connectionInfo, str);
            }
        }));
    }

    public final void getAudioSubsystem$media_engine_release(Function2<? super String, ? super String, Unit> cb) {
        C9612q.m13917h(cb, "cb");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().getAudioSubsystem(new MediaEngine$getAudioSubsystem$1$1(cb));
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$getAudioSubsystem$$inlined$post$default$1(this, cb));
        }
    }

    public final void getCodecCapabilities$media_engine_release(final Function1<? super String, Unit> callback) {
        C9612q.m13917h(callback, "callback");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().getCodecCapabilities(new NativeEngine.GetCodecCapabilitiesCallback() { // from class: com.discord.media.engine.b
                @Override // com.discord.p047native.engine.NativeEngine.GetCodecCapabilitiesCallback
                public final void onCodecCapabilities(String str) {
                    MediaEngine.getCodecCapabilities$lambda$32$lambda$31(Function1.this, str);
                }
            });
        } else {
            callback.invoke("{}");
        }
    }

    public final void getCodecSurvey$media_engine_release(Function1<? super String, Unit> callback) {
        String str;
        List m14101l;
        String m14046d0;
        Object[] m14263o;
        Object[] m14263o2;
        boolean isHardwareAccelerated;
        boolean m13758H;
        C9612q.m13917h(callback, "callback");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            String[] strArr = new String[0];
            String[] strArr2 = new String[0];
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            C9612q.m13918g(codecInfos, "codecList.codecInfos");
            int length = codecInfos.length;
            int i2 = 0;
            while (i2 < length) {
                MediaCodecInfo mediaCodecInfo = codecInfos[i2];
                String name = mediaCodecInfo.getName();
                C9612q.m13918g(name, "codecInfo.name");
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                C9612q.m13918g(supportedTypes, "codecInfo.supportedTypes");
                ArrayList<String> arrayList = new ArrayList();
                int length2 = supportedTypes.length;
                int i3 = i;
                while (i3 < length2) {
                    String type = supportedTypes[i3];
                    C9612q.m13918g(type, "type");
                    MediaCodecInfo[] mediaCodecInfoArr = codecInfos;
                    int i4 = length;
                    m13758H = C9653o.m13758H(type, MediaStreamTrack.VIDEO_TRACK_KIND, false, 2, null);
                    if (m13758H) {
                        arrayList.add(type);
                    }
                    i3++;
                    codecInfos = mediaCodecInfoArr;
                    length = i4;
                }
                MediaCodecInfo[] mediaCodecInfoArr2 = codecInfos;
                int i5 = length;
                for (String str2 : arrayList) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                        if (isHardwareAccelerated) {
                            str = "(HW)";
                        } else {
                            str = "(SW)";
                        }
                    } else {
                        str = "";
                    }
                    m14101l = C9545j.m14101l(str2, name, str);
                    m14046d0 = C9553r.m14046d0(m14101l, " ", null, null, 0, null, null, 62, null);
                    if (mediaCodecInfo.isEncoder()) {
                        m14263o = C9536e.m14263o(strArr, m14046d0);
                        strArr = (String[]) m14263o;
                    } else {
                        m14263o2 = C9536e.m14263o(strArr2, m14046d0);
                        strArr2 = (String[]) m14263o2;
                    }
                }
                i2++;
                i = 0;
                codecInfos = mediaCodecInfoArr2;
                length = i5;
            }
            jSONObject.put("available_video_encoders", new JSONArray(strArr));
            jSONObject.put("available_video_decoders", new JSONArray(strArr2));
            String jSONObject2 = jSONObject.toString();
            C9612q.m13918g(jSONObject2, "codecJson.toString()");
            callback.invoke(jSONObject2);
            return;
        }
        callback.invoke("{}");
    }

    public final void getInputDevices$media_engine_release(final Function1<? super List<? extends Map<String, ? extends Object>>, Unit> callback) {
        List m14104i;
        C9612q.m13917h(callback, "callback");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().getInputDevices(new NativeEngine.GetAudioInputDevicesCallback() { // from class: com.discord.media.engine.o
                @Override // com.discord.p047native.engine.NativeEngine.GetAudioInputDevicesCallback
                public final void onDevices(AudioInputDeviceDescription[] audioInputDeviceDescriptionArr) {
                    MediaEngine.getInputDevices$lambda$10$lambda$9(Function1.this, audioInputDeviceDescriptionArr);
                }
            });
            return;
        }
        m14104i = C9545j.m14104i();
        callback.invoke(m14104i);
    }

    public final void getOutputDevices$media_engine_release(final Function1<? super List<? extends Map<String, ? extends Object>>, Unit> callback) {
        List m14104i;
        C9612q.m13917h(callback, "callback");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().getOutputDevices(new NativeEngine.GetAudioOutputDevicesCallback() { // from class: com.discord.media.engine.u
                @Override // com.discord.p047native.engine.NativeEngine.GetAudioOutputDevicesCallback
                public final void onDevices(AudioOutputDeviceDescription[] audioOutputDeviceDescriptionArr) {
                    MediaEngine.getOutputDevices$lambda$15$lambda$14(Function1.this, audioOutputDeviceDescriptionArr);
                }
            });
            return;
        }
        m14104i = C9545j.m14104i();
        callback.invoke(m14104i);
    }

    public final void getSupportedVideoCodecs$media_engine_release(final Function1<? super String[], Unit> callback) {
        C9612q.m13917h(callback, "callback");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().getSupportedVideoCodecs(new NativeEngine.GetSupportedVideoCodecsCallback() { // from class: com.discord.media.engine.t
                @Override // com.discord.p047native.engine.NativeEngine.GetSupportedVideoCodecsCallback
                public final void onSupportedVideoCodecs(String[] strArr) {
                    MediaEngine.getSupportedVideoCodecs$lambda$29$lambda$28(Function1.this, strArr);
                }
            });
        } else {
            callback.invoke(new String[0]);
        }
    }

    public final void getVideoInputDevices$media_engine_release(final Function1<? super List<? extends Map<String, ? extends Object>>, Unit> callback) {
        List m14104i;
        C9612q.m13917h(callback, "callback");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().getVideoInputDevices(new NativeEngine.GetVideoInputDevicesCallback() { // from class: com.discord.media.engine.s
                @Override // com.discord.p047native.engine.NativeEngine.GetVideoInputDevicesCallback
                public final void onDevices(VideoInputDeviceDescription[] videoInputDeviceDescriptionArr) {
                    MediaEngine.getVideoInputDevices$lambda$20$lambda$19(Function1.this, videoInputDeviceDescriptionArr);
                }
            });
            return;
        }
        m14104i = C9545j.m14104i();
        callback.invoke(m14104i);
    }

    public final void rankRtcRegions$media_engine_release(String regionsWithIpsJSON, final Function1<? super String[], Unit> callback) {
        C9612q.m13917h(regionsWithIpsJSON, "regionsWithIpsJSON");
        C9612q.m13917h(callback, "callback");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().rankRtcRegions(regionsWithIpsJSON, new NativeEngine.GetRankedRtcRegionsCallback() { // from class: com.discord.media.engine.p
                @Override // com.discord.p047native.engine.NativeEngine.GetRankedRtcRegionsCallback
                public final void onRankedRtcRegions(String[] strArr) {
                    MediaEngine.rankRtcRegions$lambda$38$lambda$37(Function1.this, strArr);
                }
            });
        } else {
            callback.invoke(new String[0]);
        }
    }

    public final void reset() {
        System.nanoTime();
        C9824m0.m13169f(this.coroutineScope, null, 1, null);
        this.dispatcher.reset();
        forceStopScreenCapturer();
        this.engineConnections.removeAndDisposeAll();
        NativeEngine nativeEngine = this.engineInstance;
        if (nativeEngine != null) {
            nativeEngine.dispose();
        }
        this.engineInstance = null;
        Debug debug = Debug.INSTANCE;
    }

    public final void setActiveSinksChangeCallback$media_engine_release(Function2<? super String, ? super Boolean, Unit> cb) {
        C9612q.m13917h(cb, "cb");
        AttachedVideoSinks.INSTANCE.setActiveSinksChangeCallback(cb);
    }

    public final void setAudioInputEnabled$media_engine_release(boolean z) {
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setAudioInputEnabled(z);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setAudioInputEnabled$$inlined$post$default$1(this, z));
        }
    }

    public final void setBroadcastThumbnailParams$media_engine_release(int i, int i2, int i3, Function1<? super String, Unit> callback) {
        C9612q.m13917h(callback, "callback");
        ScreenCapturerForConnection screenCapturerForConnection = this.screenCapturer;
        if (screenCapturerForConnection != null) {
            screenCapturerForConnection.component1().setThumbnailEmitter(new ThumbnailEmitter(i, i2, i3 * 1000, new MediaEngine$setBroadcastThumbnailParams$1$1(this, callback)));
        }
    }

    public final void setDeviceChangeCallback$media_engine_release(Function3<? super List<? extends Map<String, ? extends Object>>, ? super List<? extends Map<String, ? extends Object>>, ? super List<? extends Map<String, ? extends Object>>, Unit> callback) {
        C9612q.m13917h(callback, "callback");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setOnDeviceChangeCallback(new MediaEngine$setDeviceChangeCallback$1$1(callback));
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setDeviceChangeCallback$$inlined$post$default$1(this, callback));
        }
    }

    public final void setEmitVADLevel2$media_engine_release(boolean z) {
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setEmitVADLevel2(z);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setEmitVADLevel2$$inlined$post$default$1(this, z));
        }
    }

    public final void setHasFullbandPerformance$media_engine_release(boolean z) {
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setHasFullbandPerformance(z);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setHasFullbandPerformance$$inlined$post$default$1(this, z));
        }
    }

    public final void setInputDevice$media_engine_release(int i) {
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setInputDeviceIndex(i);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setInputDevice$$inlined$post$default$1(this, i));
        }
    }

    public final void setInputVolume$media_engine_release(float f) {
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setInputVolume(f);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setInputVolume$$inlined$post$default$1(this, f));
        }
    }

    public final void setNoInputThreshold$media_engine_release(float f) {
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setNoInputThreshold(f);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setNoInputThreshold$$inlined$post$default$1(this, f));
        }
    }

    public final void setOnNoInputCallback$media_engine_release(Function1<? super Boolean, Unit> cb) {
        C9612q.m13917h(cb, "cb");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setOnNoInputCallback(new MediaEngine$setOnNoInputCallback$1$1(cb));
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setOnNoInputCallback$$inlined$post$default$1(this, cb));
        }
    }

    public final void setOnVoiceCallback$media_engine_release(Function2<? super Float, ? super Integer, Unit> cb) {
        C9612q.m13917h(cb, "cb");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setOnVoiceCallback(new MediaEngine$setOnVoiceCallback$1$1(cb));
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setOnVoiceCallback$$inlined$post$default$1(this, cb));
        }
    }

    public final void setOutputDevice$media_engine_release(int i) {
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setOutputDeviceIndex(i);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setOutputDevice$$inlined$post$default$1(this, i));
        }
    }

    public final void setOutputVolume$media_engine_release(float f) {
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setOutputVolume(f);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setOutputVolume$$inlined$post$default$1(this, f));
        }
    }

    public final void setTransportOptions$media_engine_release(String optionsJSON) {
        C9612q.m13917h(optionsJSON, "optionsJSON");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setTransportOptions(optionsJSON);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setTransportOptions$$inlined$post$default$1(this, optionsJSON));
        }
    }

    public final void setVideoInputDevice$media_engine_release(String deviceName) {
        C9612q.m13917h(deviceName, "deviceName");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setVideoInputDevice(deviceName);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setVideoInputDevice$$inlined$post$default$1(this, deviceName));
        }
    }

    public final void setVideoOutputSink$media_engine_release(String streamIdentifier, Function1<? super VideoFrame, Boolean> function1) {
        C9612q.m13917h(streamIdentifier, "streamIdentifier");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        if (asyncInitDispatcher.getInitialized()) {
            if (function1 == null) {
                getEngine().setVideoOutputSink(streamIdentifier, null);
                return;
            } else {
                getEngine().setVideoOutputSink(streamIdentifier, new MediaEngine$setVideoOutputSink$1$1(function1));
                return;
            }
        }
        asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setVideoOutputSink$$inlined$post$1(function1, this, streamIdentifier));
    }

    public final void speedTestConnectionInstanceDestroy$media_engine_release(int i) {
        this.engineSpeedTestConnections.removeAndDispose(i);
    }

    /* renamed from: speedTestConnectionInstanceGetEncryptionModes$media_engine_release */
    public final Unit m31886xbe1ad786(int i, final Function1<? super String[], Unit> callback) {
        C9612q.m13917h(callback, "callback");
        NativeSpeedTestConnection speedTestConnection = getSpeedTestConnection(i, "getEncryptionModes");
        if (speedTestConnection != null) {
            speedTestConnection.getEncryptionModes(new NativeSpeedTestConnection.GetEncryptionModesCallback() { // from class: com.discord.media.engine.e
                @Override // com.discord.p047native.engine.NativeSpeedTestConnection.GetEncryptionModesCallback
                public final void onEncryptionModes(String[] strArr) {
                    MediaEngine.speedTestConnectionInstanceGetEncryptionModes$lambda$61(Function1.this, strArr);
                }
            });
            return Unit.f25302a;
        }
        return null;
    }

    /* renamed from: speedTestConnectionInstanceGetNetworkOverhead$media_engine_release */
    public final Unit m31885x85215b11(int i, final Function1<? super Integer, Unit> callback) {
        C9612q.m13917h(callback, "callback");
        NativeSpeedTestConnection speedTestConnection = getSpeedTestConnection(i, "getNetworkOverhead");
        if (speedTestConnection != null) {
            speedTestConnection.getNetworkOverhead(new NativeSpeedTestConnection.GetNetworkOverheadCallback() { // from class: com.discord.media.engine.l
                @Override // com.discord.p047native.engine.NativeSpeedTestConnection.GetNetworkOverheadCallback
                public final void onNetworkOverhead(int i2) {
                    MediaEngine.speedTestConnectionInstanceGetNetworkOverhead$lambda$62(Function1.this, i2);
                }
            });
            return Unit.f25302a;
        }
        return null;
    }

    /* renamed from: speedTestConnectionInstanceSetOnPingCallback$media_engine_release */
    public final Unit m31884x6d509b9d(int i, final Function4<? super Integer, ? super String, ? super Integer, ? super Integer, Unit> cb) {
        C9612q.m13917h(cb, "cb");
        NativeSpeedTestConnection speedTestConnection = getSpeedTestConnection(i, "setOnPingCallback");
        if (speedTestConnection != null) {
            speedTestConnection.setOnPingCallback(new NativeSpeedTestConnection.OnPingCallback() { // from class: com.discord.media.engine.v
                @Override // com.discord.p047native.engine.NativeSpeedTestConnection.OnPingCallback
                public final void onPing(int i2, String str, int i3, int i4) {
                    MediaEngine.speedTestConnectionInstanceSetOnPingCallback$lambda$59(Function4.this, i2, str, i3, i4);
                }
            });
            return Unit.f25302a;
        }
        return null;
    }

    /* renamed from: speedTestConnectionInstanceSetOnPingTimeoutCallback$media_engine_release */
    public final Unit m31883xa1587fea(int i, final Function4<? super String, ? super Integer, ? super Integer, ? super Integer, Unit> cb) {
        C9612q.m13917h(cb, "cb");
        NativeSpeedTestConnection speedTestConnection = getSpeedTestConnection(i, "setOnPingTimeoutCallback");
        if (speedTestConnection != null) {
            speedTestConnection.setOnPingTimeoutCallback(new NativeSpeedTestConnection.OnPingTimeoutCallback() { // from class: com.discord.media.engine.x
                @Override // com.discord.p047native.engine.NativeSpeedTestConnection.OnPingTimeoutCallback
                public final void onPingTimeout(String str, int i2, int i3, int i4) {
                    MediaEngine.speedTestConnectionInstanceSetOnPingTimeoutCallback$lambda$60(Function4.this, str, i2, i3, i4);
                }
            });
            return Unit.f25302a;
        }
        return null;
    }

    public final Unit speedTestConnectionInstanceSetPingInterval$media_engine_release(int i, int i2) {
        NativeSpeedTestConnection speedTestConnection = getSpeedTestConnection(i, "setPingInterval");
        if (speedTestConnection != null) {
            speedTestConnection.setPingInterval(i2);
            return Unit.f25302a;
        }
        return null;
    }

    /* renamed from: speedTestConnectionInstanceSetTransportOptions$media_engine_release */
    public final Unit m31882x61bcaa9e(int i, String optionsJSON) {
        C9612q.m13917h(optionsJSON, "optionsJSON");
        NativeSpeedTestConnection speedTestConnection = getSpeedTestConnection(i, "setTransportOptions");
        if (speedTestConnection != null) {
            speedTestConnection.setTransportOptions(optionsJSON);
            return Unit.f25302a;
        }
        return null;
    }

    /* renamed from: speedTestConnectionInstanceStartSpeedTestReceiver$media_engine_release */
    public final Unit m31881xbe00c5d7(int i, String optionsJSON, final Function0<Unit> callback) {
        C9612q.m13917h(optionsJSON, "optionsJSON");
        C9612q.m13917h(callback, "callback");
        NativeSpeedTestConnection speedTestConnection = getSpeedTestConnection(i, "startSpeedTestReceiver");
        if (speedTestConnection != null) {
            speedTestConnection.startSpeedTestReceiver(optionsJSON, new NativeSpeedTestConnection.StartSpeedTestReceiverCallback() { // from class: com.discord.media.engine.w
                @Override // com.discord.p047native.engine.NativeSpeedTestConnection.StartSpeedTestReceiverCallback
                public final void onReady() {
                    MediaEngine.speedTestConnectionInstanceStartSpeedTestReceiver$lambda$64(Function0.this);
                }
            });
            return Unit.f25302a;
        }
        return null;
    }

    /* renamed from: speedTestConnectionInstanceStartSpeedTestSender$media_engine_release */
    public final Unit m31880xdd2d891(int i, String optionsJSON, final Function2<? super Integer, ? super String, Unit> callback) {
        C9612q.m13917h(optionsJSON, "optionsJSON");
        C9612q.m13917h(callback, "callback");
        NativeSpeedTestConnection speedTestConnection = getSpeedTestConnection(i, "startSpeedTestSender");
        if (speedTestConnection != null) {
            speedTestConnection.startSpeedTestSender(optionsJSON, new NativeSpeedTestConnection.StartSpeedTestSenderCallback() { // from class: com.discord.media.engine.a
                @Override // com.discord.p047native.engine.NativeSpeedTestConnection.StartSpeedTestSenderCallback
                public final void onDone(int i2, String str) {
                    MediaEngine.speedTestConnectionInstanceStartSpeedTestSender$lambda$63(Function2.this, i2, str);
                }
            });
            return Unit.f25302a;
        }
        return null;
    }

    /* renamed from: speedTestConnectionInstanceStopSpeedTestReceiver$media_engine_release */
    public final Unit m31879x8100080f(int i, final Function2<? super Integer, ? super String, Unit> callback) {
        C9612q.m13917h(callback, "callback");
        NativeSpeedTestConnection speedTestConnection = getSpeedTestConnection(i, "stopSpeedTestReceiver");
        if (speedTestConnection != null) {
            speedTestConnection.stopSpeedTestReceiver(new NativeSpeedTestConnection.StopSpeedTestReceiverCallback() { // from class: com.discord.media.engine.m
                @Override // com.discord.p047native.engine.NativeSpeedTestConnection.StopSpeedTestReceiverCallback
                public final void onResults(int i2, String str) {
                    MediaEngine.speedTestConnectionInstanceStopSpeedTestReceiver$lambda$65(Function2.this, i2, str);
                }
            });
            return Unit.f25302a;
        }
        return null;
    }

    /* renamed from: speedTestConnectionInstanceStopSpeedTestSender$media_engine_release */
    public final Unit m31878x5dad48c9(int i) {
        NativeSpeedTestConnection speedTestConnection = getSpeedTestConnection(i, "stopSpeedTestSender");
        if (speedTestConnection != null) {
            speedTestConnection.stopSpeedTestSender();
            return Unit.f25302a;
        }
        return null;
    }

    public final void startLocalAudioRecording$media_engine_release(String optionsJSON, final Function1<? super Boolean, Unit> callback) {
        C9612q.m13917h(optionsJSON, "optionsJSON");
        C9612q.m13917h(callback, "callback");
        getEngine().startLocalAudioRecording(optionsJSON, new NativeEngine.StartLocalAudioRecordingCallback() { // from class: com.discord.media.engine.j
            @Override // com.discord.p047native.engine.NativeEngine.StartLocalAudioRecordingCallback
            public final void onStartLocalAudioRecording(boolean z) {
                MediaEngine.startLocalAudioRecording$lambda$40(Function1.this, z);
            }
        });
    }

    public final void stopLocalAudioRecording$media_engine_release(final Function2<? super String, ? super Integer, Unit> callback) {
        C9612q.m13917h(callback, "callback");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().stopLocalAudioRecording(new NativeEngine.StopLocalAudioRecordingCallback() { // from class: com.discord.media.engine.n
                @Override // com.discord.p047native.engine.NativeEngine.StopLocalAudioRecordingCallback
                public final void onStopLocalAudioRecording(String str, int i) {
                    MediaEngine.stopLocalAudioRecording$lambda$42$lambda$41(Function2.this, str, i);
                }
            });
        } else {
            callback.invoke("", 0);
        }
    }

    public final void setInputDevice$media_engine_release(String deviceIndex) {
        C9612q.m13917h(deviceIndex, "deviceIndex");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setInputDevice(deviceIndex);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setInputDevice$$inlined$post$default$2(this, deviceIndex));
        }
    }

    public final void setOutputDevice$media_engine_release(String deviceIndex) {
        C9612q.m13917h(deviceIndex, "deviceIndex");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setOutputDevice(deviceIndex);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setOutputDevice$$inlined$post$default$2(this, deviceIndex));
        }
    }

    public final void setVideoInputDevice$media_engine_release(int i) {
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setVideoInputDeviceIndex(i);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setVideoInputDevice$$inlined$post$default$2(this, i));
        }
    }

    public /* synthetic */ MediaEngine(Context context, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? C9677b1.m13570a() : coroutineDispatcher);
    }
}