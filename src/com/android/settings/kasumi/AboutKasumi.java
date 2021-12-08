package com.android.settings.kasumi;

import android.content.Context;
import android.os.Bundle;

import com.android.internal.logging.MetricsProto.MetricsEvent;
import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class AboutKasumi extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.kasumi_about_info);
    getActivity().getActionBar().setTitle("About Project Kasumi");
    }

    @Override
    protected int getMetricsCategory() {
        return MetricsEvent.OWLSNEST;
    }
}
