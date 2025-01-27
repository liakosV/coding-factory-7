package gr.aueb.cf.ch18.dao;

import gr.aueb.cf.ch18.mobilecontacts.MobileContact;

import java.util.List;

public interface IMobileContactDAO {
    MobileContact insert(MobileContact mobileContact);
    MobileContact update(Long id, MobileContact mobileContact);
    void delete(Long id);
    MobileContact getById(Long id);
    List<MobileContact> getAll();

    void deleteByPhoneNumber(String phoneNumber);
    MobileContact getByPhoneNumber(String phoneNumber);
    boolean userIdExists(Long id);
    boolean phoneNumberExists(String phoneNumber);
}
