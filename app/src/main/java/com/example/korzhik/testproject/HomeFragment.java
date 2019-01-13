package com.example.korzhik.testproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {//начальный экран
    private ConstraintLayout c;
    String name = "name";
    ConstraintLayout exs[] = new ConstraintLayout[10];
    View supView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        supView = inflater.inflate(R.layout.fragment_home, container, false);
        exs[0] = supView.findViewById(R.id.ex_1);
        exs[1] = supView.findViewById(R.id.ex_2);
        exs[2] = supView.findViewById(R.id.ex_3);
        exs[3] = supView.findViewById(R.id.ex_4);
        exs[4] = supView.findViewById(R.id.ex_5);
        exs[5] = supView.findViewById(R.id.ex_6);
        exs[6] = supView.findViewById(R.id.ex_7);
        exs[7] = supView.findViewById(R.id.ex_8);
        exs[8] = supView.findViewById(R.id.ex_9);
        exs[9] = supView.findViewById(R.id.ex_10);

        for(int i=0;i<10;++i){
            exs[i].setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), QuestActivity.class);
                    intent.putExtra(QuestActivity.KEY_NAME, name);
                    startActivity(intent);
                }
            });
        }
        return supView;
    }
}
