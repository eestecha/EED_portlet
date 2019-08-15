package com.cofares.ejemplo.eventlisting.model.impl;

import com.cofares.ejemplo.eventlisting.model.Event;
import com.cofares.ejemplo.eventlisting.model.EventModel;
import com.cofares.ejemplo.eventlisting.model.EventSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Event service. Represents a row in the &quot;Event_Event&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.cofares.ejemplo.eventlisting.model.EventModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EventImpl}.
 * </p>
 *
 * @author eed
 * @see EventImpl
 * @see com.cofares.ejemplo.eventlisting.model.Event
 * @see com.cofares.ejemplo.eventlisting.model.EventModel
 * @generated
 */
@JSON(strict = true)
public class EventModelImpl extends BaseModelImpl<Event> implements EventModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a event model instance should use the {@link com.cofares.ejemplo.eventlisting.model.Event} interface instead.
     */
    public static final String TABLE_NAME = "Event_Event";
    public static final Object[][] TABLE_COLUMNS = {
            { "eventId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "name", Types.VARCHAR },
            { "description", Types.VARCHAR },
            { "date_", Types.TIMESTAMP },
            { "locationId", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table Event_Event (eventId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,description VARCHAR(75) null,date_ DATE null,locationId LONG)";
    public static final String TABLE_SQL_DROP = "drop table Event_Event";
    public static final String ORDER_BY_JPQL = " ORDER BY event.date ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Event_Event.date_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.cofares.ejemplo.eventlisting.model.Event"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.cofares.ejemplo.eventlisting.model.Event"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.cofares.ejemplo.eventlisting.model.Event"),
            true);
    public static long GROUPID_COLUMN_BITMASK = 1L;
    public static long DATE_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.cofares.ejemplo.eventlisting.model.Event"));
    private static ClassLoader _classLoader = Event.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { Event.class };
    private long _eventId;
    private long _companyId;
    private long _groupId;
    private long _originalGroupId;
    private boolean _setOriginalGroupId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private String _description;
    private Date _date;
    private long _locationId;
    private long _columnBitmask;
    private Event _escapedModel;

    public EventModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Event toModel(EventSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Event model = new EventImpl();

        model.setEventId(soapModel.getEventId());
        model.setCompanyId(soapModel.getCompanyId());
        model.setGroupId(soapModel.getGroupId());
        model.setUserId(soapModel.getUserId());
        model.setCreateDate(soapModel.getCreateDate());
        model.setModifiedDate(soapModel.getModifiedDate());
        model.setName(soapModel.getName());
        model.setDescription(soapModel.getDescription());
        model.setDate(soapModel.getDate());
        model.setLocationId(soapModel.getLocationId());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Event> toModels(EventSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Event> models = new ArrayList<Event>(soapModels.length);

        for (EventSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _eventId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setEventId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _eventId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Event.class;
    }

    @Override
    public String getModelClassName() {
        return Event.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("eventId", getEventId());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("name", getName());
        attributes.put("description", getDescription());
        attributes.put("date", getDate());
        attributes.put("locationId", getLocationId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long eventId = (Long) attributes.get("eventId");

        if (eventId != null) {
            setEventId(eventId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        Date date = (Date) attributes.get("date");

        if (date != null) {
            setDate(date);
        }

        Long locationId = (Long) attributes.get("locationId");

        if (locationId != null) {
            setLocationId(locationId);
        }
    }

    @JSON
    @Override
    public long getEventId() {
        return _eventId;
    }

    @Override
    public void setEventId(long eventId) {
        _eventId = eventId;
    }

    @JSON
    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    @JSON
    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _columnBitmask |= GROUPID_COLUMN_BITMASK;

        if (!_setOriginalGroupId) {
            _setOriginalGroupId = true;

            _originalGroupId = _groupId;
        }

        _groupId = groupId;
    }

    public long getOriginalGroupId() {
        return _originalGroupId;
    }

    @JSON
    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @JSON
    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    @JSON
    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    @JSON
    @Override
    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    @JSON
    @Override
    public String getDescription() {
        if (_description == null) {
            return StringPool.BLANK;
        } else {
            return _description;
        }
    }

    @Override
    public void setDescription(String description) {
        _description = description;
    }

    @JSON
    @Override
    public Date getDate() {
        return _date;
    }

    @Override
    public void setDate(Date date) {
        _columnBitmask = -1L;

        _date = date;
    }

    @JSON
    @Override
    public long getLocationId() {
        return _locationId;
    }

    @Override
    public void setLocationId(long locationId) {
        _locationId = locationId;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            Event.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Event toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Event) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        EventImpl eventImpl = new EventImpl();

        eventImpl.setEventId(getEventId());
        eventImpl.setCompanyId(getCompanyId());
        eventImpl.setGroupId(getGroupId());
        eventImpl.setUserId(getUserId());
        eventImpl.setCreateDate(getCreateDate());
        eventImpl.setModifiedDate(getModifiedDate());
        eventImpl.setName(getName());
        eventImpl.setDescription(getDescription());
        eventImpl.setDate(getDate());
        eventImpl.setLocationId(getLocationId());

        eventImpl.resetOriginalValues();

        return eventImpl;
    }

    @Override
    public int compareTo(Event event) {
        int value = 0;

        value = DateUtil.compareTo(getDate(), event.getDate());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Event)) {
            return false;
        }

        Event event = (Event) obj;

        long primaryKey = event.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        EventModelImpl eventModelImpl = this;

        eventModelImpl._originalGroupId = eventModelImpl._groupId;

        eventModelImpl._setOriginalGroupId = false;

        eventModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Event> toCacheModel() {
        EventCacheModel eventCacheModel = new EventCacheModel();

        eventCacheModel.eventId = getEventId();

        eventCacheModel.companyId = getCompanyId();

        eventCacheModel.groupId = getGroupId();

        eventCacheModel.userId = getUserId();

        Date createDate = getCreateDate();

        if (createDate != null) {
            eventCacheModel.createDate = createDate.getTime();
        } else {
            eventCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            eventCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            eventCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        eventCacheModel.name = getName();

        String name = eventCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            eventCacheModel.name = null;
        }

        eventCacheModel.description = getDescription();

        String description = eventCacheModel.description;

        if ((description != null) && (description.length() == 0)) {
            eventCacheModel.description = null;
        }

        Date date = getDate();

        if (date != null) {
            eventCacheModel.date = date.getTime();
        } else {
            eventCacheModel.date = Long.MIN_VALUE;
        }

        eventCacheModel.locationId = getLocationId();

        return eventCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{eventId=");
        sb.append(getEventId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", date=");
        sb.append(getDate());
        sb.append(", locationId=");
        sb.append(getLocationId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("com.cofares.ejemplo.eventlisting.model.Event");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>eventId</column-name><column-value><![CDATA[");
        sb.append(getEventId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>date</column-name><column-value><![CDATA[");
        sb.append(getDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>locationId</column-name><column-value><![CDATA[");
        sb.append(getLocationId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
