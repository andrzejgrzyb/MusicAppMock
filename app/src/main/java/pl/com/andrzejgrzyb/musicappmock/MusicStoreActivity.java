package pl.com.andrzejgrzyb.musicappmock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MusicStoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_store);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.home_button)
    public void buttonClicked() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
