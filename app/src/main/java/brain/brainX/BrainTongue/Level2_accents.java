package brain.brainX.BrainTongue;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Level2_accents extends AppCompatActivity {
Dialog dialog;
Dialog dialogEnd;


public  int top;
public int bottom;
Array array = new Array();
Random random = new Random();

public int count = 0;

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
        //устанавливаем картинку в диалоовое лкно начло
        ImageView previewimg = (ImageView)dialog.findViewById(R.id.dialog_img_preview);
        previewimg.setImageResource(R.drawable.previewimgone);
        //устанавливаем картинку в диалоовое лкно конец

        //установка описания задания начло
        TextView textviewdescription = (TextView)dialog.findViewById(R.id.textDescription);
        textviewdescription.setText(R.string.level2_accents_end);
        //установка описания задания конец

        dialog.setCancelable(false);//окно нельзя закрыть кнопкой назад
        //кнопка которая закрывает диалоговое окно начало
        TextView buttonClose = (TextView)dialog.findViewById(R.id.button_close_dialog);
        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level2_accents.this, GameLevels_accents.class);
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

        //_____________________________________________________________

        //вызов диалогового окна в конце игры начало
        dialogEnd = new Dialog(this);
        dialogEnd.requestWindowFeature(Window.FEATURE_NO_TITLE);//скрыть заголовок
        dialogEnd.setContentView(R.layout.dialogend);//путь к макету диалогового окна
        dialogEnd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));//прозрачный фон диалогового окна
        dialogEnd.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);
        dialogEnd.setCancelable(false);//окно нельзя закрыть кнопкой назад

        //интеречный факт начало
        TextView textdescriptionend = (TextView)findViewById(R.id.textdescriptionend);
        textdescriptionend.setText(R.string.level2end);
        //интеречный факт  конец
        //кнопка которая закрывает диалоговое окно начало
        TextView buttonClose22 = (TextView)dialogEnd.findViewById(R.id.button_close_dialog_end);
        buttonClose22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level2_accents.this, GameLevels_accents.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }dialogEnd.dismiss();//закрыть диалоговое окно
            }
        });
        //кнопка которая закрывает диалоговое окно конец

        //кнопка продолжить в диалоговом окне начало
        Button button_continue2 = (Button)dialogEnd.findViewById(R.id.button_continue_dialog_end);
        button_continue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level2_accents.this, GameLevels_accents.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
                dialog.dismiss();//закрываю диалоговое окно по кнопке продолжить
            }
        });
        //кнопка продолжить в диалоговом окне конец

        //вызов диалогового окна в начале игры конец
        //_____________________________________________________________

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

        //Массив для прогресса игры начало

        //Массив для прогресса игры конец
final int[] progress={
        R.id.point1,
        R.id.point2,
        R.id.point3,
        R.id.point4,
        R.id.point5,
        R.id.point6,
        R.id.point7,
        R.id.point8,
        R.id.point9,
        R.id.point10,
};
        //подключить анимацию начало
        final Animation a = AnimationUtils.loadAnimation(Level2_accents.this, R.anim.alpha);
        //подключить анимацию конец

        top = random.nextInt(10);
        imgTop.setImageResource(array.images1[top]);//достать из массива изображение


        bottom = random.nextInt(10);

        while(top == bottom){
            bottom = random.nextInt(10);
        }
         imgBottom.setImageResource(array.images1[bottom]);


        //обраблотка нажатия на вверхнюю картинку начало
        imgTop.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                //условие касания картинки начало
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    //если конснулся картинки начало
                    imgBottom.setEnabled(false);//блокируем нижнюю картинку
                    if(top > bottom){
                        imgTop.setImageResource(R.drawable.img_true);
                    }else{
                        imgTop.setImageResource(R.drawable.img_false);
                        //если коснулся картинки конец
                    }
                }else if (event.getAction()==MotionEvent.ACTION_UP){
                   //если отпустил палец начало
                    if (top > bottom){
                        //если левая кртинка больше
                        if (count < 10){
                            count++;
                        }
                        //закрашиваем прогресс серым цветом начало
                        for (int i = 0; i < 10; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }
                        //закрашиваем прогресс серым цветом конец

                        //определяем правильный ответ  и закрашиваем зеленым начало
                        for (int i = 0; i < count ; i++) {
                          TextView tv = findViewById(progress[i]);
                          tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                        //определяем правильный ответ  и закрашиваем зеленым конец
                    }else{
                      //  если левая картинка меньше
                        if (count> 0){
                            if (count == 1){
                                count =0;
                            }else {
                                count--;
                            }
                        }
                        //закрашиваем прогресс серым цветом начало
                        for (int i = 0; i < 9; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }
                        //закрашиваем прогресс серым цветом конец

                        //определяем правильный ответ  и закрашиваем зеленым начало
                        for (int i = 0; i < count ; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                        //определяем правильный ответ  и закрашиваем зеленым конец

                    }
                   //если отпустил палец конец
                    if (count==10){
                        //ВЫХОД ИЗ УРОВНЯ
                        dialogEnd.show();
                    }else {
                        top = random.nextInt(10);
                        imgTop.setImageResource(array.images1[top]);//достать из массива изображение
                        imgTop.startAnimation(a);

                        bottom = random.nextInt(10);

                        while(top == bottom){
                            bottom = random.nextInt(10);
                        }
                        imgBottom.setImageResource(array.images1[bottom]);
                        imgBottom.startAnimation(a);

                        imgBottom.setEnabled(true);
                    }
                }
                //условие касания картинки конец
                return true;
            }
        });
        //обраблотка нажатия на вверхнюю картинку конец



        //обраблотка нажатия на вверхнюю картинку начало
        imgBottom.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                //условие касания картинки начало
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    //если конснулся картинки начало
                    imgTop.setEnabled(false);//блокируем нижнюю картинку
                    if(top < bottom){
                        imgBottom.setImageResource(R.drawable.img_true);
                    }else{
                        imgBottom.setImageResource(R.drawable.img_false);
                        //если коснулся картинки конец
                    }
                }else if (event.getAction()==MotionEvent.ACTION_UP){
                    //если отпустил палец начало
                    if (top < bottom){
                        //если левая кртинка больше
                        if (count < 10){
                            count++;
                        }
                        //закрашиваем прогресс серым цветом начало
                        for (int i = 0; i < 10; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }
                        //закрашиваем прогресс серым цветом конец

                        //определяем правильный ответ  и закрашиваем зеленым начало
                        for (int i = 0; i < count ; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                        //определяем правильный ответ  и закрашиваем зеленым конец
                    }else{
                        //  если левая картинка меньше
                        if (count> 0){
                            if (count == 1){
                                count =0;
                            }else {
                                count--;
                            }
                        }
                        //закрашиваем прогресс серым цветом начало
                        for (int i = 0; i < 9; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }
                        //закрашиваем прогресс серым цветом конец

                        //определяем правильный ответ  и закрашиваем зеленым начало
                        for (int i = 0; i < count ; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                        //определяем правильный ответ  и закрашиваем зеленым конец

                    }
                    //если отпустил палец конец
                    if (count==10){
                        //ВЫХОД ИЗ УРОВНЯ
                        dialogEnd.show();
                    }else {
                        top = random.nextInt(10);
                        imgTop.setImageResource(array.images1[top]);//достать из массива изображение
                        imgTop.startAnimation(a);

                        bottom = random.nextInt(10);

                        while(top == bottom){
                            bottom = random.nextInt(10);
                        }
                        imgBottom.setImageResource(array.images1[bottom]);
                        imgBottom.startAnimation(a);

                        imgTop.setEnabled(true);
                    }
                }
                //условие касания картинки конец
                return true;
            }
        });
        //обраблотка нажатия на вверхнюю картинку конец






    }
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(Level2_accents.this, GameLevels_accents.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }
}
