// Copyright 2016 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.search_engines.settings;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.ListFragment;

import org.chromium.chrome.R;
import org.chromium.components.browser_ui.settings.SettingsLauncher;

/**
 * A preference fragment for selecting a default search engine.
 * ATTENTION: User can't change search engine if it is controlled by an enterprise policy. Check
 * TemplateUrlServiceFactory.get().isDefaultSearchManaged() before launching this fragment.
 *
 * TODO(crbug.com/988877): Add on scroll shadow to action bar.
 */
public class SearchEngineSettings extends ListFragment {
    private SearchEngineAdapter mSearchEngineAdapter;

    @VisibleForTesting
    String getValueForTesting() {
        return mSearchEngineAdapter.getValueForTesting();
    }

    @VisibleForTesting
    String setValueForTesting(String value) {
        return mSearchEngineAdapter.setValueForTesting(value);
    }

    @VisibleForTesting
    String getKeywordFromIndexForTesting(int index) {
        return mSearchEngineAdapter.getKeywordForTesting(index);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.search_engine_settings);
        createAdapterIfNecessary();
        setListAdapter(mSearchEngineAdapter);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ListView listView = getListView();
        listView.setDivider(null);
        listView.setItemsCanFocus(true);
    }

    @Override
    public void onStart() {
        super.onStart();
        mSearchEngineAdapter.start();
    }

    @Override
    public void onStop() {
        super.onStop();
        mSearchEngineAdapter.stop();
    }

    /**
     * Sets a runnable that disables auto search engine switching.
     * @param runnable Runnable to disable auto search engine switching.
     */
    public void setDisableAutoSwitchRunnable(Runnable runnable) {
        createAdapterIfNecessary();
        mSearchEngineAdapter.setDisableAutoSwitchRunnable(runnable);
    }

    /**
     * Sets an instance of SettingsLauncher in a fragment.
     *
     * @param settingsLauncher The SettingsLauncher that is injected.
     */
    public void setSettingsLauncher(SettingsLauncher settingsLauncher) {
        createAdapterIfNecessary();
        mSearchEngineAdapter.setSettingsLauncher(settingsLauncher);
    }

    private void createAdapterIfNecessary() {
        if (mSearchEngineAdapter != null) return;
        mSearchEngineAdapter = new SearchEngineAdapter(getActivity());
    }
}
