package brain.brainX.BrainTongue;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.ExecutionException;

public class GameLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_levels);


        Button button_punctuation_game_levels = (Button)findViewById(R.id.button_punctuation_game_levels);
        button_punctuation_game_levels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, GameLevels_punctuation.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });


        Button button_words_game_levels =(Button)findViewById(R.id.button_words_game_levels);
        button_words_game_levels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, GameLevels_words.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });

        Button button_accent_game_levels =(Button)findViewById(R.id.button_accents_game_levels);
        button_accent_game_levels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, GameLevels_accents.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });


        Button button_different1_game_levels =(Button)findViewById(R.id.button_different_game_levels_two);
        button_different1_game_levels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, GameLevels_different1.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });


        Button button_different2_game_levels =(Button)findViewById(R.id.button_different_game_levels_two);
        button_different2_game_levels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, GameLevels_different2.class);
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
}
