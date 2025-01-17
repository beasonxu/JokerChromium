
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/omnibox/browser/autocomplete_match_type.h

package org.chromium.chrome.browser.omnibox;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    OmniboxSuggestionType.URL_WHAT_YOU_TYPED, OmniboxSuggestionType.HISTORY_URL,
    OmniboxSuggestionType.HISTORY_TITLE, OmniboxSuggestionType.HISTORY_BODY,
    OmniboxSuggestionType.HISTORY_KEYWORD, OmniboxSuggestionType.NAVSUGGEST,
    OmniboxSuggestionType.SEARCH_WHAT_YOU_TYPED, OmniboxSuggestionType.SEARCH_HISTORY,
    OmniboxSuggestionType.SEARCH_SUGGEST, OmniboxSuggestionType.SEARCH_SUGGEST_ENTITY,
    OmniboxSuggestionType.SEARCH_SUGGEST_TAIL, OmniboxSuggestionType.SEARCH_SUGGEST_PERSONALIZED,
    OmniboxSuggestionType.SEARCH_SUGGEST_PROFILE, OmniboxSuggestionType.SEARCH_OTHER_ENGINE,
    OmniboxSuggestionType.EXTENSION_APP_DEPRECATED, OmniboxSuggestionType.CONTACT_DEPRECATED,
    OmniboxSuggestionType.BOOKMARK_TITLE, OmniboxSuggestionType.NAVSUGGEST_PERSONALIZED,
    OmniboxSuggestionType.CALCULATOR, OmniboxSuggestionType.CLIPBOARD_URL,
    OmniboxSuggestionType.VOICE_SUGGEST, OmniboxSuggestionType.PHYSICAL_WEB_DEPRECATED,
    OmniboxSuggestionType.PHYSICAL_WEB_OVERFLOW_DEPRECATED,
    OmniboxSuggestionType.TAB_SEARCH_DEPRECATED, OmniboxSuggestionType.DOCUMENT_SUGGESTION,
    OmniboxSuggestionType.PEDAL, OmniboxSuggestionType.CLIPBOARD_TEXT,
    OmniboxSuggestionType.CLIPBOARD_IMAGE, OmniboxSuggestionType.TILE_SUGGESTION,
    OmniboxSuggestionType.TILE_NAVSUGGEST, OmniboxSuggestionType.NUM_TYPES
})
@Retention(RetentionPolicy.SOURCE)
public @interface OmniboxSuggestionType {
  int URL_WHAT_YOU_TYPED = 0;
  int HISTORY_URL = 1;
  int HISTORY_TITLE = 2;
  int HISTORY_BODY = 3;
  int HISTORY_KEYWORD = 4;
  /**
   * input.
   */
  int NAVSUGGEST = 5;
  int SEARCH_WHAT_YOU_TYPED = 6;
  /**
   * default engine).
   */
  int SEARCH_HISTORY = 7;
  /**
   * containing the input.
   */
  int SEARCH_SUGGEST = 8;
  /**
   * query that doesn't fall into one of the more specific suggestion categories below.
   */
  int SEARCH_SUGGEST_ENTITY = 9;
  int SEARCH_SUGGEST_TAIL = 10;
  /**
   * tail of the query.
   */
  int SEARCH_SUGGEST_PERSONALIZED = 11;
  int SEARCH_SUGGEST_PROFILE = 12;
  /**
   * Google+ profile.
   */
  int SEARCH_OTHER_ENGINE = 13;
  int EXTENSION_APP_DEPRECATED = 14;
  /**
   * contains the input (deprecated).
   */
  int CONTACT_DEPRECATED = 15;
  /**
   * (deprecated).
   */
  int BOOKMARK_TITLE = 16;
  /**
   * input.
   */
  int NAVSUGGEST_PERSONALIZED = 17;
  int CALCULATOR = 18;
  int CLIPBOARD_URL = 19;
  int VOICE_SUGGEST = 20;
  /**
   * indicates a search from voice recognizer.
   */
  int PHYSICAL_WEB_DEPRECATED = 21;
  /**
   * (deprecated).
   */
  int PHYSICAL_WEB_OVERFLOW_DEPRECATED = 22;
  /**
   * Physical Web nearby URLs (deprecated).
   */
  int TAB_SEARCH_DEPRECATED = 23;
  /**
   * URL or title, via HQP (deprecated).
   */
  int DOCUMENT_SUGGESTION = 24;
  int PEDAL = 25;
  int CLIPBOARD_TEXT = 26;
  int CLIPBOARD_IMAGE = 27;
  int TILE_SUGGESTION = 28;
  int TILE_NAVSUGGEST = 29;
  int NUM_TYPES = 30;
}
