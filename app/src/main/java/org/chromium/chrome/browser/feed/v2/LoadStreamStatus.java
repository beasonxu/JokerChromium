
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/feed/core/v2/enums.h

package org.chromium.chrome.browser.feed.v2;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    LoadStreamStatus.NO_STATUS, LoadStreamStatus.LOADED_FROM_STORE,
    LoadStreamStatus.LOADED_FROM_NETWORK,
    LoadStreamStatus.LOADED_STALE_DATA_FROM_STORE_DUE_TO_NETWORK_FAILURE,
    LoadStreamStatus.DATA_IN_STORE_IS_STALE,
    LoadStreamStatus.DATA_IN_STORE_IS_STALE_TIMESTAMP_IN_FUTURE,
    LoadStreamStatus.DATA_IN_STORE_STALE_MISSED_LAST_REFRESH,
    LoadStreamStatus.FAILED_WITH_STORE_ERROR, LoadStreamStatus.NO_STREAM_DATA_IN_STORE,
    LoadStreamStatus.MODEL_ALREADY_LOADED, LoadStreamStatus.NO_RESPONSE_BODY,
    LoadStreamStatus.PROTO_TRANSLATION_FAILED,
    LoadStreamStatus.CANNOT_LOAD_FROM_NETWORK_SUPRESSED_FOR_HISTORY_DELETE_DEPRECATED,
    LoadStreamStatus.CANNOT_LOAD_FROM_NETWORK_OFFLINE,
    LoadStreamStatus.CANNOT_LOAD_FROM_NETWORK_THROTTLED,
    LoadStreamStatus.LOAD_NOT_ALLOWED_EULA_NOT_ACCEPTED,
    LoadStreamStatus.LOAD_NOT_ALLOWED_ARTICLES_LIST_HIDDEN,
    LoadStreamStatus.CANNOT_PARSE_NETWORK_RESPONSE_BODY,
    LoadStreamStatus.LOAD_MORE_MODEL_IS_NOT_LOADED,
    LoadStreamStatus.LOAD_NOT_ALLOWED_DISABLED_BY_ENTERPRISE_POLICY,
    LoadStreamStatus.NETWORK_FETCH_FAILED, LoadStreamStatus.CANNOT_LOAD_MORE_NO_NEXT_PAGE_TOKEN,
    LoadStreamStatus.DATA_IN_STORE_IS_EXPIRED, LoadStreamStatus.DATA_IN_STORE_IS_FOR_ANOTHER_USER,
    LoadStreamStatus.ABORT_WITH_PENDING_CLEAR_ALL, LoadStreamStatus.ALREADY_HAVE_UNREAD_CONTENT,
    LoadStreamStatus.NOT_A_WEB_FEED_SUBSCRIBER,
    LoadStreamStatus.ACCOUNT_TOKEN_FETCH_FAILED_WRONG_ACCOUNT,
    LoadStreamStatus.ACCOUNT_TOKEN_FETCH_TIMED_OUT, LoadStreamStatus.NETWORK_FETCH_TIMED_OUT,
    LoadStreamStatus.LOAD_NOT_ALLOWED_DISABLED, LoadStreamStatus.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface LoadStreamStatus {
  /**
   * Loading was not attempted.
   */
  int NO_STATUS = 0;
  /**
   * Final loading statuses where loading succeeds. :
   */
  int LOADED_FROM_STORE = 1;
  int LOADED_FROM_NETWORK = 2;
  int LOADED_STALE_DATA_FROM_STORE_DUE_TO_NETWORK_FAILURE = 21;
  /**
   * Statuses where data is loaded from the persistent store, but is stale.
   */
  int DATA_IN_STORE_IS_STALE = 8;
  /**
   * The timestamp for stored data is in the future, so we're treating stored data as it it is
   * stale.
   */
  int DATA_IN_STORE_IS_STALE_TIMESTAMP_IN_FUTURE = 9;
  int DATA_IN_STORE_STALE_MISSED_LAST_REFRESH = 20;
  /**
   * Failure statuses where content is not loaded.
   */
  int FAILED_WITH_STORE_ERROR = 3;
  int NO_STREAM_DATA_IN_STORE = 4;
  int MODEL_ALREADY_LOADED = 5;
  int NO_RESPONSE_BODY = 6;
  int PROTO_TRANSLATION_FAILED = 7;
  int CANNOT_LOAD_FROM_NETWORK_SUPRESSED_FOR_HISTORY_DELETE_DEPRECATED = 10;
  int CANNOT_LOAD_FROM_NETWORK_OFFLINE = 11;
  int CANNOT_LOAD_FROM_NETWORK_THROTTLED = 12;
  int LOAD_NOT_ALLOWED_EULA_NOT_ACCEPTED = 13;
  int LOAD_NOT_ALLOWED_ARTICLES_LIST_HIDDEN = 14;
  int CANNOT_PARSE_NETWORK_RESPONSE_BODY = 15;
  int LOAD_MORE_MODEL_IS_NOT_LOADED = 16;
  int LOAD_NOT_ALLOWED_DISABLED_BY_ENTERPRISE_POLICY = 17;
  int NETWORK_FETCH_FAILED = 18;
  int CANNOT_LOAD_MORE_NO_NEXT_PAGE_TOKEN = 19;
  int DATA_IN_STORE_IS_EXPIRED = 22;
  int DATA_IN_STORE_IS_FOR_ANOTHER_USER = 23;
  int ABORT_WITH_PENDING_CLEAR_ALL = 24;
  int ALREADY_HAVE_UNREAD_CONTENT = 25;
  int NOT_A_WEB_FEED_SUBSCRIBER = 26;
  int ACCOUNT_TOKEN_FETCH_FAILED_WRONG_ACCOUNT = 27;
  int ACCOUNT_TOKEN_FETCH_TIMED_OUT = 28;
  int NETWORK_FETCH_TIMED_OUT = 29;
  int LOAD_NOT_ALLOWED_DISABLED = 30;
  int MAX_VALUE = LOAD_NOT_ALLOWED_DISABLED;
}
