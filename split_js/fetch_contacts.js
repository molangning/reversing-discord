r7 = function(a0, a1, a2, a3, a4, a5, a6) { // Environment: r3
    r2 = a1;
    r4 = a5;
    r3 = a6;
    r0 = function(a0) { // Original name: getImageData, environment: r1
        r1 = a0;
        var _closure2_slot0 = r1;
        r1 = global;
        r2 = r1.Promise;
        r1 = r2.prototype;
        r1 = Object.create(r1, {constructor: {value: r2}});
        r3 = function(a0) { // Environment: r0
            r0 = a0;
            var _closure3_slot0 = r0;
            r3 = _closure1_slot4;
            r2 = _closure2_slot0;
            r0 = undefined;
            r4 = r3.bind(r0)(r2);
            r3 = r4.then;
            r2 = function(a0) { // Environment: r1
                r2 = _closure3_slot0;
                r0 = undefined;
                r1 = a0;
                r1 = r2.bind(r0)(r1);
                return r0;
            };
            r3 = r3.bind(r4)(r2);
            r2 = r3.catch;
            r1 = function() { // Environment: r1
                r2 = _closure3_slot0;
                r1 = undefined;
                r0 = null;
                r0 = r2.bind(r1)(r0);
                return r0;
            };
            r1 = r2.bind(r3)(r1);
            return r0;
        };
        r4 = r1;
        r0 = new r4[r2](r3, r2);
        r0 = r0 instanceof Object ? r0 : r1;
        return r0;
    };
    var _closure1_slot5 = r0;
    r0 = function() { // Original name: _findPhotoAcrossDeviceContactIds, environment: r1
        r4 = undefined;
        r0 = undefined;
        r2 = _closure1_slot0;
        r3 = r2.default;
        r2 = function* (a0) { // Environment: r2
            r0 = function* (a0) { // Original name: ?anon_0_, environment: r0
                _fun53497: for(var _fun53497_ip = 0; ; ) switch(_fun53497_ip) {
                    case 0:
                        StartGenerator();
                        r9 = a0;
                        r7 = undefined;
                        r6 = null;
                        r5 = '';
                        ResumeGenerator(result_out_reg=0, return_bool_out_reg=1);
                        if(r1) { _fun53497_ip = 88; continue _fun53497 }
                    case 18:
                        r1 = r9.length;
                        r2 = null;
                        r8 = 0;
                        if(!(r8 < r1)) { _fun53497_ip = 82; continue _fun53497 }
                    case 34:
                        r3 = r9[r8];
                        r1 = _closure1_slot5;
                        r1 = r1.bind(r7)(r3);
                        SaveGenerator(address=51);
                    case 49:
                        return r1;
                    case 51:
                        ResumeGenerator(result_out_reg=1, return_bool_out_reg=3);
                        if(r3) { _fun53497_ip = 85; continue _fun53497 }
                    case 57:
                        if(!(r6 != r1)) { _fun53497_ip = 68; continue _fun53497 }
                    case 61:
                        r2 = r1;
                        if(!(r5 === r2)) { _fun53497_ip = 82; continue _fun53497 }
                    case 68:
                        r8 = r8 + 1;
                        r3 = r9.length;
                        r2 = null;
                        if(r8 < r3) { _fun53497_ip = 34; continue _fun53497 }
                    case 82:
                        return r2;
                    case 85:
                        return r1;
                    case 88:
                        return r0;
                }
            };
            return r0;
        };
        r3 = r3.bind(r4)(r2);
        _closure1_slot6 = r3;
        r2 = r3.apply;
        r0 = arguments;
        r1 = r0;
        r0 = this;
        r0 = r2.bind(r3)(r0, r1);
        return r0;
    };
    var _closure1_slot6 = r0;
    r0 = 0;
    r5 = r3[r0];
    r0 = undefined;
    r7 = r2.bind(r0)(r5);
    r5 = global;
    r10 = r5.Object;
    r9 = r10.defineProperty;
    r8 = {};
    r6 = true;
    r8['value'] = r6;
    r6 = '__esModule';
    r6 = r9.bind(r10)(r4, r6, r8);
    r4['ContactImageFetchFailed'] = r0;
    r4['FriendFinderPermissionDenied'] = r0;
    r4['fetchContacts'] = r0;
    r6 = function() { // Original name: findPhotoAcrossDeviceContactIds, environment: r1
        r0 = undefined;
        r3 = _closure1_slot6;
        r2 = r3.apply;
        r0 = arguments;
        r1 = r0;
        r0 = this;
        r0 = r2.bind(r3)(r0, r1);
        return r0;
    };
    r4['findPhotoAcrossDeviceContactIds'] = r6;
    r4['getContactMethodsForLabels'] = r0;
    r4['getImageForContactId'] = r0;
    r4['isComposeSupported'] = r0;
    r6 = 1;
    r6 = r3[r6];
    r6 = r2.bind(r0)(r6);
    r6 = r7.bind(r0)(r6);
    var _closure1_slot0 = r6;
    r6 = 2;
    r6 = r3[r6];
    r6 = r2.bind(r0)(r6);
    var _closure1_slot1 = r6;
    r8 = r5.Error;
    r6 = r8.prototype;
    r7 = Object.create(r6, {constructor: {value: r8}});
    r13 = 'No contact permissions';
    r14 = r7;
    r6 = new r14[r8](r13, r12);
    r6 = r6 instanceof Object ? r6 : r7;
    var _closure1_slot2 = r6;
    r4['FriendFinderPermissionDenied'] = r6;
    r7 = r5.Error;
    r5 = r7.prototype;
    r6 = Object.create(r5, {constructor: {value: r7}});
    r13 = 'Failed to fetch contact image';
    r14 = r6;
    r5 = new r14[r7](r13, r12);
    r5 = r5 instanceof Object ? r5 : r6;
    var _closure1_slot3 = r5;
    r4['ContactImageFetchFailed'] = r5;
    r5 = function() { // Environment: r1
        r1 = _closure1_slot1;
        r1 = r1.NativeModules;
        r1 = r1.DCDFriendFinderManager;
        var _closure2_slot0 = r1;
        r1 = global;
        r2 = r1.Promise;
        r1 = r2.prototype;
        r1 = Object.create(r1, {constructor: {value: r2}});
        r3 = function(a0, a1) { // Environment: r0
            r1 = a0;
            var _closure3_slot0 = r1;
            r1 = a1;
            var _closure3_slot1 = r1;
            r2 = _closure2_slot0;
            r1 = r2.fetchContacts;
            r0 = function(a0, a1) { // Environment: r0
                _fun53501: for(var _fun53501_ip = 0; ; ) switch(_fun53501_ip) {
                    case 0:
                        r0 = undefined;
                        r1 = undefined;
                        r3 = null;
                        r2 = a0;
                        if(!(r3 != r2)) { _fun53501_ip = 34; continue _fun53501 }
                    case 13:
                        r3 = _closure3_slot1;
                        r2 = _closure1_slot2;
                        r2 = r3.bind(r0)(r2);
                        _fun53501_ip = 84; continue _fun53501;
                    case 34: // try_start_0
                        r2 = global;
                        r4 = r2.JSON;
                        r3 = r4.parse;
                        r2 = a1;
                        r1 = r3.bind(r4)(r2); // JSON.parse(a1)
                    case 56: // try_end0
                        _fun53501_ip = 62; continue _fun53501;
                    case 58: // catch_target0
                        CatchBlockStart(arg_register=2);
                        r1 = {};
                    case 62:
                        r2 = _closure3_slot0;
                        r3 = r1;
                        r1 = {};
                        r1['contactData'] = r3;
                        r1 = r2.bind(r0)(r1);
                    case 84:
                        return r0;
                }
            };
            r0 = r1.bind(r2)(r0);
            r0 = undefined;
            return r0;
        };
        r4 = r1;
        r0 = new r4[r2](r3, r2);
        r0 = r0 instanceof Object ? r0 : r1;
        return r0;
    };
    r4['fetchContacts'] = r5;
    r5 = function(a0) { // Original name: getImageForContactId, environment: r1
        r1 = a0;
        var _closure2_slot0 = r1;
        r1 = _closure1_slot1;
        r1 = r1.NativeModules;
        r1 = r1.DCDFriendFinderManager;
        var _closure2_slot1 = r1;
        r1 = global;
        r2 = r1.Promise;
        r1 = r2.prototype;
        r1 = Object.create(r1, {constructor: {value: r2}});
        r3 = function(a0, a1) { // Environment: r0
            r1 = a0;
            var _closure3_slot0 = r1;
            r1 = a1;
            var _closure3_slot1 = r1;
            r3 = _closure2_slot1;
            r2 = r3.getImageForContactId;
            r1 = _closure2_slot0;
            r0 = function(a0, a1) { // Environment: r0
                _fun53504: for(var _fun53504_ip = 0; ; ) switch(_fun53504_ip) {
                    case 0:
                        r5 = a1;
                        r2 = null;
                        r0 = a0;
                        if(!(r2 != r0)) { _fun53504_ip = 35; continue _fun53504 }
                    case 12:
                        r3 = _closure3_slot1;
                        r1 = _closure1_slot3;
                        r0 = undefined;
                        r0 = r3.bind(r0)(r1);
                        _fun53504_ip = 84; continue _fun53504;
                    case 35:
                        r1 = _closure3_slot0;
                        r2 = null;
                        if(!(r2 !== r5)) { _fun53504_ip = 77; continue _fun53504 }
                    case 48:
                        r4 = r5.replace;
                        r3 = /(\r\n|\n|\r)/gm; // match new lines
                        r0 = '';
                        r2 = r4.bind(r5)(r3, r0);
                    case 77:
                        r0 = undefined;
                        r0 = r1.bind(r0)(r2);
                    case 84:
                        r0 = undefined;
                        return r0;
                }
            };
            r0 = r2.bind(r3)(r1, r0);
            r0 = undefined;
            return r0;
        };
        r4 = r1;
        r0 = new r4[r2](r3, r2);
        r0 = r0 instanceof Object ? r0 : r1;
        return r0;
    };
    var _closure1_slot4 = r5;
    r4['getImageForContactId'] = r5;
    r5 = function() { // Environment: r1
        r1 = _closure1_slot1;
        r1 = r1.NativeModules;
        r1 = r1.DCDFriendFinderManager;
        var _closure2_slot0 = r1;
        r1 = global;
        r2 = r1.Promise;
        r1 = r2.prototype;
        r1 = Object.create(r1, {constructor: {value: r2}});
        r3 = function(a0) { // Environment: r0
            r1 = a0;
            var _closure3_slot0 = r1;
            r2 = _closure2_slot0;
            r1 = r2.isComposeSupported;
            r0 = function(a0) { // Environment: r0
                r2 = _closure3_slot0;
                r0 = undefined;
                r1 = a0;
                r1 = r2.bind(r0)(r1);
                return r0;
            };
            r0 = r1.bind(r2)(r0);
            r0 = undefined;
            return r0;
        };
        r4 = r1;
        r0 = new r4[r2](r3, r2);
        r0 = r0 instanceof Object ? r0 : r1;
        return r0;
    };
    r4['isComposeSupported'] = r5;
    r1 = function(a0, a1, a2) { // Environment: r1
        r3 = a0;
        r0 = a1;
        var _closure2_slot0 = r0;
        r0 = a2;
        var _closure2_slot1 = r0;
        r0 = {};
        var _closure2_slot2 = r0;
        r2 = r3.forEach;
        r0 = function(a0) { // Environment: r1
            _fun53509: for(var _fun53509_ip = 0; ; ) switch(_fun53509_ip) {
                case 0:
                    r0 = a0;
                    r4 = _closure2_slot1;
                    r3 = r4.has;
                    r2 = r0.visibility;
                    r2 = r3.bind(r4)(r2);
                    if(!r2) { _fun53509_ip = 66; continue _fun53509 }
                case 29:
                    r1 = _closure2_slot0;
                    r0 = r0.contactMethod;
                    r0 = r1[r0];
                    r2 = r0.deviceContactIds;
                    r1 = r2.forEach;
                    r0 = function(a0) { // Environment: r0
                        _fun53510: for(var _fun53510_ip = 0; ; ) switch(_fun53510_ip) {
                case 0:
                            r2 = a0;
                            r1 = _closure2_slot2;
                            r0 = r1[r2];
                            r4 = null;
                            r3 = 0;
                            if(!(r4 != r0)) { _fun53510_ip = 25; continue _fun53510 }
                case 22:
                            r3 = r0;
                case 25:
                            r0 = 1;
                            r0 = r3 + r0;
                            r1[r2] = r0;
                            r0 = undefined;
                            return r0;
                        }
                    };
                    r0 = r1.bind(r2)(r0);
                case 66:
                    r0 = undefined;
                    return r0;
            }
        };
        r0 = r2.bind(r3)(r0);
        r0 = global;
        r0 = r0.Set;
        r2 = r0.prototype;
        r2 = Object.create(r2, {constructor: {value: r0}});
        r5 = r2;
        r0 = new r5[r0](r4);
        r0 = r0 instanceof Object ? r0 : r2;
        var _closure2_slot3 = r0;
        r2 = r3.forEach;
        r1 = function(a0) { // Environment: r1
            r1 = a0;
            var _closure3_slot0 = r1;
            r2 = _closure2_slot0;
            r1 = r1.contactMethod;
            r1 = r2[r1];
            r2 = r1.deviceContactIds;
            r1 = r2.forEach;
            r0 = function(a0) { // Environment: r0
                _fun53512: for(var _fun53512_ip = 0; ; ) switch(_fun53512_ip) {
                    case 0:
                        r2 = _closure2_slot2;
                        r1 = a0;
                        r2 = r2[r1];
                        r1 = 1;
                        if(!(!(r2 > r1))) { _fun53512_ip = 25; continue _fun53512 }
                    case 21:
                        r1 = undefined;
                        return r1;
                    case 25:
                        r2 = _closure2_slot3;
                        r1 = r2.add;
                        r0 = _closure3_slot0;
                        r0 = r0.contactMethod;
                        r0 = r1.bind(r2)(r0);
                        r0 = false;
                        return r0;
                }
            };
            r0 = r1.bind(r2)(r0);
            r0 = undefined;
            return r0;
        };
        r1 = r2.bind(r3)(r1);
        return r0;
    };
    r4['getContactMethodsForLabels'] = r1;
    r1 = 3;
    r1 = r3[r1];
    r3 = r2.bind(r0)(r1);
    r2 = r3.fileFinishedImporting;
    r1 = 'modules/friend_finder/native/FriendFinderUtils.tsx';
    r1 = r2.bind(r3)(r1);
    return r0;
};
r6 = 5243;
r5 = [5, 18, 25, 2];
r5 = r8.bind(r2)(r7, r6, r5);
r8 = r0.__d;