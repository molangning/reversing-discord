package com.discord.friend_finder;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9536e;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import p467zf.C14180c;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\u0018\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005J \u0010\r\u001a\u0004\u0018\u00010\u0005*\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0005*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005H\u0002¨\u0006\u0014"}, m14357d2 = {"Lcom/discord/friend_finder/FriendFinderProvider;", "", "()V", "fetchContacts", "", "", "Lcom/discord/friend_finder/ContactsDataEntry;", "context", "Landroid/content/Context;", "getContactName", "Lcom/discord/friend_finder/ContactNameEntry;", "contactId", "getImageForContactId", "asBase64BitmapString", "Landroid/net/Uri;", "quality", "", "getColumnString", "Landroid/database/Cursor;", "columnName", "friend_finder_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class FriendFinderProvider {
    public static final FriendFinderProvider INSTANCE = new FriendFinderProvider();

    private FriendFinderProvider() {
    }

    private final String asBase64BitmapString(Uri uri, Context context, int i) {
        String str;
        AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor == null) {
            return null;
        }
        try {
            FileDescriptor fileDescriptor = openAssetFileDescriptor.getFileDescriptor();
            if (fileDescriptor != null) {
                Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                decodeFileDescriptor.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
                str = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            } else {
                str = null;
            }
            C14180c.m514a(openAssetFileDescriptor, null);
            return str;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C14180c.m514a(openAssetFileDescriptor, th2);
                throw th3;
            }
        }
    }

    static /* synthetic */ String asBase64BitmapString$default(FriendFinderProvider friendFinderProvider, Uri uri, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 100;
        }
        return friendFinderProvider.asBase64BitmapString(uri, context, i);
    }

    private final String getColumnString(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    private final ContactNameEntry getContactName(Context context, String str) {
        boolean z;
        Cursor query = context.getContentResolver().query(ContactsContract.Data.CONTENT_URI, null, "mimetype = ? AND contact_id = " + str, new String[]{"vnd.android.cursor.item/name"}, null);
        String str2 = null;
        if (query == null) {
            return null;
        }
        String str3 = null;
        while (query.moveToNext()) {
            try {
                str2 = getColumnString(query, "data2");
            } catch (Exception unused) {
            }
            try {
                str3 = getColumnString(query, "data3");
            } catch (Exception unused2) {
            }
            boolean z2 = false;
            if (str2 != null && str2.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                break;
            }
            if (str3 == null || str3.length() == 0) {
                z2 = true;
                continue;
            }
            if (!z2) {
                break;
            }
        }
        query.close();
        return new ContactNameEntry(str2, str3);
    }

    public final Map<String, ContactsDataEntry> fetchContacts(Context context) {
        String str;
        String str2;
        boolean z;
        boolean m13754t;
        C9612q.m13917h(context, "context");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Cursor query = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"_id", "data4", "display_name", "photo_file_id", "contact_id", "data2"}, null, null, null);
        if (query == null) {
            return linkedHashMap;
        }
        while (query.moveToNext()) {
            String columnString = getColumnString(query, "display_name");
            String columnString2 = getColumnString(query, "data4");
            String columnString3 = getColumnString(query, "contact_id");
            if (columnString2 != null && columnString3 != null) {
                String str3 = "";
                try {
                    str = context.getResources().getString(ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(query.getInt(query.getColumnIndexOrThrow("data2"))));
                    C9612q.m13918g(str, "context.getResources().g…tTypeLabelResource(type))");
                    try {
                        m13754t = C9653o.m13754t(str, "Custom", true);
                    } catch (Exception unused) {
                        str3 = str;
                    }
                } catch (Exception unused2) {
                }
                if (m13754t) {
                    str3 = query.getString(query.getColumnIndexOrThrow("data3"));
                    C9612q.m13918g(str3, "phoneCursor.getString(ph…onDataKinds.Phone.LABEL))");
                    str = str3;
                }
                ContactNameEntry contactName = getContactName(context, columnString3);
                String str4 = null;
                if (contactName != null) {
                    str2 = contactName.getGivenName();
                } else {
                    str2 = null;
                }
                if (contactName != null) {
                    str4 = contactName.getFamilyName();
                }
                ContactName contactName2 = new ContactName(columnString, str2, str4);
                if (getColumnString(query, "photo_file_id") != null) {
                    z = true;
                } else {
                    z = false;
                }
                ContactsDataEntry contactsDataEntry = (ContactsDataEntry) linkedHashMap.get(columnString2);
                if (contactsDataEntry != null) {
                    C9536e.m14263o(contactsDataEntry.getContactNames(), contactName2);
                    if (z) {
                        contactsDataEntry.setHasImageData(true);
                    }
                    C9536e.m14263o(contactsDataEntry.getDeviceContactIds(), columnString3);
                    linkedHashMap.put(columnString2, contactsDataEntry);
                } else {
                    linkedHashMap.put(columnString2, new ContactsDataEntry(columnString2, str, "phone", new ContactName[]{contactName2}, z, new String[]{columnString3}));
                }
            }
        }
        query.close();
        return linkedHashMap;
    }

    public final String getImageForContactId(Context context, String contactId) {
        String str;
        Uri parse;
        C9612q.m13917h(context, "context");
        C9612q.m13917h(contactId, "contactId");
        Cursor query = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"contact_id", "photo_thumb_uri"}, "contact_id = ?", new String[]{contactId}, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() > 0) {
                query.moveToFirst();
                FriendFinderProvider friendFinderProvider = INSTANCE;
                String columnString = friendFinderProvider.getColumnString(query, "photo_thumb_uri");
                if (columnString != null && (parse = Uri.parse(columnString)) != null) {
                    C9612q.m13918g(parse, "parse(it)");
                    str = asBase64BitmapString$default(friendFinderProvider, parse, context, 0, 2, null);
                    C14180c.m514a(query, null);
                    return str;
                }
            }
            str = null;
            C14180c.m514a(query, null);
            return str;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C14180c.m514a(query, th2);
                throw th3;
            }
        }
    }
}
