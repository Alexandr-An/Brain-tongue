package brain.brainX.BrainTongue;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels_punctuation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_levels_punctuation);


        Button button_backPunctuation_Game_levels = (Button)findViewById(R.id.button_punctuation_back_game_levels);
        button_backPunctuation_Game_levels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels_punctuation.this, GameLevels.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });


        //убрать строку состояния начало
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //убрать строку состояния конец
    }

    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(GameLevels_punctuation.this, GameLevels.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }

    }}
