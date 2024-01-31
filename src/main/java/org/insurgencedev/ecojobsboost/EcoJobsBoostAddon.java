package org.insurgencedev.ecojobsboost;

import org.insurgencedev.ecojobsboost.listeners.JobExperienceGainListener;
import org.insurgencedev.insurgencesets.api.addon.ISetsAddon;
import org.insurgencedev.insurgencesets.api.addon.InsurgenceSetsAddon;
import org.insurgencedev.insurgencesets.libs.fo.Common;

@ISetsAddon(name = "EcoJobsBoost", version = "1.0.2", author = "Insurgence Dev Team", description = "Boost the job experience earned from EcoJobs")
public class EcoJobsBoostAddon extends InsurgenceSetsAddon {

    @Override
    public void onAddonReloadablesStart() {
        if (Common.doesPluginExist("EcoJobs")) {
            registerEvent(new JobExperienceGainListener());
        }
    }
}
