package mad.com.its02.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.TextView;

import mad.com.its02.R;

/**
 * Created by aurora on 2017/11/9.
 */

public class CheckFragment extends Fragment {
    private TextView tv_check;
    private Spinner spinner_time_up_or_down;
    private FrameLayout fl_check_list;
    private TextView tvCheck;
    private Spinner spinnerTimeUpOrDown;
    private FrameLayout flCheckList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.check_list_fragment, container, false);



    }

    private void initView() {
        tvCheck = (TextView) getActivity().findViewById(R.id.tv_check);
        spinnerTimeUpOrDown = (Spinner) getActivity().findViewById(R.id.spinner_time_up_or_down);
        flCheckList = (FrameLayout) getActivity().findViewById(R.id.fl_check_list);
    }
}
