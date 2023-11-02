package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class FirebaseMessagingService extends EnhancedIntentService {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (queue.contains(str)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received duplicate message: " + str);
                return true;
            }
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C5083f0.m26253t(extras)) {
            C5083f0 c5083f0 = new C5083f0(extras);
            ExecutorService m26208c = C5098m.m26208c();
            try {
                if (new C5076d(this, c5083f0, m26208c).m26313a()) {
                    return;
                }
                m26208c.shutdown();
                if (C5077d0.m26308A(intent)) {
                    C5077d0.m26287t(intent);
                }
            } finally {
                m26208c.shutdown();
            }
        }
        onMessageReceived(new RemoteMessage(extras));
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return intent.getStringExtra("message_id");
        }
        return stringExtra;
    }

    private void handleMessageIntent(Intent intent) {
        if (!alreadyReceivedMessage(intent.getStringExtra("google.message_id"))) {
            passMessageIntentToSdk(intent);
        }
    }

    private void passMessageIntentToSdk(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        char c = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                onDeletedMessages();
                return;
            case 1:
                C5077d0.m26285v(intent);
                dispatchMessage(intent);
                return;
            case 2:
                onSendError(getMessageId(intent), new C5106p0(intent.getStringExtra("error")));
                return;
            case 3:
                onMessageSent(intent.getStringExtra("google.message_id"));
                return;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                return;
        }
    }

    static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    protected Intent getStartCommandIntent(Intent intent) {
        return C5108q0.m26194b().m26193c();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (!ACTION_REMOTE_INTENT.equals(action) && !ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            if (ACTION_NEW_TOKEN.equals(action)) {
                onNewToken(intent.getStringExtra(EXTRA_TOKEN));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        handleMessageIntent(intent);
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }
}
