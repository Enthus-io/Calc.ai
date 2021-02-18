package net.enthusio.calc.ai.utils;


import android.app.Activity;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.res.Resources;

import net.enthusio.calc.ai.R;

public class UpdaterUtils {
    private Activity activity;
    private boolean checkingUpdateing = false;
    private static UpdaterUtils updaterUtils;
    private Resources resources;
    private String text_check_update;
    private String text_check_update_failed;
    private String text_latest;
    private String text_new_ver;
    private String text_downloading_update;

  public static UpdaterUtils getInstance() {
    return updaterUtils;
  }

  public UpdaterUtils(Activity activity) {
    this.activity = activity;
    updaterUtils = this;
    initResources();
  }

    private void initResources() {
        resources = activity.getResources();
        text_check_update = resources.getString(R.string.text_check_update);
        text_check_update_failed = resources.getString(R.string.text_check_update_failed);
        text_latest = resources.getString(R.string.text_latest);
        text_new_ver = resources.getString(R.string.text_new_ver);
        text_downloading_update = resources.getString(R.string.text_new_ver);
    }
}
