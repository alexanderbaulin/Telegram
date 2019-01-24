package org.telegram;


import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

public class SubscribeChannelUtil {
    public static final String test = "test";
    public static boolean isSubscribed = true;
    public static final String subscribeEco = "subscribeEco";


    public static void subscribeChannel(final int channel_id, final String channel_name) {
         MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
         messagesController.subscribeChannel(channel_id, channel_name);
    }


}
