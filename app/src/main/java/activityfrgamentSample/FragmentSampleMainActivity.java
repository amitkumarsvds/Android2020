package activityfrgamentSample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.myown.android2020.R;

public class FragmentSampleMainActivity extends AppCompatActivity implements View.OnClickListener {

    private FragmentTransaction fragmentTrasaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set the UI wigets
        setUiWigets();
        addFragment(new FragmentHome(), "home");


    }

    private void setUiWigets() {
        findViewById(R.id.btnHome).setOnClickListener(this);
        findViewById(R.id.btnProfile).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnHome:
                addFragment(new FragmentProfile(), "profile");
                break;
            case R.id.btnProfile:
                // addFragment(new FragmentProfile(),"profile");


                getSupportFragmentManager().popBackStack("profile", FragmentManager.POP_BACK_STACK_INCLUSIVE);
                break;
            default:
                break;
        }
    }

    private void addFragment(Fragment fragment, String tag) {
        fragmentTrasaction = getSupportFragmentManager().beginTransaction();
        fragmentTrasaction.add(R.id.frameLayout, fragment, tag);
        fragmentTrasaction.addToBackStack(tag);
        fragmentTrasaction.commit();
    }

    private void replaceFragment(Fragment fragment, String tag) {
        fragmentTrasaction = getSupportFragmentManager().beginTransaction();
        fragmentTrasaction.replace(R.id.frameLayout, fragment, tag);
        fragmentTrasaction.addToBackStack(null);
        fragmentTrasaction.commit();
    }
}
