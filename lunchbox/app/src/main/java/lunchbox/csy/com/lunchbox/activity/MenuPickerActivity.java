package lunchbox.csy.com.lunchbox.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;

import lunchbox.csy.com.lunchbox.R;
import lunchbox.csy.com.lunchbox.base.AbstBaseActivity;
import lunchbox.csy.com.lunchbox.commons.Common;

//지연 메뉴룰렛구현
public class MenuPickerActivity extends AbstBaseActivity {
    @Override
    protected void onCreateChild() {
        setContentView(R.layout.activity_menu_picker);
        Common.showLogD("test MenuPickerActivity debug");

        //메뉴룰렛 테스트중
        NumberPicker menupicker=findViewById(R.id.menu_picker);
        String[] menu = new String[]{"ex1","ex2","ex3","ex4","ex5","ex6","ex7",
                "ex8","ex9","ex10","ex1","ex2","ex3","ex4","ex5","ex6","ex7","ex8","ex9","ex10"};
        menupicker.setMinValue(0);
        menupicker.setMaxValue(menu.length-1);
        menupicker.setDisplayedValues(menu);
    }

    @Override
    protected void onDestoryChild() {

    }

    @Override
    public void onClickListener(View v) {

    }

}
