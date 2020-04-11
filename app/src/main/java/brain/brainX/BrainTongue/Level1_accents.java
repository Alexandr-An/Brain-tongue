package brain.brainX.BrainTongue;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;

public class Level1_accents extends AppCompatActivity {
Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);
        //создать переменную text_levels
        TextView text_levels = (TextView)findViewById(R.id.text_levels);
        text_levels.setText(R.string.Level1_accents);


         //скругление углов для верхней картин
        final ImageView imgTop = (ImageView)findViewById(R.id.img_top);
        imgTop.setClipToOutline(true);

        //скругление углов для нжней картин
        final ImageView imgBottom = (ImageView)findViewById(R.id.img_bottom);
        imgBottom.setClipToOutline(true);

        //убрать строку состояния начало
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //убрать строку состояния конец

        //вызов диалогового окна в начале игры начало
        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);//скрыть заголовок
        dialog.setContentView(R.layout.preview_dialog);//путь к макету диалогового окна
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));//прозрачный фон диалогового окна
        dialog.setCancelable(false);//окно нельзя закрыть кнопкой назад
        //кнопка которая закрывает диалоговое окно начало
        TextView buttonClose = (TextView)dialog.findViewById(R.id.button_close_dialog);
        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level1_accents.this, GameLevels_accents.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }dialog.dismiss();//закрыть диалоговое окно
            }
        });
        //кнопка которая закрывает диалоговое окно конец

        //кнопка продолжить в диалоговом окне начало
        Button button_continue = (Button)dialog.findViewById(R.id.button_continue_dialog);
        button_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          dialog.dismiss();//закрываю диалоговое окно по кнопке продолжить
            }
        });
        //кнопка продолжить в диалоговом окне конец
        dialog.show();
        //вызов диалогового окна в начале игры конец

        //кнопка назад начало
//        Button button_accents_back = (Button)findViewById(R.id.button_accents_back_game_levels);
//        button_accents_back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent = new Intent(Level1_accents.this, GameLevels_accents.class);
//                    startActivity(intent);finish();
//                }catch (Exception e){
//
//                }
//            }
//        });
        //кнопка назад конец
    }
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(Level1_accents.this, GameLevels_accents.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }
}
