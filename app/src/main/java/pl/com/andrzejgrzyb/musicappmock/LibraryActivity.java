package pl.com.andrzejgrzyb.musicappmock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        ButterKnife.bind(this);
    }
    @OnClick({R.id.home_button, R.id.now_playing_button, R.id.music_store_button, R.id.search_button})
    public void buttonClicked(Button button) {
        Class activityToRun = null;
        switch (button.getId()) {
            case R.id.home_button:
                activityToRun = MainActivity.class;
                break;
            case R.id.now_playing_button:
                activityToRun = NowPlayingActivity.class;
                break;
            case R.id.music_store_button:
                activityToRun = MusicStoreActivity.class;
                break;
            case R.id.search_button:
                activityToRun = SearchActivity.class;
                break;
        }
        Intent intent = new Intent(this, activityToRun);
        startActivity(intent);
    }
}
