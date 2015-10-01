package com.app.gdo.alarmfunproject.contact;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.gdo.alarmfunproject.R;
import com.app.gdo.alarmfunproject.user.UserEntity;

import java.util.ArrayList;

/**
 * Created by laptop88 on 7/26/2015.
 */
public class ContactRecycleViewAdapter extends RecyclerView
        .Adapter<ContactRecycleViewAdapter
        .DataObjectHolder> {
    private static String LOG_TAG = "MyRecyclerViewAdapter";
    private ArrayList<UserEntity> mDataset;
    private static MyClickListener myClickListener;
    private int mNumTab;

    public static class DataObjectHolder extends RecyclerView.ViewHolder
            implements View
            .OnClickListener {
        TextView textViewContact;
        ImageView imageViewPhone, imageViewMessage, imageViewEmail, imageViewAddress, imageViewSlack;

        public DataObjectHolder(View itemView) {
            super(itemView);
            textViewContact = (TextView) itemView.findViewById(R.id.textViewContact);
            imageViewPhone = (ImageView) itemView.findViewById(R.id.imageViewPhone);
            imageViewMessage = (ImageView) itemView.findViewById(R.id.imageViewMessage);
            imageViewEmail = (ImageView) itemView.findViewById(R.id.imageViewEmail);
            imageViewAddress = (ImageView) itemView.findViewById(R.id.imageViewAddress);
            imageViewSlack = (ImageView) itemView.findViewById(R.id.imageViewSlack);

            imageViewPhone.setOnClickListener(this);
            imageViewMessage.setOnClickListener(this);
            imageViewEmail.setOnClickListener(this);
            imageViewAddress.setOnClickListener(this);
            imageViewSlack.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
//            myClickListener.onItemClick(getPosition(), v);
        }
    }

    public void setOnItemClickListener(MyClickListener myClickListener) {
        this.myClickListener = myClickListener;
    }

    public ContactRecycleViewAdapter(ArrayList<UserEntity> myDataset, int numTab) {
        mDataset = myDataset;
        mNumTab = numTab;
    }

    @Override
    public DataObjectHolder onCreateViewHolder(ViewGroup parent,
                                               int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_contact, parent, false);

        DataObjectHolder dataObjectHolder = new DataObjectHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(DataObjectHolder holder, int position) {
        UserEntity userEntity = mDataset.get(position);
        if (mNumTab == 0) {
            holder.textViewContact.setText(userEntity.getUserName() + "\n" + userEntity.getUserMobile() + "\n" + userEntity.getUserPhone());
            holder.imageViewEmail.setVisibility(View.GONE);
            holder.imageViewAddress.setVisibility(View.GONE);
            holder.imageViewSlack.setVisibility(View.GONE);
        } else if (mNumTab == 1) {
            holder.textViewContact.setText(userEntity.getUserName() + "\n" + userEntity.getUserEmail());
            holder.imageViewPhone.setVisibility(View.GONE);
            holder.imageViewMessage.setVisibility(View.GONE);
            holder.imageViewSlack.setVisibility(View.GONE);
            holder.imageViewAddress.setVisibility(View.GONE);
        } else if (mNumTab == 2) {
            holder.textViewContact.setText(userEntity.getUserName() + "\n" + userEntity.getUserAddress());
            holder.imageViewPhone.setVisibility(View.GONE);
            holder.imageViewMessage.setVisibility(View.GONE);
            holder.imageViewSlack.setVisibility(View.GONE);
            holder.imageViewEmail.setVisibility(View.GONE);
        } else if (mNumTab == 3) {
            holder.textViewContact.setText(userEntity.getUserName() + "\n" + userEntity.getUserSlack());
            holder.imageViewPhone.setVisibility(View.GONE);
            holder.imageViewMessage.setVisibility(View.GONE);
            holder.imageViewSlack.setVisibility(View.VISIBLE);
            holder.imageViewEmail.setVisibility(View.GONE);
            holder.imageViewAddress.setVisibility(View.GONE);
        }
        holder.imageViewPhone.setOnClickListener(mOnClickPhoneView);
        holder.imageViewMessage.setOnClickListener(mOnClickMessageView);
    }

    //event open call screen.
    View.OnClickListener mOnClickPhoneView = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        }
    };

    //event open message screen.
    View.OnClickListener mOnClickMessageView = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    //add item to list user.
    public void addItem(UserEntity dataObj, int index) {
        mDataset.add(dataObj);
        notifyItemInserted(index);
    }

    //remove item from list user.
    public void deleteItem(int index) {
        mDataset.remove(index);
        notifyItemRemoved(index);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public interface MyClickListener {
        public void onItemClick(int position, View v);
    }

    /**
     * open call screen with fill number phone.
     *
     * @param number: number fill at call screen.
     */
//    public void openCallScreen(String number) {
//        Intent intent = new Intent(Intent.ACTION_DIAL);
//        intent.setData(Uri.parse("tel:" + number));
//        startActivity(intent);
//    }

    /**
     * open call screen with fill number phone.
     *
     * @param number: number fill at call screen.
    //     */
//    public void openMessageScreen(String number, String message) {
//        Uri uri = Uri.parse("smsto:" + number);
//        Intent it = new Intent(Intent.ACTION_SENDTO, uri);
//        it.putExtra("sms_body", message);
//        startActivity(it);
//    }
}