package brain.brainX.BrainTongue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class Level1_accents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);
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
    }
}
