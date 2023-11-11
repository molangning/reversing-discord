r6 = 5057;
r5 = [5, 5058, 2201, 5364, 660, 688, 5251, 5243, 5365, 2];
r5 = r8.bind(r2)(r7, r6, r5);
r8 = r0.__d; // defines some constants, not important?
// Lobotomy
r7 = function(a0, a1, a2, a3, a4, a5, a6) { // Environment: r3
    r2 = a1;
    r4 = a5;
    r3 = a6;
    var _closure1_slot0 = r2;
    var _closure1_slot1 = r3;
    r0 = function(a0) { // Original name: _createSuper, environment: r5
        r1 = a0;
        var _closure2_slot0 = r1;
        r2 = function() { // Original name: _isNativeReflectConstruct, environment: r0
            _fun51908: for(var _fun51908_ip = 0; ; ) switch(_fun51908_ip) {
                case 0:
                    r0 = global;
                    r1 = r0.Reflect;
                    r2 = 'undefined';
                    r1 = typeof r1;
                    if(!(r2 !== r1)) { _fun51908_ip = 149; continue _fun51908 } // if the Reflect namespace object does not exist the code return false
                case 21:
                    r1 = r0.Reflect;
                    r1 = r1.construct;
                    if(!r1) { _fun51908_ip = 149; continue _fun51908 } // if Reflect.construct function does not exist return false
                case 35:
                    r1 = r0.Reflect;
                    r1 = r1.construct;
                    r1 = r1.sham; // https://github.com/babel/babel/discussions/14074
                    if(r1) { _fun51908_ip = 145; continue _fun51908 } // return false if sham is definded for some reason? idk this help me out
                case 54:
                    r1 = r0.Proxy;
                    r2 = 'function';
                    r1 = typeof r1;
                    if(!(r2 !== r1)) { _fun51908_ip = 141; continue _fun51908 } // return true if global.Proxy is not a function
                case 70: // try_start_0
                    r1 = r0.Boolean;
                    r1 = r1.prototype; // global.Boolean.prototype
                    r2 = r1.valueOf; // global.Boolean.prototype.valueOf
                    r1 = r2.call; // global.Boolean.prototype.valueOf.call
                    r6 = r0.Reflect; // global.Reflect
                    r5 = r6.construct; // global.Reflect.construct
                    r4 = r0.Boolean; // global.Boolean
                    r3 = new Array(0); // r3 = []
                    r0 = function() { // Environment: r0
                        r0 = undefined;
                        return r0;
                    };
                    r0 = r5.bind(r6)(r4, r3, r0); // global.Reflect.construct(r4, r3, r0)
                    r0 = r1.bind(r2)(r0);
                case 131: // try_end0
                    r0 = true;
                    return r0; // return if works
                case 135: // catch_target0
                    CatchBlockStart(arg_register=0);
                    r0 = false;
                    return r0;
                case 141:
                    r0 = true;
                    return r0;
                case 145:
                    r0 = false;
                    return r0;
                case 149: // mr carbon copy of 145
                    r0 = false;
                    return r0;
            }
        };
        r1 = undefined;
        r1 = r2.bind(r1)();
        var _closure2_slot1 = r1;
        r0 = function() { // Environment: r0
            _fun51910: for(var _fun51910_ip = 0; ; ) switch(_fun51910_ip) {
                case 0:
                    r3 = this;
                    r2 = undefined;
                    r4 = undefined;
                    r1 = _closure1_slot6;
                    r6 = r1.default;
                    r5 = _closure2_slot0;
                    r8 = r6.bind(r2)(r5);
                    r1 = _closure2_slot1;
                    if(r1) { _fun51910_ip = 55; continue _fun51910 }
                case 37:
                    r5 = r8.apply;
                    r4 = arguments;
                    r1 = r4;
                    r1 = r5.bind(r8)(r3, r1);
                    _fun51910_ip = 96; continue _fun51910;
                case 55:
                    r5 = _closure1_slot6;
                    r5 = r5.default;
                    r5 = r5.bind(r2)(r3);
                    r7 = r5.constructor;
                    r5 = global;
                    r6 = r5.Reflect;
                    r5 = r6.construct;
                    r4 = arguments;
                    r1 = r5.bind(r6)(r8, r4, r7);
                case 96:
                    r0 = _closure1_slot5;
                    r0 = r0.default;
                    r0 = r0.bind(r2)(r3, r1);
                    return r0;
            }
        };
        return r0;
    };
    var _closure1_slot29 = r0;
    r0 = function(a0) { // Original name: transformInviteSuggestion, environment: r5
        _fun51911: for(var _fun51911_ip = 0; ; ) switch(_fun51911_ip) {
            case 0:
                r6 = undefined;
                r1 = _closure1_slot9;
                r3 = r1.default;
                r2 = a0;
                r1 = 4;
                r5 = r3.bind(r6)(r2, r1);
                r1 = 0;
                r4 = r5[r1];
                r1 = 1;
                r3 = r5[r1];
                r1 = 2;
                r2 = r5[r1];
                r1 = 3;
                r1 = r5[r1];
                r5 = _closure1_slot19;
                r5 = r5.ContactVisibility;
                r5 = r5.NEVER_AND_HIDE_CONTACT_ID;
                if(!(r2 === r5)) { _fun51911_ip = 122; continue _fun51911 }
            case 73:
                r0 = _closure1_slot28;
                r0 = r0.storedContacts;
                r5 = r0[r4];
                r0 = null;
                r6 = undefined;
                if(!(r0 != r5)) { _fun51911_ip = 101; continue _fun51911 }
            case 95:
                r6 = r5.deviceContactIds;
            case 101:
                if(!(r0 != r6)) { _fun51911_ip = 122; continue _fun51911 }
            case 105:
                r5 = r6.forEach;
                r0 = function(a0) { // Environment: r0
                    r0 = _closure1_slot28;
                    r1 = r0.storedContactsByDeviceId;
                    r0 = a0;
                    r2 = r1[r0];
                    r1 = r2.forEach;
                    r0 = function(a0) { // Environment: r0
                        r0 = _closure1_slot28;
                        r2 = r0.hiddenContactMethods;
                        r1 = r2.add;
                        r0 = a0;
                        r0 = r1.bind(r2)(r0);
                        r0 = undefined;
                        return r0;
                    };
                    r0 = r1.bind(r2)(r0);
                    r0 = undefined;
                    return r0;
                };
                r0 = r5.bind(r6)(r0);
            case 122:
                r0 = {};
                r0['contactMethod'] = r4;
                r0['contactsCount'] = r3;
                r0['visibility'] = r2;
                r0['inviteSlug'] = r1;
                return r0;
        }
    };
    var _closure1_slot30 = r0;
    r0 = function(a0) { // Original name: transformPersonYouMayKnow, environment: r5
        r0 = a0;
        r1 = _closure1_slot15;
        r3 = r1.default;
        r4 = r0.user;
        r2 = r3.prototype;
        r2 = Object.create(r2, {constructor: {value: r3}});
        r5 = r2;
        r1 = new r5[r3](r4, r3);
        r3 = r1 instanceof Object ? r1 : r2;
        r2 = r0.friend_suggestion_name;
        r1 = r0.mutual_friends_count;
        r0 = {};
        r0['user'] = r3;
        r0['friendSuggestionName'] = r2;
        r0['mutualFriendsCount'] = r1;
        return r0;
    };
    var _closure1_slot31 = r0;
    r0 = function(a0) { // Original name: formatRequestModifiedContactsData, environment: r5
        r4 = a0;
        r2 = function(a0) { // Original name: limitContactMethods, environment: r1
            _fun51916: for(var _fun51916_ip = 0; ; ) switch(_fun51916_ip) {
                case 0:
                    r6 = 0;
                    r4 = {};
                    var _closure3_slot0 = r4;
                    r2 = global;
                    r1 = r2.Set;
                    r3 = r1.prototype;
                    r3 = Object.create(r3, {constructor: {value: r1}});
                    r9 = r3;
                    r1 = new r9[r1](r8);
                    r1 = r1 instanceof Object ? r1 : r3;
                    r7 = r2.Object;
                    r5 = r7.values;
                    r3 = a0;
                    r7 = r5.bind(r7)(r3);
                    r5 = r7.forEach;
                    r3 = function(a0) { // Environment: r0
                        r1 = a0;
                        var _closure4_slot0 = r1;
                        r2 = r1.deviceContactIds;
                        r1 = r2.forEach;
                        r0 = function(a0) { // Environment: r0
                            _fun51918: for(var _fun51918_ip = 0; ; ) switch(_fun51918_ip) {
                                case 0:
                                    r2 = a0;
                                    r1 = _closure3_slot0;
                                    r3 = r1[r2];
                                    r1 = null;
                                    if(!(r1 != r3)) { _fun51918_ip = 53; continue _fun51918 }
                                case 20:
                                    r1 = _closure3_slot0;
                                    r4 = r1[r2];
                                    r3 = r4.push;
                                    r1 = _closure4_slot0;
                                    r1 = r1.contactMethod;
                                    r1 = r3.bind(r4)(r1);
                                    _fun51918_ip = 82; continue _fun51918;
                                case 53:
                                    r1 = _closure3_slot0;
                                    r0 = _closure4_slot0;
                                    r3 = r0.contactMethod;
                                    r0 = new Array(1);
                                    r0[0] = r3;
                                    r1[r2] = r0;
                                case 82:
                                    r0 = undefined;
                                    return r0;
                            }
                        };
                        r0 = r1.bind(r2)(r0);
                        r0 = undefined;
                        return r0;
                    };
                    r3 = r5.bind(r7)(r3);
                    r3 = r2.Object;
                    r2 = r3.keys;
                    r3 = r2.bind(r3)(r4);
                    r2 = r3.sort;
                    r5 = r2.bind(r3)();
                    r2 = r5.length;
                    if(!(!(r6 < r2))) { _fun51916_ip = 113; continue _fun51916 }
                case 107:
                    var _closure3_slot1 = r1;
                    _fun51916_ip = 197; continue _fun51916;
                case 113:
                    r3 = r1.size;
                    r2 = _closure1_slot24;
                    if(!(!(r3 >= r2))) { _fun51916_ip = 193; continue _fun51916 }
                case 129:
                    _closure3_slot1 = r1;
                    r6 = 0;
                case 135:
                    r3 = r5[r6];
                    r2 = _closure3_slot0;
                    r7 = r2[r3];
                    r3 = r7.forEach;
                    r2 = function(a0) { // Environment: r0
                        _fun51919: for(var _fun51919_ip = 0; ; ) switch(_fun51919_ip) {
                            case 0:
                                r1 = _closure3_slot1;
                                r2 = r1.size;
                                r1 = _closure1_slot24;
                                if(!(r2 < r1)) { _fun51919_ip = 40; continue _fun51919 }
                            case 23:
                                r2 = _closure3_slot1;
                                r1 = r2.add;
                                r0 = a0;
                                r0 = r1.bind(r2)(r0);
                            case 40:
                                r0 = undefined;
                                return r0;
                        }
                    };
                    r2 = r3.bind(r7)(r2);
                    r6 = r6 + 1;
                    r2 = r5.length;
                    if(!(r6 < r2)) { _fun51916_ip = 197; continue _fun51916 }
                case 174:
                    r2 = _closure3_slot1;
                    r3 = r2.size;
                    r2 = _closure1_slot24;
                    if(!(!(r3 >= r2))) { _fun51916_ip = 197; continue _fun51916 }
                case 191:
                    _fun51916_ip = 135; continue _fun51916;
                case 193:
                    _closure3_slot1 = r1;
                case 197:
                    r0 = _closure3_slot1;
                    return r0;
            }
        };
        r0 = undefined;
        r0 = r2.bind(r0)(r4);
        var _closure2_slot0 = r0;
        r0 = {};
        var _closure2_slot1 = r0;
        r2 = global;
        r3 = r2.Object;
        r2 = r3.values;
        r3 = r2.bind(r3)(r4);
        r2 = r3.forEach;
        r1 = function(a0) { // Environment: r1
            _fun51920: for(var _fun51920_ip = 0; ; ) switch(_fun51920_ip) {
                case 0:
                    r0 = a0;
                    r4 = _closure2_slot0;
                    r3 = r4.has;
                    r2 = r0.contactMethod;
                    r2 = r3.bind(r4)(r2);
                    if(!r2) { _fun51920_ip = 148; continue _fun51920 }
                case 29:
                    r5 = r0.contactNames;
                    r4 = r5.slice; // r0.contactNames.slice
                    r3 = 0;
                    r2 = 4;
                    r4 = r4.bind(r5)(r3, r2); // r0.contactNames.slice(0,4)  
                    r3 = r4.map; 
                    // Bookmark-friend-finder
                    r2 = function(a0) { // Environment: r2
                        _fun51921: for(var _fun51921_ip = 0; ; ) switch(_fun51921_ip) {
                            case 0:
                                r1 = a0;
                                r0 = r1.givenName;
                                r2 = null;
                                // if givenName null go to 15 else 25
                                if(!(r2 == r0)) { _fun51921_ip = 25; continue _fun51921 }
                            case 15:
                                r0 = '';
                                r1['givenName'] = r0;
                            case 25:
                                r0 = r1.familyName;
                                // if familyName null go to 35 else 45
                                if(!(r2 == r0)) { _fun51921_ip = 45; continue _fun51921 }
                            case 35:
                                r0 = '';
                                r1['familyName'] = r0;
                            case 45:
                                r2 = r1.givenName;
                                r0 = r2.substring;
                                r4 = 0;
                                r3 = 30; 
                                r2 = r0.bind(r2)(r4, r3); // limit 30 chars
                                r0 = new Array(2);
                                r0[0] = r2;
                                r2 = r1.familyName;
                                r1 = r2.substring;
                                r1 = r1.bind(r2)(r4, r3); // limit 30 chars
                                // familyName and givenName both get 30 chars
                                r0[1] = r1; // [givenName, familyName]
                                return r0; // returns an array of size two
                        }
                    };
                    r7 = r3.bind(r4)(r2);
                    r2 = _closure2_slot1;
                    r1 = r0.contactMethod;
                    r3 = global;
                    r3 = r3.Number; // global.Number
                    r0 = r0.hasImageData; // a0.hasImageData
                    r6 = undefined;
                    r0 = r3.bind(r6)(r0);
                    r4 = new Array(1);
                    r4[0] = r0;
                    r3 = r4.concat;
                    r0 = _closure1_slot8;
                    r5 = r0.default;
                    r0 = r7.flat; 
                    // DISCORDDDDDD WHYYYYY
                    // Also it flatens our size two array
                    r0 = r0.bind(r7)(); 
                    r0 = r5.bind(r6)(r0);
                    r0 = r3.bind(r4)(r0); // merges r4 and r0 into one
                    r2[r1] = r0;
                case 148: 
                    r0 = undefined;
                    return r0;
            }
        };
        r1 = r2.bind(r3)(r1); // foreach
        return r0;
    };
    // End function formatRequestModifiedContactsData

    var _closure1_slot32 = r0;
    r1 = function() { // Original name: pullFriendFinderData, environment: r5
        r0 = undefined;
        r3 = _closure1_slot34;
        r2 = r3.apply;
        r0 = arguments;
        r1 = r0;
        r0 = this;
        r0 = r2.bind(r3)(r0, r1);
        return r0;
    };
    var _closure1_slot33 = r1;
    r0 = function() { // Original name: _pullFriendFinderData, environment: r5
        r4 = undefined;
        r0 = undefined;
        r2 = _closure1_slot7;
        r3 = r2.default;
        r2 = function* () { // Environment: r2
            r0 = function* () { // Original name: ?anon_0_, environment: r0
                _fun51925: for(var _fun51925_ip = 0; ; ) switch(_fun51925_ip) {
                    case 0:
                        StartGenerator();
                        r1 = undefined;
                        ResumeGenerator(result_out_reg=0, return_bool_out_reg=2);
                        if(r2) { _fun51925_ip = 366; continue _fun51925 }
                    case 14:
                        r3 = _closure1_slot26;
                        if(r3) { _fun51925_ip = 363; continue _fun51925 }
                    case 27:
                        r3 = true;
                        _closure1_slot26 = r3;
                    case 33: // try_start_0
                        r3 = _closure1_slot16;
                        r6 = r3.default;
                        r5 = r6.getLocalAccount;
                        r3 = _closure1_slot22;
                        r3 = r3.PlatformTypes;
                        r3 = r3.CONTACTS;
                        r7 = r5.bind(r6)(r3);
                        r3 = _closure1_slot17;
                        r5 = r3.default;
                        r3 = r5.getCurrentUser;
                        r8 = r3.bind(r5)();
                        r5 = null;
                        r3 = undefined;
                        if(!(r5 != r8)) { _fun51925_ip = 105; continue _fun51925 }
                    case 95:
                        r6 = r8.isStaff;
                        r3 = r6.bind(r8)();
                    case 105:
                        r6 = r5 != r3;
                        if(!r6) { _fun51925_ip = 115; continue _fun51925 }
                    case 112:
                        r6 = r3;
                    case 115:
                        r3 = _closure1_slot20;
                        r3 = r3.isEligibleForFriendFinder;
                        r3 = r3.bind(r1)();
                        if(!r3) { _fun51925_ip = 156; continue _fun51925 }
                    case 132:
                        r5 = _closure1_slot13;
                        r5 = r5.isContactSyncEnabled;
                        r5 = r5.bind(r1)(r7);
                        if(r5) { _fun51925_ip = 153; continue _fun51925 }
                    case 150:
                        r5 = r6;
                    case 153:
                        r3 = r5;
                    case 156:
                        if(r3) { _fun51925_ip = 195; continue _fun51925 }
                    case 159:
                        r3 = _closure1_slot12;
                        r6 = r3.default;
                        r5 = r6.dispatch;
                        r3 = {};
                        r7 = 'LOAD_FRIEND_FINDER_FAILURE';
                        r3['type'] = r7;
                        r3 = r5.bind(r6)(r3);
                    case 190: // try_end0
                        r3 = undefined;
                        return r3;
                    case 195: // try_start_1
                        r3 = _closure1_slot21;
                        r3 = r3.fetchContacts;
                        r3 = r3.bind(r1)();
                        SaveGenerator(address=213);
                    case 211:
                        return r3;
                    case 213:
                        ResumeGenerator(result_out_reg=3, return_bool_out_reg=5);
                        if(r5) { _fun51925_ip = 327; continue _fun51925 }
                    case 219:
                        r7 = r3.contactData;
                        r5 = function(a0) { // Original name: setStoredContacts, environment: r4
                            r6 = a0;
                            r0 = {};
                            var _closure5_slot0 = r0;
                            r1 = global;
                            r4 = r1.Object;
                            r3 = r4.values;
                            r4 = r3.bind(r4)(r6);
                            r3 = r4.forEach;
                            r2 = function(a0) { // Environment: r2
                                r1 = a0;
                                var _closure6_slot0 = r1;
                                r2 = r1.deviceContactIds;
                                r1 = r2.forEach;
                                r0 = function(a0) { // Environment: r0
                                    _fun51928: for(var _fun51928_ip = 0; ; ) switch(_fun51928_ip) {
                                        case 0:
                                            r1 = a0;
                                            r2 = _closure5_slot0;
                                            r3 = r2[r1];
                                            r2 = null;
                                            if(!(r2 == r3)) { _fun51928_ip = 32; continue _fun51928 }
                                        case 20:
                                            r3 = _closure5_slot0;
                                            r2 = new Array(0);
                                            r3[r1] = r2;
                                        case 32:
                                            r0 = _closure5_slot0;
                                            r2 = r0[r1];
                                            r1 = r2.push;
                                            r0 = _closure6_slot0;
                                            r0 = r0.contactMethod;
                                            r0 = r1.bind(r2)(r0);
                                            r0 = undefined;
                                            return r0;
                                    }
                                };
                                r0 = r1.bind(r2)(r0);
                                r0 = undefined;
                                return r0;
                            };
                            r2 = r3.bind(r4)(r2);
                            r5 = r1.Object;
                            r4 = r5.assign;
                            r3 = _closure1_slot28;
                            r2 = {};
                            r2['storedContacts'] = r6;
                            r2['storedContactsByDeviceId'] = r0;
                            r0 = {};
                            r0 = r4.bind(r5)(r0, r3, r2);
                            _closure1_slot28 = r0;
                            r0 = undefined;
                            return r0;
                        };
                        r5 = r5.bind(r1)(r7);
                        r4 = function(a0) { // Original name: filterSpam, environment: r4
                            r4 = a0;
                            var _closure5_slot0 = r4;
                            r0 = {};
                            var _closure5_slot1 = r0;
                            r2 = global;
                            r3 = r2.Object;
                            r2 = r3.keys;
                            r3 = r2.bind(r3)(r4);
                            r2 = r3.forEach;
                            r1 = function(a0) { // Environment: r1
                                _fun51930: for(var _fun51930_ip = 0; ; ) switch(_fun51930_ip) {
                                    case 0:
                                        r2 = a0;
                                        r0 = undefined;
                                        r3 = _closure5_slot0;
                                        r3 = r3[r2];
                                        r3 = r3.deviceContactIds;
                                        r4 = null;
                                        if(!(r4 == r3)) { _fun51930_ip = 36; continue _fun51930 }
                                    case 30:
                                        var _closure6_slot0 = r2;
                                        _fun51930_ip = 55; continue _fun51930;
                                    case 36:
                                        _closure6_slot0 = r2;
                                        r2 = r3.forEach;
                                        r1 = function(a0) { // Environment: r1
                                            _fun51931: for(var _fun51931_ip = 0; ; ) switch(_fun51931_ip) {
                                                case 0:
                                                    r3 = a0;
                                                    r0 = _closure1_slot28;
                                                    r0 = r0.storedContactsByDeviceId;
                                                    r2 = r0[r3];
                                                    r0 = null;
                                                    r0 = r0 != r2;
                                                    if(!r0) { _fun51931_ip = 56; continue _fun51931 }
                                                case 29:
                                                    r2 = _closure1_slot28;
                                                    r2 = r2.storedContactsByDeviceId;
                                                    r2 = r2[r3];
                                                    r2 = r2.length;
                                                    r1 = _closure1_slot23;
                                                    r0 = r2 < r1;
                                                case 56:
                                                    if(!r0) { _fun51931_ip = 85; continue _fun51931 }
                                                case 59:
                                                    r2 = _closure5_slot1;
                                                    r1 = _closure6_slot0;
                                                    r0 = _closure5_slot0;
                                                    r0 = r0[r1];
                                                    r2[r1] = r0;
                                                case 85:
                                                    r0 = undefined;
                                                    return r0;
                                            }
                                        };
                                        r1 = r2.bind(r3)(r1);
                                    case 55:
                                        return r0;
                                }
                            };
                            r1 = r2.bind(r3)(r1);
                            return r0;
                        };
                        r5 = r4.bind(r1)(r7); // r1 is undefinded, r7 is _closure1_slot21.fetchContacts.contactData
                        // _closure1_slot21 is assigned at Bookmark-Assign-_closure1_slot21
                        // _closure1_slot21 is defined at Bookmark-Get-contactsData-functions
                        // Function for _closure1_slot32 is formatRequestModifiedContactsData
                        r4 = _closure1_slot32; // Bookmark_Very_Important_Code_For_Find_Friend
                        r5 = r4.bind(r1)(r5); // modified_contacts, closure1_slot32(r1)(r5)
                        r4 = global;
                        r6 = r4.Object;
                        r4 = r6.keys;
                        r4 = r4.bind(r6)(r7);
                        r4 = r4.length; // Basically the length of modified contacts
                        r6 = {}; 
                        // This dictionary is the one that gets posted to https://discord.com/api/v9/friend-finder/find-friends
                        r6['modified_contacts'] = r5;
                        r6['phone_contact_methods_count'] = r4;
                        r5 = _closure1_slot0;
                        r7 = _closure1_slot1;
                        r4 = 23;
                        r4 = r7[r4];
                        r4 = r5.bind(r1)(r4);
                        r5 = r4.default;
                        r4 = r5.fetch;
                        r4 = r4.bind(r5)(r6);
                    case 325: // try_end1
                        _fun51925_ip = 363; continue _fun51925;
                    case 327:
                        return r3;
                    case 330: // catch_target0 // catch_target1
                        CatchBlockStart(arg_register=3);
                        r2 = _closure1_slot12;
                        r4 = r2.default;
                        r3 = r4.dispatch;
                        r2 = {};
                        r5 = 'LOAD_FRIEND_FINDER_FAILURE';
                        r2['type'] = r5;
                        r2 = r3.bind(r4)(r2);
                    case 363:
                        return r1;
                    case 366:
                        return r0;
                }
            };
            return r0;
        };
        r3 = r3.bind(r4)(r2);
        _closure1_slot34 = r3;
        r2 = r3.apply;
        r0 = arguments;
        r1 = r0;
        r0 = this;
        r0 = r2.bind(r3)(r0, r1);
        return r0;
    };
    var _closure1_slot34 = r0;
    r0 = 0;
    r6 = r3[r0];
    r0 = undefined;
    r10 = r2.bind(r0)(r6);
    r7 = global;
    r11 = r7.Object;
    r9 = r11.defineProperty;
    r8 = {};
    r6 = true;
    r8['value'] = r6;
    r6 = '__esModule';
    r6 = r9.bind(r11)(r4, r6, r8);
    r4['default'] = r0;
    r4['pullFriendFinderData'] = r1;
    r1 = 1;
    r1 = r3[r1];
    r1 = r2.bind(r0)(r1);
    r1 = r10.bind(r0)(r1);
    var _closure1_slot2 = r1;
    r1 = 2;
    r1 = r3[r1];
    r1 = r2.bind(r0)(r1);
    r1 = r10.bind(r0)(r1);
    var _closure1_slot3 = r1;
    r1 = 3;
    r1 = r3[r1];
    r1 = r2.bind(r0)(r1);
    r1 = r10.bind(r0)(r1);
    var _closure1_slot4 = r1;
    r1 = 4;
    r1 = r3[r1];
    r1 = r2.bind(r0)(r1);
    r1 = r10.bind(r0)(r1);
    var _closure1_slot5 = r1;
    r1 = 5;
    r1 = r3[r1];
    r1 = r2.bind(r0)(r1);
    r1 = r10.bind(r0)(r1);
    var _closure1_slot6 = r1;
    r1 = 6;
    r1 = r3[r1];
    r1 = r2.bind(r0)(r1);
    r1 = r10.bind(r0)(r1);
    var _closure1_slot7 = r1;
    r1 = 7;
    r1 = r3[r1];
    r1 = r2.bind(r0)(r1);
    r1 = r10.bind(r0)(r1);
    var _closure1_slot8 = r1;
    r1 = 8;
    r1 = r3[r1];
    r1 = r2.bind(r0)(r1);
    r1 = r10.bind(r0)(r1);
    var _closure1_slot9 = r1;
    r1 = 9;
    r1 = r3[r1];
    r1 = r2.bind(r0)(r1);
    r1 = r10.bind(r0)(r1);
    var _closure1_slot10 = r1;
    r8 = 10;
    r1 = r3[r8];
    r1 = r2.bind(r0)(r1);
    r1 = r10.bind(r0)(r1);
    var _closure1_slot11 = r1;
    r1 = 11;
    r1 = r3[r1];
    r1 = r2.bind(r0)(r1);
    r6 = r10.bind(r0)(r1);
    r1 = 12;
    r1 = r3[r1];
    r1 = r2.bind(r0)(r1);
    r1 = r10.bind(r0)(r1);
    var _closure1_slot12 = r1;
    r9 = 13;
    r9 = r3[r9];
    r9 = r2.bind(r0)(r9);
    var _closure1_slot13 = r9;
    r9 = 14;
    r9 = r3[r9];
    r9 = r2.bind(r0)(r9);
    var _closure1_slot14 = r9;
    r9 = 15;
    r9 = r3[r9];
    r9 = r2.bind(r0)(r9);
    r9 = r10.bind(r0)(r9);
    var _closure1_slot15 = r9;
    r9 = 16;
    r9 = r3[r9];
    r9 = r2.bind(r0)(r9);
    r9 = r10.bind(r0)(r9);
    var _closure1_slot16 = r9;
    r9 = 17;
    r9 = r3[r9];
    r9 = r2.bind(r0)(r9);
    r9 = r10.bind(r0)(r9);
    var _closure1_slot17 = r9;
    r9 = 18;
    r9 = r3[r9];
    r9 = r2.bind(r0)(r9);
    r9 = r10.bind(r0)(r9);
    var _closure1_slot18 = r9;
    r9 = 19;
    r9 = r3[r9];
    r9 = r2.bind(r0)(r9);
    var _closure1_slot19 = r9;
    r9 = 20;
    r9 = r3[r9];
    r9 = r2.bind(r0)(r9);
    var _closure1_slot20 = r9;
    r9 = 21;
    r9 = r3[r9];
    r9 = r2.bind(r0)(r9);// r9 = r2(21) with this as 0. Safe to say it's just a function call
    // r2 is a1 wtf
    var _closure1_slot21 = r9; // Bookmark-Assign-_closure1_slot21
    r9 = 22;
    r9 = r3[r9];
    r9 = r2.bind(r0)(r9);
    var _closure1_slot22 = r9;
    var _closure1_slot23 = r8;
    r8 = 1000;
    var _closure1_slot24 = r8;
    r8 = null;
    var _closure1_slot25 = r8;
    r8 = false;
    var _closure1_slot26 = r8;
    var _closure1_slot27 = r8;
    r8 = r7.Set;
    r9 = r8.prototype;
    r9 = Object.create(r9, {constructor: {value: r8}});
    r15 = r9;
    r8 = new r15[r8](r14);
    r9 = r8 instanceof Object ? r8 : r9;
    r7 = r7.Set;
    r8 = r7.prototype;
    r8 = Object.create(r8, {constructor: {value: r7}});
    r15 = r8;
    r7 = new r15[r7](r14);
    r8 = r7 instanceof Object ? r7 : r8;
    r7 = {'trackedFirstLoad': false, 'storedContacts': null, 'storedContactsByDeviceId': null, 'inviteSuggestions': null, 'smsMessageContent': null, 'guildSmsMessageContent': null, 'incentivizedInvitesRemaining': 0, 'incentivizedInvitesLimit': 6, 'incentivizedInviteSentCount': 0};
    r10 = {};
    r7['storedContacts'] = r10;
    r10 = {};
    r7['storedContactsByDeviceId'] = r10;
    r10 = {};
    r7['inviteSuggestions'] = r10;
    r10 = {};
    r7['peopleYouMayKnow'] = r10;
    r10 = {};
    r7['friendSuggestions'] = r10;
    r7['hiddenContactMethods'] = r9;
    r7['fadedContactMethods'] = r8;
    var _closure1_slot28 = r7;
    r6 = r6.default;
    r7 = r6.PersistedStore;
    r6 = function(a0) { // Environment: r5
        r0 = function() { // Original name: FriendFinderStore, environment: r5
            r3 = this;
            r5 = undefined;
            r0 = undefined;
            r1 = _closure1_slot2;
            r4 = r1.default;
            r2 = _closure2_slot1;
            r2 = r4.bind(r5)(r3, r2);
            r2 = _closure2_slot0;
            r1 = r2.apply;
            r0 = arguments;
            r0 = r1.bind(r2)(r3, r0);
            return r0;
        };
        var _closure2_slot1 = r0;
        r2 = _closure1_slot4;
        r4 = r2.default;
        r3 = undefined;
        r2 = a0;
        r2 = r4.bind(r3)(r0, r2);
        r2 = _closure1_slot29;
        r2 = r2.bind(r3)(r0);
        var _closure2_slot0 = r2;
        r1 = _closure1_slot3;
        r2 = r1.default;
        r4 = {};
        r1 = 'initialize';
        r4['key'] = r1;
        r1 = function(a0) { // Original name: initialize, environment: r5
            _fun51934: for(var _fun51934_ip = 0; ; ) switch(_fun51934_ip) {
                case 0:
                    r6 = a0;
                    r5 = this;
                    r0 = undefined;
                    r4 = r5.waitFor;
                    r1 = _closure1_slot17;
                    r1 = r1.default;
                    r1 = r4.bind(r5)(r1);
                    r1 = null;
                    if(!(r1 == r6)) { _fun51934_ip = 47; continue _fun51934 }
                case 38:
                    var _closure3_slot0 = r0;
                    _fun51934_ip = 195; continue _fun51934;
                case 47:
                    r1 = {};
                    _closure3_slot0 = r1;
                    r1 = _closure1_slot10;
                    r7 = r1.default;
                    r5 = r7.forEach;
                    r4 = r6.peopleYouMayKnow;
                    r1 = function(a0, a1) { // Environment: r3
                        r5 = a0;
                        r2 = _closure3_slot0;
                        r0 = global;
                        r4 = r0.Object;
                        r3 = r4.assign;
                        r0 = _closure1_slot15;
                        r6 = r0.default;
                        r9 = r5.user;
                        r1 = r6.prototype;
                        r1 = Object.create(r1, {constructor: {value: r6}});
                        r10 = r1;
                        r0 = new r10[r6](r9, r8);
                        r0 = r0 instanceof Object ? r0 : r1;
                        r1 = {};
                        r1['user'] = r0;
                        r0 = {};
                        r1 = r3.bind(r4)(r0, r5, r1);
                        r0 = a1;
                        r2[r0] = r1;
                        r0 = undefined;
                        return r0;
                    };
                    r1 = r5.bind(r7)(r4, r1);
                    r1 = global;
                    r5 = r1.Object;
                    r4 = r5.assign;
                    r8 = _closure3_slot0;
                    r9 = r1.Set;
                    r12 = r6.hiddenContactMethods;
                    r7 = r9.prototype;
                    r7 = Object.create(r7, {constructor: {value: r9}});
                    r13 = r7;
                    r3 = new r13[r9](r12, r11);
                    r7 = r3 instanceof Object ? r3 : r7;
                    r9 = r1.Set;
                    r12 = r6.fadedContactMethods;
                    r3 = r9.prototype;
                    r3 = Object.create(r3, {constructor: {value: r9}});
                    r13 = r3;
                    r1 = new r13[r9](r12, r11);
                    r1 = r1 instanceof Object ? r1 : r3;
                    r3 = {};
                    r3['peopleYouMayKnow'] = r8;
                    r3['hiddenContactMethods'] = r7;
                    r3['fadedContactMethods'] = r1;
                    r1 = {};
                    r1 = r4.bind(r5)(r1, r6, r3);
                    _closure1_slot28 = r1;
                case 195:
                    return r0;
            }
        };
        r4['value'] = r1;
        r1 = new Array(16);
        r1[0] = r4;
        r4 = {};
        r6 = 'getState';
        r4['key'] = r6;
        r6 = function() { // Original name: getState, environment: r5
            r0 = _closure1_slot28;
            return r0;
        };
        r4['value'] = r6;
        r1[1] = r4;
        r4 = {};
        r6 = 'lastFetchAt';
        r4['key'] = r6;
        r6 = function() { // Original name: lastFetchAt, environment: r5
            r0 = _closure1_slot25;
            return r0;
        };
        r4['value'] = r6;
        r1[2] = r4;
        r4 = {};
        r6 = 'isFetching';
        r4['key'] = r6;
        r6 = function() { // Original name: isFetching, environment: r5
            r0 = _closure1_slot26;
            return r0;
        };
        r4['value'] = r6;
        r1[3] = r4;
        r4 = {};
        r6 = 'getIsFirstLoadComplete';
        r4['key'] = r6;
        r6 = function() { // Original name: getIsFirstLoadComplete, environment: r5
            r0 = _closure1_slot27;
            return r0;
        };
        r4['value'] = r6;
        r1[4] = r4;
        r4 = {};
        r6 = 'getStoredContacts';
        r4['key'] = r6;
        r6 = function() { // Original name: getStoredContacts, environment: r5
            r0 = _closure1_slot28;
            r0 = r0.storedContacts;
            return r0;
        };
        r4['value'] = r6;
        r1[5] = r4;
        r4 = {};
        r6 = 'getFadedContactMethods';
        r4['key'] = r6;
        r6 = function() { // Original name: getFadedContactMethods, environment: r5
            r0 = _closure1_slot28;
            r0 = r0.fadedContactMethods;
            return r0;
        };
        r4['value'] = r6;
        r1[6] = r4;
        r4 = {};
        r6 = 'getInviteSuggestions';
        r4['key'] = r6;
        r6 = function() { // Original name: getInviteSuggestions, environment: r5
            r0 = global;
            r2 = r0.Object;
            r1 = r2.entries;
            r0 = _closure1_slot28;
            r0 = r0.inviteSuggestions;
            r2 = r1.bind(r2)(r0);
            r1 = r2.map;
            r0 = function(a0) { // Environment: r0
                r0 = _closure1_slot9;
                r3 = r0.default;
                r2 = undefined;
                r1 = a0;
                r0 = 2;
                r1 = r3.bind(r2)(r1, r0);
                r0 = 0;
                r0 = r1[r0];
                r0 = 1;
                r0 = r1[r0];
                return r0;
            };
            r0 = r1.bind(r2)(r0);
            return r0;
        };
        r4['value'] = r6;
        r1[7] = r4;
        r4 = {};
        r6 = 'getSmsMessageContent';
        r4['key'] = r6;
        r6 = function() { // Original name: getSmsMessageContent, environment: r5
            r0 = _closure1_slot28;
            r0 = r0.smsMessageContent;
            return r0;
        };
        r4['value'] = r6;
        r1[8] = r4;
        r4 = {};
        r6 = 'getGuildSmsMessageContent';
        r4['key'] = r6;
        r6 = function() { // Original name: getGuildSmsMessageContent, environment: r5
            r0 = _closure1_slot28;
            r0 = r0.guildSmsMessageContent;
            return r0;
        };
        r4['value'] = r6;
        r1[9] = r4;
        r4 = {};
        r6 = 'getIncentivizedInvitesRemaining';
        r4['key'] = r6;
        r6 = function() { // Original name: getIncentivizedInvitesRemaining, environment: r5
            r0 = _closure1_slot28;
            r0 = r0.incentivizedInvitesRemaining;
            return r0;
        };
        r4['value'] = r6;
        r1[10] = r4;
        r4 = {};
        r6 = 'getIncentivizedInvitesLimit';
        r4['key'] = r6;
        r6 = function() { // Original name: getIncentivizedInvitesLimit, environment: r5
            r0 = _closure1_slot28;
            r0 = r0.incentivizedInvitesLimit;
            return r0;
        };
        r4['value'] = r6;
        r1[11] = r4;
        r4 = {};
        r6 = 'getFriendSuggestions';
        r4['key'] = r6;
        r6 = function() { // Original name: getFriendSuggestions, environment: r5
            r0 = global;
            r2 = r0.Object;
            r1 = r2.entries;
            r0 = _closure1_slot28;
            r0 = r0.friendSuggestions;
            r2 = r1.bind(r2)(r0);
            r1 = r2.map;
            r0 = function(a0) { // Environment: r0
                r0 = _closure1_slot9;
                r3 = r0.default;
                r2 = undefined;
                r1 = a0;
                r0 = 2;
                r1 = r3.bind(r2)(r1, r0);
                r0 = 0;
                r0 = r1[r0];
                r0 = 1;
                r0 = r1[r0];
                return r0;
            };
            r0 = r1.bind(r2)(r0);
            return r0;
        };
        r4['value'] = r6;
        r1[12] = r4;
        r4 = {};
        r6 = 'getPersonYouMayKnow';
        r4['key'] = r6;
        r6 = function(a0) { // Original name: getPersonYouMayKnow, environment: r5
            r0 = _closure1_slot28;
            r1 = r0.peopleYouMayKnow;
            r0 = a0;
            r0 = r1[r0];
            return r0;
        };
        r4['value'] = r6;
        r1[13] = r4;
        r4 = {};
        r6 = 'getPeopleYouMayKnow';
        r4['key'] = r6;
        r6 = function() { // Original name: getPeopleYouMayKnow, environment: r5
            r0 = global;
            r2 = r0.Object;
            r1 = r2.entries;
            r0 = _closure1_slot28;
            r0 = r0.peopleYouMayKnow;
            r2 = r1.bind(r2)(r0);
            r1 = r2.map;
            r0 = function(a0) { // Environment: r0
                r0 = _closure1_slot9;
                r3 = r0.default;
                r2 = undefined;
                r1 = a0;
                r0 = 2;
                r1 = r3.bind(r2)(r1, r0);
                r0 = 0;
                r0 = r1[r0];
                r0 = 1;
                r0 = r1[r0];
                return r0;
            };
            r0 = r1.bind(r2)(r0);
            return r0;
        };
        r4['value'] = r6;
        r1[14] = r4;
        r4 = {};
        r6 = 'getIncentivizedInviteSentCount';
        r4['key'] = r6;
        r5 = function() { // Original name: getIncentivizedInviteSentCount, environment: r5
            r0 = _closure1_slot28;
            r0 = r0.incentivizedInviteSentCount;
            return r0;
        };
        r4['value'] = r5;
        r1[15] = r4;
        r1 = r2.bind(r3)(r0, r1);
        return r0;
    };
    r7 = r6.bind(r0)(r7);
    r6 = 'FriendFinderStore';
    r7['displayName'] = r6;
    r7['persistKey'] = r6;
    r6 = new Array(1);
    r8 = function(a0) { // Environment: r5
        _fun51954: for(var _fun51954_ip = 0; ; ) switch(_fun51954_ip) {
            case 0:
                r5 = a0;
                r0 = null;
                if(!(r0 != r5)) { _fun51954_ip = 55; continue _fun51954 }
            case 9:
                r0 = global;
                r4 = r0.Object;
                r3 = r4.assign;
                r8 = _closure1_slot28;
                r1 = {};
                r0 = false;
                r1['trackedFirstLoad'] = r0;
                r9 = {};
                r10 = r4;
                r7 = r5;
                r6 = r1;
                r0 = r10[r3](r9, r8, r7, r6, r5);
                _fun51954_ip = 62; continue _fun51954;
            case 55:
                r0 = _closure1_slot28;
            case 62:
                return r0;
        }
    };
    r6[0] = r8;
    r7['migrations'] = r6;
    r14 = r1.default;
    r1 = {};
    r8 = function(a0) { // Original name: attemptPullFriendFinderData, environment: r5
        _fun51955: for(var _fun51955_ip = 0; ; ) switch(_fun51955_ip) {
            case 0:
                r0 = a0;
                r0 = r0.empty;
                if(r0) { _fun51955_ip = 25; continue _fun51955 }
            case 12:
                r2 = _closure1_slot25;
                r1 = null;
                r0 = r1 == r2;
            case 25:
                if(r0) { _fun51955_ip = 76; continue _fun51955 }
            case 28:
                r2 = _closure1_slot11;
                r3 = r2.default;
                r2 = undefined;
                r4 = r3.bind(r2)();
                r3 = r4.diff;
                r2 = _closure1_slot25;
                r1 = 's';
                r2 = r3.bind(r4)(r2, r1);
                r1 = 30000;
                r0 = r2 > r1;
            case 76:
                if(r0) { _fun51955_ip = 92; continue _fun51955 }
            case 79:
                r1 = _closure1_slot33;
                r0 = undefined;
                r0 = r1.bind(r0)();
            case 92:
                r0 = undefined;
                return r0;
        }
    };
    r1['CONTACT_SYNC_STORED_CONTACTS'] = r8;
    r8 = function(a0) { // Original name: handleLoadFriendFinderSuccess, environment: r5
        _fun51956: for(var _fun51956_ip = 0; ; ) switch(_fun51956_ip) {
            case 0:
                r3 = a0;
                r1 = false;
                _closure1_slot26 = r1;
                r1 = true;
                _closure1_slot27 = r1;
                r7 = null;
                if(!(r7 != r3)) { _fun51956_ip = 682; continue _fun51956 }
            case 29:
                r2 = r3.data;
                if(!(r7 != r2)) { _fun51956_ip = 682; continue _fun51956 }
            case 41:
                r2 = global;
                r5 = r2.Date;
                r6 = r5.prototype;
                r6 = Object.create(r6, {constructor: {value: r5}});
                r13 = r6;
                r5 = new r13[r5](r12);
                r5 = r5 instanceof Object ? r5 : r6;
                _closure1_slot25 = r5;
                r5 = r3.data;
                r5 = r5.invite_suggestions;
                if(!(r7 != r5)) { _fun51956_ip = 183; continue _fun51956 }
            case 88:
                r6 = _closure1_slot28;
                r5 = _closure1_slot10;
                r9 = r5.default;
                r8 = r9.chain;
                r5 = r3.data;
                r5 = r5.invite_suggestions;
                r9 = r8.bind(r9)(r5);
                r8 = r9.map;
                r5 = _closure1_slot30;
                r9 = r8.bind(r9)(r5);
                r8 = r9.filter;
                r5 = function(a0) { // Environment: r4
                    r0 = _closure1_slot28;
                    r2 = r0.hiddenContactMethods;
                    r1 = r2.has;
                    r0 = a0;
                    r0 = r0.contactMethod;
                    r0 = r1.bind(r2)(r0);
                    r0 = -r0;
                    return r0;
                };
                r9 = r8.bind(r9)(r5);
                r8 = r9.keyBy;
                r5 = function(a0) { // Environment: r4
                    r0 = a0;
                    r0 = r0.contactMethod;
                    return r0;
                };
                r8 = r8.bind(r9)(r5);
                r5 = r8.value;
                r5 = r5.bind(r8)();
                r6['inviteSuggestions'] = r5;
            case 183:
                r5 = r3.data;
                r5 = r5.sms_message_content;
                if(!(r7 != r5)) { _fun51956_ip = 219; continue _fun51956 }
            case 198:
                r6 = _closure1_slot28;
                r5 = r3.data;
                r5 = r5.sms_message_content;
                r6['smsMessageContent'] = r5;
            case 219:
                r5 = r3.data;
                r5 = r5.guild_sms_message_content;
                if(!(r7 != r5)) { _fun51956_ip = 255; continue _fun51956 }
            case 234:
                r6 = _closure1_slot28;
                r5 = r3.data;
                r5 = r5.guild_sms_message_content;
                r6['guildSmsMessageContent'] = r5;
            case 255:
                r5 = r3.data;
                r5 = r5.incentivized_invites_remaining;
                if(!(r7 != r5)) { _fun51956_ip = 291; continue _fun51956 }
            case 270:
                r6 = _closure1_slot28;
                r5 = r3.data;
                r5 = r5.incentivized_invites_remaining;
                r6['incentivizedInvitesRemaining'] = r5;
            case 291:
                r5 = r3.data;
                r5 = r5.incentivized_invites_limit;
                if(!(r7 != r5)) { _fun51956_ip = 327; continue _fun51956 }
            case 306:
                r6 = _closure1_slot28;
                r5 = r3.data;
                r5 = r5.incentivized_invites_limit;
                r6['incentivizedInvitesLimit'] = r5;
            case 327:
                r8 = _closure1_slot28;
                r5 = _closure1_slot14;
                r9 = r5.transformFriendSuggestions;
                r5 = r3.data;
                r5 = r5.friend_suggestions;
                r6 = undefined;
                r5 = r9.bind(r6)(r5);
                r8['friendSuggestions'] = r5;
                r5 = _closure1_slot28;
                r5 = r5.peopleYouMayKnow;
                r5 = r3.data;
                r5 = r5.people_you_may_know;
                if(!(r7 == r5)) { _fun51956_ip = 394; continue _fun51956 }
            case 390:
                r8 = {};
                _fun51956_ip = 484; continue _fun51956;
            case 394:
                r3 = r3.data;
                r5 = r3.people_you_may_know;
                r3 = function(a0) { // Original name: transformPeopleYouMayKnow, environment: r4
                    r1 = _closure1_slot10;
                    r3 = r1.default;
                    r2 = r3.chain;
                    r1 = a0;
                    r2 = r2.bind(r3)(r1);
                    r1 = r2.map;
                    r0 = _closure1_slot31;
                    r2 = r1.bind(r2)(r0);
                    r1 = r2.keyBy;
                    r0 = function(a0) { // Environment: r0
                        r0 = a0;
                        r0 = r0.user;
                        r0 = r0.id;
                        return r0;
                    };
                    r1 = r1.bind(r2)(r0);
                    r0 = r1.value;
                    r0 = r0.bind(r1)();
                    return r0;
                };
                r3 = r3.bind(r6)(r5);
                r5 = _closure1_slot12;
                r6 = r5.default;
                r5 = r6.dispatch;
                r9 = r2.Object;
                r7 = r9.entries;
                r9 = r7.bind(r9)(r3);
                r7 = r9.map;
                r4 = function(a0) { // Environment: r4
                    r0 = _closure1_slot9;
                    r3 = r0.default;
                    r2 = undefined;
                    r1 = a0;
                    r0 = 2;
                    r1 = r3.bind(r2)(r1, r0);
                    r0 = 0;
                    r0 = r1[r0];
                    r0 = 1;
                    r0 = r1[r0];
                    r0 = r0.user;
                    return r0;
                };
                r7 = r7.bind(r9)(r4);
                r4 = {};
                r9 = 'FRIEND_FINDER_PYMK_LOADED';
                r4['type'] = r9;
                r4['users'] = r7;
                r4 = r5.bind(r6)(r4);
                r8 = r3;
            case 484:
                r7 = r2.Object;
                r6 = r7.assign;
                r5 = _closure1_slot28;
                r4 = {};
                r4['peopleYouMayKnow'] = r8;
                r3 = {};
                r3 = r6.bind(r7)(r3, r5, r4);
                _closure1_slot28 = r3;
                r3 = r3.trackedFirstLoad;
                if(r3) { _fun51956_ip = 682; continue _fun51956 }
            case 531:
                r3 = _closure1_slot18;
                r5 = r3.default;
                r4 = r5.track;
                r3 = _closure1_slot22;
                r3 = r3.AnalyticEvents;
                r3 = r3.FRIEND_FINDER_INITIAL_LOADED;
                r7 = r2.Object;
                r6 = r7.keys;
                r6 = r6.bind(r7)(r8);
                r8 = r6.length;
                r9 = r2.Object;
                r7 = r9.keys;
                r6 = _closure1_slot28;
                r6 = r6.friendSuggestions;
                r6 = r7.bind(r9)(r6);
                r7 = r6.length;
                r9 = r2.Object;
                r6 = r9.keys;
                r2 = _closure1_slot28;
                r2 = r2.inviteSuggestions;
                r2 = r6.bind(r9)(r2);
                r6 = r2.length;
                r2 = {};
                r2['people_you_may_know_count'] = r8;
                r2['friend_suggestions_count'] = r7;
                r2['contact_suggestions_count'] = r6;
                r2 = r4.bind(r5)(r3, r2);
                r0 = _closure1_slot28;
                r0['trackedFirstLoad'] = r1;
            case 682:
                r0 = undefined;
                return r0;
        }
    };
    r1['LOAD_FRIEND_FINDER_SUCCESS'] = r8;
    r8 = function() { // Original name: handleLoadFriendFinderFailure, environment: r5
        r0 = true;
        _closure1_slot27 = r0;
        r0 = false;
        _closure1_slot26 = r0;
        r0 = undefined;
        return r0;
    };
    r1['LOAD_FRIEND_FINDER_FAILURE'] = r8;
    r8 = function(a0) { // Original name: handleHideContactFromFriendFinder, environment: r5
        _fun51963: for(var _fun51963_ip = 0; ; ) switch(_fun51963_ip) {
            case 0:
                r0 = a0;
                r2 = _closure1_slot28;
                r3 = r2.inviteSuggestions;
                r2 = r0.contactMethod;
                r3 = r3[r2];
                r2 = null;
                if(!(r2 != r3)) { _fun51963_ip = 78; continue _fun51963 }
            case 32:
                r2 = _closure1_slot28;
                r4 = r2.hiddenContactMethods;
                r3 = r4.add;
                r2 = r0.contactMethod;
                r2 = r3.bind(r4)(r2);
                r1 = _closure1_slot28;
                r1 = r1.inviteSuggestions;
                r0 = r0.contactMethod;
                r0 = delete r1[r0];
            case 78:
                r0 = undefined;
                return r0;
        }
    };
    r1['HIDE_CONTACT_FROM_FRIEND_FINDER'] = r8;
    r8 = function(a0) { // Original name: handleFadeContactFromFriendFinder, environment: r5
        _fun51964: for(var _fun51964_ip = 0; ; ) switch(_fun51964_ip) {
            case 0:
                r0 = a0;
                r2 = _closure1_slot28;
                r3 = r2.inviteSuggestions;
                r2 = r0.contactMethod;
                r3 = r3[r2];
                r2 = null;
                if(!(r2 != r3)) { _fun51964_ip = 58; continue _fun51964 }
            case 32:
                r1 = _closure1_slot28;
                r2 = r1.fadedContactMethods;
                r1 = r2.add;
                r0 = r0.contactMethod;
                r0 = r1.bind(r2)(r0);
            case 58:
                r0 = undefined;
                return r0;
        }
    };
    r1['FADE_CONTACT_FROM_FRIEND_FINDER'] = r8;
    r8 = function(a0) { // Original name: handleDeleteFriendSuggestion, environment: r5
        _fun51965: for(var _fun51965_ip = 0; ; ) switch(_fun51965_ip) {
            case 0:
                r0 = a0;
                r1 = r0.suggestedUserId;
                r2 = _closure1_slot28;
                r2 = r2.friendSuggestions;
                r2 = r2[r1];
                r3 = null;
                if(!(r3 != r2)) { _fun51965_ip = 46; continue _fun51965 }
            case 32:
                r2 = _closure1_slot28;
                r2 = r2.friendSuggestions;
                r2 = delete r2[r1];
            case 46:
                r2 = _closure1_slot28;
                r2 = r2.peopleYouMayKnow;
                r2 = r2[r1];
                if(!(r3 != r2)) { _fun51965_ip = 78; continue _fun51965 }
            case 64:
                r0 = _closure1_slot28;
                r0 = r0.peopleYouMayKnow;
                r0 = delete r0[r1];
            case 78:
                r0 = undefined;
                return r0;
        }
    };
    r1['FRIEND_SUGGESTION_DELETE'] = r8;
    r8 = function(a0) { // Original name: handleConnectionsUpdate, environment: r5
        _fun51966: for(var _fun51966_ip = 0; ; ) switch(_fun51966_ip) {
            case 0:
                r1 = a0;
                r0 = r1.accounts;
                r2 = null;
                r0 = r2 != r0;
                if(!r0) { _fun51966_ip = 46; continue _fun51966 }
            case 18:
                r4 = r1.accounts;
                r3 = r4.find;
                r1 = function(a0) { // Environment: r1
                    r0 = a0;
                    r1 = r0.type;
                    r0 = _closure1_slot22;
                    r0 = r0.PlatformTypes;
                    r0 = r0.CONTACTS;
                    r0 = r1 === r0;
                    return r0;
                };
                r1 = r3.bind(r4)(r1);
                r0 = r2 != r1;
            case 46:
                if(!r0) { _fun51966_ip = 62; continue _fun51966 }
            case 49:
                r1 = _closure1_slot33;
                r0 = undefined;
                r0 = r1.bind(r0)();
            case 62:
                r0 = undefined;
                return r0;
        }
    };
    r1['USER_CONNECTIONS_UPDATE'] = r8;
    r5 = function() { // Original name: handleIncrementIncentivizedInviteSentCount, environment: r5
        r0 = global;
        r5 = r0.Object;
        r4 = r5.assign;
        r3 = _closure1_slot28;
        r2 = r3.incentivizedInviteSentCount;
        r0 = 1;
        r0 = r2 + r0;
        r2 = {};
        r2['incentivizedInviteSentCount'] = r0;
        r0 = {};
        r0 = r4.bind(r5)(r0, r3, r2);
        _closure1_slot28 = r0;
        r0 = undefined;
        return r0;
    };
    r1['FRIEND_FINDER_INCENTIVIZED_SEND_INCREMENT'] = r5;
    r5 = r7.prototype;
    r5 = Object.create(r5, {constructor: {value: r7}});
    r15 = r5;
    r13 = r1;
    r1 = new r15[r7](r14, r13, r12);
    r1 = r1 instanceof Object ? r1 : r5;
    r4['default'] = r1;
    r1 = 24;
    r1 = r3[r1];
    r3 = r2.bind(r0)(r1);
    r2 = r3.fileFinishedImporting;
    r1 = 'modules/friend_finder/native/FriendFinderStore.tsx';
    r1 = r2.bind(r3)(r1);
    return r0;
};
// End of the contact sync circus
r6 = 5058;
r5 = [5, 10, 6, 13, 15, 17, 18, 31, 58, 22, 456, 494, 761, 5059, 5362, 1186, 3074, 1179, 756, 5251, 5062, 5243, 660, 5252, 2];
r5 = r8.bind(r2)(r7, r6, r5); // HUH AGAIN
r8 = r0.__d; // global.__d