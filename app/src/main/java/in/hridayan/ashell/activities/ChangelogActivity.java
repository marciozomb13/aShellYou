package in.hridayan.ashell.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import in.hridayan.ashell.R;
import in.hridayan.ashell.adapters.ChangelogAdapter;
import in.hridayan.ashell.utils.ChangelogItem;
import java.util.ArrayList;
import java.util.List;

public class ChangelogActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_changelog);

    int statusBarColor = getColor(R.color.StatusBar);
    double brightness = Color.luminance(statusBarColor);
    boolean isLightStatusBar = brightness > 0.5;

    View decorView = getWindow().getDecorView();
    if (isLightStatusBar) {
      decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
    }
    ImageView imageView = findViewById(R.id.arrow_back);

    OnBackPressedDispatcher dispatcher = getOnBackPressedDispatcher();
    imageView.setOnClickListener(v -> dispatcher.onBackPressed());

    RecyclerView recyclerViewChangelogs = findViewById(R.id.recycler_view_changelogs);

    List<ChangelogItem> changelogItems = new ArrayList<>();

    changelogItems.add(
        new ChangelogItem(
            "Version 3.4.0",
            "\n\n• Added a Paste button so that you can copy and paste commands quickly.\n\n• Added Error indicators in the text input field.\n\n• Improved Navigation Bar visibility logic.\n\n• Fixed an issue where switches misbehaves under certain situations.\n\n• Fixed add bookmark icon visibility in various contrast levels .\n\n• A lot of code optimisation. App now opens a lot faster than before.\n\n• App will stay in background and won't restart every time you close the app by just pressing the back button/gesture."));

    changelogItems.add(
        new ChangelogItem(
            "Version 3.3.0",
            "\n\n• Added bookmarks , history and command suggestions to OTG\n\n• Added maximum bookmarks limit.\n\n• Added option to override maximum bookmarks limit.\n\n• A lot of bug fixes.\n\n• Improved some UI handling.\n\n• A lot of code optimisation."));

    changelogItems.add(
        new ChangelogItem(
            "Version 3.2.0",
            "\n\n• A lot of UI related improvements.\n\n• Added chips that indicate current ADB working mode.\n\n• A lot of code optimisation."));

    changelogItems.add(
        new ChangelogItem(
            "Version 3.1.0",
            "\n\n• Improvements to ADB OTG after initial release.\n\n• Some UI and logic adjustments to accomodate the new otg feature."));

    changelogItems.add(
        new ChangelogItem(
            "Version 3.0.0",
            "\n\n• Added ADB THROUGH OTG support.\n\n *** You will be able to run ADB commands on other devices using aShellYou by connecting the other device using an OTG cable ***"));

    changelogItems.add(
        new ChangelogItem(
            "Version 2.0.2",
            "\n\n• Removed unnecessary code and resources.\n\n• Minor UI changes."));

    changelogItems.add(
        new ChangelogItem(
            "Version 2.0.1",
            "\n\n• Removed unnecessary code and resources.\n\n• Minor UI changes."));

    changelogItems.add(
        new ChangelogItem(
            "Version 2.0.0",
            "\n\n• Changed app name to aShell You.\n\n• Added predictive back animations for supporting devices.\n\n• Added confirmation dialog popup before clearing screen.\n\n• Fixed StatusBar elements not properly visible in Light mode.\n\n• App is much more smooth now.\n ~ Reduced app size and optimised code.\n\n• Added themed icon for launchers that support themed icons.\n\n• Minor UI changes."));

    changelogItems.add(
        new ChangelogItem(
            "Version 1.3.0",
            "\n\n• Revamped Settings panel.\n\n• Added Double Tap to instant scroll to top and bottom positions in shell output view.\n\n• Minor UI fixes."));

    changelogItems.add(
        new ChangelogItem(
            "Version 1.2.0",
            "\n\n• Added Settings panel.\n\n• Added option to disable smooth scroll in shell output.\n\n• Fixed major bugs :\n\n    ~ Crash while changing device theme.\n\n    ~ Crash while trying to save large shell output . eg : output of 'pm' command."));

    changelogItems.add(
        new ChangelogItem(
            "Version 1.1.1", "\n\n• Replaced some deprecated api.\n\n• Minor UI changes."));

    changelogItems.add(
        new ChangelogItem(
            "Version 1.1.0",
            "\n\n• Added Scroll To Top and Scroll To Bottom buttons.\n\n• Added Click keyboard Enter key to Send command.\n\n• Added some commands.\n\n• Updated dependencies to include latest material you library.\n\n• Minor UI changes."));

    changelogItems.add(
        new ChangelogItem(
            "Version 1.0.0",
            "\n\n• Added some more command examples.\n\n• Minor UI changes.\n\n• Changed package name to avoid version confusion with original app."));

    changelogItems.add(
        new ChangelogItem(
            "Version 0.9.1",
            "\n\n• Added changelogs into the app.\n\n• Added highlighted shell output.\n\n• Minor UI changes."));

    changelogItems.add(
        new ChangelogItem(
            "Version 0.9",
            "\n\n• Added dynamic material theming.\n\n• Revamped whole UI to give a fresh look."));

    ChangelogAdapter adapter = new ChangelogAdapter(changelogItems, this);
    recyclerViewChangelogs.setAdapter(adapter);
    recyclerViewChangelogs.setLayoutManager(new LinearLayoutManager(this));
  }
}
