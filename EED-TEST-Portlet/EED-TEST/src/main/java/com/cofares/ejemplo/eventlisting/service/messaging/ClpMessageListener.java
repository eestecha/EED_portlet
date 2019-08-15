package com.cofares.ejemplo.eventlisting.service.messaging;

import com.cofares.ejemplo.eventlisting.service.ClpSerializer;
import com.cofares.ejemplo.eventlisting.service.EventLocalServiceUtil;
import com.cofares.ejemplo.eventlisting.service.EventServiceUtil;
import com.cofares.ejemplo.eventlisting.service.LocationLocalServiceUtil;
import com.cofares.ejemplo.eventlisting.service.LocationServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            EventLocalServiceUtil.clearService();

            EventServiceUtil.clearService();
            LocationLocalServiceUtil.clearService();

            LocationServiceUtil.clearService();
        }
    }
}
