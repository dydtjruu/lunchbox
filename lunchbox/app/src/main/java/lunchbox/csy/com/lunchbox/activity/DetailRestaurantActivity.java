package lunchbox.csy.com.lunchbox.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import lunchbox.csy.com.lunchbox.R;
import lunchbox.csy.com.lunchbox.base.AbstBaseActivity;
import lunchbox.csy.com.lunchbox.commons.Common;

//가람담당_식당상세화면
public class DetailRestaurantActivity extends AbstBaseActivity {

    @Override
    protected void onCreateChild() {
        setContentView(R.layout.activity_detail_restaurant);
        Common.showLogD("test log debug");
    }

    @Override
    protected void onDestoryChild() {

    }

    @Override
    public void onClickListener(View v) {
        switch (v.getId()) {
            case R.id.llBack:
                showToastShort("test toast");
                break;
                default:
                    break;
        }
    }
}
