package com.app.gdo.alarmfunproject.contact;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.gdo.alarmfunproject.R;
import com.app.gdo.alarmfunproject.user.UserEntity;

import java.util.ArrayList;

public class ContactFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;
    private RecyclerView mRecyclerViewContact;
    private ContactRecycleViewAdapter mContactRecycleViewAdapter;
    private ArrayList<UserEntity> userEntities = new ArrayList<>();

    public static ContactFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        ContactFragment fragment = new ContactFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    // Inflate the fragment layout we defined above for this fragment
    // Set the associated text for the title
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        mRecyclerViewContact = (RecyclerView) view.findViewById(R.id.recyclerViewContact);
        userEntities = getDataSet();
        mContactRecycleViewAdapter = new ContactRecycleViewAdapter(userEntities, mPage);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerViewContact.setLayoutManager(layoutManager);
        mContactRecycleViewAdapter.setOnItemClickListener(new ContactRecycleViewAdapter.MyClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                switch (v.getId()) {
                    case R.id.imageViewPhone:
//                        openCallScreen(userEntities.get(position).getUserPhone());
                        break;
                    case R.id.imageViewMessage:
//                        openMessageScreen(userEntities.get(position).getUserPhone(), "Nhap redmine nhe ban.");
                        break;
                    case R.id.imageViewEmail:
                        break;
                    case R.id.imageViewAddress:
                        break;
                    case R.id.imageViewSlack:
                        break;
                    default:
                        break;
                }
            }
        });
        mRecyclerViewContact.setAdapter(mContactRecycleViewAdapter);

        return view;
    }

    private ArrayList<UserEntity> getDataSet() {
        ArrayList<UserEntity> listResult = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            UserEntity userEntity = new UserEntity("name" + i, "role" + i, "" + i, "mobile" + i, "023502092" + i, "email@" + i, "address" + i, "slack@" + i);
            listResult.add(userEntity);
        }
        return listResult;
    }


}