package com.example.aniket.businga;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class NotificationDetails {
    Context mctx;
    static List<NotificationsItemDetails> list = new ArrayList<>();
    NotificationDetails(Context mctx){
        this.mctx = mctx;
    }

    public void add_notification(String header, String body)
    {
        list.add(new NotificationsItemDetails(header, body));
    }

}