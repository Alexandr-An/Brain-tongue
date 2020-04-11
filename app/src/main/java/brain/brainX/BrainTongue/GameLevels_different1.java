package brain.brainX.BrainTongue;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels_different1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_levels_different1);

        Button button_backDifferent1_Game_levels = (Button)findViewById(R.id.button_different1_back_game_levels);
        button_backDifferent1_Game_levels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels_different1.this, GameLevels.class);
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
            Intent intent = new Intent(GameLevels_different1.this, GameLevels.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }
}
