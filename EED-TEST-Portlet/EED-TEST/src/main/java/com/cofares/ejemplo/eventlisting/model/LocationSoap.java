package com.cofares.ejemplo.eventlisting.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.cofares.ejemplo.eventlisting.service.http.LocationServiceSoap}.
 *
 * @author eed
 * @see com.cofares.ejemplo.eventlisting.service.http.LocationServiceSoap
 * @generated
 */
public class LocationSoap implements Serializable {
    private long _locationId;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private String _description;
    private String _streetAddress;
    private String _city;
    private String _stateOrProvince;
    private String _country;

    public LocationSoap() {
    }

    public static LocationSoap toSoapModel(Location model) {
        LocationSoap soapModel = new LocationSoap();

        soapModel.setLocationId(model.getLocationId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setName(model.getName());
        soapModel.setDescription(model.getDescription());
        soapModel.setStreetAddress(model.getStreetAddress());
        soapModel.setCity(model.getCity());
        soapModel.setStateOrProvince(model.getStateOrProvince());
        soapModel.setCountry(model.getCountry());

        return soapModel;
    }

    public static LocationSoap[] toSoapModels(Location[] models) {
        LocationSoap[] soapModels = new LocationSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static LocationSoap[][] toSoapModels(Location[][] models) {
        LocationSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new LocationSoap[models.length][models[0].length];
        } else {
            soapModels = new LocationSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static LocationSoap[] toSoapModels(List<Location> models) {
        List<LocationSoap> soapModels = new ArrayList<LocationSoap>(models.size());

        for (Location model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new LocationSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _locationId;
    }

    public void setPrimaryKey(long pk) {
        setLocationId(pk);
    }

    public long getLocationId() {
        return _locationId;
    }

    public void setLocationId(long locationId) {
        _locationId = locationId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public String getStreetAddress() {
        return _streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        _streetAddress = streetAddress;
    }

    public String getCity() {
        return _city;
    }

    public void setCity(String city) {
        _city = city;
    }

    public String getStateOrProvince() {
        return _stateOrProvince;
    }

    public void setStateOrProvince(String stateOrProvince) {
        _stateOrProvince = stateOrProvince;
    }

    public String getCountry() {
        return _country;
    }

    public void setCountry(String country) {
        _country = country;
    }
}
