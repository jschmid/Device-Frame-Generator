/*
 * Copyright 2013 Prateek Srivastava (@f2prateek)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.f2prateek.dfg.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.f2prateek.dfg.model.DeviceProvider;

import static com.f2prateek.dfg.util.LogUtils.makeLogTag;

public class DeviceFragmentPagerAdapter extends FragmentStatePagerAdapter {

    private static final String LOGTAG = makeLogTag(DeviceFragmentPagerAdapter.class);

    public DeviceFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return DeviceFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return DeviceProvider.getDevices().size();
    }
}
